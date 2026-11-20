package infosecadventures.allsafe.utils

import android.content.Context
import android.provider.Settings

object SecurityUtils {
    fun isDeveloperOptionsEnabled(context: Context): Boolean {
        val devOptions = Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        )
        val adbEnabled = Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED, 0
        )
        return devOptions == 1 || adbEnabled == 1
    }
}
