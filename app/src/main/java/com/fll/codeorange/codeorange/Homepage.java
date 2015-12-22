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


        counties.add(new County("Adams County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.adams.wi.gov/Portals/0/General%20Docs/SldWaste/Recycling%20Guide.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Ashland County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.ashlandcounty.org/recycling/index.php?id=recycling-guide, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Barron County","Collection","No","Yes","Yes","Yes","No","No","Yes","1, 2, 3, 4, 5, 6, 7","http://www.mosaictelecom.com/~recycle/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Bayfield County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.cityofwashburn.org/waste.htm, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Brown County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.browncountyrecycling.org/media/78389/new_materials_flyer2014.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Buffalo County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.buffalocounty.com/189/Recycling, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Burnett County","Burnett","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.burnettcounty.com/DocumentCenter/Home/View/101, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Calumet County","Manitowoc","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.calumet.wi.us/index.aspx?NID=438, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Chippewa County","Drop Off Centers","Yes","Yes ","Yes ","Yes ","Yes ","Yes ","Yes ","1,2,3,4,5,7","http://www.co.chippewa.wi.us/government/land-conservation-forest-management/recycling/recycling-programs-services, "));
        counties.add(new County("Clark County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.clark.wa.gov/recycle/recycles/residential.html, "));
        counties.add(new County("Columbia County","Columbia County Recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.columbia.wi.us/columbiacounty/solidwaste/WhatToRecycle/tabid/509/Default.aspx, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Crawford County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.townandcountrysanitation.com/recycling.html, "));
        counties.add(new County("Dane County","Pellitteri","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","https://www.cityofmadison.com/streets/recycling/guidelines.cfm, "));
        counties.add(new County("Dodge County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://dodge.uwex.edu/community-development/clean-sweep-recycling/, http://www.cityofwaupun.org/1654/custom/23972, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Door County","Door","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.iwanttoberecycled.org/, http://www.advanceddisposal.com/media/21280/infographic-for-recycling-smarter-flyer.pdf"));
        counties.add(new County("Douglas County","Douglas","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.douglascountywi.org/index.aspx?NID=726, http://www.douglascountywi.org/index.aspx?nid=369, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Dunn County","Single Stream","Yes","Yes ","Yes ","Yes ","Yes ","Yes ","Yes ","1,2,3,4,5,7","http://www.co.dunn.wi.us/vertical/Sites/%7BD750D8EC-F485-41AF-8057-2CE69E2B175A%7D/uploads/121180_Dunn_Co_PDF_for_Website_10-29-15.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Eau Claire County","Eau Claire","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.eau-claire.wi.us/home/showdocument?id=622, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Florence County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://eaglewasteandrecycling.com/recycle_info.html, http://www.florencecountywi.com/departments/page_5693ac94649c/?department=b2d111e3ecff&subdepartment=d4d340fd11ee, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Fond Du Lac County","Fond Du Lac","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://fonddulac.uwex.edu/new-recycling-guidelines/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Forest County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.eaglewasteandrecycling.com/recycle_info.html, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Grant County","Grant County Recycling Center","Drop off","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.iwanttoberecycled.org/, http://fahertyincorporated.com/tips/"));
        counties.add(new County("Green County","Village of Albany-drop off only","No","Yes","Yes","Yes","Yes","Yes","yes","1 - 7","http://www.iwanttoberecycled.org/, http://www.albanywi.org/recycling_center/"));
        counties.add(new County("Green Lake County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Iowa County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Iron County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.iron.wi.gov/localgov_departments_details.asp?deptid=283&locid=180, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Jackson County","Jackson","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.co.jackson.wi.us/index.asp?Type=B_BASIC&SEC={E00B03F2-AFD8-4141-840C-7A6269B607E4}, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Jefferson County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://jefferson.uwex.edu/jefferson-county-clean-sweep-recycling-program/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Juneau County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.juneau.wi.gov/solid-waste--recycling.html, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Kenosha County ","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://kenosharacinerecycles.org/. http://www.iwanttoberecycled.org/"));
        counties.add(new County("Kewaunee County ","Kewaunee","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/, http://www.myyp.com/guide/Kewaunee,WI/The-Three-Rs-of-Recycling"));
        counties.add(new County("La Crosse County ","","Yes","Yes","Yes","Yes","Yes","","Yes","1,2","http://www.iwanttoberecycled.org/, http://www.lacrossecounty.org/SolidWaste/hhm.asp"));
        counties.add(new County("Lafayette County ","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Langlade County ","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/, http://www.co.langlade.wi.us/LandConservationCleanSweep2014.pdf"));
        counties.add(new County("Lincoln County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1, 2, 3, 4, 5, 6, 7","http://www.co.lincoln.wi.us/departments/services/?department=31a394cd7f14&service=52db12d7b2c2, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Manitowoc County","Manitowoc","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.manitowocrecycles.org/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Marathon County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1 - 7","http://www.marathoncountysolidwaste.org/recycling-guide-house-hold/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Marinette County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","https://www.marinettecounty.com/departments/page_42bf98539eb6/?department=a67be5f0c03a&subdepartment=ec2604bce7e0, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Marquette County","","Yes","No","No","No","Yes","Yes","yes","1 - 7","http://www.mcswma.com/recycling.html, http://www.mcswma.com/uploads/3/9/1/3/39138437/recycling_brochure_5-19-15.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Menominee County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.menominee.wi.us/i/f/file/Solid%20Waste%20&%20Recycling/Menominee%20Flyer%202014.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Milwaukee County","","Yes","Yes","Yes","Yes","Yes","Yes","yes","1,2,4,5","http://www.milwaukeerecycles.com/SSRecycling.aspx, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Monroe County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.monroe.wi.us/departments/solid-waste/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Oconto County","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Oneida County","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Outagamie County","Tricounty","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.recyclemoretricounty.org/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Ozaukee County","Ozaukee","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://wi-ozaukeecounty.civicplus.com/DocumentCenter/Home/View/431"));
        counties.add(new County("Pepin County","Manitowoc","Yes","Yes","yes","Yes","Yes","Yes","Yes","1,2","http://www.co.pepin.wi.us/index.asp?SEC=0DCA0A8B-0857-4263-AC4E-34537CAB82B4&Type=B_BASIC, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Pierce County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Polk County","Polk county recycling center","Drop off","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.polk.wi.us/recycling, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Portage County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.portage.wi.us/solidwaste/pdf/householdrecycling%202015.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Price County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.iwanttoberecycled.org/"));
        counties.add(new County("Racine County","Racine Recycles","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://kenosha.uwex.edu/files/2012/12/Recycling_Guide_2013.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Richland County","","Yes","Yes","Yes","Yes","Yes","Yes","tin","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Rock County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Rusk County","Rusk County recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,6,7","http://www.ruskcounty.org/wp-content/uploads/2010/10/2015-SINGLE-SORT-RECYCLING.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Sauk County","Dane County Clean Sweep","No ","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.danecountycleansweep.com/household.aspx"));
        counties.add(new County("Sawyer County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","","http://iwanttoberecycled.org/"));
        counties.add(new County("Shawano County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Sheboygan County","Sheboygan County recycling","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.sheboyganwi.gov/residents/garbage-recycling/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("St Croix County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.co.saint-croix.wi.us/index.asp?Type=B_BASIC&SEC={2B3B2B16-92BE-436B-A361-125CCE88818B}, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Taylor County","","Double Streams","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.taylor.wi.us/departments/n-z/recycling/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Trempeauleau County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Vernon County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://iwanttoberecycled.org/"));
        counties.add(new County("Vilas County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Walworth County","Town of Delvan","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Washburn County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2","http://www.burnettcounty.com/DocumentCenter/Home/View/101, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Washington County","Washington","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.co.washington.wi.us/index.iml, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Waukesha County","Waukesha County Recycles","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,4,5,7,","http://www.waukeshacounty.gov/Recy_Home/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Waupaca County","Waupaca","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5","http://www.waupacacountyrecycling.com/, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Waushara County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://iwanttoberecycled.org/"));
        counties.add(new County("Winnebago County","Pierce","Yes ","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.winnebago.wi.us/sites/default/files/uploaded-files/all_materials_recycle_guide_2015_web_2.pdf, http://www.iwanttoberecycled.org/"));
        counties.add(new County("Wood County","","Yes","Yes","Yes","Yes","Yes","Yes","Yes","1,2,3,4,5,7","http://www.co.wood.wi.us/Departments/Health/Environmental.aspx, http://www.iwanttoberecycled.org/"));

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
