package com.simon.ext;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;

import com.android.launcher3.Launcher;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;

import java.util.List;

/**
 * Created by simon on 2017/7/6.
 */

public class LauncherAppMonitorCallback {
    //Launcher activity Callbacks
    public void onLauncherPreCreate(Launcher launcher) { }

    public void onLauncherCreated() { }

    public void onLauncherPreResume() { }

    public void onLauncherResumed() { }

    public void onLauncherStart() { }

    public void onLauncherStop() { }

    public void onLauncherPrePaused() { }

    public void onLauncherPaused() { }

    public void onLauncherDestroy() { }

    public void onLauncherRequestPermissionsResult(int requestCode, String[] permissions,
                                                   int[] grantResults) { }

    public void onLauncherFocusChanged(boolean hasFocus) { }


    public void onHomeIntent() { }

    //Launcher app Callbacks
    public void onAppCreated(Context context) { }

    public void onReceive(Intent intent) { }

    public void onConfigChanged() { }

    public void onAppSharedPreferenceChanged(String key) { }

    public void onPackageRemoved(String packageName, UserHandle user) { }

    public void onPackageAdded(String packageName, UserHandle user) { }

    public void onPackageChanged(String packageName, UserHandle user) { }

    public void onPackagesAvailable(String[] packageNames, UserHandle user, boolean replacing) { }

    public void onPackagesUnavailable(String[] packageNames, UserHandle user, boolean replacing) { }

    public void onPackagesSuspended(String[] packageNames, UserHandle user) { }

    public void onPackagesUnsuspended(String[] packageNames, UserHandle user) { }

    public void onShortcutsChanged(String packageName, List<ShortcutInfoCompat> shortcuts, UserHandle user) { }
}
