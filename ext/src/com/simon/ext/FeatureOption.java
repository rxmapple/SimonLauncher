package com.simon.ext;

/**
 * Created by simon on 2016/9/27.
 */
public class FeatureOption {
    public static final String TAG = "FeatureOption";

    private static boolean getProp(String prop, boolean devalues) {
        boolean ret = false;

        try {
            ret = SystemPropertiesUtils.getBoolean(prop, devalues);
        } catch (Exception e) {
            LogUtils.e(TAG, "getProp:" + prop + " error." + e);
        }

        return ret;
    }
}
