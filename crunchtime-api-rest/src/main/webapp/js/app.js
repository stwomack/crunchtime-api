(function() {
	var app = angular.module('crunchtime', []);
	
	app.controller('CrunchtimeController', function() {
		this.meeting = fakeMeeting;
	});

	var fakeMeeting = {
		topic: 'Crunch this motherfucker out!',
		boogers: "Yeah, boogers"
	}
})();