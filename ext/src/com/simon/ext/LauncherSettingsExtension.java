package com.simon.ext;

import android.content.Context;
import android.preference.Preference;
import android.preference.PreferenceScreen;

import java.util.ArrayList;

/**
 * Created by simon on 6/15/17.
 */

public class LauncherSettingsExtension {

    private static final String TAG = "SettingsExtensionPreference";

    private static final boolean DEBUG = LogUtils.DEBUG;

    private static LauncherSettingsExtension INSTANCE;

    private final ArrayList<Preference>
            mPreferences = new ArrayList<Preference>();

    private LauncherSettingsExtension() {}

    public static LauncherSettingsExtension getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LauncherSettingsExtension();
        }
        return INSTANCE;
    }

    private void remove(Preference pref) {
        if (DEBUG) {
            LogUtils.d(TAG, "*** remove preference for " + pref);
        }
        while (mPreferences.contains(pref)) {
            mPreferences.remove(pref);
        }
    }

    private void add(Preference pref) {
        if (DEBUG) {
            LogUtils.d(TAG, "*** add preference for " + pref);
        }
        if (pref != null && !mPreferences.contains(pref)) {
            mPreferences.add(pref);
        }
    }

    private void initPreferences(Context context) {
        // init preferences for all features and add them to the specific arrayList.

        if (DEBUG) {
            LogUtils.d(TAG, "initPreferences: mPreferences " + mPreferences);
        }
    }

    public void initAndAddPreferences(Context context, PreferenceScreen preferenceScreen) {
        initPreferences(context);

        for (int i = 0; i < mPreferences.size(); i++) {
            Preference pref = mPreferences.get(i);
            if (pref != null) {
                preferenceScreen.addPreference(pref);
            }
        }
    }

    public void removePreferences(PreferenceScreen preferenceScreen) {
        for (int i = 0; i < mPreferences.size(); i++) {
            Preference pref = mPreferences.get(i);
            if (pref != null) {
                preferenceScreen.removePreference(pref);
                remove(pref);
            }
        }
    }
}
