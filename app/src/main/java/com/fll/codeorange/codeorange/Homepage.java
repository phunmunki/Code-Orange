package com.fll.codeorange.codeorange;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class Homepage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //Code Orange

        ArrayList<County> counties = new ArrayList<County>();

        counties.add(new County("Adams","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Ashland","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Barron","Collection","No","Yes","Yes","Yes","No","No","Yes","1, 2, 3, 4, 5, 6, 7","http://www.barroncountywi.gov/vertical/sites/%7B55B35465-9825-4C7F-A839-E0EDFC6408E8%7D/uploads/Barron_County_Recycling_Brochure_Both_Sides.pdf"));
        counties.add(new County("Bayfield","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Brown","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Buffalo","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Burnett","Burrnet","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.burnettcounty.com/DocumentCenter/Home/View/101, http://www.nwrpc.com/DocWausauumentCenter/View/13, http://www.nwrpc.com/DocumentCenter/Home/View/12"));
        counties.add(new County("Calumet","Manitwoc","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.calumet.wi.us/index.aspx?NID=438"));
        counties.add(new County("Chippwa","Drop Off Centers","Yes","Yes ","Yes ","Yes ","Yes ","Yes ","Yes ","1,2,3,4,5,7","http://www.co.chippewa.wi.us/government/land-conservation-forest-management/recycling/recycling-programs-services"));
        counties.add(new County("Clark","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Columbia","Columbia County Recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.columbia.wi.us/columbiacounty/solidwaste/RecyclingSolidWasteHome/tabid/489/Default.aspx, http://www.co.columbia.wi.us/columbiacounty/solidwaste/WhatToRecycle/tabid/509/Default.aspx"));
        counties.add(new County("Crawford","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Dane","Pellitteri","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.vil.waunakee.wi.us/DocumentCenter/View/2070"));
        counties.add(new County("Dodge","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.dodge.wi.us/index.aspx?page=456"));
        counties.add(new County("Door","Door","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://door.uwex.edu/files/2011/08/Door-County-Recycling-Program-3.pdf"));
        counties.add(new County("Douglas","Douglas","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.douglascountywi.org/index.aspx?nid=835"));
        counties.add(new County("Dunn","Single Stream","Yes","Yes ","Yes ","Yes ","Yes ","Yes ","Yes ","1,2,3,4,5,7","http://www.town.dunn.wi.us/townofdunn/garbagerecycling/recycling/default.asp"));
        counties.add(new County("Eau Claire","Eau Claire","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.eau-claire.wi.us/departments/departments-l-z/recycling-program/recycling-program"));
        counties.add(new County("Florence","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Fond Du Lac","Fond Du Lac","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","https://www.fdl.wi.gov/cofuploads/Single_Sort_Recycling_Instructions.pdf"));
        counties.add(new County("Forest","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Grant","Grant County Recycling Center","Drop off","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.eciswd.org/index_Page764.htm"));
        counties.add(new County("Green","Village of Albany-drop off only","No","Yes","Yes","Yes","Newspaper, Office Paper","Yes","Only Tin Cans","1,2,3,4,5,7","http://www.co.green.wi.gov/"));
        counties.add(new County("Green Lake","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Iowa","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1, 2, 3, 4, 5, 6, 7","http://iwanttoberecycled.org/"));
        counties.add(new County("Iron","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 and 2","http://iwanttoberecycled.org/"));
        counties.add(new County("Jackson","Jackson","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.jackson.wi.us/index.asp?Type=B_BASIC&SEC={E00B03F2-AFD8-4141-840C-7A6269B607E4}"));
        counties.add(new County("Jefferson","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","https://jeffersoncountyapps.jeffersoncountywi.gov/jc/public/customPrograms/weekly_meeting.php?file=/UserFiles/county%20board/files/Handout/2014/01272014/Planning%20and%20Zoning%20Handouts.pdf"));
        counties.add(new County("Juneau","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.juneau.wi.gov/uploads/1/9/4/5/19459011/jc_landfill_info_guide.pdf"));
        counties.add(new County("Kenosha","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.kewauneeco.org/, http://kewaunee.uwex.edu/files/2010/05/Kewaunee-Recycling-Guide1.pdf"));
        counties.add(new County("Kewaunee","Kawaunee","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.kenosha.wi.us/index.aspx?NID=1520"));
        counties.add(new County("La Crosse","","Yes","Yes","Yes","Yes","Yes","","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Lafayette","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Langlade","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1, 2, 3, 4, 5, 6, 7","http://iwanttoberecycled.org/"));
        counties.add(new County("Lincoln","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1, 2, 3, 4, 5, 6, 7","http://www.townofmerrill.net/recycling"));
        counties.add(new County("Manitowoc","Maitowoc","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Marathon","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Marinette","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Marquette","","Yes","No","No","No","Yes","Yes","No","None","http://iwanttoberecycled.org/"));
        counties.add(new County("Menominee","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.menominee.wi.us/i/f/file/Solid%20Waste%20&%20Recycling/2015%20CleanSweep%20Flyer.pdf"));
        counties.add(new County("Milwaukee","","Yes","Yes","Yes","Yes","Yes","Yes","yesyw","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Monroe","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Oconto","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Oneida","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Outagamie","Tricounty","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://wi-ozaukeecounty.civicplus.com/DocumentCenter/Home/View/431"));
        counties.add(new County("Ozaukee","Ozaukee","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Pepin","Manitowoc","Yes","Yes","yes","Yes","Yes","Yes","Yes","1,2","http://www.recyclemorewisconsin.org/locations/pepin-2/"));
        counties.add(new County("Pierce","Peice","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","https://www.co.pierce.wa.us/index.aspx?NID=150"));
        counties.add(new County("Polk","Polk county recycling center","Drop off","Yes","Yes","No Ceramics","Yes","Yes","Yes","1,2","http://www.co.polk.wi.us/recycling"));
        counties.add(new County("Portage","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Price","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.portagewi.gov/vertical/sites/%7B889D2199-3A6C-48F9-AB94-DE81D288EE40%7D/uploads/2015_Recycling_Schedule.pdf"));
        counties.add(new County("Racine","Racine Recycles","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.cityofracine.org/, http://www.cityofracine.org/recycling/"));
        counties.add(new County("Richland","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Rock","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Rusk","Rusk County recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,6,7","http://www.ruskcounty.org/wp-content/uploads/2010/10/2015-SINGLE-SORT-RECYCLING.pdf"));
        counties.add(new County("Sauk","Dane County Clean Sweep","No ","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.danecountycleansweep.com/household.aspx"));
        counties.add(new County("Sawyer","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","","http://iwanttoberecycled.org/"));
        counties.add(new County("Shawano","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Sheboygan","Sheboygan County recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.sheboyganwi.gov/residents/garbage-recycling/"));
        counties.add(new County("St Croix","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.saint-croix.wi.us/recycling"));
        counties.add(new County("Taylor","","Double Streams","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.taylor.wi.us/departments/n-z/recycling/"));
        counties.add(new County("Trempealeau","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Vernon","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Vilas","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Walworth","Town of Delvan","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Washburn","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.burnettcounty.com/DocumentCenter/Home/View/101, http://www.nwrpc.com/DocumentCenter/View/13, http://www.nwrpc.com/DocumentCenter/Home/View/12"));
        counties.add(new County("Washington","Washington","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.co.washington.wi.us/index.iml"));
        counties.add(new County("Waukesha","Waukesha County Recycles","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,4,5,7,","http://www.waukeshacounty.gov/, http://www.waukeshacounty.gov/Recy_Home/"));
        counties.add(new County("Waupaca","Wapaca","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.waupacacountyrecycling.com/"));
        counties.add(new County("Waushara","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Winnebago","Tricounty","Yes ","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.winnebago.wi.us/solid-waste/recycling"));
        counties.add(new County("Wood","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.wood.wi.us/Departments/Health/Environmental.aspx"));

        CountyListAdapter countyListAdapter = new CountyListAdapter(this, R.layout.county, R.id.adapterCountyTextView, counties);
        ((ListView) findViewById(android.R.id.list)).setAdapter(countyListAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return (super.onCreateOptionsMenu(menu));
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
