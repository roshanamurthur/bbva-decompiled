import{z as t,ar as e,a8 as o,a9 as a,b1 as i,a as r,an as n,aJ as s,L as l,ag as c,ak as d,h as p,aV as h,f as g,g as m,au as b,bc as u,al as v,cK as y,cL as f,ab as $,ad as k,ac as x,aa as S,as as _,ap as w,bx as C,i as D,V as F,av as L,aw as A,bh as P,cM as T,bj as R,ae as B,af as V,cN as q}from"./952f98a9.js";import{aM as W,t as M}from"./7f3d7ca9.js";var z=t`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new e).mediaRules()}`;const I=new e;var E=t`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${o(a.primaryCoreDark)});
}
${I.mediaRules()}`;const j={dark:t`
    ${i.dark}
    ${E}
  `,light:t`
    ${i.light}
    ${z}
  `},H=new e;var N=t`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${o(a.secondary200)})));
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
${H.mediaRules()}`;class U extends(r(n(s(l)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":c}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,N,d("bbva-date-shared-styles"),j.light,j.dark]}updated(t){var e,o;super.updated&&super.updated(t),0===(null===(e=this.dateRange)||void 0===e?void 0:e.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(o=this.dateRange)||void 0===o?void 0:o.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var t;return(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(t){const e=this.utc?{...this.options,timeZone:"UTC"}:this.options,o=e.day||e.month||e.year;return e.hour&&e.minute&&!o?t.toLocaleTimeString(this.locale,e).concat(` ${this.clockSuffix}`):t.toLocaleDateString(this.locale,e)}_fromToDateFormat(t){return[new Date(t[0]),new Date(t[1])].map(((t,e)=>t.toLocaleDateString(this.locale,this.options).concat(0===e?" - ":"")))}_fromToDateFormatA11y(t){const e=new Date(t[0]),o=new Date(t[1]),a={...this.options};return a.month="long",[e,o].map(((t,e)=>t.toLocaleDateString(this.locale,a).concat(0===e?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&p` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||h}get _tplDateRange(){var t;return this.isValidRange&&(null===(t=this.dateRange)||void 0===t?void 0:t.length)>0&&p`
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
        `||h}render(){return p` ${this._tplDate} ${this._tplDateRange} `}}var O={...g,bbvaDate:`\n        --bbva-date-dark-mode-color: ${m("colors.primaryCoreLightened")};\n        --bbva-date-dark-mode-skeleton-quote-color: ${m("colors.cool50")};\n    `};var X=t`[ambient^=light] {
  --bbva-list-option-background-color-active: initial;
  --bbva-list-option-title: initial;
  --bbva-list-option-subtitle-color: initial;
  --bbva-list-option-header-description-color: initial;
  --bbva-list-option-description-color: initial;
  --bbva-list-option-title-amount-color: initial;
  --bbva-list-option-secondary-amount-color: initial;
  --bbva-list-option-terciary-amount-color: initial;
  --bbva-list-option-account-color: initial;
  --bbva-list-option-account-description-color: initial;
  --bbva-list-option-secondary-description-color: initial;
  --bbva-list-option-comment-color: initial;
  --bbva-list-option-category-color: initial;
  --bbva-list-option-category-text-color: initial;
  --skeleton-quote-color: initial;
  --skeleton-quote-bg: initial;
}
${(new e).mediaRules()}`;const J=new e;var K=t`[ambient^=dark] {
  --bbva-list-option-background-color-active: var(--colorsPrimaryCoreDark, ${o(a.primaryCoreDark)});
  --bbva-list-option-title: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-subtitle-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-header-description-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-description-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-title-amount-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-secondary-amount-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-terciary-amount-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-account-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-account-description-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-secondary-description-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-comment-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-category-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --bbva-list-option-category-text-color: var(--colorsPrimaryCoreLightened, ${o(a.primaryCoreLightened)});
  --skeleton-quote-color: var(--colorsPrimaryMedium, ${o(a.primaryMedium)});
  --skeleton-quote-bg: var(--colorsPrimaryCore, ${o(a.primaryCore)});
}
${J.mediaRules()}`;const Z={dark:t`
    ${b.dark}
    ${u.dark}
    ${v.dark}
    ${j.dark}
    ${y.dark}
    ${W.dark}
    ${f.dark}
    ${K}
  `,light:t`
    ${b.light}
    ${u.light}
    ${v.light}
    ${j.light}
    ${y.light}
    ${W.light}
    ${f.light}
    ${X}
  `},G=new e;var Q=t`:host {
  display: flex;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1em);
  --_list-option-title-color: var(--bbva-list-option-dark-mode-title, var(--bbva-list-option-title, var(--colorsSecondary600, ${o(a.secondary600)})));
  --_list-option-subtitle-color: var(--bbva-list-option-dark-mode-subtitle-color, var(--bbva-list-option-subtitle-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-header-description-color: var(--bbva-list-option-dark-mode-header-description-color, var(--bbva-list-option-header-description-color, var(--colorsSecondary600, ${o(a.secondary600)})));
  --_list-option-description-color: var(--bbva-list-option-dark-mode-description-color, var(--bbva-list-option-description-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-title-amount-color: var(--bbva-list-option-dark-mode-title-amount-color, var(--bbva-list-option-title-amount-color, var(--colorsSecondary600, ${o(a.secondary600)})));
  --_list-option-secondary-amount-color: var(--bbva-list-option-dark-mode-secondary-amount-color, var(--bbva-list-option-secondary-amount-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-terciary-amount-color: var(--bbva-list-option-dark-mode-terciary-amount-color, var(--bbva-list-option-terciary-amount-color, var(--colorsSecondary600, ${o(a.secondary600)})));
  --_list-option-account-color: var(--bbva-list-option-dark-mode-account-color, var(--bbva-list-option-account-color, var(--colorsSecondary600, ${o(a.secondary600)})));
  --_list-option-account-description-color: var(--bbva-list-option-dark-mode-account-description-color, var(--bbva-list-option-account-description-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-secondary-description-color: var(--bbva-list-option-dark-mode-secondary-description-color, var(--bbva-list-option-secondary-description-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-comment-color: var(--bbva-list-option-dark-mode-comment-color, var(--bbva-list-option-comment-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-category-color: var(--bbva-list-option-dark-mode-category-color, var(--bbva-list-option-category-color, var(--colorsPrimaryCore, ${o(a.primaryCore)})));
  --_list-option-category-text-color: var(--bbva-list-option-dark-mode-category-text-color, var(--bbva-list-option-category-text-color, var(--colorsSecondary500, ${o(a.secondary500)})));
  --_list-option-bg-color-active: var(--bbva-list-option-dark-mode-background-color-active, var(--bbva-list-option-background-color-active, token("foundations.colors.secondary100")));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:focus) {
  outline: none;
}

:host(:active) {
  background-color: var(--_list-option-bg-color-active);
}

:host([disabled]) {
  opacity: 0.4;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.account {
  color: var(--_list-option-account-color);
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${o($.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${o($.bookItalic.fontWeight)});
}
.unmasked-account .account {
  color: var(--_list-option-account-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
  overflow: hidden;
}

.account-description {
  color: var(--_list-option-account-description-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
  text-align: right;
  overflow: hidden;
  margin: 0 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  flex: var(--_list-option-account-description-flex);
  align-self: flex-start;
}

.category {
  color: var(--_list-option-category-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-category] {
  align-items: center;
  display: flex;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}

.category-text {
  color: var(--_list-option-category-text-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
}

.comment {
  color: var(--_list-option-comment-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
  text-align: left;
  align-self: flex-start;
  overflow: hidden;
}

.entity {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  align-self: flex-start;
}

.entity-container {
  display: flex;
  flex-flow: nowrap;
  align-items: center;
  flex: 1;
  align-self: flex-start;
}
.entity-container.unmasked-account .account-description {
  flex: none;
}

[data-tag-name="bbva-date "] {
  line-height: var(--lineHeightTypeSmall, ${o(k.typeSmall)});
}

.description {
  color: var(--_list-option-description-color);
  line-height: var(--lineHeightType2XSmall, ${o(k.type2XSmall)});
  overflow: hidden;
}

.header-description,
.header-description-medium {
  color: var(--_list-option-header-description-color);
  text-align: right;
}

.header-description-medium {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${o($.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${o($.medium.fontWeight)});
}

.header-description-container {
  align-self: flex-start;
  order: 4;
  margin: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  text-align: right;
}

.info {
  display: flex;
  flex: 1;
  flex-direction: column;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}

.row {
  display: flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: nowrap;
}
.row:first-child {
  min-height: 2rem;
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}
.row.right-align {
  justify-content: flex-end;
}

.title-amount {
  display: flex;
  justify-content: flex-end;
}

.secondary-amount {
  --bbva-amount-color: var(--_list-option-secondary-amount-color);
  align-self: flex-start;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}

.secondary-description {
  color: var(--_list-option-secondary-description-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
  text-align: right;
  align-self: flex-start;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(var(--skeleton-quote-color, var(--colorsSecondary200, ${o(a.secondary200)})) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${o(a.secondary200)})) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${o(a.secondary200)})) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 30px 30px, calc((50% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 54px 20px, 54px 44px;
}

.terciary-amount {
  color: var(--_list-option-terciary-amount-color);
  font-style: var(--fontFacePrimaryBookFontStyle, ${o($.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${o($.book.fontWeight)});
}

[data-tag-name=bbva-core-heading] {
  color: var(--_list-option-title-color);
  font-size: var(--typographyTypeMedium, ${o(x.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${o(k.typeMedium)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${o($.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${o($.medium.fontWeight)});
  margin-top: calc(((0.75 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}

.wrapper-title {
  display: flex;
  align-items: center;
  align-self: flex-start;
  overflow: hidden;
  flex: 1;
}

:host([title-ellipsis]) [data-tag-name=bbva-core-heading] {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([ellipsis]) .header-description-container {
  max-width: 50%;
}
:host([ellipsis]) .entity-container {
  flex: none;
}
:host([ellipsis]) .entity-container.unmasked-account {
  flex: 1;
  min-width: 0;
}
:host([ellipsis]) .entity-container.unmasked-account .account {
  width: 100%;
}
:host([ellipsis]) .entity-container.unmasked-account.not-account-description {
  width: 100%;
}

:host([long-amount]) .wrapper-title {
  order: 1;
  min-height: 2rem;
  width: 100%;
}
:host([long-amount]) .wrapper-title [data-tag-name=bbva-core-heading] {
  margin: 0;
  padding: 0;
}
:host([long-amount]) .row:first-child {
  margin-bottom: 0;
}
:host([long-amount]) .description {
  order: 2;
}
:host([long-amount]) .entity-container {
  order: 3;
}
:host([long-amount]) .secondary-amount {
  margin-left: 0;
  order: 5;
}
:host([long-amount]) .account-description {
  order: 6;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem) 0 0 0;
  text-align: initial;
  flex: none;
}
:host([long-amount]) .terciary-amount {
  order: 7;
}
:host([long-amount]) .comment {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  order: 8;
  align-self: unset;
}
:host([long-amount]) .secondary-description {
  order: 9;
  text-align: initial;
  margin-left: 0;
  align-self: unset;
}
:host([long-amount]) [data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
  order: 10;
}
:host([long-amount]) [data-tag-name=bbva-badge-category] {
  order: 11;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem);
}
:host([long-amount]) .header-description-container {
  align-self: flex-start;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${o(S.spacer)}))) / 16) * 1rem) 0 0 0;
  width: initial;
}
:host([long-amount]) [data-tag-name=bbva-text] {
  width: 100%;
}

:host([aria-disabled=true]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) [data-tag-name=bbva-form-checkbox],
:host([loading]) [data-tag-name=bbva-form-radio-button],
:host([loading]) .info {
  opacity: 0;
}
:host([loading]) .skeleton, :host([loading]) .control-skeleton {
  opacity: 1;
}
${G.mediaRules()}`;class Y extends(_(w(n(s(r(l)))))){static get is(){return"bbva-list-option"}static get scopedElements(){const t=[A,c,P,M,T,R,B,U,V,q];return Y.scopedElementsFromClasses(t)}static get properties(){return{badgeClass:{type:String,attribute:"badge-class"},badgeText:{type:String,attribute:"badge-text"},checked:{type:Boolean,reflect:!0},longAmount:{type:Boolean,attribute:"long-amount"},name:{type:String},typeRadioButton:{type:Boolean,attribute:"type-radio-button"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},titleLevel:{type:Number,attribute:"title-level"},value:{type:String,reflect:!0},headerDescription:{type:String,attribute:"header-description"},headerDescriptionMedium:{type:Boolean,attribute:"header-description-medium"},titleAmount:{type:Number,attribute:"title-amount"},secondaryAmount:{type:Number,attribute:"secondary-amount"},description:{type:String},entity:{type:String},entityText:{type:String,attribute:"entity-text"},account:{type:String,reflect:!0},terciaryAmount:{type:Number,attribute:"terciary-amount"},comment:{type:String},secondaryDescription:{type:String,attribute:"secondary-description"},category:{type:String},categoryIcon:{type:String,attribute:"category-icon"},categoryText:{type:String,attribute:"category-text"},language:{type:String},date:{type:String},dateFormat:{type:Object,attribute:"date-format"},accountDescription:{type:String,attribute:"account-description"},accountVisibleChars:{type:Number,attribute:"account-visible-chars"},maskedChar:{type:String,attribute:"masked-char"},descriptionAmountType:{type:String,attribute:"description-amount-type"},ellipsis:{type:Boolean},titleEllipsis:{type:Boolean,attribute:"title-ellipsis"},unmaskedAccount:{type:Boolean,attribute:"unmasked-account"},titleAmountUnit:{type:String,attribute:"title-amount-unit"},titleAmountDecimalsHidden:{type:Boolean,attribute:"title-amount-decimals-hidden"}}}constructor(){super(),this._uniqueId=String(Math.floor(Math.random()*Date.now())),this.badgeClass="warning",this.titleLevel=5,this.typeRadioButton=!1,this.account="",this.language="es-ES",this.longAmount=!1,this.ellipsis=!1,this.titleEllipsis=!1,this.accountVisibleChars=4,this.maskedChar="•",this.descriptionAmountType="",this.unmaskedAccount=!1,this.headerDescriptionMedium=!1,this.dateFormat={day:"2-digit",month:"long",year:"numeric"},this._aligment=this.longAmount?"":"right",this.titleAmountDecimalsHidden=!1,this.addEventListener("click",(()=>{this.disabled||(this.checked=this.typeRadioButton||!this.checked,this.dispatchEvent(new CustomEvent("bbva-list-option-input-change",{detail:{checked:this.checked,name:this.name,value:this.value},bubbles:!0,composed:!0})))}))}firstUpdated(t){if(super.update(t),!this.longAmount){this.shadowRoot.querySelectorAll(".row > .right:first-child").forEach((t=>t.parentNode.classList.add("right-align")))}}update(t){super.update(t),t.has("title")&&this._titleContent()}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[C("button:focus"),Z.dark,Z.light,Q,d("bbva-list-option-shared-styles")]}static _tmplText({text:t,classes:e,ellipsis:o}){return p`
      <bbva-text unset ?ellipsis="${o}" class="${e}" text="${t}" size="S">
      </bbva-text>
    `}_tmplAmount({type:t,amount:e,classes:o,variant:a,unit:i,decimalsHidden:r}){return p`
      <bbva-amount
        type="${D(t)}"
        unit="${D(i)}"
        ?decimals-hidden="${r}"
        language="${D(this.language)}"
        amount="${e}"
        class="${o}"
        variant="${a}"
        ?symbol-right="${this.symbolRight}"
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        disabled-tabindex
      >
      </bbva-amount>
    `}get _inputType(){return this.typeRadioButton?p`
          <bbva-form-radio-button
            ?checked=${this.checked}
            .disabled=${this.disabled}
            .name=${this.name}
            .value=${this.value}
            aria-labelledby="title-${this._uniqueId}"
          >
          </bbva-form-radio-button>
        `:p`
          <bbva-form-checkbox
            not-form
            ?checked=${this.checked}
            .disabled=${this.disabled}
            .name=${this.name}
            .value=${this.value}
            aria-labelledby="title-${this._uniqueId}"
          >
          </bbva-form-checkbox>
        `}get _header(){return p`
      <div class="wrapper-title">
        <bbva-core-heading id="title-${this._uniqueId}" .level="${this.titleLevel}">
          ${D(this.contentTitle)}
        </bbva-core-heading>
      </div>
    `}get _badge(){return p`
      <bbva-badge-default text="${D(this.badgeText)}" type="${this.badgeClass}">
      </bbva-badge-default>
    `}addRow(t){return this.longAmount?t:p` <div class="row">${t}</div> `}get _headerDescription(){return this.headerDescription?p`
        ${Y._tmplText({ellipsis:this.ellipsis,classes:this.headerDescriptionMedium?"header-description-medium":"header-description",text:this.headerDescription,size:"S"})}
      `:this.date?p`
        <bbva-date
          locale="${this.language}"
          date="${this.date}"
          .options="${this.dateFormat}"
        ></bbva-date>
      `:this.titleAmount?p`
        ${this._tmplAmount({amount:this.titleAmount,classes:"title-amount",variant:"xl",unit:this.titleAmountUnit,decimalsHidden:this.titleAmountDecimalsHidden})}
      `:h}get _maskedAccount(){return this.account?F(this.account,this.maskedChar,!0,this.accountVisibleChars):h}get _accountInfo(){return p`
      <div
        class="entity-container ${L({"unmasked-account":this.unmaskedAccount,"not-account-description":!this.accountDescription})}"
      >
        ${this.entity?p`
              <bbva-clip-entities class="entity" size="small" entity="${this.entity}">
                ${this.entityText}
              </bbva-clip-entities>
            `:h}
        ${this.account?p`
              ${Y._tmplText({ellipsis:this.ellipsis,classes:"account",text:this.unmaskedAccount&&this.account||this._maskedAccount,size:"S"})}
            `:h}
      </div>
      ${this.accountDescription?p`
            ${Y._tmplText({ellipsis:this.ellipsis,classes:`account-description  ${this._aligment}`,text:this.accountDescription,size:"S"})}
          `:h}
    `}get _renderMovement(){return p`
      ${this.addRow(p`
        ${this._header}
        <div class="header-description-container">${this._headerDescription}</div>
      `)}
      ${(this.description||this.secondaryAmount)&&this.addRow(p`
          ${this.description?p`
                ${Y._tmplText({ellipsis:this.ellipsis,classes:"description",text:this.description,size:"S"})}
              `:h}
          ${this.secondaryAmount?p`
                ${this._tmplAmount({ellipsis:this.ellipsis,type:this.descriptionAmountType,amount:this.secondaryAmount,classes:`secondary-amount ${this._aligment}`,variant:"xs"})}
              `:h}
        `)||h}
      ${(this.entity||this.entityText||this.account||this.accountDescription)&&this.addRow(this._accountInfo)||h}
      ${(this.badgeText||this.terciaryAmount)&&this.addRow(p`
          ${this._badge}
          ${this.terciaryAmount?p`
                ${this._tmplAmount({ellipsis:this.ellipsis,amount:this.terciaryAmount,classes:`terciary-amount ${this._aligment}`,variant:"m"})}
              `:h}
        `)||h}
      ${(this.comment||this.secondaryDescription)&&this.addRow(p`
          ${this.comment?p`
                ${Y._tmplText({ellipsis:this.ellipsis,classes:"comment",text:this.comment,size:"S"})}
              `:h}
          ${this.secondaryDescription?p`
                ${Y._tmplText({ellipsis:this.ellipsis,classes:`secondary-description ${this._aligment}`,text:this.secondaryDescription,size:"S"})}
              `:h}
        `)||h}
      ${(this.categoryIcon||this.categoryText||this.category)&&p`<bbva-badge-category
          .category=${this.category}
          .icon="${this.categoryIcon}"
          .text="${this.categoryText}"
        >
        </bbva-badge-category>`||h}
    `}render(){return p`
      <div class="input">
        ${this._inputType}
        <div class="control-skeleton"></div>
      </div>
      <div class="info">${this._renderMovement}</div>
      <div class="skeleton"></div>
    `}}export{Y as B,Z as a,O as b};
