package xyz.puffercat.betteraperture

/* TODO: Remove comment marks to enable
import android.content.Context
import androidx.core.app.NotificationCompat
import com.onesignal.OSNotificationReceivedEvent
import com.onesignal.OneSignal.OSRemoteNotificationReceivedHandler
import dev.jahir.frames.extensions.context.color
import dev.jahir.frames.extensions.context.drawable
import dev.jahir.frames.extensions.context.preferences

class NotificationServiceExtension : OSRemoteNotificationReceivedHandler {
    override fun remoteNotificationReceived(
        context: Context,
        notificationReceivedEvent: OSNotificationReceivedEvent
    ) {
        if(!context.preferences.notificationsEnabled) {
            notificationReceivedEvent.complete(null)
            return
        }
        val notification = notificationReceivedEvent.notification
        val mutableNotification = notification.mutableCopy()
        mutableNotification.setExtender { builder: NotificationCompat.Builder ->
            builder.color = context.color(R.color.accent)
            builder.setSmallIcon(R.drawable.ic_notification)
        }
        notificationReceivedEvent.complete(mutableNotification)
    }
}
*/
