import UIKit
import SwiftMessages

@objc(CordovaCroutonsPlugin) class CordovaCroutonsPlugin : CDVPlugin {
    @objc(showAlert:)
    func showAlert(command: CDVInvokedUrlCommand) {
        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count != 0{
            // Instantiate a message view from the provided card view layout. SwiftMessages searches for nib
            // files in the main bundle first, so you can easily copy them into your project and make changes.
            let view = MessageView.viewFromNib(layout: .StatusLine)

            // Theme message elements with the warning style.
            view.configureTheme(.error)

            // Add a drop shadow.
            view.configureDropShadow()

            view.configureContent(body: msg)

            // Show the message.
            SwiftMessages.show(view: view)
            let pluginResult = CDVPluginResult(
                status: CDVCommandStatus_OK
            )
            self.commandDelegate!.send(
                pluginResult,
                callbackId: command.callbackId
            )
            return
        }

        let pluginResult = CDVPluginResult(status: CDVCommandStatus_ERROR, messageAs: "Invalid Message")
        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }

    @objc(showConfirm:)
    func showConfirm(command: CDVInvokedUrlCommand) {
        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count != 0{
            // Instantiate a message view from the provided card view layout. SwiftMessages searches for nib
            // files in the main bundle first, so you can easily copy them into your project and make changes.
            let view = MessageView.viewFromNib(layout: .StatusLine)

            // Theme message elements with the warning style.
            view.configureTheme(.success)

            // Add a drop shadow.
            view.configureDropShadow()

            view.configureContent(body: msg)

            // Show the message.
            SwiftMessages.show(view: view)
            let pluginResult = CDVPluginResult(
                status: CDVCommandStatus_OK
            )
            self.commandDelegate!.send(
                pluginResult,
                callbackId: command.callbackId
            )
            return
        }

        let pluginResult = CDVPluginResult(status: CDVCommandStatus_ERROR, messageAs: "Invalid Message")
        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }

    @objc(showInfo:)
    func showInfo(command: CDVInvokedUrlCommand) {

        let msg = command.arguments[0] as? String ?? ""

        if msg.characters.count != 0{
            // Instantiate a message view from the provided card view layout. SwiftMessages searches for nib
            // files in the main bundle first, so you can easily copy them into your project and make changes.
            let view = MessageView.viewFromNib(layout: .StatusLine)

            // Theme message elements with the warning style.
            view.configureTheme(.info)

            // Add a drop shadow.
            view.configureDropShadow()

            view.configureContent(body: msg)

            // Show the message.
            SwiftMessages.show(view: view)
            let pluginResult = CDVPluginResult(
                status: CDVCommandStatus_OK
            )
            self.commandDelegate!.send(
                pluginResult,
                callbackId: command.callbackId
            )
            return
        }

        let pluginResult = CDVPluginResult(status: CDVCommandStatus_ERROR, messageAs: "Invalid Message")
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

        // Or hide the current message and clear the queue.
        SwiftMessages.hideAll()

        self.commandDelegate!.send(
            pluginResult,
            callbackId: command.callbackId
        )
    }
}