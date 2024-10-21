package app.grapheneos.setupwizard

import jOS.Core.jLIBCoreApp
import android.content.Context

class App : jLIBCoreApp() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        appContext = base
    }
}
