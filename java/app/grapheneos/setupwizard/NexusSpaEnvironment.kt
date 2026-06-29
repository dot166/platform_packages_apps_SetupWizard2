package app.grapheneos.setupwizard

import android.content.Context
import app.grapheneos.setupwizard.setup.Page1
import app.grapheneos.setupwizard.setup.SetupWizardProvider
import com.android.settingslib.spa.framework.common.SettingsPageProviderRepository
import com.android.settingslib.spa.framework.common.createSettingsPage
import io.github.dot166.jlib.app.DefaultHomePageProvider
import io.github.dot166.jlib.app.JLibSpaEnvironment

class NexusSpaEnvironment(context: Context) : JLibSpaEnvironment(context) {
    override val pageProviderRepository = lazy {
        SettingsPageProviderRepository(
            allPageProviders =
                listOf(
                    SetupWizardProvider,
                    Page1,
                ),
            rootPages = listOf(SetupWizardProvider.createSettingsPage()),
        )
    }
}