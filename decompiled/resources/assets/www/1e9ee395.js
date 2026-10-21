import{v as e,x as t,f as a,H as r,I as n,R as o,S as i,u as l,T as s,A as c,V as d,E as m,z as u,w as f,W as h,F as b,aB as p,D as g,O as v,G as y,P as _}from"./216055dc.js";import{z as D,a8 as k,ac as w,ab as x,ad as S,bm as M,bn as $,an as C,L as E,bx as T,ak as F,e9 as A,h as P,aN as I,bA as Y,ea as L,av as O,aV as N,bF as R,aD as H,ah as j,ct as B,bb as z,e1 as V,aM as W,cl as U,i as q}from"./952f98a9.js";import"./7f3d7ca9.js";!function(e,t){"object"==typeof exports&&"undefined"!=typeof module?module.exports=t():"function"==typeof define&&define.amd?define(t):(e=e||self).flatpickr=t()}(void 0,(function(){var e=function(){return e=Object.assign||function(e){for(var t,a=1,r=arguments.length;a<r;a++)for(var n in t=arguments[a])Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n]);return e},e.apply(this,arguments)};function t(){for(var e=0,t=0,a=arguments.length;t<a;t++)e+=arguments[t].length;var r=Array(e),n=0;for(t=0;t<a;t++)for(var o=arguments[t],i=0,l=o.length;i<l;i++,n++)r[n]=o[i];return r}var a=["onChange","onClose","onDayCreate","onDestroy","onKeyDown","onMonthChange","onOpen","onParseConfig","onReady","onValueUpdate","onYearChange","onPreCalendarPosition"],r={_disable:[],_enable:[],allowInput:!1,altFormat:"F j, Y",altInput:!1,altInputClass:"form-control input",animate:"object"==typeof window&&-1===window.navigator.userAgent.indexOf("MSIE"),ariaDateFormat:"F j, Y",clickOpens:!0,closeOnSelect:!0,conjunction:", ",dateFormat:"Y-m-d",defaultHour:12,defaultMinute:0,defaultSeconds:0,disable:[],disableMobile:!1,enable:[],enableSeconds:!1,enableTime:!1,errorHandler:function(e){return"undefined"!=typeof console&&console.warn(e)},getWeek:function(e){var t=new Date(e.getTime());t.setHours(0,0,0,0),t.setDate(t.getDate()+3-(t.getDay()+6)%7);var a=new Date(t.getFullYear(),0,4);return 1+Math.round(((t.getTime()-a.getTime())/864e5-3+(a.getDay()+6)%7)/7)},hideNextMonthDays:!1,hidePrevMonthDays:!1,hourIncrement:1,ignoredFocusElements:[],inline:!1,locale:"default",minuteIncrement:5,mode:"single",monthSelectorType:"dropdown",nextArrow:"<svg version='1.1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' viewBox='0 0 17 17'><g></g><path d='M13.207 8.472l-7.854 7.854-0.707-0.707 7.146-7.146-7.146-7.148 0.707-0.707 7.854 7.854z' /></svg>",noCalendar:!1,now:new Date,onChange:[],onClose:[],onDayCreate:[],onDestroy:[],onKeyDown:[],onMonthChange:[],onOpen:[],onParseConfig:[],onReady:[],onValueUpdate:[],onYearChange:[],onPreCalendarPosition:[],plugins:[],position:"auto",positionElement:void 0,prevArrow:"<svg version='1.1' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' viewBox='0 0 17 17'><g></g><path d='M5.207 8.471l7.146 7.147-0.707 0.707-7.853-7.854 7.854-7.853 0.707 0.707-7.147 7.146z' /></svg>",shorthandCurrentMonth:!1,showMonths:1,static:!1,time_24hr:!1,weekNumbers:!1,wrap:!1,yearSelectorType:"input"},n={weekdays:{shorthand:["Sun","Mon","Tue","Wed","Thu","Fri","Sat"],longhand:["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]},months:{shorthand:["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"],longhand:["January","February","March","April","May","June","July","August","September","October","November","December"]},daysInMonth:[31,28,31,30,31,30,31,31,30,31,30,31],firstDayOfWeek:0,ordinal:function(e){var t=e%100;if(t>3&&t<21)return"th";switch(t%10){case 1:return"st";case 2:return"nd";case 3:return"rd";default:return"th"}},rangeSeparator:" to ",weekAbbreviation:"Wk",scrollTitle:"Scroll to increment",toggleTitle:"Click to toggle",amPM:["AM","PM"],yearAriaLabel:"Year",hourAriaLabel:"Hour",minuteAriaLabel:"Minute",time_24hr:!1},o=function(e){return("0"+e).slice(-2)},i=function(e){return!0===e?1:0};function l(e,t,a){var r;return void 0===a&&(a=!1),function(){var n=this,o=arguments;null!==r&&clearTimeout(r),r=window.setTimeout((function(){r=null,a||e.apply(n,o)}),t),a&&!r&&e.apply(n,o)}}var s=function(e){return e instanceof Array?e:[e]};function c(e,t,a){if(!0===a)return e.classList.add(t);e.classList.remove(t)}function d(e,t,a){var r=window.document.createElement(e);return t=t||"",a=a||"",r.className=t,void 0!==a&&(r.textContent=a),r}function m(e){for(;e.firstChild;)e.removeChild(e.firstChild)}function u(e,t){return t(e)?e:e.parentNode?u(e.parentNode,t):void 0}function f(e,t){var a=d("div","numInputWrapper"),r=d("input","numInput "+e),n=d("span","arrowUp"),o=d("span","arrowDown");if(-1===navigator.userAgent.indexOf("MSIE 9.0")?r.type="number":(r.type="text",r.pattern="\\d*"),void 0!==t)for(var i in t)r.setAttribute(i,t[i]);return a.appendChild(r),a.appendChild(n),a.appendChild(o),a}function h(e){return"function"==typeof e.composedPath?e.composedPath()[0]:e.target}var b=function(){},p=function(e,t,a){return a.months[t?"shorthand":"longhand"][e]},g={D:b,F:function(e,t,a){e.setMonth(a.months.longhand.indexOf(t))},G:function(e,t){e.setHours(parseFloat(t))},H:function(e,t){e.setHours(parseFloat(t))},J:function(e,t){e.setDate(parseFloat(t))},K:function(e,t,a){e.setHours(e.getHours()%12+12*i(new RegExp(a.amPM[1],"i").test(t)))},M:function(e,t,a){e.setMonth(a.months.shorthand.indexOf(t))},S:function(e,t){e.setSeconds(parseFloat(t))},U:function(e,t){return new Date(1e3*parseFloat(t))},W:function(e,t,a){var r=parseInt(t),n=new Date(e.getFullYear(),0,2+7*(r-1),0,0,0,0);return n.setDate(n.getDate()-n.getDay()+a.firstDayOfWeek),n},Y:function(e,t){e.setFullYear(parseFloat(t))},Z:function(e,t){return new Date(t)},d:function(e,t){e.setDate(parseFloat(t))},h:function(e,t){e.setHours(parseFloat(t))},i:function(e,t){e.setMinutes(parseFloat(t))},j:function(e,t){e.setDate(parseFloat(t))},l:b,m:function(e,t){e.setMonth(parseFloat(t)-1)},n:function(e,t){e.setMonth(parseFloat(t)-1)},s:function(e,t){e.setSeconds(parseFloat(t))},u:function(e,t){return new Date(parseFloat(t))},w:b,y:function(e,t){e.setFullYear(2e3+parseFloat(t))}},v={D:"(\\w+)",F:"(\\w+)",G:"(\\d\\d|\\d)",H:"(\\d\\d|\\d)",J:"(\\d\\d|\\d)\\w+",K:"",M:"(\\w+)",S:"(\\d\\d|\\d)",U:"(.+)",W:"(\\d\\d|\\d)",Y:"(\\d{4})",Z:"(.+)",d:"(\\d\\d|\\d)",h:"(\\d\\d|\\d)",i:"(\\d\\d|\\d)",j:"(\\d\\d|\\d)",l:"(\\w+)",m:"(\\d\\d|\\d)",n:"(\\d\\d|\\d)",s:"(\\d\\d|\\d)",u:"(.+)",w:"(\\d\\d|\\d)",y:"(\\d{2})"},y={Z:function(e){return e.toISOString()},D:function(e,t,a){return t.weekdays.shorthand[y.w(e,t,a)]},F:function(e,t,a){return p(y.n(e,t,a)-1,!1,t)},G:function(e,t,a){return o(y.h(e,t,a))},H:function(e){return o(e.getHours())},J:function(e,t){return void 0!==t.ordinal?e.getDate()+t.ordinal(e.getDate()):e.getDate()},K:function(e,t){return t.amPM[i(e.getHours()>11)]},M:function(e,t){return p(e.getMonth(),!0,t)},S:function(e){return o(e.getSeconds())},U:function(e){return e.getTime()/1e3},W:function(e,t,a){return a.getWeek(e)},Y:function(e){return e.getFullYear()},d:function(e){return o(e.getDate())},h:function(e){return e.getHours()%12?e.getHours()%12:12},i:function(e){return o(e.getMinutes())},j:function(e){return e.getDate()},l:function(e,t){return t.weekdays.longhand[e.getDay()]},m:function(e){return o(e.getMonth()+1)},n:function(e){return e.getMonth()+1},s:function(e){return e.getSeconds()},u:function(e){return e.getTime()},w:function(e){return e.getDay()},y:function(e){return String(e.getFullYear()).substring(2)}},_=function(e){var t=e.config,a=void 0===t?r:t,o=e.l10n,i=void 0===o?n:o;return function(e,t,r){var n=r||i;return void 0!==a.formatDate?a.formatDate(e,t,n):t.split("").map((function(t,r,o){return y[t]&&"\\"!==o[r-1]?y[t](e,n,a):"\\"!==t?t:""})).join("")}},D=function(e){var t=e.config,a=void 0===t?r:t,o=e.l10n,i=void 0===o?n:o;return function(e,t,n,o){if(0===e||e){var l,s=o||i,c=e;if(e instanceof Date)l=new Date(e.getTime());else if("string"!=typeof e&&void 0!==e.toFixed)l=new Date(e);else if("string"==typeof e){var d=t||(a||r).dateFormat,m=String(e).trim();if("today"===m)l=new Date,n=!0;else if(/Z$/.test(m)||/GMT$/.test(m))l=new Date(e);else if(a&&a.parseDate)l=a.parseDate(e,d);else{l=a&&a.noCalendar?new Date((new Date).setHours(0,0,0,0)):new Date((new Date).getFullYear(),0,1,0,0,0,0);for(var u=void 0,f=[],h=0,b=0,p="";h<d.length;h++){var y=d[h],_="\\"===y,D="\\"===d[h-1]||_;if(v[y]&&!D){p+=v[y];var k=new RegExp(p).exec(e);k&&(u=!0)&&f["Y"!==y?"push":"unshift"]({fn:g[y],val:k[++b]})}else _||(p+=".");f.forEach((function(e){var t=e.fn,a=e.val;return l=t(l,a,s)||l}))}l=u?l:void 0}}if(l instanceof Date&&!isNaN(l.getTime()))return!0===n&&l.setHours(0,0,0,0),l;a.errorHandler(new Error("Invalid date provided: "+c))}}};function k(e,t,a){return void 0===a&&(a=!0),!1!==a?new Date(e.getTime()).setHours(0,0,0,0)-new Date(t.getTime()).setHours(0,0,0,0):e.getTime()-t.getTime()}var w=864e5;"function"!=typeof Object.assign&&(Object.assign=function(e){for(var t=[],a=1;a<arguments.length;a++)t[a-1]=arguments[a];if(!e)throw TypeError("Cannot convert undefined or null to object");for(var r=function(t){t&&Object.keys(t).forEach((function(a){return e[a]=t[a]}))},n=0,o=t;n<o.length;n++){r(o[n])}return e});function x(b,g){var y={config:e(e({},r),M.defaultConfig),l10n:n};function x(e){return e.bind(y)}function S(){var e=y.config;!1===e.weekNumbers&&1===e.showMonths||!0!==e.noCalendar&&window.requestAnimationFrame((function(){if(void 0!==y.calendarContainer&&(y.calendarContainer.style.visibility="hidden",y.calendarContainer.style.display="block"),void 0!==y.daysContainer){var t=(y.days.offsetWidth+1)*e.showMonths;y.daysContainer.style.width=t+"px",y.calendarContainer.style.width=t+(void 0!==y.weekWrapper?y.weekWrapper.offsetWidth:0)+"px",y.calendarContainer.style.removeProperty("visibility"),y.calendarContainer.style.removeProperty("display")}}))}function $(e){0===y.selectedDates.length&&oe(),void 0!==e&&"blur"!==e.type&&function(e){e.preventDefault();var t="keydown"===e.type,a=h(e),r=a;void 0!==y.amPM&&a===y.amPM&&(y.amPM.textContent=y.l10n.amPM[i(y.amPM.textContent===y.l10n.amPM[0])]);var n=parseFloat(r.getAttribute("min")),l=parseFloat(r.getAttribute("max")),s=parseFloat(r.getAttribute("step")),c=parseInt(r.value,10),d=e.delta||(t?38===e.which?1:-1:0),m=c+s*d;if(void 0!==r.value&&2===r.value.length){var u=r===y.hourElement,f=r===y.minuteElement;m<n?(m=l+m+i(!u)+(i(u)&&i(!y.amPM)),f&&N(void 0,-1,y.hourElement)):m>l&&(m=r===y.hourElement?m-l-i(!y.amPM):n,f&&N(void 0,1,y.hourElement)),y.amPM&&u&&(1===s?m+c===23:Math.abs(m-c)>s)&&(y.amPM.textContent=y.l10n.amPM[i(y.amPM.textContent===y.l10n.amPM[0])]),r.value=o(m)}}(e);var t=y._input.value;C(),_e(),y._input.value!==t&&y._debouncedChange()}function C(){if(void 0!==y.hourElement&&void 0!==y.minuteElement){var e,t,a=(parseInt(y.hourElement.value.slice(-2),10)||0)%24,r=(parseInt(y.minuteElement.value,10)||0)%60,n=void 0!==y.secondElement?(parseInt(y.secondElement.value,10)||0)%60:0;void 0!==y.amPM&&(e=a,t=y.amPM.textContent,a=e%12+12*i(t===y.l10n.amPM[1]));var o=void 0!==y.config.minTime||y.config.minDate&&y.minDateHasTime&&y.latestSelectedDateObj&&0===k(y.latestSelectedDateObj,y.config.minDate,!0);if(void 0!==y.config.maxTime||y.config.maxDate&&y.maxDateHasTime&&y.latestSelectedDateObj&&0===k(y.latestSelectedDateObj,y.config.maxDate,!0)){var l=void 0!==y.config.maxTime?y.config.maxTime:y.config.maxDate;(a=Math.min(a,l.getHours()))===l.getHours()&&(r=Math.min(r,l.getMinutes())),r===l.getMinutes()&&(n=Math.min(n,l.getSeconds()))}if(o){var s=void 0!==y.config.minTime?y.config.minTime:y.config.minDate;(a=Math.max(a,s.getHours()))===s.getHours()&&(r=Math.max(r,s.getMinutes())),r===s.getMinutes()&&(n=Math.max(n,s.getSeconds()))}F(a,r,n)}}function E(e){var t=e||y.latestSelectedDateObj;t&&F(t.getHours(),t.getMinutes(),t.getSeconds())}function T(){var e=y.config.defaultHour,t=y.config.defaultMinute,a=y.config.defaultSeconds;if(void 0!==y.config.minDate){var r=y.config.minDate.getHours(),n=y.config.minDate.getMinutes();(e=Math.max(e,r))===r&&(t=Math.max(n,t)),e===r&&t===n&&(a=y.config.minDate.getSeconds())}if(void 0!==y.config.maxDate){var o=y.config.maxDate.getHours(),i=y.config.maxDate.getMinutes();(e=Math.min(e,o))===o&&(t=Math.min(i,t)),e===o&&t===i&&(a=y.config.maxDate.getSeconds())}F(e,t,a)}function F(e,t,a){void 0!==y.latestSelectedDateObj&&y.latestSelectedDateObj.setHours(e%24,t,a||0,0),y.hourElement&&y.minuteElement&&!y.isMobile&&(y.hourElement.value=o(y.config.time_24hr?e:(12+e)%12+12*i(e%12==0)),y.minuteElement.value=o(t),void 0!==y.amPM&&(y.amPM.textContent=y.l10n.amPM[i(e>=12)]),void 0!==y.secondElement&&(y.secondElement.value=o(a)))}function A(e){var t=h(e),a=parseInt(t.value)+(e.delta||0);(a/1e3>1||"Enter"===e.key&&!/[^\d]/.test(a.toString()))&&Q(a)}function P(e,t,a,r){return t instanceof Array?t.forEach((function(t){return P(e,t,a,r)})):e instanceof Array?e.forEach((function(e){return P(e,t,a,r)})):(e.addEventListener(t,a,r),void y._handlers.push({element:e,event:t,handler:a,options:r}))}function I(e){return function(t){1===t.which&&e(t)}}function Y(){be("onChange")}function L(e,t){var a=void 0!==e?y.parseDate(e):y.latestSelectedDateObj||(y.config.minDate&&y.config.minDate>y.now?y.config.minDate:y.config.maxDate&&y.config.maxDate<y.now?y.config.maxDate:y.now),r=y.currentYear,n=y.currentMonth;try{void 0!==a&&(y.currentYear=a.getFullYear(),y.currentMonth=a.getMonth())}catch(e){e.message="Invalid date supplied: "+a,y.config.errorHandler(e)}t&&y.currentYear!==r&&(be("onYearChange"),W()),!t||y.currentYear===r&&y.currentMonth===n||be("onMonthChange"),y.redraw()}function O(e){var t=h(e);~t.className.indexOf("arrow")&&N(e,t.classList.contains("arrowUp")?1:-1)}function N(e,t,a){var r=e&&h(e),n=a||r&&r.parentNode&&r.parentNode.firstChild,o=pe("increment");o.delta=t,n&&n.dispatchEvent(o)}function R(e,t,a,r){var n=ee(t,!0),o=d("span","flatpickr-day "+e,t.getDate().toString());return o.dateObj=t,o.$i=r,o.setAttribute("aria-label",y.formatDate(t,y.config.ariaDateFormat)),-1===e.indexOf("hidden")&&0===k(t,y.now)&&(y.todayDateElem=o,o.classList.add("today"),o.setAttribute("aria-current","date")),n?(o.tabIndex=-1,ge(t)&&(o.classList.add("selected"),y.selectedDateElem=o,"range"===y.config.mode&&(c(o,"startRange",y.selectedDates[0]&&0===k(t,y.selectedDates[0],!0)),c(o,"endRange",y.selectedDates[1]&&0===k(t,y.selectedDates[1],!0)),"nextMonthDay"===e&&o.classList.add("inRange")))):o.classList.add("flatpickr-disabled"),"range"===y.config.mode&&function(e){return!("range"!==y.config.mode||y.selectedDates.length<2)&&(k(e,y.selectedDates[0])>=0&&k(e,y.selectedDates[1])<=0)}(t)&&!ge(t)&&o.classList.add("inRange"),y.weekNumbers&&1===y.config.showMonths&&"prevMonthDay"!==e&&a%7==1&&y.weekNumbers.insertAdjacentHTML("beforeend","<span class='flatpickr-day'>"+y.config.getWeek(t)+"</span>"),be("onDayCreate",o),o}function H(e){e.focus(),"range"===y.config.mode&&re(e)}function j(e){for(var t=e>0?0:y.config.showMonths-1,a=e>0?y.config.showMonths:-1,r=t;r!=a;r+=e)for(var n=y.daysContainer.children[r],o=e>0?0:n.children.length-1,i=e>0?n.children.length:-1,l=o;l!=i;l+=e){var s=n.children[l];if(-1===s.className.indexOf("hidden")&&ee(s.dateObj))return s}}function B(e,t){var a=te(document.activeElement||document.body),r=void 0!==e?e:a?document.activeElement:void 0!==y.selectedDateElem&&te(y.selectedDateElem)?y.selectedDateElem:void 0!==y.todayDateElem&&te(y.todayDateElem)?y.todayDateElem:j(t>0?1:-1);return void 0===r?y._input.focus():a?void function(e,t){for(var a=-1===e.className.indexOf("Month")?e.dateObj.getMonth():y.currentMonth,r=t>0?y.config.showMonths:-1,n=t>0?1:-1,o=a-y.currentMonth;o!=r;o+=n)for(var i=y.daysContainer.children[o],l=a-y.currentMonth===o?e.$i+t:t<0?i.children.length-1:0,s=i.children.length,c=l;c>=0&&c<s&&c!=(t>0?s:-1);c+=n){var d=i.children[c];if(-1===d.className.indexOf("hidden")&&ee(d.dateObj)&&Math.abs(e.$i-c)>=Math.abs(t))return H(d)}y.changeMonth(n),B(j(n),0)}(r,t):H(r)}function z(e,t){for(var a=(new Date(e,t,1).getDay()-y.l10n.firstDayOfWeek+7)%7,r=y.utils.getDaysInMonth((t-1+12)%12,e),n=y.utils.getDaysInMonth(t,e),o=window.document.createDocumentFragment(),i=y.config.showMonths>1,l=i||y.config.hidePrevMonthDays?"prevMonthDay hidden":"prevMonthDay",s=i||y.config.hideNextMonthDays?"nextMonthDay hidden":"nextMonthDay",c=r+1-a,m=0;c<=r;c++,m++)o.appendChild(R(l,new Date(e,t-1,c),c,m));for(c=1;c<=n;c++,m++)o.appendChild(R("",new Date(e,t,c),c,m));for(var u=n+1;u<=42-a&&(1===y.config.showMonths||m%7!=0);u++,m++)o.appendChild(R(s,new Date(e,t+1,u%n),u,m));var f=d("div","dayContainer");return f.appendChild(o),f}function V(){if(void 0!==y.daysContainer){m(y.daysContainer),y.weekNumbers&&m(y.weekNumbers);for(var e=document.createDocumentFragment(),t=0;t<y.config.showMonths;t++){var a=new Date(y.currentYear,y.currentMonth,1);a.setMonth(y.currentMonth+t),e.appendChild(z(a.getFullYear(),a.getMonth()))}y.daysContainer.appendChild(e),y.days=y.daysContainer.firstChild,"range"===y.config.mode&&1===y.selectedDates.length&&re()}}function W(){if(!(y.config.showMonths>1||"dropdown"!==y.config.monthSelectorType)){var e=function(e){return!(void 0!==y.config.minDate&&y.currentYear===y.config.minDate.getFullYear()&&e<y.config.minDate.getMonth())&&!(void 0!==y.config.maxDate&&y.currentYear===y.config.maxDate.getFullYear()&&e>y.config.maxDate.getMonth())};y.monthsDropdownContainer.tabIndex=-1,y.monthsDropdownContainer.innerHTML="";for(var t=0;t<12;t++)if(e(t)){var a=d("option","flatpickr-monthDropdown-month");a.value=new Date(y.currentYear,t).getMonth().toString(),a.textContent=p(t,y.config.shorthandCurrentMonth,y.l10n),a.tabIndex=-1,y.currentMonth===t&&(a.selected=!0),y.monthsDropdownContainer.appendChild(a)}}}function U(){var e,t,a,r=d("div","flatpickr-month"),n=window.document.createDocumentFragment();y.config.showMonths>1||"static"===y.config.monthSelectorType?e=d("span","cur-month"):(y.monthsDropdownContainer=d("select","flatpickr-monthDropdown-months"),P(y.monthsDropdownContainer,"change",(function(e){var t=h(e),a=parseInt(t.value,10);y.changeMonth(a-y.currentMonth),be("onMonthChange")})),W(),e=y.monthsDropdownContainer),"input"===y.config.yearSelectorType?((t=(a=f("cur-year",{tabindex:"-1"})).getElementsByTagName("input")[0]).setAttribute("aria-label",y.l10n.yearAriaLabel),y.config.minDate&&t.setAttribute("min",y.config.minDate.getFullYear().toString()),y.config.maxDate&&(t.setAttribute("max",y.config.maxDate.getFullYear().toString()),t.disabled=!!y.config.minDate&&y.config.minDate.getFullYear()===y.config.maxDate.getFullYear())):((t=d("span","cur-year numInput")).textContent=y.currentYear.toString(),t.setAttribute("aria-label",y.l10n.yearAriaLabel),a=t);var o=d("div","flatpickr-current-month");return o.appendChild(e),o.appendChild(a),n.appendChild(o),r.appendChild(n),{container:r,yearElement:t,monthElement:e}}function q(){m(y.monthNav),y.monthNav.appendChild(y.prevMonthNav),y.config.showMonths&&(y.yearElements=[],y.monthElements=[]);for(var e=y.config.showMonths;e--;){var t=U();y.yearElements.push(t.yearElement),y.monthElements.push(t.monthElement),y.monthNav.appendChild(t.container)}y.monthNav.appendChild(y.nextMonthNav)}function K(){y.weekdayContainer?m(y.weekdayContainer):y.weekdayContainer=d("div","flatpickr-weekdays");for(var e=y.config.showMonths;e--;){var t=d("div","flatpickr-weekdaycontainer");y.weekdayContainer.appendChild(t)}return Z(),y.weekdayContainer}function Z(){if(y.weekdayContainer){var e=y.l10n.firstDayOfWeek,a=t(y.l10n.weekdays.shorthand);e>0&&e<a.length&&(a=t(a.splice(e,a.length),a.splice(0,e)));for(var r=y.config.showMonths;r--;)y.weekdayContainer.children[r].innerHTML="\n      <span class='flatpickr-weekday'>\n        "+a.join("</span><span class='flatpickr-weekday'>")+"\n      </span>\n      "}}function X(e,t){void 0===t&&(t=!0);var a=t?e:e-y.currentMonth;a<0&&!0===y._hidePrevMonthArrow||a>0&&!0===y._hideNextMonthArrow||(y.currentMonth+=a,(y.currentMonth<0||y.currentMonth>11)&&(y.currentYear+=y.currentMonth>11?1:-1,y.currentMonth=(y.currentMonth+12)%12,be("onYearChange"),W()),V(),be("onMonthChange"),ve())}function J(e){return!(!y.config.appendTo||!y.config.appendTo.contains(e))||y.calendarContainer.contains(e)}function G(e){if(y.isOpen&&!y.config.inline){var t=h(e),a=J(t),r=t===y.input||t===y.altInput||y.element.contains(t)||e.path&&e.path.indexOf&&(~e.path.indexOf(y.input)||~e.path.indexOf(y.altInput)),n="blur"===e.type?r&&e.relatedTarget&&!J(e.relatedTarget):!r&&!a&&!J(e.relatedTarget),o=!y.config.ignoredFocusElements.some((function(e){return e.contains(t)}));n&&o&&(void 0!==y.timeContainer&&void 0!==y.minuteElement&&void 0!==y.hourElement&&$(),y.close(),"range"===y.config.mode&&1===y.selectedDates.length&&(y.clear(!1),y.redraw()))}}function Q(e){if(!(!e||y.config.minDate&&e<y.config.minDate.getFullYear()||y.config.maxDate&&e>y.config.maxDate.getFullYear())){var t=e,a=y.currentYear!==t;y.currentYear=t||y.currentYear,y.config.maxDate&&y.currentYear===y.config.maxDate.getFullYear()?y.currentMonth=Math.min(y.config.maxDate.getMonth(),y.currentMonth):y.config.minDate&&y.currentYear===y.config.minDate.getFullYear()&&(y.currentMonth=Math.max(y.config.minDate.getMonth(),y.currentMonth)),a&&(y.redraw(),be("onYearChange"),W())}}function ee(e,t){void 0===t&&(t=!0);var a=y.parseDate(e,void 0,t);if(y.config.minDate&&a&&k(a,y.config.minDate,void 0!==t?t:!y.minDateHasTime)<0||y.config.maxDate&&a&&k(a,y.config.maxDate,void 0!==t?t:!y.maxDateHasTime)>0)return!1;if(0===y.config.enable.length&&0===y.config.disable.length)return!0;if(void 0===a)return!1;for(var r=y.config.enable.length>0,n=r?y.config.enable:y.config.disable,o=0,i=void 0;o<n.length;o++){if("function"==typeof(i=n[o])&&i(a))return r;if(i instanceof Date&&void 0!==a&&i.getTime()===a.getTime())return r;if("string"==typeof i&&void 0!==a){var l=y.parseDate(i,void 0,!0);return l&&l.getTime()===a.getTime()?r:!r}if("object"==typeof i&&void 0!==a&&i.from&&i.to&&a.getTime()>=i.from.getTime()&&a.getTime()<=i.to.getTime())return r}return!r}function te(e){return void 0!==y.daysContainer&&(-1===e.className.indexOf("hidden")&&y.daysContainer.contains(e))}function ae(e){var t=h(e),a=t===y._input,r=y.config.allowInput,n=y.isOpen&&(!r||!a),o=y.config.inline&&a&&!r;if(13===e.keyCode&&a){if(r)return y.setDate(y._input.value,!0,t===y.altInput?y.config.altFormat:y.config.dateFormat),t.blur();y.open()}else if(J(t)||n||o){var i=!!y.timeContainer&&y.timeContainer.contains(t);switch(e.keyCode){case 13:i?(e.preventDefault(),$(),de()):me(e);break;case 27:e.preventDefault(),de();break;case 8:case 46:a&&!y.config.allowInput&&(e.preventDefault(),y.clear());break;case 37:case 39:if(i||a)y.hourElement&&y.hourElement.focus();else if(e.preventDefault(),void 0!==y.daysContainer&&(!1===r||document.activeElement&&te(document.activeElement))){var l=39===e.keyCode?1:-1;e.ctrlKey?(e.stopPropagation(),X(l),B(j(1),0)):B(void 0,l)}break;case 38:case 40:e.preventDefault();var s=40===e.keyCode?1:-1;y.daysContainer&&void 0!==t.$i||t===y.input||t===y.altInput?e.ctrlKey?(e.stopPropagation(),Q(y.currentYear-s),B(j(1),0)):i||B(void 0,7*s):t===y.currentYearElement?Q(y.currentYear-s):y.config.enableTime&&(!i&&y.hourElement&&y.hourElement.focus(),$(e),y._debouncedChange());break;case 9:if(i){var c=[y.hourElement,y.minuteElement,y.secondElement,y.amPM].concat(y.pluginElements).filter((function(e){return e})),d=c.indexOf(t);if(-1!==d){var m=c[d+(e.shiftKey?-1:1)];e.preventDefault(),(m||y._input).focus()}}else!y.config.noCalendar&&y.daysContainer&&y.daysContainer.contains(t)&&e.shiftKey&&(e.preventDefault(),y._input.focus())}}if(void 0!==y.amPM&&t===y.amPM)switch(e.key){case y.l10n.amPM[0].charAt(0):case y.l10n.amPM[0].charAt(0).toLowerCase():y.amPM.textContent=y.l10n.amPM[0],C(),_e();break;case y.l10n.amPM[1].charAt(0):case y.l10n.amPM[1].charAt(0).toLowerCase():y.amPM.textContent=y.l10n.amPM[1],C(),_e()}(a||J(t))&&be("onKeyDown",e)}function re(e){if(1===y.selectedDates.length&&(!e||e.classList.contains("flatpickr-day")&&!e.classList.contains("flatpickr-disabled"))){for(var t=e?e.dateObj.getTime():y.days.firstElementChild.dateObj.getTime(),a=y.parseDate(y.selectedDates[0],void 0,!0).getTime(),r=Math.min(t,y.selectedDates[0].getTime()),n=Math.max(t,y.selectedDates[0].getTime()),o=!1,i=0,l=0,s=r;s<n;s+=w)ee(new Date(s),!0)||(o=o||s>r&&s<n,s<a&&(!i||s>i)?i=s:s>a&&(!l||s<l)&&(l=s));for(var c=0;c<y.config.showMonths;c++)for(var d=y.daysContainer.children[c],m=function(r,n){var s,c,m,u=d.children[r],f=u.dateObj.getTime(),h=i>0&&f<i||l>0&&f>l;return h?(u.classList.add("notAllowed"),["inRange","startRange","endRange"].forEach((function(e){u.classList.remove(e)})),"continue"):o&&!h?"continue":(["startRange","inRange","endRange","notAllowed"].forEach((function(e){u.classList.remove(e)})),void(void 0!==e&&(e.classList.add(t<=y.selectedDates[0].getTime()?"startRange":"endRange"),a<t&&f===a?u.classList.add("startRange"):a>t&&f===a&&u.classList.add("endRange"),f>=i&&(0===l||f<=l)&&(c=a,m=t,(s=f)>Math.min(c,m)&&s<Math.max(c,m))&&u.classList.add("inRange"))))},u=0,f=d.children.length;u<f;u++)m(u)}}function ne(){!y.isOpen||y.config.static||y.config.inline||se()}function oe(){y.setDate(void 0!==y.config.minDate?new Date(y.config.minDate.getTime()):new Date,!0),T(),_e()}function ie(e){return function(t){var a=y.config["_"+e+"Date"]=y.parseDate(t,y.config.dateFormat),r=y.config["_"+("min"===e?"max":"min")+"Date"];void 0!==a&&(y["min"===e?"minDateHasTime":"maxDateHasTime"]=a.getHours()>0||a.getMinutes()>0||a.getSeconds()>0),y.selectedDates&&(y.selectedDates=y.selectedDates.filter((function(e){return ee(e)})),y.selectedDates.length||"min"!==e||E(a),_e()),y.daysContainer&&(ce(),void 0!==a?y.currentYearElement[e]=a.getFullYear().toString():y.currentYearElement.removeAttribute(e),y.currentYearElement.disabled=!!r&&void 0!==a&&r.getFullYear()===a.getFullYear())}}function le(){"object"!=typeof y.config.locale&&void 0===M.l10ns[y.config.locale]&&y.config.errorHandler(new Error("flatpickr: invalid locale "+y.config.locale)),y.l10n=e(e({},M.l10ns.default),"object"==typeof y.config.locale?y.config.locale:"default"!==y.config.locale?M.l10ns[y.config.locale]:void 0),v.K="("+y.l10n.amPM[0]+"|"+y.l10n.amPM[1]+"|"+y.l10n.amPM[0].toLowerCase()+"|"+y.l10n.amPM[1].toLowerCase()+")",void 0===e(e({},g),JSON.parse(JSON.stringify(b.dataset||{}))).time_24hr&&void 0===M.defaultConfig.time_24hr&&(y.config.time_24hr=y.l10n.time_24hr),y.formatDate=_(y),y.parseDate=D({config:y.config,l10n:y.l10n})}function se(e){if(void 0!==y.calendarContainer){be("onPreCalendarPosition");var t=e||y._positionElement,a=Array.prototype.reduce.call(y.calendarContainer.children,(function(e,t){return e+t.offsetHeight}),0),r=y.calendarContainer.offsetWidth,n=y.config.position.split(" "),o=n[0],i=n.length>1?n[1]:null,l=t.getBoundingClientRect(),s=window.innerHeight-l.bottom,d="above"===o||"below"!==o&&s<a&&l.top>a,m=window.pageYOffset+l.top+(d?-a-2:t.offsetHeight+2);if(c(y.calendarContainer,"arrowTop",!d),c(y.calendarContainer,"arrowBottom",d),!y.config.inline){var u=window.pageXOffset+l.left-(null!=i&&"center"===i?(r-l.width)/2:0),f=window.document.body.offsetWidth-(window.pageXOffset+l.right),h=u+r>window.document.body.offsetWidth,b=f+r>window.document.body.offsetWidth;if(c(y.calendarContainer,"rightMost",h),!y.config.static)if(y.calendarContainer.style.top=m+"px",h)if(b){var p=function(){for(var e=null,t=0;t<document.styleSheets.length;t++){var a=document.styleSheets[t];try{a.cssRules}catch(e){continue}e=a;break}return null!=e?e:(r=document.createElement("style"),document.head.appendChild(r),r.sheet);var r}();if(void 0===p)return;var g=window.document.body.offsetWidth,v=Math.max(0,g/2-r/2),_=p.cssRules.length,D="{left:"+l.left+"px;right:auto;}";c(y.calendarContainer,"rightMost",!1),c(y.calendarContainer,"centerMost",!0),p.insertRule(".flatpickr-calendar.centerMost:before,.flatpickr-calendar.centerMost:after"+D,_),y.calendarContainer.style.left=v+"px",y.calendarContainer.style.right="auto"}else y.calendarContainer.style.left="auto",y.calendarContainer.style.right=f+"px";else y.calendarContainer.style.left=u+"px",y.calendarContainer.style.right="auto"}}}function ce(){y.config.noCalendar||y.isMobile||(W(),ve(),V())}function de(){y._input.focus(),-1!==window.navigator.userAgent.indexOf("MSIE")||void 0!==navigator.msMaxTouchPoints?setTimeout(y.close,0):y.close()}function me(e){e.preventDefault(),e.stopPropagation();var t=u(h(e),(function(e){return e.classList&&e.classList.contains("flatpickr-day")&&!e.classList.contains("flatpickr-disabled")&&!e.classList.contains("notAllowed")}));if(void 0!==t){var a=t,r=y.latestSelectedDateObj=new Date(a.dateObj.getTime()),n=(r.getMonth()<y.currentMonth||r.getMonth()>y.currentMonth+y.config.showMonths-1)&&"range"!==y.config.mode;if(y.selectedDateElem=a,"single"===y.config.mode)y.selectedDates=[r];else if("multiple"===y.config.mode){var o=ge(r);o?y.selectedDates.splice(parseInt(o),1):y.selectedDates.push(r)}else"range"===y.config.mode&&(2===y.selectedDates.length&&y.clear(!1,!1),y.latestSelectedDateObj=r,y.selectedDates.push(r),0!==k(r,y.selectedDates[0],!0)&&y.selectedDates.sort((function(e,t){return e.getTime()-t.getTime()})));if(C(),n){var i=y.currentYear!==r.getFullYear();y.currentYear=r.getFullYear(),y.currentMonth=r.getMonth(),i&&(be("onYearChange"),W()),be("onMonthChange")}if(ve(),V(),_e(),y.config.enableTime&&setTimeout((function(){return y.showTimeInput=!0}),50),n||"range"===y.config.mode||1!==y.config.showMonths?void 0!==y.selectedDateElem&&void 0===y.hourElement&&y.selectedDateElem&&y.selectedDateElem.focus():H(a),void 0!==y.hourElement&&void 0!==y.hourElement&&y.hourElement.focus(),y.config.closeOnSelect){var l="single"===y.config.mode&&!y.config.enableTime,s="range"===y.config.mode&&2===y.selectedDates.length&&!y.config.enableTime;(l||s)&&de()}Y()}}y.parseDate=D({config:y.config,l10n:y.l10n}),y._handlers=[],y.pluginElements=[],y.loadedPlugins=[],y._bind=P,y._setHoursFromDate=E,y._positionCalendar=se,y.changeMonth=X,y.changeYear=Q,y.clear=function(e,t){void 0===e&&(e=!0);void 0===t&&(t=!0);y.input.value="",void 0!==y.altInput&&(y.altInput.value="");void 0!==y.mobileInput&&(y.mobileInput.value="");y.selectedDates=[],y.latestSelectedDateObj=void 0,!0===t&&(y.currentYear=y._initialDate.getFullYear(),y.currentMonth=y._initialDate.getMonth());y.showTimeInput=!1,!0===y.config.enableTime&&T();y.redraw(),e&&be("onChange")},y.close=function(){y.isOpen=!1,y.isMobile||(void 0!==y.calendarContainer&&y.calendarContainer.classList.remove("open"),void 0!==y._input&&y._input.classList.remove("active"));be("onClose")},y._createElement=d,y.destroy=function(){void 0!==y.config&&be("onDestroy");for(var e=y._handlers.length;e--;){var t=y._handlers[e];t.element.removeEventListener(t.event,t.handler,t.options)}if(y._handlers=[],y.mobileInput)y.mobileInput.parentNode&&y.mobileInput.parentNode.removeChild(y.mobileInput),y.mobileInput=void 0;else if(y.calendarContainer&&y.calendarContainer.parentNode)if(y.config.static&&y.calendarContainer.parentNode){var a=y.calendarContainer.parentNode;if(a.lastChild&&a.removeChild(a.lastChild),a.parentNode){for(;a.firstChild;)a.parentNode.insertBefore(a.firstChild,a);a.parentNode.removeChild(a)}}else y.calendarContainer.parentNode.removeChild(y.calendarContainer);y.altInput&&(y.input.type="text",y.altInput.parentNode&&y.altInput.parentNode.removeChild(y.altInput),delete y.altInput);y.input&&(y.input.type=y.input._type,y.input.classList.remove("flatpickr-input"),y.input.removeAttribute("readonly"),y.input.value="");["_showTimeInput","latestSelectedDateObj","_hideNextMonthArrow","_hidePrevMonthArrow","__hideNextMonthArrow","__hidePrevMonthArrow","isMobile","isOpen","selectedDateElem","minDateHasTime","maxDateHasTime","days","daysContainer","_input","_positionElement","innerContainer","rContainer","monthNav","todayDateElem","calendarContainer","weekdayContainer","prevMonthNav","nextMonthNav","monthsDropdownContainer","currentMonthElement","currentYearElement","navigationCurrentMonth","selectedDateElem","config"].forEach((function(e){try{delete y[e]}catch(e){}}))},y.isEnabled=ee,y.jumpToDate=L,y.open=function(e,t){void 0===t&&(t=y._positionElement);if(!0===y.isMobile){if(e){e.preventDefault();var a=h(e);a&&a.blur()}return void 0!==y.mobileInput&&(y.mobileInput.focus(),y.mobileInput.click()),void be("onOpen")}if(y._input.disabled||y.config.inline)return;var r=y.isOpen;y.isOpen=!0,r||(y.calendarContainer.classList.add("open"),y._input.classList.add("active"),be("onOpen"),se(t));!0===y.config.enableTime&&!0===y.config.noCalendar&&(0===y.selectedDates.length&&oe(),!1!==y.config.allowInput||void 0!==e&&y.timeContainer.contains(e.relatedTarget)||setTimeout((function(){return y.hourElement.select()}),50))},y.redraw=ce,y.set=function(e,t){if(null!==e&&"object"==typeof e)for(var r in Object.assign(y.config,e),e)void 0!==ue[r]&&ue[r].forEach((function(e){return e()}));else y.config[e]=t,void 0!==ue[e]?ue[e].forEach((function(e){return e()})):a.indexOf(e)>-1&&(y.config[e]=s(t));y.redraw(),_e(!0)},y.setDate=function(e,t,a){void 0===t&&(t=!1);void 0===a&&(a=y.config.dateFormat);if(0!==e&&!e||e instanceof Array&&0===e.length)return y.clear(t);fe(e,a),y.showTimeInput=y.selectedDates.length>0,y.latestSelectedDateObj=y.selectedDates[y.selectedDates.length-1],y.redraw(),L(void 0,t),E(),0===y.selectedDates.length&&y.clear(!1);_e(t),t&&be("onChange")},y.toggle=function(e){if(!0===y.isOpen)return y.close();y.open(e)};var ue={locale:[le,Z],showMonths:[q,S,K],minDate:[L],maxDate:[L]};function fe(e,t){var a=[];if(e instanceof Array)a=e.map((function(e){return y.parseDate(e,t)}));else if(e instanceof Date||"number"==typeof e)a=[y.parseDate(e,t)];else if("string"==typeof e)switch(y.config.mode){case"single":case"time":a=[y.parseDate(e,t)];break;case"multiple":a=e.split(y.config.conjunction).map((function(e){return y.parseDate(e,t)}));break;case"range":a=e.split(y.l10n.rangeSeparator).map((function(e){return y.parseDate(e,t)}))}else y.config.errorHandler(new Error("Invalid date supplied: "+JSON.stringify(e)));y.selectedDates=a.filter((function(e){return e instanceof Date&&ee(e,!1)})),"range"===y.config.mode&&y.selectedDates.sort((function(e,t){return e.getTime()-t.getTime()}))}function he(e){return e.slice().map((function(e){return"string"==typeof e||"number"==typeof e||e instanceof Date?y.parseDate(e,void 0,!0):e&&"object"==typeof e&&e.from&&e.to?{from:y.parseDate(e.from,void 0),to:y.parseDate(e.to,void 0)}:e})).filter((function(e){return e}))}function be(e,t){if(void 0!==y.config){var a=y.config[e];if(void 0!==a&&a.length>0)for(var r=0;a[r]&&r<a.length;r++)a[r](y.selectedDates,y.input.value,y,t);"onChange"===e&&(y.input.dispatchEvent(pe("change")),y.input.dispatchEvent(pe("input")))}}function pe(e){var t=document.createEvent("Event");return t.initEvent(e,!0,!0),t}function ge(e){for(var t=0;t<y.selectedDates.length;t++)if(0===k(y.selectedDates[t],e))return""+t;return!1}function ve(){y.config.noCalendar||y.isMobile||!y.monthNav||(y.yearElements.forEach((function(e,t){var a=new Date(y.currentYear,y.currentMonth,1);a.setMonth(y.currentMonth+t),y.config.showMonths>1||"static"===y.config.monthSelectorType?y.monthElements[t].textContent=p(a.getMonth(),y.config.shorthandCurrentMonth,y.l10n)+" ":y.monthsDropdownContainer.value=a.getMonth().toString(),"input"===y.config.yearSelectorType?e.value=a.getFullYear().toString():e.textContent=a.getFullYear().toString()})),y._hidePrevMonthArrow=void 0!==y.config.minDate&&(y.currentYear===y.config.minDate.getFullYear()?y.currentMonth<=y.config.minDate.getMonth():y.currentYear<y.config.minDate.getFullYear()),y._hideNextMonthArrow=void 0!==y.config.maxDate&&(y.currentYear===y.config.maxDate.getFullYear()?y.currentMonth+1>y.config.maxDate.getMonth():y.currentYear>y.config.maxDate.getFullYear()))}function ye(e){return y.selectedDates.map((function(t){return y.formatDate(t,e)})).filter((function(e,t,a){return"range"!==y.config.mode||y.config.enableTime||a.indexOf(e)===t})).join("range"!==y.config.mode?y.config.conjunction:y.l10n.rangeSeparator)}function _e(e){void 0===e&&(e=!0),void 0!==y.mobileInput&&y.mobileFormatStr&&(y.mobileInput.value=void 0!==y.latestSelectedDateObj?y.formatDate(y.latestSelectedDateObj,y.mobileFormatStr):""),y.input.value=ye(y.config.dateFormat),void 0!==y.altInput&&(y.altInput.value=ye(y.config.altFormat)),!1!==e&&be("onValueUpdate")}function De(e){var t=h(e),a=y.prevMonthNav.contains(t),r=y.nextMonthNav.contains(t);a||r?X(a?-1:1):y.yearElements.indexOf(t)>=0&&"input"===y.config.yearSelectorType?t.select():t.classList.contains("arrowUp")?y.changeYear(y.currentYear+1):t.classList.contains("arrowDown")&&y.changeYear(y.currentYear-1)}return function(){y.element=y.input=b,y.isOpen=!1,function(){var t=["wrap","weekNumbers","allowInput","clickOpens","time_24hr","enableTime","noCalendar","altInput","shorthandCurrentMonth","inline","static","enableSeconds","disableMobile"],n=e(e({},JSON.parse(JSON.stringify(b.dataset||{}))),g),o={};y.config.parseDate=n.parseDate,y.config.formatDate=n.formatDate,Object.defineProperty(y.config,"enable",{get:function(){return y.config._enable},set:function(e){y.config._enable=he(e)}}),Object.defineProperty(y.config,"disable",{get:function(){return y.config._disable},set:function(e){y.config._disable=he(e)}});var i="time"===n.mode;if(!n.dateFormat&&(n.enableTime||i)){var l=M.defaultConfig.dateFormat||r.dateFormat;o.dateFormat=n.noCalendar||i?"H:i"+(n.enableSeconds?":S":""):l+" H:i"+(n.enableSeconds?":S":"")}if(n.altInput&&(n.enableTime||i)&&!n.altFormat){var c=M.defaultConfig.altFormat||r.altFormat;o.altFormat=n.noCalendar||i?"h:i"+(n.enableSeconds?":S K":" K"):c+" h:i"+(n.enableSeconds?":S":"")+" K"}n.altInputClass||(y.config.altInputClass=y.input.className+" "+y.config.altInputClass);Object.defineProperty(y.config,"minDate",{get:function(){return y.config._minDate},set:ie("min")}),Object.defineProperty(y.config,"maxDate",{get:function(){return y.config._maxDate},set:ie("max")});var d=function(e){return function(t){y.config["min"===e?"_minTime":"_maxTime"]=y.parseDate(t,"H:i:S")}};Object.defineProperty(y.config,"minTime",{get:function(){return y.config._minTime},set:d("min")}),Object.defineProperty(y.config,"maxTime",{get:function(){return y.config._maxTime},set:d("max")}),"time"===n.mode&&(y.config.noCalendar=!0,y.config.enableTime=!0);Object.assign(y.config,o,n);for(var m=0;m<t.length;m++)y.config[t[m]]=!0===y.config[t[m]]||"true"===y.config[t[m]];a.filter((function(e){return void 0!==y.config[e]})).forEach((function(e){y.config[e]=s(y.config[e]||[]).map(x)})),y.isMobile=!y.config.disableMobile&&!y.config.inline&&"single"===y.config.mode&&!y.config.disable.length&&!y.config.enable.length&&!y.config.weekNumbers&&/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent);for(m=0;m<y.config.plugins.length;m++){var u=y.config.plugins[m](y)||{};for(var f in u)a.indexOf(f)>-1?y.config[f]=s(u[f]).map(x).concat(y.config[f]):void 0===n[f]&&(y.config[f]=u[f])}be("onParseConfig")}(),le(),function(){if(y.input=y.config.wrap?b.querySelector("[data-input]"):b,!y.input)return void y.config.errorHandler(new Error("Invalid input element specified"));y.input._type=y.input.type,y.input.type="text",y.input.classList.add("flatpickr-input"),y._input=y.input,y.config.altInput&&(y.altInput=d(y.input.nodeName,y.config.altInputClass),y._input=y.altInput,y.altInput.placeholder=y.input.placeholder,y.altInput.disabled=y.input.disabled,y.altInput.required=y.input.required,y.altInput.tabIndex=y.input.tabIndex,y.altInput.type="text",y.input.setAttribute("type","hidden"),!y.config.static&&y.input.parentNode&&y.input.parentNode.insertBefore(y.altInput,y.input.nextSibling));y.config.allowInput||y._input.setAttribute("readonly","readonly");y._positionElement=y.config.positionElement||y._input}(),function(){y.selectedDates=[],y.now=y.parseDate(y.config.now)||new Date;var e=y.config.defaultDate||("INPUT"!==y.input.nodeName&&"TEXTAREA"!==y.input.nodeName||!y.input.placeholder||y.input.value!==y.input.placeholder?y.input.value:null);e&&fe(e,y.config.dateFormat);y._initialDate=y.selectedDates.length>0?y.selectedDates[0]:y.config.minDate&&y.config.minDate.getTime()>y.now.getTime()?y.config.minDate:y.config.maxDate&&y.config.maxDate.getTime()<y.now.getTime()?y.config.maxDate:y.now,y.currentYear=y._initialDate.getFullYear(),y.currentMonth=y._initialDate.getMonth(),y.selectedDates.length>0&&(y.latestSelectedDateObj=y.selectedDates[0]);void 0!==y.config.minTime&&(y.config.minTime=y.parseDate(y.config.minTime,"H:i"));void 0!==y.config.maxTime&&(y.config.maxTime=y.parseDate(y.config.maxTime,"H:i"));y.minDateHasTime=!!y.config.minDate&&(y.config.minDate.getHours()>0||y.config.minDate.getMinutes()>0||y.config.minDate.getSeconds()>0),y.maxDateHasTime=!!y.config.maxDate&&(y.config.maxDate.getHours()>0||y.config.maxDate.getMinutes()>0||y.config.maxDate.getSeconds()>0),Object.defineProperty(y,"showTimeInput",{get:function(){return y._showTimeInput},set:function(e){y._showTimeInput=e,y.calendarContainer&&c(y.calendarContainer,"showTimeInput",e),y.isOpen&&se()}})}(),y.utils={getDaysInMonth:function(e,t){return void 0===e&&(e=y.currentMonth),void 0===t&&(t=y.currentYear),1===e&&(t%4==0&&t%100!=0||t%400==0)?29:y.l10n.daysInMonth[e]}},y.isMobile||function(){var e=window.document.createDocumentFragment();if(y.calendarContainer=d("div","flatpickr-calendar"),y.calendarContainer.tabIndex=-1,!y.config.noCalendar){if(e.appendChild((y.monthNav=d("div","flatpickr-months"),y.yearElements=[],y.monthElements=[],y.prevMonthNav=d("span","flatpickr-prev-month"),y.prevMonthNav.innerHTML=y.config.prevArrow,y.nextMonthNav=d("span","flatpickr-next-month"),y.nextMonthNav.innerHTML=y.config.nextArrow,q(),Object.defineProperty(y,"_hidePrevMonthArrow",{get:function(){return y.__hidePrevMonthArrow},set:function(e){y.__hidePrevMonthArrow!==e&&(c(y.prevMonthNav,"flatpickr-disabled",e),y.__hidePrevMonthArrow=e)}}),Object.defineProperty(y,"_hideNextMonthArrow",{get:function(){return y.__hideNextMonthArrow},set:function(e){y.__hideNextMonthArrow!==e&&(c(y.nextMonthNav,"flatpickr-disabled",e),y.__hideNextMonthArrow=e)}}),y.currentYearElement=y.yearElements[0],ve(),y.monthNav)),y.innerContainer=d("div","flatpickr-innerContainer"),y.config.weekNumbers){var t=function(){y.calendarContainer.classList.add("hasWeeks");var e=d("div","flatpickr-weekwrapper");e.appendChild(d("span","flatpickr-weekday",y.l10n.weekAbbreviation));var t=d("div","flatpickr-weeks");return e.appendChild(t),{weekWrapper:e,weekNumbers:t}}(),a=t.weekWrapper,r=t.weekNumbers;y.innerContainer.appendChild(a),y.weekNumbers=r,y.weekWrapper=a}y.rContainer=d("div","flatpickr-rContainer"),y.rContainer.appendChild(K()),y.daysContainer||(y.daysContainer=d("div","flatpickr-days"),y.daysContainer.tabIndex=-1),V(),y.rContainer.appendChild(y.daysContainer),y.innerContainer.appendChild(y.rContainer),e.appendChild(y.innerContainer)}y.config.enableTime&&e.appendChild(function(){y.calendarContainer.classList.add("hasTime"),y.config.noCalendar&&y.calendarContainer.classList.add("noCalendar");y.timeContainer=d("div","flatpickr-time"),y.timeContainer.tabIndex=-1;var e=d("span","flatpickr-time-separator",":"),t=f("flatpickr-hour",{"aria-label":y.l10n.hourAriaLabel});y.hourElement=t.getElementsByTagName("input")[0];var a=f("flatpickr-minute",{"aria-label":y.l10n.minuteAriaLabel});y.minuteElement=a.getElementsByTagName("input")[0],y.hourElement.tabIndex=y.minuteElement.tabIndex=-1,y.hourElement.value=o(y.latestSelectedDateObj?y.latestSelectedDateObj.getHours():y.config.time_24hr?y.config.defaultHour:function(e){switch(e%24){case 0:case 12:return 12;default:return e%12}}(y.config.defaultHour)),y.minuteElement.value=o(y.latestSelectedDateObj?y.latestSelectedDateObj.getMinutes():y.config.defaultMinute),y.hourElement.setAttribute("step",y.config.hourIncrement.toString()),y.minuteElement.setAttribute("step",y.config.minuteIncrement.toString()),y.hourElement.setAttribute("min",y.config.time_24hr?"0":"1"),y.hourElement.setAttribute("max",y.config.time_24hr?"23":"12"),y.minuteElement.setAttribute("min","0"),y.minuteElement.setAttribute("max","59"),y.timeContainer.appendChild(t),y.timeContainer.appendChild(e),y.timeContainer.appendChild(a),y.config.time_24hr&&y.timeContainer.classList.add("time24hr");if(y.config.enableSeconds){y.timeContainer.classList.add("hasSeconds");var r=f("flatpickr-second");y.secondElement=r.getElementsByTagName("input")[0],y.secondElement.value=o(y.latestSelectedDateObj?y.latestSelectedDateObj.getSeconds():y.config.defaultSeconds),y.secondElement.setAttribute("step",y.minuteElement.getAttribute("step")),y.secondElement.setAttribute("min","0"),y.secondElement.setAttribute("max","59"),y.timeContainer.appendChild(d("span","flatpickr-time-separator",":")),y.timeContainer.appendChild(r)}y.config.time_24hr||(y.amPM=d("span","flatpickr-am-pm",y.l10n.amPM[i((y.latestSelectedDateObj?y.hourElement.value:y.config.defaultHour)>11)]),y.amPM.title=y.l10n.toggleTitle,y.amPM.tabIndex=-1,y.timeContainer.appendChild(y.amPM));return y.timeContainer}());c(y.calendarContainer,"rangeMode","range"===y.config.mode),c(y.calendarContainer,"animate",!0===y.config.animate),c(y.calendarContainer,"multiMonth",y.config.showMonths>1),y.calendarContainer.appendChild(e);var n=void 0!==y.config.appendTo&&void 0!==y.config.appendTo.nodeType;if((y.config.inline||y.config.static)&&(y.calendarContainer.classList.add(y.config.inline?"inline":"static"),y.config.inline&&(!n&&y.element.parentNode?y.element.parentNode.insertBefore(y.calendarContainer,y._input.nextSibling):void 0!==y.config.appendTo&&y.config.appendTo.appendChild(y.calendarContainer)),y.config.static)){var l=d("div","flatpickr-wrapper");y.element.parentNode&&y.element.parentNode.insertBefore(l,y.element),l.appendChild(y.element),y.altInput&&l.appendChild(y.altInput),l.appendChild(y.calendarContainer)}y.config.static||y.config.inline||(void 0!==y.config.appendTo?y.config.appendTo:window.document.body).appendChild(y.calendarContainer)}(),function(){y.config.wrap&&["open","close","toggle","clear"].forEach((function(e){Array.prototype.forEach.call(y.element.querySelectorAll("[data-"+e+"]"),(function(t){return P(t,"click",y[e])}))}));if(y.isMobile)return void function(){var e=y.config.enableTime?y.config.noCalendar?"time":"datetime-local":"date";y.mobileInput=d("input",y.input.className+" flatpickr-mobile"),y.mobileInput.tabIndex=1,y.mobileInput.type=e,y.mobileInput.disabled=y.input.disabled,y.mobileInput.required=y.input.required,y.mobileInput.placeholder=y.input.placeholder,y.mobileFormatStr="datetime-local"===e?"Y-m-d\\TH:i:S":"date"===e?"Y-m-d":"H:i:S",y.selectedDates.length>0&&(y.mobileInput.defaultValue=y.mobileInput.value=y.formatDate(y.selectedDates[0],y.mobileFormatStr));y.config.minDate&&(y.mobileInput.min=y.formatDate(y.config.minDate,"Y-m-d"));y.config.maxDate&&(y.mobileInput.max=y.formatDate(y.config.maxDate,"Y-m-d"));y.input.getAttribute("step")&&(y.mobileInput.step=String(y.input.getAttribute("step")));y.input.type="hidden",void 0!==y.altInput&&(y.altInput.type="hidden");try{y.input.parentNode&&y.input.parentNode.insertBefore(y.mobileInput,y.input.nextSibling)}catch(e){}P(y.mobileInput,"change",(function(e){y.setDate(h(e).value,!1,y.mobileFormatStr),be("onChange"),be("onClose")}))}();var e=l(ne,50);y._debouncedChange=l(Y,300),y.daysContainer&&!/iPhone|iPad|iPod/i.test(navigator.userAgent)&&P(y.daysContainer,"mouseover",(function(e){"range"===y.config.mode&&re(h(e))}));P(window.document.body,"keydown",ae),y.config.inline||y.config.static||P(window,"resize",e);void 0!==window.ontouchstart?P(window.document,"touchstart",G):P(window.document,"mousedown",I(G));P(window.document,"focus",G,{capture:!0}),!0===y.config.clickOpens&&(P(y._input,"focus",y.open),P(y._input,"mousedown",I(y.open)));void 0!==y.daysContainer&&(P(y.monthNav,"mousedown",I(De)),P(y.monthNav,["keyup","increment"],A),P(y.daysContainer,"mousedown",I(me)));if(void 0!==y.timeContainer&&void 0!==y.minuteElement&&void 0!==y.hourElement){var t=function(e){return h(e).select()};P(y.timeContainer,["increment"],$),P(y.timeContainer,"blur",$,{capture:!0}),P(y.timeContainer,"mousedown",I(O)),P([y.hourElement,y.minuteElement],["focus","click"],t),void 0!==y.secondElement&&P(y.secondElement,"focus",(function(){return y.secondElement&&y.secondElement.select()})),void 0!==y.amPM&&P(y.amPM,"mousedown",I((function(e){$(e),Y()})))}}(),(y.selectedDates.length||y.config.noCalendar)&&(y.config.enableTime&&E(y.config.noCalendar?y.latestSelectedDateObj||y.config.minDate:void 0),_e(!1)),S(),y.showTimeInput=y.selectedDates.length>0||y.config.noCalendar;var t=/^((?!chrome|android).)*safari/i.test(navigator.userAgent);!y.isMobile&&t&&se(),be("onReady")}(),y}function S(e,t){for(var a=Array.prototype.slice.call(e).filter((function(e){return e instanceof HTMLElement})),r=[],n=0;n<a.length;n++){var o=a[n];try{if(null!==o.getAttribute("data-fp-omit"))continue;void 0!==o._flatpickr&&(o._flatpickr.destroy(),o._flatpickr=void 0),o._flatpickr=x(o,t||{}),r.push(o._flatpickr)}catch(e){console.error(e)}}return 1===r.length?r[0]:r}"undefined"!=typeof HTMLElement&&"undefined"!=typeof HTMLCollection&&"undefined"!=typeof NodeList&&(HTMLCollection.prototype.flatpickr=NodeList.prototype.flatpickr=function(e){return S(this,e)},HTMLElement.prototype.flatpickr=function(e){return S([this],e)});var M=function(e,t){return"string"==typeof e?S(window.document.querySelectorAll(e),t):e instanceof Node?S([e],t):S(e,t)};return M.defaultConfig={},M.l10ns={en:e({},n),default:e({},n)},M.localize=function(t){M.l10ns.default=e(e({},M.l10ns.default),t)},M.setDefaults=function(t){M.defaultConfig=e(e({},M.defaultConfig),t)},M.parseDate=D({}),M.formatDate=_({}),M.compareDates=k,"undefined"!=typeof jQuery&&void 0!==jQuery.fn&&(jQuery.fn.flatpickr=function(e){return S(this,e)}),Date.prototype.fp_incr=function(e){return new Date(this.getFullYear(),this.getMonth(),this.getDate()+("string"==typeof e?parseInt(e,10):e))},"undefined"!=typeof window&&(window.flatpickr=M),M})),function(e,t){"object"==typeof exports&&"undefined"!=typeof module?t(exports):"function"==typeof define&&define.amd?define(["exports"],t):t((e=e||self).es={})}(void 0,(function(e){var t="undefined"!=typeof window&&void 0!==window.flatpickr?window.flatpickr:{l10ns:{}},a={weekdays:{shorthand:["Dom","Lun","Mar","Mié","Jue","Vie","Sáb"],longhand:["Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"]},months:{shorthand:["Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"],longhand:["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]},ordinal:function(){return"º"},firstDayOfWeek:1,rangeSeparator:" a ",time_24hr:!0};t.l10ns.es=a;var r=t.l10ns;e.Spanish=a,e.default=r,Object.defineProperty(e,"__esModule",{value:!0})}));var K=D`
:host {
  --_transition-time: var(--bbva-web-form-calendar-selector-transition-time, .48s);
  position: absolute;
  z-index: -1;
  top: 0;
  left: 0;
  display: block;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${k(x.medium.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
  transition: visibility 0s var(--_transition-time), z-index 0s var(--_transition-time);
  visibility: hidden;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

:host([visible]) {
  z-index: 1;
  transition: visibility 0s 0s, z-index 0s 0s;
  visibility: visible;
}

.main {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  overflow: hidden;
}

.skew {
  position: absolute;
  top: 0;
  right: 0;
  left: 0;
  overflow: hidden;
  height: 100%;
  max-height: 0%;
  transition: max-height var(--_transition-time);
}
.skew.transitioning {
  height: 200%;
  transform: skewY(-25deg);
  transform-origin: left top;
}
:host([visible]) .skew {
  max-height: 200%;
}

.content {
  position: relative;
  display: flex;
  height: auto;
  flex-direction: column;
  padding-bottom: 1.25rem;
  margin: 0 1rem;
  background-color: var(--_form-calendar-bg-color);
  color: var(--_form-calendar-flatpickr-day-color);
}
.transitioning .content {
  transform: skewY(25deg);
  transform-origin: left top;
}

.cols {
  display: flex;
  flex: 1;
  align-items: flex-start;
  padding: 1rem 0;
}

table {
  width: 50%;
  padding: 0 0.5rem;
  color: inherit;
}

caption {
  padding: 0 16px 8px 16px;
  color: var(--_form-calendar-flatpickr-weekday-color);
}
caption .year-container {
  display: flex;
  justify-content: space-between;
}
caption .year-container .nav-year {
  cursor: pointer;
  fill: var(--_form-calendar-arrow-color);
}

td {
  padding: 0.5rem 0;
}

td button {
  width: 100%;
  height: 2.5rem;
  padding: 0;
  border: none;
  border-radius: 1.25rem;
  margin: 0;
  background: transparent;
  color: inherit;
  cursor: pointer;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${k(x.medium.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
}
td button[aria-pressed=true] {
  background-color: var(--_form-calendar-flatpickr-day-selected-bg-color);
  color: var(--_form-calendar-flatpickr-day-selected-color);
}
:host([focus-visible]) td button:focus {
  outline-color: var(--_form-calendar-focus-color);
}
td button[disabled] {
  cursor: default;
  opacity: 0.4;
}

.actions {
  display: flex;
  flex: 0;
  align-items: center;
  justify-content: flex-end;
  padding: 1rem;
}
.actions [data-tag-name=bbva-button-default] {
  margin-left: 2rem;
}
`;const Z="bbva-form-calendar",X=`${Z}-short`,J=`${Z}-long`,G=(e,t,a)=>{const r=[];return e.forEach((e=>{r.push({s:`${t}-${e}`,l:`${a}-${e}`})})),r},Q={week:G(["sunday","monday","tuesday","wednesday","thursday","friday","saturday"],X,J),month:G(["january","february","march","april","may","june","july","august","september","october","november","december"],X,J)},ee=M(),te=$();class ae extends(e(C(E))){static get is(){return"bbva-form-calendar-month-year-selector"}static get scopedElements(){return{"bbva-type-icon":t,"bbva-button-default":a,"bbva-type-link":r,"bbva-divider-default":n}}static get properties(){return{labels:{type:Object},firstYear:{type:Number,attribute:"first-year"},cols:{type:Number},monthRows:{type:Number,attribute:"month-rows"},yearRows:{type:Number,attribute:"year-rows"},opened:{type:Boolean},month:{type:Number},year:{type:Number},minDate:{type:String,attribute:"min-date"},maxDate:{type:String,attribute:"max-date"},_opened:{type:Boolean,attribute:!1},_transitioning:{type:Boolean,attribute:!1},_monthFocused:{type:Number,attribute:!1},_yearFocused:{type:Number,attribute:!1},_announcerText:{type:String,attribute:!1},_nodes:{type:Object}}}constructor(){super(),this.labels=Q,this.cols=4,this.monthRows=3,this.yearRows=5,this._today=new Date,this._today.setHours(0,0,0,0),this._announcerText="",this._nodes={},this._transitioning=!1}static get styles(){return[T("button:focus"),K,F("bbva-form-calendar-month-year-selector-shared-styles")]}shouldUpdate(e){return(e.has("cols")||e.has("monthRows")||e.has("yearRows"))&&(this._monthRows=[...Array(this.monthRows)],this._yearRows=[...Array(this.yearRows)],this._cols=[...Array(this.cols)],this._yearsShown=this.cols*this.yearRows-2,this.firstYear=this.firstYear||this._today.getFullYear()-this._yearsShown,this._yearFocused=this._yearFocused||this.firstYear,this._monthFocused=this._monthFocused||0),e.has("minDate")&&this._adjustMinDate(),e.has("maxDate")&&this._adjustMaxDate(),e.has("year")&&this._adjustYear(this.year),e.has("month")&&(this.month||0===this.month?this._monthFocused=this.month:this._monthFocused=this._isMinYear?this._minMonth:0),!0}updated(e){super.updated(e),e.has("opened")&&(this._animateOpen(this.opened),this.dispatchEvent(new CustomEvent("opened-change",{bubbles:!0,detail:{value:this.opened}})))}async _animateOpen(e){e?(this._previousFocusedElement=A(document.activeElement),this._opened=!0,await this.updateComplete,this._updateNodes(),requestAnimationFrame((()=>{requestAnimationFrame((async()=>{this.setAttribute("visible",""),this._transitioning=!0,await this.updateComplete,this._nodes.skew.scrollTop=0}))}))):this._opened&&(this._previousFocusedElement.focus(),this._transitioning=!0,this.removeAttribute("visible"))}_onTransitionEnd(){this._transitioning=!1,this.opened?this._focusMonth():this._opened=!1}render(){return P`
      ${this._opened?P`
            <div
              class="main"
              role="dialog"
              aria-modal="true"
              aria-label="${this.t("bbva-form-calendar-selector-label")}"
              @keydown="${this._onMainKeydown}"
              @focusout="${this._onMainFocusout}"
            >
              <div
                class="skew ${this._transitioning?"transitioning":""}"
                @transitionend="${this._onTransitionEnd}"
              >
                <div class="content" @focus="${this._onContentFocus}" tabindex="-1">
                  <span tabindex="0" class="sr-only" @focus="${this._onTrapFocusFirst}"></span>
                  <div
                    class="cols"
                    @focusin="${this._onTableFocusin}"
                    @focusout="${this._onTableFocusout}"
                  >
                    ${this._monthsTpl} ${this._yearTpl}
                  </div>

                  ${this._messageTpl}
                  <bbva-divider-default class="divider" size="fit"></bbva-divider-default>

                  <div class="actions">
                    <bbva-type-link class="option" @click="${this._onBackClick}"
                      >${this.t("bbva-form-calendar-month-year-back")}</bbva-type-link
                    >
                    <bbva-button-default
                      class="action"
                      @click="${this._onConfirmClick}"
                      .disabled="${this._confirmDisabled}"
                      >${this.t("bbva-form-calendar-month-year-save")}</bbva-button-default
                    >
                  </div>
                  <span tabindex="0" class="sr-only" @focus="${this._onTrapFocusLast}"></span>
                </div>
              </div>
            </div>
          `:""}
    `}get _monthsTpl(){return P`
      <table class="month" role="grid">
        <caption>
          ${this.t("bbva-form-calendar-month-tag")}
        </caption>
        <tbody>
          ${this._monthRows.map(((e,t)=>P`
              <tr>
                ${this._cols.map(((e,a)=>this._monthButtonTpl(a,t)))}
              </tr>
            `))}
        </tbody>
      </table>
    `}_onPrevYear(){this.firstYear-=this._yearsShown}_onNextYear(){this.firstYear+=this._yearsShown}get _yearTpl(){return P`
      <table class="year" role="grid">
        <caption>
          <div class="year-container">
            <bbva-type-icon
              aria-hidden="true"
              class="arrow nav-year prev"
              icon="${ee}"
              size="24"
              @click="${this._onPrevYear}"
            ></bbva-type-icon>
            <span aria-hidden="true">${this.t("bbva-form-calendar-year-tag")}</span>
            <span class="sr-only" aria-live="polite">${this._yearTableLabel}</span>
            <bbva-type-icon
              aria-hidden="true"
              class="arrow nav-year next"
              icon="${te}"
              size="24"
              @click="${this._onNextYear}"
            ></bbva-type-icon>
          </div>
        </caption>
        <tbody>
          ${this._yearRows.map(((e,t)=>P`
              <tr>
                ${this._cols.map(((e,a)=>this._yearButtonTpl(a,t)))}
              </tr>
            `))}
        </tbody>
      </table>
    `}_monthButtonTpl(e,t){const a=e+t*this.cols,r=this._monthOutLimits(a);return P`
      <td>
        <button
          type="button"
          tabindex="${this._monthFocused===a?"0":"-1"}"
          aria-pressed="${this.month===a}"
          ?disabled="${r}"
          @keydown="${this._onMonthKeydown}"
          @click="${()=>this._onMonthClick(a)}"
        >
          <span aria-hidden="true">${this._tLabel("month",a,"s")}</span>
          <span class="sr-only">${this._tLabel("month",a,"l")}</span>
        </button>
      </td>
    `}_yearButtonTpl(e,t){const a=e+t*this.cols,r=this.firstYear+a-1,n=this._yearUnderMin(r)||this._yearOverMax(r);return P`
      <td>
        <button
          type="button"
          tabindex="${this._yearFocused===r?"0":"-1"}"
          aria-pressed="${this.year===r}"
          @keydown="${this._onYearKeydown}"
          @click="${()=>this._onYearClick(r)}"
          ?disabled="${n}"
        >
          <span>${r}</span>
        </button>
      </td>
    `}get _messageTpl(){return P` <div class="sr-only" aria-live="polite">${this._announcerText}</div> `}_announceMessage(e){clearTimeout(this._messageTimer),this._messageTimer=setTimeout((()=>{this._announcerText=e}),200)}get _lastYearShown(){return this.firstYear+this._yearsShown-1}get _isMinYear(){return this._minYear&&this.year===this._minYear}get _isMaxYear(){return this._maxYear&&this.year===this._maxYear}_yearUnderMin(e){return this._minYear&&e<this._minYear}_yearOverMax(e){return this._maxYear&&e>this._maxYear}_adjustYear(e){e&&this._yearUnderMin(e)?this.year=this._minYear:e&&this._yearOverMax(e)?this.year=this._maxYear:(this._yearFocused=e||this.firstYear,this._isMinYear&&this.month<this._minMonth&&(this.month=null),this._isMaxYear&&this.month>this._maxMonth&&(this.month=null))}_adjustMinDate(){this.minDate?(this._minDate=new Date(this.minDate),this._minYear=this._minDate.getFullYear(),this._minMonth=this._minDate.getMonth(),this.year&&this.year<this._minYear&&(this.year=this._minYear),this.year&&this._isMinYear&&(this.month||0===this.month)&&this.month<this._minMonth&&(this.month=this._minMonth),this._lastYearShown<this._minYear&&(this.firstYear=this._minYear,this._yearFocused=this.firstYear)):(this._minDate=null,this._minYear=null,this._minMonth=null)}_adjustMaxDate(){this.maxDate?(this._maxDate=new Date(this.maxDate),this._maxYear=this._maxDate.getFullYear(),this._maxMonth=this._maxDate.getMonth(),this.year&&this.year>this._maxYear&&(this.year=this._maxYear),this.year&&this._isMaxYear&&this.month&&this.month>this._maxMonth&&(this.month=this._maxMonth),this.firstYear>this._maxYear&&(this.firstYear=this._maxYear-this._yearsShown+1,this._yearFocused=this.firstYear)):(this._maxDate=null,this._maxYear=null,this._maxMonth=null)}_updateNodes(){const e=this.shadowRoot;this._nodes={tablesContainer:e.querySelector(".cols"),action:e.querySelector(".action"),skew:e.querySelector(".skew")}}get _yearsNavPrev(){return this.shadowRoot.querySelector(".nav-year.prev")}get _yearsNavNext(){return this.shadowRoot.querySelector(".nav-year.next")}_tLabel(e,t,a){return this.t(this.labels[e][t][a])}get _yearTableLabel(){return`${this.t("bbva-form-calendar-year-tag")} ${this.firstYear} - ${this.firstYear+17}`}get _confirmDisabled(){return!(this.month||0===this.month)||!this.year}async _setFocusTo(e){await this.updateComplete,this._activeButton(e).focus()}_activeButton(e){return this.shadowRoot.querySelector(`.${e} tbody [tabindex="0"]`)}get _activeElement(){return this.shadowRoot.activeElement||document.activeElement}_onMainKeydown(e){const{key:t}=e;"Escape"!==t&&"Esc"!==t||(e.preventDefault(),this.opened=!1)}_onMainFocusout(){requestAnimationFrame((()=>{const e=this.shadowRoot.contains(this._activeElement);this.opened&&!e&&(this.opened=!1)}))}_onConfirmClick(){this.opened=!1,this.dispatchEvent(new CustomEvent("form-calendar-selector-confirm",{bubbles:!0,detail:{month:this.month,year:this.year}}))}_onBackClick(){this.opened=!1,this.dispatchEvent(new CustomEvent("selector-back",{bubbles:!0}))}_onTableFocusin(){this._announceMessage(this.t("bbva-form-calendar-cursor-keys-message"))}async _onTableFocusout(){await this.updateComplete,this._nodes.tablesContainer.contains(this._activeElement)||this._announceMessage("")}_onContentFocus(){this._focusMonth()}_onTrapFocusFirst(){if(this._confirmDisabled){const e=this._yearsNavNext;return e?void e.focus():void this._focusYear()}this._nodes.action.focus()}_onTrapFocusLast(){this._focusMonth()}_focusMonth(){this._setFocusTo("month")}_onMonthKeydown(e){const{key:t}=e;switch(["ArrowUp","ArrowDown","ArrowLeft","ArrowRight","Home","End"].indexOf(t)>-1&&e.preventDefault(),t){case"ArrowDown":this._moveMonth(this.cols);break;case"ArrowUp":this._moveMonth(-1*this.cols);break;case"ArrowLeft":this._moveMonth(-1);break;case"ArrowRight":this._moveMonth(1);break;case"Home":e.ctrlKey?(this._monthFocused=0,this._focusMonth()):this._moveMonthColLimit(!1);break;case"End":e.ctrlKey?(this._monthFocused=this.cols*this.monthRows-1,this._focusMonth()):this._moveMonthColLimit(!0)}}_onMonthClick(e){this.month=e}_moveMonth(e){const t=this._monthFocused;if(t+e>this.cols*this.monthRows-1||t+e<0)return;const a=t+e;this._monthOutLimits(a)||(this._monthFocused=a,this._focusMonth())}_moveMonthColLimit(e){const t=Math.floor(this._monthFocused/this.cols)*this.cols,a=e?t+this.cols-1:t;this._monthOutLimits(a)||(this._monthFocused=a,this._focusMonth())}_monthOutLimits(e){const t=this._isMinYear&&e<this._minMonth,a=this._isMaxYear&&e>this._maxMonth;return t||a}_focusYear(e){(e||0===e)&&(this._yearFocused=this.firstYear+e),this._setFocusTo("year")}_onYearKeydown(e){const{key:t}=e;switch(["ArrowUp","ArrowDown","ArrowLeft","ArrowRight","Home","End","PageUp","PageDown"].indexOf(t)>-1&&e.preventDefault(),t){case"ArrowDown":this._moveYear(this.cols);break;case"ArrowUp":this._moveYear(-1*this.cols);break;case"ArrowLeft":this._moveYear(-1);break;case"ArrowRight":this._moveYear(1);break;case"Home":e.ctrlKey?(this._yearFocused=this.firstYear,this._focusYear()):this._moveYearColLimit(!1);break;case"End":e.ctrlKey?(this._yearFocused=this._lastYearShown,this._focusYear()):this._moveYearColLimit(!0);break;case"PageUp":this._moveYearPage(!1,!0);break;case"PageDown":this._moveYearPage(!0,!0)}}_onYearClick(e){this.year=e}_onYearNavKeydown(e,t){const{key:a}=e;if(["ArrowUp","ArrowDown","ArrowLeft","ArrowRight","Home","End"].indexOf(a)>-1&&e.preventDefault(),t)switch(a){case"ArrowUp":this._focusYear(this._yearsShown-this.cols);break;case"ArrowLeft":this._focusYear(this._yearsShown-1);break;case"Home":e.ctrlKey?this._focusYear(0):this._focusYear(this._yearsShown-this.cols+1)}else switch(a){case"ArrowDown":this._focusYear(this.cols-1);break;case"ArrowRight":this._focusYear(0);break;case"End":e.ctrlKey?this._focusYear(this._yearsShown-1):this._focusYear(this.cols-2)}}_moveYear(e){const t=this._yearFocused+e,a=this.firstYear,r=this.firstYear+this._yearsShown-1;if(!(t<a-1||t>r+1||this._yearOutLimits(t))){if(t===a-1){const e=this._yearsNavPrev;return this._yearFocused=a,void e.focus()}if(t===r+1){const e=this._yearsNavNext;return this._yearFocused=r,void e.focus()}this._yearFocused+=e,this._focusYear()}}_moveYearColLimit(e){const t=this.firstYear-1,a=this._yearFocused-t,r=Math.floor(a/this.cols)*this.cols,n=e?r+this.cols-1:r;if(!this._yearOutLimits(n+t)){if(0===n){const e=this._yearsNavPrev;return this._yearFocused=this.firstYear,void e.focus()}if(n===this._yearsShown+1){const e=this._yearsNavNext;return this._yearFocused=this.firstYear+this._yearsShown-1,void e.focus()}this._yearFocused=n+t,this._focusYear()}}_moveYearPage(e,t){const a=e?this._yearsShown:-1*this._yearsShown,r=this._yearFocused+a,n=this._yearUnderMin(r),o=this._yearOverMax(r);let i=r;n&&(i=this._minYear),o&&(i=this._maxYear);const l=i<this.firstYear||i>this._lastYearShown?this.firstYear+a:this.firstYear,s=this._minYear&&l<=this._minYear&&l+this._yearsShown>this._minYear,c=this._maxYear&&l<=this._maxYear&&l+this._yearsShown>this._maxYear;this.firstYear=l,this._yearFocused=i,(t||s||c)&&this._focusYear()}_yearOutLimits(e){const t=this._yearUnderMin(e),a=this._yearOverMax(e);return t||a}}var re=D`
:host {
  --_form-calendar-first-dot-color:
      var(--bbva-form-calendar--_ambient--first-dot-color,
          var(--bbva-form-calendar--custom--primary-ambient--first-dot-color,
              ${o("colorPrimaryCategoriesExpectedIncomeDefault",i)}));
  --_form-calendar-more-dot-color:
      var(--bbva-form-calendar--_ambient--more-dot-color,
          var(--bbva-form-calendar--custom--primary-ambient--more-dot-color,
              ${o("colorPrimaryCategoriesExpectedExpensesDefault",i)}));
  --_form-calendar-tertiary-dot-color:
      var(--bbva-form-calendar--_ambient--tertiary-dot-color,
          var(--bbva-form-calendar--custom--primary-ambient--tertiary-dot-color,
          ${o("colorPrimaryCategoriesExpectedMovementDefault",i)}));
  --_form-calendar-day-first-dot-color-selected:
      var(--bbva-form-calendar--_ambient--day-first-dot-color-selected,
          var(--bbva-form-calendar--custom--primary-ambient--day-first-dot-color,
              ${o("colorPrimaryCategoriesExpectedIncomeSelected",i)}));
  --_form-calendar-day-more-dot-color-selected:
      var(--bbva-form-calendar--_ambient--day-more-dot-color-selected,
          var(--bbva-form-calendar--custom--primary-ambient-day-more-dot-color-selected,
              ${o("colorPrimaryCategoriesExpectedExpensesSelected",i)}));
  --_form-calendar-day-tertiary-dot-color-selected:
      var(--bbva-form-calendar--_ambient--day-tertiary-dot-color-selected,
          var(--bbva-form-calendar--custom--primary-ambient-day-tertiary-dot-color-selected,
          ${o("colorPrimaryCategoriesExpectedMovementSelected",i)}));
  --_form-calendar-arrow-color:
      var(--bbva-form-calendar--_ambient--arrow-color,
          var(--bbva-form-calendar--custom--primary-ambient--arrow-color,
              ${o("colorPrimaryLinkMainDefault",i)}));
  --_form-calendar-arrow-active-color:
      var(--bbva-form-calendar--_ambient--arrow-active-color,
          var(--bbva-form-calendar--custom--primary-ambient--arrow-active-color,
              ${o("colorPrimaryLinkMainPressed",i)}));
  --_form-calendar-flatpickr-day-color:
      var(--bbva-form-calendar--_ambient--flatpickr-day-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-day-color,
              ${o("colorPrimaryLinkComplementaryDefault",i)}));
  --_form-calendar-flatpickr-inrange-bg-color:
      var(--bbva-form-calendar--_ambient--flatpickr-inrange-bg-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-inrange-bg-color,
              ${o("colorPrimarySelectionInteraction01BackgroundSelected",i)}));
  --_form-calendar-flatpickr-inrange-color:
      var(--bbva-form-calendar--_ambient--flatpickr-inrange-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-inrange-color,
              ${o("colorPrimarySelectionInteraction01TextSelected",i)}));
  --_form-calendar-flatpickr-inrange-prevmonthday-color:
      var(--bbva-form-calendar--_ambient--flatpickr-inrange-prevmonthday-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-inrange-prevmonthday-color,
              ${o("colorPrimarySelectionInteraction01TextSelected",i)}));
  --_form-calendar-flatpickr-readOnly-color:
      var(--bbva-form-calendar--_ambient--flatpickr-readOnly-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-readOnly-color,
              ${o("colorPrimaryText02Default",i)}));
  --_form-calendar-flatpickr-day-selected-color:
      var(--bbva-form-calendar--_ambient--flatpickr-day-selected-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-day-selected-color,
              ${o("colorPrimarySelectionInteraction01TextSelected",i)}));
  --_form-calendar-flatpickr-day-selected-bg-color:
      var(--bbva-form-calendar--_ambient--flatpickr-day-selected-bg-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-day-selected-bg-color,
              ${o("colorPrimarySelectionInteraction01BackgroundSelected",i)}));
  --_form-calendar-flatpickr-day-today-color:
      var(--bbva-form-calendar--_ambient--flatpickr-day-today-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-day-today-color,
              ${o("colorPrimaryLinkMainDefault",i)}));
  --_form-calendar-flatpickr-weekday-color:
      var(--bbva-form-calendar--_ambient--flatpickr-weekday-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-weekday-color,
              ${o("colorPrimaryText01Default",i)}));
  --_form-calendar-flatpickr-currentmonth-color:
      var(--bbva-form-calendar--_ambient--flatpickr-currentmonth-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-currentmonth-color,
              ${o("colorPrimaryText01Default",i)}));
  --_form-calendar-input-color:
      var(--bbva-form-calendar--_ambient--input-color,
          var(--bbva-form-calendar--custom--primary-ambient--input-color,
              ${o("colorPrimaryText01Default",i)}));
  --_form-calendar-flatpickr-day-today-range-color:
      var(--bbva-form-calendar--_ambient--flatpickr-day-today-range-color,
          var(--bbva-form-calendar--custom--primary-ambient--flatpickr-day-today-range-color,
              ${o("colorPrimarySurfaceAmbientDefault",i)}));
  --_form-calendar-bg-color:
      var(--bbva-form-calendar--_ambient--bg-color,
          var(--bbva-form-calendar--custom--primary-ambient--bg-color,
              ${o("colorPrimarySurfaceAmbientDefault",i)}));
  --_form-calendar-focus-color:
      var(--bbva-form-calendar--_ambient--focus-color,
          var(--bbva-form-calendar--custom--primary-ambient--focus-color,
              ${o("colorPrimarySurfaceAmbientFocus",i)}));
}
`;const ne=D`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-calendar--_ambient--first-dot-color: initial;
    --bbva-form-calendar--_ambient--more-dot-color: initial;
    --bbva-form-calendar--_ambient--day-first-dot-color-selected: initial;
    --bbva-form-calendar--_ambient--day-more-dot-color-selected: initial;
    --bbva-form-calendar--_ambient--arrow-color: initial;
    --bbva-form-calendar--_ambient--arrow-active-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-day-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-inrange-bg-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-inrange-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-inrange-prevmonthday-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-readOnly-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-day-selected-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-day-selected-bg-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-day-today-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-weekday-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-currentmonth-color: initial;
    --bbva-form-calendar--_ambient--input-color: initial;
    --bbva-form-calendar--_ambient--flatpickr-day-today-range-color: initial;
    --bbva-form-calendar--_ambient--bg-color: initial;
    --bbva-form-calendar--_ambient--focus-color: initial;
  }
`,oe=D`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-calendar--_ambient--first-dot-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--first-dot-color,
      ${o("colorPrimaryAltCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--more-dot-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--more-dot-color,
      ${o("colorPrimaryAltCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--tertiary-dot-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--tertiary-dot-color,
      ${o("colorPrimaryAltCategoriesExpectedMovementDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-first-dot-color-selected: var(
      --bbva-form-calendar--custom--primary-alt-ambient--day-first-dot-color-selected,
      ${o("colorSecondaryCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-more-dot-color-selected: var(
      --bbva-form-calendar--custom--primary-alt-ambient--day-more-dot-color-selected,
      ${o("colorSecondaryCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-tertiary-dot-color-selected: var(
      --bbva-form-calendar--custom--primary-alt-ambient--day-tertiary-dot-color-selected,
      ${o("colorPrimaryAltCategoriesExpectedMovementSelected",i)}
    );
    --bbva-form-calendar--_ambient--arrow-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--arrow-color,
      ${o("colorPrimaryAltLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--arrow-active-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--arrow-active-color,
      ${o("colorPrimaryAltLinkMainPressed",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-day-color,
      ${o("colorPrimaryAltLinkComplementaryDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-bg-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-inrange-bg-color,
      ${o("colorPrimaryAltSelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-inrange-color,
      ${o("colorPrimaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-prevmonthday-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-inrange-prevmonthday-color,
      ${o("colorPrimaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-readOnly-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-readOnly-color,
      ${o("colorPrimaryAltText02Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-day-selected-color,
      ${o("colorPrimaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-bg-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-day-selected-bg-color,
      ${o("colorPrimaryAltSelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-day-today-color,
      ${o("colorPrimaryAltLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-weekday-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-weekday-color,
      ${o("colorPrimaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-currentmonth-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-currentmonth-color,
      ${o("colorPrimaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--input-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--input-color,
      ${o("colorPrimaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-range-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--flatpickr-day-today-range-color,
      ${o("colorPrimaryAltSurfaceAmbientDefault",i)}
    );

    --bbva-form-calendar--_ambient--bg-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--bg-color,
      ${o("colorPrimaryAltSurfaceAmbientDefault",i)}
    );

    --bbva-form-calendar--_ambient--focus-color: var(
      --bbva-form-calendar--custom--primary-alt-ambient--focus-color,
      ${o("colorPrimaryAltSurfaceAmbientFocus",i)}
    );
  }
`,ie=D`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-calendar--_ambient--first-dot-color: var(
      --bbva-form-calendar--custom--secondary-ambient--first-dot-color,
      ${o("colorSecondaryCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--more-dot-color: var(
      --bbva-form-calendar--custom--secondary-ambient--more-dot-color,
      ${o("colorSecondaryCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--tertiary-dot-color: var(
      --bbva-form-calendar--custom--secondary-ambient--tertiary-dot-color,
      ${o("colorPrimaryAltCategoriesExpectedMovementSelected",i)}
    );
    --bbva-form-calendar--_ambient--day-first-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-ambient--day-first-dot-color-selected,
      ${o("colorPrimaryAltCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-more-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-ambient--day-more-dot-color-selected,
      ${o("colorSecondaryCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-tertiary-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-ambient--day-tertiary-dot-color-selected,
      #c569b9
    );
    --bbva-form-calendar--_ambient--arrow-color: var(
      --bbva-form-calendar--custom--secondary-ambient--arrow-color,
      ${o("colorSecondaryLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--arrow-active-color: var(
      --bbva-form-calendar--custom--secondary-ambient--arrow-active-color,
      ${o("colorSecondaryLinkMainPressed",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-day-color,
      ${o("colorSecondaryLinkComplementaryDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-bg-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-inrange-bg-color,
      ${o("colorSecondarySelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-inrange-color,
      ${o("colorSecondarySelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-prevmonthday-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-inrange-prevmonthday-color,
      ${o("colorSecondarySelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-readOnly-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-readOnly-color,
      ${o("colorSecondaryText02Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-day-selected-color,
      ${o("colorSecondarySelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-bg-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-day-selected-bg-color,
      ${o("colorSecondarySelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-day-today-color,
      ${o("colorSecondaryLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-weekday-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-weekday-color,
      ${o("colorSecondaryText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-currentmonth-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-currentmonth-color,
      ${o("colorSecondaryText01Default",i)}
    );
    --bbva-form-calendar--_ambient--input-color: var(
      --bbva-form-calendar--custom--secondary-ambient--input-color,
      ${o("colorSecondaryText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-range-color: var(
      --bbva-form-calendar--custom--secondary-ambient--flatpickr-day-today-range-color,
      ${o("colorSecondarySurfaceAmbientDefault",i)}
    );
    --bbva-form-calendar--_ambient--bg-color: var(
      --bbva-form-calendar--custom--secondary-ambient--bg-color,
      ${o("colorSecondarySurfaceAmbientDefault",i)}
    );
    --bbva-form-calendar--_ambient--focus-color: var(
      --bbva-form-calendar--custom--secondary-ambient--focus-color,
      ${o("colorSecondarySurfaceAmbientFocus",i)}
    );
  }
`,le=D`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-calendar--_ambient--first-dot-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--first-dot-color,
      ${o("colorSecondaryAltCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--more-dot-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--more-dot-color,
      ${o("colorSecondaryAltCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--tertiary-dot-color: var(
      --bbva-form-calendar--custom--secondary-ambient--tertiary-dot-color,
      ${o("colorPrimaryAltCategoriesExpectedMovementSelected",i)}
    );
    --bbva-form-calendar--_ambient--day-first-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--day-first-dot-color-selected,
      ${o("colorPrimaryAltCategoriesExpectedIncomeDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-more-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--day-more-dot-color-selected,
      ${o("colorSecondaryAltCategoriesExpectedExpensesDefault",i)}
    );
    --bbva-form-calendar--_ambient--day-tertiary-dot-color-selected: var(
      --bbva-form-calendar--custom--secondary-ambient--day-tertiary-dot-color-selected,
      #c569b9
    );
    --bbva-form-calendar--_ambient--arrow-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--arrow-color,
      ${o("colorSecondaryAltLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--arrow-active-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--arrow-active-color,
      ${o("colorSecondaryAltLinkMainPressed",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-day-color,
      ${o("colorSecondaryAltLinkComplementaryDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-bg-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-inrange-bg-color,
      ${o("colorSecondaryAltSelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-inrange-color,
      ${o("colorSecondaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-inrange-prevmonthday-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-inrange-prevmonthday-color,
      ${o("colorSecondaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-readOnly-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-readOnly-color,
      ${o("colorSecondaryAltText02Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-day-selected-color,
      ${o("colorSecondaryAltSelectionInteraction01TextSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-selected-bg-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-day-selected-bg-color,
      ${o("colorSecondaryAltSelectionInteraction01BackgroundSelected",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-day-today-color,
      ${o("colorSecondaryAltLinkMainDefault",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-weekday-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-weekday-color,
      ${o("colorSecondaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-currentmonth-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-currentmonth-color,
      ${o("colorSecondaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--input-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--input-color,
      ${o("colorSecondaryAltText01Default",i)}
    );
    --bbva-form-calendar--_ambient--flatpickr-day-today-range-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--flatpickr-day-today-range-color,
      ${o("colorSecondaryAltSurfaceAmbientDefault",i)}
    );
    --bbva-form-calendar--_ambient--bg-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--bg-color,
      ${o("colorSecondaryAltSurfaceAmbientDefault",i)}
    );
    --bbva-form-calendar--_ambient--focus-color: var(
      --bbva-form-calendar--custom--secondary-alt-ambient--focus-color,
      ${o("colorSecondaryAltSurfaceAmbientFocus",i)}
    );
  }
`;const se=l([Object.freeze({__proto__:null,primary:ne,primaryAlt:oe,secondary:ie,secondaryAlt:le}),s,c,d,m,u]),ce=Object.values(se);var de=D`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: flex;
  width: 100%;
  max-width: 20rem;
  box-sizing: border-box;
  flex-direction: column;
  background-color: transparent;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

button {
  padding: 0;
  border: none;
  background: none;
  color: unset;
}

.container {
  position: relative;
  padding: 1rem 1rem 2rem;
}

.flatpickr-rContainer {
  flex-basis: 14.2857142857%;
}

.flatpickr-calendar:focus {
  outline: none;
}

.flatpickr-days {
  display: flex;
  align-items: center;
  justify-content: center;
}

.flatpickr-day {
  position: relative;
  display: flex;
  width: 14.2857142857%;
  height: 2.5rem;
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  color: var(--_form-calendar-flatpickr-day-color);
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${k(x.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${k(x.medium.fontWeight)});
  line-height: token "foundations.lineHeight.typeSmall";
}
.flatpickr-day[aria-disabled=true] {
  cursor: default;
}
.flatpickr-day.flatpickr-disabled {
  cursor: default;
  opacity: 0.4;
  pointer-events: none;
}
.flatpickr-day.prevMonthDay.inRange {
  color: var(--_form-calendar-flatpickr-inrange-prevmonthday-color);
}
.flatpickr-day.inRange {
  width: 100%;
  background-color: var(--_form-calendar-flatpickr-inrange-bg-color);
  color: var(--_form-calendar-flatpickr-inrange-color);
  --_form-calendar-first-dot-color: var(--_form-calendar-day-first-dot-color-selected);
  --_form-calendar-more-dot-color: var(--_form-calendar-day-more-dot-color-selected);
  --_form-calendar-tertiary-dot-color: var(--_form-calendar-day-tertiary-dot-color-selected);
}
.flatpickr-day.selected {
  position: relative;
  display: flex;
  width: 2.5rem;
  height: 2.5rem;
  align-items: center;
  justify-content: center;
  border-radius: 50%;
  margin-right: calc(14.2857142857% - 39px);
  margin-left: calc(14.2857142857% - 39px);
  background-color: var(--_form-calendar-flatpickr-day-selected-bg-color);
  color: var(--_form-calendar-flatpickr-day-selected-color);
  --_form-calendar-first-dot-color: var(--_form-calendar-day-first-dot-color-selected);
  --_form-calendar-more-dot-color: var(--_form-calendar-day-more-dot-color-selected);
}
.flatpickr-day.selected.startRange {
  width: 100%;
  border-radius: 20px 0 0 20px;
}
.flatpickr-day.selected.endRange {
  width: 100%;
  border-radius: 0 20px 20px 0;
}
@media (min-width: 600px) and (max-width: 992px) {
  .flatpickr-day.selected {
    margin-right: calc(14.2857142857% - 59px);
    margin-left: calc(14.2857142857% - 59px);
  }
}
@media (min-width: 992px) and (max-width: 1200px) {
  .flatpickr-day.selected {
    margin-right: calc(14.2857142857% - 89px);
    margin-left: calc(14.2857142857% - 89px);
  }
}
.flatpickr-day:focus-visible {
  outline: 0.125rem solid var(--_form-calendar-focus-color);
}

.flatpickr-day.today {
  color: var(--_form-calendar-flatpickr-day-today-color);
}
.flatpickr-day.today.selected, .flatpickr-day.today.inRange {
  color: var(--_form-calendar-flatpickr-day-today-range-color);
}

.flatpickr-day.prevMonthDay,
.flatpickr-day.nextMonthDay {
  color: var(--_form-calendar-flatpickr-readOnly-color);
  opacity: 0.4;
}
.flatpickr-day.prevMonthDay.selected,
.flatpickr-day.nextMonthDay.selected {
  color: var(--_form-calendar-flatpickr-day-selected-color);
}

.dayContainer {
  display: grid;
  flex-basis: 100%;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  justify-items: center;
}

.flatpickr-weekdaycontainer {
  display: grid;
  flex-basis: 100%;
  margin: 1rem 0 0.5rem;
  color: var(--_form-calendar-flatpickr-weekday-color);
  font-size: var(--typographyType3XSmall, ${k(w.type3XSmall)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${k(x.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${k(x.medium.fontWeight)});
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  line-height: var(--lineHeightType3XSmall, ${k(S.type3XSmall)});
  text-transform: uppercase;
}

.flatpickr-weekday {
  display: flex;
  flex-basis: 14.2857142857%;
  align-items: center;
  justify-content: center;
}

.flatpickr-next-month,
.flatpickr-prev-month,
.flatpickr-current-month {
  display: flex;
  box-sizing: border-box;
  flex-shrink: 0;
  align-items: center;
  justify-content: center;
}
.flatpickr-next-month:focus-visible,
.flatpickr-prev-month:focus-visible,
.flatpickr-current-month:focus-visible {
  outline: 0.125rem solid var(--_form-calendar-focus-color);
  outline-offset: 8px;
}
.flatpickr-next-month .arrow,
.flatpickr-prev-month .arrow,
.flatpickr-current-month .arrow {
  cursor: pointer;
  fill: var(--_form-calendar-arrow-color);
}
.flatpickr-next-month.flatpickr-disabled .arrow,
.flatpickr-prev-month.flatpickr-disabled .arrow,
.flatpickr-current-month.flatpickr-disabled .arrow {
  cursor: default;
  opacity: 0.4;
  pointer-events: none;
}
.flatpickr-next-month:active:not(.flatpickr-disabled) .arrow,
.flatpickr-prev-month:active:not(.flatpickr-disabled) .arrow,
.flatpickr-current-month:active:not(.flatpickr-disabled) .arrow {
  fill: var(--_form-calendar-arrow-active-color);
}

.flatpickr-months {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.flatpickr-current-month {
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--_form-calendar-flatpickr-currentmonth-color);
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${k(x.mediumItalic.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
  user-select: none;
}

.cur-year {
  margin-left: 0.5rem;
}

.hidden {
  visibility: hidden;
}

.dots {
  position: absolute;
  bottom: 4px;
  display: flex;
}

.dot {
  width: 0.25rem;
  height: 0.25rem;
  border-radius: 50%;
}
.dot.more, .dot.tertiary {
  border-radius: 0;
}
.dot ~ .dot {
  margin-left: 0.25rem;
}
.dot.first {
  background-color: var(--_form-calendar-first-dot-color);
}
.dot.more {
  background-color: var(--_form-calendar-more-dot-color);
}
.dot.tertiary {
  border-right: 0.125rem solid transparent;
  border-bottom: 0.25rem solid transparent;
  border-bottom-color: var(--_form-calendar-tertiary-dot-color);
  border-left: 0.125rem solid transparent;
  background-color: transparent;
}

[data-tag-name=bbva-type-icon] {
  --bbva-type-icon-color: var(--_form-calendar-arrow-color);
  display: block;
  width: 1.5rem;
  height: 1.5rem;
}

[data-tag-name=bbva-notification-help] {
  padding-top: 0.5rem;
}

:host([loading]) {
  overflow: hidden;
  height: 18.75rem;
  background-color: var(--_skeleton-default-bg-color);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-position: calc(0% + 16px) 12px, calc(50% + 75px) 12px, calc(100% - 16px) 12px, 16px 50px, 16px 84px, 16px 118px, 16px 152px, 16px 186px, 16px 220px;
  mask-repeat: no-repeat;
  mask-size: 16px 16px, calc((150px * 2) + (16px/ 2)) 16px, 16px 16px, calc((88% * 2) + (16px/ 2)) 16px, calc((88% * 2) + (16px/ 2)) 16px, calc((88% * 2) + (16px/ 2)) 16px, calc((88% * 2) + (16px/ 2)) 16px, calc((88% * 2) + (16px/ 2)) 16px, calc((88% * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /* 
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading])::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host .desktop #formCalendar {
  margin-bottom: 1rem;
}
:host .desktop .flatpickr-weekdays {
  display: flex;
  flex-direction: row;
}
:host .desktop .flatpickr-weekdays .flatpickr-weekdaycontainer {
  flex-grow: 4;
  padding: 0 16px;
}
:host .desktop .flatpickr-days {
  align-items: start;
}
:host .desktop .flatpickr-days .dayContainer {
  padding: 0 16px;
}
:host .desktop .flatpickr-days .dayContainer:nth-child(1) .prevMonthDay, :host .desktop .flatpickr-days .dayContainer:nth-child(2) .nextMonthDay {
  visibility: initial;
}
:host .desktop .flatpickr-months {
  padding: 0 1rem;
}
:host .desktop .flatpickr-months .flatpickr-month {
  display: flex;
  width: 50%;
  justify-content: center;
}
:host .desktop .flatpickr-months .flatpickr-month:nth-child(2) {
  padding-right: 30px;
}
:host .desktop .flatpickr-months .flatpickr-month:nth-child(3) {
  padding-left: 30px;
}

.actions {
  display: flex;
  align-items: center;
  justify-content: flex-start;
  padding: 1rem 1rem 1rem 0;
  margin-top: auto;
}

.confirm {
  margin-left: auto;
}

.options .option {
  margin-left: 0.5rem;
}
.options :first-child {
  margin-left: 1rem;
}

@media (width > 600px) {
  :host {
    max-width: 40rem;
  }
}
`;const{flatpickr:me}=window,ue=M(),fe=$(),he=I(),be=Y();class pe extends(e(f(h(C(E))))){static get is(){return"bbva-form-calendar"}static get scopedElements(){return{"bbva-type-icon":t,"bbva-notification-help":b,"bbva-button-default":a,"bbva-type-link":r,"bbva-divider-default":n,"bbva-form-calendar-month-year-selector":ae}}static get properties(){return{mode:{type:String},locale:{type:String},disable:{type:Array},enable:{type:Array},maxDate:{type:String,attribute:"max-date"},minDate:{type:String,attribute:"min-date"},defaultDate:{type:String,attribute:"default-date"},selectedDate:{type:String,attribute:"selected-date"},selectedEndDate:{type:String,attribute:"selected-end-date"},defaultMonth:{type:String,attribute:"default-month"},events:{type:Object},notificationHelpIcon:{type:String,attribute:"notification-help-icon"},notificationHelpType:{type:String,attribute:"notification-help-type"},notificationHelpText:{type:String,attribute:"notification-help-text"},_dynamicMessage:{type:String},disabledNavigation:{type:Boolean,attribute:"disabled-navigation"},loading:{type:Boolean,reflect:!0},_desktop:{type:Boolean,attribute:!1,state:!0},_selectorOpened:{type:Boolean,attribute:!1},_selectorYear:{type:Number,attribute:!1}}}static get styles(){return[super.styles,de,re,ce,F("bbva-form-calendar-shared-styles")]}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}static _setDaysAttribute(e){e&&e.forEach((e=>{e.addEventListener("mousedown",(e=>e.stopPropagation()),!0),e.removeAttribute("role"),e.setAttribute("aria-disabled","true"),e.removeAttribute("tabindex")}))}constructor(){super(),this.enable=[],this.disable=[],this.events={},this.defaultDate="",this.defaultMonth="",this.locale="es",this.mode="single",this.notificationHelpIcon=he,this.notificationHelpType="alert",this.notificationHelpText="",this.disabledNavigation=!1,this._dynamicMessage="",this._firstClick=!1,this._oldDaySelected="",this._cleanSelectedDate=!1,this.loading=!1,this._today=new Date,this._today.setHours(0,0,0,0),this._selectorOpened=!1,this._selectorIndex=0}_renderIcon(e,t){pe.render(P`<bbva-type-icon
        aria-hidden="true"
        class="arrow"
        icon="${e}"
        size="24"
      ></bbva-type-icon>`,this._calendar[t],{scopeName:"bbva-form-calendar",eventContext:this})}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._configureCalendar()}_configureCalendar(){const e=this.shadowRoot.querySelector("#formCalendar");if(this.options={showMonths:this._desktop?2:1,appendTo:e,disableMobile:!0,mode:this.mode,clickOpens:!1,defaultDate:this.defaultDate,maxDate:this.maxDate,minDate:this.minDate,yearSelectorType:"static",monthSelectorType:"static",disable:this.disable,enable:this.enable,locale:this.locale,prevArrow:"",nextArrow:"",onChange:(e,t,a)=>{var r,n;const o=null==a?void 0:a.selectedDateElem,i=null==o?void 0:o.ariaLabel,l=null==o?void 0:o.getAttribute("aria-label"),s=null==e?void 0:e.map((e=>e.toDateString())),c=null==s?void 0:s.filter(Boolean).length;"range"===this.mode&&c>1?this._dynamicMessage=`${this._rangeFromLabel} ${s[0]}, ${this._rangeToLabel} ${s[1]}`:"multiple"===this.mode?this._dynamicMessage=null!=e&&e.length?`${t}, ${this._selectedDayLabel}`:this._unselectedDayLabel:(this._cleanSelectedDate=this._cleanDate(e,s),this._oldDaySelected=s,this._cleanSelectedDate?(this._firstClick=!1,null==o||o.setAttribute("aria-label",l)):(this._firstClick=!0,null==o||o.setAttribute("aria-label",`${l}, ${this._selectedDayLabel}`)),this._dynamicMessage=null!=e&&e.length?`${i}, ${this._selectedDayLabel}`:`${i}, ${this._unselectedDayLabel}`),this.dispatchEvent(new CustomEvent("form-calendar-select-change",{bubbles:!0,composed:!0,detail:{mode:this.mode,currentMonth:this._formatMonth,selected:this._cleanSelectedDate?[]:s,events:(null===(r=this.events)||void 0===r?void 0:r[null===(n=e[0])||void 0===n?void 0:n.toDateString()])||[]}})),this._cleanSelectedDate&&a.clear(!0,!1)},onMonthChange:(e,t)=>{this._dynamicMessage=this._messageChangeMonth,this.dispatchEvent(new CustomEvent("form-calendar-select-change-month",{bubbles:!0,composed:!0,detail:{currentMonth:this._formatMonth,selectedDate:t}})),this._desktop&&(this._manageYearSelector(),this._manageArrows())},onReady:(e,t,a)=>{var r,n;const o=null==a||null===(r=a.l10n)||void 0===r||null===(n=r.weekdays)||void 0===n?void 0:n.longhand;if("es"===this.locale){const[e]=o;o.shift(),o.push(e)}null==a||a.calendarContainer.removeAttribute("tabindex"),null==a||a.daysContainer.removeAttribute("tabindex")},onDayCreate:(e,t,a,r)=>{var n,o,i,l;const s=this.events[r.dateObj.toDateString()],c=null==a||null===(n=a.weekdayContainer)||void 0===n||null===(o=n.childNodes[0])||void 0===o?void 0:o.children,d=null==a||null===(i=a.l10n)||void 0===i||null===(l=i.weekdays)||void 0===l?void 0:l.longhand,m=r.classList.contains("flatpickr-disabled"),u=r.getAttribute("aria-label");let f;for(f=0;f<(null==c?void 0:c.length);f+=1)c[f].setAttribute("aria-label",d[f]);if(m?(r.setAttribute("aria-disabled","true"),r.setAttribute("aria-label",`${u}, ${this._disabledItemLabel}`)):(r.setAttribute("role","button"),r.setAttribute("tabindex","0")),s&&s.length>0){const e=s.map((e=>e.name||e));r.setAttribute("aria-label",`${u}, ${e.join(", ")}`),L(P`
              ${r.innerHTML}
              <span class="dots">
                ${s.map((e=>P` <span
                      class="dot
                      ${O({first:!e.type||"primary"===e.type,more:!e.type&&1===s.indexOf(e)||"secondary"===e.type,tertiary:!e.type&&2===s.indexOf(e)||"tertiary"===e.type,square:"square"===e.dotShape,triangle:"triangle"===e.dotShape})}"
                    ></span>`))}
              </span>
            `,r)}}},this._calendar=me(this,this.options),this.defaultMonth){const e=this._calendar.parseDate(this.defaultMonth,"Y-m");this._calendar.latestSelectedDateObj=e,this._calendar.jumpToDate(e)}this._desktop?(this._manageYearSelector(),this._manageArrows()):this.disabledNavigation||this._manageArrows()}updated(e){var t;super.updated(e),e.forEach(((e,t)=>{this._calendar.set(t,this[t])}));const a=null===(t=this._calendar)||void 0===t?void 0:t.selectedDateElem,r=null==a?void 0:a.getAttribute("aria-label");if(a){const e=`${r}, ${this._selectedDayLabel}`;null==a||a.setAttribute("aria-label",`${e}`)}this.disabledNavigation&&!this._desktop?this._disableNavigation():this._manageArrows(),this._manageDisabledDays(),e.has("_desktop")&&(this._configureCalendar(),this._desktop?(this._manageYearSelector(),this._manageArrows()):this.disabledNavigation||this._manageArrows())}get _actionsTpl(){return this._desktop?P`
          <bbva-divider-default class="divider" size="fit"></bbva-divider-default>
          <div class="actions">
            <div class="options">
              <slot name="options">
                <bbva-type-link class="option" @click="${()=>this._onOptionClick(0)}"
                  >${this.t("bbva-form-calendar-month-year-today")}</bbva-type-link
                >
                <bbva-type-link class="option" @click="${()=>this._onOptionClick(-1)}"
                  >${this.t("bbva-form-calendar-month-year-yesterday")}</bbva-type-link
                >
                <bbva-type-link class="option" @click="${()=>this._onOptionClick(-7,0)}"
                  >${this.t("bbva-form-calendar-month-year-last-week")}</bbva-type-link
                >
                <bbva-type-link class="option" @click="${()=>this._onOptionClick(-30,0)}"
                  >${this.t("bbva-form-calendar-month-year-last-month")}</bbva-type-link
                >
              </slot>
            </div>
            <bbva-button-default class="confirm" @click="${this._onConfirmClick}">
              Guardar
            </bbva-button-default>
          </div>
        `:""}get _yearMonthTpl(){return P`
      <bbva-form-calendar-month-year-selector
        .opened="${this._selectorOpened}"
        .month="${this._selectorMonth}"
        .minDate="${this.minDate}"
        .maxDate="${this.maxDate}"
        .year="${this._selectorYear}"
        .firstYear="${this.selectorFirstYear}"
        @opened-change="${this._onSelectorOpenedChange}"
        @form-calendar-selector-confirm="${this._onSelectorConfirm}"
      ></bbva-form-calendar-month-year-selector>
    `}_onConfirmClick(){const e={start:this._formatDateEvent(this._calendar.selectedDates[0]),end:this._formatDateEvent(this._calendar.selectedDates[1])};this.dispatchEvent(new CustomEvent("form-calendar-date-confirm",{bubbles:!0,detail:e}))}_onOptionClick(e,t){const a=new Date(this._today),r=[];if(a.setDate(a.getDate()+e),this.selectedDate=a,r.push(a),void 0!==t){const e=new Date(this._today);e.setDate(e.getDate()+t),this.selectedEndDate=e,"range"===this.mode&&r.push(e)}else this.selectedEndDate=null;this._calendar.selectedDates=r,this.dispatchEvent(new CustomEvent("form-calendar-date-selected",{bubbles:!0,detail:this._getDateSelected()}))}_getDateSelected(){return{start:this._formatDateEvent(this.selectedDate),end:this._formatDateEvent(this.selectedEndDate)}}_formatDateEvent(e){const t=e?new Date(e):"";return t?{date:t,year:t.getFullYear(),month:t.getMonth(),day:t.getDate()}:{}}_openYearMonthSelector(e){this._selectorIndex=e,this._selectorOpened=!0}_onSelectorConfirm(e){this.focusedDate=new Date(e.detail.year,e.detail.month-this._selectorIndex,1),this.defaultMonth=`${e.detail.year}-${e.detail.month+1-this._selectorIndex}`,this._configureCalendar(),this._desktop&&(this._manageYearSelector(),this._manageArrows())}_manageYearSelector(){const e=this.shadowRoot.querySelector("#formCalendar .flatpickr-months .flatpickr-current-month:nth-child(1)"),t=this.shadowRoot.querySelector("#formCalendar .flatpickr-months > div:nth-child(3) > div"),a=this._calendar.currentMonth<11?this._calendar.currentYear:this._calendar.currentYear+1,r=`${this._currentMonth} ${this._calendar.currentYear}`,n=`${this._nextMonth} ${a}`;pe.render(P`
        <bbva-type-link class="option" @click="${()=>this._openYearMonthSelector(0)}"
          >${r}</bbva-type-link
        >
        <bbva-type-icon
          aria-hidden="true"
          class="arrow"
          icon="${be}"
          size="24"
          @click="${()=>this._openYearMonthSelector(0)}"
        ></bbva-type-icon>
      `,e,{scopeName:"bbva-form-calendar",eventContext:this}),pe.render(P`
        <bbva-type-link class="option" @click="${()=>this._openYearMonthSelector(1)}"
          >${n}</bbva-type-link
        >
        <bbva-type-icon
          aria-hidden="true"
          class="arrow"
          icon="${be}"
          size="24"
          @click="${()=>this._openYearMonthSelector(1)}"
        ></bbva-type-icon>
      `,t,{scopeName:"bbva-form-calendar",eventContext:this})}get _rangeFromLabel(){return this.t("bbva-form-calendar-range-from")}get _rangeToLabel(){return this.t("bbva-form-calendar-range-to")}get _previousMonthLabel(){return this.t("bbva-form-calendar-previous-month")}get _nextMonthLabel(){return this.t("bbva-form-calendar-next-month")}get _disabledItemLabel(){return this.t("bbva-form-calendar-disabled")}get _selectedDayLabel(){return this.t("bbva-form-calendar-selected")}get _unselectedDayLabel(){return this.t("bbva-form-calendar-unselected")}get _currentMonth(){var e,t,a,r;return`${null===(e=this._calendar)||void 0===e||null===(t=e.l10n)||void 0===t||null===(a=t.months)||void 0===a?void 0:a.longhand[null===(r=this._calendar)||void 0===r?void 0:r.currentMonth]}`}get _nextMonth(){var e,t,a;const r=this._calendar.currentMonth>10?"0":`${this._calendar.currentMonth+1}`;return`${null===(e=this._calendar)||void 0===e||null===(t=e.l10n)||void 0===t||null===(a=t.months)||void 0===a?void 0:a.longhand[r]}`}get _messageChangeMonth(){var e;return`${this._currentMonth}, ${null===(e=this._calendar)||void 0===e?void 0:e.currentYear}`}get _formatMonth(){var e;const t=(this._calendar.currentMonth+1).toString(),a=1===t.length?"0":"";return`${null===(e=this._calendar)||void 0===e?void 0:e.currentYear}/${a}${t}`}_cleanDate(e,t){return this._firstClick&&!(null==e||!e.length)&&this._oldDaySelected[0]===t[0]}get _tplNotificationHelp(){return P`
      <bbva-notification-help
        .variant="${this.notificationHelpType}"
        .accessibilityLabelIcon="${this.notificationAccessibilityLabelIcon}"
        .icon="${this.notificationHelpIcon}"
        .text="${this.notificationHelpText}"
      >
      </bbva-notification-help>
    `}_setArrowAttribute(e,t){null==e||e.setAttribute("role","button"),null==e||e.setAttribute("tabindex","0"),null==e||e.setAttribute("aria-label",this[t])}_manageArrows(){var e,t;const a=null===(e=this._calendar)||void 0===e?void 0:e.prevMonthNav,r=null===(t=this._calendar)||void 0===t?void 0:t.nextMonthNav,n=null==a?void 0:a.classList.contains("flatpickr-disabled"),o=null==r?void 0:r.classList.contains("flatpickr-disabled");if(this._setArrowAttribute(a,"_previousMonthLabel"),this._setArrowAttribute(r,"_nextMonthLabel"),this._renderIcon(ue,"prevMonthNav"),this._renderIcon(fe,"nextMonthNav"),o){const e=r.getAttribute("aria-label");r.setAttribute("aria-label",`${e}, ${this._disabledItemLabel}`)}else if(n){const e=a.getAttribute("aria-label");a.setAttribute("aria-label",`${e}, ${this._disabledItemLabel}`)}}_manageDisabledDays(){var e,t;const a=null===(e=this._calendar)||void 0===e||null===(t=e.days)||void 0===t?void 0:t.childNodes,r=[...a].filter((e=>"prevMonthDay"===[e][0].classList[1])),n=[...a].filter((e=>"nextMonthDay"===[e][0].classList[1]));pe._setDaysAttribute(r),pe._setDaysAttribute(n)}_disableNavigation(){var e,t;null===(e=this._calendar)||void 0===e||e.prevMonthNav.addEventListener("mousedown",(e=>e.stopPropagation()),!0),null===(t=this._calendar)||void 0===t||t.nextMonthNav.addEventListener("mousedown",(e=>e.stopPropagation()),!0)}_onSelectorOpenedChange(e){this._selectorOpened=e.detail.value}clearCalendar(){this._calendar.clear(!0,!1)}render(){return P`${this.loading?P``:P`
          <div class="container ${this._desktop?"desktop":""}">
            <div id="formCalendar"></div>
            ${this._desktop?N:P`${this.notificationHelpText&&this._tplNotificationHelp||N}`}
            <span class="sr-only" aria-live="polite" aria-atomic="true"
              >${this._dynamicMessage}</span
            >
            ${this._actionsTpl} ${this._yearMonthTpl}
          </div>
        `}`}}var ge=1e3,ve=6e4,ye=36e5,_e="millisecond",De="second",ke="minute",we="hour",xe="day",Se="week",Me="month",$e="quarter",Ce="year",Ee="date",Te="Invalid Date",Fe=/^(\d{4})[-/]?(\d{1,2})?[-/]?(\d{0,2})[Tt\s]*(\d{1,2})?:?(\d{1,2})?:?(\d{1,2})?[.:]?(\d+)?$/,Ae=/\[([^\]]+)]|Y{1,4}|M{1,4}|D{1,2}|d{1,4}|H{1,2}|h{1,2}|a|A|m{1,2}|s{1,2}|Z{1,2}|SSS/g,Pe={name:"en",weekdays:"Sunday_Monday_Tuesday_Wednesday_Thursday_Friday_Saturday".split("_"),months:"January_February_March_April_May_June_July_August_September_October_November_December".split("_"),ordinal:function(e){var t=["th","st","nd","rd"],a=e%100;return"["+e+(t[(a-20)%10]||t[a]||t[0])+"]"}},Ie=function(e,t,a){var r=String(e);return!r||r.length>=t?e:""+Array(t+1-r.length).join(a)+e},Ye={s:Ie,z:function(e){var t=-e.utcOffset(),a=Math.abs(t),r=Math.floor(a/60),n=a%60;return(t<=0?"+":"-")+Ie(r,2,"0")+":"+Ie(n,2,"0")},m:function e(t,a){if(t.date()<a.date())return-e(a,t);var r=12*(a.year()-t.year())+(a.month()-t.month()),n=t.clone().add(r,Me),o=a-n<0,i=t.clone().add(r+(o?-1:1),Me);return+(-(r+(a-n)/(o?n-i:i-n))||0)},a:function(e){return e<0?Math.ceil(e)||0:Math.floor(e)},p:function(e){return{M:Me,y:Ce,w:Se,d:xe,D:Ee,h:we,m:ke,s:De,ms:_e,Q:$e}[e]||String(e||"").toLowerCase().replace(/s$/,"")},u:function(e){return void 0===e}},Le="en",Oe={};Oe[Le]=Pe;var Ne="$isDayjsObject",Re=function(e){return e instanceof ze||!(!e||!e[Ne])},He=function e(t,a,r){var n;if(!t)return Le;if("string"==typeof t){var o=t.toLowerCase();Oe[o]&&(n=o),a&&(Oe[o]=a,n=o);var i=t.split("-");if(!n&&i.length>1)return e(i[0])}else{var l=t.name;Oe[l]=t,n=l}return!r&&n&&(Le=n),n||!r&&Le},je=function(e,t){if(Re(e))return e.clone();var a="object"==typeof t?t:{};return a.date=e,a.args=arguments,new ze(a)},Be=Ye;Be.l=He,Be.i=Re,Be.w=function(e,t){return je(e,{locale:t.$L,utc:t.$u,x:t.$x,$offset:t.$offset})};var ze=function(){function e(e){this.$L=He(e.locale,null,!0),this.parse(e),this.$x=this.$x||e.x||{},this[Ne]=!0}var t=e.prototype;return t.parse=function(e){this.$d=function(e){var t=e.date,a=e.utc;if(null===t)return new Date(NaN);if(Be.u(t))return new Date;if(t instanceof Date)return new Date(t);if("string"==typeof t&&!/Z$/i.test(t)){var r=t.match(Fe);if(r){var n=r[2]-1||0,o=(r[7]||"0").substring(0,3);return a?new Date(Date.UTC(r[1],n,r[3]||1,r[4]||0,r[5]||0,r[6]||0,o)):new Date(r[1],n,r[3]||1,r[4]||0,r[5]||0,r[6]||0,o)}}return new Date(t)}(e),this.init()},t.init=function(){var e=this.$d;this.$y=e.getFullYear(),this.$M=e.getMonth(),this.$D=e.getDate(),this.$W=e.getDay(),this.$H=e.getHours(),this.$m=e.getMinutes(),this.$s=e.getSeconds(),this.$ms=e.getMilliseconds()},t.$utils=function(){return Be},t.isValid=function(){return!(this.$d.toString()===Te)},t.isSame=function(e,t){var a=je(e);return this.startOf(t)<=a&&a<=this.endOf(t)},t.isAfter=function(e,t){return je(e)<this.startOf(t)},t.isBefore=function(e,t){return this.endOf(t)<je(e)},t.$g=function(e,t,a){return Be.u(e)?this[t]:this.set(a,e)},t.unix=function(){return Math.floor(this.valueOf()/1e3)},t.valueOf=function(){return this.$d.getTime()},t.startOf=function(e,t){var a=this,r=!!Be.u(t)||t,n=Be.p(e),o=function(e,t){var n=Be.w(a.$u?Date.UTC(a.$y,t,e):new Date(a.$y,t,e),a);return r?n:n.endOf(xe)},i=function(e,t){return Be.w(a.toDate()[e].apply(a.toDate("s"),(r?[0,0,0,0]:[23,59,59,999]).slice(t)),a)},l=this.$W,s=this.$M,c=this.$D,d="set"+(this.$u?"UTC":"");switch(n){case Ce:return r?o(1,0):o(31,11);case Me:return r?o(1,s):o(0,s+1);case Se:var m=this.$locale().weekStart||0,u=(l<m?l+7:l)-m;return o(r?c-u:c+(6-u),s);case xe:case Ee:return i(d+"Hours",0);case we:return i(d+"Minutes",1);case ke:return i(d+"Seconds",2);case De:return i(d+"Milliseconds",3);default:return this.clone()}},t.endOf=function(e){return this.startOf(e,!1)},t.$set=function(e,t){var a,r=Be.p(e),n="set"+(this.$u?"UTC":""),o=(a={},a[xe]=n+"Date",a[Ee]=n+"Date",a[Me]=n+"Month",a[Ce]=n+"FullYear",a[we]=n+"Hours",a[ke]=n+"Minutes",a[De]=n+"Seconds",a[_e]=n+"Milliseconds",a)[r],i=r===xe?this.$D+(t-this.$W):t;if(r===Me||r===Ce){var l=this.clone().set(Ee,1);l.$d[o](i),l.init(),this.$d=l.set(Ee,Math.min(this.$D,l.daysInMonth())).$d}else o&&this.$d[o](i);return this.init(),this},t.set=function(e,t){return this.clone().$set(e,t)},t.get=function(e){return this[Be.p(e)]()},t.add=function(e,t){var a,r=this;e=Number(e);var n=Be.p(t),o=function(t){var a=je(r);return Be.w(a.date(a.date()+Math.round(t*e)),r)};if(n===Me)return this.set(Me,this.$M+e);if(n===Ce)return this.set(Ce,this.$y+e);if(n===xe)return o(1);if(n===Se)return o(7);var i=(a={},a[ke]=ve,a[we]=ye,a[De]=ge,a)[n]||1,l=this.$d.getTime()+e*i;return Be.w(l,this)},t.subtract=function(e,t){return this.add(-1*e,t)},t.format=function(e){var t=this,a=this.$locale();if(!this.isValid())return a.invalidDate||Te;var r=e||"YYYY-MM-DDTHH:mm:ssZ",n=Be.z(this),o=this.$H,i=this.$m,l=this.$M,s=a.weekdays,c=a.months,d=a.meridiem,m=function(e,a,n,o){return e&&(e[a]||e(t,r))||n[a].slice(0,o)},u=function(e){return Be.s(o%12||12,e,"0")},f=d||function(e,t,a){var r=e<12?"AM":"PM";return a?r.toLowerCase():r};return r.replace(Ae,(function(e,r){return r||function(e){switch(e){case"YY":return String(t.$y).slice(-2);case"YYYY":return Be.s(t.$y,4,"0");case"M":return l+1;case"MM":return Be.s(l+1,2,"0");case"MMM":return m(a.monthsShort,l,c,3);case"MMMM":return m(c,l);case"D":return t.$D;case"DD":return Be.s(t.$D,2,"0");case"d":return String(t.$W);case"dd":return m(a.weekdaysMin,t.$W,s,2);case"ddd":return m(a.weekdaysShort,t.$W,s,3);case"dddd":return s[t.$W];case"H":return String(o);case"HH":return Be.s(o,2,"0");case"h":return u(1);case"hh":return u(2);case"a":return f(o,i,!0);case"A":return f(o,i,!1);case"m":return String(i);case"mm":return Be.s(i,2,"0");case"s":return String(t.$s);case"ss":return Be.s(t.$s,2,"0");case"SSS":return Be.s(t.$ms,3,"0");case"Z":return n}return null}(e)||n.replace(":","")}))},t.utcOffset=function(){return 15*-Math.round(this.$d.getTimezoneOffset()/15)},t.diff=function(e,t,a){var r,n=this,o=Be.p(t),i=je(e),l=(i.utcOffset()-this.utcOffset())*ve,s=this-i,c=function(){return Be.m(n,i)};switch(o){case Ce:r=c()/12;break;case Me:r=c();break;case $e:r=c()/3;break;case Se:r=(s-l)/6048e5;break;case xe:r=(s-l)/864e5;break;case we:r=s/ye;break;case ke:r=s/ve;break;case De:r=s/ge;break;default:r=s}return a?r:Be.a(r)},t.daysInMonth=function(){return this.endOf(Me).$D},t.$locale=function(){return Oe[this.$L]},t.locale=function(e,t){if(!e)return this.$L;var a=this.clone(),r=He(e,t,!0);return r&&(a.$L=r),a},t.clone=function(){return Be.w(this.$d,this)},t.toDate=function(){return new Date(this.valueOf())},t.toJSON=function(){return this.isValid()?this.toISOString():null},t.toISOString=function(){return this.$d.toISOString()},t.toString=function(){return this.$d.toUTCString()},e}(),Ve=ze.prototype;je.prototype=Ve,[["$ms",_e],["$s",De],["$m",ke],["$H",we],["$W",xe],["$M",Me],["$y",Ce],["$D",Ee]].forEach((function(e){Ve[e[1]]=function(t){return this.$g(t,e[0],e[1])}})),je.extend=function(e,t){return e.$i||(e(t,ze,je),e.$i=!0),je},je.locale=He,je.isDayjs=Re,je.unix=function(e){return je(1e3*e)},je.en=Oe[Le],je.Ls=Oe,je.p={};var We={LTS:"h:mm:ss A",LT:"h:mm A",L:"MM/DD/YYYY",LL:"MMMM D, YYYY",LLL:"MMMM D, YYYY h:mm A",LLLL:"dddd, MMMM D, YYYY h:mm A"},Ue=/(\[[^[]*\])|([-_:/.,()\s]+)|(A|a|Q|YYYY|YY?|ww?|MM?M?M?|Do|DD?|hh?|HH?|mm?|ss?|S{1,3}|z|ZZ?)/g,qe=/\d/,Ke=/\d\d/,Ze=/\d\d?/,Xe=/\d*[^-_:/,()\s\d]+/,Je={},Ge=function(e){return(e=+e)+(e>68?1900:2e3)};var Qe=function(e){return function(t){this[e]=+t}},et=[/[+-]\d\d:?(\d\d)?|Z/,function(e){(this.zone||(this.zone={})).offset=function(e){if(!e)return 0;if("Z"===e)return 0;var t=e.match(/([+-]|\d\d)/g),a=60*t[1]+(+t[2]||0);return 0===a?0:"+"===t[0]?-a:a}(e)}],tt=function(e){var t=Je[e];return t&&(t.indexOf?t:t.s.concat(t.f))},at=function(e,t){var a,r=Je.meridiem;if(r){for(var n=1;n<=24;n+=1)if(e.indexOf(r(n,0,t))>-1){a=n>12;break}}else a=e===(t?"pm":"PM");return a},rt={A:[Xe,function(e){this.afternoon=at(e,!1)}],a:[Xe,function(e){this.afternoon=at(e,!0)}],Q:[qe,function(e){this.month=3*(e-1)+1}],S:[qe,function(e){this.milliseconds=100*+e}],SS:[Ke,function(e){this.milliseconds=10*+e}],SSS:[/\d{3}/,function(e){this.milliseconds=+e}],s:[Ze,Qe("seconds")],ss:[Ze,Qe("seconds")],m:[Ze,Qe("minutes")],mm:[Ze,Qe("minutes")],H:[Ze,Qe("hours")],h:[Ze,Qe("hours")],HH:[Ze,Qe("hours")],hh:[Ze,Qe("hours")],D:[Ze,Qe("day")],DD:[Ke,Qe("day")],Do:[Xe,function(e){var t=Je.ordinal,a=e.match(/\d+/);if(this.day=a[0],t)for(var r=1;r<=31;r+=1)t(r).replace(/\[|\]/g,"")===e&&(this.day=r)}],w:[Ze,Qe("week")],ww:[Ke,Qe("week")],M:[Ze,Qe("month")],MM:[Ke,Qe("month")],MMM:[Xe,function(e){var t=tt("months"),a=(tt("monthsShort")||t.map((function(e){return e.slice(0,3)}))).indexOf(e)+1;if(a<1)throw new Error;this.month=a%12||a}],MMMM:[Xe,function(e){var t=tt("months").indexOf(e)+1;if(t<1)throw new Error;this.month=t%12||t}],Y:[/[+-]?\d+/,Qe("year")],YY:[Ke,function(e){this.year=Ge(e)}],YYYY:[/\d{4}/,Qe("year")],Z:et,ZZ:et};function nt(e){var t,a;t=e,a=Je&&Je.formats;for(var r=(e=t.replace(/(\[[^\]]+])|(LTS?|l{1,4}|L{1,4})/g,(function(e,t,r){var n=r&&r.toUpperCase();return t||a[r]||We[r]||a[n].replace(/(\[[^\]]+])|(MMMM|MM|DD|dddd)/g,(function(e,t,a){return t||a.slice(1)}))}))).match(Ue),n=r.length,o=0;o<n;o+=1){var i=r[o],l=rt[i],s=l&&l[0],c=l&&l[1];r[o]=c?{regex:s,parser:c}:i.replace(/^\[|\]$/g,"")}return function(e){for(var t={},a=0,o=0;a<n;a+=1){var i=r[a];if("string"==typeof i)o+=i.length;else{var l=i.regex,s=i.parser,c=e.slice(o),d=l.exec(c)[0];s.call(t,d),e=e.replace(d,"")}}return function(e){var t=e.afternoon;if(void 0!==t){var a=e.hours;t?a<12&&(e.hours+=12):12===a&&(e.hours=0),delete e.afternoon}}(t),t}}var ot="undefined"!=typeof window?window:"undefined"!=typeof global?global:"undefined"!=typeof self?self:{},it=function(e,t,a,r,n,o,i,l,s,c){var d=this;d.numeralDecimalMark=e||".",d.numeralIntegerScale=t>0?t:0,d.numeralDecimalScale=a>=0?a:2,d.numeralThousandsGroupStyle=r||it.groupStyle.thousand,d.numeralPositiveOnly=!!n,d.stripLeadingZeroes=!1!==o,d.prefix=i||""===i?i:"",d.signBeforePrefix=!!l,d.tailPrefix=!!s,d.delimiter=c||""===c?c:",",d.delimiterRE=c?new RegExp("\\"+c,"g"):""};it.groupStyle={thousand:"thousand",lakh:"lakh",wan:"wan",none:"none"},it.prototype={getRawValue:function(e){return e.replace(this.delimiterRE,"").replace(this.numeralDecimalMark,".")},format:function(e){var t,a,r,n,o=this,i="";switch(e=e.replace(/[A-Za-z]/g,"").replace(o.numeralDecimalMark,"M").replace(/[^\dM-]/g,"").replace(/^\-/,"N").replace(/\-/g,"").replace("N",o.numeralPositiveOnly?"":"-").replace("M",o.numeralDecimalMark),o.stripLeadingZeroes&&(e=e.replace(/^(-)?0+(?=\d)/,"$1")),a="-"===e.slice(0,1)?"-":"",r=void 0!==o.prefix?o.signBeforePrefix?a+o.prefix:o.prefix+a:a,n=e,e.indexOf(o.numeralDecimalMark)>=0&&(n=(t=e.split(o.numeralDecimalMark))[0],i=o.numeralDecimalMark+t[1].slice(0,o.numeralDecimalScale)),"-"===a&&(n=n.slice(1)),o.numeralIntegerScale>0&&(n=n.slice(0,o.numeralIntegerScale)),o.numeralThousandsGroupStyle){case it.groupStyle.lakh:n=n.replace(/(\d)(?=(\d\d)+\d$)/g,"$1"+o.delimiter);break;case it.groupStyle.wan:n=n.replace(/(\d)(?=(\d{4})+$)/g,"$1"+o.delimiter);break;case it.groupStyle.thousand:n=n.replace(/(\d)(?=(\d{3})+$)/g,"$1"+o.delimiter)}return o.tailPrefix?a+n.toString()+(o.numeralDecimalScale>0?i.toString():"")+o.prefix:r+n.toString()+(o.numeralDecimalScale>0?i.toString():"")}};var lt=it,st=function(e,t,a){var r=this;r.date=[],r.blocks=[],r.datePattern=e,r.dateMin=t.split("-").reverse().map((function(e){return parseInt(e,10)})),2===r.dateMin.length&&r.dateMin.unshift(0),r.dateMax=a.split("-").reverse().map((function(e){return parseInt(e,10)})),2===r.dateMax.length&&r.dateMax.unshift(0),r.initBlocks()};st.prototype={initBlocks:function(){var e=this;e.datePattern.forEach((function(t){"Y"===t?e.blocks.push(4):e.blocks.push(2)}))},getISOFormatDate:function(){var e=this,t=e.date;return t[2]?t[2]+"-"+e.addLeadingZero(t[1])+"-"+e.addLeadingZero(t[0]):""},getBlocks:function(){return this.blocks},getValidatedDate:function(e){var t=this,a="";return e=e.replace(/[^\d]/g,""),t.blocks.forEach((function(r,n){if(e.length>0){var o=e.slice(0,r),i=o.slice(0,1),l=e.slice(r);switch(t.datePattern[n]){case"d":"00"===o?o="01":parseInt(i,10)>3?o="0"+i:parseInt(o,10)>31&&(o="31");break;case"m":"00"===o?o="01":parseInt(i,10)>1?o="0"+i:parseInt(o,10)>12&&(o="12")}a+=o,e=l}})),this.getFixedDateString(a)},getFixedDateString:function(e){var t,a,r,n=this,o=n.datePattern,i=[],l=0,s=0,c=0,d=0,m=0,u=0,f=!1;return 4===e.length&&"y"!==o[0].toLowerCase()&&"y"!==o[1].toLowerCase()&&(m=2-(d="d"===o[0]?0:2),t=parseInt(e.slice(d,d+2),10),a=parseInt(e.slice(m,m+2),10),i=this.getFixedDate(t,a,0)),8===e.length&&(o.forEach((function(e,t){switch(e){case"d":l=t;break;case"m":s=t;break;default:c=t}})),u=2*c,d=l<=c?2*l:2*l+2,m=s<=c?2*s:2*s+2,t=parseInt(e.slice(d,d+2),10),a=parseInt(e.slice(m,m+2),10),r=parseInt(e.slice(u,u+4),10),f=4===e.slice(u,u+4).length,i=this.getFixedDate(t,a,r)),4!==e.length||"y"!==o[0]&&"y"!==o[1]||(u=2-(m="m"===o[0]?0:2),a=parseInt(e.slice(m,m+2),10),r=parseInt(e.slice(u,u+2),10),f=2===e.slice(u,u+2).length,i=[0,a,r]),6!==e.length||"Y"!==o[0]&&"Y"!==o[1]||(u=2-.5*(m="m"===o[0]?0:4),a=parseInt(e.slice(m,m+2),10),r=parseInt(e.slice(u,u+4),10),f=4===e.slice(u,u+4).length,i=[0,a,r]),i=n.getRangeFixedDate(i),n.date=i,0===i.length?e:o.reduce((function(e,t){switch(t){case"d":return e+(0===i[0]?"":n.addLeadingZero(i[0]));case"m":return e+(0===i[1]?"":n.addLeadingZero(i[1]));case"y":return e+(f?n.addLeadingZeroForYear(i[2],!1):"");case"Y":return e+(f?n.addLeadingZeroForYear(i[2],!0):"")}}),"")},getRangeFixedDate:function(e){var t=this,a=t.datePattern,r=t.dateMin||[],n=t.dateMax||[];return!e.length||r.length<3&&n.length<3||a.find((function(e){return"y"===e.toLowerCase()}))&&0===e[2]?e:n.length&&(n[2]<e[2]||n[2]===e[2]&&(n[1]<e[1]||n[1]===e[1]&&n[0]<e[0]))?n:r.length&&(r[2]>e[2]||r[2]===e[2]&&(r[1]>e[1]||r[1]===e[1]&&r[0]>e[0]))?r:e},getFixedDate:function(e,t,a){return e=Math.min(e,31),t=Math.min(t,12),a=parseInt(a||0,10),(t<7&&t%2==0||t>8&&t%2==1)&&(e=Math.min(e,2===t?this.isLeapYear(a)?29:28:30)),[e,t,a]},isLeapYear:function(e){return e%4==0&&e%100!=0||e%400==0},addLeadingZero:function(e){return(e<10?"0":"")+e},addLeadingZeroForYear:function(e,t){return t?(e<10?"000":e<100?"00":e<1e3?"0":"")+e:(e<10?"0":"")+e}};var ct=st,dt=function(e,t){var a=this;a.time=[],a.blocks=[],a.timePattern=e,a.timeFormat=t,a.initBlocks()};dt.prototype={initBlocks:function(){var e=this;e.timePattern.forEach((function(){e.blocks.push(2)}))},getISOFormatTime:function(){var e=this,t=e.time;return t[2]?e.addLeadingZero(t[0])+":"+e.addLeadingZero(t[1])+":"+e.addLeadingZero(t[2]):""},getBlocks:function(){return this.blocks},getTimeFormatOptions:function(){return"12"===String(this.timeFormat)?{maxHourFirstDigit:1,maxHours:12,maxMinutesFirstDigit:5,maxMinutes:60}:{maxHourFirstDigit:2,maxHours:23,maxMinutesFirstDigit:5,maxMinutes:60}},getValidatedTime:function(e){var t=this,a="";e=e.replace(/[^\d]/g,"");var r=t.getTimeFormatOptions();return t.blocks.forEach((function(n,o){if(e.length>0){var i=e.slice(0,n),l=i.slice(0,1),s=e.slice(n);switch(t.timePattern[o]){case"h":parseInt(l,10)>r.maxHourFirstDigit?i="0"+l:parseInt(i,10)>r.maxHours&&(i=r.maxHours+"");break;case"m":case"s":parseInt(l,10)>r.maxMinutesFirstDigit?i="0"+l:parseInt(i,10)>r.maxMinutes&&(i=r.maxMinutes+"")}a+=i,e=s}})),this.getFixedTimeString(a)},getFixedTimeString:function(e){var t,a,r,n=this,o=n.timePattern,i=[],l=0,s=0,c=0,d=0,m=0,u=0;return 6===e.length&&(o.forEach((function(e,t){switch(e){case"s":l=2*t;break;case"m":s=2*t;break;case"h":c=2*t}})),u=c,m=s,d=l,t=parseInt(e.slice(d,d+2),10),a=parseInt(e.slice(m,m+2),10),r=parseInt(e.slice(u,u+2),10),i=this.getFixedTime(r,a,t)),4===e.length&&n.timePattern.indexOf("s")<0&&(o.forEach((function(e,t){switch(e){case"m":s=2*t;break;case"h":c=2*t}})),u=c,m=s,t=0,a=parseInt(e.slice(m,m+2),10),r=parseInt(e.slice(u,u+2),10),i=this.getFixedTime(r,a,t)),n.time=i,0===i.length?e:o.reduce((function(e,t){switch(t){case"s":return e+n.addLeadingZero(i[2]);case"m":return e+n.addLeadingZero(i[1]);case"h":return e+n.addLeadingZero(i[0])}}),"")},getFixedTime:function(e,t,a){return a=Math.min(parseInt(a||0,10),60),t=Math.min(t,60),[e=Math.min(e,60),t,a]},addLeadingZero:function(e){return(e<10?"0":"")+e}};var mt=dt,ut=function(e,t){var a=this;a.delimiter=t||""===t?t:" ",a.delimiterRE=t?new RegExp("\\"+t,"g"):"",a.formatter=e};ut.prototype={setFormatter:function(e){this.formatter=e},format:function(e){var t=this;t.formatter.clear();for(var a,r="",n=!1,o=0,i=(e=(e=(e=e.replace(/[^\d+]/g,"")).replace(/^\+/,"B").replace(/\+/g,"").replace("B","+")).replace(t.delimiterRE,"")).length;o<i;o++)a=t.formatter.inputDigit(e.charAt(o)),/[\s()-]/g.test(a)?(r=a,n=!0):n||(r=a);return r=(r=r.replace(/[()]/g,"")).replace(/[\s-]/g,t.delimiter)}};var ft=ut,ht={blocks:{uatp:[4,5,6],amex:[4,6,5],diners:[4,6,4],discover:[4,4,4,4],mastercard:[4,4,4,4],dankort:[4,4,4,4],instapayment:[4,4,4,4],jcb15:[4,6,5],jcb:[4,4,4,4],maestro:[4,4,4,4],visa:[4,4,4,4],mir:[4,4,4,4],unionPay:[4,4,4,4],general:[4,4,4,4]},re:{uatp:/^(?!1800)1\d{0,14}/,amex:/^3[47]\d{0,13}/,discover:/^(?:6011|65\d{0,2}|64[4-9]\d?)\d{0,12}/,diners:/^3(?:0([0-5]|9)|[689]\d?)\d{0,11}/,mastercard:/^(5[1-5]\d{0,2}|22[2-9]\d{0,1}|2[3-7]\d{0,2})\d{0,12}/,dankort:/^(5019|4175|4571)\d{0,12}/,instapayment:/^63[7-9]\d{0,13}/,jcb15:/^(?:2131|1800)\d{0,11}/,jcb:/^(?:35\d{0,2})\d{0,12}/,maestro:/^(?:5[0678]\d{0,2}|6304|67\d{0,2})\d{0,12}/,mir:/^220[0-4]\d{0,12}/,visa:/^4\d{0,15}/,unionPay:/^(62|81)\d{0,14}/},getStrictBlocks:function(e){var t=e.reduce((function(e,t){return e+t}),0);return e.concat(19-t)},getInfo:function(e,t){var a=ht.blocks,r=ht.re;for(var n in t=!!t,r)if(r[n].test(e)){var o=a[n];return{type:n,blocks:t?this.getStrictBlocks(o):o}}return{type:"unknown",blocks:t?this.getStrictBlocks(a.general):a.general}}},bt=ht,pt={noop:function(){},strip:function(e,t){return e.replace(t,"")},getPostDelimiter:function(e,t,a){if(0===a.length)return e.slice(-t.length)===t?t:"";var r="";return a.forEach((function(t){e.slice(-t.length)===t&&(r=t)})),r},getDelimiterREByDelimiter:function(e){return new RegExp(e.replace(/([.?*+^$[\]\\(){}|-])/g,"\\$1"),"g")},getNextCursorPosition:function(e,t,a,r,n){return t.length===e?a.length:e+this.getPositionOffset(e,t,a,r,n)},getPositionOffset:function(e,t,a,r,n){var o,i,l;return o=this.stripDelimiters(t.slice(0,e),r,n),i=this.stripDelimiters(a.slice(0,e),r,n),0!==(l=o.length-i.length)?l/Math.abs(l):0},stripDelimiters:function(e,t,a){var r=this;if(0===a.length){var n=t?r.getDelimiterREByDelimiter(t):"";return e.replace(n,"")}return a.forEach((function(t){t.split("").forEach((function(t){e=e.replace(r.getDelimiterREByDelimiter(t),"")}))})),e},headStr:function(e,t){return e.slice(0,t)},getMaxLength:function(e){return e.reduce((function(e,t){return e+t}),0)},getPrefixStrippedValue:function(e,t,a,r,n,o,i,l,s){if(0===a)return e;if(e===t&&""!==e)return"";if(s&&"-"==e.slice(0,1)){var c="-"==r.slice(0,1)?r.slice(1):r;return"-"+this.getPrefixStrippedValue(e.slice(1),t,a,c,n,o,i,l,s)}if(r.slice(0,a)!==t&&!l)return i&&!r&&e?e:"";if(r.slice(-a)!==t&&l)return i&&!r&&e?e:"";var d=this.stripDelimiters(r,n,o);return e.slice(0,a)===t||l?e.slice(-a)!==t&&l?d.slice(0,-a-1):l?e.slice(0,-a):e.slice(a):d.slice(a)},getFirstDiffIndex:function(e,t){for(var a=0;e.charAt(a)===t.charAt(a);)if(""===e.charAt(a++))return-1;return a},getFormattedValue:function(e,t,a,r,n,o){var i="",l=n.length>0,s="";return 0===a?e:(t.forEach((function(t,c){if(e.length>0){var d=e.slice(0,t),m=e.slice(t);s=l?n[o?c-1:c]||s:r,o?(c>0&&(i+=s),i+=d):(i+=d,d.length===t&&c<a-1&&(i+=s)),e=m}})),i)},fixPrefixCursor:function(e,t,a,r){if(e){var n=e.value,o=a||r[0]||" ";if(e.setSelectionRange&&t&&!(t.length+o.length<=n.length)){var i=2*n.length;setTimeout((function(){e.setSelectionRange(i,i)}),1)}}},checkFullSelection:function(e){try{return(window.getSelection()||document.getSelection()||{}).toString().length===e.length}catch(e){}return!1},setSelection:function(e,t,a){if(e===this.getActiveElement(a)&&!(e&&e.value.length<=t))if(e.createTextRange){var r=e.createTextRange();r.move("character",t),r.select()}else try{e.setSelectionRange(t,t)}catch(e){console.warn("The input element type does not support selection")}},getActiveElement:function(e){var t=e.activeElement;return t&&t.shadowRoot?this.getActiveElement(t.shadowRoot):t},isAndroid:function(){return navigator&&/android/i.test(navigator.userAgent)},isAndroidBackspaceKeydown:function(e,t){return!!(this.isAndroid()&&e&&t)&&t===e.slice(0,-1)}},gt={assign:function(e,t){return t=t||{},(e=e||{}).creditCard=!!t.creditCard,e.creditCardStrictMode=!!t.creditCardStrictMode,e.creditCardType="",e.onCreditCardTypeChanged=t.onCreditCardTypeChanged||function(){},e.phone=!!t.phone,e.phoneRegionCode=t.phoneRegionCode||"AU",e.phoneFormatter={},e.time=!!t.time,e.timePattern=t.timePattern||["h","m","s"],e.timeFormat=t.timeFormat||"24",e.timeFormatter={},e.date=!!t.date,e.datePattern=t.datePattern||["d","m","Y"],e.dateMin=t.dateMin||"",e.dateMax=t.dateMax||"",e.dateFormatter={},e.numeral=!!t.numeral,e.numeralIntegerScale=t.numeralIntegerScale>0?t.numeralIntegerScale:0,e.numeralDecimalScale=t.numeralDecimalScale>=0?t.numeralDecimalScale:2,e.numeralDecimalMark=t.numeralDecimalMark||".",e.numeralThousandsGroupStyle=t.numeralThousandsGroupStyle||"thousand",e.numeralPositiveOnly=!!t.numeralPositiveOnly,e.stripLeadingZeroes=!1!==t.stripLeadingZeroes,e.signBeforePrefix=!!t.signBeforePrefix,e.tailPrefix=!!t.tailPrefix,e.swapHiddenInput=!!t.swapHiddenInput,e.numericOnly=e.creditCard||e.date||!!t.numericOnly,e.uppercase=!!t.uppercase,e.lowercase=!!t.lowercase,e.prefix=e.creditCard||e.date?"":t.prefix||"",e.noImmediatePrefix=!!t.noImmediatePrefix,e.prefixLength=e.prefix.length,e.rawValueTrimPrefix=!!t.rawValueTrimPrefix,e.copyDelimiter=!!t.copyDelimiter,e.initValue=void 0!==t.initValue&&null!==t.initValue?t.initValue.toString():"",e.delimiter=t.delimiter||""===t.delimiter?t.delimiter:t.date?"/":t.time?":":t.numeral?",":(t.phone," "),e.delimiterLength=e.delimiter.length,e.delimiterLazyShow=!!t.delimiterLazyShow,e.delimiters=t.delimiters||[],e.blocks=t.blocks||[],e.blocksLength=e.blocks.length,e.root="object"==typeof ot&&ot?ot:window,e.document=t.document||e.root.document,e.maxLength=0,e.backspace=!1,e.result="",e.onValueChanged=t.onValueChanged||function(){},e}},vt=function(e,t){var a=this,r=!1;if("string"==typeof e?(a.element=document.querySelector(e),r=document.querySelectorAll(e).length>1):void 0!==e.length&&e.length>0?(a.element=e[0],r=e.length>1):a.element=e,!a.element)throw new Error("[cleave.js] Please check the element");if(r)try{console.warn("[cleave.js] Multiple input fields matched, cleave.js will only take the first one.")}catch(e){}t.initValue=a.element.value,a.properties=vt.DefaultProperties.assign({},t),a.init()};vt.prototype={init:function(){var e=this,t=e.properties;t.numeral||t.phone||t.creditCard||t.time||t.date||0!==t.blocksLength||t.prefix?(t.maxLength=vt.Util.getMaxLength(t.blocks),e.isAndroid=vt.Util.isAndroid(),e.lastInputValue="",e.isBackward="",e.onChangeListener=e.onChange.bind(e),e.onKeyDownListener=e.onKeyDown.bind(e),e.onFocusListener=e.onFocus.bind(e),e.onCutListener=e.onCut.bind(e),e.onCopyListener=e.onCopy.bind(e),e.initSwapHiddenInput(),e.element.addEventListener("input",e.onChangeListener),e.element.addEventListener("keydown",e.onKeyDownListener),e.element.addEventListener("focus",e.onFocusListener),e.element.addEventListener("cut",e.onCutListener),e.element.addEventListener("copy",e.onCopyListener),e.initPhoneFormatter(),e.initDateFormatter(),e.initTimeFormatter(),e.initNumeralFormatter(),(t.initValue||t.prefix&&!t.noImmediatePrefix)&&e.onInput(t.initValue)):e.onInput(t.initValue)},initSwapHiddenInput:function(){var e=this;if(e.properties.swapHiddenInput){var t=e.element.cloneNode(!0);e.element.parentNode.insertBefore(t,e.element),e.elementSwapHidden=e.element,e.elementSwapHidden.type="hidden",e.element=t,e.element.id=""}},initNumeralFormatter:function(){var e=this.properties;e.numeral&&(e.numeralFormatter=new vt.NumeralFormatter(e.numeralDecimalMark,e.numeralIntegerScale,e.numeralDecimalScale,e.numeralThousandsGroupStyle,e.numeralPositiveOnly,e.stripLeadingZeroes,e.prefix,e.signBeforePrefix,e.tailPrefix,e.delimiter))},initTimeFormatter:function(){var e=this.properties;e.time&&(e.timeFormatter=new vt.TimeFormatter(e.timePattern,e.timeFormat),e.blocks=e.timeFormatter.getBlocks(),e.blocksLength=e.blocks.length,e.maxLength=vt.Util.getMaxLength(e.blocks))},initDateFormatter:function(){var e=this.properties;e.date&&(e.dateFormatter=new vt.DateFormatter(e.datePattern,e.dateMin,e.dateMax),e.blocks=e.dateFormatter.getBlocks(),e.blocksLength=e.blocks.length,e.maxLength=vt.Util.getMaxLength(e.blocks))},initPhoneFormatter:function(){var e=this.properties;if(e.phone)try{e.phoneFormatter=new vt.PhoneFormatter(new e.root.Cleave.AsYouTypeFormatter(e.phoneRegionCode),e.delimiter)}catch(e){throw new Error("[cleave.js] Please include phone-type-formatter.{country}.js lib")}},onKeyDown:function(e){var t=this,a=e.which||e.keyCode;t.lastInputValue=t.element.value,t.isBackward=8===a},onChange:function(e){var t=this,a=t.properties,r=vt.Util;t.isBackward=t.isBackward||"deleteContentBackward"===e.inputType;var n=r.getPostDelimiter(t.lastInputValue,a.delimiter,a.delimiters);t.isBackward&&n?a.postDelimiterBackspace=n:a.postDelimiterBackspace=!1,this.onInput(this.element.value)},onFocus:function(){var e=this,t=e.properties;e.lastInputValue=e.element.value,t.prefix&&t.noImmediatePrefix&&!e.element.value&&this.onInput(t.prefix),vt.Util.fixPrefixCursor(e.element,t.prefix,t.delimiter,t.delimiters)},onCut:function(e){vt.Util.checkFullSelection(this.element.value)&&(this.copyClipboardData(e),this.onInput(""))},onCopy:function(e){vt.Util.checkFullSelection(this.element.value)&&this.copyClipboardData(e)},copyClipboardData:function(e){var t=this.properties,a=vt.Util,r=this.element.value,n="";n=t.copyDelimiter?r:a.stripDelimiters(r,t.delimiter,t.delimiters);try{e.clipboardData?e.clipboardData.setData("Text",n):window.clipboardData.setData("Text",n),e.preventDefault()}catch(e){}},onInput:function(e){var t=this,a=t.properties,r=vt.Util,n=r.getPostDelimiter(e,a.delimiter,a.delimiters);return a.numeral||!a.postDelimiterBackspace||n||(e=r.headStr(e,e.length-a.postDelimiterBackspace.length)),a.phone?(!a.prefix||a.noImmediatePrefix&&!e.length?a.result=a.phoneFormatter.format(e):a.result=a.prefix+a.phoneFormatter.format(e).slice(a.prefix.length),void t.updateValueState()):a.numeral?(a.prefix&&a.noImmediatePrefix&&0===e.length?a.result="":a.result=a.numeralFormatter.format(e),void t.updateValueState()):(a.date&&(e=a.dateFormatter.getValidatedDate(e)),a.time&&(e=a.timeFormatter.getValidatedTime(e)),e=r.stripDelimiters(e,a.delimiter,a.delimiters),e=r.getPrefixStrippedValue(e,a.prefix,a.prefixLength,a.result,a.delimiter,a.delimiters,a.noImmediatePrefix,a.tailPrefix,a.signBeforePrefix),e=a.numericOnly?r.strip(e,/[^\d]/g):e,e=a.uppercase?e.toUpperCase():e,e=a.lowercase?e.toLowerCase():e,a.prefix&&(a.tailPrefix?e+=a.prefix:e=a.prefix+e,0===a.blocksLength)?(a.result=e,void t.updateValueState()):(a.creditCard&&t.updateCreditCardPropsByValue(e),e=r.headStr(e,a.maxLength),a.result=r.getFormattedValue(e,a.blocks,a.blocksLength,a.delimiter,a.delimiters,a.delimiterLazyShow),void t.updateValueState()))},updateCreditCardPropsByValue:function(e){var t,a=this.properties,r=vt.Util;r.headStr(a.result,4)!==r.headStr(e,4)&&(t=vt.CreditCardDetector.getInfo(e,a.creditCardStrictMode),a.blocks=t.blocks,a.blocksLength=a.blocks.length,a.maxLength=r.getMaxLength(a.blocks),a.creditCardType!==t.type&&(a.creditCardType=t.type,a.onCreditCardTypeChanged.call(this,a.creditCardType)))},updateValueState:function(){var e=this,t=vt.Util,a=e.properties;if(e.element){var r=e.element.selectionEnd,n=e.element.value,o=a.result;r=t.getNextCursorPosition(r,n,o,a.delimiter,a.delimiters),e.isAndroid?window.setTimeout((function(){e.element.value=o,t.setSelection(e.element,r,a.document,!1),e.callOnValueChanged()}),1):(e.element.value=o,a.swapHiddenInput&&(e.elementSwapHidden.value=e.getRawValue()),t.setSelection(e.element,r,a.document,!1),e.callOnValueChanged())}},callOnValueChanged:function(){var e=this,t=e.properties;t.onValueChanged.call(e,{target:{name:e.element.name,value:t.result,rawValue:e.getRawValue()}})},setPhoneRegionCode:function(e){var t=this;t.properties.phoneRegionCode=e,t.initPhoneFormatter(),t.onChange()},setRawValue:function(e){var t=this,a=t.properties;e=null!=e?e.toString():"",a.numeral&&(e=e.replace(".",a.numeralDecimalMark)),a.postDelimiterBackspace=!1,t.element.value=e,t.onInput(e)},getRawValue:function(){var e=this.properties,t=vt.Util,a=this.element.value;return e.rawValueTrimPrefix&&(a=t.getPrefixStrippedValue(a,e.prefix,e.prefixLength,e.result,e.delimiter,e.delimiters,e.noImmediatePrefix,e.tailPrefix,e.signBeforePrefix)),a=e.numeral?e.numeralFormatter.getRawValue(a):t.stripDelimiters(a,e.delimiter,e.delimiters)},getISOFormatDate:function(){var e=this.properties;return e.date?e.dateFormatter.getISOFormatDate():""},getISOFormatTime:function(){var e=this.properties;return e.time?e.timeFormatter.getISOFormatTime():""},getFormattedValue:function(){return this.element.value},destroy:function(){var e=this;e.element.removeEventListener("input",e.onChangeListener),e.element.removeEventListener("keydown",e.onKeyDownListener),e.element.removeEventListener("focus",e.onFocusListener),e.element.removeEventListener("cut",e.onCutListener),e.element.removeEventListener("copy",e.onCopyListener)},toString:function(){return"[Cleave Object]"}},vt.NumeralFormatter=lt,vt.DateFormatter=ct,vt.TimeFormatter=mt,vt.PhoneFormatter=ft,vt.CreditCardDetector=bt,vt.Util=pt,vt.DefaultProperties=gt,("object"==typeof ot&&ot?ot:window).Cleave=vt;var yt=vt,_t=D`
:host {
  position: relative;
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.label-out {
  display: flex;
  align-items: flex-end;
  margin: 0 0 0.5rem;
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${k(x.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
}
.label-out .label {
  display: block;
  cursor: default;
}

.field {
  position: relative;
  display: flex;
  height: 3rem;
}
.field .label {
  position: absolute;
  top: 0;
  right: 1rem;
  left: 1rem;
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${k(x.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
  transform: translateY(0.75rem);
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  will-change: transform;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.field.multiline {
  height: auto;
  padding: 1.5rem 0 0.4375rem;
}
.field.multiline .label {
  top: -1.5rem;
}
:host([focused]) .field .label, :host([filled]) .field .label {
  transform: translateY(0.375rem) scale(0.8);
}

.counter ::slotted(*), .counter-text {
  margin: 0.5rem 0 0;
  font-size: var(--typographyType3XSmall, ${k(w.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${k(S.type3XSmall)});
  text-align: right;
}

.slot-input ::slotted(input) {
  height: 100%;
  padding: 1.5rem 1rem 0.25rem;
}
:host([label-out]) .slot-input ::slotted(input) {
  padding-top: 0.75rem;
  padding-bottom: 0.75rem;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - 3rem);
}

.slot-textarea ::slotted(textarea) {
  height: var(--bbva-form-date-range-input-area-height, 4rem);
  min-height: 4rem;
  max-height: 7.5rem;
  padding: 0 3rem 0 1rem;
  line-height: var(--lineHeightTypeSmall, ${k(S.typeSmall)});
  overflow-x: hidden;
  resize: none;
  transform: translateZ(0);
}

.slot-input ::slotted(input),
.slot-textarea ::slotted(textarea) {
  position: relative;
  width: 100%;
  box-sizing: border-box;
  border: none;
  margin: 0;
  appearance: none;
  background-color: transparent;
  box-shadow: none;
  font-family: inherit;
  outline: none;
}
.slot-input ::slotted(input)::-ms-clear,
.slot-textarea ::slotted(textarea)::-ms-clear {
  display: none;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.clip {
  position: relative;
  display: flex;
  height: 100%;
  flex: none;
  align-items: center;
}
.clip ::slotted(*) {
  margin-left: 1rem;
}

.input-wrap {
  position: relative;
  flex: auto;
}

.clear {
  position: absolute;
  top: 0;
  right: 0;
  display: none;
  width: 3rem;
  height: 100%;
  align-items: center;
  justify-content: center;
  border: none;
  outline: none;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
.multiline .clear {
  height: 3rem;
}

.help {
  margin: 0 0 0 0.5rem;
}
.help[aria-disabled=true] {
  opacity: 1;
}

.message {
  display: flex;
  align-items: flex-start;
  margin: 0.5rem 1rem 0;
  font-size: var(--typographyType3XSmall, ${k(w.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${k(S.type3XSmall)});
}
.message-icon {
  margin-right: 0.25rem;
}

:host([disabled]) {
  opacity: 0.4;
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-textarea ::slotted(textarea),
:host([invalid]) .slot-input ::slotted(input:invalid),
:host([invalid]) .slot-textarea ::slotted(textarea:invalid) {
  box-shadow: none;
}
`,Dt=D`
:host([size=l]) .field:not(.multiline) {
  height: 3.5rem;
}
:host([size=l]) .field:not(.multiline) .label {
  transform: translateY(1rem);
}

:host([size=l][label-out]) .slot-input ::slotted(input) {
  padding-top: 1rem;
  padding-bottom: 1rem;
}

:host([size=l][focused]) .field:not(.multiline) .label,
:host([size=l][filled]) .field:not(.multiline) .label {
  transform: translateY(0.375rem) scale(0.8);
}
`;const kt=R(),wt=H(),xt={error:I(),info:j()},St=e=>class extends e{static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorMessage:{type:String,attribute:"error-message"},infoMessage:{type:String,attribute:"info-message"},helpIcon:{type:String,attribute:"help-icon"},helpIconSize:{type:Number,attribute:"help-icon-size"},helpLabel:{type:String,attribute:"help-label"}}}constructor(){super(),this.clearIcon=kt,this.clearIconSize=24,this.clearAccessibleText="bbva-form-date-range-input-clear",this.errorMessage="",this.infoMessage="",this.helpIcon=wt,this.helpIconSize=24,this.helpLabel=""}firstUpdated(e){var t;super.firstUpdated&&super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const a=document.createElement("style"),r=null===(t=this._formElement)||void 0===t?void 0:t.getAttribute("slot");a.setAttribute("slot",r),this.appendChild(a)}updated(e){super.updated&&super.updated(e),e.has("value")&&(this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}static get styles(){return[super.styles,_t,p("sm",Dt),F("bbva-form-date-range-input-shared-styles")]}get field(){return P`
        <div
          class="field ${this.extraClasses}"
          @focusin="${this._onFocusin}"
          @focusout="${this._onFocusout}"
        >
          ${this.clip}

          <span class="input-wrap">${this.labelledInput}</span>

          ${this.clearButton} ${this.extraIconTpl}
        </div>
      `}get extraClasses(){return""}get labelledInput(){return P` ${this.labelBlock} ${this._input} `}get clearButton(){return P`
        <button
          class="clear"
          tabindex="-1"
          @click="${this.clearInput}"
          @mousedown="${this._onClearMousedown}"
          aria-hidden="true"
          aria-label="${this.t(this.clearAccessibleText)}"
        >
          <bbva-core-icon .icon="${this.clearIcon}" .size="${this.clearIconSize}"></bbva-core-icon>
        </button>
      `}get extraIconTpl(){return P``}get messageError(){return this._errorVisible?this._message("error"):""}get messageInfo(){return this.infoMessage?this._message("info"):""}_message(e){return P`
        <div class="message">
          <bbva-core-icon
            aria-hidden="true"
            class="message-icon ${e}"
            icon="${xt[e]}"
            size="16"
          ></bbva-core-icon>

          <span class="message-text ${e}">
            ${"error"===e?this.t(this.errorMessage):this.t(this.infoMessage)}
          </span>
        </div>
      `}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onClearMousedown(e){const t=e.currentTarget;setTimeout((()=>{t.focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_onMousedown(e){e.preventDefault(),this.focus()}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("blur"))}_onHelpClick(){this.dispatchEvent(new CustomEvent("help-click",{bubbles:!0}))}clearInput(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input-clear",{bubbles:!0})),this.focus()}render(){return P` ${this.field} ${this.messageError} ${this.messageInfo} `}};class Mt extends(C(St(B))){get clip(){return P`
      <span class="clip" @mousedown="${this._onMousedown}">
        <slot name="clip"></slot>
      </span>
    `}}var $t=D`
:host {
  border-bottom: 0.125rem solid var(--_form-date-range-fields-border-color);
}

:host([disabled]) {
  opacity: 1;
  pointer-events: none;
}

:host([focused]:not([read-only])) {
  border-bottom: 0.125rem solid var(--_form-date-range-focus-border-color);
}

.field-button {
  display: flex;
  width: 100%;
  height: 2.875rem;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
  padding-left: 1rem;
  border: none;
  background-color: transparent;
  color: var(--_form-date-range-field-placeholder-color);
  cursor: pointer;
  font-family: var(--fontFacePrimaryFontFamily, ${k(x.fontFamily)});
}
.field-button .field-button-label {
  transform: translateX(-0.0625rem) translateY(-0.125rem) scale(0.9);
}
.field-button .field-button-value {
  color: var(--_form-date-range-field-label-color);
}

:host([focused]:not([invalid])) .field .label, :host([focused]:not([invalid])) .field-button {
  color: var(--_form-date-range-field-placeholder-color);
}
:host([focused]:not([invalid])) .field .label .field-button-placeholder, :host([focused]:not([invalid])) .field-button .field-button-placeholder {
  color: var(--_form-date-range-field-placeholder-color);
}

:host([invalid]) .field .label, :host([invalid]) .field-button {
  color: var(--_form-date-range-field-label-invalid-color);
}
:host([invalid]) .field .label .field-button-placeholder, :host([invalid]) .field-button .field-button-placeholder {
  color: var(--_form-date-range-field-label-invalid-color);
}

:host([invalid]) .field, :host([invalid]) .field-button {
  color: var(--_form-date-range-field-label-invalid-color);
}
:host([invalid]) .field .mask-placeholder, :host([invalid]) .field-button .mask-placeholder {
  color: var(--_form-date-range-field-invalid-color);
}
:host([invalid]) .field .field-button-value, :host([invalid]) .field-button .field-button-value {
  color: var(--_form-date-range-field-invalid-color);
}
:host([invalid]) .field .field-button-placeholder, :host([invalid]) .field-button .field-button-placeholder {
  color: var(--_form-date-range-field-label-invalid-color);
}

.field {
  height: 2.875rem;
  border-bottom: none;
  background-color: transparent;
}
.field .label {
  color: var(--_form-date-range-field-placeholder-color);
}
.field .label, :host([focused]) .field .label, :host([filled]) .field .label {
  transform: translateY(0.1875rem) scale(0.8);
}

.slot-input ::slotted(input) {
  padding: 1.25rem 0.5rem 0.125rem 1rem;
  color: var(--_form-date-range-field-label-color);
}
:host([read-only]) .slot-input ::slotted(input) {
  color: var(--_form-date-range-field-placeholder-color);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host([focused]) .slot-input ::slotted(input)::placeholder, :host([invalid][filled]) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-label-color);
}
:host([invalid][focused]) .slot-input ::slotted(input) {
  color: var(--_form-date-range-field-label-invalid-color);
}
:host(:not([focused])) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-label-color);
}
:host([invalid]:not([focused])) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-label-invalid-color);
}
:host(.unfocused-writable) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-placeholder-color);
}
:host(:not([is-writable])) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-placeholder-color);
}
:host([focused]:not([is-writable]):not([read-only])) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-label-color);
}
:host([focused][invalid]) .slot-input ::slotted(input) {
  color: var(--_form-date-range-field-invalid-color);
}
:host([focused][invalid]) .slot-input ::slotted(input)::placeholder {
  color: var(--_form-date-range-field-invalid-color);
}
:host([filled][invalid]) .slot-input ::slotted(input) {
  color: var(--_form-date-range-field-invalid-color);
}

.mask {
  position: absolute;
  display: flex;
  width: 100%;
  height: 100%;
  align-items: center;
  padding: 1.25rem 0.5rem 0.125rem 1rem;
  color: var(--_form-date-range-field-label-color);
  font-size: var(--typographyTypeSmall, ${k(w.typeSmall)});
  line-height: 1.125rem;
}
:host(:not([filled])) .mask {
  opacity: 0;
}
:host([readonly][filled]) .mask, :host([invalid][filled]) .mask, :host([focused]) .mask {
  opacity: 1;
}
.mask-value {
  opacity: 0;
}

:host([size=l]) .field:not(.multiline), :host([size=l]) .field-button {
  height: 3.375rem;
}
:host([size=l]) .field:not(.multiline) .label, :host([size=l]) .field-button .label {
  color: var(--_form-date-range-field-placeholder-color);
  transform: translateY(0.375rem) scale(0.8);
}
:host([size=l]) .mask,
:host([size=l]) .slot-input ::slotted(input) {
  padding: 1.5rem 0.5rem 0.375rem 1rem;
  color: var(--_form-date-range-field-label-color);
}

:host([size=s]) .field:not(.multiline), :host([size=s]) .field-button {
  height: 2.5rem;
}
:host([size=s]) .field:not(.multiline) .label, :host([size=s]) .field-button .label {
  color: var(--_form-date-range-field-label-color);
  transform: translateY(0.125rem) scale(0.8);
}
:host([size=s]) .mask,
:host([size=s]) .slot-input ::slotted(input) {
  padding: 1.25rem 0.5rem 0.125rem 1rem;
  color: var(--_form-date-range-field-label-color);
}

:host([focus-visible]) .slot-input, :host([focus-visible]) .field-button {
  outline: 2px solid var(--_form-date-range-focus-border-color);
  outline-offset: 4px;
}

:host([read-only]) {
  pointer-events: none;
}
:host([read-only]) .field-button-value {
  color: var(--_form-date-range-field-placeholder-color);
}
`;class Ct extends(e(Mt)){static get is(){return"bbva-form-date-range-field"}static get properties(){return{unfocusedPlaceholder:{type:String,attribute:"unfocused-placeholder"},focusedPlaceholder:{type:String,attribute:"focused-placeholder"},dateStringFormat:{type:String,attribute:"date-string-format"},isWritable:{type:Boolean,attribute:"is-writable"},readOnly:{type:Boolean,attribute:"read-only"}}}constructor(){super(),this.unfocusedPlaceholder="mm/dd/yyyy",this.focusedPlaceholder="__/__/____",this.allowedPattern="[0-9/]",this.placeholder=this.unfocusedPlaceholder,this.dateStringFormat="MM/DD/YYYY",this.isWritable=!1,this.readOnly=!1}firstUpdated(){super.firstUpdated(),this.isWritable?this.classList.add("unfocused-writable"):this.addEventListener("keydown",this._handleKeydown)}update(e){e.has("value")&&this._updatePlaceholderMasks(),super.update(e)}updated(e){super.updated(e),e.has("dateStringFormat")&&this._updateMask(),e.has("value")&&!this.startReadOnly&&this.dispatchEvent(new CustomEvent("date-change",{bubbles:!0,detail:{value:this.value}})),(e.has("unfocusedPlaceholder")||e.has("focusedPlaceholder"))&&(this._updatePlaceholderMasks(),this.placeholder=this.hasAttribute("focused")?this.focusedPlaceholder:this.unfocusedPlaceholder)}static get styles(){return[super.styles,$t,F("bbva-form-date-range-field-shared-styles")]}get clearButton(){return""}get labelledInput(){return P`${this.labelBlock} ${this._bgMaskTpl} ${this._input}`}get _bgMaskTpl(){return this.value?P`
          <span class="mask" aria-hidden="true">
            <span class="mask-value">${this.value}</span>
            <span class="mask-placeholder">${this._maskedPlaceholder}</span>
          </span>
        `:""}_handleKeydown(e){"Tab"!==e.key&&e.preventDefault()}_focus(){super._focus(),this.startReadOnly=document.querySelector("bbva-form-date-range[start-read-only]"),this._focused=!0,this.readOnly?this.placeholder=this.unfocusedPlaceholder:this.placeholder=this.focusedPlaceholder,this.isWritable&&this.classList.remove("unfocused-writable")}_blur(){super._blur(),this._focused=!1,this.placeholder=this.unfocusedPlaceholder,this.placeholder=this.unfocusedPlaceholder,this.isWritable&&this.classList.add("unfocused-writable")}get _maskedPlaceholder(){return this._focused&&this.isWritable?this._focusedPlaceholderMask:this._unfocusedPlaceholderMask}_updateMask(){if(this.startReadOnly=document.querySelector("bbva-form-date-range[start-read-only]"),this.endReadOnly=document.querySelector("bbva-form-date-range[end-read-only]"),this.dateStringFormat){const e=this.dateStringFormat.split("/");this._dateFormat=e.map((e=>{const t=e.charAt(0);return"y"===t.toLowerCase()&&e&&e.length>2?t.toUpperCase():t.toLowerCase()})),this._mask&&this._mask.destroy(),e.length>=3&&this._formElement&&(this._mask=new yt(this._formElement,{blocks:[e[0].length,e[1].length,e[2].length],delimiter:"/",onValueChanged:e=>{this.value=e.target.value}}))}}_updatePlaceholderMasks(){const e=this.value||"";this._focusedPlaceholderMask=this.focusedPlaceholder.substring(e.length),this._unfocusedPlaceholderMask=this.unfocusedPlaceholder.substring(e.length)}get renderFieldButton(){return P`
      <button
        class="field-button"
        @click="${this._focus}"
        @blur="${this._blur}"
        aria-disabled="${this.disabled||this.readOnly}"
        ?disabled="${this.disabled}"
      >
        <span class="field-button-label">${this.label}</span>
        <span class="${this.value?"field-button-value":"field-button-placeholder"}"
          >${this.value||this.unfocusedPlaceholder}</span
        >
      </button>
    `}render(){return P` ${this.isWritable&&!this.readOnly?this.field:this.renderFieldButton} `}}customElements.define(Ct.is,Ct);var Et=D`
:host {
  position: relative;
  display: block;
  box-sizing: border-box;
  --bbva-form-date-range-input-focused-label-color: var(--_form-date-range-field-calendar-icon-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.fields {
  position: relative;
  display: grid;
  background-color: var(--_form-date-range-field-bg-color);
  grid-template-columns: auto auto 3.5rem 2.5rem;
}
.fields-icon {
  display: flex;
  flex: 0;
  align-items: center;
  padding: 0 1rem 0 0;
  border-bottom: 0.125rem solid var(--_form-date-range-fields-border-color);
}
.fields-icon [data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: var(--_form-date-range-field-calendar-icon-color) ;
}
.invalid:not(.focused) .fields-icon {
  border-bottom: 0.125rem solid var(--_form-date-range-fields-border-error-color);
  color: var(--_form-date-range-field-label-invalid-color);
}
.invalid:not(.focused) .fields-icon [data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: var(--_form-date-range-field-label-invalid-color) ;
}
:host([disabled]) .fields {
  opacity: 0.4;
}
:host([invalid]) .fields:not(.focused) {
  border-color: var(--_form-date-range-field-invalid-border-color);
  background-color: var(--_form-date-range-field-invalid-bg-color);
}
.fields-box {
  position: relative;
  flex: 1;
}
.fields-box ::slotted(input) {
  position: absolute;
  z-index: -1;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  pointer-events: none;
}
.fields-box ~ .fields-box::before {
  position: absolute;
  top: 0.5rem;
  right: 100%;
  bottom: 0.5rem;
  display: block;
  width: 0.0625rem;
  background-color: var(--_form-date-range-fields-divider-color);
  content: "";
}

:host([invalid]) .field, :host([invalid]) .clear, :host([invalid]) .fields-icon {
  border-bottom: 0.125rem solid var(--_form-date-range-fields-border-error-color);
  color: var(--_form-date-range-field-label-invalid-color);
  --bbva-button-default--_ambient--icon-no-background-color: var(--_form-date-range-field-label-invalid-color);
  --bbva-button-default--_ambient--icon-no-background-color-active: var(--_form-date-range-field-icon-active-invalid-color);
}

.clear {
  display: flex;
  flex: 0;
  align-items: center;
  justify-content: center;
  padding: 0 0.5rem;
  border-bottom: 0.125rem solid var(--_form-date-range-fields-border-color);
}
.clear .clear-icon {
  visibility: hidden;
}
.clear.visible .clear-icon {
  visibility: visible;
}

.message {
  display: flex;
  align-items: flex-start;
  justify-content: flex-start;
  padding: 0 1rem;
  font-size: var(--typographyType3XSmall, ${k(w.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${k(S.type3XSmall)});
}
.message-icon {
  min-width: 1rem;
  min-height: 1rem;
  margin-right: 0.5rem;
}

[data-tag-name=bbva-notification-help] {
  margin-top: 0.5rem;
}
`;class Tt extends(e(E)){static get is(){return"bbva-form-date-range-field-selector"}static get scopedElements(){return{"bbva-form-date-range-field":Ct,"bbva-button-default":a,"bbva-notification-help":b,"bbva-type-icon":t}}static get properties(){return{from:{type:String},fromLabel:{type:String,attribute:"from-label"},fromInvalid:{type:Boolean,attribute:"from-invalid"},to:{type:String},toLabel:{type:String,attribute:"to-label"},toInvalid:{type:Boolean,attribute:"to-invalid"},invalid:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},size:{type:String,reflect:!0},errorMessage:{type:String,attribute:"error-message"},infoMessage:{type:String,attribute:"info-message"},activeVisible:{type:Boolean,attribute:"active-visible"},dateStringFormat:{type:String,attribute:"date-string-format"},placeholder:{type:String},clearLabel:{type:String,attribute:"clear-label"},startReadOnly:{type:Boolean,attribute:"start-read-only"},endReadOnly:{type:Boolean,attribute:"end-read-only"},isWritable:{type:Boolean,attribute:"is-writable"},_activeField:{type:Boolean,attribute:!1}}}constructor(){super(),this.size="m",this.from="",this.to="",this.fromLabel="bbva-web-form-date-range-from-label",this.toLabel="bbva-web-form-date-range-to-label",this.clearLabel="bbva-web-form-date-range-clear-label",this.errorMessage="",this.infoMessage="",this.invalid=!1,this.fromInvalid=!1,this.toInvalid=!1,this.visible=!1,this.activeVisible=!1,this._activeField=!1,this.placeholder="mm/dd/yyyy",this._innerFormat="YYYY/MM/DD",this.startReadOnly=!1,this.endReadOnly=!1,this.isWritable=!1}static get styles(){return[Et,F("bbva-form-date-range-field-selector-shared-styles")]}firstUpdated(e){super.firstUpdated(e),this.addEventListener("blur",this._onFieldBlur)}get _fieldsTpl(){const e=this.invalid||this.fromInvalid||this.toInvalid;return P`
      <div class="wrap" tabindex="-1">
        <div
          class="fields ${O({invalid:e})}"
          @click="${()=>this._onFieldFocus("from")}"
          @blur="${this._onFieldBlur}"
          @keypress="$${e=>13===e.keyCode&&this._onFieldFocus("from")}"
        >
          ${this._fieldTpl("from",this.fromLabel,this.from,e)}
          ${this._fieldTpl("to",this.toLabel,this.to,e)} ${this._clearTpl}
          ${this._calendarTpl}
        </div>
      </div>
    `}_fieldTpl(e,t,a,r){return P`
      <div class="fields-box">
        <bbva-form-date-range-field
          class="field field-${e}"
          size="${this.size}"
          .dateStringFormat="${this.dateStringFormat}"
          .label="${t}"
          .value="${a}"
          .disabled="${this.disabled}"
          .unfocusedPlaceholder="${this.placeholder}"
          ?active="${this._activeField===e&&this.activeVisible}"
          ?invalid="${r}"
          @focus="${()=>this._onFieldFocus(e)}"
          @keydown="${this._onFieldKeydown}"
          @date-change="${t=>this._onFieldDateChange(t,e)}"
          @input="${()=>this._onFieldInput(e)}"
          ?is-writable=${this.isWritable}
          ?read-only=${"from"===e?this.startReadOnly:this.endReadOnly}
        ></bbva-form-date-range-field>
        <slot name="_selector-${e}-control"></slot>
      </div>
    `}get _clearVisible(){this.startReadOnly=document.querySelector("bbva-form-date-range[start-read-only]"),this.endReadOnly=document.querySelector("bbva-form-date-range[end-read-only]");return!(!this.from&&!this.to||this.disabled||this.startReadOnly&&this.endReadOnly)||this._activeField}get _clearTpl(){const e=this._clearVisible?P`
          <bbva-button-default
            @click="${this._onClearClick}"
            aria-label="${this.clearLabel}"
            .icon="${R()}"
            variant="icon no-background"
          >
          </bbva-button-default>
        `:P``;return P`<div class="clear visible">${e}</div>`}get _calendarTpl(){return P`
      <span class="fields-icon">
        <bbva-type-icon .icon="${z()}" size="24"></bbva-type-icon>
      </span>
    `}_setMaxDate(e){return this.maxDate?"to"===e?this.maxDate:je(this.maxDate).subtract(1,"day").format(this._innerFormat):this.maxDate}get _errorVisible(){return this.errorMessage&&(this.invalid||this.fromInvalid||this.toInvalid)}get _messageInfoTpl(){return this.infoMessage?P`
          <div class="message info">
            <bbva-notification-help
              class="message-info info"
              accessibility-label-icon="Error"
              .text="${this.infoMessage}"
            ></bbva-notification-help>
          </div>
        `:""}_onFieldFocus(e){e&&(this._activeField=this.disabled||this.startReadOnly||this.endReadOnly?"":e,this.dispatchEvent(new CustomEvent("field-focus",{bubbles:!0,detail:{type:e}})))}_onFieldBlur(){this._activeField=!1,this.dispatchEvent(new CustomEvent("field-blur",{bubbles:!0}))}_onFieldKeydown(e){const{key:t}=e;"Escape"!==t&&"Esc"!==t||this.dispatchEvent(new CustomEvent("field-key-esc",{bubbles:!0})),"ArrowDown"===t&&(e.preventDefault(),this.dispatchEvent(new CustomEvent("field-key-down",{bubbles:!0})))}_onFieldDateChange(e,t){e.detail.invalid||(this[t]=e.detail.value,this.dispatchEvent(new CustomEvent("date-change",{bubbles:!0,detail:{type:t,from:this.from,to:this.to}})))}_onFieldInput(e){this.dispatchEvent(new CustomEvent("invalid-change",{bubbles:!0,detail:{type:e}}))}_onClearClick(e){this.startReadOnly||this.endReadOnly||(e.stopPropagation(),this.from="",this.to="",this._activeField=!1,this.dispatchEvent(new CustomEvent("input-clear",{bubbles:!0})))}render(){return P` <div class="form-selector">${this._fieldsTpl} ${this._messageInfoTpl}</div> `}}customElements.define(Tt.is,Tt);const Ft=D`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-date-range--_ambient--input-focus-color: initial;
    --bbva-form-date-range--_ambient--input-error-focus-color: initial;
    --bbva-form-date-range--_ambient--border-left-color: initial;
    --bbva-form-date-range--_ambient--icon-color: initial;
    --bbva-form-date-range--_ambient--icon-error-color: initial;
    --bbva-form-date-range--_ambient--readonly-color: initial;
    --bbva-form-date-range--_ambient--skeleton-animated-layer-bg: initial;
    --bbva-form-date-range--_ambient--skeleton-color: initial;

    --bbva-form-date-range--_ambient--field-bg-color: initial;
    --bbva-form-date-range--_ambient--field-label-color: initial;
    --bbva-form-date-range--_ambient--fields-border-color: initial;
    --bbva-form-date-range--_ambient--fields-border-active-color: initial;
    --bbva-form-date-range--_ambient--fields-border-error-color: initial;
    --bbva-form-date-range--_ambient--field-calendar-icon-color: initial;
    --bbva-form-date-range--_ambient--field-label-invalid-color: initial;
    --bbva-form-date-range--_ambient--field-label-icon-color: initial;
    --bbva-form-date-range--_ambient--field-invalid-bg-color: initial;
    --bbva-form-date-range--_ambient--focus-border-color: initial;
    --bbva-form-date-range--_ambient--field-placeholder-color: initial;
    --bbva-form-date-range--_ambient--field-invalid-color: initial;
  }
`,At=D`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-date-range--_ambient--input-focus-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--input-focus-color,
      ${o("colorPrimaryAltLinkMainPressed",i)}
    );

    --bbva-form-date-range--_ambient--input-error-focus-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--input-error-focus-color,
      ${o("colorPrimaryAltLinkNegativePressed",i)}
    );

    --bbva-form-date-range--_ambient--border-left-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--border-left,
      ${o("colorPrimaryAltFormatDivider",i)}
    );

    --bbva-form-date-range--_ambient--icon-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--icon-color,
      ${o("colorPrimaryAltLinkMainDefault",i)}
    );

    --bbva-form-date-range--_ambient--icon-error-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--icon-error-color,
      ${o("colorPrimaryAltLinkNegativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--readonly-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--readonly-color,
      ${o("colorPrimaryAltSupportPendingDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-animated-layer-bg: var(
      --bbva-form-date-range--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${o("colorPrimaryAltSurfaceAmbientDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--skeleton-color,
      ${o("colorPrimaryAltSurfaceAmbientPreloading",i)}
    );

    --bbva-form-date-range--_ambient--field-bg-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-bg-color,
      ${o("colorPrimaryAltSurfaceAlternativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-label-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-label-color,
      ${o("colorPrimaryAltText01Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--fields-border-color,
      ${o("colorPrimaryAltText02Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-active-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--fields-border-active-color,
      ${o("colorPrimaryAltText02Pressed",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-error-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--fields-border-error-color,
      ${o("colorPrimaryAltFormInputBorderError",i)}
    );

    --bbva-form-date-range--_ambient--field-calendar-icon-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-calendar-icon-color,
      ${o("colorPrimaryAltFormInputIconReadOnly",i)}
    );

    --bbva-form-date-range--_ambient--field-label-invalid-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-label-invalid-color,
      ${o("colorPrimaryAltFormInputIconError",i)}
    );

    --bbva-form-date-range--_ambient--field-label-icon-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-label-icon-color,
      ${o("colorPrimaryAltSupportInfoDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-bg-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-invalid-bg-color,
      ${o("colorPrimaryAltFormInputBackgroundError",i)}
    );

    --bbva-form-date-range--_ambient--focus-border-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--focus-border-color,
      ${o("colorPrimaryAltSurfaceAmbientFocus",i)}
    );

    --bbva-form-date-range--_ambient--field-placeholder-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-placeholder-color,
      ${o("colorPrimaryAltText02Default",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-color: var(
      --bbva-form-date-range--custom--primary-alt-ambient--field-invalid-color,
      ${o("colorPrimaryAltFormInputFieldTextError",i)}
    );
  }
`,Pt=D`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-date-range--_ambient--input-focus-color: var(
      --bbva-form-date-range--custom--secondary-ambient--input-focus-color,
      ${o("colorSecondaryLinkMainPressed",i)}
    );

    --bbva-form-date-range--_ambient--input-error-focus-color: var(
      --bbva-form-date-range--custom--secondary-ambient--input-error-focus-color,
      ${o("colorSecondaryLinkNegativePressed",i)}
    );

    --bbva-form-date-range--_ambient--border-left-color: var(
      --bbva-form-date-range--custom--secondary-ambient--border-left,
      ${o("colorSecondaryFormatDivider",i)}
    );

    --bbva-form-date-range--_ambient--icon-color: var(
      --bbva-form-date-range--custom--secondary-ambient--icon-color,
      ${o("colorSecondaryLinkMainDefault",i)}
    );

    --bbva-form-date-range--_ambient--icon-error-color: var(
      --bbva-form-date-range--custom--secondary-ambient--icon-error-color,
      ${o("colorSecondaryLinkNegativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--readonly-color: var(
      --bbva-form-date-range--custom--secondary-ambient--readonly-color,
      ${o("colorSecondarySupportPendingDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-animated-layer-bg: var(
      --bbva-form-date-range--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${o("colorSecondarySurfaceAmbientDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-color: var(
      --bbva-form-date-range--custom--secondary-ambient--skeleton-color,
      ${o("colorSecondarySurfaceAmbientPreloading",i)}
    );

    --bbva-form-date-range--_ambient--field-bg-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-bg-color,
      ${o("colorSecondarySurfaceAlternativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-label-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-label-color,
      ${o("colorSecondaryText01Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-color: var(
      --bbva-form-date-range--custom--secondary-ambient--fields-border-color,
      ${o("colorSecondaryText02Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-active-color: var(
      --bbva-form-date-range--custom--secondary-ambient--fields-border-active-color,
      ${o("colorSecondaryText02Pressed",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-error-color: var(
      --bbva-form-date-range--custom--secondary-ambient--fields-border-error-color,
      ${o("colorSecondaryFormInputBorderError",i)}
    );

    --bbva-form-date-range--_ambient--field-calendar-icon-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-calendar-icon-color,
      ${o("colorSecondaryFormInputIconReadOnly",i)}
    );

    --bbva-form-date-range--_ambient--field-label-invalid-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-label-invalid-color,
      ${o("colorSecondaryFormInputIconError",i)}
    );

    --bbva-form-date-range--_ambient--field-label-icon-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-label-icon-color,
      ${o("colorSecondarySupportInfoDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-bg-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-invalid-bg-color,
      ${o("colorSecondaryFormInputBackgroundError",i)}
    );

    --bbva-form-date-range--_ambient--focus-border-color: var(
      --bbva-form-date-range--custom--secondary-ambient--focus-border-color,
      ${o("colorSecondarySurfaceAmbientFocus",i)}
    );

    --bbva-form-date-range--_ambient--field-placeholder-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-placeholder-color,
      ${o("colorSecondaryText02Default",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-color: var(
      --bbva-form-date-range--custom--secondary-ambient--field-invalid-color,
      ${o("colorSecondaryFormInputFieldTextError",i)}
    );
  }
`,It=D`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-date-range--_ambient--input-focus-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--input-focus-color,
      ${o("colorSecondaryAltLinkMainPressed",i)}
    );

    --bbva-form-date-range--_ambient--input-error-focus-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--input-error-focus-color,
      ${o("colorSecondaryAltLinkNegativePressed",i)}
    );

    --bbva-form-date-range--_ambient--border-left-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--border-left,
      ${o("colorSecondaryAltFormatDivider",i)}
    );

    --bbva-form-date-range--_ambient--icon-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--icon-color,
      ${o("colorSecondaryAltLinkMainDefault",i)}
    );

    --bbva-form-date-range--_ambient--icon-error-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--icon-error-color,
      ${o("colorSecondaryAltLinkNegativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--readonly-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--readonly-color,
      ${o("colorSecondaryAltSupportPendingDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-animated-layer-bg: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${o("colorSecondaryAltSurfaceAmbientDefault",i)}
    );

    --bbva-form-date-range--_ambient--skeleton-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--skeleton-color,
      ${o("colorSecondaryAltSurfaceAmbientPreloading",i)}
    );

    --bbva-form-date-range--_ambient--field-bg-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-bg-color,
      ${o("colorSecondaryAltSurfaceAlternativeDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-label-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-label-color,
      ${o("colorSecondaryAltText01Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--fields-border-color,
      ${o("colorSecondaryAltText02Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-active-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--fields-border-active-color,
      ${o("colorSecondaryAltText02Default",i)}
    );

    --bbva-form-date-range--_ambient--fields-border-error-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--fields-border-error-color,
      ${o("colorSecondaryAltFormInputBorderError",i)}
    );

    --bbva-form-date-range--_ambient--field-calendar-icon-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-calendar-icon-color,
      ${o("colorSecondaryAltFormInputIconReadOnly",i)}
    );

    --bbva-form-date-range--_ambient--field-label-invalid-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-label-invalid-color,
      ${o("colorSecondaryAltFormInputIconError",i)}
    );

    --bbva-form-date-range--_ambient--field-label-icon-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-label-icon-color,
      ${o("colorSecondaryAltSupportInfoDefault",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-bg-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-invalid-bg-color,
      ${o("colorSecondaryAltFormInputBackgroundError",i)}
    );

    --bbva-form-date-range--_ambient--focus-border-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--focus-border-color,
      ${o("colorSecondaryAltSurfaceAmbientFocus",i)}
    );

    --bbva-form-date-range--_ambient--field-placeholder-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-placeholder-color,
      ${o("colorSecondaryAltText02Default",i)}
    );

    --bbva-form-date-range--_ambient--field-invalid-color: var(
      --bbva-form-date-range--custom--secondary-alt-ambient--field-invalid-color,
      ${o("colorSecondaryAltFormInputFieldTextError",i)}
    );
  }
`;const Yt=l([Object.freeze({__proto__:null,primary:Ft,primaryAlt:At,secondary:Pt,secondaryAlt:It}),d,g,v,s,c,se]),Lt=Object.values(Yt);var Ot=D`
:host {
  --_form-date-range-input-focus-color:
    var(--bbva-form-date-range--_ambient--input-focus-color,
        var(--bbva-form-date-range--custom--primary-ambient--input-focus-color,
            ${o("colorPrimaryLinkMainPressed",i)}));
  --_form-date-range-input-error-focus-color:
    var(--bbva-form-date-range--_ambient--input-error-focus-color,
        var(--bbva-form-date-range--custom--primary-ambient--input-error-focus-color,
            ${o("colorPrimaryLinkNegativePressed",i)}));
  --_form-date-range-border-left-color:
    var(--bbva-form-date-range--_ambient--border-left-color,
        var(--bbva-form-date-range--custom--primary-ambient--border-left,
            ${o("colorPrimaryFormatDivider",i)}));
  --_form-date-range-icon-color:
    var(--bbva-form-date-range--_ambient--icon-color,
        var(--bbva-form-date-range--custom--primary-ambient--icon-color,
            ${o("colorPrimaryLinkMainDefault",i)}));
  --_form-date-range-icon-error-color:
    var(--bbva-form-date-range--_ambient--icon-error-color,
        var(--bbva-form-date-range--custom--primary-ambient--icon-error-color,
            ${o("colorPrimaryLinkNegativeDefault",i)}));
  --_form-date-range-readonly-color:
    var(--bbva-form-date-range--_ambient--readonly-color,
        var(--bbva-form-date-range--custom--primary-ambient--readonly-color,
            ${o("colorPrimarySupportPendingDefault",i)}));
  --_form-date-range-skeleton-animated-layer-bg:
    var(--bbva-form-date-range--_ambient--skeleton-animated-layer-bg,
        var(--bbva-form-date-range--custom--primary-ambient--skeleton-animated-layer-bg,
            ${o("colorPrimarySurfaceAmbientDefault",i)}));
  --_form-date-range-skeleton-quote-color:
    var(--bbva-form-date-range--_ambient--skeleton-color,
        var(--bbva-form-date-range--custom--primary-ambient--skeleton-color,
            ${o("colorPrimarySurfaceAmbientPreloading",i)}));
  --_form-date-range-field-bg-color:
    var(--bbva-form-date-range--_ambient--field-bg-color,
        var(--bbva-form-date-range--custom--primary-ambient--field-bg-color,
            ${o("colorPrimarySurfaceAlternativeDefault",i)}));
  --_form-date-range-field-label-color:
    var(--bbva-form-date-range--_ambient--field-label-color,
        var(--bbva-form-date-range--custom--primary-ambient--field-label-color,
            ${o("colorPrimaryText01Default",i)}));
  --_form-date-range-field-placeholder-color:
  var(--bbva-form-date-range--_ambient--field-placeholder-color,
      var(--bbva-form-date-range--custom--primary-ambient--field-placeholder-color,
          ${o("colorPrimaryText02Default",i)}));
  --_form-date-range-field-invalid-color:
    var(--bbva-form-date-range--_ambient--field-invalid-color,
        var(--bbva-form-date-range--custom--primary-ambient--field-invalid-color,
            ${o("colorPrimaryFormInputFieldTextError",i)}));
  --_form-date-range-fields-border-color:
    var(--bbva-form-date-range--_ambient--fields-border-color,
        var(--bbva-form-date-range--custom--primary-ambient--fields-border-color,
            ${o("colorPrimaryText02Default",i)}));
  --_form-date-range-fields-border-active-color:
    var(--bbva-form-date-range--_ambient--fields-border-active-color,
        var(--bbva-form-date-range--custom--primary-ambient--fields-border-active-color,
            ${o("colorPrimaryText02Pressed",i)}));
  --_form-date-range-fields-border-error-color:
    var(--bbva-form-date-range--_ambient--fields-border-error-color,
      var(--bbva-form-date-range--custom--primary-ambient--fields-border-error-color,
        ${o("colorPrimaryFormInputBorderError",i)}));
  --_form-date-range-fields-divider-color:
    var(--bbva-form-date-range--_ambient--fields-divider-color,
      var(--bbva-form-date-range--custom--primary-ambient--fields-divider-color,
        ${o("colorPrimaryCtaDisabledText",i)}));
  --_form-date-range-field-calendar-icon-color: var(--bbva-form-date-range--_ambient--field-calendar-icon-color,
      var(--bbva-form-date-range--custom--primary-ambient--field-calendar-icon-color,
        ${o("colorPrimaryFormInputIconReadOnly",i)}));
  --_form-date-range-field-label-invalid-color:
    var(--bbva-form-date-range--_ambient--field-label-invalid-color,
      var(--bbva-form-date-range--custom--primary-ambient--field-label-invalid-color,
        ${o("colorPrimaryFormInputIconError",i)}));
  --_form-date-range-field-label-icon-color:
    var(--bbva-form-date-range--_ambient--field-label-icon-color,
      var(--bbva-form-date-range--custom--primary-ambient--field-label-icon-color,
        ${o("colorPrimarySupportInfoDefault",i)}));
  --_form-date-range-field-invalid-bg-color:
    var(--bbva-form-date-range--_ambient--field-invalid-bg-color,
      var(--bbva-form-date-range--custom--primary-ambient--field-invalid-bg-color,
        ${o("colorPrimaryFormInputBackgroundError",i)}));
  --_form-date-range-focus-border-color: var(--bbva-form-date-range--_ambient--focus-border-color,
    var(--bbva-form-date-range--custom--primary-ambient--focus-border-color,
      ${o("colorPrimarySurfaceAmbientFocus",i)}));
  --_form-date-range-field-icon-active-invalid-color: var(--bbva-form-date-range--custom--primary-ambient--field-icon-active-invalid-color,
      ${o("colorPrimaryFormInputIconErrorPressed",i)});
}
`,Nt=D`
:host {
  --_skeleton-default-bg-color: var(--bbva-skeleton-default--_ambient--bg-color, var(--bbva-skeleton-default--custom--primary-ambient--bg-color, var(--color-primary-surface-ambient-preloading,#ffffff)));
  --_skeleton-default-animated-bg-color: var(--bbva-skeleton-default--_ambient--animated-bg-color, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color, var(--color-primary-surface-ambient-default,#f4f4f4)));
  --_skeleton-default-bg-color-alt: var(--bbva-skeleton-default--_ambient--bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--bg-color-alt, var(--color-primary-surface-alternative-preloading,#e9e9e9)));
  --_skeleton-default-animated-bg-color-alt: var(--bbva-skeleton-default--_ambient--animated-bg-color-alt, var(--bbva-skeleton-default--custom--primary-ambient--animated-bg-color-alt, var(--color-primary-surface-alternative-default,#ffffff)));
}

:host {
  display: flex;
  box-sizing: border-box;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-around;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
  padding: 0;
  margin: 0;
}

label {
  display: block;
  padding: calc(var(--bbva-global-spacer, 0.5rem) * 3) 1rem;
}

.input-date {
  position: absolute;
  top: 0;
  left: 0;
  overflow: hidden;
  width: 100%;
  height: 100%;
  border: none;
  background: transparent;
  color: transparent;
  outline-color: var(--_form-date-range-fields-border-active-color);
}
.input-date::-webkit-outer-spin-button, .input-date::-webkit-inner-spin-button, .input-date::-webkit-clear-button {
  display: none;
  -webkit-appearance: none;
}
.input-date::-webkit-calendar-picker-indicator {
  width: 100%;
  height: 100%;
  padding: 4rem;
  cursor: pointer;
  opacity: 0;
}
.input-date::-webkit-datetime-edit {
  opacity: 0;
}

.icon-calendar {
  position: relative;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  fill: var(--_form-date-range-icon-color);
}
.icon-calendar--error {
  fill: var(--_form-date-range-icon-error-color);
}

.range {
  position: relative;
  overflow: hidden;
  flex: 50%;
  background: none;
  text-align: center;
}
.range + .range::before {
  position: absolute;
  top: 0;
  left: 0;
  height: calc(100% - var(--bbva-global-spacer, 0.5rem) * 3 * 2);
  border-left: 0.0625rem solid var(--_form-date-range-border-left-color);
  margin: calc(var(--bbva-global-spacer, 0.5rem) * 3) 0;
  content: "";
}
.range .text {
  margin: var(--bbva-global-spacer, 0.5rem) 0 calc(var(--bbva-global-spacer, 0.5rem) / 2);
}
.range .text--error {
  color: var(--_form-date-range-icon-error-color);
}
.range .result {
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
  text-align: center;
}
.range [data-tag-name=bbva-type-date] {
  font-size: var(--bbva-form-date-range-dateclass-font-size, var(--typographyTypeSmall, ${k(w.typeSmall)}));
  font-style: var(--bbva-form-date-range-dateclass-font-style, var(--fontFaceSecondaryRegularItalicFontStyle, ${k(V.regularItalic.fontStyle)}));
}

.range--readonly {
  pointer-events: none;
}
.range--readonly .icon-calendar {
  fill: var(--_form-date-range-readonly-color);
}
.range--readonly .text,
.range--readonly #start-date,
.range--readonly #end-date {
  color: var(--_form-date-range-readonly-color);
}

.range--desktop-readonly {
  pointer-events: none;
}

:not(.range--readonly).range label:focus-within .icon-calendar {
  fill: var(--_form-date-range-input-focus-color);
}
:not(.range--readonly).range label:focus-within .icon-calendar--error {
  fill: var(--_form-date-range-input-error-focus-color);
}
:not(.range--readonly).range label:focus-within .date-range {
  color: var(--_form-date-range-input-focus-color);
}
:not(.range--readonly).range label:focus-within .date-range--error {
  color: var(--_form-date-range-input-error-focus-color);
}

.calendar-open:focus-visible {
  border: none;
  outline: none;
}
.calendar-open:focus-within {
  border: none;
  outline: none;
}

.message-error {
  flex-basis: 100%;
  padding-left: 1rem;
}

:host([loading]) .range {
  overflow: hidden;
  width: 100%;
  margin-right: auto;
  margin-left: auto;
}
:host([loading]) .range .skeleton {
  height: 7.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(-60deg, transparent 50%, black 50%), linear-gradient(-60deg, transparent 50%, black 50%);
  -webkit-mask-position: calc(50%) 20px, calc(50% + 32px) 55px, calc(50% + 32px) 80px;
  mask-position: calc(50%) 20px, calc(50% + 32px) 55px, calc(50% + 32px) 80px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 24px 24px, calc((65px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  mask-size: 24px 24px, calc((65px * 2) + (16px/ 2)) 16px, calc((65px * 2) + (16px/ 2)) 16px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading]) .range .skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

:host([loading]) .range-desktop {
  overflow: hidden;
  width: 100%;
  margin-right: auto;
  margin-left: auto;
}
:host([loading]) .range-desktop .skeleton {
  height: 7.5rem;
  background-color: var(--_skeleton-default-bg-color);
  -webkit-mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  mask-image: linear-gradient(black 100%, transparent 0), linear-gradient(black 100%, transparent 0);
  -webkit-mask-position: 0px 20px, 240px 20px;
  mask-position: 0px 20px, 240px 20px;
  -webkit-mask-repeat: no-repeat;
  mask-repeat: no-repeat;
  -webkit-mask-size: 230px 32px, 250px 32px;
  mask-size: 230px 32px, 250px 32px;
  pointer-events: none;
  /*
  &::after {
     display: block;
     width: 100%;
     height: 100%;
     animation: skeletonAnimation 1500ms ease-in 100ms infinite alternate-reverse;
     background-color: var(--_skeleton-default-animated-bg-color);
     background-repeat: no-repeat;
     content: '';
     object-fit: cover;
     opacity: 0.1;
   }
   @keyframes skeletonAnimation {
     0% {
       opacity: 0.1;
     }
     100%{
       opacity: 1;
     }
   }*/
}
:host([loading]) .range-desktop .skeleton::after {
  display: block;
  width: 100%;
  height: 100%;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background-color: var(--_skeleton-default-animated-bg-color);
  background-image: linear-gradient(var(--_skeleton-default-bg-color) 100%, transparent 0);
  background-position-x: 100vh;
  background-repeat: no-repeat;
  content: "";
  object-fit: cover;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
}
@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    opacity: 0;
    transform: translateX(0%) scaleX(2);
  }
}

.wrapper {
  display: block;
  width: 100%;
}

.calendar-wrap {
  position: absolute;
  z-index: -1;
  top: 3rem;
  left: 0;
  height: 0;
  opacity: 0;
  transform: translateY(1rem);
  transition: opacity var(--_transition-time), transform var(--_transition-time), visibility 0s var(--_transition-time), z-index 0s var(--_transition-time);
  visibility: hidden;
}
.calendar-wrap.with-legend {
  top: 5rem;
}
.calendar-wrap [data-tag-name=bbva-form-calendar] {
  margin-top: 1rem;
  background-color: var(--_form-date-range-field-bg-color);
  box-shadow: var(--boxShadowType1, 0 1px 3px 0 rgba(18, 18, 18, 0.2));
}
.calendar-wrap .box {
  width: auto;
  height: auto;
  background-color: var(--_form-date-range-field-bg-color);
}
.calendar-wrap.visible {
  z-index: 1;
  opacity: 1;
  transform: translateY(0);
  transition: opacity var(--_transition-time), transform var(--_transition-time), visibility 0s 0s, z-index 0s 0s;
  visibility: visible;
}
:host([size=l]) .calendar-wrap {
  top: 3.5rem;
}
:host([size=l]) .calendar-wrap.with-legend {
  top: 5.5rem;
}

:host([size=l]) {
  top: 3.5rem;
}
:host([size=l]).with-legend {
  top: 5.5rem;
}

.fieldset {
  min-width: 16.75rem;
  max-width: 34.75rem;
}
.fieldset .legend {
  display: flex;
  align-items: center;
  justify-content: start;
  padding: 0;
  margin: 0 0 0.5rem 0;
}

[data-tag-name=bbva-notification-help] {
  margin-top: 0.5rem;
}

@media (min-width: 768px) {
  :host {
    position: relative;
    display: flex;
    display: block;
    box-sizing: border-box;
    justify-content: start;
  }
  :host input.input-form {
    display: none;
  }
}
.form-input-desktop {
  display: flex;
}
`;je.extend((function(e,t,a){a.p.customParseFormat=!0,e&&e.parseTwoDigitYear&&(Ge=e.parseTwoDigitYear);var r=t.prototype,n=r.parse;r.parse=function(e){var t=e.date,r=e.utc,o=e.args;this.$u=r;var i=o[1];if("string"==typeof i){var l=!0===o[2],s=!0===o[3],c=l||s,d=o[2];s&&(d=o[2]),Je=this.$locale(),!l&&d&&(Je=a.Ls[d]),this.$d=function(e,t,a,r){try{if(["x","X"].indexOf(t)>-1)return new Date(("X"===t?1e3:1)*e);var n=nt(t)(e),o=n.year,i=n.month,l=n.day,s=n.hours,c=n.minutes,d=n.seconds,m=n.milliseconds,u=n.zone,f=n.week,h=new Date,b=l||(o||i?1:h.getDate()),p=o||h.getFullYear(),g=0;o&&!i||(g=i>0?i-1:h.getMonth());var v,y=s||0,_=c||0,D=d||0,k=m||0;return u?new Date(Date.UTC(p,g,b,y,_,D,k+60*u.offset*1e3)):a?new Date(Date.UTC(p,g,b,y,_,D,k)):(v=new Date(p,g,b,y,_,D,k),f&&(v=r(v).week(f).toDate()),v)}catch(e){return new Date("")}}(t,i,r,a),this.init(),d&&!0!==d&&(this.$L=this.locale(d).$L),c&&t!=this.format(i)&&(this.$d=new Date("")),Je={}}else if(i instanceof Array)for(var m=i.length,u=1;u<=m;u+=1){o[1]=i[u-1];var f=a.apply(this,o);if(f.isValid()){this.$d=f.$d,this.$L=f.$L,this.init();break}u===m&&(this.$d=new Date(""))}else n.call(this,e)}}));const Rt=e=>{let t="";if(e){const a=new Date(e),r=new Date(a.getTime()+Math.abs(6e4*a.getTimezoneOffset()));let n=r.getUTCDate(),o=r.getUTCMonth()+1;n<10&&(n=`0${n}`),o<10&&(o=`0${o}`),t=`${r.getUTCFullYear()}-${o}-${n}`}return t},Ht={es:{format:"DD/MM/YYYY",placeholder:"dd/mm/aaaa"},en:{format:"MM/DD/YYYY",placeholder:"mm/dd/yyyy"},"es-ES":{format:"DD/MM/YYYY",placeholder:"dd/mm/aaaa"},"en-US":{format:"MM/DD/YYYY",placeholder:"mm/dd/yyyy"}};class jt extends(e(W(h(C(f(E)))))){static get is(){return"bbva-form-date-range"}static get scopedElements(){return{"bbva-type-text":y,"bbva-type-date":_,"bbva-type-icon":t,"bbva-notification-help":b,"bbva-form-date-range-field-selector":Tt,"bbva-form-calendar":pe,"bbva-button-default":a}}static get properties(){return{startDate:{type:String,attribute:"start-date"},endDate:{type:String,attribute:"end-date"},startText:{type:String,attribute:"start-text"},endText:{type:String,attribute:"end-text"},locale:{type:String},dateOptions:{type:Object,attribute:"date-options"},utc:{type:Boolean},iconCalendar:{type:String,attribute:"icon-calendar"},calendarIconSize:{type:Number,attribute:"calendar-icon-size"},startError:{type:Boolean,attribute:"start-error"},endError:{type:Boolean,attribute:"end-error"},invalid:{type:Boolean},errorMessage:{type:String,attribute:"error-message"},alertIconSize:{type:Number,attribute:"alert-icon-size"},startTitleText:{type:String,attribute:"start-title-text"},endTitleText:{type:String,attribute:"end-title-text"},denyFutureDates:{type:Boolean,attribute:"deny-future-dates"},denyPastDates:{type:Boolean,attribute:"deny-past-dates"},minDateFrom:{type:String,attribute:"min-date-from"},maxDateFrom:{type:String,attribute:"max-date-from"},minDateTo:{type:String,attribute:"min-date-to"},maxDateTo:{type:String,attribute:"max-date-to"},_today:{type:String},loading:{type:Boolean,reflect:!0},startReadOnly:{type:Boolean,attribute:"start-read-only"},endReadOnly:{type:Boolean,attribute:"end-read-only"},_desktop:{type:Boolean,attribute:!1},native:{type:Boolean},from:{type:String},to:{type:String},fromLabel:{type:String},toLabel:{type:String,attribute:"to-label"},fromInvalid:{type:Boolean,attribute:"from-invalid"},clearLabel:{type:String,attribute:"clear-label"},toInvalid:{type:Boolean,attribute:"to-invalid"},size:{type:String,reflect:!0},infoMessage:{type:String,attribute:"info-message"},_calendarOpened:{attribute:!1},_calendarSelectRangeStart:{attribute:!1},_optionsSlotTarget:{attribute:!1},_largeView:{attribute:!1},_announcerText:{attribute:!1},langDateConfig:{type:Object,attribute:"lang-date-config"},label:{type:String},isWritable:{type:Boolean,attribute:"is-writable"}}}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}constructor(){super(),this._startDate="",this._endDate="",this.startText="bbva-form-date-range-start-date-text",this.endText="bbva-form-date-range-end-date-text",this.dateOptions={day:"2-digit",month:"2-digit",year:"2-digit"},this.iconCalendar=z(),this.iconInfo=j(),this.calendarIconSize=24,this.startError=!1,this.endError=!1,this.errorMessage="bbva-form-date-range-error",this.alertIconSize=16,this.startTitleText="bbva-form-date-range-start-title-text",this.endTitleText="bbva-form-date-range-end-title-text",this.denyPastDates=!1,this.denyFutureDates=!1,this.loading=!1,this.disabled=!1,this._today=new Date,this.utc=!1,this._desktop=!1,this.native=!1,this.fromLabel="bbva-form-date-range-from-label",this.toLabel="bbva-form-date-range-to-label",this.clearLabel="bbva-form-date-range-clear-label",this.size="m",this.infoMessage="",this.langDateConfig=Ht,this._id=U(),this._checkFocusOut=this._checkFocusOut.bind(this),this.isWritable=!1}_notifyPropertyChanged(e){const t=new CustomEvent(`form-date-range-${a=e,a.replace(/[A-Z]/g,((e,t)=>(0!==t?"-":"")+e.toLowerCase()))}-change`,{detail:!0,bubbles:!0,composed:!0});var a;this.dispatchEvent(t)}_setterHelper(e,t){const a=this[e];a!==t&&(this[e]=t,this.requestUpdate(e,a))}get startDate(){return this._startDate}set startDate(e){this._setterHelper("_startDate",e)}get endDate(){return this._endDate}set endDate(e){this._setterHelper("_endDate",e)}get _minStartDate(){return this.minDateFrom?Rt(this.minDateFrom):this.denyPastDates?Rt(this._today):""}get _maxStartDate(){if(this.maxDateFrom)return this.endDate?Rt(this.endDate):Rt(this.maxDateFrom);const e=this.endDate?this.endDate:this.denyFutureDates?this._today:"";return Rt(e)}get _minEndDate(){if(this.minDateTo)return this.startDate?Rt(this.startDate):Rt(this.minDateTo);const e=this.startDate?this.startDate:this.denyPastDates?this._today:"";return Rt(e)}get _maxEndDate(){return this.maxDateTo?Rt(this.maxDateTo):this.denyFutureDates?Rt(this._today):""}setStartDate(e,t){this._setDate("start",e,t)}setEndDate(e,t){this._setDate("end",e,t)}_setDate(e,t,a){const r=Rt(this._today);t&&this._checkPastDate(t,r)&&this._checkFutureDate(t,r)&&this._checkDateRange(e,t)&&(this[`${e}Date`]=Rt(t),this._lastDate?this._lastDate=a:this._lastDate=r,this.dispatchEvent(new CustomEvent(`form-date-range-${e}-date-select`,{bubbles:!0,composed:!0,detail:this[`${e}Date`]})))}_checkPastDate(e,t){return!(new Date(e).getTime()<new Date(t).getTime()&&this.denyPastDates)}_checkFutureDate(e,t){return!(new Date(e).getTime()>new Date(t).getTime()&&this.denyFutureDates)}_checkDateRange(e,t){let a=!0;return"start"===e&&this.endDate?a=t<=this.endDate:"end"===e&&this.startDate&&(a=t>=this.startDate),a}_showCalendar(e){const{date:t}=e.currentTarget.dataset;this.dispatchEvent(new CustomEvent(`form-date-range-show-${t}-calendar`,{detail:e,bubbles:!0,composed:!0})),this.handleInputClick(e)}handleInputClick(e){const t=e.target.parentElement;t.classList.add("calendar-open"),this._startDate&&this._endDate||t.classList.remove("calendar-open")}static get styles(){return[super.styles,Nt,Ot,Lt,F("bbva-form-date-range-shared-styles")]}firstUpdated(e){super.firstUpdated(e);const t=this.shadowRoot.querySelector("#start-input"),a=this.shadowRoot.querySelector("#end-input"),r=this.shadowRoot.querySelectorAll("label"),n=r[0],o=r[1];t&&t.addEventListener("change",(()=>{this.startDate=t.value})),a&&a.addEventListener("change",(()=>{this.endDate=a.value})),this.startReadOnly||(n.addEventListener("keydown",this.handleTabKey),o.addEventListener("keydown",this.handleTabKey)),this._fromFormElement=this.shadowRoot.getElementById(`from_${this._id}`),this._toFormElement=this.shadowRoot.getElementById(`to_${this._id}`),this._selector=this.shadowRoot.querySelector(".selector"),this.startInput=this.shadowRoot.getElementById("start-input"),this.endInput=this.shadowRoot.getElementById("end-input"),this._moveToLight(this._fromFormElement),this._moveToLight(this._toFormElement)}updated(e){super.updated(e),this._calendar=this.shadowRoot.querySelector(".calendar"),this._calendarWrap=this.shadowRoot.querySelector(".calendar-wrap"),this._calendar&&(this._calendar.removeAttribute("aria-disabled"),this._calendar.removeAttribute("readonly")),e.has("_startDate")&&(this._setDate("start",this.startDate,e.get("_startDate")),this._notifyPropertyChanged("startDate")),e.has("_endDate")&&(this._setDate("end",this.endDate,e.get("_endDate")),this._notifyPropertyChanged("endDate")),e.has("_desktop")&&this._desktop&&(this._fromFormElement=this.shadowRoot.getElementById(`from_${this._id}`),this._toFormElement=this.shadowRoot.getElementById(`to_${this._id}`),this._calendar=this.shadowRoot.querySelector(".calendar"),this._calendarWrap=this.shadowRoot.querySelector(".calendar-wrap"),this._selector=this.shadowRoot.querySelector(".selector")),e.has("_calendarOpened")&&(this._calendarWrap=this.shadowRoot.querySelector(".calendar-wrap"),this._calendarOpened?requestAnimationFrame((()=>{this._calendar&&(this._calendar.selectedDate=this._fromDate,this._calendar.selectedEndDate=this._toDate),document.addEventListener("keydown",this._checkFocusOut),document.addEventListener("click",this._checkFocusOut),this._calendarWrap.focus()})):(document.removeEventListener("keydown",this._checkFocusOut),document.removeEventListener("click",this._checkFocusOut)),this.dispatchEvent(new CustomEvent("calendar-opened-change",{bubbles:!0,detail:{value:this._calendarOpened}}))),(e.has("from")||e.has("to"))&&this.dispatchEvent(new CustomEvent("date-range-change",{bubbles:!0,detail:{from:{value:this.from||"",date:new Date(this._fromDate),formatted:this._formattedFrom},to:{value:this.to||"",date:new Date(this._toDate),formatted:this._formattedTo}}}))}get _activeElement(){return this.shadowRoot.activeElement||this._rootNode.activeElement||document.activeElement}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._rootNode=this.getRootNode?this.getRootNode():document}handleTabKey(e){if(32===e.keyCode||13===e.keyCode){e.preventDefault();e.target.querySelector("input").showPicker()}}get messageError(){return this.endError||this.startError||this.invalid?P` <bbva-notification-help
          id="message-error"
          class="message-error alert"
          accessibility-label-icon="Error"
          text="${this.t(this.errorMessage)}"
          variant="alert"
        ></bbva-notification-help>`:""}get _mobileSkeletonTpl(){return P`
      <div class="range" id="start-container">
        <div class="skeleton"></div>
      </div>
      <div class="range" id="end-container">
        <div class="skeleton"></div>
      </div>
    `}get _mobileStartInputTpl(){return P`
      <label tabindex="${this.disabled?-1:0}" for="start-input-date" role="button">
        <bbva-type-icon
          tabindex="-1"
          id="start-icon"
          .size="${this.calendarIconSize}"
          .icon="${this.iconCalendar}"
          class="icon-calendar ${this.startDate?"icon-calendar--filled":""} ${this.startError||this.invalid?"icon-calendar--error":""}"
        ></bbva-type-icon>
        <bbva-type-text
          unset
          ellipsis
          lines="1"
          class="text ${this.startError||this.invalid?"text--error":""}"
          id="start-text"
          text="${this.t(this.startText)}"
          size="S"
          alignment="center"
          tabindex="-1"
        >
        </bbva-type-text>
        <div class="result">
          ${this.startDate?P`
                <bbva-type-date
                  id="start-date"
                  date="${this.startDate}"
                  .options="${this.dateOptions}"
                  .utc="${this.utc}"
                  locale="${q(this.locale)}"
                  font-weight="500"
                  font-style="italic"
                  tabindex="-1"
                >
                </bbva-type-date>
              `:P`
                <bbva-type-text
                  variant=${this.startReadOnly?"":"spotlight"}
                  unset
                  class="date-range"
                  size="S"
                  .text="${this.t(this.startTitleText)}"
                  tabindex="-1"
                  id="start-title-text"
                >
                </bbva-type-text>
              `}
        </div>
        <input
          .min="${this._minStartDate}"
          .max="${this._maxStartDate}"
          id="start-input"
          class="input-date"
          type="date"
          name="start-input-date"
          .value="${this.startDate}"
          data-date="start"
          tabindex="-1"
          @click="${this._showCalendar}"
        />
      </label>
    `}get _mobileEndInputTpl(){return P`
      <label tabindex="${this.disabled?-1:0}" for="end-input" role="button">
        <bbva-type-icon
          tabindex="-1"
          id="end-icon"
          .size="${this.calendarIconSize}"
          .icon="${this.iconCalendar}"
          class="icon-calendar ${this.endDate?"icon-calendar--filled":""} ${this.endError||this.invalid?"icon-calendar--error":""}"
        ></bbva-type-icon>
        <bbva-type-text
          unset
          tabindex="-1"
          ellipsis
          lines="1"
          class="text ${this.endError||this.invalid?"text--error":""}"
          id="end-text"
          text="${this.t(this.endText)}"
          size="S"
          alignment="center"
        >
        </bbva-type-text>
        <div class="result">
          ${this.endDate?P`
                <bbva-type-date
                  id="end-date"
                  date="${this.endDate}"
                  .options="${this.dateOptions}"
                  .utc="${this.utc}"
                  locale="${q(this.locale)}"
                  font-weight="500"
                  font-style="italic"
                  tabindex="-1"
                ></bbva-type-date>
              `:P`
                <bbva-type-text
                  variant=${this.endReadOnly?"":"spotlight"}
                  unset
                  class="date-range"
                  size="S"
                  .text="${this.t(this.endTitleText)}"
                  id="end-title-text"
                  tabindex="-1"
                >
                </bbva-type-text>
              `}
        </div>

        <input
          .min="${this._minEndDate}"
          .max="${this._maxEndDate}"
          id="end-input"
          class="input-date"
          type="date"
          name="end-input-date"
          .value="${this.endDate}"
          data-date="end"
          tabindex="-1"
          @click="${this._showCalendar}"
        />
      </label>
    `}get renderMobileTpl(){return P` ${this.loading?this._mobileSkeletonTpl:this.mobileTpl}`}get mobileTpl(){return P`
      <div class="range ${this.startReadOnly?"range--readonly":""}" id="start-container">
        ${this._mobileStartInputTpl}
      </div>
      <div class="range ${this.endReadOnly?"range--readonly":""}" id="end-container">
        ${this._mobileEndInputTpl}
      </div>
      ${this.messageError}
    `}get desktopTpl(){return this.loading?P`
          <div class="range-desktop" id="start-container">
            <div class="skeleton"></div>
          </div>
        `:P`
          <div class="calendar-wrap ${this.label?"with-legend":""}">
            <bbva-form-calendar
              class="calendar"
              mode="range"
              .selectedDate="${this.selectedDate}"
              .selectedEndDate="${this.selectedEndDate}"
              .selectedDates="${this.selectedDates}"
              .initialDate="${this.initialDate}"
              .minDate="${this._minStartDate}"
              .maxDate="${this._maxEndDate}"
              @form-calendar-date-confirm="${this._onDateConfirm}"
            ></bbva-form-calendar>
          </div>
          <div class="fieldset">${this.label&&this.labelTpl} ${this._desktopControlTpl}</div>
          ${this._control} ${this.messageError}
        `}get labelTpl(){return P`
      <label class="legend">
        <bbva-type-text
          unset
          class="label"
          size="S"
          .text="${this.label}"
          aria-disabled="false"
        ></bbva-type-text>
        <bbva-button-default
          class="label-icon"
          @click="${this._onHelpClick}"
          .icon="${this.iconInfo}"
          icon-size="16"
          variant="icon no-background"
        ></bbva-button-default>
      </label>
    `}get _desktopControlTpl(){return P`
      <bbva-form-date-range-field-selector
        class="selector field-selector"
        .from="${this._formattedFrom}"
        .fromLabel="${this.t(this.fromLabel)}"
        .fromInvalid="${this.fromInvalid}"
        .to="${this._formattedTo}"
        .toLabel="${this.t(this.toLabel)}"
        .clearLabel="${this.t(this.clearLabel)}"
        .toInvalid="${this.toInvalid}"
        ?invalid="${this.invalid}"
        .disabled="${this.disabled}"
        .size="${this.size}"
        .errorMessage="${this.t(this.errorMessage)}"
        .infoMessage="${this.infoMessage}"
        ?activeVisible="${this._calendarOpened}"
        .dateStringFormat="${this._dateStringFormat}"
        .minDate="${this._minDateStr}"
        .maxDate="${this._maxDateStr}"
        .placeholder="${this._dateStringPlaceholder}"
        ?is-writable=${this.isWritable}
        ?start-read-only="${this.startReadOnly}"
        ?end-read-only="${this.endReadOnly}"
        @field-focus="${this._onFieldFocus}"
        @field-key-esc="${this._onFieldKeyEsc}"
        @field-key-down="${this._onFieldKeydown}"
        @date-change="${this._onFieldsDateChange}"
        @invalid-change="${this._onFieldInvalidChange}"
        @input-clear="${this._onFieldsInputClear}"
      >
        ${this._controlSlotsTpl}
      </bbva-form-date-range-field-selector>
      ${this._messageTpl}
    `}get _controlSlotsTpl(){return P`
      <slot name="_selector-from-control" slot="_selector-from-control"></slot>
      <slot name="_selector-to-control" slot="_selector-to-control"></slot>
    `}get from(){return this.__from}set from(e){const t=this.__from;if(t!==e){if(this._updateDateProp("from",e),this._minDateDate&&this._fromDate&&je(this._fromDate).isBefore(this._minDateDate,"day"))return void(this.from=this._minDateStr);if(this._maxDateDate&&this._fromDate&&je(this._fromDate).isAfter(je(this._maxDateDate).subtract(1,"day"),"day"))return void(this.from=je(this._maxDateDate).subtract(1,"day").format(this._innerFormat));this.requestUpdate("from",t),this._toDate&&this._fromDate&&je(this._fromDate).isAfter(this._toDate,"day")&&(this.to=je(this._fromDate).format(this._innerFormat))}}get to(){return this.__to}set to(e){const t=this.__to;if(t!==e){if(this._updateDateProp("to",e),this._minDateDate&&this._toDate&&je(this._toDate).isBefore(je(this._minDateDate).add(1,"day"),"day"))return void(this.to=je(this._minDateDate).add(1,"day").format(this._innerFormat));if(this._maxDateDate&&this._toDate&&je(this._toDate).isAfter(this._maxDateDate,"day"))return void(this.to=this._maxDateStr);this.requestUpdate("to",t),this._fromDate&&this._toDate&&je(this._toDate).isBefore(this._fromDate,"day")&&(this.from=je(this._toDate).format(this._innerFormat))}}get _formattedFrom(){return this._fromDate?this._fromDate.format(this._dateStringFormat):this.startDate?je(this.startDate).format(this._dateStringFormat):""}get _formattedTo(){return this._toDate?this._toDate.format(this._dateStringFormat):this.endDate?je(this.endDate).format(this._dateStringFormat):""}_updateDateProp(e,t){this[`__${e}`]=t;const a=je(t);this[`_${e}Str`]=a.isValid()?a.format(this._innerFormat):"",this[`_${e}Date`]=a.isValid()?a:""}get _dateStringFormat(){const e=this.langDateConfig[this._intlLanguage];return this.dateFormat||e&&e.format||"MM/DD/YYYY"}get _dateStringPlaceholder(){const e=this.langDateConfig[this._intlLanguage];return this.placeholder||e&&e.placeholder||"mm/dd/yyyy"}_onFieldFocus(e){this.startReadOnly||this.endReadOnly?e.preventDefault():(this._calendarSelectRangeStart=!1,this.disabled||(this._openCalendar(),this._announceMessage(this.t("bbva-web-form-date-range-arrow-down-message"))))}_onFieldKeyEsc(e){e.relatedTarget!==this._calendar&&this._closeCalendar()}_onFieldKeydown(){this._calendarOpened?this._calendar.focus():this._openCalendar()}_onFieldInvalidChange(e){this.startError||this.endError||(this.invalid=!1);const{type:t}=e.detail;this[`${t}Invalid`]=!1}_onFieldsInputClear(){this._calendar.clearCalendar(),this.invalid=!1,this.startError=!1,this.endError=!1,this.dispatchEvent(new CustomEvent("fields-clear",{bubbles:!0}))}_dispatchRangeDateInput(){this._fromDescriptor&&this._toDescriptor&&this.dispatchEvent(new CustomEvent("date-range-input",{bubbles:!0,detail:{from:this._fromDescriptor,to:this._toDescriptor}}))}_dispatchRangeDateError(){this.dispatchEvent(new CustomEvent("date-range-error",{bubbles:!0,detail:{from:this._fromDate,to:this._toDate,fromError:this.startError,toError:this.endError}}))}_onFieldsDateChange(e){const{type:t}=e.detail,a=e.detail[t],r=!!a&&je(a,this._dateStringFormat,!0),n=r&&r.isValid();n?this._validDateCheck(t,r):n||a.length!==this._dateStringFormat.length||this._invalidDateCheck(t),r||(this.startError=!1,this.endError=!1,this[t]=null),this[`_${t}Descriptor`]={input:a,invalid:r&&!n,empty:!r},this._dispatchRangeDateInput()}_validDateCheck(e,t){this[e]=t.format(this._innerFormat),"from"===e&&(this.startError=!1,this._calendar&&(this._calendar.selectedDate=this._fromDate)),"to"===e&&(this.endError=!1,this._calendar&&(this._calendar.selectedEndDate=this._toDate)),this.invalid||(this.invalid=!1)}_invalidDateCheck(e){"from"===e&&(this.startError=!0),"to"===e&&(this.endError=!0),this.invalid=!0,this._dispatchRangeDateError()}_announceMessage(e){e!==this._announcerText&&setTimeout((()=>{this._announcerText=e}),200)}_onHelpClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-date-range-help-click",{bubbles:!0}))}_onDateConfirm(e){const{start:t,end:a}=e.detail,r=t.date?je(t.date).format(this._innerFormat):"";this.from=r,this.to=a.date?je(a.date).format(this._innerFormat):r;const n=new CustomEvent("form-date-range-desktop-date-confirm",{detail:!0,bubbles:!0,composed:!0});this.dispatchEvent(n),this._closeCalendar()}get _control(){return P` ${this._inputControlTpl("from")} ${this._inputControlTpl("to")} `}_inputControlTpl(e){return P`
      <input
        class="input-form"
        slot="_selector-${e}-control"
        type="text"
        aria-hidden="true"
        tabindex="-1"
        form="${q(this.form)}"
        name="${this.name?`${e}-${this.name}`:e}"
        id="${e}_${this._id}"
        .value="${this[`_${e}Str`]}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
      />
    `}get _focusInside(){const e=this._activeElement;return!!e&&(this._selector=this.shadowRoot.querySelector(".selector"),this._calendar=this.shadowRoot.querySelector(".calendar"),!(!this._selector||!this._calendar)&&(this._selector.contains(e)||this._calendar.contains(e)||this.contains(e)))}_checkFocusOut(){this._focusInside||this._closeCalendar()}_openCalendar(){this._calendarOpened||(this._calendarOpened=!0,this._calendar&&(this._calendar.selectedDate=this._fromDate,this._calendar.selectedEndDate=this._toDate),this._calendarWrap&&this._calendarWrap.classList.add("visible"))}_closeCalendar(){this._calendarOpened=!1,this._calendarSelectRangeStart=!1,this._calendarWrap&&this._calendarWrap.classList.remove("visible")}_moveToLight(e){e&&this.appendChild(e)}render(){return this._desktop?this.desktopTpl:this.renderMobileTpl}}export{jt as B,Yt as b};
