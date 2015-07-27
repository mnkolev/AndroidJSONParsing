package info.androidhive.jsonparsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import info.androidhive.jsonparsing.R;

public class SingleContactActivity  extends Activity {
	
	// JSON node keys
	private static final String TAG_NAME = "name";
	private static final String TAG_TITLE = "title";
	private static final String TAG_COMPANY = "company";
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_contact);
        
        // getting intent data
        Intent in = getIntent();
        
        // Get JSON values from previous intent
        String name = in.getStringExtra(TAG_NAME);
        String title = in.getStringExtra(TAG_TITLE);
        String company = in.getStringExtra(TAG_COMPANY);
        
        // Displaying all values on the screen
        TextView lblName = (TextView) findViewById(R.id.name_label);
        TextView lblTitle = (TextView) findViewById(R.id.title_label);
        TextView lblCompany = (TextView) findViewById(R.id.company_label);
        
        lblName.setText(name);
        lblTitle.setText(title);
        lblCompany.setText(company);
    }
}
