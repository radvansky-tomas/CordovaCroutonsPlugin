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

import android.app.Activity;
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
            final String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    final Activity cordovaActvity = this.cordova.getActivity();
                    cordovaActvity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Crouton.makeText(cordovaActvity, message, Style.ALERT).show();
                        }
                    });

                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);

        } else if (action.equals("showConfirm")) {
            final String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    final Activity cordovaActvity = this.cordova.getActivity();
                    cordovaActvity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Crouton.makeText(cordovaActvity, message, Style.CONFIRM).show();
                        }
                    });

                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);
        } else if (action.equals("showInfo")) {
            final String message = args.getString(0);

            if (message != null) {
                if (!message.isEmpty()) {
                    final Activity cordovaActvity = this.cordova.getActivity();
                    cordovaActvity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Crouton.makeText(cordovaActvity, message, Style.INFO).show();
                        }
                    });

                    final PluginResult result = new PluginResult(PluginResult.Status.OK);
                    callbackContext.sendPluginResult(result);
                    return true;
                }
            }

            final PluginResult result = new PluginResult(PluginResult.Status.ERROR, "Invalid Message");
            callbackContext.sendPluginResult(result);
        } else if (action.equals("cancelAll")) {
            final Activity cordovaActvity = this.cordova.getActivity();
            cordovaActvity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Crouton.cancelAllCroutons();
                }
            });
            final PluginResult result = new PluginResult(PluginResult.Status.OK);
            callbackContext.sendPluginResult(result);
        }
        return true;
    }

}
