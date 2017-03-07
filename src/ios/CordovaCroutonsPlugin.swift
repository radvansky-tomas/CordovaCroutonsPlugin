import UIKit

@objc(CordovaCroutonsPlugin) class CordovaCroutonsPlugin : CDVPlugin {
    @objc(showAlert:)
    func showAlert(command: CDVInvokedUrlCommand) {
        let pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK
        )
        //Disable interaction
        SVProgressHUD.setDefaultMaskType(.black)

        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count == 0{
            SVProgressHUD.show()

        }
        else
        {
            SVProgressHUD.show(withStatus: msg)
        }

        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }

    @objc(showConfirm:)
    func showConfirm(command: CDVInvokedUrlCommand) {
        let pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK
        )
        //Disable interaction
        SVProgressHUD.setDefaultMaskType(.black)

        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count == 0{
            SVProgressHUD.show()

        }
        else
        {
            SVProgressHUD.show(withStatus: msg)
        }

        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }

    @objc(showInfo:)
    func showInfo(command: CDVInvokedUrlCommand) {
        let pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK
        )
        //Disable interaction
        SVProgressHUD.setDefaultMaskType(.black)

        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count == 0{
            SVProgressHUD.show()

        }
        else
        {
            SVProgressHUD.show(withStatus: msg)
        }

        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }

    @objc(cancelAll:)
    func cancelAll(command: CDVInvokedUrlCommand) {
        let pluginResult = CDVPluginResult(
            status: CDVCommandStatus_OK
        )

        SVProgressHUD.dismiss()

        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }
}