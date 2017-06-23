package com.simon.ext;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.android.launcher3.AppInfo;
import com.android.launcher3.LauncherCallbacks;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.AllAppsSearchBarController;
import com.android.launcher3.util.ComponentKey;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon on 2017/6/21.
 */

public class LauncherExtCallbacks implements LauncherCallbacks {
    private static final String TAG = "LauncherExtCallbacks";

    private Context mContext;
    private SharedPreferences mSharedPrefs;
    private SettingPrefChangeHandler mSettingPrefChangeHandler;

    public LauncherExtCallbacks(Context context){
        mContext = context;
        mSharedPrefs = Utilities.getPrefs(mContext);
    }

    @Override
    public void preOnCreate() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mSettingPrefChangeHandler = new SettingPrefChangeHandler();
        mSharedPrefs.registerOnSharedPreferenceChangeListener(mSettingPrefChangeHandler);
    }

    @Override
    public void preOnResume() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {
        if (mSettingPrefChangeHandler != null) {
            mSharedPrefs.unregisterOnSharedPreferenceChangeListener(mSettingPrefChangeHandler);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {

    }

    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

    }

    @Override
    public void onAttachedToWindow() {

    }

    @Override
    public void onDetachedFromWindow() {

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter w, String[] args) {

    }

    @Override
    public void onHomeIntent() {

    }

    @Override
    public boolean handleBackPressed() {
        return false;
    }

    @Override
    public void onTrimMemory(int level) {

    }

    @Override
    public void onLauncherProviderChange() {

    }

    @Override
    public void finishBindingItems(boolean upgradePath) {

    }

    @Override
    public void bindAllApplications(ArrayList<AppInfo> apps) {

    }

    @Override
    public void onInteractionBegin() {

    }

    @Override
    public void onInteractionEnd() {

    }

    @Override
    public void onWorkspaceLockedChanged() {

    }

    @Override
    public boolean startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData) {
        return false;
    }

    @Override
    public boolean hasCustomContentToLeft() {
        return false;
    }

    @Override
    public void populateCustomContentContainer() {

    }

    @Override
    public View getQsbBar() {
        return null;
    }

    @Override
    public Bundle getAdditionalSearchWidgetOptions() {
        return null;
    }

    @Override
    public boolean shouldMoveToDefaultScreenOnHomeIntent() {
        return false;
    }

    @Override
    public boolean hasSettings() {
        return true;
    }

    @Override
    public AllAppsSearchBarController getAllAppsSearchBarController() {
        return null;
    }

    @Override
    public List<ComponentKey> getPredictedApps() {
        return null;
    }

    @Override
    public int getSearchBarHeight() {
        return 0;
    }

    @Override
    public void setLauncherSearchCallback(Object callbacks) {

    }

    @Override
    public boolean shouldShowDiscoveryBounce() {
        return false;
    }


    private class SettingPrefChangeHandler implements SharedPreferences.OnSharedPreferenceChangeListener {

        @Override
        public void onSharedPreferenceChanged(
                SharedPreferences sharedPreferences, String key) {
            // do what you want to do according to the key.
        }
    }
}
