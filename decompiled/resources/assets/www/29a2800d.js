import{z as t,ar as e,a8 as a,a9 as i,b1 as r,a as o,an as n,aJ as l,L as s,ag as c,ak as d,h as b,aV as h,f as g,g as v,b0 as p,b_ as u,au as y,bd as m,aa as $,ab as k,ac as x,ad as f,aI as S,aS as _,bj as T,aw as w,b$ as C,b6 as L,S as z,F as V,aD as E,i as I,av as q,j as A,c0 as H,o as D,r as P,dK as F,cG as B,cS as M,bc as R,al as N,cL as X,bf as W,bh as j,ae as Z,bU as O,cN as U,bF as G,aW as J,ah as K}from"./952f98a9.js";var Q=t`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new e).mediaRules()}`;const Y=new e;var tt=t`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${a(i.primaryCoreDark)});
}
${Y.mediaRules()}`;const et={dark:t`
    ${r.dark}
    ${tt}
  `,light:t`
    ${r.light}
    ${Q}
  `},at=new e;var it=t`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --skeleton-quote-bg: var(--bbva-date-dark-mode-skeleton-bg, var(--bbva-date-skeleton-bg, transparent));
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

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-block;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((50px * 2) + (15px/ 2)) 15px;
  background-position: 0 0;
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
.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  white-space: nowrap;
}
${at.mediaRules()}`;class rt extends(o(n(l(s)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":c}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,it,d("bbva-date-shared-styles"),et.light,et.dark]}updated(t){var e,a;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(a=this.dateRange)||void 0===a?void 0:a.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,a=e.day||e.month||e.year;return e.hour&&e.minute&&!a?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),a=new Date(t[1]),i={...this.options};return i.month="long",[e,a].map(((t,e)=>t.toLocaleDateString(this.locale,i).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&b` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||h}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&b`
          <bbva-text
            unset
            text="${this._fromToDateFormat(this.dateRange)}"
            font-weight="500"
            font-style="italic"
            size="S"
            aria-hidden="true"
          >
          </bbva-text>
          <span data-id="sr-only" class="sr-only"
            >${this._fromToDateFormatA11y(this.dateRange)}</span
          >
        `||h}render(){return b` ${this._tplDate} ${this._tplDateRange} `}}var ot={...g,bbvaDate:`\n        --bbva-date-dark-mode-color: ${v("colors.primaryCoreLightened")};\n        --bbva-date-dark-mode-skeleton-quote-color: ${v("colors.cool50")};\n    `};var nt=t`[ambient^=light] {
  --bbva-header-category-color: initial;
  --bbva-header-category-help-color: initial;
  --bbva-header-category-skeleton-color: initial;
  --bbva-header-category-heading-color: initial;
  --bbva-header-category-amount-date-color: initial;
  --bbva-header-category-amount-color: initial;
  --bbva-header-category-skeleton-animated-layer-bg: initial;
  --bbva-header-category-card-title-color: initial;
  --bbva-header-category-action-icon-color: initial;
}
${(new e).mediaRules()}`;const lt=new e;var st=t`[ambient^=dark] {
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-header-category-skeleton-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-header-category-amount-date-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-header-category-amount-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-header-category-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${a(i.primaryCoreDarkened)});
  --bbva-header-category-card-title-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-header-category-help-color: var(--colorsPrimarySubdued, ${a(i.primarySubdued)});
  --bbva-header-category-action-icon-color: var(--colorsPrimarySubdued, ${a(i.primarySubdued)});
}
${lt.mediaRules()}`;const ct={dark:t`
    ${p.dark}
    ${u.dark}
    ${y.dark}
    ${m.dark}
    ${r.dark}
    ${st}
  `,light:t`
    ${p.light}
    ${u.light}
    ${y.light}
    ${m.light}
    ${r.light}
    ${nt}
  `},dt=new e;var bt=t`:host {
  display: flex;
  box-sizing: border-box;
  background-color: var(--bbva-header-category-bg-color, none);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em);
  position: relative;
  flex-wrap: wrap;
  color: var(--bbva-header-category-dark-mode-color, var(--bbva-header-category-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  font-weight: var(--bbva-header-category-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(k.medium.fontWeight)}));
  font-style: var(--bbva-header-category-font-style, var(--fontFacePrimaryMediumFontStyle, ${a(k.medium.fontStyle)}));
  font-size: var(--bbva-header-category-font-size, var(--typographyTypeSmall, ${a(x.typeSmall)}));
  line-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${a(f.typeSmall)}));
  --_header-category-heading-color: var(--bbva-header-category-heading-dark-mode-color, var(--bbva-header-category-heading-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_header-category-amount-color: var(--bbva-header-category-amount-dark-mode-color, var(--bbva-header-category-amount-color, var(--colorsSecondary500, ${a(i.secondary500)})));
  --_header-category-amount-date-color: var(--bbva-header-category-amount-date-dark-mode-color, var(--bbva-header-category-amount-date-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_header-category-help-color: var(--bbva-header-category-help-dark-mode-color, var(--bbva-header-category-help-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)})));
  --_header-category-card-title-color: var(--bbva-header-category-card-title-color, var(--colorsSecondary500, ${a(i.secondary500)}));
  --_header-category-action-bg-color: var(--bbva-header-category-action-bg-color, var(--colorsSecondary100, ${a(i.secondary100)}));
  --_header-category-action-heading-color: var(--bbva-header-category-action-heading-color, var(--colorsSecondary600, ${a(i.secondary600)}));
  --_header-category-action-amount-color: var(--bbva-header-category-action-amount-color, var(--colorsSecondary500, ${a(i.secondary500)}));
  --_header-category-action-icon-color: var(--bbva-header-category-action-icon-dark-mode-color, var(--bbva-header-category-action-icon-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)})));
  --_header-category-action-help-color: var(--bbva-header-category-action-help-dark-mode-color, var(--bbva-header-category-action-help-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)})));
  --_header-category-link-max-width: var(--bbva-header-category-link-max-width, 50%);
  /* Skeleton */
  --_skeleton-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --skeleton-quote-color: var(--bbva-header-category-skeleton-dark-mode-color, var(--bbva-header-category-skeleton-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --skeleton-quote-bg: var(--bbva-header-category-skeleton-dark-mode-bg-color, var(--bbva-header-category-skeleton-bg, transparent));
  --_bbva-header-category-skeleton-animated-layer-bg: var(--bbva-header-category-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-header-category-skeleton-animated-layer-bg, var(--ambientsLight, ${a(S.light)})));
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

[data-tag-name=bbva-core-heading] {
  color: var(--_header-category-heading-color);
}

[data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(k.medium.fontWeight)}));
  color: var(--_header-category-amount-color);
}
:host([variant=date]) [data-tag-name=bbva-amount] {
  font-weight: var(--bbva-header-category-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${a(k.book.fontWeight)}));
  color: var(--_header-category-amount-date-color);
}

.header-category {
  display: flex;
  position: relative;
  width: 100%;
  justify-content: space-between;
}

.title-container {
  display: flex;
  flex: 1 1 auto;
  overflow: hidden;
  opacity: 1;
}
.title-container [data-tag-name=bbva-core-heading],
.title-container [data-tag-name=bbva-date] {
  overflow: hidden;
  flex: 0 1 auto;
}
.title-container [data-tag-name=bbva-core-heading] {
  text-transform: uppercase;
}
.title-container .link {
  fill: var(--_header-category-help-color);
  color: var(--_header-category-help-color);
  flex: 0 0 auto;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

.options-right {
  align-items: baseline;
  opacity: 1;
  max-height: var(--bbva-header-category-line-height, var(--lineHeightTypeSmall, ${a(f.typeSmall)}));
  flex-wrap: nowrap;
  flex: 0 1 auto;
  justify-content: flex-end;
  display: flex;
  max-width: var(--_header-category-link-max-width);
}
.options-right .link {
  display: flex;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}
.options-right .icon {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  color: var(--_header-category-action-icon-color);
  fill: var(--_header-category-action-icon-color);
}
.options-right [data-tag-name=bbva-badge-notification] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(.fixed) {
  height: var(--bbva-header-category-height, 3.5rem);
  align-items: center;
}

:host([variant=product]) {
  max-height: 2rem;
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${a(x.typeXSmall)}));
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 14) * 1em) 0;
}
:host([variant=product]) .link {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}
:host([variant=product]) [data-tag-name=bbva-text] {
  color: var(--_header-category-amount-color);
}
:host([variant=product]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-amount-color);
}

:host([variant=date]) {
  min-height: 1.5rem;
  line-height: normal;
  overflow: hidden;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em);
}
:host([variant=date]) [data-tag-name=bbva-core-heading] {
  text-transform: initial;
  font-style: var(--bbva-header-category-date-font-style, var(--fontFacePrimaryMediumItalicFontStyle, ${a(k.mediumItalic.fontStyle)}));
  font-weight: var(--bbva-header-category-date-font-weight, var(--fontFacePrimaryMediumItalicFontWeight, ${a(k.mediumItalic.fontWeight)}));
}

:host([variant=action]) {
  background-color: var(--_header-category-action-bg-color);
}
:host([variant=action]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-action-heading-color);
}
:host([variant=action]) [data-tag-name=bbva-amount] {
  color: var(--_header-category-action-amount-color);
}
:host([variant=action]) .header .link {
  color: var(--_header-category-action-help-color);
}
:host([variant=action])::after {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  display: flex;
  flex-flow: column wrap;
  background-repeat: no-repeat;
  opacity: 1;
  height: 2.5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((160px * 2) + (18px/ 2)) 18px, calc((80px * 2) + (18px/ 2)) 18px;
  background-position: 16px 12px, calc(100% - 16px) 12px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 2.5rem;
  background: var(--_bbva-header-category-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

:host([loading][variant=product]) {
  height: 2rem;
}

:host([loading][variant=longamount]) {
  height: 4.375rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((160px * 2) + (18px/ 2)) 18px, calc((80px * 2) + (18px/ 2)) 18px, calc((128px * 2) + (18px/ 2)) 18px;
  background-position: 16px 12px, calc(100% - 16px) 12px, 16px 40px;
}
:host([loading][variant=longamount]) .skeleton {
  height: 4.375rem;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.badge-variability {
  display: flex;
}
.badge-variability [data-tag-name=bbva-badge-variability] {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em);
}

:host([variant=card]),
:host([variant=longamount]) {
  align-items: flex-end;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 14) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 14) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 14) * 1em);
  font-size: var(--bbva-header-category-card-font-size, var(--typographyTypeXSmall, ${a(x.typeXSmall)}));
  line-height: var(--bbva-header-category-card-line-height, var(--lineHeightTypeSmall, ${a(f.typeSmall)}));
  font-weight: var(--bbva-header-category-card-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(k.medium.fontWeight)}));
  font-style: var(--bbva-header-category-card-font-style, var(--fontFacePrimaryMediumFontStyle, ${a(k.medium.fontStyle)}));
}
:host([variant=card]) [data-tag-name=bbva-core-heading],
:host([variant=longamount]) [data-tag-name=bbva-core-heading] {
  overflow: hidden;
  color: var(--_header-category-card-title-color);
}
:host([variant=card]) .secondary-header,
:host([variant=longamount]) .secondary-header {
  width: 100%;
}

:host([amount][variant=product]) [data-tag-name=bbva-core-heading] {
  color: var(--_header-category-amount-color);
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
${dt.mediaRules()}`;class ht extends(o(_(n(l(s))))){static get is(){return"bbva-header-category"}static get scopedElements(){return{"bbva-core-heading":T,"bbva-amount":w,"bbva-badge-notification":C,"bbva-link":L,"bbva-badge-variability":z,"bbva-icon":V,"bbva-date":rt,"bbva-text":c}}static get properties(){return{accessibilityTextHelp:{type:String,attribute:"accessibility-text-help"},headingLevel:{type:Number,attribute:"heading-level"},text:{type:String},accessibleText:{type:String,attribute:"accessible-text"},optionText:{type:String,attribute:"option-text"},optionLink:{type:String,attribute:"option-link"},linkHref:{type:String,attribute:"link-href"},optionIcon:{type:String,attribute:"option-icon"},hrefIcon:{type:String,attribute:"href-icon"},optionIconAccesibilityText:{type:String,attribute:"option-icon-accesibility-text"},optionIconAccessibilityText:{type:String,attribute:"option-icon-accessibility-text"},iconHelp:{type:String,attribute:"icon-help"},iconHelpSize:{type:String,attribute:"icon-help-size"},hasHelp:{type:Boolean,attribute:"has-help"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},notificationType:{type:String,attribute:"notification-type"},notificationAccessibilityText:{type:String,attribute:"notification-accessibility-text"},iconAccessibilityText:{type:String,attribute:"icon-accessibility-text"},notifications:{type:Number},loading:{type:Boolean,reflect:!0},variant:{type:String,reflect:!0},notificationsVariant:{type:String,reflect:!0,attribute:"notifications-variant"},linkAccesibilityText:{type:String,attribute:"link-accesibility-text"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"},status:{type:String},color:{type:String},showValueZero:{type:Boolean,attribute:"show-value-zero"},date:{type:String},dateRange:{type:Array,attribute:"date-range"},options:{type:Object},locale:{type:String},enableInteractivity:{type:Boolean,attribute:"enable-interactivity"},hasLinkEllipsis:{type:Boolean,attribute:"has-link-ellipsis"},discreetMode:{type:Boolean,attribute:"discreet-mode"}}}constructor(){super(),this.loading=!1,this.accessibilityTextHelp="bbva-header-category-accessibility-text-help",this.iconAccessibilityText="bbva-header-category-icon-accessibility-text",this.headingLevel=3,this.iconHelp=E(),this.iconHelpSize=24,this.hasHelp=!1,this.color="",this.showValueZero=!1,this.date="",this.options={day:"2-digit",month:"long",year:"numeric"},this.enableInteractivity=!1,this.hasLinkEllipsis=!1,this.discreetMode=!1}_amountText(){return b`
      ${this.status&&"date"===this.variant?b`
            <bbva-badge-variability
              disabled-tabindex
              .status=${this.status}
              .color=${this.color}
            ></bbva-badge-variability>
          `:""}
      <bbva-amount
        ?mask="${this.discreetMode}"
        ?hidden="${!this.amount&&!this.showValueZero}"
        .amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
        variant="${"date"===this.variant?"xl":"s"}"
      ></bbva-amount>
    `}get _showLink(){return!(this.notifications||this.optionLink||this.optionIcon)}static get styles(){return[super.styles,d("bbva-global-dividers-shared-styles"),bt,d("bbva-header-category-shared-styles"),ct.dark,ct.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback()}updated(t){super.updated(t),t.has("loading")&&(this.loading?this.setAttribute("tabindex","-1"):this.removeAttribute("tabindex")),t.has("disabled")&&this.disabled&&this.setAttribute("tabindex","-1"),t.has("optionIconAccesibilityText")&&(this.optionIconAccessibilityText=this.optionIconAccesibilityText),t.has("linkAccesibilityText")&&(this.linkAccessibilityText=this.linkAccesibilityText)}get _ambient(){return"action"===this.variant?"light":void 0}get _renderTitle(){return this.date||this.dateRange?b`
        <bbva-core-heading level="${this.headingLevel}">
          <bbva-date
            date="${this.date}"
            .dateRange="${this.dateRange}"
            .locale="${this.locale}"
            .options="${this.options}"
          ></bbva-date>
        </bbva-core-heading>
      `:b`
      <bbva-core-heading level="${this.headingLevel}">
        ${this.accessibleText?this._renderCoreHeadingAccessibleText:this._renderCoreHeadingText}
      </bbva-core-heading>
      <bbva-icon
        @click="${this._helpClickHandler}"
        class="link"
        ?hidden="${!this.hasHelp}"
        role="button"
        aria-label="${this.t(this.accessibilityTextHelp)}"
        icon=${this.iconHelp}
        size=${this.iconHelpSize}
      ></bbva-icon>
    `}get _renderCoreHeadingText(){return b`
      <bbva-text
        ellipsis
        lines="${"card"===this.variant||"longamount"===this.variant||"product"===this.variant?"1":"2"}"
        ?enable-interactivity="${this.enableInteractivity}"
        tag="span"
        size="${"product"===this.variant?"XS":"S"}"
        font-weight="500"
        font-style="${I("date"===this.variant?"italic":"")}"
        text="${this.text}"
      ></bbva-text>
    `}get _renderCoreHeadingAccessibleText(){return b` <span aria-hidden="true">${this.t(this.text)}</span>
      <span class="sr-only">${this.accessibleText}</span>`}get _renderBadgeNotifications(){return this.notifications?b` <bbva-badge-notification
          class="${I(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>`:""}get _renderRightOptions(){const t="default"===this.variant||"product"===this.variant;return!this.amount||!this.optionLink||t||"card"!==this.variant&&"longamount"!==this.variant?!this.amount&&!this.showValueZero||t||this.optionLink&&("card"===this.variant||"longamount"===this.variant)?this.amount||t||!this.notifications?this.amount||this.notifications||t||!this.optionLink&&!this.optionIcon?"default"===this.variant?b`
        ${this.optionLink?b`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${I(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${I(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?b`
              <bbva-text
                ?enable-interactivity="${this.enableInteractivity}"
                tag="span"
                size="S"
                text="${this.optionText}"
              ></bbva-text>
            `:""}
        ${this.amount?b`
              <bbva-amount
                ?mask="${this.discreetMode}"
                ?hidden="${!this.amount&&!this.showValueZero}"
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
                variant="${"date"===this.variant?"xl":"s"}"
              ></bbva-amount>
            `:""}
        ${this.notifications?b`
              <bbva-badge-notification
                class="${I(this.notificationType)}"
                ?hidden="${!this.notifications}"
                .accessibilityText="${this.notificationAccessibilityText}"
                .text="${this.notifications}"
                variant="alert"
              ></bbva-badge-notification>
            `:""}
        ${this.optionIcon?b`
              <bbva-link
                icon=${this.optionIcon}
                icon-size=${this.iconHelpSize}
                class="icon"
                href=${I(this.hrefIcon)}
                ?hidden="${!this.optionIcon}"
                aria-label="${this.t(this.iconAccessibilityText)}"
              >
              </bbva-link>
            `:""}
      `:"product"===this.variant?b`
        ${this.amount?b`
              <bbva-amount
                ?mask="${this.discreetMode}"
                ?hidden="${!this.amount&&!this.showValueZero}"
                .amount="${this.amount}"
                .currencyCode="${this.currencyCode}"
                .localCurrency="${this.localCurrency}"
                .language="${this.language}"
                variant="${"date"===this.variant?"xl":"s"}"
              ></bbva-amount>
            `:""}
        ${this.optionLink?b`
              <bbva-link
                class="link"
                @click="${this._linkClickHandler}"
                href="${I(this.linkHref)}"
                ?hidden="${this._showLink}"
                aria-label="${I(this.linkAccessibilityText)}"
                role="link"
                ?ellipsis="${this.hasLinkEllipsis}"
              >
                <span>${this.t(this.optionLink)}</span>
              </bbva-link>
            `:""}
        ${this.optionText?b` <bbva-text size="XS" tag="span" text="${this.optionText}"></bbva-text> `:""}
      `:h:b`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${I(this.linkHref)}"
          ?hidden="${this._showLink}"
          aria-label="${I(this.linkAccessibilityText)}"
          role="link"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          ${this.optionLink?b` <span>${this.t(this.optionLink)}</span> `:b` <span class="sr-only">${this.optionIconAccessibilityText}</span>
                <bbva-link
                  icon=${this.optionIcon}
                  icon-size=${this.iconHelpSize}
                  class="icon"
                  href=${I(this.hrefIcon)}
                  ?hidden="${!this.optionIcon}"
                  aria-label="${this.t(this.iconAccessibilityText)}"
                >
                </bbva-link>`}
        </bbva-link>
      `:b`
        <bbva-badge-notification
          class="${I(this.notificationType)}"
          ?hidden="${!this.notifications}"
          .accessibilityText="${this.notificationAccessibilityText}"
          .text="${this.notifications}"
          variant="alert"
        ></bbva-badge-notification>
      `:b` ${this._amountText()} `:b`
        <bbva-link
          class="link"
          @click="${this._linkClickHandler}"
          href="${I(this.linkHref)}"
          ?hidden="${this._showLink}"
          role="link"
          aria-label="${I(this.linkAccessibilityText)}"
          ?ellipsis="${this.hasLinkEllipsis}"
        >
          <span>${this.t(this.optionLink)}</span>
          ${this._renderBadgeNotifications}
          <bbva-link
            icon=${this.optionIcon}
            icon-size=${this.iconHelpSize}
            class="icon"
            href=${I(this.hrefIcon)}
            ?hidden="${!this.optionIcon}"
            aria-label="${this.t(this.iconAccessibilityText)}"
          >
          </bbva-link>
        </bbva-link>
      `}render(){return b`
      ${this.loading?b`<div class="skeleton"></div>`:b` <div class="header-category" ambient="${I(this._ambient)}">
              <div class="title-container">${this._renderTitle}</div>
              <div
                class="options-right ${q({"badge-variability":"date"===this.variant})}"
              >
                ${this._renderRightOptions}
              </div>
            </div>
            ${!this.amount&&!this.showValueZero||!this.optionLink||"card"!==this.variant&&"longamount"!==this.variant?"":b` <div class="secondary-right">${this._amountText()}</div>`}`}
    `}_helpClickHandler(t){t.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-help-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClickHandler(t){t.preventDefault(),this.dispatchEvent(new CustomEvent("header-category-link-click",{detail:!0,bubbles:!0,composed:!0}))}}var gt={...A,...H,...D,...P,...g,...ot,bbvaHeaderCategory:`\n    --bbva-header-category-dark-mode-color: ${v("colors.primaryCoreLightened")};\n    --bbva-header-category-heading-dark-mode-color: ${v("colors.primaryCoreLightened")};\n    --bbva-header-category-help-dark-mode-color: ${v("colors.primarySubdued")};\n    --bbva-header-category-amount-dark-mode-color: ${v("colors.cool20")};\n    --bbva-header-category-amount-date-dark-mode-color: ${v("colors.primaryCoreLightened")};\n    --bbva-header-category-skeleton-dark-mode-color: ${v("colors.cool50")};\n    --bbva-header-category-dark-mode-skeleton-animated-layer-bg-color: ${v("colors.cool90")};\n    --bbva-header-category-action-icon-dark-mode-color:${v("colors.primarySubdued")};\n    --bbva-header-category-action-help-dark-mode-color:${v("colors.primarySubdued")};\n  `};const vt=new e;var pt=t`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1em);
  color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  font-size: var(--typographyTypeSmall, ${a(x.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${a(f.typeSmall)});
  --_list-bullet-icon-color: var(--bbva-list-bullet-icon-dark-mode-color, var(--bbva-list-bullet-icon-color, var(--colorsPrimaryMedium, ${a(i.primaryMedium)})));
  --_list-bullet-skeleton-quote-color: var(--bbva-list-bullet-quote-dark-mode-color, var(--bbva-list-bullet-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --_list-bullet-skeleton-quote-bg: var(--bbva-list-bullet-quote-bg-dark-mode-color, var(--bbva-list-bullet-quote-bg, transparent));
  --_list-bullet-skeleton-animated-layer-bg: var(--bbva-list-bullet-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-list-bullet-skeleton-animated-layer-bg, var(--ambientsLight, ${a(S.light)})));
  --_bbva-list-bullet-dark-mode-color: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_bbva-list-bullet-dark-mode-color-soft-highlight: var(--bbva-list-bullet-dark-mode-color, var(--bbva-list-bullet-color, var(--colorsSecondary500, ${a(i.secondary500)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text] {
  color: var(--_bbva-list-bullet-dark-mode-color);
  --bbva-text-highlight-color: var(--bbva-list-bullet-color, token("foundations.colors.secondary600"));
}

:host([soft-highlight]) [data-tag-name=bbva-text] {
  color: var(--_bbva-list-bullet-dark-mode-color-soft-highlight);
  --bbva-text-highlight-color: var(--bbva-list-bullet-color, token("foundations.colors.secondary500"));
}

[data-tag-name=bbva-icon] {
  color: var(--_list-bullet-icon-color);
  margin-top: calc(((0.375 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  flex-shrink: 0;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 2rem;
  background-image: linear-gradient(var(--_list-bullet-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-bullet-skeleton-quote-color) 50%);
  background-color: var(--_list-bullet-skeleton-quote-bg);
  background-size: 16px 16px, calc((50% * 2) + (16px/ 2)) 16px;
  background-position: 16px 8px, 40px 8px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  inset: 0.5rem 0.9375rem;
  height: 1rem;
  background: var(--_list-bullet-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
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
${vt.mediaRules()}`;var ut=t`[ambient^=light] {
  --bbva-list-bullet-color: initial;
  --bbva-list-bullet-icon-color: initial;
  --bbva-list-bullet-quote-color: initial;
  --bbva-list-bullet-quote-bg: initial;
  --bbva-list-bullet-skeleton-animated-layer-bg: initial;
}
${(new e).mediaRules()}`;const yt=new e;const mt={light:t`
    ${ut}
  `,dark:t`
    ${t`[ambient^=dark] {
  --bbva-list-bullet-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-list-bullet-icon-color: var(--colorsPrimaryVariant, ${a(i.primaryVariant)});
  --bbva-list-bullet-quote-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
  --bbva-list-bullet-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${a(i.primaryCore)});
}
${yt.mediaRules()}`}
  `};class $t extends(o(l(s))){static get is(){return"bbva-list-bullet"}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},softHighlight:{type:Boolean,reflect:!0,attribute:"soft-highlight"}}}static get scopedElements(){return{"bbva-icon":V,"bbva-text":c}}constructor(){super(),this.icon=F(),this.iconSize=16,this.text="",this.loading=!1}static get styles(){return[super.styles,pt,mt.light,mt.dark,d("bbva-list-bullet-shared-styles")]}render(){return b`${this.loading?b` <div class="skeleton"></div> `:b`
          <bbva-icon .icon=${this.icon} .size=${this.iconSize}></bbva-icon>
          <slot>
            <bbva-text .text=${this.text} unset size="S"></bbva-text>
          </slot>
        `}`}}var kt={...g,...B,bbvaListBullet:`\n    --bbva-list-bullet-dark-mode-color: ${v("colors.primaryCoreLightened")};\n    --bbva-list-bullet-icon-dark-mode-color: ${v("colors.primaryVariantLight")};\n    --bbva-list-bullet-quote-dark-mode-color: ${v("colors.cool50")};\n    --bbva-list-bullet-quote-bg-dark-mode-color: transparent;\n    --bbva-list-bullet-dark-mode-skeleton-animated-layer-bg-color:${v("colors.cool90")};\n  `},xt=t`
[ambient^=dark] {
  --bbva-card-banner-skeleton-quote-color: var(--colorsPrimaryMedium, ${a(i.primaryMedium)});
  --bbva-card-banner-skeleton-quote-bg: var(--colorsPrimaryCore, ${a(i.primaryCore)});
  --bbva-card-banner-title-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-card-banner-description-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
  --bbva-card-banner-account-number-color: var(--colorsPrimaryCoreLightened, ${a(i.primaryCoreLightened)});
}
`,ft=t`
[ambient^=light] {
  --bbva-card-banner-skeleton-quote-color: initial;
  --bbva-card-banner-skeleton-quote-bg: initial;
  --bbva-card-banner-title-color: initial;
  --bbva-card-banner-description-color: initial;
  --bbva-card-banner-account-number-color: initial;
}
`;const St={dark:t`
    ${p.dark}
    ${M.dark}
    ${R.dark}
    ${N.dark}
    ${y.dark}
    ${ct.dark}
    ${mt.dark}
    ${X.dark}
    ${xt}
  `,light:t`
    ${p.light}
    ${M.light}
    ${R.light}
    ${N.light}
    ${y.light}
    ${ct.light}
    ${mt.light}
    ${X.light}
    ${ft}
  `};var _t=t`
:host {
  position: relative;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  outline: 0;
  display: block;
  text-align: center;
  border-radius: 1px;
  box-shadow: var(--boxShadowType1, ${a(W.type1)});
  overflow: hidden;
  --_card-banner-title-color: var(--bbva-card-banner-title-dark-mode-color, var(--bbva-card-banner-title-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_card-banner-description-color: var(--bbva-card-banner-description-dark-mode-color, var(--bbva-card-banner-description-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_card-banner-account-number-color: var(--bbva-card-banner-account-number-dark-mode-color, var(--bbva-card-banner-account-number-color, var(--colorsSecondary600, ${a(i.secondary600)})));
  --_card-banner-skeleton-quote-color: var(--bbva-card-banner-skeleton-quote-dark-mode-color, var(--bbva-card-banner-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})));
  --_card-banner-skeleton-quote-bg: var(--bbva-card-banner-skeleton-quote-bg-dark-mode-color, var(--bbva-card-banner-skeleton-quote-bg, transparent)), ;
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

[data-tag-name=bbva-header-category] {
  padding: 0;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  box-sizing: border-box;
}

[data-tag-name=bbva-badge-category] {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem) 0;
}

.content {
  display: flex;
  align-items: center;
  flex-direction: column;
}

.image, .content-image {
  height: var(--bbva-card-banner-image-size, 5rem);
  width: var(--bbva-card-banner-image-size, 5rem);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}
.image.larger-clip-entity, .content-image.larger-clip-entity {
  --bbva-card-banner-image-size: rem(48px);
}

[data-tag-name=bbva-badge-default] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-amount],
.account,
.description {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  width: 100%;
}
[data-tag-name=bbva-text].title {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(k.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(k.medium.fontWeight)});
  color: var(--_card-banner-title-color);
}
[data-tag-name=bbva-text].description {
  color: var(--_card-banner-description-color);
}

.account {
  display: flex;
}
.account [data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  flex: none;
}
.account [data-tag-name=bbva-text] {
  color: var(--_card-banner-account-number-color);
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
  width: 100%;
  text-align: left;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-button-default] {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
  padding: 0;
}

[data-tag-name=bbva-link] {
  display: flex;
  width: max-content;
  width: -webkit-max-content;
  margin: 0 auto;
}
[data-tag-name=bbva-link].top-spacer {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-list-bullet] {
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a($.spacer)}))) / 15) * 1em) 0;
}

:host([variant=full-width]) {
  border-radius: 0;
  box-shadow: none;
}

:host([loading]):after {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  display: inline-block;
  height: 11.75rem;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--_card-banner-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_card-banner-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--_card-banner-skeleton-quote-color, var(--colorsSecondary200, ${a(i.secondary200)})) 50%);
  background-color: var(--_card-banner-skeleton-quote-bg, transparent);
  background-size: 80px 80px, calc((60% * 2) + (16px/ 2)) 16px, calc((85% * 2) + (16px/ 2)) 16px;
  background-position: 50% 20px, 64px 118px, 16px 150px;
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
`;class Tt extends(l(_(n(o(s))))){static get is(){return"bbva-card-banner"}static get scopedElements(){return{"bbva-header-category":ht,"bbva-amount":w,"bbva-badge-default":j,"bbva-clip-entities":Z,"bbva-list-bullet":$t,"bbva-button-default":O,"bbva-link":L,"bbva-text":c,"bbva-badge-category":U}}static get properties(){return{category:{type:String},categoryIcon:{type:String,attribute:"category-icon"},categoryText:{type:String,attribute:"category-text",reflect:!0},clipEntity:{type:String,attribute:"clip-entity"},closeButton:{type:Boolean,attribute:"close-button"},dateTitle:{type:String,attribute:"date-title"},description:{type:String},descriptionEllipsisLines:{type:Number,attribute:"description-ellipsis-lines"},headerIcon:{type:String,attribute:"header-icon"},headerLevel:{type:Number,attribute:"header-level"},headerLink:{type:String,attribute:"header-link"},headerNotifications:{type:Number,attribute:"header-notifications"},listItems:{type:Array,attribute:"list-items"},microillustration:{type:String},statusLabel:{type:String,attribute:"status-label"},statusBadge:{type:String,attribute:"status-badge"},textEntity:{type:String,attribute:"text-entity"},accessibleTextEntity:{type:String,attribute:"accessible-text-entity"},titleEllipsisLines:{type:Number,attribute:"title-ellipsis-lines"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},linkIcon:{type:Boolean,attribute:"link-icon"},variant:{type:String},loading:{type:Boolean,reflect:!0},largerAmount:{type:Boolean,attribute:"larger-amount"},hideMicroillustration:{type:Boolean,attribute:"hide-microillustration"},largerClipEntity:{type:String,attribute:"larger-clip-entity"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"}}}constructor(){super(),this.closeButton=!1,this.listItems=[],this.linkIcon=!1,this.loading=!1,this.headingLevelTitle="h2",this.largerAmount=!1,this.hideMicroillustration=!1,this.largerClipEntity="",this.decimalsHidden=!1}update(t){super.update(t),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[super.styles,_t,d("bbva-card-banner-shared-styles"),St.dark,St.light]}static _tplEntity({size:t,entity:e}){return b` <bbva-clip-entities size="${t}" entity="${e}"> </bbva-clip-entities> `}static _tplText({fontStyle:t,alignment:e,className:a,size:i,tag:r,text:o,accessibleText:n,ellipsis:l}){return b`
      ${n?b` <span class="sr-only"> ${n} </span> `:h}
      <bbva-text
        unset
        font-style="${I(t)}"
        alignment="${I(e)}"
        class="${I(a)}"
        size="${i}"
        tag="${I(r)}"
        text=${I(o)}
        ?ellipsis=${!!l}
        .lines=${l}
      ></bbva-text>
    `}_onClick(){this.disabled||this.dispatchEvent(new CustomEvent("card-banner-click",{detail:!0,bubbles:!0,composed:!0}))}_headerClick(){this.dispatchEvent(new CustomEvent(`card-banner-${this.closeButton?"close-button":"header-link"}-click`,{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("card-banner-button-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("card-banner-link-click",{detail:!0,bubbles:!0,composed:!0}))}get _headerCategory(){return b`
      <bbva-header-category
        heading-level="${I(this.headerLevel)}"
        variant="date"
        @header-category-link-click="${this._headerClick}"
        .optionLink="${this.headerLink}"
        .optionIcon="${this.headerIcon||this.closeButton?G():void 0}"
        option-icon-accesibility-text="${I(this.headerIconAccesibilityText||this.closeButton?this.t("bbva-card-banner-accessibility-text"):void 0)}"
        text="${this.dateTitle}"
        notifications="${this.headerNotifications}"
      >
      </bbva-header-category>
    `}get _badgeCategory(){return b`
      <bbva-badge-category
        .icon=${this.categoryIcon}
        .category=${this.category}
        .text=${this.categoryText}
      >
      </bbva-badge-category>
    `}get _microillustration(){return b`
      <div
        class="content-image ${q({"larger-clip-entity":this.largerClipEntity})}"
        aria-hidden="true"
      >
        ${this.microillustration&&!this.largerClipEntity?b` ${J[this.microillustration]} `:b` <slot name="image"></slot> `}
        ${this.largerClipEntity&&!this.microillustration&&Tt._tplEntity({size:"xlarge",entity:this.largerClipEntity})||h}
      </div>
    `}get _badgeDefault(){return b`
      <bbva-badge-default
        type="${I(this.statusBadge)}"
        .text="${this.statusLabel}"
      ></bbva-badge-default>
    `}get _title(){return b`
      ${Tt._tplText({alignment:"center",className:"title",size:"3XL",tag:this.headingLevelTitle,text:this.contentTitle,accessibleText:null,ellipsis:this.titleEllipsisLines})}
    `}get _amount(){return b`
      <bbva-amount
        variant="${this.largerAmount?"4xl":"l"}"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?decimals-hidden="${this.decimalsHidden}"
      >
      </bbva-amount>
    `}get _account(){return b`
      <div class="account">
        ${this.clipEntity?Tt._tplEntity({size:"small",entity:this.clipEntity}):h}
        ${this.textEntity?Tt._tplText({fontStyle:"italic",size:"S",tag:"span",text:this.textEntity,accessibleText:this.accessibleTextEntity}):h}
      </div>
    `}get _description(){return b`
      ${Tt._tplText({alignment:"center",className:"description",size:"S",tag:"span",text:this.description,accessibleText:null,ellipsis:this.descriptionEllipsisLines})}
    `}get _listItems(){return b`
      <ul>
        ${this.listItems.map((t=>b`
            <li>
              <bbva-list-bullet icon="${F()}">${t}</bbva-list-bullet>
            </li>
          `))}
      </ul>
    `}get _content(){return b`
      <div class="content">
        ${(this.microillustration||!this.hideMicroillustration)&&this._microillustration||h}
        ${this.statusLabel&&this._badgeDefault} ${this.contentTitle&&this._title}
        ${this.amount?this._amount:h}
        ${this.clipEntity||this.textEntity?this._account:h}
        ${this.description?this._description:h}
        ${this.listItems.length>0?this._listItems:h}
      </div>
    `}get _footer(){return b`
      ${this.buttonText&&b`
        <bbva-button-default @click="${this._buttonClick}" .text="${this.buttonText}">
        </bbva-button-default>
      `}
      ${this.linkText&&b`
        <bbva-link
          class="${q({"top-spacer":!this.buttonText})}"
          @click="${this._linkClick}"
          .icon="${this.linkIcon?K():void 0}"
        >
          ${this.linkText}
        </bbva-link>
      `}
    `}render(){return b`
      <div
        @keydown="${"full-width"===this.variant||this.buttonText||this.linkText?null:this._onClick}"
        @click="${"full-width"===this.variant||this.buttonText||this.linkText?null:this._onClick}"
      >
        ${this.dateTitle||this.closeButton?this._headerCategory:h}
        ${this.category||this.categoryText?this._badgeCategory:h} ${this._content}
        ${this._footer}
      </div>
    `}}export{Tt as B,kt as a,gt as b,St as c};
