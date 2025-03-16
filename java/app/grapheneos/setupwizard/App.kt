package app.grapheneos.setupwizard

import io.github.dot166.jlib.app.jLIBCoreApp
import android.content.Context

class App : jLIBCoreApp() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        appContext = base
    }
}
