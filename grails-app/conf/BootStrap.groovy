import atargs3.Admin

import atargs3.AdminSettings
import atargs3.AdminSettingsController
import atargs3.ScanInformation
class BootStrap {

     def init = { servletContext ->
		def adminrole= Admin.findByUsername('admin') ?: new Admin(username:'admin',password:'admin').save();
		def adminsettingrolecs= AdminSettings.findByEntry('centerStartTime') ?:new AdminSettings(entry:'centerStartTime', value:'07:00').save();
		def adminsettingrolece= AdminSettings.findByEntry('centerEndTime') ?: new AdminSettings(entry:'centerEndTime', value:'19:00').save();
		def adminsettingrolemri= AdminSettings.findByEntry('mriInterval') ?: new AdminSettings(entry:'mriInterval', value:'60').save();
		def adminsettingrolect= AdminSettings.findByEntry('ctInterval') ?: new AdminSettings(entry:'ctInterval', value:'30').save();
		def adminsettingrolesmsfacility= AdminSettings.findByEntry('smsfacility') ?: new AdminSettings(entry:'smsfacility', value:'Yes').save();
		def adminsettingrolesmsu= AdminSettings.findByEntry('smsUser') ?: new AdminSettings(entry:'smsUser', value:'abcd1').save();
		def adminsettingrolesmsp= AdminSettings.findByEntry('smsPass') ?: new AdminSettings(entry:'smsPass', value:'662239').save();
		def adminsettingroleconfirmmsg= AdminSettings.findByEntry('confirmmsg') ?: new AdminSettings(entry:'confirmmsg', value:'Please come 15 minutes before appointment').save();
		def adminsettingrolesmscode= AdminSettings.findByEntry('smscode') ?: new AdminSettings(entry:'smscode', value:'ATARG').save();
		def usesmsservice= AdminSettings.findByEntry('usesmsservice') ?: new AdminSettings(entry:'usesmsservice', value:'true').save();
		def useemailservice= AdminSettings.findByEntry('useemailservice') ?: new AdminSettings(entry:'useemailservice', value:'true').save();
	AdminSettingsController.smsservice=true;
	AdminSettingsController.emailservice=true;
		AdminSettingsController.confirmedsms="Please Come 15 mins before appointment";
	AdminSettingsController.smscode="ATARG";
		
	
	def scaninfoAbdomen=ScanInformation.findByInfo('Abdomen/Pelvis') ?:new ScanInformation(info:'Abdomen/Pelvis').save();
	def scaninfoAngiogram=ScanInformation.findByInfo('Angiogram') ?:new ScanInformation(info:'Angiogram').save();
	def scaninfoBrain=ScanInformation.findByInfo('Brain') ?:new ScanInformation(info:'Brain').save();
	def scaninfoChest=ScanInformation.findByInfo('Chest') ?:new ScanInformation(info:'Chest').save();
	def scaninfoJoints=ScanInformation.findByInfo('Joints') ?:new ScanInformation(info:'Joints').save();
	def scaninfoNeck=ScanInformation.findByInfo('Neck') ?:new ScanInformation(info:'Neck').save();
	def scaninfoOrbits=ScanInformation.findByInfo('Orbits') ?:new ScanInformation(info:'Orbits').save();
	def scaninfoSpine=ScanInformation.findByInfo('Spine') ?:new ScanInformation(info:'Spine').save();
	def scaninfoOthers=ScanInformation.findByInfo('Others') ?:new ScanInformation(info:'Others').save();
	def scaninfoGadolinium=ScanInformation.findByInfo('Allergic reaction to CT contrast (Gadolinium based)') ?:new ScanInformation(info:'Allergic reaction to CT contrast (Gadolinium based)').save();
	def scaninfoClaustrophobia=ScanInformation.findByInfo('Claustrophobia') ?:new ScanInformation(info:'Claustrophobia').save();
	def scaninfoDiabetes=ScanInformation.findByInfo('Diabetes') ?:new ScanInformation(info:'Diabetes').save();
	def scaninfoDrug=ScanInformation.findByInfo('Drug Allergy') ?:new ScanInformation(info:'Drug Allergy').save();
	def scaninfoKidney=ScanInformation.findByInfo('Kidney Disease') ?:new ScanInformation(info:'Kidney Disease').save();
	def scaninfoLiver=ScanInformation.findByInfo('Liver Disease') ?:new ScanInformation(info:'Liver Disease').save();
	def scaninfoLatex=ScanInformation.findByInfo('Latex Allergy') ?:new ScanInformation(info:'Latex Allergy').save();
	def scaninfoPacemaker=ScanInformation.findByInfo('Cardiac pacemaker or implanted cardioverter defibrillator/ICD') ?:new ScanInformation(info:'Cardiac pacemaker or implanted cardioverter defibrillator/ICD').save();
	
	
	
	def scaninfoImplantedDrugPump=ScanInformation.findByInfo('Implanted drug pump (for chemotherapy medicine, pain medicine)') ?:new ScanInformation(info:'Implanted drug pump (for chemotherapy medicine, pain medicine)').save();
	def scaninfoExternalDrugPump=ScanInformation.findByInfo('External drug pump (for Insulin or other medicine)') ?:new ScanInformation(info:'External drug pump (for Insulin or other medicine)').save();
	
	def scaninfoArtificialJoint=ScanInformation.findByInfo('Artificial joint and /or limb') ?:new ScanInformation(info:'Artificial joint and /or limb').save();
	def scaninfoArtificialEye=ScanInformation.findByInfo('Artificial eye and/or eyelid spring') ?:new ScanInformation(info:'Artificial eye and/or eyelid spring').save();
	def scaninfoEyeInjury=ScanInformation.findByInfo('Eye injury from a metal object (metal shavings, metal slivers)') ?:new ScanInformation(info:'Eye injury from a metal object (metal shavings, metal slivers)').save();
	def scaninfoEarImplant=ScanInformation.findByInfo('Ear (Cochlear) implant, middle ear implant') ?:new ScanInformation(info:'Ear (Cochlear) implant, middle ear implant').save();
	def scaninfoHearingAid=ScanInformation.findByInfo('Hearing aid(s)') ?:new ScanInformation(info:'Hearing aid(s)').save();
	def scaninfoFalseTeeth=ScanInformation.findByInfo('False teeth/dentures, metallic removable dental work, braces, retainers') ?:new ScanInformation(info:'False teeth/dentures, metallic removable dental work, braces, retainers').save();
	
	def scaninfoInjury=ScanInformation.findByInfo('Injured by a metal object (shrapnel, bullet, BB) and required medical attention') ?:new ScanInformation(info:'Injured by a metal object (shrapnel, bullet, BB) and required medical attention').save();
	
	def scaninfoPiercing=ScanInformation.findByInfo('Body piercing, tattoo or permanent makeup') ?:new ScanInformation(info:'Body piercing, tattoo or permanent makeup').save();
	def scaninfoWig=ScanInformation.findByInfo('Wig, hair implants') ?:new ScanInformation(info:'Wig, hair implants').save();
		}
    def destroy = {
    }

}
