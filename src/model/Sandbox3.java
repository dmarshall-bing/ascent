/*
 * Sandbox3.java
 */

import com.comsol.model.Model;
import com.comsol.model.util.ModelUtil;
//import model.ComsolIdentifierManager;
//import model.JSONReader;
//import org.json.JSONArray;
//import org.json.JSONObject;

// comsolbatch -inputfile Model1.mph -outputfile Model1_solved.mph (add this to runner maybe?)

// comsolbatch -inputfile Model1.mph -outputfile Model1_solved.mph
/** Model exported on Sep 5 2019, 09:20 by COMSOL 5.4.0.388. */
public class Sandbox3 {

    public static Model definePartInstanceParameters() {

        Model model = ModelUtil.create("Model");
        ModelUtil.showProgress(false);

        model.modelPath("D:\\Documents\\ModularCuffs");
        model.label("UNI_TUBECUFF.mph");

        //// SECTION: Define (and assign) part specific parameters (Globally accessible, categorically bundled)
        // Enteromedics
        model.param().group().create("par1");
        model.param("par1").set("N_holes_EM", "0");
        model.param("par1").set("Theta_EM", "Theta_contact_EM+((2*(360*arc_ext_EM)/(2*pi*R_in_EM)) [deg])");
        model.param("par1").set("Center_EM", "10 [mm]");
        model.param("par1").set("R_in_EM", "max(r_nerve_EM+thk_medium_gap_internal_EM,r_cuff_in_pre_EM)");
        model.param("par1").set("R_out_EM", "R_in_EM+thk_cuff_EM");
        model.param("par1").set("L_EM", "3*L_elec_EM");
        model.param("par1").set("Rot_def_EM", "-(360*arc_ext_EM)/(2*pi*R_in_EM)");
        model.param("par1").set("D_hole_EM", "NaN");
        model.param("par1").set("Buffer_hole_EM", "NaN");
        model.param("par1").set("L_holecenter_cuffseam_EM", "NaN");
        model.param("par1").set("Pitch_holecenter_holecenter_EM", "NaN");
        model.param("par1").set("r_nerve_EM", "1.3 [mm]");
        model.param("par1").set("thk_medium_gap_internal_EM", "0 [mm]");
        model.param("par1").set("r_cuff_in_pre_EM", "1.651 [mm]");
        model.param("par1").set("thk_cuff_EM", "1 [mm]");
        model.param("par1").set("L_elec_EM", "1.397 [mm]");
        model.param("par1").set("arc_ext_EM", "0.5 [mm]");
        model.param("par1").set("theta_contact_pre_EM", "256.4287 [deg]");
        model.param("par1").set("Theta_contact_EM", "theta_contact_pre_EM*(r_cuff_in_pre_EM/R_in_EM)");
        model.param("par1").set("z_nerve_EM", "20 [mm]");
        model.param("par1").set("Thk_elec_EM", "0.1 [mm]");
        model.param("par1").set("Recess_EM", "0 [mm]");
        model.param("par1").label("Enteromedics [EM]");

        // Madison
        model.param().group().create("par2");
        model.param("par2").set("N_holes_M", "0");
        model.param("par2").set("Theta_M", "percent_circ_cuff_M*360 [deg]");
        model.param("par2").set("Center_M", "2*10 [mm]");
        model.param("par2").set("R_in_M", "max(r_nerve_M+thk_medium_gap_internal_M,r_cuff_in_pre_M)");
        model.param("par2").set("R_out_M", "R_in_M+thk_cuff_M");
        model.param("par2").set("L_M", "10 [mm]");
        model.param("par2").set("Rot_def_M", "0");
        model.param("par2").set("D_hole_M", "NaN");
        model.param("par2").set("Buffer_hole_M", "NaN");
        model.param("par2").set("L_holecenter_cuffseam_M", "NaN");
        model.param("par2").set("Pitch_holecenter_holecenter_M", "NaN");
        model.param("par2").set("percent_circ_cuff_M", "percent_circ_cuff_pre_M*(r_cuff_in_pre_M/R_in_M)");
        model.param("par2").set("percent_circ_cuff_pre_M", "1");
        model.param("par2").set("z_nerve_M", "20 [mm]");
        model.param("par2").set("r_cuff_in_pre_M", "1.5 [mm]");
        model.param("par2").set("r_nerve_M", "1.6 [mm]");
        model.param("par2").set("thk_medium_gap_internal_M", "0");
        model.param("par2").set("thk_cuff_M", "1 [mm]");
        model.param("par2").set("Recess_M", "0 [mm]");
        model.param("par2").set("Thk_elec_M", "0.05 [mm]");
        model.param("par2").set("L_elec_M", "1 [mm]");
        model.param("par2").set("Theta_contact_M", "360*(w_elec_M/(pi*2*(R_in_M+Recess_M))) [deg]");
        model.param("par2").set("w_elec_M", "1 [mm]");
        model.param("par2").set("Rot_def_contact_M", "(Theta_M/2)-(Theta_contact_M/2)");
        model.param("par2").label("Madison [M]");

        // CorTec300
        model.param().group().create("par3");
        model.param("par3").set("N_holes_CT", "0");
        model.param("par3").set("Theta_CT", "percent_circ_cuff_CT*360 [deg]");
        model.param("par3").set("Center_CT", "3*10 [mm]");
        model.param("par3").set("R_in_CT", "max(r_nerve_CT+thk_medium_gap_internal_CT,r_cuff_in_pre_CT)");
        model.param("par3").set("R_out_CT", "R_in_CT+thk_cuff_CT");
        model.param("par3").set("L_CT", "2 [mm]");
        model.param("par3").set("Rot_def_CT", "-(theta_cuff_CT-theta_contact_CT)/2");
        model.param("par3").set("D_hole_CT", "NaN");
        model.param("par3").set("Buffer_hole_CT", "NaN");
        model.param("par3").set("L_holecenter_cuffseam_CT", "NaN");
        model.param("par3").set("Pitch_holecenter_holecenter_CT", "NaN");
        model.param("par3").set("percent_circ_cuff_CT", "percent_circ_cuff_pre_CT*(r_cuff_in_pre_CT/R_in_CT)");
        model.param("par3").set("r_nerve_CT", "160 [um]");
        model.param("par3").set("z_nerve_CT", "20 [mm]");
        model.param("par3").set("thk_medium_gap_internal_CT", "0");
        model.param("par3").set("r_cuff_in_pre_CT", "150 [um]");
        model.param("par3").set("thk_cuff_CT", "0.65 [mm]");
        model.param("par3").set("theta_cuff_CT", "percent_circ_cuff_CT*360 [deg]");
        model.param("par3").set("theta_contact_CT", "360*(B_CT/(2*pi*(R_in_CT+recess_CT))) [deg]");
        model.param("par3").set("percent_circ_cuff_pre_CT", "1");
        model.param("par3").set("B_CT", "0.6 [mm]");
        model.param("par3").set("recess_CT", "0");
        model.param("par3").set("Thk_elec_CT", "0.025 [mm]");
        model.param("par3").set("L_elec_CT", "0.3 [mm]");
        model.param("par3").set("Recess_CT", "0 [mm]");
        model.param("par3").set("Theta_contact_CT", "360*(B_CT/(2*pi*(R_in_CT+Recess_CT))) [deg]");
        model.param("par3").set("Rot_def_contact_CT", "0");
        model.param("par3").set("Pitch_CT", "1.5 [mm]");
        model.param("par3").label("CorTec300 [CT]");

        // Purdue
        model.param().group().create("par4");
        model.param("par4").set("N_holes_P", "0");
        model.param("par4").set("Theta_P", "percent_circ_cuff_P*360 [deg]");
        model.param("par4").set("Center_P", "4*10 [mm]");
        model.param("par4")
                .set("R_in_P", "max(r_nerve_P+thk_medium_gap_internal_P+2*r_conductor_P+sep_conductor_P,r_cuff_in_pre_P)");
        model.param("par4").set("R_out_P", "R_in_P+thk_cuff_P");
        model.param("par4").set("L_P", "3.5 [mm]");
        model.param("par4").set("Rot_def_P", "-((theta_cuff_P-theta_conductor_P)/2)");
        model.param("par4").set("D_hole_P", "NaN");
        model.param("par4").set("Buffer_hole_P", "NaN");
        model.param("par4").set("L_holecenter_cuffseam_P", "NaN");
        model.param("par4").set("Pitch_holecenter_holecenter_P", "NaN");
        model.param("par4").set("z_nerve_P", "20 [mm]");
        model.param("par4").set("percent_circ_cuff_P", "percent_circ_cuff_pre_P*(r_cuff_in_pre_P/R_in_P)");
        model.param("par4").set("percent_circ_cuff_pre_P", "1");
        model.param("par4").set("r_cuff_in_pre_P", "317.5 [um]");
        model.param("par4").set("r_nerve_P", "300 [um]");
        model.param("par4").set("thk_medium_gap_internal_P", "0");
        model.param("par4").set("r_conductor_P", "37.5 [um]");
        model.param("par4").set("sep_conductor_P", "10 [um]");
        model.param("par4").set("thk_cuff_P", "0.279 [mm]");
        model.param("par4").set("theta_cuff_P", "percent_circ_cuff_P*360 [deg]");
        model.param("par4").set("theta_conductor_P", "percent_circ_conductor_P*360 [deg]");
        model.param("par4").set("percent_circ_conductor_pre_P", "0.8");
        model.param("par4")
                .set("percent_circ_conductor_P", "percent_circ_conductor_pre_P*((r_cuff_in_pre_P-sep_conductor_P-2*r_conductor_P)/(R_in_P-sep_conductor_P-2*r_conductor_P))");
        model.param("par4").set("Pitch_P", "1.5 [mm]");
        model.param("par4").label("Purdue [P]");

        // Pitt (WIP)
//        model.param("par5").label("Pitt (WIP)");

        // ImThera
        model.param().group().create("par6");
        model.param("par6").set("N_holes_ITI", "1");
        model.param("par6").set("Theta_ITI", "theta_cuff_pre_ITI*(r_cuff_in_pre_ITI/R_in_ITI)");
        model.param("par6").set("Center_IT", "5*10 [mm]");
        model.param("par6").set("R_in_ITI", "max(r_nerve_IT+thk_medium_gap_internal_IT,r_cuff_in_pre_ITI)");
        model.param("par6").set("R_out_ITI", "R_in_ITI+thk_cuff_ITI");
        model.param("par6").set("L_IT", "0.354 [inch]");
        model.param("par6").set("Rot_def_ITI", "0");
        model.param("par6").set("D_hole_ITI", "0.02 [inch]");
        model.param("par6").set("Buffer_hole_ITI", "150 [um]");
        model.param("par6").set("L_holecenter_cuffseam_ITI", "0.03 [inch]");
        model.param("par6").set("N_holes_ITF", "2");
        model.param("par6")
                .set("Theta_ITF", "theta_cuff_pre_ITF*((r_cuff_in_pre_ITF+thk_cuff_ITI+thk_gap_cuff_furl_IT)/(R_in_ITI+thk_cuff_ITI+thk_gap_cuff_furl_IT))");
        model.param("par6").set("R_in_ITF", "R_in_ITI+thk_cuff_ITI+thk_gap_cuff_furl_IT");
        model.param("par6").set("R_out_ITF", "R_in_ITI+thk_cuff_ITI+thk_gap_cuff_furl_IT+thk_furl_ITF");
        model.param("par6").set("Rot_def_ITF", "-((2*pi-Theta_ITI)/2)-(Theta_ITF/2)");
        model.param("par6").set("D_hole_ITF", "0.02 [inch]");
        model.param("par6").set("Buffer_hole_ITF", "Buffer_hole_ITI");
        model.param("par6").set("L_holecenter_cuffseam_ITF", "(pi*2*R_in_ITF)*(Theta_ITF/(2*pi))-0.03 [inch]");
        model.param("par6").set("theta_cuff_pre_ITI", "360 [deg]");
        model.param("par6").set("r_cuff_in_pre_ITI", "(0.118/2) [inch]");
        model.param("par6").set("z_nerve_IT", "20 [mm]");
        model.param("par6").set("r_nerve_IT", "1.7 [mm]");
        model.param("par6").set("thk_medium_gap_internal_IT", "0");
        model.param("par6").set("thk_cuff_ITI", "r_cuff_out_pre_ITI-r_cuff_in_pre_ITI");
        model.param("par6").set("r_cuff_out_pre_ITI", "(0.178/2) [inch]");
        model.param("par6").set("Pitch_holecenter_holecenter_ITI", "0");
        model.param("par6").set("theta_cuff_pre_ITF", "250 [deg]");
        model.param("par6").set("r_cuff_in_pre_ITF", "(0.178/2) [inch]");
        model.param("par6").set("thk_gap_cuff_furl_IT", "0");
        model.param("par6").set("thk_furl_ITF", "r_furl_out_pre_ITF-r_furl_in_pre_ITF");
        model.param("par6").set("r_furl_out_pre_ITF", "(0.218/2) [inch]");
        model.param("par6").set("r_furl_in_pre_ITF", "(0.178/2) [inch]");
        model.param("par6").set("Pitch_holecenter_holecenter_ITF", "L_IT-2*0.077 [inch]");
        model.param("par6").set("diam_contact_ITC", "2 [mm]");
        model.param("par6")
                .set("a_ellipse_contact_ITC", "0.5*(R_in_ITI+Recess_ITC)*sin((diam_contact_ITC)/(R_in_ITI+Recess_ITC))");
        model.param("par6").set("Recess_ITC", "0.1 [mm]");
        model.param("par6").set("Round_def_ITC", "1");
        model.param("par6").set("Contact_depth_ITC", "0.05 [mm]");
        model.param("par6").set("Overshoot_ITC", "0.05 [mm]");
        model.param("par6").set("length_contactcenter_contactcenter_ITC", "0.108 [inch]");
        model.param("par6")
                .set("ang_cuffseam_contactcenter_ITC", "ang_cuffseam_contactcenter_pre_ITC*(r_cuff_in_pre_ITI/R_in_ITI)");
        model.param("par6").set("ang_cuffseam_contactcenter_pre_ITC", "53 [deg]");
        model.param("par6")
                .set("ang_contactcenter_contactcenter_ITC", "ang_contactcenter_contactcenter_pre_ITC*(r_cuff_in_pre_ITI/R_in_ITI)");
        model.param("par6").set("ang_contactcenter_contactcenter_pre_ITC", "51 [deg]");
        model.param("par6").label("ImThera [IT: ITI+ITF+ITC]");
        return model;
    }

    public static Model defineDefaultPrimitiveInputParameters(Model model) {

        //// SECTION: PRIMITIVE, Assign part inputParams (Local and unique to instance of the part)
        // TUBE CUFF PRIMITIVE
        model.geom().create("part1", "Part", 3);
        model.geom("part1").label("TubeCuff_Primitive");
        model.geom("part1").lengthUnit("\u00b5m");
        model.geom("part1").inputParam().set("N_holes", "1");
        model.geom("part1").inputParam().set("Theta", "340 [deg]");
        model.geom("part1").inputParam().set("Center", "10 [mm]");
        model.geom("part1").inputParam().set("R_in", "1 [mm]");
        model.geom("part1").inputParam().set("R_out", "2 [mm]");
        model.geom("part1").inputParam().set("L", "5 [mm]");
        model.geom("part1").inputParam().set("Rot_def", "0 [deg]");
        model.geom("part1").inputParam().set("D_hole", "0.3 [mm]");
        model.geom("part1").inputParam().set("Buffer_hole", "0.1 [mm]");
        model.geom("part1").inputParam().set("L_holecenter_cuffseam", "0.3 [mm]");
        model.geom("part1").inputParam().set("Pitch_holecenter_holecenter", "0 [mm]");

        // RIBBON CONTACT PRIMITIVE
        model.geom().create("part2", "Part", 3);
        model.geom("part2").label("RibbonContact_Primitive");
        model.geom("part2").lengthUnit("\u00b5m");
        model.geom("part2").inputParam().set("Thk_elec", "0.1 [mm]");
        model.geom("part2").inputParam().set("L_elec", "3 [mm]");
        model.geom("part2").inputParam().set("R_in", "1 [mm]");
        model.geom("part2").inputParam().set("Recess", "0.1 [mm]");
        model.geom("part2").inputParam().set("Center", "10 [mm]");
        model.geom("part2").inputParam().set("Theta_contact", "100 [deg]");
        model.geom("part2").inputParam().set("Rot_def", "0 [deg]");

        // WIRE CONTACT PRIMITIVE
        model.geom().create("part3", "Part", 3);
        model.geom("part3").label("WireContact_Primitive");
        model.geom("part3").lengthUnit("\u00b5m");
        model.geom("part3").inputParam().set("R_conductor", "r_conductor_P");
        model.geom("part3").inputParam().set("R_in", "R_in_P");
        model.geom("part3").inputParam().set("Center", "Center_P");
        model.geom("part3").inputParam().set("Pitch", "Pitch_P");
        model.geom("part3").inputParam().set("Sep_conductor", "sep_conductor_P");
        model.geom("part3").inputParam().set("Theta_conductor", "theta_conductor_P");

        // CIRCLE CONTACT PRIMITIVE
        model.geom().create("part4", "Part", 3);
        model.geom("part4").label("CircleContact_Primitive");
        model.geom("part4").lengthUnit("\u00b5m");
        model.geom("part4").inputParam().set("Recess", "Recess_ITC");
        model.geom("part4").inputParam().set("Rotation_angle", "0 [deg]");
        model.geom("part4").inputParam().set("Center", "Center_IT");
        model.geom("part4").inputParam().set("Round_def", "Round_def_ITC");
        model.geom("part4").inputParam().set("R_in", "R_in_ITI");
        model.geom("part4").inputParam().set("Contact_depth", "Contact_depth_ITC");
        model.geom("part4").inputParam().set("Overshoot", "Overshoot_ITC");
        model.geom("part4").inputParam().set("A_ellipse_contact", "a_ellipse_contact_ITC");
        model.geom("part4").inputParam().set("Diam_contact", "diam_contact_ITC");
        model.geom("part4").inputParam().set("L", "L_IT");
        return model;
    }

    public static Model definePrimitiveSelections(Model model) {
        //// SECTION: PRIMITIVE, Create selections
        // Tube cuff primitive
        model.geom("part1").selection().create("csel1", "CumulativeSelection");
        model.geom("part1").selection("csel1").label("INNER CUFF SURFACE");
        model.geom("part1").selection().create("csel2", "CumulativeSelection");
        model.geom("part1").selection("csel2").label("OUTER CUFF SURFACE");
        model.geom("part1").selection().create("csel3", "CumulativeSelection");
        model.geom("part1").selection("csel3").label("CUFF FINAL");
        model.geom("part1").selection().create("csel11", "CumulativeSelection");
        model.geom("part1").selection("csel11").label("CUFF wGAP PRE HOLES");
        model.geom("part1").selection().create("csel4", "CumulativeSelection");
        model.geom("part1").selection("csel4").label("CUFF PRE GAP");
        model.geom("part1").selection().create("csel10", "CumulativeSelection");
        model.geom("part1").selection("csel10").label("CUFF PRE GAP PRE HOLES");
        model.geom("part1").selection().create("csel5", "CumulativeSelection");
        model.geom("part1").selection("csel5").label("CUFF GAP CROSS SECTION");
        model.geom("part1").selection().create("csel6", "CumulativeSelection");
        model.geom("part1").selection("csel6").label("CUFF GAP");
        model.geom("part1").selection().create("csel7", "CumulativeSelection");
        model.geom("part1").selection("csel7").label("CUFF PRE HOLES");
        model.geom("part1").selection().create("csel8", "CumulativeSelection");
        model.geom("part1").selection("csel8").label("HOLE 1");
        model.geom("part1").selection().create("csel9", "CumulativeSelection");
        model.geom("part1").selection("csel9").label("HOLES");

        // Ribbon contact primitive
        model.geom("part2").selection().create("csel1", "CumulativeSelection");
        model.geom("part2").selection("csel1").label("CONTACT CROSS SECTION");
        model.geom("part2").selection().create("csel2", "CumulativeSelection");
        model.geom("part2").selection("csel2").label("RECESS CROSS SECTION");
        model.geom("part2").selection().create("csel3", "CumulativeSelection");
        model.geom("part2").selection("csel3").label("SRC");
        model.geom("part2").selection().create("csel4", "CumulativeSelection");
        model.geom("part2").selection("csel4").label("CONTACT FINAL");
        model.geom("part2").selection().create("csel5", "CumulativeSelection");
        model.geom("part2").selection("csel5").label("RECESS FINAL");

        // Wire contact primitive
        model.geom("part3").selection().create("csel1", "CumulativeSelection");
        model.geom("part3").selection("csel1").label("CONTACT CROSS SECTION");
        model.geom("part3").selection().create("csel2", "CumulativeSelection");
        model.geom("part3").selection("csel2").label("CONTACT FINAL");
        model.geom("part3").selection().create("csel3", "CumulativeSelection");
        model.geom("part3").selection("csel3").label("SRC");

        // Circle contact primitive
        model.geom("part4").selection().create("csel11", "CumulativeSelection");
        model.geom("part4").selection("csel11").label("CONTACT CUTTER IN");
        model.geom("part4").selection().create("csel10", "CumulativeSelection");
        model.geom("part4").selection("csel10").label("PRE CUT CONTACT");
        model.geom("part4").selection().create("csel7", "CumulativeSelection");
        model.geom("part4").selection("csel7").label("RECESS FINAL");
        model.geom("part4").selection().create("csel8", "CumulativeSelection");
        model.geom("part4").selection("csel8").label("RECESS OVERSHOOT");
        model.geom("part4").selection().create("csel14", "CumulativeSelection");
        model.geom("part4").selection("csel14").label("SRC");
        model.geom("part4").selection().create("csel9", "CumulativeSelection");
        model.geom("part4").selection("csel9").label("PLANE FOR CONTACT");
        model.geom("part4").selection().create("csel13", "CumulativeSelection");
        model.geom("part4").selection("csel13").label("CONTACT FINAL");
        model.geom("part4").selection().create("csel12", "CumulativeSelection");
        model.geom("part4").selection("csel12").label("CONTACT CUTTER OUT");
        model.geom("part4").selection().create("csel1", "CumulativeSelection");
        model.geom("part4").selection("csel1").label("BASE CONTACT PLANE (PRE ROTATION)");
        model.geom("part4").selection().create("csel2", "CumulativeSelection");
        model.geom("part4").selection("csel2").label("BASE PLANE (PRE ROTATION)");
        model.geom("part4").selection().create("csel3", "CumulativeSelection");
        model.geom("part4").selection("csel3").label("PLANE FOR RECESS");
        model.geom("part4").selection().create("csel4", "CumulativeSelection");
        model.geom("part4").selection("csel4").label("PRE CUT RECESS");
        model.geom("part4").selection().create("csel5", "CumulativeSelection");
        model.geom("part4").selection("csel5").label("RECESS CUTTER IN");
        model.geom("part4").selection().create("csel6", "CumulativeSelection");
        model.geom("part4").selection("csel6").label("RECESS CUTTER OUT");
        return model;
    }

    public static Model definePrimitivePartOperations(Model model) {

        //// SECTION: PRIMITIVE, Defined operations for part definition
        // Tube cuff primitive
        model.geom("part1").create("cyl1", "Cylinder");
        model.geom("part1").feature("cyl1").label("Make Inner Cuff Surface");
        model.geom("part1").feature("cyl1").set("contributeto", "csel1");
        model.geom("part1").feature("cyl1").set("pos", new String[]{"0", "0", "Center-(L/2)"});
        model.geom("part1").feature("cyl1").set("r", "R_in");
        model.geom("part1").feature("cyl1").set("h", "L");
        model.geom("part1").create("cyl2", "Cylinder");
        model.geom("part1").feature("cyl2").label("Make Outer Cuff Surface");
        model.geom("part1").feature("cyl2").set("contributeto", "csel2");
        model.geom("part1").feature("cyl2").set("pos", new String[]{"0", "0", "Center-(L/2)"});
        model.geom("part1").feature("cyl2").set("r", "R_out");
        model.geom("part1").feature("cyl2").set("h", "L");
        model.geom("part1").create("if1", "If");
        model.geom("part1").feature("if1").label("If (No Gap AND No Holes)");
        model.geom("part1").feature("if1").set("condition", "(Theta==360) && (N_holes==0)");
        model.geom("part1").create("dif1", "Difference");
        model.geom("part1").feature("dif1").label("Remove Domain Within Inner Cuff Surface");
        model.geom("part1").feature("dif1").set("contributeto", "csel3");
        model.geom("part1").feature("dif1").selection("input").named("csel2");
        model.geom("part1").feature("dif1").selection("input2").named("csel1");
        model.geom("part1").create("elseif1", "ElseIf");
        model.geom("part1").feature("elseif1").label("If (Gap       AND No Holes)");
        model.geom("part1").feature("elseif1").set("condition", "(Theta<360) && (N_holes==0)");
        model.geom("part1").create("dif2", "Difference");
        model.geom("part1").feature("dif2").label("Remove Domain Within Inner Cuff Surface 1");
        model.geom("part1").feature("dif2").set("contributeto", "csel4");
        model.geom("part1").feature("dif2").selection("input").named("csel2");
        model.geom("part1").feature("dif2").selection("input2").named("csel1");
        model.geom("part1").create("wp1", "WorkPlane");
        model.geom("part1").feature("wp1").label("Make Cuff Gap Cross Section");
        model.geom("part1").feature("wp1").set("contributeto", "csel5");
        model.geom("part1").feature("wp1").set("quickplane", "xz");
        model.geom("part1").feature("wp1").set("unite", true);
        model.geom("part1").feature("wp1").geom().create("r1", "Rectangle");
        model.geom("part1").feature("wp1").geom().feature("r1").label("Cuff Gap Cross Section");
        model.geom("part1").feature("wp1").geom().feature("r1")
                .set("pos", new String[]{"R_in+((R_out-R_in)/2)", "Center"});
        model.geom("part1").feature("wp1").geom().feature("r1").set("base", "center");
        model.geom("part1").feature("wp1").geom().feature("r1").set("size", new String[]{"R_out-R_in", "L"});
        model.geom("part1").create("rev1", "Revolve");
        model.geom("part1").feature("rev1").label("Make Cuff Gap");
        model.geom("part1").feature("rev1").set("contributeto", "csel6");
        model.geom("part1").feature("rev1").set("angle1", "Theta");
        model.geom("part1").feature("rev1").selection("input").set("wp1");
        model.geom("part1").create("dif3", "Difference");
        model.geom("part1").feature("dif3").label("Remove Cuff Gap");
        model.geom("part1").feature("dif3").set("contributeto", "csel3");
        model.geom("part1").feature("dif3").selection("input").named("csel4");
        model.geom("part1").feature("dif3").selection("input2").named("csel6");
        model.geom("part1").create("rot4", "Rotate");
        model.geom("part1").feature("rot4").label("Rotate to Default Conformation 1");
        model.geom("part1").feature("rot4").set("rot", "Rot_def");
        model.geom("part1").feature("rot4").selection("input").named("csel3");
        model.geom("part1").create("elseif2", "ElseIf");
        model.geom("part1").feature("elseif2").label("If (No Gap AND       Holes)");
        model.geom("part1").feature("elseif2").set("condition", "(Theta==360) && (N_holes>0)");
        model.geom("part1").create("dif4", "Difference");
        model.geom("part1").feature("dif4").label("Remove Domain Within Inner Cuff Surface 2");
        model.geom("part1").feature("dif4").set("contributeto", "csel7");
        model.geom("part1").feature("dif4").selection("input").named("csel2");
        model.geom("part1").feature("dif4").selection("input2").named("csel1");
        model.geom("part1").create("econ1", "ECone");
        model.geom("part1").feature("econ1").label("Make Hole Shape");
        model.geom("part1").feature("econ1").set("contributeto", "csel9");
        model.geom("part1").feature("econ1")
                .set("pos", new String[]{"R_in-Buffer_hole/2", "0", "Center+Pitch_holecenter_holecenter/2"});
        model.geom("part1").feature("econ1").set("axis", new int[]{1, 0, 0});
        model.geom("part1").feature("econ1").set("semiaxes", new String[]{"D_hole/2", "D_hole/2"});
        model.geom("part1").feature("econ1").set("h", "(R_out-R_in)+Buffer_hole");
        model.geom("part1").feature("econ1").set("rat", "R_out/R_in");
        model.geom("part1").create("rot1", "Rotate");
        model.geom("part1").feature("rot1").label("Position Hole in Cuff");
        model.geom("part1").feature("rot1").set("rot", "(360*L_holecenter_cuffseam)/(pi*2*R_in)");
        model.geom("part1").feature("rot1").selection("input").named("csel9");
        model.geom("part1").create("dif5", "Difference");
        model.geom("part1").feature("dif5").label("Make Inner Cuff Hole");
        model.geom("part1").feature("dif5").set("contributeto", "csel3");
        model.geom("part1").feature("dif5").selection("input").named("csel7");
        model.geom("part1").feature("dif5").selection("input2").named("csel9");
        model.geom("part1").create("elseif3", "ElseIf");
        model.geom("part1").feature("elseif3").label("If (      Gap AND       Holes)");
        model.geom("part1").feature("elseif3").set("condition", "(Theta<360) && (N_holes>0)");
        model.geom("part1").create("dif6", "Difference");
        model.geom("part1").feature("dif6").label("Remove Domain Within Inner Cuff Surface 3");
        model.geom("part1").feature("dif6").set("contributeto", "csel10");
        model.geom("part1").feature("dif6").selection("input").named("csel2");
        model.geom("part1").feature("dif6").selection("input2").named("csel1");
        model.geom("part1").create("wp2", "WorkPlane");
        model.geom("part1").feature("wp2").label("Make Cuff Gap Cross Section 1");
        model.geom("part1").feature("wp2").set("contributeto", "csel5");
        model.geom("part1").feature("wp2").set("quickplane", "xz");
        model.geom("part1").feature("wp2").set("unite", true);
        model.geom("part1").feature("wp2").geom().create("r1", "Rectangle");
        model.geom("part1").feature("wp2").geom().feature("r1").label("Cuff Gap Cross Section");
        model.geom("part1").feature("wp2").geom().feature("r1")
                .set("pos", new String[]{"R_in+((R_out-R_in)/2)", "Center"});
        model.geom("part1").feature("wp2").geom().feature("r1").set("base", "center");
        model.geom("part1").feature("wp2").geom().feature("r1").set("size", new String[]{"R_out-R_in", "L"});
        model.geom("part1").create("rev2", "Revolve");
        model.geom("part1").feature("rev2").label("Make Cuff Gap 1");
        model.geom("part1").feature("rev2").set("contributeto", "csel6");
        model.geom("part1").feature("rev2").set("angle1", "Theta");
        model.geom("part1").feature("rev2").selection("input").named("csel5");
        model.geom("part1").create("dif7", "Difference");
        model.geom("part1").feature("dif7").label("Remove Cuff Gap 1");
        model.geom("part1").feature("dif7").set("contributeto", "csel11");
        model.geom("part1").feature("dif7").selection("input").named("csel10");
        model.geom("part1").feature("dif7").selection("input2").named("csel6");
        model.geom("part1").create("econ2", "ECone");
        model.geom("part1").feature("econ2").label("Make Hole Shape 1");
        model.geom("part1").feature("econ2").set("contributeto", "csel9");
        model.geom("part1").feature("econ2")
                .set("pos", new String[]{"R_in-Buffer_hole/2", "0", "Center+Pitch_holecenter_holecenter/2"});
        model.geom("part1").feature("econ2").set("axis", new int[]{1, 0, 0});
        model.geom("part1").feature("econ2").set("semiaxes", new String[]{"D_hole/2", "D_hole/2"});
        model.geom("part1").feature("econ2").set("h", "(R_out-R_in)+Buffer_hole");
        model.geom("part1").feature("econ2").set("rat", "R_out/R_in");
        model.geom("part1").create("rot2", "Rotate");
        model.geom("part1").feature("rot2").label("Position Hole in Cuff 1");
        model.geom("part1").feature("rot2").set("rot", "(360*L_holecenter_cuffseam)/(pi*2*R_in)");
        model.geom("part1").feature("rot2").selection("input").named("csel9");
        model.geom("part1").create("dif8", "Difference");
        model.geom("part1").feature("dif8").label("Make Inner Cuff Hole 1");
        model.geom("part1").feature("dif8").set("contributeto", "csel3");
        model.geom("part1").feature("dif8").selection("input").named("csel11");
        model.geom("part1").feature("dif8").selection("input2").named("csel9");
        model.geom("part1").create("rot3", "Rotate");
        model.geom("part1").feature("rot3").label("Rotate to Default Conformation");
        model.geom("part1").feature("rot3").set("rot", "Rot_def");
        model.geom("part1").feature("rot3").selection("input").named("csel3");
        model.geom("part1").create("endif1", "EndIf");
        model.geom("part1").run();

        // Ribbon contact primitive
        model.geom("part2").create("wp1", "WorkPlane");
        model.geom("part2").feature("wp1").label("Contact Cross Section");
        model.geom("part2").feature("wp1").set("contributeto", "csel1");
        model.geom("part2").feature("wp1").set("quickplane", "xz");
        model.geom("part2").feature("wp1").set("unite", true);
        model.geom("part2").feature("wp1").geom().create("r1", "Rectangle");
        model.geom("part2").feature("wp1").geom().feature("r1").label("Contact Cross Section");
        model.geom("part2").feature("wp1").geom().feature("r1")
                .set("pos", new String[]{"R_in+Recess+Thk_elec/2", "Center"});
        model.geom("part2").feature("wp1").geom().feature("r1").set("base", "center");
        model.geom("part2").feature("wp1").geom().feature("r1").set("size", new String[]{"Thk_elec", "L_elec"});
        model.geom("part2").create("rev1", "Revolve");
        model.geom("part2").feature("rev1").label("Make Contact");
        model.geom("part2").feature("rev1").set("contributeto", "csel4");
        model.geom("part2").feature("rev1").set("angle1", "Rot_def");
        model.geom("part2").feature("rev1").set("angle2", "Rot_def+Theta_contact");
        model.geom("part2").feature("rev1").selection("input").named("csel1");
        model.geom("part2").create("if1", "If");
        model.geom("part2").feature("if1").set("condition", "Recess>0");
        model.geom("part2").create("wp2", "WorkPlane");
        model.geom("part2").feature("wp2").label("Recess Cross Section 1");
        model.geom("part2").feature("wp2").set("contributeto", "csel2");
        model.geom("part2").feature("wp2").set("quickplane", "xz");
        model.geom("part2").feature("wp2").set("unite", true);
        model.geom("part2").feature("wp2").geom().selection().create("csel1", "CumulativeSelection");
        model.geom("part2").feature("wp2").geom().selection("csel1").label("Cumulative Selection 1");
        model.geom("part2").feature("wp2").geom().selection().create("csel2", "CumulativeSelection");
        model.geom("part2").feature("wp2").geom().selection("csel2").label("RECESS CROSS SECTION");
        model.geom("part2").feature("wp2").geom().create("r1", "Rectangle");
        model.geom("part2").feature("wp2").geom().feature("r1").label("Recess Cross Section");
        model.geom("part2").feature("wp2").geom().feature("r1").set("contributeto", "csel2");
        model.geom("part2").feature("wp2").geom().feature("r1").set("pos", new String[]{"R_in+Recess/2", "Center"});
        model.geom("part2").feature("wp2").geom().feature("r1").set("base", "center");
        model.geom("part2").feature("wp2").geom().feature("r1").set("size", new String[]{"Recess", "L_elec"});
        model.geom("part2").create("rev2", "Revolve");
        model.geom("part2").feature("rev2").label("Make Recess");
        model.geom("part2").feature("rev2").set("contributeto", "csel5");
        model.geom("part2").feature("rev2").set("angle1", "Rot_def");
        model.geom("part2").feature("rev2").set("angle2", "Rot_def+Theta_contact");
        model.geom("part2").feature("rev2").selection("input").named("csel2");
        model.geom("part2").create("endif1", "EndIf");
        model.geom("part2").create("pt1", "Point");
        model.geom("part2").feature("pt1").label("src");
        model.geom("part2").feature("pt1").set("contributeto", "csel3");
        model.geom("part2").feature("pt1")
                .set("p", new String[]{"(R_in+Recess+Thk_elec/2)*cos(Rot_def+Theta_contact/2)", "(R_in+Recess+Thk_elec/2)*sin(Rot_def+Theta_contact/2)", "Center"});
        model.geom("part2").run();

        // Wire contact primitive
        model.geom("part3").create("wp1", "WorkPlane");
        model.geom("part3").feature("wp1").label("Contact Cross Section");
        model.geom("part3").feature("wp1").set("contributeto", "csel1");
        model.geom("part3").feature("wp1").set("quickplane", "zx");
        model.geom("part3").feature("wp1").set("unite", true);
        model.geom("part3").feature("wp1").geom().selection().create("csel1", "CumulativeSelection");
        model.geom("part3").feature("wp1").geom().selection("csel1").label("CONTACT CROSS SECTION");
        model.geom("part3").feature("wp1").geom().create("c1", "Circle");
        model.geom("part3").feature("wp1").geom().feature("c1").label("Contact Cross Section");
        model.geom("part3").feature("wp1").geom().feature("c1").set("contributeto", "csel1");
        model.geom("part3").feature("wp1").geom().feature("c1")
                .set("pos", new String[]{"Center", "R_in-R_conductor-Sep_conductor"});
        model.geom("part3").feature("wp1").geom().feature("c1").set("r", "R_conductor");
        model.geom("part3").create("rev1", "Revolve");
        model.geom("part3").feature("rev1").label("Make Contact");
        model.geom("part3").feature("rev1").set("contributeto", "csel2");
        model.geom("part3").feature("rev1").set("angle2", "Theta_conductor");
        model.geom("part3").feature("rev1").set("axis", new int[]{1, 0});
        model.geom("part3").feature("rev1").selection("input").named("csel1");
        model.geom("part3").create("pt1", "Point");
        model.geom("part3").feature("pt1").label("Src");
        model.geom("part3").feature("pt1").set("contributeto", "csel3");
        model.geom("part3").feature("pt1")
                .set("p", new String[]{"(R_in-R_conductor-Sep_conductor)*cos(Theta_conductor/2)", "(R_in-R_conductor-Sep_conductor)*sin(Theta_conductor/2)", "Center"});
        model.geom("part3").run();

        // Circle Contact Primitive
        model.geom("part4").create("wp1", "WorkPlane");
        model.geom("part4").feature("wp1").label("Base Plane (Pre Rrotation)");
        model.geom("part4").feature("wp1").set("contributeto", "csel2");
        model.geom("part4").feature("wp1").set("quickplane", "yz");
        model.geom("part4").feature("wp1").set("unite", true);
        model.geom("part4").create("if1", "If");
        model.geom("part4").feature("if1").label("If Recess");
        model.geom("part4").feature("if1").set("condition", "Recess>0");
        model.geom("part4").create("wp2", "WorkPlane");
        model.geom("part4").feature("wp2").label("Rotated Plane for Recess");
        model.geom("part4").feature("wp2").set("contributeto", "csel3");
        model.geom("part4").feature("wp2").set("planetype", "transformed");
        model.geom("part4").feature("wp2").set("workplane", "wp1");
        model.geom("part4").feature("wp2").set("transaxis", new int[]{0, 1, 0});
        model.geom("part4").feature("wp2").set("transrot", "Rotation_angle");
        model.geom("part4").feature("wp2").set("unite", true);
        model.geom("part4").feature("wp2").geom().selection().create("csel1", "CumulativeSelection");
        model.geom("part4").feature("wp2").geom().selection("csel1").label("CONTACT OUTLINE SHAPE");
        model.geom("part4").feature("wp2").geom().create("if1", "If");
        model.geom("part4").feature("wp2").geom().feature("if1").label("If Contact Surface is Circle");
        model.geom("part4").feature("wp2").geom().feature("if1").set("condition", "Round_def_ITC==1");
        model.geom("part4").feature("wp2").geom().create("e1", "Ellipse");
        model.geom("part4").feature("wp2").geom().feature("e1").label("Contact Outline");
        model.geom("part4").feature("wp2").geom().feature("e1").set("contributeto", "csel1");
        model.geom("part4").feature("wp2").geom().feature("e1").set("pos", new String[]{"0", "Center"});
        model.geom("part4").feature("wp2").geom().feature("e1")
                .set("semiaxes", new String[]{"A_ellipse_contact", "Diam_contact/2"});
        model.geom("part4").feature("wp2").geom().create("elseif1", "ElseIf");
        model.geom("part4").feature("wp2").geom().feature("elseif1").label("Else If Contact Outline is Circle");
        model.geom("part4").feature("wp2").geom().feature("elseif1").set("condition", "Round_def_ITC==2");
        model.geom("part4").feature("wp2").geom().create("e2", "Ellipse");
        model.geom("part4").feature("wp2").geom().feature("e2").label("Contact Outline 1");
        model.geom("part4").feature("wp2").geom().feature("e2").set("contributeto", "csel1");
        model.geom("part4").feature("wp2").geom().feature("e2").set("pos", new String[]{"0", "Center"});
        model.geom("part4").feature("wp2").geom().feature("e2")
                .set("semiaxes", new String[]{"Diam_contact/2", "Diam_contact/2"});
        model.geom("part4").feature("wp2").geom().create("endif1", "EndIf");
        model.geom("part4").create("ext1", "Extrude");
        model.geom("part4").feature("ext1").label("Make Pre Cut Recess Domains");
        model.geom("part4").feature("ext1").set("contributeto", "csel4");
        model.geom("part4").feature("ext1").setIndex("distance", "R_in+Recess+Overshoot", 0);
        model.geom("part4").feature("ext1").selection("input").named("csel3");
        model.geom("part4").create("cyl1", "Cylinder");
        model.geom("part4").feature("cyl1").label("Recess Cut In");
        model.geom("part4").feature("cyl1").set("contributeto", "csel5");
        model.geom("part4").feature("cyl1").set("pos", new String[]{"0", "0", "Center-L/2"});
        model.geom("part4").feature("cyl1").set("r", "R_in");
        model.geom("part4").feature("cyl1").set("h", "L");
        model.geom("part4").create("cyl2", "Cylinder");
        model.geom("part4").feature("cyl2").label("Recess Cut Out");
        model.geom("part4").feature("cyl2").set("contributeto", "csel6");
        model.geom("part4").feature("cyl2").set("pos", new String[]{"0", "0", "Center-L/2"});
        model.geom("part4").feature("cyl2").set("r", "R_in+Recess");
        model.geom("part4").feature("cyl2").set("h", "L");
        model.geom("part4").create("dif1", "Difference");
        model.geom("part4").feature("dif1").label("Execute Recess Cut In");
        model.geom("part4").feature("dif1").set("contributeto", "csel7");
        model.geom("part4").feature("dif1").selection("input").named("csel4");
        model.geom("part4").feature("dif1").selection("input2").named("csel5");
        model.geom("part4").create("pard1", "PartitionDomains");
        model.geom("part4").feature("pard1").set("contributeto", "csel7");
        model.geom("part4").feature("pard1").set("partitionwith", "objects");
        model.geom("part4").feature("pard1").set("keepobject", false);
        model.geom("part4").feature("pard1").selection("domain").named("csel4");
        model.geom("part4").feature("pard1").selection("object").named("csel6");
        model.geom("part4").create("ballsel1", "BallSelection");
        model.geom("part4").feature("ballsel1").label("Select Overshoot");
        model.geom("part4").feature("ballsel1").set("posx", "(R_in+Recess+Overshoot/2)*cos(Rotation_angle)");
        model.geom("part4").feature("ballsel1").set("posy", "(R_in+Recess+Overshoot/2)*sin(Rotation_angle)");
        model.geom("part4").feature("ballsel1").set("posz", "Center");
        model.geom("part4").feature("ballsel1").set("r", 1);
        model.geom("part4").feature("ballsel1").set("contributeto", "csel8");
        model.geom("part4").create("del1", "Delete");
        model.geom("part4").feature("del1").label("Delete Recess Overshoot");
        model.geom("part4").feature("del1").selection("input").init(3);
        model.geom("part4").feature("del1").selection("input").named("csel8");
        model.geom("part4").create("endif1", "EndIf");
        model.geom("part4").create("wp3", "WorkPlane");
        model.geom("part4").feature("wp3").label("Rotated Plane for Contact");
        model.geom("part4").feature("wp3").set("contributeto", "csel9");
        model.geom("part4").feature("wp3").set("planetype", "transformed");
        model.geom("part4").feature("wp3").set("workplane", "wp1");
        model.geom("part4").feature("wp3").set("transaxis", new int[]{0, 1, 0});
        model.geom("part4").feature("wp3").set("transrot", "Rotation_angle");
        model.geom("part4").feature("wp3").set("unite", true);
        model.geom("part4").feature("wp3").geom().selection().create("csel1", "CumulativeSelection");
        model.geom("part4").feature("wp3").geom().selection("csel1").label("CONTACT OUTLINE SHAPE");
        model.geom("part4").feature("wp3").geom().create("if1", "If");
        model.geom("part4").feature("wp3").geom().feature("if1").label("If Contact Surface is Circle");
        model.geom("part4").feature("wp3").geom().feature("if1").set("condition", "Round_def_ITC==1");
        model.geom("part4").feature("wp3").geom().create("e1", "Ellipse");
        model.geom("part4").feature("wp3").geom().feature("e1").label("Contact Outline");
        model.geom("part4").feature("wp3").geom().feature("e1").set("contributeto", "csel1");
        model.geom("part4").feature("wp3").geom().feature("e1").set("pos", new String[]{"0", "Center"});
        model.geom("part4").feature("wp3").geom().feature("e1")
                .set("semiaxes", new String[]{"A_ellipse_contact", "Diam_contact/2"});
        model.geom("part4").feature("wp3").geom().create("elseif1", "ElseIf");
        model.geom("part4").feature("wp3").geom().feature("elseif1").label("Else If Contact Outline is Circle");
        model.geom("part4").feature("wp3").geom().feature("elseif1").set("condition", "Round_def_ITC==2");
        model.geom("part4").feature("wp3").geom().create("e2", "Ellipse");
        model.geom("part4").feature("wp3").geom().feature("e2").label("Contact Outline 1");
        model.geom("part4").feature("wp3").geom().feature("e2").set("contributeto", "csel1");
        model.geom("part4").feature("wp3").geom().feature("e2").set("pos", new String[]{"0", "Center"});
        model.geom("part4").feature("wp3").geom().feature("e2")
                .set("semiaxes", new String[]{"Diam_contact/2", "Diam_contact/2"});
        model.geom("part4").feature("wp3").geom().create("endif1", "EndIf");
        model.geom("part4").create("ext2", "Extrude");
        model.geom("part4").feature("ext2").label("Make Pre Cut Contact Domains");
        model.geom("part4").feature("ext2").set("contributeto", "csel10");
        model.geom("part4").feature("ext2").setIndex("distance", "R_in+Recess+Contact_depth+Overshoot", 0);
        model.geom("part4").feature("ext2").selection("input").named("csel9");
        model.geom("part4").create("cyl3", "Cylinder");
        model.geom("part4").feature("cyl3").label("Contact Cut In");
        model.geom("part4").feature("cyl3").set("contributeto", "csel11");
        model.geom("part4").feature("cyl3").set("pos", new String[]{"0", "0", "Center-L/2"});
        model.geom("part4").feature("cyl3").set("r", "R_in+Recess");
        model.geom("part4").feature("cyl3").set("h", "L");
        model.geom("part4").create("cyl4", "Cylinder");
        model.geom("part4").feature("cyl4").label("Contact Cut Out");
        model.geom("part4").feature("cyl4").set("contributeto", "csel12");
        model.geom("part4").feature("cyl4").set("pos", new String[]{"0", "0", "Center-L/2"});
        model.geom("part4").feature("cyl4").set("r", "R_in+Recess+Contact_depth");
        model.geom("part4").feature("cyl4").set("h", "L");
        model.geom("part4").create("dif2", "Difference");
        model.geom("part4").feature("dif2").label("Execute Contact Cut In");
        model.geom("part4").feature("dif2").set("contributeto", "csel13");
        model.geom("part4").feature("dif2").selection("input").named("csel10");
        model.geom("part4").feature("dif2").selection("input2").named("csel11");
        model.geom("part4").create("pard2", "PartitionDomains");
        model.geom("part4").feature("pard2").set("contributeto", "csel13");
        model.geom("part4").feature("pard2").set("partitionwith", "objects");
        model.geom("part4").feature("pard2").set("keepobject", false);
        model.geom("part4").feature("pard2").selection("domain").named("csel10");
        model.geom("part4").feature("pard2").selection("object").named("csel12");
        model.geom("part4").create("ballsel2", "BallSelection");
        model.geom("part4").feature("ballsel2").label("Select Overshoot 1");
        model.geom("part4").feature("ballsel2")
                .set("posx", "(R_in+Recess+Contact_depth+Overshoot/2)*cos(Rotation_angle)");
        model.geom("part4").feature("ballsel2")
                .set("posy", "(R_in+Recess+Contact_depth+Overshoot/2)*sin(Rotation_angle)");
        model.geom("part4").feature("ballsel2").set("posz", "Center");
        model.geom("part4").feature("ballsel2").set("r", 1);
        model.geom("part4").feature("ballsel2").set("contributeto", "csel8");
        model.geom("part4").create("del2", "Delete");
        model.geom("part4").feature("del2").label("Delete Recess Overshoot 1");
        model.geom("part4").feature("del2").selection("input").init(3);
        model.geom("part4").feature("del2").selection("input").named("csel8");
        model.geom("part4").create("pt1", "Point");
        model.geom("part4").feature("pt1").label("Src");
        model.geom("part4").feature("pt1").set("contributeto", "csel14");
        model.geom("part4").feature("pt1")
                .set("p", new String[]{"(R_in+Recess+Contact_depth/2)*cos(Rotation_angle)", "(R_in+Recess+Contact_depth/2)*sin(Rotation_angle)", "Center"});
        model.geom("part4").run();
        return model;
    }

    public static Model makePartInstances(Model model) {
        // SECTION: MAKE COMPONENTS FROM PRIMITIVES
        model.component().create("comp1", true);
        model.component("comp1").geom().create("geom1", 3);
        model.component("comp1").mesh().create("mesh1");

        //// ENTEROMEDICS
        // CUFF
        model.component("comp1").geom("geom1").create("pi8", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi8").label("Enteromedics Cuff");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "N_holes", "N_holes_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "Theta", "Theta_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "Center", "Center_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "R_in", "R_in_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "R_out", "R_out_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "L", "L_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "Rot_def", "Rot_def_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "D_hole", "D_hole_EM");
        model.component("comp1").geom("geom1").feature("pi8").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_EM");
        model.component("comp1").geom("geom1").feature("pi8")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_EM");
        model.component("comp1").geom("geom1").feature("pi8")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_EM");
        model.component("comp1").geom("geom1").feature("pi8").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi8").setEntry("selkeepdom", "pi8_csel3.dom", "on");

        // CONTACT
        model.component("comp1").geom("geom1").create("pi9", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi9").label("Enteromedics RibbonContact");
        model.component("comp1").geom("geom1").feature("pi9").set("part", "part2");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "Thk_elec", "Thk_elec_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "L_elec", "L_elec_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "R_in", "R_in_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "Recess", "Recess_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "Center", "Center_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "Theta_contact", "Theta_contact_EM");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("inputexpr", "Rot_def", "0 [deg]");
        model.component("comp1").geom("geom1").feature("pi9").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi9").setEntry("selkeepdom", "pi9_csel4.dom", "on");
        model.component("comp1").geom("geom1").feature("pi9").setEntry("selkeeppnt", "pi9_csel3.pnt", "on");

        //// MADISON
        // CUFF
        model.component("comp1").geom("geom1").create("pi2", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi2").label("Madison Cuff");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "N_holes", "N_holes_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "Theta", "Theta_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "Center", "Center_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "R_in", "R_in_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "R_out", "R_out_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "L", "L_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "Rot_def", "Rot_def_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "D_hole", "D_hole_M");
        model.component("comp1").geom("geom1").feature("pi2").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_M");
        model.component("comp1").geom("geom1").feature("pi2")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_M");
        model.component("comp1").geom("geom1").feature("pi2")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_M");
        model.component("comp1").geom("geom1").feature("pi2").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi2").setEntry("selkeepdom", "pi2_csel3.dom", "on");

        // CONTACT
        model.component("comp1").geom("geom1").create("pi10", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi10").label("Madison RibbonContact");
        model.component("comp1").geom("geom1").feature("pi10").set("part", "part2");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "Thk_elec", "Thk_elec_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "L_elec", "L_elec_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "R_in", "R_in_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "Recess", "Recess_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "Center", "Center_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "Theta_contact", "Theta_contact_M");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("inputexpr", "Rot_def", "Rot_def_contact_M");
        model.component("comp1").geom("geom1").feature("pi10").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi10").setEntry("selkeepdom", "pi10_csel4.dom", "on");
        model.component("comp1").geom("geom1").feature("pi10").setEntry("selkeeppnt", "pi10_csel3.pnt", "on");

        //// CORTEC
        // CUFF
        model.component("comp1").geom("geom1").create("pi3", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi3").label("CorTec300 Cuff");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "N_holes", "N_holes_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "Theta", "Theta_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "Center", "Center_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "R_in", "R_in_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "R_out", "R_out_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "L", "L_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "Rot_def", "Rot_def_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "D_hole", "D_hole_CT");
        model.component("comp1").geom("geom1").feature("pi3").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_CT");
        model.component("comp1").geom("geom1").feature("pi3")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_CT");
        model.component("comp1").geom("geom1").feature("pi3")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_CT");
        model.component("comp1").geom("geom1").feature("pi3").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi3").setEntry("selkeepdom", "pi3_csel3.dom", "on");

        // CONTACT 1
        model.component("comp1").geom("geom1").create("pi11", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi11").label("CorTec300 RibbonContact 1");
        model.component("comp1").geom("geom1").feature("pi11").set("part", "part2");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "Thk_elec", "Thk_elec_CT");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "L_elec", "L_elec_CT");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "R_in", "R_in_CT");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "Recess", "Recess_CT");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "Center", "Center_CT+(Pitch_CT/2)");
        model.component("comp1").geom("geom1").feature("pi11")
                .setEntry("inputexpr", "Theta_contact", "Theta_contact_CT");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("inputexpr", "Rot_def", "Rot_def_contact_CT");
        model.component("comp1").geom("geom1").feature("pi11").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi11").setEntry("selkeepdom", "pi11_csel4.dom", "on");
        model.component("comp1").geom("geom1").feature("pi11").setEntry("selkeeppnt", "pi11_csel3.pnt", "on");

        // CONTACT 2
        model.component("comp1").geom("geom1").create("pi12", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi12").label("CorTec300 RibbonContact 2");
        model.component("comp1").geom("geom1").feature("pi12").set("part", "part2");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "Thk_elec", "Thk_elec_CT");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "L_elec", "L_elec_CT");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "R_in", "R_in_CT");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "Recess", "Recess_CT");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "Center", "Center_CT-(Pitch_CT/2)");
        model.component("comp1").geom("geom1").feature("pi12")
                .setEntry("inputexpr", "Theta_contact", "Theta_contact_CT");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("inputexpr", "Rot_def", "Rot_def_contact_CT");
        model.component("comp1").geom("geom1").feature("pi12").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi12").setEntry("selkeepdom", "pi12_csel4.dom", "on");
        model.component("comp1").geom("geom1").feature("pi12").setEntry("selkeeppnt", "pi12_csel3.pnt", "on");

        //// PURDUE
        // CUFF
        model.component("comp1").geom("geom1").create("pi4", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi4").label("Purdue Cuff");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "N_holes", "N_holes_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "Theta", "Theta_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "Center", "Center_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "R_in", "R_in_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "R_out", "R_out_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "L", "L_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "Rot_def", "Rot_def_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "D_hole", "D_hole_P");
        model.component("comp1").geom("geom1").feature("pi4").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_P");
        model.component("comp1").geom("geom1").feature("pi4")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_P");
        model.component("comp1").geom("geom1").feature("pi4")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_P");
        model.component("comp1").geom("geom1").feature("pi4").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi4").setEntry("selkeepdom", "pi4_csel3.dom", "on");

        // CONTACT 1
        model.component("comp1").geom("geom1").create("pi13", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi13").label("Purdue WireContact 1");
        model.component("comp1").geom("geom1").feature("pi13").set("part", "part3");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("inputexpr", "R_conductor", "r_conductor_P");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("inputexpr", "R_in", "R_in_P");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("inputexpr", "Center", "Center_P-(Pitch_P/2)");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("inputexpr", "Pitch", "Pitch_P");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("inputexpr", "Sep_conductor", "sep_conductor_P");
        model.component("comp1").geom("geom1").feature("pi13")
                .setEntry("inputexpr", "Theta_conductor", "theta_conductor_P");
        model.component("comp1").geom("geom1").feature("pi13").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi13").setEntry("selkeepdom", "pi13_csel2.dom", "on");
        model.component("comp1").geom("geom1").feature("pi13").setEntry("selkeeppnt", "pi13_csel3.pnt", "on");

        // CONTACT 2
        model.component("comp1").geom("geom1").create("pi14", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi14").label("Purdue WireContact 2");
        model.component("comp1").geom("geom1").feature("pi14").set("part", "part3");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("inputexpr", "R_conductor", "r_conductor_P");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("inputexpr", "R_in", "R_in_P");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("inputexpr", "Center", "Center_P+(Pitch_P/2)");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("inputexpr", "Pitch", "Pitch_P");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("inputexpr", "Sep_conductor", "sep_conductor_P");
        model.component("comp1").geom("geom1").feature("pi14")
                .setEntry("inputexpr", "Theta_conductor", "theta_conductor_P");
        model.component("comp1").geom("geom1").feature("pi14").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi14").setEntry("selkeepobj", "pi14_csel2", "on");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("selkeepdom", "pi14_csel2.dom", "on");
        model.component("comp1").geom("geom1").feature("pi14").setEntry("selkeeppnt", "pi14_csel3.pnt", "on");

        //// IMTHERA
        // INNER CUFF
        model.component("comp1").geom("geom1").create("pi6", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi6").label("ImThera Inner Cuff");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "N_holes", "N_holes_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "Theta", "Theta_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "Center", "Center_IT");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "R_out", "R_out_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "Rot_def", "Rot_def_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "D_hole", "D_hole_ITI");
        model.component("comp1").geom("geom1").feature("pi6").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_ITI");
        model.component("comp1").geom("geom1").feature("pi6")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_ITI");
        model.component("comp1").geom("geom1").feature("pi6")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_ITI");
        model.component("comp1").geom("geom1").feature("pi6").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi6").setEntry("selkeepdom", "pi6_csel3.dom", "on");

        // FURL
        model.component("comp1").geom("geom1").create("pi7", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi7").label("ImThera Furl Cuff");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "N_holes", "N_holes_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "Theta", "Theta_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "Center", "Center_IT");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "R_in", "R_in_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "R_out", "R_out_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "Rot_def", "Rot_def_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "D_hole", "D_hole_ITF");
        model.component("comp1").geom("geom1").feature("pi7").setEntry("inputexpr", "Buffer_hole", "Buffer_hole_ITF");
        model.component("comp1").geom("geom1").feature("pi7")
                .setEntry("inputexpr", "L_holecenter_cuffseam", "L_holecenter_cuffseam_ITF");
        model.component("comp1").geom("geom1").feature("pi7")
                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "Pitch_holecenter_holecenter_ITF");
        model.component("comp1").geom("geom1").feature("pi7").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi7").setEntry("selkeepdom", "pi7_csel3.dom", "on");

        // CONTACT 1
        model.component("comp1").geom("geom1").create("pi15", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi15").label("ImThera Contact 1");
        model.component("comp1").geom("geom1").feature("pi15").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi15")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC");
        model.component("comp1").geom("geom1").feature("pi15")
                .setEntry("inputexpr", "Center", "Center_IT-length_contactcenter_contactcenter_ITC");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi15")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi15")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi15").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepobj", "pi15_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepobj", "pi15_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepobj", "pi15_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepdom", "pi15_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepdom", "pi15_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepdom", "pi15_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepdom", "pi15_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepdom", "pi15_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepbnd", "pi15_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepbnd", "pi15_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepbnd", "pi15_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepedg", "pi15_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepedg", "pi15_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeepedg", "pi15_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeeppnt", "pi15_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi15").setEntry("selkeeppnt", "pi15_csel13.pnt", "off");

        // CONTACT 2
        model.component("comp1").geom("geom1").create("pi16", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi16").label("ImThera Contact 2");
        model.component("comp1").geom("geom1").feature("pi16").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi16")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC+ang_contactcenter_contactcenter_ITC [deg]");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "Center", "Center_IT");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi16")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi16")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi16").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepobj", "pi16_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepobj", "pi16_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepobj", "pi16_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepdom", "pi16_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepdom", "pi16_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepdom", "pi16_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepdom", "pi16_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepdom", "pi16_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepbnd", "pi16_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepbnd", "pi16_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepbnd", "pi16_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepedg", "pi16_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepedg", "pi16_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeepedg", "pi16_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeeppnt", "pi16_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi16").setEntry("selkeeppnt", "pi16_csel13.pnt", "off");

        // CONTACT 3
        model.component("comp1").geom("geom1").create("pi17", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi17").label("ImThera Contact 3");
        model.component("comp1").geom("geom1").feature("pi17").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi17")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC+2*ang_contactcenter_contactcenter_ITC [deg]");
        model.component("comp1").geom("geom1").feature("pi17")
                .setEntry("inputexpr", "Center", "Center_IT+length_contactcenter_contactcenter_ITC");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi17")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi17")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi17").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepobj", "pi17_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepobj", "pi17_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepobj", "pi17_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepdom", "pi17_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepdom", "pi17_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepdom", "pi17_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepdom", "pi17_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepdom", "pi17_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepbnd", "pi17_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepbnd", "pi17_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepbnd", "pi17_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepedg", "pi17_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepedg", "pi17_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeepedg", "pi17_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeeppnt", "pi17_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi17").setEntry("selkeeppnt", "pi17_csel13.pnt", "off");

        // CONTACT 4
        model.component("comp1").geom("geom1").create("pi18", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi18").label("ImThera Contact 4");
        model.component("comp1").geom("geom1").feature("pi18").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi18")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC+3*ang_contactcenter_contactcenter_ITC [deg]");
        model.component("comp1").geom("geom1").feature("pi18")
                .setEntry("inputexpr", "Center", "Center_IT-length_contactcenter_contactcenter_ITC");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi18")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi18")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi18").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepobj", "pi18_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepobj", "pi18_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepobj", "pi18_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepdom", "pi18_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepdom", "pi18_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepdom", "pi18_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepdom", "pi18_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepdom", "pi18_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepbnd", "pi18_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepbnd", "pi18_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepbnd", "pi18_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepedg", "pi18_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepedg", "pi18_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeepedg", "pi18_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeeppnt", "pi18_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi18").setEntry("selkeeppnt", "pi18_csel13.pnt", "off");

        // CONTACT 5
        model.component("comp1").geom("geom1").create("pi19", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi19").label("ImThera Contact 5");
        model.component("comp1").geom("geom1").feature("pi19").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi19")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC+4*ang_contactcenter_contactcenter_ITC [deg]");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "Center", "Center_IT");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi19")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi19")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi19").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepobj", "pi19_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepobj", "pi19_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepobj", "pi19_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepdom", "pi19_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepdom", "pi19_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepdom", "pi19_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepdom", "pi19_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepdom", "pi19_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepbnd", "pi19_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepbnd", "pi19_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepbnd", "pi19_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepedg", "pi19_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepedg", "pi19_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeepedg", "pi19_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeeppnt", "pi19_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi19").setEntry("selkeeppnt", "pi19_csel13.pnt", "off");

        // CONTACT 6
        model.component("comp1").geom("geom1").create("pi20", "PartInstance");
        model.component("comp1").geom("geom1").feature("pi20").label("ImThera Contact 6");
        model.component("comp1").geom("geom1").feature("pi20").set("part", "part4");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "Recess", "Recess_ITC");
        model.component("comp1").geom("geom1").feature("pi20")
                .setEntry("inputexpr", "Rotation_angle", "ang_cuffseam_contactcenter_ITC+5*ang_contactcenter_contactcenter_ITC [deg]");
        model.component("comp1").geom("geom1").feature("pi20")
                .setEntry("inputexpr", "Center", "Center_IT+length_contactcenter_contactcenter_ITC");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "Round_def", "Round_def_ITC");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "R_in", "R_in_ITI");
        model.component("comp1").geom("geom1").feature("pi20")
                .setEntry("inputexpr", "Contact_depth", "Contact_depth_ITC");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "Overshoot", "Overshoot_ITC");
        model.component("comp1").geom("geom1").feature("pi20")
                .setEntry("inputexpr", "A_ellipse_contact", "a_ellipse_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "Diam_contact", "diam_contact_ITC");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("inputexpr", "L", "L_IT");
        model.component("comp1").geom("geom1").feature("pi20").set("selkeepnoncontr", false);
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepobj", "pi20_csel12", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepobj", "pi20_csel13", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepobj", "pi20_csel14", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepdom", "pi20_ballsel1", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepdom", "pi20_ballsel2", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepdom", "pi20_csel7.dom", "on");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepdom", "pi20_csel12.dom", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepdom", "pi20_csel14.dom", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepbnd", "pi20_csel12.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepbnd", "pi20_csel13.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepbnd", "pi20_csel14.bnd", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepedg", "pi20_csel12.edg", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepedg", "pi20_csel13.edg", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeepedg", "pi20_csel14.edg", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeeppnt", "pi20_csel12.pnt", "off");
        model.component("comp1").geom("geom1").feature("pi20").setEntry("selkeeppnt", "pi20_csel13.pnt", "off");

////        model.component("comp1").geom("geom1").create("pi5", "PartInstance");
////        model.component("comp1").geom("geom1").feature("pi5").label("Pitt (WIP)");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "N_holes", "1");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "Theta", "340 [deg]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "Center", "50 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "R_in", "1 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "R_out", "2 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "L", "5 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "Rot_def", "0 [deg]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "D_hole", "0.3 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "Buffer_hole", "0.1 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").setEntry("inputexpr", "L_holecenter_cuffseam", "0.3 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5")
////                .setEntry("inputexpr", "Pitch_holecenter_holecenter", "0 [mm]");
////        model.component("comp1").geom("geom1").feature("pi5").set("selkeepnoncontr", false);

        model.component("comp1").geom("geom1").run();
        model.component("comp1").geom("geom1").run("fin");

        return model;
    }

    public static Model defineMaterialLinks(Model model) {

        model.material().create("mat3", "Common", "");
        model.material("mat3").label("Silicone");
        model.component("comp1").material().create("matlnk4", "Link");
        model.component("comp1").material("matlnk4").label("Enteromedics Cuff is Silicone");
        model.component("comp1").material("matlnk4").set("link", "mat3");
        model.component("comp1").material("matlnk4").selection().named("geom1_pi8_csel3_dom");

        model.component("comp1").material().create("matlnk6", "Link");
        model.component("comp1").material("matlnk6").label("Madison Cuff is Silicone");
        model.component("comp1").material("matlnk6").set("link", "mat3");
        model.component("comp1").material("matlnk6").selection().named("geom1_pi2_csel3_dom");

        model.component("comp1").material().create("matlnk8", "Link");
        model.component("comp1").material("matlnk8").label("CorTec Cuff is Silicone");
        model.component("comp1").material("matlnk8").set("link", "mat3");
        model.component("comp1").material("matlnk8").selection().named("geom1_pi3_csel3_dom");

        model.component("comp1").material().create("matlnk3", "Link");
        model.component("comp1").material("matlnk3").label("Purdue Cuff is Silicone");
        model.component("comp1").material("matlnk3").set("link", "mat3");
        model.component("comp1").material("matlnk3").selection().named("geom1_pi4_csel3_dom");

        model.component("comp1").material().create("matlnk11", "Link");
        model.component("comp1").material("matlnk11").label("ImThera Inner Cuff is Silicone");
        model.component("comp1").material("matlnk11").set("link", "mat3");
        model.component("comp1").material("matlnk11").selection().named("geom1_pi6_csel3_dom");

        model.component("comp1").material().create("matlnk12", "Link");
        model.component("comp1").material("matlnk12").label("ImThera Furl is Silicone");
        model.component("comp1").material("matlnk12").set("link", "mat3");
        model.component("comp1").material("matlnk12").selection().named("geom1_pi7_csel3_dom");

        // PLATINUM
        model.material().create("mat2", "Common", "");
        model.material("mat2").label("Platinum");
        model.component("comp1").material().create("matlnk5", "Link");
        model.component("comp1").material("matlnk5").label("Enteromedics Contact 1 is Platinum");
        model.component("comp1").material("matlnk5").set("link", "mat2");
        model.component("comp1").material("matlnk5").selection().named("geom1_pi9_csel4_dom");

        model.component("comp1").material().create("matlnk7", "Link");
        model.component("comp1").material("matlnk7").label("Madison Contact 1 is Platinum");
        model.component("comp1").material("matlnk7").set("link", "mat2");
        model.component("comp1").material("matlnk7").selection().named("geom1_pi10_csel4_dom");

        model.component("comp1").material().create("matlnk9", "Link");
        model.component("comp1").material("matlnk9").label("CorTec Contact 1 is Platinum");
        model.component("comp1").material("matlnk9").set("link", "mat2");
        model.component("comp1").material("matlnk9").selection().named("geom1_pi11_csel4_dom");

        model.component("comp1").material().create("matlnk10", "Link");
        model.component("comp1").material("matlnk10").label("CorTec Contact 2 is Platinum");
        model.component("comp1").material("matlnk10").set("link", "mat2");
        model.component("comp1").material("matlnk10").selection().named("geom1_pi12_csel4_dom");

        model.component("comp1").material().create("matlnk1", "Link");
        model.component("comp1").material("matlnk1").label("Purdue Contact 1 is Platinum");
        model.component("comp1").material("matlnk1").set("link", "mat2");
        model.component("comp1").material("matlnk1").selection().named("geom1_pi13_csel2_dom");

        model.component("comp1").material().create("matlnk2", "Link");
        model.component("comp1").material("matlnk2").label("Purdue Contact 2 is Platinum");
        model.component("comp1").material("matlnk2").set("link", "mat2");
        model.component("comp1").material("matlnk2").selection().named("geom1_pi14_csel2_dom");

        model.component("comp1").material().create("matlnk14", "Link");
        model.component("comp1").material("matlnk14").label("ImThera Contact 1 is Platinum");
        model.component("comp1").material("matlnk14").set("link", "mat2");
        model.component("comp1").material("matlnk14").selection().named("geom1_pi15_csel13_dom");

        model.component("comp1").material().create("matlnk15", "Link");
        model.component("comp1").material("matlnk15").label("ImThera Contact 2 is Platinum");
        model.component("comp1").material("matlnk15").set("link", "mat2");
        model.component("comp1").material("matlnk15").selection().named("geom1_pi16_csel13_dom");

        model.component("comp1").material().create("matlnk16", "Link");
        model.component("comp1").material("matlnk16").label("ImThera Contact 3 is Platinum");
        model.component("comp1").material("matlnk16").set("link", "mat2");
        model.component("comp1").material("matlnk16").selection().named("geom1_pi17_csel13_dom");

        model.component("comp1").material().create("matlnk17", "Link");
        model.component("comp1").material("matlnk17").label("ImThera Contact 4 is Platinum");
        model.component("comp1").material("matlnk17").set("link", "mat2");
        model.component("comp1").material("matlnk17").selection().named("geom1_pi18_csel13_dom");

        model.component("comp1").material().create("matlnk18", "Link");
        model.component("comp1").material("matlnk18").label("ImThera Contact 5 is Platinum");
        model.component("comp1").material("matlnk18").set("link", "mat2");
        model.component("comp1").material("matlnk18").selection().named("geom1_pi19_csel13_dom");

        model.component("comp1").material().create("matlnk19", "Link");
        model.component("comp1").material("matlnk19").label("ImThera Contact 6 is Platinum");
        model.component("comp1").material("matlnk19").set("link", "mat2");
        model.component("comp1").material("matlnk19").selection().named("geom1_pi20_csel13_dom");

        // SALINE
        model.material().create("mat1", "Common", "");
        model.material("mat1").label("Saline");
        model.material("mat1").propertyGroup("def")
                .set("electricconductivity", new String[]{"1.76", "0", "0", "0", "1.76", "0", "0", "0", "1.76"});

        model.component("comp1").material().create("matlnk20", "Link");
        model.component("comp1").material("matlnk20").label("ImThera Recess 1 is Saline");
        model.component("comp1").material("matlnk20").set("link", "mat1");
        model.component("comp1").material("matlnk20").selection().named("geom1_pi15_csel7_dom");

        model.component("comp1").material().create("matlnk21", "Link");
        model.component("comp1").material("matlnk21").label("ImThera Recess 2 is Saline");
        model.component("comp1").material("matlnk21").set("link", "mat1");
        model.component("comp1").material("matlnk21").selection().named("geom1_pi16_csel7_dom");

        model.component("comp1").material().create("matlnk22", "Link");
        model.component("comp1").material("matlnk22").label("ImThera Recess 3 is Saline");
        model.component("comp1").material("matlnk22").set("link", "mat1");
        model.component("comp1").material("matlnk22").selection().named("geom1_pi17_csel7_dom");

        model.component("comp1").material().create("matlnk23", "Link");
        model.component("comp1").material("matlnk23").label("ImThera Recess 4 is Saline");
        model.component("comp1").material("matlnk23").set("link", "mat1");
        model.component("comp1").material("matlnk23").selection().named("geom1_pi18_csel7_dom");

        model.component("comp1").material().create("matlnk24", "Link");
        model.component("comp1").material("matlnk24").label("ImThera Recess 5 is Saline");
        model.component("comp1").material("matlnk24").set("link", "mat1");
        model.component("comp1").material("matlnk24").selection().named("geom1_pi19_csel7_dom");

        model.component("comp1").material().create("matlnk25", "Link");
        model.component("comp1").material("matlnk25").label("ImThera Recess 6 is Saline");
        model.component("comp1").material("matlnk25").set("link", "mat1");
        model.component("comp1").material("matlnk25").selection().named("geom1_pi20_csel7_dom");

        // SCAR
        model.material().create("mat4", "Common", "");
        model.material("mat4").label("Scar");

        return model;
    }

    public static Model defineCurrentSources(Model model) {
        model.component("comp1").physics().create("ec", "ConductiveMedia", "geom1");

        model.component("comp1").physics("ec").create("pcs3", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs3").selection().named("geom1_pi9_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs3").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs3").label("Enteromedics Point Current Source 1");

        model.component("comp1").physics("ec").create("pcs4", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs4").selection().named("geom1_pi10_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs4").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs4").label("Madison Point Current Source 1");

        model.component("comp1").physics("ec").create("pcs5", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs5").selection().named("geom1_pi11_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs5").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs5").label("CorTec Point Current Source 1");

        model.component("comp1").physics("ec").create("pcs6", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs6").selection().named("geom1_pi12_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs6").set("Qjp", -0.001);
        model.component("comp1").physics("ec").feature("pcs6").label("CorTec Point Current Source 2");

        model.component("comp1").physics("ec").create("pcs1", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs1").selection().named("geom1_pi13_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs1").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs1").label("Purdue Point Current Source 1");

        model.component("comp1").physics("ec").create("pcs2", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs2").selection().named("geom1_pi14_csel3_pnt");
        model.component("comp1").physics("ec").feature("pcs2").set("Qjp", -0.001);
        model.component("comp1").physics("ec").feature("pcs2").label("Purdue Point Current Source 2");

        model.component("comp1").physics("ec").create("pcs7", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs7").selection().named("geom1_pi15_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs7").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs7").label("ImThera Point Current Source 1");

        model.component("comp1").physics("ec").create("pcs8", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs8").selection().named("geom1_pi16_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs8").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs8").label("ImThera Point Current Source 2");

        model.component("comp1").physics("ec").create("pcs9", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs9").selection().named("geom1_pi17_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs9").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs9").label("ImThera Point Current Source 3");

        model.component("comp1").physics("ec").create("pcs10", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs10").selection().named("geom1_pi18_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs10").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs10").label("ImThera Point Current Source 4");

        model.component("comp1").physics("ec").create("pcs11", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs11").selection().named("geom1_pi19_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs11").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs11").label("ImThera Point Current Source 5");

        model.component("comp1").physics("ec").create("pcs12", "PointCurrentSource", 0);
        model.component("comp1").physics("ec").feature("pcs12").selection().named("geom1_pi20_csel14_pnt");
        model.component("comp1").physics("ec").feature("pcs12").set("Qjp", 0.001);
        model.component("comp1").physics("ec").feature("pcs12").label("ImThera Point Current Source 6");

        model.study().create("std1");
        model.study("std1").create("stat", "Stationary");
        return model;
    }

    public static void main(String[] args) {
        Model model = definePartInstanceParameters();
        model = defineDefaultPrimitiveInputParameters(model);
        model = definePrimitiveSelections(model);
        model = definePrimitivePartOperations(model);
        model = makePartInstances(model);
        model = defineMaterialLinks(model);
        defineCurrentSources(model);
    }

}




//    ComsolIdentifierManager cim = new ComsolIdentifierManager();
//    String[] files = {"CorTec.json", "Enteromedics.json", "ImThera.json", "Madison.json", "Purdue.json"};
//
//    for (String file: files) {
//      String par = cim.next("par");
//
//      JSONObject data = new JSONReader("../../.templates/" + file).getData();
//
//      for (Object item: (JSONArray) data.get("data")) {
//        JSONObject itemObject = (JSONObject) item;
//        model.param(par).set(
//                (String) itemObject.get("name"),
//                (String) itemObject.get("expression"),
//                (String) itemObject.get("description")
//        );
//      }
//    }
