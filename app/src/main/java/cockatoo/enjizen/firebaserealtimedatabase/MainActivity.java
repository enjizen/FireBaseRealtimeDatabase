package cockatoo.enjizen.firebaserealtimedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference mUserRef = mRootRef.child("users");
        DatabaseReference mMessageRef = mRootRef.child("messages");

/*
        mUserRef.child("id-12345").setValue("Wanchalerm");

        FriendlyMessage friendlyMessage = new FriendlyMessage("Hello World", "Wanchalerm");
        mMessageRef.push().setValue(friendlyMessage);*/

    String key = mMessageRef.push().getKey();
        HashMap<String, Object> postValues = new HashMap<>();
       postValues.put("username","wanchalerm");
       postValues.put("text","ภาษาไทย");

        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/messages/"+ key, postValues);
        childUpdates.put("/user-messages/wanchalerm/"+ key,postValues);

        mRootRef.updateChildren(childUpdates);


    }
}
