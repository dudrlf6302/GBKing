$(document).ready(function(){

	// helpful classes
	$('ul li:first-child').addClass('first');
	$('ul li:last-child, ol li:last-child, .breadcrumbs:last, tr:last-child').addClass('last');
	$('tr:even').addClass('even');
	$('tr:odd').addClass('odd');

	// add non semantic markup for fancy background images
	$('body#home div.wrapper.scr').wrap('<div class="ornament_2" />');
	$('div.ornament_2, body:not(#home) footer').wrap('<div class="ornament_1" />');
	$('body:not(#home) div.ornament_1').addClass('foot');
	$('div.ornament_1 #copyright').before('<div id="footer-patch"></div>');

	// product scroller
	$('#scrollers ul').quickScroll();
	
	//labelsInInputs
	$('input[type=text], textarea').labelsInInputs({color: '#54301A', blur_color: '#D8CFC6', left: '36px'});

	// animate those cute validation bubbles	
	$('form p small').hide().delay(500).slideDown();

	$('.vcard').after('<a href="'+SROOTPATH+'contact/" style="display:block;width:500px;height:320px;position:absolute;top:0px;left:445px;"><!-- omgwtfbbq! --></a>')

	//user feedback messages
	$('div.success, div.info, div.warning').hide().fadeIn(1000);

	$('p#koodoz span').remove();
	$('p#koodoz').html($('p#koodoz').text()).wrapInner('<a href="http://www.koodoz.com.au" target="_blank" />');
	
	$('a[rel*=external]').attr('target','_blank');
	
	// Apply fancybox to multiple items
	$("a.m").fancybox({ 'width' : 600, 'height' : 600, 'titleShow' : false, 'overlayColor' : '#4B4335', 'overlayOpacity' : 0.87 });

	//remove the border from the previous sibling of a selected nav sidebar item
	$('#sidenav li a.active').parent('li').prev().children('a').css({'background':'none'});
	
	var ollicount=1;
	$('#main ol li').each(function() { $(this).prepend(ollicount); ollicount++; });

	adjustFooter();

	if($('body').attr('id') == 'home') {

		// This code reads from a json page full of data and crossfades the content on the homepage
		
		$.ajax({
			url: SROOTPATH + 'fader.php',
			dataType: 'json',
			success: function(data) {

				$.each(data, function(i,item) {
					var htmlz = '<h3>' + item.name + '</h3><p class="intro">'+item.description+' <a class="NanumPen" href="'+SROOTPATH+'products/'+item.slug+'/">View our range! <span>&#62;</span></a></p>';
					var bg = 'url(' + SROOTPATH + 'images/' + item.image + ')';
					$('div.wrapper.content').prepend('<div class="hilite-extra" style="background-image: '+bg+';display:none;">'+htmlz+'</div>');
				});
				rotateFrontHilites(1);
			}
		});
		
		/*$.getJSON(, function(data) {
			$.each(data, function(i,item) {
				var htmlz = '<h3>' + item.name + '</h3><p class="intro">'+item.description+' <a class="NanumPen" href="'+SROOTPATH+'products/'+item.slug+'/">View our range! <span>&#62;</span></a></p>';
				var bg = 'url(' + SROOTPATH + 'images/' + item.image + ')';
				$('<section class="hilite-extra" />').prependTo($('div.wrapper.content')).html(htmlz).css({'background-image' : bg}).hide();
	
			});
			//rotateFrontHilites(1);
		});
	}*/

	}


	if($('body').attr('id') == 'contact') {
		$('#map').before('<p id="expand"><span>Expand</span></p>');
		initialise_map();
	
		$('#expand').toggle(function() {
			$('#map').animate({height:'500px'}, 'slow', function() {
				initialise_map();
				$('#expand span').text('Contract').addClass('col');
			});
			
		}, function () {
			$('#map').animate({height:'250px'}, 'slow', function() {
				initialise_map();
				$('#expand span').text('Expand').removeClass('col');
			});
		});
	
	};
	

});




$(window).resize(function() {
	adjustFooter();
});