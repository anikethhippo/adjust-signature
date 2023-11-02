package com.adjust.sdk.sig;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import android.net.Uri;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult.Status;

public class AdjustSigCordova extends CordovaPlugin {
    @Override
    public boolean execute(String action, final JSONArray args, CallbackContext callbackContext) throws JSONException {
        return true;
    }
}
