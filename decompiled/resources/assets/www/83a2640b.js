import"./7f3d7ca9.js";import{z as t,a8 as e,ac as i,ad as a,ab as r,ar as o,a9 as n,aa as s,b_ as l,a as c,aJ as d,cE as p,F as b,cF as m,b$ as h,ak as v,bx as g,h as u,bt as y,c0 as k,cG as $,g as x,L as f,ag as _,aV as S,at as T,V as w,aI as C,as as L,b0 as z,bd as A,ap as P,an as D,av as E,i as X,b6 as q,S as I,r as B,o as F,f as V,aX as M,ah as R,cT as H}from"./952f98a9.js";import{B as N,a as j}from"./06acded6.js";import{C as W}from"./216055dc.js";import{e as U,a as Z,c as O,d as G}from"./b42a85fd.js";import{B as J}from"./8891faa0.js";import{B as Y}from"./d4a97cf1.js";import{s as K,f as Q}from"./b9888d0b.js";import"./c0a2f832.js";import"./cae0f1de.js";const tt=new o;var et=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(a.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
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

.text {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  overflow-wrap: anywhere;
  hyphens: auto;
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  .text {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${tt.mediaRules()}`;var it=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new o).mediaRules()}`;const at=new o;const rt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${at.mediaRules()}`}
    ${l.dark}
  `,light:t`
    ${it}
    ${l.light}
  `};class ot extends(c(d(p))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":b,"bbva-core-image":m,"bbva-badge-notification":h}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,et,v("bbva-button-action-shared-styles"),g(),rt.light,rt.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?u`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?u`<div class="app-pay-icon">${y[this.appPayIcon]}</div>`:u`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return u`
      ${this.notifications?u`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:u` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}x("colors.primarySubdued"),x("colors.primaryCoreLight");var nt=t`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new o).mediaRules()}`;const st=new o;const lt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
}
${st.mediaRules()}`}
  `,light:t`
    ${nt}
  `},ct=new o;var dt=t`:host {
  display: inline-block;
  box-sizing: border-box;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${e(n.secondary200)})));
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
${ct.mediaRules()}`;class pt extends(c(d(f))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":_}}static get properties(){return{date:{type:Date,converter:t=>new Date(t)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.options={day:"2-digit",month:"long",year:"numeric"},this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0}static get styles(){return[super.styles,dt,v("bbva-date-shared-styles"),lt.light,lt.dark]}updated(t){super.updated&&super.updated(t),this._dateFormat!==this._currentDate&&(this._currentDate=this._dateFormat,this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return"Invalid Date"!==this.date.toLocaleDateString()}get _dateFormat(){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,e=t.day||t.month||t.year;return t.hour&&t.minute&&!e?this.date.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):this.date.toLocaleDateString(this.locale,t)}render(){return u`
      ${this.isValid?u` <bbva-text
            unset
            text=${this._dateFormat}
            font-weight="500"
            font-style="italic"
            size="S"
          >
          </bbva-text>`:S}
    `}}x("colors.primaryCoreLightened"),x("colors.cool50");const bt=new o;var mt=t`[top-spacer] {
  visibility: hidden;
  margin-top: 0;
}

[top-spacer="8"] {
  visibility: hidden;
  margin-top: 8;
}

[top-spacer="16"] {
  visibility: hidden;
  margin-top: 16;
}

[top-spacer="24"] {
  visibility: hidden;
  margin-top: 24;
}

[top-spacer="32"] {
  visibility: hidden;
  margin-top: 32;
}

[top-spacer="48"] {
  visibility: hidden;
  margin-top: 48;
}

[top-spacer="64"] {
  visibility: hidden;
  margin-top: 64;
}

[bottom-spacer] {
  visibility: hidden;
  margin-bottom: 0;
}

[bottom-spacer="8"] {
  visibility: hidden;
  margin-bottom: 8;
}

[bottom-spacer="16"] {
  visibility: hidden;
  margin-bottom: 16;
}

[bottom-spacer="24"] {
  visibility: hidden;
  margin-bottom: 24;
}

[bottom-spacer="32"] {
  visibility: hidden;
  margin-bottom: 32;
}

[bottom-spacer="48"] {
  visibility: hidden;
  margin-bottom: 48;
}

[bottom-spacer="64"] {
  visibility: hidden;
  margin-bottom: 64;
}

[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}
[divider][top-spacer] {
  visibility: visible;
}
[divider][bottom-spacer] {
  visibility: visible;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-color, var(--colorsSecondary300, ${e(n.secondary300)}));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
${bt.mediaRules()}`;const ht=new o;var vt=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
  --bbva-divider-opacity: 1;
}
${ht.mediaRules()}`;const gt=new o;const ut={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-divider-opacity: 0.3;
}
${gt.mediaRules()}`}
  `,light:t`
    ${vt}
  `};class yt extends f{static get is(){return"bbva-divider"}static get properties(){return{size:{type:String},topSpacer:{type:String,reflect:!0,attribute:"top-spacer"},bottomSpacer:{type:String,reflect:!0,attribute:"bottom-spacer"}}}constructor(){super(),this.size="full"}static get styles(){return[mt,ut.light,ut.dark,v("bbva-divider-shared-styles")]}render(){return u`
      <hr divider="${this.size}" />
    `}}const kt=new o;var $t=t`:host {
  display: inline-block;
  box-sizing: border-box;
  max-width: 100%;
  color: var(--bbva-amount-dark-mode-color, var(--bbva-amount-color, var(--colorsSecondary600, ${e(n.secondary600)})));
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([ellipsis]) span.amount-wrapper {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
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

.amount-wrapper {
  display: block;
  word-spacing: -0.25em;
  white-space: nowrap;
  unicode-bidi: bidi-override;
}

@supports (-moz-appearance: meterbar) {
  .amount-wrapper {
    word-spacing: calc(-0.25em + 1.35px);
  }
}
.abbreviation {
  word-spacing: normal;
}
${kt.mediaRules()}`;class xt extends(c(T(f))){static get is(){return"bbva-amount-format"}static get properties(){return{ellipsis:{type:Boolean},mask:{type:Boolean},maskChars:{type:String,attribute:"mask-chars"}}}constructor(){super(),this.ellipsis=!1,this.mask=!1,this.maskChars="••••"}static get styles(){return[$t,v("bbva-amount-format-shared-styles")]}updated(t){super.updated&&super.updated(t),this._sendFormattedAmount()}_formattedAmountEventDetail(){return{amount:`${this._isNegative?"-":""}${this._integerSrBlock}`}}_sendFormattedAmount(){const t=this._formattedAmountEventDetail();this.dispatchEvent(new CustomEvent("amount-formatted",{bubbles:!0,detail:t}))}get _amountDecimalTpl(){return u`
      <span class="separator">${this._separator}</span>
      <span class="fractional">${this._fractional}</span>
    `}get _amountAbbreviationTpl(){return u`<span class="abbreviation">&nbsp;${this._abbreviation}</span>`}get _validAmountTpl(){return u`
      <span class="amount-block">
        ${this.mask?this._maskElement:u`<span class="integer">${this._integer}</span> ${!this._decimalsHidden&&this._fractional?this._amountDecimalTpl:u``}`}
        ${this._safeAbbrValue?this._amountAbbreviationTpl:""}
      </span>
    `}get _maskElement(){return xt._getMaskElement(this.amount,this.maskChars,this.mask,0)}static _amountNegativeTpl(){return u` <span class="minus">-</span> `}static _getMaskElement(t,e,i,a){if(t||0===t){return w(t,e,i,a)}return u``}get _amountContentTpl(){return u`
      ${this._isNegative?xt._amountNegativeTpl():""}
      ${this._isValidAmount?this._validAmountTpl:""}
    `}render(){return u` <span class="amount-wrapper">${this._amountContentTpl}</span> `}}const ft=new o;var _t=t`[ambient^=light] {
  --bbva-amount-color: var(--colorsSecondary600, ${e(n.secondary600)});
  --bbva-amount-uncovered-color: var(--colorsTertiaryType5Medium, ${e(n.tertiaryType5Medium)});
  --bbva-amount-income-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
  --skeleton-quote-color: initial;
  --bbva-amount-skeleton-animated-layer-bg: initial;
}
${ft.mediaRules()}`;const St=new o;const Tt={light:_t,dark:t`[ambient^=dark] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-amount-uncovered-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-amount-income-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-amount-skeleton-color: var(--colorsPrimaryCoreDarkened, ${e(n.primaryCoreDarkened)});
  --bbva-amount-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-amount-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${e(n.primaryCore)});
}
${St.mediaRules()}`},wt=new o;var Ct=t`:host {
  --_amount-text-color: var(--bbva-amount-dark-mode-color, var(--bbva-amount-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_amount-grey-color: var(--bbva-amount-grey-dark-mode-color, var(--bbva-amount-grey-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_amount-uncovered-color: var(--bbva-amount-uncovered-dark-mode-color, var(--bbva-amount-uncovered-color, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_amount-income-color: var(--bbva-amount-income-dark-mode-color, var(--bbva-amount-income-color, var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)})));
  --skeleton-quote-color: var(--bbva-amount-skeleton-dark-mode-color, var(--bbva-amount-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --skeleton-quote-bg: var(--bbva-amount-skeleton-dark-mode-bg-color, var(--bbva-amount-skeleton-bg, transparent));
  --_bbva-amount-skeleton-animated-layer-bg: var(--bbva-amount-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-amount-skeleton-animated-layer-bg, var(--ambientsLight, ${e(C.light)})));
  display: inline-block;
  vertical-align: bottom;
  font-weight: var(--bbva-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${e(r.book.fontWeight)}));
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(r.book.fontStyle)});
  color: var(--_amount-text-color);
  width: fit-content;
}

.amount-wrapper {
  display: flex;
}

.amount-block {
  display: flex;
}
.amount-block + .currency-right, .currency-left + .amount-block {
  margin-left: 0.125rem;
}

.minus-left {
  float: var(--bbva-amount-minus-left-float, none);
}
.minus-right {
  float: var(--bbva-amount-minus-right-float, none);
}

.text {
  display: flex;
}

.currency {
  float: var(--bbva-amount-currency-float, none);
}
.currency-left, .currency-right {
  vertical-align: top;
}

.currency-code {
  word-spacing: normal;
}

:host([variant=s]) {
  font-size: var(--bbva-amount-s-font-size, var(--typographyTypeXSmall, ${e(i.typeXSmall)}));
  line-height: var(--bbva-amount-s-line-height, var(--lineHeightTypeXSmall, ${e(a.typeXSmall)}));
}

:host([variant=m]) {
  font-size: var(--bbva-amount-m-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-amount-m-line-height, var(--lineHeightTypeSmall, ${e(a.typeSmall)}));
}

:host(:not([variant])) {
  font-size: var(--bbva-amount-font-size, var(--typographyTypeLarge, ${e(i.typeLarge)}));
  line-height: var(--bbva-amount-line-height, var(--lineHeightTypeLarge, ${e(a.typeLarge)}));
}
:host(:not([variant])) .currency {
  font-size: var(--bbva-amount-currency-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-amount-currency-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
}

:host([variant=l]) {
  font-size: var(--bbva-amount-l-font-size, var(--typographyTypeLarge, ${e(i.typeLarge)}));
  line-height: var(--bbva-amount-l-line-height, var(--lineHeightTypeLarge, ${e(a.typeLarge)}));
}
:host([variant=l]) .currency {
  font-size: var(--bbva-amount-l-currency-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-amount-l-currency-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
}

:host([variant=xl]) {
  font-size: var(--bbva-amount-xl-font-size, var(--typographyTypeXLarge, ${e(i.typeXLarge)}));
  line-height: var(--bbva-amount-xl-line-height, var(--lineHeightTypeXLarge, ${e(a.typeXLarge)}));
}
:host([variant=xl]) .currency {
  font-size: var(--bbva-amount-xl-currency-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-amount-xl-currency-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
}

:host([variant="5xl"]) {
  font-size: var(--bbva-amount-5xl-font-size, 2.5rem);
  line-height: var(--bbva-amount-5xl-line-height, 2.5rem);
}
:host([variant="5xl"]) .currency {
  font-size: var(--bbva-amount-5xl-currency-font-size, 1.75rem);
  line-height: var(--bbva-amount-5xl-currency-line-height, 2rem);
}

:host([variant="4xl"]) {
  font-size: var(--bbva-amount-4xl-font-size, 2rem);
  line-height: var(--bbva-amount-4xl-line-height, 2rem);
}
:host([variant="4xl"]) .currency {
  font-size: var(--bbva-amount-4xl-currency-font-size, var(--typographyTypeXLarge, ${e(i.typeXLarge)}));
  line-height: var(--bbva-amount-4xl-currency-line-height, var(--lineHeightTypeXLarge, ${e(a.typeXLarge)}));
}

:host([variant="3xl"]) {
  font-size: var(--bbva-amount-3xl-font-size, var(--typographyType3XLarge, ${e(i.type3XLarge)}));
  line-height: var(--bbva-amount-3xl-line-height, var(--lineHeightType3XLarge, ${e(a.type3XLarge)}));
}
:host([variant="3xl"]) .currency {
  font-size: var(--bbva-amount-3xl-currency-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-amount-3xl-currency-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
}

:host([variant=xs]) {
  font-size: var(--bbva-amount-xs-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-amount-xs-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
}

:host([type=grey]) {
  color: var(--_amount-grey-color);
}

:host([type=uncovered]) {
  color: var(--_amount-uncovered-color);
}

:host([type=income]) {
  color: var(--_amount-income-color);
}

:host([ellipsis]) {
  display: flex;
}
:host([ellipsis]) div.amount-wrapper {
  width: 80px;
}
:host([ellipsis]) div.amount-wrapper .amount-block {
  display: block;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
:host([ellipsis]) div.amount-wrapper .currency.ellipsis {
  display: none;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 1.5rem;
  width: 7.5rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((100px * 2) + (24px/ 2)) 24px;
  background-position: 0px 0px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 1.5rem;
  background: var(--_bbva-amount-skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}
:host([loading]):host([variant="5xl"]) {
  height: 2.5rem;
  width: 8.75rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((120px * 2) + (36px/ 2)) 36px;
  background-position: 0px 2px;
}
:host([loading]):host([variant="5xl"]) .skeleton {
  height: 2.5rem;
}
:host([loading]):host([variant="4xl"]) {
  height: 2rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (32px/ 2)) 32px;
  background-position: 0px 0px;
}
:host([loading]):host([variant="4xl"]) .skeleton {
  height: 2rem;
}
:host([loading]):host([variant="3xl"]) {
  height: 2rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (24px/ 2)) 24px;
  background-position: 0px 4px;
}
:host([loading]):host([variant="3xl"]) .skeleton {
  height: 2rem;
}
:host([loading]):host([variant=xl]) {
  height: 1.5rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (20px/ 2)) 20px;
  background-position: 0px 2px;
}
:host([loading]):host([variant=xl]) .skeleton {
  height: 1.5rem;
}
:host([loading]):host([variant=l]) {
  height: 1.5rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (18px/ 2)) 18px;
  background-position: 0px 3px;
}
:host([loading]):host([variant=l]) .skeleton {
  height: 1.5rem;
}
:host([loading]):host([variant=m]) {
  height: 1.5rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (15px/ 2)) 15px;
  background-position: 0px 4px;
}
:host([loading]):host([variant=m]) .skeleton {
  height: 1.5rem;
}
:host([loading]):host([variant=s]) {
  height: 1.5rem;
  width: 6.875rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (14px/ 2)) 14px;
  background-position: 0px 5px;
}
:host([loading]):host([variant=s]) .skeleton {
  height: 1.5rem;
}
:host([loading]):host([variant=xs]) {
  height: 1rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((90px * 2) + (12px/ 2)) 12px;
  background-position: 0px 2px;
}
:host([loading]):host([variant=xs]) .skeleton {
  height: 1rem;
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
${wt.mediaRules()}`;class Lt extends(c(L(d(xt)))){static get is(){return"bbva-amount"}static get properties(){return{type:{type:String,reflect:!0},variant:{type:String,reflect:!0},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"},text:{type:String,reflect:!0},unit:{type:String,attribute:"unit",reflect:!0},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.language=document.documentElement.lang||"en",this.loading=!1}static get styles(){return[super.styles,Ct,Tt.light,Tt.dark,v("bbva-amount-shared-styles")]}update(t){super.update(t),t.has("unit")&&!this.symbol&&(this.symbol=this.unit)}get _currency(){return!this.showCurrencyCode&&super._currency}get _isNegative(){return(this._isUncovered()||this._negativeAmount)&&!this._isIncome()}_isUncovered(){return"uncovered"===this.type}_isIncome(){return"income"===this.type}_isPoints(){return"points"===this.type}_isText(){return!!this.text}_formattedAmountEventDetail(){return{...super._formattedAmountEventDetail(),full:this.srAmount}}get srAmount(){let t="";return this._isNegative&&!this._minusAfterSymbol&&(t="-"),this._isPoints()||!this._currency||this._alignRight||(t+=this._currency),this._isNegative&&this._minusAfterSymbol&&(t+="-"),t+=this._integerSrBlock,this._isText()?`${t} ${this.text}`:(this._isPoints()||this._isText()||(this._currency&&this._alignRight&&(t=`${t} ${this._currency}`),this.showCurrencyCode&&(t=`${t} ${this.currencyCode}`)),t)}_currencyTpl(t){return u`<span
      class="currency currency-${t} ${!this.mask&&this.ellipsis?"ellipsis":""}"
      >${this._currency}</span
    >`}static _minusTpl(t){return u`<span class="minus minus-${t}">-</span>`}_currencyCodeTpl(){return u`<span class="currency-code">&nbsp;${this.currencyCode}</span>`}_textTpl(){return u`<span class="text">&nbsp;${this._validAmountTpl}${this.text}</span>`}get _amountContentTpl(){return u`
      ${!this._isNegative||this._minusAfterSymbol||this.mask?"":Lt._minusTpl("left")}
      ${this._isPoints()||!this._currency||this._alignRight?"":this._currencyTpl("left")}
      ${this._isNegative&&this._minusAfterSymbol&&!this.mask?Lt._minusTpl("right"):""}
      ${this._isValidAmount&&!this._isText()?this._validAmountTpl:""}
      ${!this._isPoints()&&!this._isText()&&this._currency&&this._alignRight?this._currencyTpl("right"):""}
      ${this._isPoints()||this._isText()||!this.showCurrencyCode?"":this._currencyCodeTpl()}
      ${this._isText()?this._textTpl():""}
    `}render(){return u`
      ${this.loading?u`<div class="skeleton"></div>`:u`<div class="amount-wrapper">${this._amountContentTpl}</div>`}
    `}}x("colors.primaryCoreLightened"),x("colors.tertiaryType1Light"),x("colors.primarySubduedLight"),x("colors.cool50"),x("colors.cool90");var zt=t`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new o).mediaRules()}`;const At=new o;var Pt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${At.mediaRules()}`;const Dt={dark:t`
    ${z.dark}
    ${Tt.dark}
    ${A.dark}
    ${Pt}
  `,light:t`
    ${z.light}
    ${Tt.light}
    ${A.light}
    ${zt}
  `},Et=new o;var Xt=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${e(n.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
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

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}
:host(:not([variant=stacked])) .wrapper-mask {
  align-self: center;
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount],
:host([description-medium]) .wrapper-mask {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(r.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(r.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(r.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${e(r.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${e(r.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name=bbva-link], :host([variant=stacked-center]) [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${e(s.spacer)}))) / 16) * 1rem);
}
${Et.mediaRules()}`;class qt extends(P(L(T(d(c(D(f))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[Lt,q,I,_,U];return qt.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Xt,Dt.light,Dt.dark,g("button:focus"),v("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return u`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
        ?show-currency-code="${this.showCurrencyCode}"
      >
      </bbva-amount>
    `}get _icon(){return u`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return u`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return u`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return u`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=w(this.mask,this.maskChars,!0,this.visibleChars);return u`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),u`
      <dd class=${E({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return u`
      <bbva-link
        class=${E({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${X(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${X(this.roleLink)} aria-live=${X(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,r=`${t}AriaLiveText`;return u`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${X(this[a])}"
        aria-live="${X(this[r])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${X(this[i])}"
      >
      </bbva-text>
    `}_tplText(t){return u` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return u`
      <dl>
        <dt class=${E({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return u`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?u`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):u` <div class="wrapper-description">${this._tplText("description")}</div> `,u`
      ${t}
      <div class="skeleton"></div>
    `}}x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.primaryCoreLightened"),x("colors.cool60"),x("colors.primaryCoreLightened"),x("colors.primarySubdued"),x("colors.primaryMediumLight"),x("colors.primarySubdued"),x("colors.primaryMediumLight"),x("colors.cool50");var It=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Bt extends(c(D(f))){static get is(){return"bbva-aggregation-simple-list"}static get scopedElements(){return{"bbva-divider":yt,"bbva-header-category":Y,"bbva-list-simple":qt}}static get properties(){return{config:{type:Array},headerText:{type:String,attribute:"header-text"},showHeaderText:{type:Boolean,attribute:"show-header-text"}}}constructor(){super(),this.config=[],this.headerText="",this.showHeaderText=!0}static get styles(){return[It,v("bbva-aggregation-simple-list-shared-styles")]}reset(){this.config=[]}_handleLinkClick(t,e,i){this._fireEvent(e||`item-link-${t}`,i)}_getDivider(t){return u`
    <bbva-divider
      size="${t.size}"
      top-spacer="${t.topSpacer}"
      bottom-spacer="${t.bottomSpacer}"
    ></bbva-divider>
    `}_handleIconClick(t,e,i){this._fireEvent(e||`handle-click-icon-action-${t}`,i)}get _list(){return this.config.map(((t,e)=>u`
      ${t.noLink?u`
        <bbva-list-simple
          class="${t.class}"
          variant="${t.variant}"
          label="${t.label}"
          description="${t.description||""}"
          ?description-medium="${t.descriptionMedium}"
          .actionLink="${t.actionLink||""}"
          action-icon="${t.actionIcon||""}"
          action-accessibility-text="${t.actionAccessibilityText}"
          label-accessibility-text="${t.labelAccessibilityText}"
          description-accessibility-text="${t.descriptionAccessibilityText}"
          ?description-date="${t.descriptionDate}"
          mask="${t.mask||""}"
          visible-chars="${t.visibleChars||""}"
          mask-chars="•"
          language="${t.language}"
          currency-code="${t.currencyCode}"
          local-currency="${t.localCurrency}"
          amount="${t.amount}"
          ?description-italic=${t.descriptionItalic}
          @list-simple-link-action-link-click="${()=>{this._handleLinkClick(e,t.customEventName,t.customEventDetail)}}"
          @list-simple-icon-click=${()=>this._handleIconClick(e,t.customEventName,t.customEventDetail,t.actionAccessibilityText)}
          ></bbva-list-simple>`:u`
        <bbva-list-simple
        class="${t.class}"
        variant="${t.variant}"
        label="${t.label}"
        description="${t.description}"
        ?description-medium="${t.descriptionMedium}"
        action-icon="${t.actionIcon||""}"
        action-accessibility-text="${t.actionAccessibilityText}"
        label-accessibility-text="${t.labelAccessibilityText}"
        description-accessibility-text="${t.descriptionAccessibilityText}"
        action-link="${t.actionLink||""}"
        @list-simple-link-action-link-click="${()=>{this._handleLinkClick(e,t.customEventName,t.customEventDetail)}}"
        @list-simple-icon-click=${()=>this._handleIconClick(e,t.customEventName,t.customEventDetail)}
          ></bbva-list-simple>
      `}
      ${t.divider&&this._getDivider(t.divider)}
      `))}get _header(){return this.showHeaderText?u`
      <bbva-header-category
        text="${this.headerText}"
      ></bbva-header-category>
    `:u``}render(){return u`
      ${this._header}
      ${this._list}
    `}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}class Ft extends(M(c(N(W(f))))){static get is(){return"bbva-multistep-no-pre-approved-car-certificate-success"}static get properties(){return{config:{type:Object}}}static get scopedElements(){const t=[Z,ot,pt,J,O,G,j,_,Bt];return Ft.scopedElementsFromClasses(t)}constructor(){super(),this.config={}}static get styles(){return[K,v("bbva-multistep-no-pre-approved-car-certificate-success-shared-styles")]}get _receiptHeader(){const t=new Date,e=t.toLocaleDateString("es-es",{month:"long"}),i=`${t.getDate()} ${e} ${t.getFullYear()}, ${t.getHours()}:${t.getMinutes()} h`;return u`
      <bbva-panel-info
        disabled-tabindex=""
        microillustration="success"
        heading="${this.t("no-pre-approved-car-certificate-success-quote")}"
        hide-padding-bottom>
      </bbva-panel-info>
      <div class="receipt__date">
        <bbva-text
          font-weight="500"
          font-style="italic"
          text="${i}"
          tag="span"
          size="S">
        </bbva-text>
      </div>
    `}get _list(){const t=this.config.content.map((t=>{const e={...t};return e.variant="stacked-center",e}));return u`
      <bbva-aggregation-simple-list id="contentList" .config="${t}"></bbva-aggregation-simple-list>
    `}_clickDashboard(){Q(this,"back-product-section-click")}_clickShare(){Q(this,"button-options")}get _receiptFooter(){return u`
      <bbva-notification-message
        class="receipt__notification-message"
        icon="${R()}"
        message="${this.t("npa-car-loan-receipt-notification-message")}"
        description="${this.config.phoneNumber}">
      </bbva-notification-message>
      <bbva-list-definition-title
        class="receipt__contact"
        ?hidden="${!this.config.email}"
        content-title="${this.t("npa-car-loan-receipt-contact-message")}"
        subtitle="${this.config.email}">
      </bbva-list-definition-title>

      <div class="step-button-container">
        <bbva-button-action
          class="receipt__icon"
          @click="${this._clickShare}"
          icon="${H()}"
          label="${this.t("npa-car-loan-share-action-text")}"
        ></bbva-button-action>

        <bbva-button-default id="exitButton" text="Salir" @click="${this._clickDashboard}"></bbva-button-default>
      </div>
    `}render(){return u`
    <div class="receipt">
      ${this._receiptHeader} ${this._list} ${this._receiptFooter}
    </div>
    `}}customElements.define(Ft.is,Ft);
