package app.grapheneos.setupwizard.view.activity

import android.content.Intent
import app.grapheneos.setupwizard.action.ExtraActions

class ExtraActivity : ProxyActivity() {
    companion object {
        private const val TAG = "ExtraActivity"
    }

    override fun launchActual() {
        ExtraActions.launchSetup(this)
    }

    override fun handleResult(resultCode: Int, data: Intent?) {
        setMovingForward()
        ExtraActions.handleResult(this, resultCode)
    }
}
