package com.simon.ext;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.LauncherApps;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.UserHandle;

/**
 * Created by simon on 11/14/16.
 */

public class UtilitiesExt {
    private static final String TAG = "UtilitiesExt";

    public static boolean isAppInstalled(Context context, ComponentName component, UserHandle user) {
        LauncherApps launcherApps = (LauncherApps) context.getSystemService(Context.LAUNCHER_APPS_SERVICE);
        return launcherApps.isActivityEnabled(component, user);
    }

    public static Point getTextDrawPoint(Rect targetRect, Paint.FontMetrics fm) {
        Point p = new Point();
        int fontHeight = Math.round(fm.descent - fm.ascent);
        int paddingY = (targetRect.height() - fontHeight) >> 1;
        p.x = targetRect.centerX();
        p.y = targetRect.top + paddingY + Math.abs(Math.round(fm.ascent));
        return p;
    }
}
