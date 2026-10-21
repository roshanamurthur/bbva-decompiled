import{z as t,a8 as e,ac as a,ad as i,ar as r,aa as s,a9 as o,aI as n,au as l,b2 as d,aS as c,an as h,a as p,L as u,h as b,aV as g,ak as v,i as m,aw as y,F as k,ag as _,aL as w,ab as f,bl as S,av as $}from"./952f98a9.js";import{d as x,r as C,e as z,a as L,b as R}from"./4d2e5f99.js";import{o as P}from"./68ec5adf.js";import{d as E,a as T,b as A,l as B,q as D,s as I,e as N,c as V,f as M,g as X,h as q}from"./f250a96c.js";const O=new r;var H=t`:host {
  display: inline-block;
  box-sizing: border-box;
  padding: var(--bbva-data-visualization-donut-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 15) * 1em) 0);
  --skeleton-quote-color: var(--bbva-data-visualization-donut-skeleton-dark-mode-color, var(--bbva-data-visualization-donut-skeleton-color, var(--colorsSecondary200, ${e(o.secondary200)})));
  --_bbva-data-visualization-donut-skeleton-animated-layer-bg: var(--bbva-data-visualization-donut-skeleton-dark-mode-animated-layer-bg-color, var(--bbva-data-visualization-donut-skeleton-animated-layer-bg, var(--ambientsLight, ${e(n.light)})));
}

:host([hidden]),
[hidden] {
  display: none;
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

.chart {
  padding: var(--bbva-data-visualization-donut-chart-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 15) * 1em) 0);
}

.shadow {
  filter: var(--bbva-data-visualization-donut-shadow-filter, drop-shadow(0 14px 3px rgba(0, 0, 0, 0.25)));
}

.slice-selected .highlighted {
  opacity: 1 !important;
}

/**
 * Arc's labels
 **/
.label {
  pointer-events: none;
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(i.type3XSmall)});
  margin-top: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  margin-bottom: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

.center {
  display: flex;
  align-items: center;
}

.custom-label {
  justify-content: center;
}

.middle-donut-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: auto;
  position: absolute;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
  color: var(--bbva-data-visualization-donut-middle-content-text-dark-mode-color, var(--bbva-data-visualization-donut-middle-content-text-color, var(--colorsSecondary600, ${e(o.secondary600)})));
}

[data-tag-name=bbva-text] {
  color: var(--bbva-data-visualization-donut-text-dark-mode-color, var(--bbva-data-visualization-donut-text-color, var(--bbva-text-color, initial)));
  width: 8.125rem;
}

[data-tag-name=bbva-icon] {
  margin: 0 auto;
  color: var(--bbva-data-visualization-donut-icon-fill-dark-mode-color, var(--bbva-data-visualization-donut-icon-fill-color, var(--bbva-core-icon-fill-color, var(--colorsSecondary500, ${e(o.secondary500)}))));
}

:host([show-levels]) [data-tag-name=bbva-text] {
  width: 11.25rem;
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  opacity: 1;
  background-color: transparent;
  border-radius: 50%;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  background: var(--_bbva-data-visualization-donut-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][size="2XS"]) {
  height: 2.5rem;
  width: 2.5rem;
  box-shadow: 0 0 0 0.0625rem var(--skeleton-quote-color) inset;
}
:host([loading][size="2XS"]) .skeleton {
  height: 2.5rem;
}

:host([loading][size=S]) {
  height: 3rem;
  width: 3rem;
  box-shadow: 0 0 0 0.125rem var(--skeleton-quote-color) inset;
}
:host([loading][size=S]) .skeleton {
  height: 3rem;
}

:host([loading][size=XL]) {
  height: 6rem;
  width: 6rem;
  box-shadow: 0 0 0 0.5rem var(--skeleton-quote-color) inset;
}
:host([loading][size=XL]) .skeleton {
  height: 6rem;
}

:host([loading][size="3XL"]) {
  height: 10rem;
  width: 10rem;
  box-shadow: 0 0 0 0.5rem var(--skeleton-quote-color) inset;
}
:host([loading][size="3XL"]) .skeleton {
  height: 10rem;
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
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${O.mediaRules()}`;var F=t`[ambient^=light] {
  --bbva-data-visualization-donut-middle-content-text-color: initial;
  --bbva-data-visualization-donut-text-color: initial;
  --bbva-data-visualization-donut-icon-fill-color: initial;
  --bbva-data-visualization-donut-skeleton-color: initial;
  --bbva-data-visualization-donut-skeleton-animated-layer-bg: initial;
}
${(new r).mediaRules()}`;const W=new r;const j={dark:t`
    ${t`[ambient^=dark] {
  --bbva-data-visualization-donut-middle-content-text-color: var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)});
  --bbva-data-visualization-donut-text-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-data-visualization-donut-icon-fill-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-data-visualization-donut-skeleton-color: var(--colorsSecondary200, ${e(o.secondary200)});
  --bbva-data-visualization-donut-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${e(o.primaryCore)});
}

[ambient^=dark400] {
  --bbva-data-visualization-donut-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)});
}
${W.mediaRules()}`}
    ${l.dark}
    ${d.dark}
  `,light:t`
    ${F}
    ${l.light}
    ${d.light}
  `},J={ascending:({value:t},{value:e})=>t-e,descending:({value:t},{value:e})=>e-t},Q={easeLinear:B,easeQuad:D,easeCubic:R,easeSin:I,easeExp:N,easeCircle:V,easeElastic:M,easeBack:X,easeBounce:q},G=["radius","innerRadius","data","showValues","padAngle","padRadius","sort","showLevels","showShadow","easing"];class K extends(c(h(p(u)))){static get is(){return"bbva-data-visualization-donut"}static get scopedElements(){const t=[y,k,_,w];return K.scopedElementsFromClasses(t)}static get properties(){return{data:{type:Array},radius:{type:Number},innerRadius:{type:Number,attribute:"inner-radius"},strokeColor:{type:String,attribute:"stroke-color"},strokeWidth:{type:Number,attribute:"stroke-width"},opacity:{type:Number},easing:{type:String},transitionDuration:{type:Number,attribute:"transition-duration"},selectedSlice:{type:Number,attribute:"selected-slice"},showValues:{type:Boolean,attribute:"show-values"},showLevels:{type:Boolean,attribute:"show-levels"},valueColor:{type:String,attribute:"value-color"},sort:{type:String},padAngle:{type:Number,attribute:"pad-angle"},padRadius:{type:Number,attribute:"pad-radius"},showShadow:{type:Boolean,attribute:"show-shadow"},gap:{type:Number},type:{type:String},amountVariant:{type:String,attribute:"amount-variant"},decimalDigits:{type:Number,attribute:"decimal-digits"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},text:{type:String},size:{type:String},percentageMini:{type:Boolean,attribute:"percentage-mini"},iconName:{type:String,attribute:"icon-name"},loading:{type:Boolean,reflect:!0},clipName:{type:String,attribute:"clip-name"}}}constructor(){super(),this.data=[],this.easing="easeLinear",this.gap=0,this.innerRadius=90,this.opacity=1,this.padAngle=0,this.padRadius=0,this.radius=120,this.showLevels=!1,this.showShadow=!1,this.showValues=!1,this.sort=null,this.strokeColor="transparent",this.strokeWidth=0,this.transitionDuration=400,this.valueColor="darker",this.decimalDigits=0,this.type="",this.text="",this.size="",this.iconName="",this.percentageMini=!1,this._limit=6,this._minRadius=70,this._maxRadius=132,this._minInnerRadius=80,this._maxInnerRadius=120,this._otherLabel="bbva-data-visualization-donut-other",this._onClickOutsideChart=this._onClickOutsideChart.bind(this),this.loading=!1,this.clipName=""}updated(t){t.has("showLevels")&&(this.radius=this.showLevels?this._maxRadius:this._minRadius,this.innerRadius=this.showLevels?this._maxInnerRadius:this._minInnerRadius),t.has("selectedSlice")&&this.dispatchEvent(new CustomEvent("data-visualization-donut-selected-slice-changed",{detail:{value:this.selectedSlice}}));const e=[...t.keys()];G.some((t=>e.includes(t)))&&this._setChart(this._wh,this.innerRadius,this._data,this.showValues,this.padAngle,this.padRadius),t.has("selectedSlice")&&this._selectSlice(this.selectedSlice),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}get _createAccessibleTableRows(){return this.data?this.data.map((t=>b`
              <tr class="sr-only">
                <td class="sr-only">${t.label}</td>
                <td class="sr-only">${t.value}</td>
              </tr>
            `)):g}get _createAccessibleTable(){return this.data?b`
          <table class="accessible-table sr-only">
            ${this._createAccessibleTableRows}
          </table>
        `:g}static get styles(){return[H,v("bbva-data-visualization-donut-shared-styles"),j.dark,j.light]}render(){return b`${this.loading?b`<div class="skeleton"></div>`:b`<div class="center custom-label">
            <div id="chart" class="chart" aria-hidden="true"></div>
            <div class="middle-donut-content">
              ${this._selectRenderType()}
              <bbva-text
                tag="span"
                class="custom-text"
                size="${this.size}"
                alignment="center"
                ellipsis
                text="${this.text}"
              >
              </bbva-text>
            </div>
          </div>
          ${this._createAccessibleTable}`}`}get _withAmount(){return b`
      <bbva-amount
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        decimal-digits=${this.decimalDigits}
        variant=${this.amountVariant}
      >
      </bbva-amount>
    `}get _withIcon(){return b`<bbva-icon icon=${this.iconName} size="24"></bbva-icon>`}get _withText(){return b`
      <bbva-text
        size="S"
        tag="span"
        font-weight="bold"
        alignment="center"
        ellipsis
        text=${m(this.contentTitle)}
      ></bbva-text>
    `}get _withClip(){return this.showLevels?b`
          <bbva-clip-microillustration microillustration="${this.clipName}" size="M">
          </bbva-clip-microillustration>
        `:""}get _data(){return this._sort?[...this.data].sort(J[this._sort]):this.data}get _sort(){return["ascending","descending"].includes(this.sort)?this.sort:null}get _wh(){return 2*this.radius}get _hasSelectedSlice(){return this.selectedSlice||0===this.selectedSlice}get chart(){return this._chart||(this._chart=this.shadowRoot.querySelector("#chart")),this._chart}get svg(){return this._svg||(this._svg=this.shadowRoot.querySelector("svg")),this._svg}_selectRenderType(){switch(this.type){case"amount":case"percentage":return this._checkText(),this._withAmount;case"icon":return this._checkText(),this._withIcon;case"clip":return this._checkText(),this._withClip;default:return this._withText}}_checkText(){this.text||(this._minRadius=this.percentageMini?24:40,this._minInnerRadius=this.percentageMini?28:48,this._limit=4)}_setSelected(t){var e;this.selected=(e=t,JSON.parse(JSON.stringify(e))),this.dispatchEvent(new CustomEvent("data-visualization-donut-selected-changed",{detail:{value:this.selected}}))}_selectSlice(t){this._svg.classed("slice-selected",this._hasSelectedSlice),setTimeout((()=>{this._path.attr("opacity",((e,a)=>a===t?1:.4))}),0),this._setSelected(this._data[t])}updateData(){this._pie.value(((t,e)=>this.data[e].value)),this._path=this._path.data(this._pie),this._animateSections()}_setChart(t,e,a,i,r,s){this._setDataLimit(),this.chart.innerHTML="";const o=P(E);this._pie=T().value((t=>t.value)).sort(null).padAngle(r),this._arc=A().innerRadius(e).outerRadius(this.radius).padRadius(s),this._svg=x(this.chart).append("svg").attr("width",t).attr("height",t).attr("overflow","visible").classed("slice-selected",this._hasSelectedSlice),this._group=this._svg.append("g").attr("transform",`translate(${this.radius}, ${this.radius})`),this._arcs=this._group.datum(a).selectAll("arc").data(this._pie(a)).enter().append("g"),this._path=this._arcs.append("path").attr("d",this._arc).attr("stroke",this.strokeColor).attr("stroke-width",this.strokeWidth).attr("opacity",(t=>t.data.opacity||this.opacity)).attr("fill",(t=>t.data.color||o(t.value))).each((function(t){this.currentData=t})),this._hasSelectedSlice&&this._path.attr("opacity",((t,e)=>e===this.selectedSlice?1:.4)),i&&(this._text=this._arcs.append("text").attr("transform",(t=>`translate(${this._arc.centroid(t)})`)).attr("text-anchor","middle").attr("alignment-baseline","central").attr("class","label").attr("fill",(t=>C(t.data.color||o(t.value))[this.valueColor](2))).text((t=>`${t.value}%`))),this.svg._groups[0][0].classList[this.showShadow?"add":"remove"]("shadow"),this._bindPathEvents(),this.animate()}_setDataLimit(){if(this._data.length>this._limit){this._data.splice(this._limit).forEach((t=>{this._data[this._limit-1].value+=t.value})),this._data[this._limit-1].label=this.t(this._otherLabel)||""}}_bindPathEvents(){this._path.on("click",(t=>this._onPathClick(t))).on("mouseover",(t=>this._onPathMouseover(t))).on("mouseout",(()=>{const t=z.composedPath()[0];x(t).classed("highlighted",!1)}))}animate(){this._path.transition().duration(this.transitionDuration).ease(Q[this.easing]).attrTween("d",(t=>{t.innerRadius=0;const e=L({startAngle:0,endAngle:0},t);return t=>this._arc(e(t))})),this.gap=0!==this.gap?this.gap:this.radius-this.innerRadius;const t=this._path.transition("deploy-tweenPie").ease(Q[this.easing]).duration(this.transitionDuration).attrTween("d",this._tweenPie.bind(this));if(this.showLevels){const e=A();t.transition("rings-tweenArc").ease(Q[this.easing]).duration(2*this.transitionDuration).attrTween("d",((t,a)=>i=>e(L(t,{...t,...this.getDataRadius(a,t)})(i))))}this.showValues&&this._text.data(this._pie).attr("opacity",0).attr("transform",(t=>`translate(${this._arc.centroid(t)})`)).text((t=>`${t.value}%`)).transition().duration(this.transitionDuration).attr("opacity",1)}_animateSections(){const t=this.showLevels?A():this._arc;this._path.transition("desplegar-datachange").duration(this.transitionDuration).attrTween("d",(function(e){const a=L(this.currentData,e);return this.currentData=a(0),e=>t(a(e))})),this.showValues&&this._text.data(this._pie).attr("opacity",0).attr("transform",(t=>`translate(${this._arc.centroid(t)})`)).text((t=>`${t.value}%`)).transition().duration(this.transitionDuration).attr("opacity",1)}_onPathClick(t){z.stopPropagation(),this._onSectionClickOrHover("click",t),this._svg.classed("slice-selected",!0),document.addEventListener("click",this._onClickOutsideChart,!0)}_onPathMouseover(t){this._onSectionClickOrHover("hover",t);const e=z.composedPath()[0];x(e).classed("highlighted",!0)}_onClickOutsideChart(t){t.target.nodeName.toLowerCase()!==this.is&&(document.removeEventListener("click",this._onClickOutsideChart,!0),this._svg.classed("slice-selected",!1))}_onSectionClickOrHover(t,e){this.dispatchEvent(new CustomEvent(`data-visualization-donut-section-${t}`,{bubbles:!0,composed:!0,detail:e.data})),"click"===t?this.selectedSlice=this._data.indexOf(e.data):this._setSelected(e.data)}getDataRadius(t,{innerRadius:e,outerRadius:a}){let i={innerRadius:e,outerRadius:a};return this._data.length%2==0&&t%2!=0&&t%2==0?i={innerRadius:+e-this.gap,outerRadius:+a-this.gap}:0===t?i={innerRadius:+e+this.gap,outerRadius:+a+this.gap}:t%2==0&&(i={innerRadius:+e-this.gap,outerRadius:+a-this.gap}),i}_tweenPie(t){const e=t;e.innerRadius=this.innerRadius,e.outerRadius=this.radius;const a=L({startAngle:0,endAngle:0},e);return t=>this._arc(a(t))}}var U=t`[ambient^=light] {
  --bbva-list-legend-text-color: initial;
  --bbva-list-legend-amount-color: initial;
  --bbva-list-legend-skeleton-color: initial;
  --bbva-list-legend-active-bg-color: initial;
  --bbva-list-legend-link-color: initial;
  --bbva-list-legend-link-active-color: initial;
  --bbva-list-legend-selected-link-color: initial;
  --bbva-list-legend-bar-average-color: initial;
}
${(new r).mediaRules()}`;const Y=new r;var Z=t`[ambient^=dark] {
  --bbva-list-legend-text-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-list-legend-amount-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-list-legend-skeleton-color: var(--colorsPrimaryMedium, ${e(o.primaryMedium)});
  --bbva-list-legend-active-bg-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
  --bbva-list-legend-link-color: var(--colorsPrimarySubdued, ${e(o.primarySubdued)});
  --bbva-list-legend-link-active-color: var(--colorsPrimaryMediumLight, ${e(o.primaryMediumLight)});
  --bbva-list-legend-selected-link-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-list-legend-bar-average-color: var(--colorsSecondary300, ${e(o.secondary300)});
}

[ambient^=dark100] {
  --bbva-list-legend-link-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-list-legend-link-active-color: var(--colorsPrimarySubduedLight, ${e(o.primarySubduedLight)});
  --bbva-list-legend-skeleton-color: var(--colorsPrimarySubdued, ${e(o.primarySubdued)});
}
${Y.mediaRules()}`;const tt={light:t`
    ${l.light}
    ${U}
  `,dark:t`
    ${l.dark}
    ${Z}
  `},et=new r;var at=t`:host {
  --skeleton-quote-color: var(--bbva-list-legend-skeleton-dark-mode-color, var(--bbva-list-legend-skeleton-color, var(--colorsSecondary200, ${e(o.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-legend-skeleton-bg-dark-mode-color, var(--bbva-list-legend-skeleton-bg, transparent));
  --_bar-legend-color: var(--bbva-list-legend-bar-legend-dark-mode-color, var(--bbva-list-legend-bar-legend-color, var(--colorsPrimaryVariant, ${e(o.primaryVariant)})));
  --bbva-text-color: var(--bbva-list-legend-text-dark-mode-color, var(--bbva-list-legend-text-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --bbva-amount-color: var(--bbva-list-legend-amount-dark-mode-color, var(--bbva-list-legend-amount-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_link-color: var(--bbva-list-legend-link-dark-mode-color, var(--bbva-list-legend-link-color, var(--colorsPrimaryMedium, ${e(o.primaryMedium)})));
  --_link-active-color: var(--bbva-list-legend-link-active-dark-mode-color, var(--bbva-list-legend-link-active-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_bar-average-color: var(--bbva-list-legend-bar-average-dark-mode-color, var(--bbva-list-legend-bar-average-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_list-legend-active-bg-color: var(--bbva-list-legend-active-bg-dark-mode-color, var(--bbva-list-legend-active-bg-color, var(--colorsSecondary100, ${e(o.secondary100)})));
  --_list-legend-selected-link-color: var(--bbva-list-legend-selected-link-dark-mode-color, var(--bbva-list-legend-selected-link-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  display: block;
  box-sizing: border-box;
  position: relative;
  user-select: none;
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(f.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(f.book.fontStyle)});
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.bar-legend:not(.bar-average) span {
  width: calc(1rem - 5px);
  height: 0.625rem;
  background-color: var(--_bar-legend-color);
  transform-origin: left bottom;
  transform: skewX(-26deg);
}

:host([bar-average]) .bar-average span {
  content: "";
  height: 0.25rem;
  width: 1rem;
  background: linear-gradient(to right, var(--_bar-average-color) 0.25rem, transparent 50%);
  background-size: 0.375rem;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.content-wrapper {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  display: flex;
  position: relative;
}
.content-wrapper .more-info-wrapper {
  display: flex;
}
.content-wrapper .more-info-wrapper .more-info {
  margin-left: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  flex-basis: 50%;
  overflow: hidden;
}
.content-wrapper .more-info-wrapper .more-info .label {
  padding-right: 0;
  flex: 0 1 auto;
}
.content-wrapper .label-content {
  display: flex;
  justify-content: space-between;
  flex-direction: column;
  overflow: hidden;
}
.content-wrapper .label-content.no-description {
  flex-direction: initial;
}
.content-wrapper.more-info-content {
  flex-direction: column;
}
.content-wrapper.more-info-content .label-content {
  flex-direction: row;
  flex: 1;
}
.content-wrapper:focus {
  outline: none;
}
:host([hide-padding-top]) .content-wrapper {
  padding-top: 0;
}
:host([hide-padding-bottom]) .content-wrapper {
  padding-bottom: 0;
}
.content-wrapper .label-wrapper {
  display: flex;
  flex: 1;
  overflow: hidden;
}
.content-wrapper .link {
  color: var(--_link-color);
}
.content-wrapper .link,
.content-wrapper .label {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}
.content-wrapper.link-wrapper {
  text-align: left;
}
.content-wrapper.link-wrapper.selected .link {
  color: var(--_list-legend-selected-link-color);
}
.content-wrapper.link-wrapper:active {
  background-color: var(--_list-legend-active-bg-color);
}
.content-wrapper.link-wrapper:active .link {
  color: var(--_link-active-color);
}
.content-wrapper .amount {
  display: block;
}
.content-wrapper .description {
  flex: 1;
  overflow: hidden;
  margin-left: auto;
}

:host(:not([two-columns])) .label-content.no-description {
  flex: 1 1 0%;
}

:host([disabled]) {
  cursor: default;
  pointer-events: none;
  user-select: none;
}
:host([disabled]) .content-wrapper {
  opacity: 0.4;
}

:host([two-columns]) {
  display: flex;
  flex-direction: column;
  flex: 1;
}
:host([two-columns]) .link,
:host([two-columns]) .label {
  padding-right: 0;
}

.link-wrapper {
  text-align: left;
}
.link-wrapper.selected {
  --bbva-list-legend-link-color: var(--bbva-list-legend-selected-link-color, var(--colorsSecondary600, ${e(o.secondary600)}));
}

.bar-legend,
.bar-average {
  display: flex;
  align-items: center;
  flex: none;
  height: 1.5rem;
  width: 1rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  height: 3.5rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((50% * 2) + (16px/ 2)) 16px, calc((25% * 2) + (16px/ 2)) 16px;
  background-position: 16px 20px, 40px 20px, calc(100% - 16px) 20px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
${et.mediaRules()}`;class it extends(c(p(u))){static get is(){return"bbva-list-legend"}static get scopedElements(){const t=[y,_];return it.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},description:{type:String},moreInfo:{type:String,attribute:"more-info"},labelLink:{type:Boolean,attribute:"label-link"},linkSelected:{type:Boolean,attribute:"link-selected",reflect:!0},disabled:{type:Boolean,reflect:!0},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},twoColumns:{type:Boolean,attribute:"two-columns",reflect:!0},barLegendColor:{type:String,attribute:"bar-legend-color"},loading:{type:Boolean,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},moreInfoEllipsis:{type:Boolean,attribute:"more-info-ellipsis"},barAverage:{type:Boolean,attribute:"bar-average"},amountSize:{type:String,attribute:"amount-size"},discreetMode:{type:Boolean,attribute:"discreet-mode"}}}constructor(){super(),this.label="",this.labelLink=!1,this.labelEllipsis=!1,this.description="",this.descriptionEllipsis=!1,this.moreInfo="",this.moreInfoEllipsis=!1,this.decimalsHidden=!1,this.twoColumns=!1,this.loading=!1,this.linkSelected=!1,this.disabled=!1,this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.barAverage=!1,this.amountSize="xl",this.discreetMode=!1}static get styles(){return[at,tt.light,tt.dark,v("bbva-list-legend-shared-styles")]}_amount(){return b`
      <bbva-amount
        ?mask="${this.discreetMode}"
        ?decimals-hidden="${this.decimalsHidden}"
        class="amount"
        variant="${this.amountSize}"
        amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}_text(t,e,a,i){return b`
      <bbva-text
        class="${t}"
        ?ellipsis="${i}"
        lines="1"
        unset
        size="S"
        style="${m("link"!==t&&!this.linkSelected||"description"===t||"more-info"===t?void 0:S({fontWeight:500}))}"
        .fontWeight="${"link"!==t&&!this.linkSelected||"description"===t||"more-info"===t?void 0:"500"}"
        alignment="${e||"left"}"
        text="${a}"
      >
      </bbva-text>
    `}get textContent(){let t=null;return!this.description||this.moreInfo||this.twoColumns?!this.moreInfo||this.description||this.twoColumns||(t=b`
        <div class="more-info-wrapper">
          ${this._text("more-info","left",this.moreInfo,this.moreInfoEllipsis)}
        </div>
      `):t=this._text("description","right",this.description,this.descriptionEllipsis),t}render(){return b`
      <div
        class="content-wrapper
          ${this.moreInfo&&!this.twoColumns?"more-info-content":""}
          ${this.labelLink&&!this.linkSelected?"link-wrapper":""}"
        aria-disabled="${m(this.labelLink&&this.disabled?"true":void 0)}"
        role="${m(this.labelLink&&!this.linkSelected?"button":void 0)}"
        tabindex="${m(!this.labelLink||this.disabled||this.linkSelected?void 0:"0")}"
        @click="${this.disabled||!this.labelLink||this.linkSelected?null:this._linkClick}"
        @keydown=${t=>13!==t.keyCode||this.disabled||!this.labelLink||this.linkSelected?null:this._linkClick}
      >
        <div class="label-wrapper">
          <span class="${$({"bar-legend":!0,"bar-average":this.barAverage})}">
            <span
              style=${m(this.barLegendColor&&`background-color:${this.barLegendColor}`)}
            ></span>
          </span>
          <div
            class="label-content
            ${this.description||this.moreInfo||this.twoColumns?"":"no-description"}"
          >
            ${this.labelLink&&!this.linkSelected?this._text("link","",this.label,this.labelEllipsis):this._text("label","",this.label,this.labelEllipsis)}
            ${"number"==typeof this.amount?this._amount(this):""}
          </div>
        </div>
        ${this.textContent}
      </div>
    `}_linkClick(){this.dispatchEvent(new CustomEvent("list-legend-link-click",{detail:!0,bubbles:!0,composed:!0}))}}export{K as B,it as a,j as b,tt as c};
