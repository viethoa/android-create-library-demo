package viethoa.com.demolibrary;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by VietHoa on 06/04/16.
 */
public class ToastUtils {

    public static void showMessage(Context context, String message) {
        if (context == null || TextUtils.isEmpty(message))
            return;

        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
