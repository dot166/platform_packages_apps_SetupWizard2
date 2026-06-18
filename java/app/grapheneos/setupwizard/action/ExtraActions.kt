package app.grapheneos.setupwizard.action

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import app.grapheneos.setupwizard.view.activity.SetupWizardActivity

object ExtraActions {
    private const val TAG = "ExtraActions"

    init {
    }

    fun launchSetup(context: SetupWizardActivity) {
        val intent = Intent().setComponent(ComponentName("io.github.dot166.nexus", "io.github.dot166.jlib.app.PreferenceMainActivity"))
        SetupWizard.startActivityForResult(context, intent)
    }

    fun handleResult(context: Activity, resultCode: Int) {
        if (resultCode == Activity.RESULT_CANCELED) throw IllegalArgumentException()
        SetupWizard.next(context)
    }
}
