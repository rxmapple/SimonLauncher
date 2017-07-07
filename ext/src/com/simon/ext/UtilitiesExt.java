package com.simon.ext;

import android.text.TextUtils;

/**
 * Created by simon on 11/14/16.
 */

public class UtilitiesExt {
    private static final String TAG = "UtilitiesExt";
    public static final int BASE_STACK_DEPTH = 3;

    public static void DEBUG_PRINT_FUNCTIONNAME(int depth, String msg) {
        if (LogUtils.DEBUG_ALL) {
            final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
            LogUtils.d(ste[1+depth].getClassName(), ste[1+depth].getMethodName()
                    + (TextUtils.isEmpty(msg) ? "" : ", " + msg));
        }
    }

    public static void DEBUG_PRINT_FUNCTIONNAME(String msg) {
        DEBUG_PRINT_FUNCTIONNAME(BASE_STACK_DEPTH,msg);
    }
}
