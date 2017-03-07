/**
 */
package com.cordova.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;


public class CordovaCroutonsPlugin extends CordovaPlugin {
    private static final String TAG = "CordovaCroutonsPlugin";
    private CordovaInterface cordova;

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        this.cordova = cordova;
        Log.d(TAG, "Initializing" + TAG);
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {

        if (action.equals("showAlert")) {
            String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    Crouton.makeText(this.cordova.getActivity(), message, Style.ALERT).show();
                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);

        } else if (action.equals("showConfirm")) {
            String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    Crouton.makeText(this.cordova.getActivity(), message, Style.CONFIRM).show();
                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);
        } else if (action.equals("showInfo")) {
            String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    Crouton.makeText(this.cordova.getActivity(), message, Style.INFO).show();
                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);
        } else if (action.equals("cancelAll")) {
            Crouton.cancelAllCroutons();
            final PluginResult result = new PluginResult(PluginResult.Status.OK);
            callbackContext.sendPluginResult(result);
        }
        return true;
    }

}
