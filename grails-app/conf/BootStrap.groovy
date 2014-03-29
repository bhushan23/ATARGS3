import atargs3.Admin

import atargs3.AdminSettings
import atargs3.AdminSettingsController
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
		
		}
    def destroy = {
    }

}
