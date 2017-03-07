var exec = require('cordova/exec');
var PLUGIN_NAME = 'CordovaCroutonsPlugin';

exports.showAlert = function(arg0, success, error) {
    exec(success, error, PLUGIN_NAME, 'showAlert', [arg0]);
};

exports.showConfirm = function(arg0, success, error) {
    exec(success, error, PLUGIN_NAME, 'showConfirm', [arg0]);
};

exports.showInfo = function(arg0, success, error) {
    exec(success, error, PLUGIN_NAME, 'showInfo', [arg0]);
};

exports.cancelAll = function( success, error) {
    exec(success, error, PLUGIN_NAME, 'cancelAll', []);
};