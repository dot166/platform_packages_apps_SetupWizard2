package app.grapheneos.setupwizard

import android.content.Context
import io.github.dot166.jlib.app.RestorableSettingsApplication

class App : RestorableSettingsApplication() {

    override fun onCreate() {
        super.onCreate()
        setSpaEnvironment(NexusSpaEnvironment(this))
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        appContext = base
    }
}
