package com.fll.codeorange.codeorange;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class CountyDetails extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_county_details);

        County county = (County) getIntent().getSerializableExtra("county");

        if (county == null) return;
        ((TextView) findViewById(R.id.isSingleStreamValue)).setText(county.getIsSingleStream());
        ((TextView) findViewById(R.id.canRecycleBrownGlassValue)).setText(county.getCanRecycleBrownGlass());
		((TextView) findViewById(R.id.countyDetails_CountyName)).setText(county.getName());
		((TextView) findViewById(R.id.plantName)).setText(county.getFacility());
		((TextView) findViewById(R.id.isSingleStreamValue)).setText(county.getIsSingleStream());
		((TextView) findViewById(R.id.canRecycleBrownGlassValue)).setText(county.getCanRecycleBrownGlass());
		((TextView) findViewById(R.id.canRecycleGreenGlassValue)).setText(county.getCanRecycleGreenGlass());
		((TextView) findViewById(R.id.canRecycleClearGlassValue)).setText(county.getCanRecycleClearGlass());
		((TextView) findViewById(R.id.canRecyclePaperValue)).setText(county.getCanRecyclePaper());
		((TextView) findViewById(R.id.canRecycleCardboardValue)).setText(county.getCanRecycleCardboard());
		((TextView) findViewById(R.id.canRecycleCansValue)).setText(county.getCanRecycleCans());
		((TextView) findViewById(R.id.plasticTypesValue)).setText(county.getPlasticRecyclingTypes());

        TextView helpfulLinksValue = ((TextView) findViewById(R.id.helpfulLinksValue));
        helpfulLinksValue.setText("");
        if (county.getWebsiteLink() == null) return;
        String[] websiteLinks = county.getWebsiteLink().split(",");
        for (String websiteLink : websiteLinks)
        {
            helpfulLinksValue.append(Html.fromHtml(String.format("<a href=\"%1$s\">%1$s</a><br/><br/>", websiteLink)));
            helpfulLinksValue.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_county_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
