package admob.learn.com.poptwoapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.util.List;
import admob.learn.com.databaselibrary.DatabaseModule;
import model.ContactModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseModule mDatabaseModule = new DatabaseModule();
        mDatabaseModule.createDatabase(this);
        List<ContactModel> contactModels = mDatabaseModule.readRecords();

        for (ContactModel cn : contactModels) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing ContactModels to log
            Log.d("Name: ", log);
        }

    }
}
