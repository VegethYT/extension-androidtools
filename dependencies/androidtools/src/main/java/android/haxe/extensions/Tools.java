package android.haxe.extensions;

import android.net.Uri;
import java.io.File;

public class Tools extends Extension
{
	public static String fromFile(String path)
	{
		return Uri.fromFile(new File(path)).toString();
	}
}