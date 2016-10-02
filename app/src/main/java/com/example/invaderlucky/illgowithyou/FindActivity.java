package lucky.igwy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.LocationCallback;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by Lucky on 7/23/2016.
 */
public class FindActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // Set up database connection.
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        GeoFire geoFire = new GeoFire(ref);

        geoFire.getLocation("firebase-hq", new LocationCallback() {
            public void onLocationResult(String key, GeoLocation location) {
                if (location != null) {
                    // Get user location and fill in?
                } else {
                    System.out.println(String.format("There is no location for key %s in GeoFire", key));
                }
            }

            public void onCancelled(DatabaseError databaseError) {
                System.err.println("There was an error getting the GeoFire location: " + databaseError);
            }
        });
    }
}
