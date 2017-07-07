package com.simon.ext;

import android.content.Context;
import android.preference.Preference;
import android.preference.PreferenceScreen;

import java.util.ArrayList;

/**
 * Created by simon on 6/15/17.
 */

public class LauncherSettingsExtension {

    private static final String TAG = "LauncherSettingsExtension";

    private static final boolean DEBUG = false;

    private final ArrayList<Preference> mPreferences = new ArrayList<Preference>();

    public LauncherSettingsExtension(Context context) {
        initPreferences(context);
    }

    private void initPreferences(Context context) {
        // init preferences for all features and add them to the specific arrayList.

        if (DEBUG) LogUtils.d(TAG, "initPreferences: mPreferences " + mPreferences);
    }

    private void add(Preference pref) {
        if (DEBUG) LogUtils.d(TAG, "*** add preference for " + pref);

        if (pref != null) {
            String key = pref.getKey();
            if (key == null) {
                throw new RuntimeException();
            }

            for (Preference preference : mPreferences) {
                if (key.equals(preference.getKey())) {
                    mPreferences.remove(preference);
                }
            }
            if (pref.getOrder() != Preference.DEFAULT_ORDER) {
                pref.setOrder(Preference.DEFAULT_ORDER);
            }
            mPreferences.add(pref);
        }
    }

    public void addPreferences(PreferenceScreen preferenceScreen) {
        for (Preference pref : mPreferences) {
            if (pref != null) {
                preferenceScreen.addPreference(pref);
            }
        }
    }

    public void removePreferences(PreferenceScreen preferenceScreen) {
        for (Preference pref : mPreferences) {
            if (pref != null) {
                preferenceScreen.removePreference(pref);
            }
        }
        mPreferences.clear();
    }
}
