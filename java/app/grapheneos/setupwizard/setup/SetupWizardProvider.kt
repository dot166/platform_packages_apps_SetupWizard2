package app.grapheneos.setupwizard.setup

import android.os.Bundle
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.More
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import app.grapheneos.setupwizard.action.SetupWizard
import com.android.settingslib.spa.framework.common.SettingsPageProvider
import com.android.settingslib.spa.framework.compose.navigator
import com.android.settingslib.spa.framework.theme.SettingsDimension
import com.android.settingslib.spa.widget.scaffold.BottomAppBarButton
import com.android.settingslib.spa.widget.scaffold.GlifScaffold
import com.android.settingslib.spa.widget.ui.SettingsBody
import app.grapheneos.setupwizard.R

object SetupWizardProvider : SettingsPageProvider {
    override val name = "SetupWizardPage0"

    @Composable
    override fun Page(arguments: Bundle?) {
        val next = navigator("SetupWizardPage1")
        val activity = LocalActivity.current
        GlifScaffold(
            imageVector = Icons.AutoMirrored.Outlined.More,
            title = stringResource(R.string.extra_steps),
            actionButton = BottomAppBarButton(stringResource(R.string.next)) { next() },
            dismissButton = BottomAppBarButton(stringResource(R.string.skip)) { SetupWizard.next(activity!!) },
        ) {
            Column(Modifier.padding(SettingsDimension.itemPadding)) {
                SettingsBody("The following section is for extra configuration that is not necessary.")
            }
        }
    }
}
