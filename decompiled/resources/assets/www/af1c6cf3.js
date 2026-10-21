import{z as a,a8 as t,ab as i,ac as e,ad as s,L as r,ak as n,h as o,i as l}from"./952f98a9.js";import{v as h,H as d,X as c,R as u,S as b,u as m,z as v,U as g}from"./216055dc.js";import{i as p,d as x,e as y}from"./4d2e5f99.js";import{a as _,l as k,b as A,e as f,f as z,g as w,h as C,i as $,d as S,q as R,c as D,j as L,k as P,m as M,n as B,t as X}from"./cf174536.js";import{d as N,a as V,b as T}from"./c5fdbfff.js";import{d as O}from"./79ad01ce.js";import{o as Y}from"./68ec5adf.js";function I(a,t,i){a=+a,t=+t,i=(s=arguments.length)<2?(t=a,a=0,1):s<3?1:+i;for(var e=-1,s=0|Math.max(0,Math.ceil((t-a)/i)),r=new Array(s);++e<s;)r[e]=a+e*i;return r}function W(){var a,t,i=Y().unknown(void 0),e=i.domain,s=i.range,r=[0,1],n=!1,o=0,l=0,h=.5;function d(){var i=e().length,d=r[1]<r[0],c=r[d-0],u=r[1-d];a=(u-c)/Math.max(1,i-o+2*l),n&&(a=Math.floor(a)),c+=(u-c-a*(i-o))*h,t=a*(1-o),n&&(c=Math.round(c),t=Math.round(t));var b=I(i).map((function(t){return c+a*t}));return s(d?b.reverse():b)}return delete i.unknown,i.domain=function(a){return arguments.length?(e(a),d()):e()},i.range=function(a){return arguments.length?(r=[+a[0],+a[1]],d()):r.slice()},i.rangeRound=function(a){return r=[+a[0],+a[1]],n=!0,d()},i.bandwidth=function(){return t},i.step=function(){return a},i.round=function(a){return arguments.length?(n=!!a,d()):n},i.padding=function(a){return arguments.length?(o=Math.min(1,l=+a),d()):o},i.paddingInner=function(a){return arguments.length?(o=Math.min(1,a),d()):o},i.paddingOuter=function(a){return arguments.length?(l=+a,d()):l},i.align=function(a){return arguments.length?(h=Math.max(0,Math.min(1,a)),d()):h},i.copy=function(){return W(e(),r).round(n).paddingInner(o).paddingOuter(l).align(h)},p.apply(d(),arguments)}var E=a`
:host {
  --_data-visualization-linear-custom-area-fill-opacity: 0.25;
  /* Text */
  --_data-visualization-linear-font-style: var(--fontFacePrimaryBookFontStyle, ${t(i.book.fontStyle)});
  --_data-visualization-linear-font-weight: var(--fontFacePrimaryBookFontWeight, ${t(i.book.fontWeight)});
  --_data-visualization-linear-font-size: var(--typographyType3XSmall, ${t(e.type3XSmall)});
  --_data-visualization-linear-line-height: var(--lineHeightType3XSmall, ${t(s.type3XSmall)});
  /* Single line icon */
  --_data-visualization-linear-lines-icon-text-font-size: var(--bbva-data-visualization-linear-lines-icon-text-font-size,var(--typographyType3XSmall, ${t(e.type3XSmall)}));
  --_data-visualization-linear-lines-icon-text-font-weight: var(--bbva-data-visualization-linear-lines-icon-text-font-weight,var(--fontFacePrimaryMediumFontWeight, ${t(i.medium.fontWeight)}));
  display: block;
  box-sizing: border-box;
  font-size: var(--_data-visualization-linear-font-size);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([data-tag-name=bbva-data-visualization-lines]),
:host([data-tag-name=bbva-data-visualization-area]),
:host([data-tag-name=bbva-data-visualization-vertical-bar]) {
  display: block;
  box-sizing: border-box;
  font-size: var(--_data-visualization-linear-font-size);
}
:host([data-tag-name=bbva-data-visualization-lines]) *,
:host([data-tag-name=bbva-data-visualization-lines]) *:before,
:host([data-tag-name=bbva-data-visualization-lines]) *:after,
:host([data-tag-name=bbva-data-visualization-area]) *,
:host([data-tag-name=bbva-data-visualization-area]) *:before,
:host([data-tag-name=bbva-data-visualization-area]) *:after,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) *,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) *:before,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) *:after {
  box-sizing: inherit;
  font: inherit;
}
:host([data-tag-name=bbva-data-visualization-lines]) .wrap,
:host([data-tag-name=bbva-data-visualization-area]) .wrap,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .wrap {
  display: flex;
}
:host([data-tag-name=bbva-data-visualization-lines]) .wrap > div,
:host([data-tag-name=bbva-data-visualization-area]) .wrap > div,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .wrap > div {
  flex-grow: 1;
}
:host([data-tag-name=bbva-data-visualization-lines]) .text,
:host([data-tag-name=bbva-data-visualization-area]) .text,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .text {
  fill: var(--_data-visualization-linear-text-fill);
  font-size: var(--_data-visualization-linear-font-size);
  font-style: var(--_data-visualization-linear-font-style);
  font-weight: var(--_data-visualization-linear-font-weight);
  line-height: var(--_data-visualization-linear-line-height);
  stroke: var(--_data-visualization-linear-text-stroke, none);
}
:host([data-tag-name=bbva-data-visualization-lines]) .text--not-selected,
:host([data-tag-name=bbva-data-visualization-area]) .text--not-selected,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .text--not-selected {
  opacity: 0.4;
}
:host([data-tag-name=bbva-data-visualization-lines]) .hide-text,
:host([data-tag-name=bbva-data-visualization-area]) .hide-text,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .hide-text {
  display: none;
}
:host([data-tag-name=bbva-data-visualization-lines]) .marker,
:host([data-tag-name=bbva-data-visualization-area]) .marker,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker {
  cursor: grab;
  touch-action: none;
}
:host([data-tag-name=bbva-data-visualization-lines]) .marker-line,
:host([data-tag-name=bbva-data-visualization-area]) .marker-line,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker-line {
  fill: var(--_data-visualization-linear-marker-line-fill);
}
:host([data-tag-name=bbva-data-visualization-lines]) .marker-circle,
:host([data-tag-name=bbva-data-visualization-area]) .marker-circle,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker-circle {
  fill: var(--_data-visualization-linear-marker-circle-fill);
  stroke: var(--_data-visualization-linear-marker-circle-stroke);
}
:host([data-tag-name=bbva-data-visualization-lines]) .marker-circle-lines,
:host([data-tag-name=bbva-data-visualization-area]) .marker-circle-lines,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker-circle-lines {
  fill: var(--_data-visualization-linear-circle-lines-fill);
}
:host([data-tag-name=bbva-data-visualization-lines]) .customArea,
:host([data-tag-name=bbva-data-visualization-lines]) .custom-area,
:host([data-tag-name=bbva-data-visualization-area]) .customArea,
:host([data-tag-name=bbva-data-visualization-area]) .custom-area,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .customArea,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .custom-area {
  fill: var(--_data-visualization-linear-custom-area-fill);
  opacity: var(--_data-visualization-linear-custom-area-fill-opacity);
}
:host([data-tag-name=bbva-data-visualization-lines]) .icon,
:host([data-tag-name=bbva-data-visualization-area]) .icon,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .icon {
  border-radius: 50%;
  background-color: var(--_data-visualization-linear-icon-background);
}
:host([data-tag-name=bbva-data-visualization-lines]) .dashed-line,
:host([data-tag-name=bbva-data-visualization-lines]) .line-dash,
:host([data-tag-name=bbva-data-visualization-lines]) .line.dashed,
:host([data-tag-name=bbva-data-visualization-lines]) .custom-line,
:host([data-tag-name=bbva-data-visualization-area]) .dashed-line,
:host([data-tag-name=bbva-data-visualization-area]) .line-dash,
:host([data-tag-name=bbva-data-visualization-area]) .line.dashed,
:host([data-tag-name=bbva-data-visualization-area]) .custom-line,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .dashed-line,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .line-dash,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .line.dashed,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .custom-line {
  stroke: var(--_data-visualization-linear-dashed-line-stroke-color);
}
:host([data-tag-name=bbva-data-visualization-lines]) .line.continuous,
:host([data-tag-name=bbva-data-visualization-lines]) .continuous-line,
:host([data-tag-name=bbva-data-visualization-lines]) .custom-line,
:host([data-tag-name=bbva-data-visualization-area]) .line.continuous,
:host([data-tag-name=bbva-data-visualization-area]) .continuous-line,
:host([data-tag-name=bbva-data-visualization-area]) .custom-line,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .line.continuous,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .continuous-line,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .custom-line {
  fill: none;
  stroke: var(--_data-visualization-linear-continuous-line-stroke-color);
  stroke-width: 0.0625rem;
}
:host([data-tag-name=bbva-data-visualization-lines]) .tick,
:host([data-tag-name=bbva-data-visualization-lines]) .x-axis-tick,
:host([data-tag-name=bbva-data-visualization-lines]) .y-axis-tick,
:host([data-tag-name=bbva-data-visualization-area]) .tick,
:host([data-tag-name=bbva-data-visualization-area]) .x-axis-tick,
:host([data-tag-name=bbva-data-visualization-area]) .y-axis-tick,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .tick,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .x-axis-tick,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .y-axis-tick {
  stroke: var(--_data-visualization-linear-axis-tick-color);
}
:host([data-tag-name=bbva-data-visualization-lines]) .y-axis-region,
:host([data-tag-name=bbva-data-visualization-area]) .y-axis-region,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .y-axis-region {
  max-width: 2.375rem;
}
:host([data-tag-name=bbva-data-visualization-lines]) .domain,
:host([data-tag-name=bbva-data-visualization-lines]) .line-zero,
:host([data-tag-name=bbva-data-visualization-area]) .domain,
:host([data-tag-name=bbva-data-visualization-area]) .line-zero,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .domain,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .line-zero {
  fill: none;
  stroke: var(--_data-visualization-linear-domain-stroke-color);
  stroke-width: 0.0625rem;
}
:host([data-tag-name=bbva-data-visualization-lines]) .domain.not-selected,
:host([data-tag-name=bbva-data-visualization-lines]) .line-zero.not-selected,
:host([data-tag-name=bbva-data-visualization-area]) .domain.not-selected,
:host([data-tag-name=bbva-data-visualization-area]) .line-zero.not-selected,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .domain.not-selected,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .line-zero.not-selected {
  opacity: 0.4;
}
:host([data-tag-name=bbva-data-visualization-lines]) .x-domain,
:host([data-tag-name=bbva-data-visualization-area]) .x-domain,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .x-domain {
  fill: none;
  stroke: var(--_data-visualization-linear-x-domain-stroke-color);
  stroke-width: 0.0625rem;
}
:host([data-tag-name=bbva-data-visualization-lines]) [data-tag-name=bbva-badge-notification],
:host([data-tag-name=bbva-data-visualization-area]) [data-tag-name=bbva-badge-notification],
:host([data-tag-name=bbva-data-visualization-vertical-bar]) [data-tag-name=bbva-badge-notification] {
  cursor: pointer;
}
:host([data-tag-name=bbva-data-visualization-lines]) .bar-filled,
:host([data-tag-name=bbva-data-visualization-lines]) .marker-bar,
:host([data-tag-name=bbva-data-visualization-lines]) .marker-bar-variable,
:host([data-tag-name=bbva-data-visualization-area]) .bar-filled,
:host([data-tag-name=bbva-data-visualization-area]) .marker-bar,
:host([data-tag-name=bbva-data-visualization-area]) .marker-bar-variable,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .bar-filled,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker-bar,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .marker-bar-variable {
  fill: var(--_data-visualization-linear-marker-bar-fill);
}
:host([data-tag-name=bbva-data-visualization-lines]) .sr-only,
:host([data-tag-name=bbva-data-visualization-area]) .sr-only,
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

:host([data-tag-name=bbva-data-visualization-lines]) {
  display: block;
}
:host([data-tag-name=bbva-data-visualization-lines]) svg {
  overflow: visible;
}
:host([data-tag-name=bbva-data-visualization-lines]) .marker-line {
  opacity: 0.6;
}
:host([data-tag-name=bbva-data-visualization-lines]) .x-axis-tick {
  transform: translateY(8px);
}

:host([data-tag-name=bbva-data-visualization-area]) {
  display: block;
}
:host([data-tag-name=bbva-data-visualization-area]) svg {
  display: initial;
  overflow: visible;
}
:host([data-tag-name=bbva-data-visualization-area]) .y-axis path {
  display: none;
}
:host([data-tag-name=bbva-data-visualization-area]) .graphic-area.continuous {
  fill: transparent;
}

:host([data-tag-name=bbva-data-visualization-vertical-bar]) .wrap {
  display: initial;
  overflow: hidden;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .bar-group {
  position: relative;
  z-index: 1;
  opacity: 1;
  pointer-events: bounding-box;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .bar-group--not-selected {
  opacity: 0.4;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .bar-group--negative rect:first-child, :host([data-tag-name=bbva-data-visualization-vertical-bar]) .bar-group--negative rect:last-child {
  transform: translateY(-0.5rem);
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .chart {
  text-align: center;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .y-axis {
  max-width: 3em;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .y-axis .domain {
  display: none;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .not-selected {
  opacity: 0.4;
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .stop-left {
  stop-color: rgba(0, 0, 0, 0);
}
:host([data-tag-name=bbva-data-visualization-vertical-bar]) .stop-right {
  stop-color: rgba(0, 0, 0, 0.5);
}

:host [data-tag-name=bbva-badge-notification] {
  cursor: pointer;
}

:host([loading]) {
  position: relative;
  display: block;
  overflow: hidden;
  height: 0.0625rem;
  background: var(--_data-visualization-linear-skeleton-animated-layer-bg) no-repeat;
  opacity: 1;
  pointer-events: none;
  background-image: linear-gradient(var(--_data-visualization-linear-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_data-visualization-linear-skeleton-quote-bg, transparent);
  background-size: 1px 1px;
  background-position: 32px 48px;
}
:host([loading]) .skeleton {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  height: 0.25rem;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  background: var(--_data-visualization-linear-skeleton-animated-layer-bg);
  contain: strict;
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
`;const F=a=>Array.isArray(a)&&Boolean(a.length),H={linear:D,basis:L,bundle:P,cardinal:M,monotone:B},J={decimal:".",thousands:",",grouping:[3],currency:["$",""],dateTime:"%a %b %e %X %Y",date:"%m/%d/%Y",time:"%H:%M:%S",periods:["AM","PM"],days:["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],shortDays:["Sun","Mon","Tue","Wed","Thu","Fri","Sat"],months:["January","February","March","April","May","June","July","August","September","October","November","December"],shortMonths:["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]};class G extends(h(r)){static get is(){return"bbva-data-visualization-lines"}static get scopedElements(){return{"bbva-type-link":d,"bbva-badge-notification":c}}static get properties(){return{data:{type:Array,reflect:!0},width:{type:Number,reflect:!0},height:{type:Number,reflect:!0},language:{type:Object,reflect:!0},marginsChart:{type:Object,attribute:"margins-chart",reflect:!0},numPointsXaxis:{type:Number,attribute:"num-points-xaxis",reflect:!0},ticksSizeXAxis:{type:Number,attribute:"ticks-size-xaxis",reflect:!0},interpolateType:{type:String,attribute:"interpolate-type",reflect:!0},marginXAxisLegend:{type:Number,attribute:"margin-axis-legend",reflect:!0},formatLegend:{type:String,attribute:"format-legend",reflect:!0},selected:{type:Number,reflect:!0},markerRadius:{type:Number,attribute:"marker-radius",reflect:!0},hideXAxis:{type:Boolean,attribute:"hide-x-axis"},hideXAxisTick:{type:Boolean,attribute:"hide-x-axis-tick"},hideYAxis:{type:Boolean,attribute:"hide-y-axis"},hideYAxisTick:{type:Boolean,attribute:"hide-y-axis-tick"},yAxisLabel:{type:String,reflect:!0,attribute:"y-axis-label"},customDashedLineValue:{type:Number,attribute:"custom-dashed-line-value"},customContinuousLineValue:{type:Number,attribute:"custom-continuous-line-value"},accessibilityChartLabel:{type:String,attribute:"accessibility-chart-label"},showMarker:{type:Boolean,attribute:"show-marker"},showValueZero:{type:Boolean,attribute:"show-value-zero"},maxIcon:{type:Number,attribute:"max-icon"},chartAriaLabel:{type:String,attribute:"chart-aria-label",reflect:!0}}}constructor(){super(),this.markerRadius=16,this._margin=16,this._marker=32,this._marginTop=12,this._lineAxisX={},this._pointsXaxis=[],this._pointsYaxis=[],this.yAxisLabel="~s",this._yAxisPadding=36,this.selected=0,this.data=[],this.marginsChart={top:16,right:16,bottom:16,left:16},this._points=[],this._iconsPosition=[],this._maxPoints=0,this.numPointsXaxis=7,this.ticksSizeXAxis=7,this.interpolateType="linear",this.marginXAxisLegend=40,this.formatLegend="%b",this.language=J,this._domain=[],this.hideXAxis=!1,this.hideXAxisTick=!1,this.hideYAxis=!1,this.hideYAxisTick=!1,this.customDashedLineValue=0,this.customContinuousLineValue=0,this.accessibilityChartLabel="",this.showMarker=!1,this.showValueZero=!1,this.maxIcon=3,this._chart=document.createElement("div"),this._chart.setAttribute("class","chart"),this._chart.setAttribute("id","chart"),this.chartAriaLabel="chart",this._accessibilityLabels=document.createElement("span"),this._accessibilityLabels.setAttribute("class","accessibility-label")}static get styles(){return[E,n("bbva-data-visualization-lines-shared-styles")]}get _width(){return(this.width||this._chart.offsetWidth)-this.marginsChart.left-this.marginsChart.right}get _height(){return(this.height||window.innerHeight)-this.marginsChart.top-this.marginsChart.bottom}get widthContentChart(){let a=this._width;return this.hideYAxis||(a-=this.yAxisWidth||30),this.showMarker&&(a-=this.marginsChart.left+8),this.hideYAxis||this.showMarker||(a-=24),this.hideYAxis&&!this.showMarker&&(a-=24),this.showMarker&&this.hideYAxis&&(a-=8),this.customContinuousLineValue||(a-=8),a}get heightContentChart(){let a=this._height;return this.hideXAxis||(a-=this._xAxisHeight||26),this.showMarker&&(a-=this._rangeHeight+8),this.showMarker&&this.hideXAxis&&(a-=10),!this.showMarker&&this.hideXAxis&&(a-=2),a-this._marginTop}get _getValues(){var a;return null===(a=this.data)||void 0===a?void 0:a.map((a=>a.data)).flat()}get _isEmpty(){var a;return""===this.data||0===(null===(a=this.data)||void 0===a?void 0:a.length)||void 0===this.data||null===this.data}get _min(){return _(this._getValues,(({value:a})=>a))}get _max(){return N(this._getValues,(({value:a})=>a))}get _mean(){return V(this._getValues,(({value:a})=>a))}get _hasMeanZero(){return 0===this._mean}get _yScaleInvert(){return k().domain([0,this._max]).range([this._hasMeanZero?0:this.heightContentChart,0]).clamp(!0)}get _yAxisWidth(){var a;return(null===(a=x(this._chart).selectAll(".y-axis-region").node())||void 0===a?void 0:a.getBoundingClientRect().width)-8||(this.hideYAxis?0:30)}get _xAxisHeight(){var a;return(null===(a=x(this._chart).selectAll(".x-axis").node())||void 0===a?void 0:a.getBoundingClientRect().height)||0}get _rangeHeight(){var a;return null!==(a=x(this._chart).selectAll(".marker").node())&&void 0!==a&&a.getBoundingClientRect().height||this.showMarker?this._marker:0}render(){return o`${this._chart} ${this._accessibilityLabels}`}firstUpdated(){this.chart=x(this._chart).append("svg").attr("class","svg-chart").attr("role","img").attr("aria-label",this.chartAriaLabel).attr("title","chart"),this.dispatchEvent(new CustomEvent("data-visualization-lines-chart-create",{bubbles:!0,composed:!0,detail:!0})),this.accessibilityRegion=x(this._accessibilityLabels).attr("attributeName","accessibilityRegion").attr("class","sr-only"),window.ResizeObserver&&new ResizeObserver((()=>{requestAnimationFrame((()=>{this._getValues&&this.updateComplete.then((()=>this.drawChart()))}))})).observe(this),super.firstUpdated()}update(a){var t,i,e,s;(super.update(a),a.has("language")&&A(this.language),a.has("data")&&F(this.data)&&(e=this.data,s=a.get("data"),!Array.isArray(e)||!Array.isArray(s)||e.length!==s.length||JSON.stringify(e)!==JSON.stringify(s)))&&(this._domain=f(null===(t=this.data[0])||void 0===t?void 0:t.data,(({date:a})=>a)).map((a=>new Date(a))),x(this._chart).selectAll("svg > g > *").remove(),null!==(i=this._domain)&&void 0!==i&&i.length&&(this.axisX=z().range([0,this.widthContentChart]).domain(this._domain),this.drawChart()));a.has("data")&&!F(this.data)&&x(this._chart).select("svg").remove(),a.has("selected")&&this._observerSelected(this.selected)}_accessibleLabels(){this.accessibilityRegion.append("span").text(this.accessibilityChartLabel),this.accessibilityRegion.selectAll(".accessibility-label").data(this.data).enter().append("span").attr("tabindex","0").text((a=>`\n          ${a.data.map((a=>`${new Date(a.date).toLocaleDateString()} ${a.value}`))}`))}_getAxisPoints(a){const[t,i]=f(a,(({date:a})=>a)),e=Math.floor((i-t)/(this.numPointsXaxis-1)),s=[new Date(t)];for(let a=1;a<=this.numPointsXaxis-1;a+=1)s.push(new Date(t+e*a));return s}_setXAxis(){var a;let t=0,i=0,e=16;return this.showMarker&&!this.hideYAxis&&(t=this._yAxisWidth+this._margin-8),this.showMarker||this.hideYAxis||(t=this._yAxisWidth+8),this.showMarker&&this.hideYAxis&&(t=this._margin),this.showMarker&&this.hideXAxis&&(i=4),!this.showMarker&&this.hideYAxis&&(e+=6),this.customContinuousLineValue||(e+=9),this.axisX=z().range([0,this.widthContentChart+e]).domain(this._domain),this._pointsXaxis=this._getAxisPoints(null===(a=this.data[0])||void 0===a?void 0:a.data),this._lineAxisX=w(this.axisX).tickValues(this._pointsXaxis).tickSize(this.ticksSizeXAxis).tickFormat((a=>{const t=X(this.formatLegend)(a);return"%b"===this.formatLegend?t.charAt(0):t})).tickSizeOuter(0).tickPadding(4),this.chart.append("g").attr("class","x-axis axis bottom").attr("transform",`translate(${t}, ${this.heightContentChart+this._marginTop+i})`).call(this._lineAxisX),x(this._chart).selectAll(".x-axis .tick:last-child").attr("transform",`translate(${this.widthContentChart+12}, 0)`),x(this._chart).selectAll(".x-axis .tick text").attr("class",this.hideXAxis?"hide-text":"text").attr("y",this._margin+(this.showMarker?2:1)).attr("x",((a,t)=>this.showMarker?-3*t:0)),x(this._chart).selectAll(".x-axis .domain").classed("x-domain",!0),x(this._chart).selectAll(".x-axis .tick line").classed("x-axis-tick",!0),(this.showMarker||this.hideXAxisTick)&&x(this._chart).selectAll(".x-axis-tick").remove(),this._min<0&&x(this._chart).selectAll(".x-axis .domain").remove(),this._lineAxisX}_setYAxis(){const a=k().range([this.heightContentChart,0]);return this.showValueZero?this._min>0&&this._max>0?a.domain([0,this._max]):this._min<0&&this._max<0?a.domain([this._min,0]):a.domain(f(this._getValues,(a=>+a.value))):a.domain(f(this._getValues,(a=>+a.value))),this._lineAxisY=C(a).tickFormat($(this.yAxisLabel)).tickSize(2).tickSizeOuter(0).tickPadding(4),this.chart.append("g").attr("class","y-axis-region axis left").call(this._lineAxisY),x(this._chart).selectAll(".y-axis-region .domain").remove(),x(this._chart).selectAll(".y-axis-region .tick text").attr("x",-9).attr("class","text"),x(this._chart).selectAll(".y-axis-region .tick line").classed("y-axis-tick",!0),x(this._chart).selectAll(".y-axis-region").attr("transform",`translate(${this.hideYAxis&&!this.hideYAxisTick?8:Math.min(this._yAxisWidth)}, 12)`),this.hideYAxis&&x(this._chart).selectAll(".y-axis-region").remove(),this.hideYAxisTick&&x(this._chart).selectAll(".y-axis-tick").remove(),this._lineAxisY}_deleteChart(){x(this._chart).select(".y-axis-region").remove(),x(this._chart).select(".graph-container").remove(),x(this._chart).select(".icons-container").remove(),x(this._chart).select(".x-axis").remove(),x(this._chart).select(".marker-bar-container").remove(),x(this._chart).select(".marker-container").remove()}drawChart(){var a;this._deleteChart(),this.hideYAxis&&this.hideYAxisTick||this._setYAxis(),x(this._chart).select("svg")&&this._width>0&&x(this._chart).select("svg").attr("width",this._width).attr("height",this._height).attr("transform",`translate(${this.marginsChart.left}, ${this.marginsChart.top})`);let t=0,i=16;this.showMarker&&!this.hideYAxis&&(t=this._yAxisWidth+this._margin-8),this.showMarker||this.hideYAxis||(t=this._yAxisWidth+8),this.showMarker&&this.hideYAxis&&(t=16),!this.showMarker&&this.hideYAxis&&(i=24),this._graphContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","graph-container").attr("transform",`translate(${t}, ${this._marginTop})`),this._dotsContainer=this._graphContainer.append("g").data([{x:0,y:0}]).attr("class","dotsContainer"),1===(null===(a=this.data)||void 0===a?void 0:a.length)&&(this._iconsContainer=this.chart.append("g").attr("class","icons-container")),this._isEmpty||this._setXAxis();const e=z().range([0,this.widthContentChart+(this.showMarker?0:20)]),s=k().range([this.heightContentChart+(this.showMarker?6:4),0]);let r=0;const n=z().range([0,this.widthContentChart+i]),o=this._getValues;e.domain(f(o,(a=>a.date))),n.domain(f(o,(a=>a.date))),this.showValueZero?this._min>0&&this._max>0?s.domain([0,this._max]):this._min<0&&this._max<0?s.domain([this._min,0]):s.domain(f(o,(a=>a.value))):s.domain(f(o,(a=>a.value)));const l=S().x((a=>{const t=e(a.date),i=s(a.value);return this._points[r].push({x:t,y:i}),a.icon&&this._iconsPosition.push({x:t,y:i,data:a}),t})).y((a=>s(a.value))).curve(H[this.interpolateType]);this._points=[],this.data.forEach((a=>{var t;const i=(null===(t=a.data)||void 0===t?void 0:t.length)||0;this._points.push([]),this._graphContainer.append("path").attr("d",l(a.data)).attr("class","line").attr("stroke",a.color).attr("stroke-width",4).attr("fill","none"),r+=1,this._maxPoints=this._maxPoints<i?i-1:this._maxPoints})),this.showMarker&&!this._isEmpty&&this._width>0&&(this._appendBarSelector(),this.drawMarker(),this._setNewPosData(this.selected,!0)),1===this.data.length&&this._iconsPosition.length&&"monotone"!==this.interpolateType&&this._drawIcons(),this._min<0&&this._drawLine(n,s,o,0,!0),this.customDashedLineValue&&this.customDashedLineValue>this._min&&this.customDashedLineValue<this._max&&this._drawLine(n,s,o,this.customDashedLineValue,!1),this.customContinuousLineValue&&this.customContinuousLineValue>this._min&&this.customContinuousLineValue<this._max&&(this._drawLine(n,s,o,this.customContinuousLineValue,!0),this._customArea()),this._accessibleLabels()}_drawIcons(){this._iconsContainer.selectAll('[data-tag-name="bbva-type-link"]').remove(),this._iconsContainer.select("icon-counter").remove(),this._iconsPosition.forEach(((a,t)=>{const{date:i,value:e,icon:s,href:r}=a.data,n=this._iconsPosition.length;if(n>this.maxIcon&&this.maxIcon===t+1){const t=n-(this.maxIcon-1),s=document.createElement(this.getScopedTagName("bbva-badge-notification"));s.setAttribute("text",t),s.setAttribute("accessibility-text",t),this._iconsContainer.append("foreignObject").attr("x",a.x+20).attr("y",a.y-16).attr("width",24).attr("height",24).attr("class","icon").on("click",(()=>this._iconClickHandler([{date:i,value:e,href:r}]))).node().append(s)}else if(t<this.maxIcon-1){const t=document.createElement(this.getScopedTagName("bbva-type-link"));t.setAttribute("icon",s),t.setAttribute("icon-size",24),r&&t.setAttribute("href",r),this._iconsContainer.append("foreignObject").attr("x",a.x+20).attr("y",a.y-16).attr("width",24).attr("height",24).attr("class","icon").on("click",(()=>this._iconClickHandler([{date:i,value:e,href:r}]))).node().append(t)}}))}_iconClickHandler(a){this.dispatchEvent(new CustomEvent("data-visualization-lines-icon-click",{bubbles:!0,composed:!0,detail:a}))}_drawLine(a,t,i,e,s){const r=S().x((t=>a(t.date))).y((a=>t(a.value))).curve(H[this.interpolateType]),[n,o]=f(i,(({date:a})=>a)),l=[{date:n,value:e},{date:o,value:e}];let h;h=0===e&&s?"line-zero":s?"continuous-line":"dashed-line",this._graphContainer.append("path").attr("d",r(l)).style("stroke-dasharray",s?"0":"3, 3").attr("class",h).attr("stroke-width",1).attr("fill","none")}_customArea(){this._graphContainer.append("rect").attr("x",0).attr("width",this.widthContentChart+this._margin+(this.hideYAxis?8:0)).attr("height",this.heightContentChart-this._yScaleInvert(this.customContinuousLineValue)).attr("y",this.customContinuousLineValue<0?0:this._yScaleInvert(this.customContinuousLineValue)+(this.showMarker?4:2)).attr("class","customArea")}_createSelectedDots(a){this._dotsContainer.selectAll("circle").remove(),this._points.forEach(((t,i)=>{var e,s;this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",t[a].x).attr("cy",t[a].y).attr("r",6).attr("fill",null===(e=this.data[i])||void 0===e?void 0:e.color),this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",t[a].x).attr("cy",t[a].y).style("opacity",.15).attr("r",12).attr("fill",null===(s=this.data[i])||void 0===s?void 0:s.color)}))}_getNewSection(a){return this._points[0].findIndex(((t,i)=>t.x<=a&&a<=this._points[0][i+1].x))}_setNewPosData(a,t){var i;const{x:e}=this._points[0][a];null===(i=this._markerContainer)||void 0===i||i.attr("transform",`translate(${e+this._margin+this._yAxisWidth-(this.hideYAxis?0:8)}, 0)`),t&&this._markerContainer&&(this._markerContainer.currentX=e),this._createSelectedDots(a),this._dispatchEventOnDrag(a),this._positionSelected=a}_dispatchEventOnDrag(a){var t,i,e;const s=null===(t=this.data)||void 0===t?void 0:t.map((t=>{var i;return null===(i=t.data[a])||void 0===i?void 0:i.value})),r=new Date(parseFloat(null===(i=this.data[0])||void 0===i||null===(e=i.data[a])||void 0===e?void 0:e.date));a!==this._positionSelected&&this.dispatchEvent(new CustomEvent("data-visualization-lines-drag",{bubbles:!0,composed:!0,detail:{selected:a,date:r,value:s}}))}drawMarker(){var a;this._markerContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","marker-container"),this._markerContainer.currentX=0;const t=R().domain([0,this.widthContentChart]).range((null===(a=this._points[0])||void 0===a?void 0:a.map(((a,t)=>t)))||[]),i=T().on("drag",(()=>{const a=this._markerContainer.currentX+y.x;this._setNewPosData(t(a)),this.chart.select(".marker-bar-variable").attr("width",`${this._points[0][t(a)].x}`)})).on("end",(()=>{const a=this._markerContainer.currentX+y.x;this._setNewPosData(t(a),!0),this.chart.select(".marker-bar-variable").attr("width",`${this._points[0][t(a)].x}`)}));this._markerContainer.call(i);const e=this.heightContentChart+this._margin,s=`-0.5 ${e}, 0 0, 0.5 ${e}`;this._markerContainer.append("polyline").attr("class","marker-line").attr("points",s),this._appendSelector(),this._createSelectedDots(t(0))}_appendSelector(){const a=this._markerContainer.append("svg").attr("class","marker").attr("width",2*this.markerRadius).attr("height",2*this.markerRadius).attr("viewBox",`0 0 ${2*this.markerRadius} ${2*this.markerRadius}`).attr("x",-this.markerRadius).attr("y",this._height-this.marginsChart.bottom-this._marker/2+1).append("g").attr("fill","none").attr("fill-rule","evenodd");a.append("circle").attr("class","marker-circle").attr("cx",this.markerRadius).attr("cy",this.markerRadius).attr("r",this.markerRadius-1).attr("stroke-width",2);const t=a.append("g").attr("class","marker-circle-lines");return t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-1}, ${this.markerRadius-4})`),t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-5}, ${this.markerRadius-4})`),t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius+3}, ${this.markerRadius-4})`),a}_appendBarSelector(){const a=x(this._chart).select("svg");let t=this._height-this._marker/2;this.hideXAxis&&(t+=this._xAxisHeight);const i=a.append("g").attr("class","marker-bar-container").attr("transform",`translate(${this._margin+this._yAxisWidth-8}, ${t})`).attr("overflow","hidden");return i.append("rect").attr("class","marker-bar").attr("width",this.widthContentChart+this._margin).attr("height",4).attr("rx","2px"),i.append("rect").attr("class","marker-bar-variable").attr("width",0).attr("height",4).attr("transform-origin","center right"),i}_observerSelected(a){var t;null!==(t=this._points[0])&&void 0!==t&&t[a]&&this._setNewPosData(a,!0)}}const j=a=>Array.isArray(a)&&Boolean(a.length),Z={linear:D,basis:L,bundle:P,cardinal:M,monotone:B};class q extends(h(r)){static get is(){return"bbva-data-visualization-area"}static get properties(){return{data:{type:Array,reflect:!0},width:{type:Number,reflect:!0},height:{type:Number,reflect:!0},language:{type:Object,reflect:!0},marginsChart:{type:Object,attribute:"margins-chart",reflect:!0},numPointsXaxis:{type:Number,attribute:"num-points-xaxis",reflect:!0},ticksSizeAxis:{type:Number,attribute:"ticks-size-axis",reflect:!0},interpolateType:{type:String,attribute:"interpolate-type",reflect:!0},formatLegend:{type:String,attribute:"format-legend",reflect:!0},selected:{type:Number,reflect:!0},showVerticalAxis:{type:Boolean,reflect:!0,attribute:"show-vertical-axis"},showHorizontalAxis:{type:Boolean,reflect:!0,attribute:"show-horizontal-axis"},yAxisPadding:{type:Number,reflect:!0,attribute:"y-axis-padding"},yAxisLabel:{type:String,reflect:!0,attribute:"y-axis-label"},lineWidth:{type:Number,attribute:"line-width",reflect:!0},areaOpacity:{type:Number,attribute:"area-opacity",reflect:!0},continuousAreaOpacity:{type:Number,attribute:"continuous-area-opacity",reflect:!0},showRangeSelector:{type:Boolean,attribute:"show-range-selector",reflect:!0},hideDots:{type:Boolean,attribute:"hide-dots"},dashedLineValue:{type:Number,attribute:"dashed-line-value"},continuousLineValue:{type:Number,attribute:"continuous-line-value"},yAxisDomain:{type:Array,attribute:"y-axis-domain"},yAxisValues:{type:Array,attribute:"y-axis-values"},xAxisValues:{type:Array,attribute:"x-axis-values"},showMiddlePositionTick:{type:Boolean,attribute:"show-middle-position-tick"},yAxisSeparation:{type:Number,attribute:"y-axis-separation",reflect:!0},chartAriaLabel:{type:String,attribute:"chart-aria-label",reflect:!0},markerRadius:{type:Number,attribute:"marker-radius",reflect:!0},customXAxisValues:{type:Array,attribute:"custom-x-axis-values"},xAxisTextAnchor:{type:String,attribute:"x-axis-text-anchor"}}}constructor(){super(),this._lineAxisX={},this._lineAxisY={},this._pointsXaxis=[],this.areaOpacity=.2,this.continuousAreaOpacity=.2,this.lineWidth=4,this.data=[],this.height=250,this._marker=32,this._margin=16,this.showRangeSelector=!1,this.marginsChart={top:16,right:16,bottom:16,left:16},this._chart=document.createElement("div"),this._chart.setAttribute("class","chart"),this._chart.setAttribute("id","chart"),this._points=[],this.numPointsXaxis=12,this.ticksSizeAxis=2,this.interpolateType="linear",this.formatLegend="%b",this.yAxisLabel="d",this.selected=0,this._domain=[],this.showVerticalAxis=!1,this.showHorizontalAxis=!1,this.yAxisPadding=25,this._isZeroValue=!1,this.yAxisDomain=[],this.yAxisValues=[],this.xAxisValues=[],this.xAxisTextAnchor="middle",this.hideDots=!1,this.dashedLineValue=null,this.continuousLineValue=null,this.showMiddlePositionTick=!1,this._specialLinesWidth=1,this.yAxisSeparation=16,this.chartAriaLabel="chart",this.markerRadius=16,this.language={decimal:".",thousands:",",grouping:[3],currency:["$",""],dateTime:"%a %b %e %X %Y",date:"%m/%d/%Y",time:"%H:%M:%S",periods:["AM","PM"],days:["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],shortDays:["Sun","Mon","Tue","Wed","Thu","Fri","Sat"],months:["January","February","March","April","May","June","July","August","September","October","November","December"],shortMonths:["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]}}firstUpdated(){this._chartInstance||(this._chartInstance=x(this._chart).append("svg").attr("role","img").attr("aria-label",this.chartAriaLabel).attr("title","chart")),this.dispatchEvent(new CustomEvent("data-visualization-area-chart-create",{bubbles:!0,composed:!0,detail:!0})),window.ResizeObserver&&new ResizeObserver((()=>{requestAnimationFrame((()=>{this._getValues&&this.updateComplete.then((()=>this.drawChart()))}))})).observe(this),super.firstUpdated()}get _getValues(){var a;return null===(a=this.data)||void 0===a?void 0:a.map((a=>a.data)).flat()}update(a){var t,i,e;(super.update(a),a.has("language")&&A(this.language),a.has("data")&&j(this.data)&&(i=this.data,e=a.get("data"),!Array.isArray(i)||!Array.isArray(e)||i.length!==e.length||JSON.stringify(i)!==JSON.stringify(e)))&&(this._domain=f(this.data[0].data,(({date:a})=>a)).map((a=>new Date(a))),x(this._chart).selectAll("svg > g > *").remove(),null!==(t=this._domain)&&void 0!==t&&t.length&&(this.axisX=z().range([0,this._height]).domain(this._domain),this.drawChart()));a.has("data")&&!j(this.data)&&x(this._chart).select("svg").remove(),a.has("selected")&&this._observerSelected(this.selected)}get chart(){return this._chartInstance||(this._chartInstance=x(this._chart).append("svg").attr("role","img").attr("aria-label",this.chartAriaLabel).attr("title","chart")),this._chartInstance}get _height(){return(this.height||window.innerHeight)-this.marginsChart.top-this.marginsChart.bottom}get _width(){return(this.width||this._chart.offsetWidth)-this.marginsChart.left-this.marginsChart.right}get widthContentChart(){let a=this._width;return this.showVerticalAxis&&(a-=this._yAxisWidth+2*this.yAxisSeparation||36,this.showRangeSelector&&(a-=this.markerRadius)),this.showRangeSelector&&!this.showVerticalAxis&&(a-=2*this.markerRadius),a}get _rangeHeight(){var a;return null!==(a=x(this._chart).selectAll(".marker").node())&&void 0!==a&&a.getBoundingClientRect().height||this.showRangeSelector||this.hideDots?16:0}get heightContentChart(){let a=this._height;return this.showHorizontalAxis&&(a-=this._xAxisHeight||38,this.showRangeSelector&&(a-=this._rangeHeight)),this.showRangeSelector&&!this.showHorizontalAxis&&(a-=2*this._rangeHeight),a-this.marginsChart.top-this.marginsChart.bottom}get _yAxisWidth(){var a;return(null===(a=x(this._chart).selectAll(".y-axis").node())||void 0===a?void 0:a.getBoundingClientRect().width)||0}get _xAxisHeight(){var a;return(null===(a=x(this._chart).selectAll(".x-axis").node())||void 0===a?void 0:a.getBoundingClientRect().height)||0}static _getDomainXaxis(a){const t=new Date(null==a?void 0:a[0]),i=new Date(null==a?void 0:a[1]);return[new Date(null==t?void 0:t.getFullYear(),null==t?void 0:t.getMonth(),1),new Date(null==i?void 0:i.getFullYear(),null==i?void 0:i.getMonth(),null==i?void 0:i.getDay())]}static _generateMiddleTicks(a){return a.reduce(((a,{date:t})=>{const i=new Date(t);return i.setDate(Math.trunc(new Date(i.getFullYear(),i.getMonth()+1,0).getDate()/2)),a.includes(Date.parse(i))||a.push(Date.parse(i)),a}),[])}_getMinAndMaxValues(a){const t=[...a,...this.yAxisValues];return[Math.min(...t),Math.max(...t)]}_buildAditionalLine(a,t){this.data.push({...t,data:[{date:Date.parse(a[0]),value:t.value},{date:Date.parse(a[1]),value:t.value}]})}_deleteChart(){x(this._chart).select(".y-axis").remove(),x(this._chart).select(".graphContainer").remove(),x(this._chart).select(".x-axis").remove(),x(this._chart).select(".marker-bar-container").remove(),x(this._chart).select(".marker-container").remove()}drawChart(){this._deleteChart(),x(this._chart).select("svg")&&this._width>0&&x(this._chart).select("svg").attr("width",this._width).attr("height",this._height).attr("transform",`translate(${this.marginsChart.left}, ${this.marginsChart.top})`),this._graphContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","graphContainer"),this.setCoordinateAxis();const a=z().range([0,this.widthContentChart+(this.showMarker?0:20)]),t=k().range([this.heightContentChart,0]);let i=0;const e=this.data.map((a=>a.data)).flat(),s=this.yAxisDomain.length>0?this.yAxisDomain:this._getMinAndMaxValues(f(e,(a=>a.value))),r=[_(e,(a=>new Date(a.date))),N(e,(a=>new Date(a.date)))];a.domain(r),t.domain(s);const n=_(e,(({value:a})=>a))<0,o=n?0:s[0];this.dashedLineValue&&this._buildAditionalLine(a.domain(),{dashed:!0,value:this.dashedLineValue,width:this._specialLinesWidth}),this.continuousLineValue&&this._buildAditionalLine(a.domain(),{continuous:!0,label:"continuous",value:this.continuousLineValue,width:this._specialLinesWidth});const l=S().x((e=>{const s=a(e.date),r=t(e.value);return this._points[i].push({x:s,y:r}),s})).y((a=>t(a.value))).curve(Z[this.interpolateType]);this._points=[];this.data.map((a=>({...a,data:a.data.filter((({value:a})=>null!==a))}))).forEach((e=>{this._points.push([]),this._graphContainer.append("path").attr("d",l(e.data)).attr("class",`line ${e.dashed?"dashed":e.continuous&&"continuous"}`).attr("stroke",e.color).attr("stroke-width",e.dashed||e.continuous?e.width:this.lineWidth).style("stroke-dasharray",e.dashed?"2":"").attr("fill","none"),null!=e&&e.dashed||this._graphContainer.append("path").datum(e.data).attr("class",`graphic-area ${e.label}`).attr("fill",e.color).attr("opacity",e.continuous?this.continuousAreaOpacity:this.areaOpacity).attr("d",O().x((t=>a(t.date))).y0(t(o)).y1((a=>t(+a.value)))),i+=1})),n&&(this._isZeroValue=!0,this._drawLineZero(t)),this._dotsContainer=this._graphContainer.append("g").data([{x:0,y:0}]).attr("class","dotsContainer"),(!this.hideDots||this.showRangeSelector)&&this._width>0&&(this.showRangeSelector&&this._appendBarSelector(),this.drawMarker()),this._applyTranslations()}_setYAxis(a){const t=this.yAxisDomain.length>0?this.yAxisDomain:this._getMinAndMaxValues(f(a,(a=>a.value))),i=this.yAxisValues.length>0?this.yAxisValues:null,e=k().domain(t).range([this.heightContentChart,0]);this._lineAxisY=C(e).tickSize(this.ticksSizeAxis).tickFormat($(this.yAxisLabel)).tickValues(i).tickSizeOuter(0).tickPadding(4),this.chart.append("g").attr("class","y-axis axis left").call(this._lineAxisY),x(this._chart).selectAll(".y-axis.axis.left line").classed("y-axis-tick",!0),x(this._chart).selectAll(".y-axis.axis.left text").attr("class","text").attr("x",-8)}setDomainXaxisAndValues(a){let t,i;var e;this.xAxisValues.length?(t=f(a,(a=>a.date)),i=this.xAxisValues):(t=q._getDomainXaxis(f(a,(a=>a.date))),i=this.showMiddlePositionTick?q._generateMiddleTicks(a):this._getAxisPoints(null===(e=this.data[0])||void 0===e?void 0:e.data));return{domainXaxis:t,_xAxisValues:i}}setTranslateX(){let a=0;return this.showVerticalAxis&&(a+=this._yAxisWidth+2*this.yAxisSeparation),this.showRangeSelector&&!this.showVerticalAxis&&(a+=this.markerRadius),a}appendXAxisToChart(a,t){this.chart.append("g").attr("class","x-axis axis bottom").attr("transform",`translate(${t}, ${this.heightContentChart+this.marginsChart.top+2})`).call(this._lineAxisX)}setXAxisTextAttributes(){x(this._chart).selectAll("text").attr("class","text"),x(this._chart).selectAll(".x-axis").selectAll("text").attr("y",20),x(this._chart).selectAll(".x-axis").selectAll("text").attr("text-anchor",this.xAxisTextAnchor).attr("transform","translate(2, 3)")}setXAxisLineAttributes(){this.showRangeSelector||x(this._chart).selectAll(".x-axis").selectAll("line").attr("y2",this.ticksSizeAxis).attr("transform","translate(4, 12)").classed("x-axis-tick",!0)}_setXAxis(a,t){if(this.showHorizontalAxis){const{domainXaxis:i,_xAxisValues:e}=this.setDomainXaxisAndValues(a),s=z().domain(i).range([0,this.widthContentChart]);this.customXAxisValues?this._lineAxisX=w(s).tickSize(0).tickFormat(((a,t)=>this.customXAxisValues[t])).tickValues(e):this._lineAxisX=w(s).tickSize(0).tickFormat(t).tickValues(e).tickSizeOuter(0).tickPadding(4);const r=this.setTranslateX();this.appendXAxisToChart(s,r),this.setXAxisTextAttributes()}return this.setXAxisLineAttributes(),this._lineAxisX}setCoordinateAxis(){const a=this.data.map((a=>a.data)).flat(),t=X(this.formatLegend);this.showVerticalAxis&&this._setYAxis(a,t),this.showHorizontalAxis&&this._setXAxis(a,t)}_appendBarSelector(){const a=x(this._chart).select("svg"),t=this._height-this._marker/2;let i=0;this.showVerticalAxis&&(i+=this._yAxisWidth+2*this.yAxisSeparation),this.showRangeSelector&&!this.showVerticalAxis&&(i=this.markerRadius);const e=a.append("g").attr("class","marker-bar-container").attr("transform",`translate(${i}, ${t})`).attr("overflow","hidden");return e.append("rect").attr("class","marker-bar").attr("width",this.widthContentChart).attr("height",4).attr("rx","2px"),e.append("rect").attr("class","marker-bar-variable").attr("width",0).attr("height",4).attr("transform-origin","center right"),e}_applyTranslations(){this.showVerticalAxis&&x(this._chart).selectAll(".y-axis").attr("transform",`translate(${this._yAxisWidth+this.marginsChart.left-this.yAxisSeparation}, ${this.marginsChart.top})`);const a=this.marginsChart.top;let t=0;this.showRangeSelector&&!this.showVerticalAxis&&(t=this.markerRadius),this.showVerticalAxis&&(t=this._yAxisWidth+2*this.yAxisSeparation),this._graphContainer.attr("transform",`translate(${t}, ${a})`)}_drawLineZero(a){this._graphContainer.append("path").style("stroke-width",2).attr("d",`M0,${a(0)}L${this.widthContentChart},${a(0)}`).attr("class","line-zero").attr("stroke","#000000").attr("fill","none"),this._isZeroValue&&this.chart.select(".domain").style("stroke-width",0)}_createSelectedDots(a){this._dotsContainer.selectAll("circle").remove(),this._points.forEach(((t,i)=>{const e=this.data[i];var s,r,n,o;null!=e&&e.dashed||null!=e&&e.continuous||this.hideDots||(this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",null===(s=t[a])||void 0===s?void 0:s.x).attr("cy",null===(r=t[a])||void 0===r?void 0:r.y).attr("r",6).attr("fill",null==e?void 0:e.color),this._dotsContainer.append("circle").attr("class",`dot L${i+1}`).attr("cx",null===(n=t[a])||void 0===n?void 0:n.x).attr("cy",null===(o=t[a])||void 0===o?void 0:o.y).style("opacity",.15).attr("r",12).attr("fill",null==e?void 0:e.color))}))}_dispatchEventOnDrag(a){var t;const i=this.data.map((t=>{var i;return!t.dashed&&!t.continuous&&(null===(i=t.data[a])||void 0===i?void 0:i.value)})),e=new Date(parseFloat(null===(t=this.data[0].data[a])||void 0===t?void 0:t.date));this.dispatchEvent(new CustomEvent("data-visualization-area-drag",{bubbles:!0,composed:!0,detail:{index:a,date:e,selected:i}}))}drawMarker(){var a;this._markerContainer=this.chart.append("g").data([{x:0,y:0}]).attr("class","marker-container"),this._markerContainer.currentX=0;const t=R().domain([0,this.widthContentChart]).range((null===(a=this._points[0])||void 0===a?void 0:a.map(((a,t)=>t)))||[]),i=void 0!==this.selected?this.selected:this._points[0].length-1;t(this._points[0].slice(-1)[0].x,!0),this._setNewPosData(i,!0);const e=this.heightContentChart+this.marginsChart.top,s=`-0.5 ${e}, 0 0, 0.5 ${e}`;if(this._markerContainer.append("polyline").attr("class","marker-line").attr("points",s),this.showRangeSelector){const a=T().on("drag",(()=>{const a=this._markerContainer.currentX+y.x;this._setNewPosData(t(a)),this.chart.select(".marker-bar-variable").attr("width",`${this._points[0][t(a)].x}`)})).on("end",(()=>{const a=this._markerContainer.currentX+y.x;this._setNewPosData(t(a),!0),this.chart.select(".marker-bar-variable").attr("width",`${this._points[0][t(a)].x}`)}));this._markerContainer.call(a),this._appendSelector()}}_getAxisPoints(a){const[t,i]=f(a,(({date:a})=>a)),e=Math.floor((i-t)/(this.numPointsXaxis-1)),s=[new Date(t)];for(let a=1;a<=this.numPointsXaxis-1;a+=1)s.push(new Date(t+e*a));return s}_appendSelector(){const a=this._markerContainer.append("svg").attr("class","marker").attr("width",2*this.markerRadius).attr("height",2*this.markerRadius).attr("viewBox",`0 0 ${2*this.markerRadius} ${2*this.markerRadius}`).attr("x",-this.markerRadius).attr("y",this._height-this.marginsChart.bottom-this._marker/2+1).append("g").attr("fill","none").attr("fill-rule","evenodd");a.append("circle").attr("class","marker-circle").attr("cx",this.markerRadius).attr("cy",this.markerRadius).attr("r",this.markerRadius-1).attr("stroke-width",2);const t=a.append("g").attr("class","marker-circle-lines");return t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-1}, ${this.markerRadius-4})`),t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-5}, ${this.markerRadius-4})`),t.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius+3}, ${this.markerRadius-4})`),a}_setNewPosData(a,t){var i;const{x:e}=this._points[0][a];let s=0;this.showVerticalAxis&&(s+=this._yAxisWidth+2*this.yAxisSeparation),this.showRangeSelector&&!this.showVerticalAxis&&(s+=this.markerRadius),null===(i=this._markerContainer)||void 0===i||i.attr("transform",`translate(${e+s}, 0)`),t&&this._markerContainer&&(this._markerContainer.currentX=e),this._createSelectedDots(a),this._dispatchEventOnDrag(a)}_observerSelected(a){this._points[0]&&this._points[0][a]&&(this.hideDots||this._setNewPosData(a,!0))}static get styles(){return[E,n("bbva-data-visualization-area-shared-styles")]}render(){return o` ${this._chart} `}}const U=Math.PI/180,K=a=>a.flatMap((a=>a.values.map((a=>a.value)))),Q=a=>a.reduce(((a,t)=>Array.isArray(t)?a.concat(t):[]),[]);class aa extends(h(r)){static get is(){return"bbva-data-visualization-vertical-bar"}static get styles(){return[E,n("bbva-web-data-visualization-vertical-bar-shared-styles")]}static get properties(){return{barsColor:{type:Array,attribute:"bars-color"},narrowBar:{type:Boolean,attribute:"narrow-bar"},barPadding:{type:Number,attribute:"bar-padding"},multipleBarPadding:{type:Number,attribute:"multiple-bar-padding"},data:{type:Array,reflect:!0},lineData:{type:Object,attribute:"line-data",reflect:!0},showAvgLine:{type:Boolean,attribute:"show-avg-line"},customAreaValue:{type:Number,attribute:"custom-area-value"},showBarsShadow:{type:Boolean,attribute:"show-bars-shadow"},selected:{type:Number},selectedItem:{type:Object,attribute:"selected-item"},marginsChart:{type:Object,attribute:"margins-chart",reflect:!0},height:{type:Number,reflect:!0},showXAxisDomain:{type:Boolean,attribute:"show-x-axis-domain"},showXAxisTick:{type:Boolean,attribute:"show-x-axis-tick"},showXAxis:{type:Boolean,attribute:"show-x-axis"},showYAxis:{type:Boolean,attribute:"show-y-axis"},showYAxisTick:{type:Boolean,attribute:"show-y-axis-tick"},yAxisFormatLabel:{type:String,attribute:"y-axis-format-label"},yAxisLabel:{type:String,reflect:!0,attribute:"y-axis-label"},showRangeSelector:{type:Boolean,attribute:"show-range-selector",reflect:!0},accessibilityChartLabel:{type:String,attribute:"accessibility-chart-label"},customLineValue:{type:Number,attribute:"custom-line-value"},notFocused:{type:Boolean,attribute:"not-focused",reflect:!0},chartAriaLabel:{type:String,attribute:"chart-aria-label",reflect:!0},markerRadius:{type:Number,attribute:"marker-radius",reflect:!0},yAxisItems:{type:Number,attribute:"y-axis-items"}}}constructor(){super(),this._skewDegree=-27,this.barsColor=["#49A5E6"],this._barWidth=16,this.barPadding=4,this.multipleBarPadding=4,this.data=[],this.lineData={},this._originalAvgData=0,this.showAvgLine=!1,this.showBarsShadow=!1,this.selected=0,this.selectedItem={},this.marginsChart={top:16,right:16,bottom:16,left:16},this._padding={top:0,right:0,bottom:16,left:0},this._margin={top:16,right:0,bottom:24,left:16},this.height=340,this.showXAxisDomain=!1,this.showYAxis=!1,this.yAxisFormatLabel="~s",this.showXAxis=!1,this.showXAxisTick=!1,this.showYAxisTick=!1,this.showRangeSelector=!1,this.markerRadius=16,this.narrowBar=!1,this.lang="en",this.accessibilityChartLabel="",this.notFocused=!1,this.customAreaValue=0,this.customLineValue=0,this._points=[],this._chart=document.createElement("div"),this._chart.setAttribute("class","chart"),this._chart.setAttribute("id","chart"),this.chartAriaLabel="chart",this._accessibilityLabels=document.createElement("span"),this._accessibilityLabels.setAttribute("class","accessibility-label")}_chartPx(a){var t;return null==this||null===(t=this.chartRegion)||void 0===t?void 0:t.property("dataset")[a]}get _hasData(){return a=this.data,Array.isArray(a)&&Boolean(a.length);var a}get _min(){return Math.min(0,...K(this.data))}get _max(){return Math.max(...K(this.data))}get _mean(){return V(K(this.data))}get _hasMeanZero(){return 0===this._mean}get yScaleBase(){return k().domain([this._min,this._max]).range([0,this._chartPx("height")]).clamp(!0)}get _negativeHeightValue(){return this.yScaleBase(Math.max(0,this._min))}get _hasNegativeValue(){return this._min<0}get _allValuesNegative(){return this._min<0&&this._max<0}get _yScale(){return k().domain([this._min,this._allValuesNegative?0:this._max]).range([this._hasMeanZero?0:this._chartPx("height"),0]).clamp(!0)}get _yScaleInvert(){return k().domain([this._min,this._max]).range([this._hasMeanZero?0:this._chartPx("height"),0]).clamp(!0)}get _yAxisScale(){return k().domain([Math.min(0,this._min),this._max]).range([this._hasMeanZero?0:this._chartPx("height"),0])}get _categoryScale(){var a;const t=I(null===(a=this.data)||void 0===a?void 0:a.length),i=[0,this._chartPx("width")];return W().rangeRound(i).domain(t).paddingInner(1).paddingOuter(this.showRangeSelector?.3:.4)}get _labelScale(){var a;const t=null===(a=this.data[0])||void 0===a?void 0:a.values.length,i=Q(this.data.map((a=>a.values.map((a=>a.label)))));return W(i,[0,i[0]===i[1]&&t>1?this._barWidth+this.multipleBarPadding:(this._barWidth+this.multipleBarPadding)*t])}get _barGroupWidth(){return this._labelScale.range()[1]}get _barGroupPaddingLeft(){return-this._barGroupWidth/2}firstUpdated(){this.canvas=x(this._chart).append("svg").attr("attributeName","canvas").attr("class","svg-chart").attr("role","img").attr("title","chart").attr("aria-label",this.chartAriaLabel),this.yAxisRegion=this.canvas.append("g").attr("attributeName","yAxisRegion").attr("class","y-axis"),this.xAxisRegion=this.canvas.append("g").attr("attributeName","xAxisRegion").attr("aria-hidden","true"),this.chartRegion=this.canvas.append("g").attr("attributeName","chartRegion"),this.chartBackgroundRegion=this.chartRegion.append("g"),this.accessibilityRegion=x(this._accessibilityLabels).attr("attributeName","accessibilityRegion").attr("class","sr-only"),this.defsCanvas=this.canvas.append("defs"),this.shadowGradient=this.defsCanvas.append("linearGradient").attr("id","shadowGradient").attr("x1","0%").attr("x2","0%").attr("y1","0%").attr("y2","100%"),this.shadowGradient.append("stop").attr("offset","0%").attr("class","stop-left"),this.shadowGradient.append("stop").attr("offset","100%").attr("class","stop-right"),window.ResizeObserver&&new ResizeObserver((()=>{this._hasData&&this.updateComplete.then((a=>this._createChart(a,!0)))})).observe(this),super.firstUpdated()}updated(a){var t;(a.has("data")||a.has("yAxisLabel"))&&(this._hasData&&(this._yAxisLabelTranslated=!1,this._hasMultipleBars=null===(t=this.data)||void 0===t?void 0:t.some((a=>a.values.length>1)),this.updateComplete.then((()=>this._createChart()))));this.__yAxisLabel&&!this._yAxisLabelTranslated&&(this._yAxisLabelTranslated=!0,this.updateComplete.then((a=>this._createChart(a,!0)))),this.notFocused&&this.chartRegion.selectAll(".bar-group").classed("bar-group--not-selected",!1)}_deleteChart(){this.chartRegion.selectAll(".shadow-bar").remove(),this.chartRegion.select('[attributeName="avg"]').remove(),this.chartRegion.select('[attributeName="customLine"]').remove(),this.chartRegion.select('[attributeName="customArea"]').remove(),this.chartRegion.select('[attributeName="middleLine"]').remove(),this.xAxisRegion.select('[attributeName="xAxisRegion"]').remove(),this.xAxisRegion.select('[attributeName="xAxis"]').remove(),this.xAxisRegion.select('[attributeName="yAxisRegion"]').remove(),this.accessibilityRegion.select('[attributeName="accessibilityRegion"]').remove(),x(this._chart).select(".marker-container").remove(),x(this._chart).select(".marker-bar-container").remove()}get _showVerticalAxis(){return this.showYAxis||this.showYAxisTick}_createChart(a,t=!1){return this._deleteChart(),this._updateContainers(),this._addBarGradients(this._colors(a)),(this.showXAxis||this.showXAxisTick||this.showXAxisDomain)&&this._xAxis(a),this._showVerticalAxis&&this._yAxis(),this.showRangeSelector&&(this._appendBarSelector(),this.drawMarker(),this._setNewPosData(this.selected,!0,!0)),this._accessibleLabels(),this._addBars(t).on("start",(()=>{this._setBarColors(),!this.showBarsShadow||this._hasMeanZero||this._hasNegativeValue||this._addShadowBars(t)})).on("end",(()=>{this._handleAdditionalFeatures()}))}_handleAdditionalFeatures(){var a,t;this.showAvgLine&&this.data.length>1&&this._avgLine(),this.customAreaValue&&this.data.length>1&&this._customArea(),this.customLineValue&&this.data.length>1&&this._customLine(),!this._hasMeanZero&&(null===(a=this.lineData)||void 0===a||null===(t=a.data)||void 0===t?void 0:t.length)>1&&this._middleLine()}get _xAxisHeight(){var a;return(null===(a=x(this._chart).selectAll(".x-axis").node())||void 0===a?void 0:a.getBoundingClientRect().height)||0}get _yAxisWidth(){var a;return(null===(a=this.yAxisRegion.node())||void 0===a?void 0:a.getBoundingClientRect().width)||0}_appendSelector(){const a=this.narrowBar?1:6,t=this._markerContainer.append("svg").attr("class","marker").attr("width",2*this.markerRadius).attr("height",2*this.markerRadius).attr("viewBox",`0 0 ${2*this.markerRadius} ${2*this.markerRadius}`).attr("x",-this.markerRadius).attr("y",this.showXAxis||this.showXAxisDomain||this.showXAxisTick?this.height+this.markerRadius+a:this.height+a).append("g").attr("fill","none").attr("fill-rule","evenodd");t.append("circle").attr("class","marker-circle").attr("cx",this.markerRadius).attr("cy",this.markerRadius).attr("r",this.markerRadius-1).attr("stroke-width",2);const i=t.append("g").attr("class","marker-circle-lines");return i.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-1}, ${this.markerRadius-4})`),i.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius-5}, ${this.markerRadius-4})`),i.append("rect").attr("class","marker-circle-line-1").attr("width",2).attr("height",8).attr("rx","1px").attr("transform",`translate(${this.markerRadius+3}, ${this.markerRadius-4})`),t}_appendBarSelector(){const a=this.narrowBar?0:4;x(this._chart).select(".marker-bar-container").remove();const t=x(this._chart).select("svg");let i=this.height;this.showXAxis||this.showXAxisDomain||this.showXAxisTick||(i-=16),this.showRangeSelector&&(i+=2*this.markerRadius+a);const e=t.append("g").attr("class","marker-bar-container").attr("transform",`translate(${this._yAxisWidth}, ${i})`).attr("overflow","hidden");return e.append("rect").attr("class","marker-bar").attr("width",this._chartPx("width")).attr("height",4).attr("rx","2px"),e.append("rect").attr("class","marker-bar-variable").attr("width",0).attr("height",4).attr("transform-origin","center right"),e}_setNewPosData(a,t,i=!1){const e=this._categoryScale(a)+this._yAxisWidth;if(this._markerContainer.attr("transform",`translate(${e}, 0)`),t){this._markerContainer.currentX=e,this.selectedItem=this.data[a],this.selected=a;const t={selectedItem:this.selectedItem,selected:this.selected};this._dispatchEvent("data-visualization-vertical-bar-select",t),i||this._dispatchEvent("data-visualization-vertical-bar-change",t)}this._selectedItem(a)}drawMarker(){x(this._chart).select(".marker-container").remove(),this._markerContainer=x(this._chart).select("svg").append("g").data([{x:0,y:0}]).attr("class","marker-container"),this._markerContainer.currentX=0;const a=R().domain([0,this._chartPx("width")]).range(this.data.map(((a,t)=>t))),t=T().on("drag",(()=>{const t=this._markerContainer.currentX+y.x;this._setNewPosData(a(t-(this.__yAxisLabel?this._yAxisWidth:0)),!1)})).on("end",(()=>{const t=this._markerContainer.currentX+y.x;this._setNewPosData(a(t-(this.__yAxisLabel?this._yAxisWidth:0)),!0)}));this._markerContainer.call(t),this._appendSelector()}_updateChartRegion(a,t){var i,e,s,r;this.chartRegion.attr("data-width",a-this._yAxisWidth).attr("data-height",this.height-((null===(i=this.marginsChart)||void 0===i?void 0:i.top)||0)-((null===(e=this.marginsChart)||void 0===e?void 0:e.bottom)||0)-this._xAxisHeight).attr("transform",`translate(${this._yAxisWidth}, ${this.narrowBar?((null===(s=this._margin)||void 0===s?void 0:s.bottom)||0)-t:(null===(r=this._margin)||void 0===r?void 0:r.bottom)||0})`)}_updateXAxisRegion(a){var t,i;this.xAxisRegion.attr("transform",`translate(${this._yAxisWidth}, ${this.narrowBar?this.height-((null===(t=this.marginsChart)||void 0===t?void 0:t.bottom)||0)-a:this.height-((null===(i=this.marginsChart)||void 0===i?void 0:i.bottom)||0)})`)}_updateCanvas(a,t){var i,e;const s=this.showRangeSelector?2*this.markerRadius:0,r=this.showXAxis?this.height+s+(this.narrowBar?((null===(i=this._margin)||void 0===i?void 0:i.bottom)||0)-t:((null===(e=this._margin)||void 0===e?void 0:e.bottom)||0)-this._xAxisHeight):this.height+s+t;this.canvas.attr("title",this.accessibilityChartLabel).attr("attributeName","canvas").attr("class","svg-chart").attr("data-width",a+this.marginsChart.left/2).attr("data-height",r+this.marginsChart.top+this.marginsChart.bottom).style("width",a+this.marginsChart.left/2).style("height",r+this.marginsChart.top+(this.showRangeSelector?0:this.marginsChart.bottom))}_updateContainers(){var a,t;const i=Math.round(this.getBoundingClientRect().width);this._updateCanvas(i,4),this.yAxisRegion.attr("transform",`translate(${this._yAxisWidth},\n        ${this._hasMeanZero?this.height-((null===(a=this.marginsChart)||void 0===a?void 0:a.bottom)||0):(null===(t=this.marginsChart)||void 0===t?void 0:t.top)||0})`).style("height",this.height),this._updateXAxisRegion(4),this._updateChartRegion(i,4)}_colors(){return Q(this.data.map((a=>a.values.map((a=>a.categoryColors)))))}static _addGradient({gradient:a,color:t,offset:i}){a.append("stop").attr("offset",i).attr("stop-color",t)}_addBarGradients(a){const t=this.defsCanvas,i="100%",e=Q(this.data.map((a=>a.values.map((a=>a.categoryPercentages)))));let s;a.forEach(((a,r)=>{t.select(`#colorGradient-${r}`).remove(),a&&(s=t.append("linearGradient").classed("linear-gradient",!0).attr("id",`colorGradient-${r}`).attr("x1","0%").attr("x2","0%").attr("y1","0%").attr("y2",i),a.forEach(((t,n)=>{e[r]&&e[r][n]?(aa._addGradient({gradient:s,color:t,offset:0===n?"0%":`${e[r][n-1]}%`}),aa._addGradient({gradient:s,color:t,offset:n===a[n].length-1?i:`${e[r][n]}%`})):t&&(aa._addGradient({gradient:s,color:t,offset:"0%"}),aa._addGradient({gradient:s,color:t,offset:i}))})))}))}_setBarColors(){this.chartRegion.selectAll(".bar-group rect").attr("fill",((a,t)=>this._chart.querySelector(`#colorGradient-${t}`)&&`url(#colorGradient-${t})`))}_addShadowBars(a){var t;const{_barGroupPaddingLeft:i,_categoryScale:e}=this,s=this._chartPx("height"),r=null===(t=this.data[0])||void 0===t?void 0:t.values,n=(a,t)=>{const r=e(t)+1*i+this.barPadding/2;return[[r,s],[r,s-4],[r-6,s-4]].map((a=>a.join(","))).join(" ")};r.map(((a,t)=>({position:t*(this._barWidth+this.multipleBarPadding),value:r[t].value,index:t}))).forEach(((t,i)=>{this.chartRegion.selectAll(`.shadow-bars${i}`).data(this.data).enter().append("polygon").attr("transform",`translate(${t.position},0)`).attr("class",`shadow-bar shadow-bars${i}`).attr("points",n).attr("fill","url(#shadowGradient)").transition().duration(a?1e3:0).attr("opacity",(a=>a.values[t.index].value?1:0))}))}_barWidths(){this._barWidth=this.narrowBar?8:16}_changeBarColors(){return a=>{if(this.showRangeSelector){const t=x(this._chart);t.selectAll(".bar-group")._groups[0].forEach(((i,e)=>{e===this.data.indexOf(a)&&i.querySelectorAll("rect").forEach(((i,e)=>{const s=i.getAttribute("fill").replace(/.*\(#(.*)\).*/,"$1");t.select(`#${s}`).selectAll("stop")._groups[0].forEach(((t,i)=>{var s;t.setAttribute("stop-color",null===(s=a.values[e])||void 0===s?void 0:s.categoryColorsPressed[Math.floor((i||1)/2)])}))}))}))}}}_addBarAttributes(a){const t=Math.tan(-1*this._skewDegree*U);a.selectAll("rect").data((a=>a.values)).enter().append("rect").attr("attributeName",((a,t)=>`bar-${t}`)).attr("x",(a=>this._labelScale(a.label))).attr("y",(()=>this._yScaleInvert(0))).attr("transform",(({label:a})=>`skewY(${this._skewDegree})\n            translate(0, ${this._labelScale(a)*t})`)).attr("width",this._barWidth).attr("height",0)}_createSlice(){const{_barGroupPaddingLeft:a}=this;return this.chartRegion.selectAll(".bar-group").data(this.data).enter().append("g").attr("attributeName",((a,t)=>`bar-group-${t}`)).attr("role",this.showRangeSelector?"button":"presentation").attr("tabindex",this.showRangeSelector?"0":void 0).classed("bar-group bar",!0).classed("bar-group--not-selected",(a=>a!==this.selectedItem&&null!==this.selectedItem&&!this.notFocused&&this.showRangeSelector)).attr("transform",((t,i)=>`translate(${this._categoryScale(i)+1*a+this.barPadding/2}, 0)`)).on("mousedown",this._changeBarColors()).on("mouseup",this.showRangeSelector?()=>this._addBarGradients(this._colors()):"").on("click",this.showRangeSelector?(a,t)=>this._setNewPosData(t,!0):"")}_addBarTransitions(a,t){return a.selectAll("rect").transition().delay(t?()=>1e3*Math.random():0).duration(t?1e3:0).attr("y",(a=>this._yScaleInvert(this._hasMeanZero?0:Math.max(0,a.value)))).attr("height",(a=>Math.abs(this._yScale(this._hasMeanZero?0:a.value)-this._yScale(0))))}_addBars(a){this.chartRegion.selectAll(".bar-group").remove(),this._barWidths();const t=this._createSlice();return this._addBarAttributes(t),this._addBarTransitions(t,a)}_avgLine(){var a;const{_mean:t,_yAxisScale:i,chartBackgroundRegion:e}=this,s=0===t?this.height-this.xAxisRegion.node().getBoundingClientRect().height-3:i(t)-((null===(a=this._margin)||void 0===a?void 0:a.bottom)||0)/3;e.select('[attributeName="avg"]').remove(),e.append("line").attr("attributeName","avg").attr("x1","0").attr("x2",this._chartPx("width")).attr("y1",this.narrowBar?s+3-4:s-4).attr("y2",this.narrowBar?s+3-4:s-4).attr("class","line-dash").style("stroke-dasharray","3, 3")}_middleLine(){var a,t;this.chartRegion.select('[attributeName="middleLine"]').remove();const i=S().x(((a,t,i)=>0===t?0:t===i.length-1?this._chartPx("width"):this._categoryScale(t))).y((a=>this._yScaleInvert(a.value)));this.chartRegion.append("path").attr("attributeName","middleLine").attr("d",i(null===(a=this.lineData)||void 0===a?void 0:a.data)).attr("class","middle-line").attr("stroke",null===(t=this.lineData)||void 0===t?void 0:t.color).attr("stroke-width",4).attr("fill","none")}_customLine(){const{chartBackgroundRegion:a}=this,t=this.narrowBar?this._yScaleInvert(this.customLineValue)-4:this._yScaleInvert(this.customLineValue);a.select('[attributeName="customLine"]').remove(),a.append("line").attr("attributeName","customLine").attr("x1","0").attr("x2",this._chartPx("width")).attr("y1",t).attr("y2",t).attr("class","custom-line").style("stroke-line","3, 3")}_customArea(){var a;const t=this._yScaleInvert(0)-((null===(a=this._margin)||void 0===a?void 0:a.bottom)||0)/3;this.chartBackgroundRegion.select('[attributeName="customArea"]').remove(),this.chartBackgroundRegion.append("rect").attr("attributeName","customArea").attr("class","custom-area").attr("width",this._chartPx("width")).attr("height",this.narrowBar?t-this._yScaleInvert(this.customAreaValue)+8:t-this._yScaleInvert(this.customAreaValue)).attr("y",this.narrowBar?this._yScaleInvert(this.customAreaValue)-4:this._yScaleInvert(this.customAreaValue))}_selectedItem(a){this.chartRegion.selectAll(".bar-group").classed("bar-group--not-selected",!1).classed("bar-group--not-selected",((t,i)=>a!==i)),this.xAxisRegion.selectAll(".tick text").classed("text--not-selected",!0).classed("text--not-selected",((t,i)=>a!==i))}_removeOldXAxis(){this.xAxisRegion.select('[attributeName="xAxisRegion"]').remove(),this.xAxisRegion.select('[attributeName="xAxis"]').remove()}get _domainVerticalPosition(){const a=this.narrowBar?this._margin.top/2:this._margin.top/4,t=this.narrowBar?this._margin.top/1.5:this._margin.top/1.2;var i,e;return this._hasNegativeValue?Math.round(this._negativeHeightValue)+t:this.narrowBar?Math.round(((null===(e=this._margin)||void 0===e?void 0:e.top)||0)-a):Math.round((null===(i=this._margin)||void 0===i?void 0:i.top)||0)-a}_createAxisGroup(a){var t;const i=this.data.findIndex(((t,i)=>i===a));return this.xAxisRegion.append("g").attr("attributeName","xAxis").attr("class","x-axis").attr("transform",`translate(0, ${((null===(t=this._margin)||void 0===t?void 0:t.top)||0)-4})`).call(w(this._categoryScale).tickFormat(((a,t)=>this.data[t].category)).tickSizeOuter(0).tickSizeInner(this.showRangeSelector?2:0).tickPadding(this.showRangeSelector?6:8)).call((a=>a.selectAll(".tick line").attr("class","x-axis-tick"))).call((a=>a.selectAll(".tick text").classed("text",!0).classed("text--not-selected",(a=>a!==i&&null!==this.selectedItem&&this.showRangeSelector)))).call((a=>a.select(".domain").attr("transform",`translate(0,\n          -${this._domainVerticalPosition})`).attr("class","domain")))}_removedXAxisElements(){this.showXAxisDomain||this.xAxisRegion.call((a=>a.select(".domain").remove())),this.showXAxisTick||this.xAxisRegion.call((a=>a.selectAll(".x-axis-tick").remove()))}_xAxis(a){this._removeOldXAxis(),this._createAxisGroup(a),this._removedXAxisElements()}_yAxis(){const{yAxisRegion:a,_yAxisScale:t,showYAxisTick:i,yAxisFormatLabel:e,yAxisLabel:s,lang:r}=this,n=$(e),o="es"===r?"mil":"k";a.selectAll("g").remove(),a.call(C(t).tickFormat((a=>`${n(a).replace("k",o)} ${s||""}`)).ticks(this.yAxisItems).tickSize(2).tickSizeOuter(0).tickPadding(6)).call((a=>a.selectAll(".tick line").attr("class","y-axis-tick"))).call((a=>a.selectAll("text").attr("class","text"))),i||a.call((a=>a.selectAll(".y-axis-tick").remove()))}_accessibleLabels(){this.accessibilityRegion.select('[attributeName="accessibilityRegion"]').remove(),this.accessibilityRegion.selectAll("span").remove(),this.accessibilityRegion.selectAll(".accessibility-label").data(this.data).enter().append("span").attr("tabindex","0").text((a=>`\n          ${a.category}\n          ${a.values.map((a=>`${a.label} ${a.value}\n            ${this.lang&&"es"===this.lang?"€":"$"}`))}`))}render(){return o` <div class="wrap">${this._chart}${this._accessibilityLabels}</div> `}_dispatchEvent(a,t){this.dispatchEvent(new CustomEvent(a,{detail:t,bubbles:!0,composed:!0}))}}var ta=a`
:host {
  --_data-visualization-linear-text-fill: var(--bbva-data-visualization-linear--_ambient--text-fill,
      var(--bbva-data-visualization-linear--custom--primary-ambient--text-fill,
        ${u("colorPrimaryText01Default",b)}));
  --_data-visualization-linear-marker-line-fill: var(--bbva-data-visualization-linear--_ambient--marker-line-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--marker-line-fill,
      ${u("colorPrimaryCtaMainBackgroundDefault",b)}));
  --_data-visualization-linear-marker-circle-fill: var(--bbva-data-visualization-linear--_ambient--marker-circle-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--marker-circle-fill,
      ${u("colorPrimaryCtaMainBackgroundDefault",b)}));
  --_data-visualization-linear-marker-circle-stroke: var(--bbva-data-visualization-linear--_ambient--marker-circle-stroke,
    var(--bbva-data-visualization-linear--custom--primary-ambient--marker-circle-stroke,
      ${u("colorPrimarySurfaceAmbientDefault",b)}));
  --_data-visualization-linear-circle-lines-fill: var(--bbva-data-visualization-linear--_ambient--circle-lines-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--circle-lines-fill,
      ${u("colorPrimaryCtaMainTextDefault",b)}));
  --_data-visualization-linear-marker-bar-fill: var(--bbva-data-visualization-linear--_ambient--marker-bar-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--marker-bar-fill,
      ${u("colorPrimarySupportPendingDefault",b)}));
  --_data-visualization-linear-marker-bar-variable-fill: var(--bbva-data-visualization-linear--_ambient--marker-bar-variable-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--marker-bar-variable-fill,
      ${u("colorPrimarySupportPendingDefault",b)}));
  --_data-visualization-linear-custom-area-fill: var(--bbva-data-visualization-linear--_ambient--custom-area-fill,
    var(--bbva-data-visualization-linear--custom--primary-ambient--custom-area-fill,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-dashed-line-stroke-color: var(--bbva-data-visualization-linear--_ambient--dashed-line-stroke-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--dashed-line-stroke-color,
      ${u("colorPrimaryDataAxis02",b)}));
  --_data-visualization-linear-continuous-line-stroke-color: var(--bbva-data-visualization-linear--_ambient--continuous-line-stroke-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--continuous-line-stroke-color,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-domain-stroke-color: var(--bbva-data-visualization-linear--_ambient--domain-stroke-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--domain-stroke-color,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-x-domain-stroke-color: var(--bbva-data-visualization-linear--_ambient--x-domain-stroke-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--x-domain-stroke-color,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-axis-tick-color: var(--bbva-data-visualization-linear--_ambient--axis-tick-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--axis-tick-color,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-icon-border: var(--bbva-data-visualization-linear--_ambient--icon-border,
    var(--bbva-data-visualization-linear--custom--primary-ambient--icon-border,
      ${u("colorPrimaryCtaMainTextDefault",b)}));
  --_data-visualization-linear-icon-background:
    var(--bbva-data-visualization-linear--_ambient--icon-background,
      var(--bbva-data-visualization-linear--custom--primary-ambient--icon-background,
        ${u("colorPrimaryCtaMainTextDefault",b)}));
  --_data-visualization-linear-skeleton-quote-color: var(--bbva-data-visualization-linear--_ambient--skeleton-quote-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--skeleton-quote-color,
      ${u("colorPrimarySurfaceAmbientDefault",b)}));
  --_data-visualization-linear-skeleton-animated-layer-bg: var(--bbva-data-visualization-linear--_ambient--skeleton-animated-layer-bg,
    var(--bbva-data-visualization-linear--custom--primary-ambient--skeleton-animated-layer-bg,
      ${u("colorPrimaryDataAxis01",b)}));
  --_data-visualization-linear-bar-color: var(--bbva-data-visualization-linear--_ambient--bar-color,
    var(--bbva-data-visualization-linear--custom--primary-ambient--bar-color,
      ${u("colorPrimaryProcessPending",b)}));
}
`;const ia=a`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-data-visualization-linear--_ambient--text-fill: initial;
    --bbva-data-visualization-linear--_ambient--marker-line-fill: initial;
    --bbva-data-visualization-linear--_ambient--marker-circle-fill: initial;
    --bbva-data-visualization-linear--_ambient--marker-circle-stroke: initial;
    --bbva-data-visualization-linear--_ambient--circle-lines-fill: initial;
    --bbva-data-visualization-linear--_ambient--marker-bar-fill: initial;
    --bbva-data-visualization-linear--_ambient--marker-bar-variable-fill: initial;
    --bbva-data-visualization-linear--_ambient--dashed-line-stroke-color: initial;
    --bbva-data-visualization-linear--_ambient--continuous-line-stroke-color: initial;
    --bbva-data-visualization-linear--_ambient--domain-stroke-color: initial;
    --bbva-data-visualization-linear--_ambient--x-domain-stroke-color: initial;
    --bbva-data-visualization-linear--_ambient--axis-tick-color: initial;
    --bbva-data-visualization-linear--_ambient--icon-border: initial;
    --bbva-data-visualization-linear--_ambient--icon-background: initial;
    --bbva-data-visualization-linear--_ambient--skeleton-quote-color: initial;
    --bbva-data-visualization-linear--_ambient--skeleton-animated-layer-bg: initial;
    --bbva-data-visualization-linear--_ambient--bar-color: initial;
  }
`,ea=a`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-data-visualization-linear--_ambient--text-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--text-fill,
      ${u("colorPrimaryAltText01Default",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-line-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--marker-line-fill,
      ${u("colorPrimaryAltCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--marker-circle-fill,
      ${u("colorPrimaryAltCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-stroke: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--marker-circle-stroke,
      ${u("colorPrimaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--circle-lines-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--circle-lines-fill,
      ${u("colorPrimaryAltCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--marker-bar-fill,
      ${u("colorPrimaryAltSupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-variable-fill: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--marker-bar-variable-fill,
      ${u("colorPrimaryAltSupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--dashed-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--dashed-line-stroke-color,
      ${u("colorPrimaryAltDataAxis02",b)}
    );

    --bbva-data-visualization-linear--_ambient--continuous-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--continuous-line-stroke-color,
      ${u("colorPrimaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--domain-stroke-color,
      ${u("colorPrimaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--x-domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--x-domain-stroke-color,
      ${u("colorPrimaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--axis-tick-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--axis-tick-color,
      ${u("colorPrimaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--icon-border: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--icon-border,
      ${u("colorPrimaryAltCtaMainTextDefault",b)}
    );
    --bbva-data-visualization-linear--_ambient--icon-background: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--icon-background,
      ${u("colorPrimaryAltCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--skeleton-quote-color,
      ${u("colorPrimaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${u("colorPrimaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--bar-color: var(
      --bbva-data-visualization-linear--custom--primary-alt-ambient--bar-color,
      ${u("colorPrimaryAltProcessPending",b)}
    );
  }
`,sa=a`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-data-visualization-linear--_ambient--text-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--text-fill,
      ${u("colorSecondaryText01Default",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-line-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--marker-line-fill,
      ${u("colorSecondaryCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--marker-circle-fill,
      ${u("colorSecondaryCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-stroke: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--marker-circle-stroke,
      ${u("colorSecondarySurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--circle-lines-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--circle-lines-fill,
      ${u("colorSecondaryCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--marker-bar-fill,
      ${u("colorSecondarySupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-variable-fill: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--marker-bar-variable-fill,
      ${u("colorSecondarySupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--dashed-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--dashed-line-stroke-color,
      ${u("colorSecondaryDataAxis02",b)}
    );

    --bbva-data-visualization-linear--_ambient--continuous-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--continuous-line-stroke-color,
      ${u("colorSecondaryDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--domain-stroke-color,
      ${u("colorSecondaryDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--x-domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--x-domain-stroke-color,
      ${u("colorSecondaryDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--icon-border: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--icon-border,
      ${u("colorSecondaryCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--icon-background: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--icon-background,
      ${u("colorSecondaryCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--skeleton-quote-color,
      ${u("colorSecondarySurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${u("colorSecondaryDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--bar-color: var(
      --bbva-data-visualization-linear--custom--secondary-ambient--bar-color,
      ${u("colorSecondaryProcessPending",b)}
    );
  }
`,ra=a`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-data-visualization-linear--_ambient--text-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--text-fill,
      ${u("colorSecondaryAltText01Default",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-line-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--marker-line-fill,
      ${u("colorSecondaryAltCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--marker-circle-fill,
      ${u("colorSecondaryAltCtaMainBackgroundDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-circle-stroke: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--marker-circle-stroke,
      ${u("colorSecondaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--circle-lines-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--circle-lines-fill,
      ${u("colorSecondaryAltCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--marker-bar-fill,
      ${u("colorSecondaryAltSupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--marker-bar-variable-fill: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--marker-bar-variable-fill,
      ${u("colorSecondaryAltSupportPendingDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--dashed-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--dashed-line-stroke-color,
      ${u("colorSecondaryAltDataAxis02",b)}
    );

    --bbva-data-visualization-linear--_ambient--continuous-line-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--continuous-line-stroke-color,
      ${u("colorSecondaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--domain-stroke-color,
      ${u("colorSecondaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--x-domain-stroke-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--x-domain-stroke-color,
      ${u("colorSecondaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--icon-border: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--icon-border,
      ${u("colorSecondaryAltCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--icon-background: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--icon-background,
      ${u("colorSecondaryAltCtaMainTextDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-quote-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--skeleton-quote-color,
      ${u("colorSecondaryAltSurfaceAmbientDefault",b)}
    );

    --bbva-data-visualization-linear--_ambient--skeleton-animated-layer-bg: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${u("colorSecondaryAltDataAxis01",b)}
    );

    --bbva-data-visualization-linear--_ambient--bar-color: var(
      --bbva-data-visualization-linear--custom--secondary-alt-ambient--bar-color,
      ${u("colorSecondaryAltProcessPending",b)}
    );
  }
`;const na=m([Object.freeze({__proto__:null,primary:ia,primaryAlt:ea,secondary:sa,secondaryAlt:ra}),v,g]),oa=Object.values(na);class la extends(h(r)){static get is(){return"bbva-data-visualization-linear"}static get scopedElements(){return{"bbva-data-visualization-lines":G,"bbva-data-visualization-area":q,"bbva-data-visualization-vertical-bar":aa}}static get properties(){return{chartType:{type:String,attribute:"chart-type",reflect:!0},loading:{type:Boolean,reflect:!0},data:{type:Array,reflect:!0},lineData:{type:Object,attribute:"line-data",reflect:!0},width:{type:Number,reflect:!0},height:{type:Number,reflect:!0},language:{type:Object,reflect:!0},marginsChart:{type:Object,attribute:"margins-chart",reflect:!0},numPointsXaxis:{type:Number,attribute:"num-points-xaxis",reflect:!0},ticksSizeXAxis:{type:Number,attribute:"ticks-size-xaxis",reflect:!0},interpolateType:{type:String,attribute:"interpolate-type",reflect:!0},marginXAxisLegend:{type:Number,attribute:"margin-axis-legend",reflect:!0},formatLegend:{type:String,attribute:"format-legend",reflect:!0},selected:{type:Number,reflect:!0},markerRadius:{type:Number,attribute:"marker-radius",reflect:!0},hideXAxis:{type:Boolean,attribute:"hide-x-axis"},hideXAxisTick:{type:Boolean,attribute:"hide-x-axis-tick"},hideYAxis:{type:Boolean,attribute:"hide-y-axis"},hideYAxisTick:{type:Boolean,attribute:"hide-y-axis-tick"},yAxisLabel:{type:String,reflect:!0,attribute:"y-axis-label"},customDashedLineValue:{type:Number,attribute:"custom-dashed-line-value"},customContinuousLineValue:{type:Number,attribute:"custom-continuous-line-value"},accessibilityChartLabel:{type:String,attribute:"accessibility-chart-label"},showMarker:{type:Boolean,attribute:"show-marker"},showValueZero:{type:Boolean,attribute:"show-value-zero"},maxIcon:{type:Number,attribute:"max-icon"},ticksSizeAxis:{type:Number,attribute:"ticks-size-axis",reflect:!0},showVerticalAxis:{type:Boolean,reflect:!0,attribute:"show-vertical-axis"},showHorizontalAxis:{type:Boolean,reflect:!0,attribute:"show-horizontal-axis"},yAxisPadding:{type:Number,reflect:!0,attribute:"y-axis-padding"},lineWidth:{type:Number,attribute:"line-width",reflect:!0},areaOpacity:{type:Number,attribute:"area-opacity",reflect:!0},continuousAreaOpacity:{type:Number,attribute:"continuous-area-opacity",reflect:!0},hideDots:{type:Boolean,attribute:"hide-dots"},dashedLineValue:{type:Number,attribute:"dashed-line-value"},continuousLineValue:{type:Number,attribute:"continuous-line-value"},yAxisDomain:{type:Array,attribute:"y-axis-domain"},yAxisValues:{type:Array,attribute:"y-axis-values"},xAxisValues:{type:Array,attribute:"x-axis-values"},showMiddlePositionTick:{type:Boolean,attribute:"show-middle-position-tick"},barsColor:{type:Array,attribute:"bars-color"},narrowBar:{type:Boolean,attribute:"narrow-bar"},barPadding:{type:Number,attribute:"bar-padding"},multipleBarPadding:{type:Number,attribute:"multiple-bar-padding"},showAvgLine:{type:Boolean,attribute:"show-avg-line"},customAreaValue:{type:Number,attribute:"custom-area-value"},showBarsShadow:{type:Boolean,attribute:"show-bars-shadow"},showXAxisDomain:{type:Boolean,attribute:"show-x-axis-domain"},showXAxisTick:{type:Boolean,attribute:"show-x-axis-tick"},showXAxis:{type:Boolean,attribute:"show-x-axis"},showYAxis:{type:Boolean,attribute:"show-y-axis"},showYAxisTick:{type:Boolean,attribute:"show-y-axis-tick"},yAxisFormatLabel:{type:String,attribute:"y-axis-format-label"},showRangeSelector:{type:Boolean,attribute:"show-range-selector",reflect:!0},langCode:{type:String,attribute:"lang-code"},customLineValue:{type:Number,attribute:"custom-line-value"},notFocused:{type:Boolean,attribute:"not-focused",reflect:!0},yAxisSeparation:{type:Number,attribute:"y-axis-separation",reflect:!0},chartAriaLabel:{type:String,attribute:"chart-aria-label",reflect:!0},customXAxisValues:{type:Array,attribute:"custom-x-axis-values"},xAxisTextAnchor:{type:String,attribute:"x-axis-text-anchor"},yAxisItems:{type:Number,attribute:"y-axis-items"}}}constructor(){super(),this.chartType="",this.interpolateType="linear",this.loading=!1,this.showMarker=!1,this.yAxisSeparation=8,this.chartAriaLabel="chart"}static get styles(){return[E,ta,oa,n("bbva-data-visualization-linear-shared-styles")]}render(){let a;return"lines"===this.chartType?a=this._chartLines:"area"===this.chartType?a=this._chartArea:"bar"===this.chartType&&(a=this._chartVerticalBar),this.loading?o`<div class="skeleton"></div>`:a}get _chartLines(){return o`<bbva-data-visualization-lines
      data="${l(JSON.stringify(this.data))}"
      width="${l(this.width)}"
      height="${l(this.height)}"
      language="${l(JSON.stringify(this.language))}"
      margins-chart="${l(JSON.stringify(this.marginsChart))}"
      num-points-xaxis="${l(this.numPointsXaxis)}"
      ticks-size-xaxis="${l(this.ticksSizeXAxis)}"
      interpolate-type="${l(this.interpolateType)}"
      margin-xaxis-legend="${l(this.marginXAxisLegend)}"
      format-legend="${l(this.formatLegend)}"
      selected="${l(this.selected)}"
      marker-radius="${l(this.markerRadius)}"
      ?hide-x-axis="${this.hideXAxis}"
      ?hide-x-axis-tick="${this.hideXAxisTick}"
      ?hide-y-axis="${this.hideYAxis}"
      ?hide-y-axis-tick="${this.hideYAxisTick}"
      y-axis-label="${l(this.yAxisLabel)}"
      custom-dashed-line-value="${l(this.customDashedLineValue)}"
      custom-continuous-line-value="${l(this.customContinuousLineValue)}"
      accessibility-chart-label="${l(this.accessibilityChartLabel)}"
      ?show-marker="${this.showMarker}"
      ?show-value-zero="${this.showValueZero}"
      max-icon="${l(this.maxIcon)}"
      chart-aria-label="${l(this.chartAriaLabel)}"
    ></bbva-data-visualization-lines>`}get _chartArea(){return o`<bbva-data-visualization-area
      data="${l(JSON.stringify(this.data))}"
      width="${l(this.width)}"
      height="${l(this.height)}"
      language="${l(JSON.stringify(this.language))}"
      margins-chart="${l(JSON.stringify(this.marginsChart))}"
      num-points-xaxis="${l(this.numPointsXaxis)}"
      ticks-size-axis="${l(this.ticksSizeAxis)}"
      interpolate-type="${l(this.interpolateType)}"
      format-legend="${l(this.formatLegend)}"
      selected="${l(this.selected)}"
      ?show-vertical-axis="${this.showVerticalAxis}"
      ?show-horizontal-axis="${this.showHorizontalAxis}"
      y-axis-padding="${l(this.yAxisPadding)}"
      y-axis-label="${l(this.yAxisLabel)}"
      line-width="${l(this.lineWidth)}"
      area-opacity="${l(this.areaOpacity)}"
      continuous-area-opacity="${l(this.continuousAreaOpacity)}"
      ?show-range-selector="${this.showRangeSelector}"
      ?hide-dots="${this.hideDots}"
      dashed-line-value="${l(this.dashedLineValue)}"
      continuous-line-value="${l(this.continuousLineValue)}"
      y-axis-domain="${l(JSON.stringify(this.yAxisDomain))}"
      y-axis-values="${l(JSON.stringify(this.yAxisValues))}"
      x-axis-values="${l(JSON.stringify(this.xAxisValues))}"
      x-axis-text-anchor="${l(this.xAxisTextAnchor)}"
      custom-x-axis-values="${l(JSON.stringify(this.customXAxisValues))}"
      ?show-middle-position-tick="${l(this.showMiddlePositionTick)}"
      y-axis-separation="${l(this.yAxisSeparation)}"
      chart-aria-label="${l(this.chartAriaLabel)}"
    ></bbva-data-visualization-area>`}get _chartVerticalBar(){return o`<bbva-data-visualization-vertical-bar
      bars-color="${l(JSON.stringify(this.barsColor))}"
      ?narrow-bar="${this.narrowBar}"
      bar-padding="${l(this.barPadding)}"
      multiple-bar-padding="${l(this.multipleBarPadding)}"
      data="${l(JSON.stringify(this.data))}"
      line-data="${l(JSON.stringify(this.lineData))}"
      ?show-avg-line="${this.showAvgLine}"
      custom-line-value="${l(this.customLineValue)}"
      custom-area-value="${l(this.customAreaValue)}"
      ?show-bars-shadow="${this.showBarsShadow}"
      selected="${l(this.selected)}"
      .selectedItem="${this.selectedItem}"
      margins-chart="${l(JSON.stringify(this.marginsChart))}"
      height="${l(this.height)}"
      ?show-x-axis-domain="${this.showXAxisDomain}"
      ?show-x-axis-tick="${this.showXAxisTick}"
      ?show-x-axis="${this.showXAxis}"
      ?show-y-axis="${this.showYAxis}"
      ?show-y-axis-tick="${this.showYAxisTick}"
      y-axis-format-label="${l(this.yAxisFormatLabel)}"
      y-axis-label="${l(this.yAxisLabel)}"
      y-axis-items="${l(this.yAxisItems)}"
      ?show-range-selector="${this.showRangeSelector}"
      lang="${l(this.langCode)}"
      accessibility-chart-label="${l(this.accessibilityChartLabel)}"
      ?not-focused="${this.notFocused}"
      chart-aria-label="${l(this.chartAriaLabel)}"
    ></bbva-data-visualization-vertical-bar>`}}export{la as B,na as b};
