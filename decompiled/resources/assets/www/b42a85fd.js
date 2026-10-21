import{z as t,a8 as a,ar as o,a9 as r,a as e,at as i,L as n,ak as l,h as c,ac as s,ad as b,ab as d,as as u,g as v,aa as m,be as p,an as g,cE as h,F as y,ag as f,dv as k,da as _,aV as $,cG as C,f as x,I as S,b0 as L,bd as P,ap as w,aJ as T,bx as M,V as D,av as A,i as z,b6 as I,S as V,r as E,o as F,aH as X,ah as B,cU as R,ai as N,aN as q,dj as H,bF as W,cu as j}from"./952f98a9.js";const U=new o;var O=t`:host {
  display: inline-block;
  box-sizing: border-box;
  max-width: 100%;
  color: var(--bbva-amount-dark-mode-color, var(--bbva-amount-color, var(--colorsSecondary600, ${a(r.secondary600)})));
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
${U.mediaRules()}`;class G extends(e(i(n))){static get is(){return"bbva-amount-format"}static get properties(){return{ellipsis:{type:Boolean}}}constructor(){super(),this.ellipsis=!1}static get styles(){return[O,l("bbva-amount-format-shared-styles")]}updated(t){super.updated&&super.updated(t),this._sendFormattedAmount()}_formattedAmountEventDetail(){return{amount:`${this._isNegative?"-":""}${this._integerSrBlock}`}}_sendFormattedAmount(){const t=this._formattedAmountEventDetail();this.dispatchEvent(new CustomEvent("amount-formatted",{bubbles:!0,detail:t}))}get _amountDecimalTpl(){return c`
      <span class="separator">${this._separator}</span>
      <span class="fractional">${this._fractional}</span>
    `}get _amountAbbreviationTpl(){return c` <span class="abbreviation">&nbsp;${this._abbreviation}</span> `}get _validAmountTpl(){return c`
      <span class="amount-block">
        <span class="integer">${this._integer}</span>
        ${!this._decimalsHidden&&this._fractional?this._amountDecimalTpl:""}
        ${this._safeAbbrValue?this._amountAbbreviationTpl:""}
      </span>
    `}static _amountNegativeTpl(){return c` <span class="minus">-</span> `}get _amountContentTpl(){return c`
      ${this._isNegative?G._amountNegativeTpl():""}
      ${this._isValidAmount?this._validAmountTpl:""}
    `}render(){return c`
      <span class="amount-wrapper"> ${this._amountContentTpl} </span>
    `}}const J=new o;var K=t`[ambient^=light] {
  --bbva-amount-color: var(--colorsSecondary600, ${a(r.secondary600)});
  --bbva-amount-uncovered-color: var(--colorsTertiaryType5Medium, ${a(r.tertiaryType5Medium)});
  --bbva-amount-income-color: var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)});
}
${J.mediaRules()}`;const Z=new o;const Q={light:K,dark:t`[ambient^=dark] {
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-amount-uncovered-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-amount-income-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
}
${Z.mediaRules()}`},Y=new o;var tt=t`:host {
  --_amount-text-color: var(--bbva-amount-dark-mode-color, var(--bbva-amount-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_amount-uncovered-color: var(--bbva-amount-uncovered-dark-mode-color, var(--bbva-amount-uncovered-color, var(--colorsTertiaryType5Medium, ${a(r.tertiaryType5Medium)})));
  --_amount-income-color: var(--bbva-amount-income-dark-mode-color, var(--bbva-amount-income-color, var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)})));
  vertical-align: bottom;
  font-weight: var(--bbva-amount-font-weight, var(--fontFacePrimaryBookFontWeight, ${a(d.book.fontWeight)}));
  font-style: var(--fontFacePrimaryBookFontStyle, ${a(d.book.fontStyle)});
  color: var(--_amount-text-color);
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

.currency {
  float: var(--bbva-amount-currency-float, none);
}
.currency-left, .currency-right {
  vertical-align: top;
}

.currency-code {
  word-spacing: normal;
}

:host([variant=xs]) {
  font-size: var(--bbva-amount-xs-font-size, var(--typographyType3XSmall, ${a(s.type3XSmall)}));
  line-height: var(--bbva-amount-xs-line-height, var(--lineHeightType3XSmall, ${a(b.type3XSmall)}));
}

:host([variant=s]) {
  font-size: var(--bbva-amount-s-font-size, var(--typographyTypeXSmall, ${a(s.typeXSmall)}));
  line-height: var(--bbva-amount-s-line-height, var(--lineHeightTypeXSmall, ${a(b.typeXSmall)}));
}

:host([variant=m]) {
  font-size: var(--bbva-amount-m-font-size, var(--typographyTypeSmall, ${a(s.typeSmall)}));
  line-height: var(--bbva-amount-m-line-height, var(--lineHeightTypeSmall, ${a(b.typeSmall)}));
}

:host(:not([variant])) {
  font-size: var(--bbva-amount-font-size, var(--typographyTypeLarge, ${a(s.typeLarge)}));
  line-height: var(--bbva-amount-line-height, var(--lineHeightTypeLarge, ${a(b.typeLarge)}));
}
:host(:not([variant])) .currency {
  font-size: var(--bbva-amount-currency-font-size, var(--typographyType3XSmall, ${a(s.type3XSmall)}));
  line-height: var(--bbva-amount-currency-line-height, var(--lineHeightType3XSmall, ${a(b.type3XSmall)}));
}

:host([variant=l]) {
  font-size: var(--bbva-amount-l-font-size, var(--typographyTypeLarge, ${a(s.typeLarge)}));
  line-height: var(--bbva-amount-l-line-height, var(--lineHeightTypeLarge, ${a(b.typeLarge)}));
}
:host([variant=l]) .currency {
  font-size: var(--bbva-amount-l-currency-font-size, var(--typographyType3XSmall, ${a(s.type3XSmall)}));
  line-height: var(--bbva-amount-l-currency-line-height, var(--lineHeightType3XSmall, ${a(b.type3XSmall)}));
}

:host([variant=xl]) {
  font-size: var(--bbva-amount-xl-font-size, var(--typographyTypeXLarge, ${a(s.typeXLarge)}));
  line-height: var(--bbva-amount-xl-line-height, var(--lineHeightTypeXLarge, ${a(b.typeXLarge)}));
}
:host([variant=xl]) .currency {
  font-size: var(--bbva-amount-xl-currency-font-size, var(--typographyType3XSmall, ${a(s.type3XSmall)}));
  line-height: var(--bbva-amount-xl-currency-line-height, var(--lineHeightType3XSmall, ${a(b.type3XSmall)}));
}

:host([variant="3xl"]) {
  font-size: var(--bbva-amount-3xl-font-size, var(--typographyType3XLarge, ${a(s.type3XLarge)}));
  line-height: var(--bbva-amount-3xl-line-height, var(--lineHeightType3XLarge, ${a(b.type3XLarge)}));
}
:host([variant="3xl"]) .currency {
  font-size: var(--bbva-amount-3xl-currency-font-size, var(--typographyType3XSmall, ${a(s.type3XSmall)}));
  line-height: var(--bbva-amount-3xl-currency-line-height, var(--lineHeightType3XSmall, ${a(b.type3XSmall)}));
}

:host([variant="4xl"]) {
  font-size: var(--bbva-amount-4xl-font-size, 2rem);
  line-height: var(--bbva-amount-4xl-line-height, 2rem);
}
:host([variant="4xl"]) .currency {
  font-size: var(--bbva-amount-4xl-currency-font-size, var(--typographyTypeXLarge, ${a(s.typeXLarge)}));
  line-height: var(--bbva-amount-4xl-currency-line-height, var(--lineHeightTypeXLarge, ${a(b.typeXLarge)}));
}

:host([variant="5xl"]) {
  font-size: var(--bbva-amount-5xl-font-size, 3rem);
  line-height: var(--bbva-amount-5xl-line-height, 3rem);
}
:host([variant="5xl"]) .currency {
  font-size: var(--bbva-amount-5xl-currency-font-size, 1.75rem);
  line-height: var(--bbva-amount-5xl-currency-line-height, 2rem);
}

:host([type=uncovered]) {
  color: var(--_amount-uncovered-color);
}

:host([type=income]) {
  color: var(--_amount-income-color);
}
${Y.mediaRules()}`;class at extends(e(u(G))){static get is(){return"bbva-amount"}static get properties(){return{type:{type:String,reflect:!0},variant:{type:String,reflect:!0},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"},unit:{type:String,attribute:"unit",reflect:!0}}}constructor(){super(),this.language=document.documentElement.lang||"en"}static get styles(){return[super.styles,tt,Q.light,Q.dark,l("bbva-amount-shared-styles")]}update(t){super.update(t),t.has("unit")&&!this.symbol&&(this.symbol=this.unit)}get _currency(){return!this.showCurrencyCode&&super._currency}get _isNegative(){return(this._isUncovered()||this._negativeAmount)&&!this._isIncome()}_isUncovered(){return"uncovered"===this.type}_isIncome(){return"income"===this.type}_isPoints(){return"points"===this.type}_formattedAmountEventDetail(){return{...super._formattedAmountEventDetail(),full:this.srAmount}}get srAmount(){let t="";return this._isNegative&&!this._minusAfterSymbol&&(t="-"),this._isPoints()||!this._currency||this._alignRight||(t+=this._currency),this._isNegative&&this._minusAfterSymbol&&(t+="-"),t+=this._integerSrBlock,this._isPoints()||(this._currency&&this._alignRight&&(t=`${t} ${this._currency}`),this.showCurrencyCode&&(t=`${t} ${this.currencyCode}`)),t}_currencyTpl(t){return c` <span class="currency currency-${t}">${this._currency}</span> `}static _minusTpl(t){return c` <span class="minus minus-${t}">-</span> `}_currencyCodeTpl(){return c` <span class="currency-code">&nbsp;${this.currencyCode}</span> `}get _amountContentTpl(){return c`
      ${this._isNegative&&!this._minusAfterSymbol?at._minusTpl("left"):""}
      ${this._isPoints()||!this._currency||this._alignRight?"":this._currencyTpl("left")}
      ${this._isNegative&&this._minusAfterSymbol?at._minusTpl("right"):""}
      ${this._isValidAmount?this._validAmountTpl:""}
      ${!this._isPoints()&&this._currency&&this._alignRight?this._currencyTpl("right"):""}
      ${!this._isPoints()&&this.showCurrencyCode?this._currencyCodeTpl():""}
    `}}var ot={bbvaAmount:`\n    --bbva-amount-dark-mode-color: ${v("colors.primaryCoreLightened")};\n    --bbva-amount-uncovered-dark-mode-color: ${v("colors.tertiaryType1Light")};\n    --bbva-amount-income-dark-mode-color: ${v("colors.primarySubduedLight")};\n  `};var rt=t`[ambient^=light] {
  --bbva-button-default-color: initial;
  --bbva-button-default-bg-color: initial;
  --bbva-button-default-border-color: initial;
  --bbva-button-default-opacity: initial;
  --bbva-button-default-color-active: initial;
  --bbva-button-default-bg-color-active: initial;
  --bbva-button-default-border-color-active: initial;
  --bbva-button-default-opacity-active: initial;
  --bbva-button-default-color-disabled: initial;
  --bbva-button-default-bg-color-disabled: initial;
  --bbva-button-default-border-color-disabled: initial;
  --bbva-button-default-opacity-disabled: initial;
  --bbva-button-default-secondary-color: initial;
  --bbva-button-default-secondary-bg-color: initial;
  --bbva-button-default-secondary-border-color: initial;
  --bbva-button-default-secondary-opacity: initial;
  --bbva-button-default-secondary-outline-color: initial;
  --bbva-button-default-secondary-color-active: initial;
  --bbva-button-default-secondary-bg-color-active: initial;
  --bbva-button-default-secondary-border-color-active: initial;
  --bbva-button-default-secondary-opacity-active: initial;
  --bbva-button-default-secondary-color-disabled: initial;
  --bbva-button-default-secondary-bg-color-disabled: initial;
  --bbva-button-default-secondary-border-color-disabled: initial;
  --bbva-button-default-secondary-opacity-disabled: initial;
  --bbva-button-default-secondary-outline-color-disabled: initial;
  --bbva-button-default-positive-color: initial;
  --bbva-button-default-positive-bg-color: initial;
  --bbva-button-default-positive-border-color: initial;
  --bbva-button-default-positive-opacity: initial;
  --bbva-button-default-positive-color-active: initial;
  --bbva-button-default-positive-bg-color-active: initial;
  --bbva-button-default-positive-border-color-active: initial;
  --bbva-button-default-positive-opacity-active: initial;
  --bbva-button-default-positive-color-disabled: initial;
  --bbva-button-default-positive-bg-color-disabled: initial;
  --bbva-button-default-positive-border-color-disabled: initial;
  --bbva-button-default-positive-opacity-disabled: initial;
  --bbva-button-default-link-color: initial;
  --bbva-button-default-link-bg-color: initial;
  --bbva-button-default-link-border-color: initial;
  --bbva-button-default-link-opacity: initial;
  --bbva-button-default-link-outline-color: initial;
  --bbva-button-default-link-color-active: initial;
  --bbva-button-default-link-bg-color-active: initial;
  --bbva-button-default-link-border-color-active: initial;
  --bbva-button-default-link-opacity-active: initial;
  --bbva-button-default-link-color-disabled: initial;
  --bbva-button-default-link-bg-color-disabled: initial;
  --bbva-button-default-link-border-color-disabled: initial;
  --bbva-button-default-link-opacity-disabled: initial;
  --bbva-button-default-link-outline-color-disabled: initial;
  --bbva-button-default-icon-background: initial;
  --bbva-button-default-icon-color: initial;
  --bbva-button-default-icon-background-opacity: initial;
  --bbva-button-default-icon-color-variant: initial;
  --bbva-button-default-icon-color-variant-white: initial;
  --bbva-button-default-icon-background-focus: initial;
  --bbva-button-default-icon-color-focus: initial;
  --bbva-button-default-icon-color-focus-variant: initial;
  --bbva-button-default-icon-color-focus-variant-white: initial;
  --bbva-button-default-icon-background-disabled: initial;
  --bbva-button-default-icon-color-disabled: initial;
  --bbva-button-default-icon-color-disabled-variant: initial;
  --bbva-button-default-icon-color-disabled-variant-white: initial;
  --bbva-button-default-alert-opacity: initial;
  --bbva-button-default-alert-color: initial;
  --bbva-button-default-alert-bg-color: initial;
  --bbva-button-default-alert-active-color: initial;
  --bbva-button-default-alert-active-bg-color: initial;
  --bbva-button-default-alert-disabled-color: initial;
  --bbva-button-default-alert-disabled-bg-color: initial;
  --bbva-button-default-interaction-bg-color: initial;
  --bbva-button-default-interaction-icon-color: initial;
  --bbva-button-default-interaction-border-color: initial;
  --bbva-button-default-interaction-bg-glow-color: initial;
  --bbva-button-default-interaction-disabled-icon-color: initial;
  --bbva-button-default-interaction-disabled-bg-color: initial;
  --bbva-button-default-interaction-disabled-opacity: initial;
}
${(new o).mediaRules()}`;const et=new o;const it={light:rt,dark:t`[ambient^=dark] {
  --bbva-button-default-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-border-color: transparent;
  --bbva-button-default-opacity: 1;
  --bbva-button-default-color-active: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)});
  --bbva-button-default-border-color-active: transparent;
  --bbva-button-default-opacity-active: 1;
  --bbva-button-default-color-disabled: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryCore, ${a(r.primaryCore)});
  --bbva-button-default-border-color-disabled: transparent;
  --bbva-button-default-opacity-disabled: 0.4;
  --bbva-button-default-secondary-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-bg-color: transparent;
  --bbva-button-default-secondary-border-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity: 1;
  --bbva-button-default-secondary-outline-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-border-color-active: transparent;
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-secondary-color-disabled: var(--colorsSecondary400, ${a(r.secondary400)});
  --bbva-button-default-secondary-bg-color-disabled: transparent;
  --bbva-button-default-secondary-border-color-disabled: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity-disabled: 0.4;
  --bbva-button-default-secondary-outline-color-disabled: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-link-color: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-button-default-link-bg-color: transparent;
  --bbva-button-default-link-border-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-link-opacity: 1;
  --bbva-button-default-link-outline-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-link-color-active: var(--colorsPrimaryMediumLight, ${a(r.primaryMediumLight)});
  --bbva-button-default-link-bg-color-active: transparent;
  --bbva-button-default-link-border-color-active: transparent;
  --bbva-button-default-link-opacity-active: 1;
  --bbva-button-default-link-color-disabled: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-button-default-link-bg-color-disabled: transparent;
  --bbva-button-default-link-border-color-disabled: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-link-opacity-disabled: 0.4;
  --bbva-button-default-link-outline-color-disabled: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-positive-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-positive-bg-color: var(--colorsPrimaryVariantDark, ${a(r.primaryVariantDark)});
  --bbva-button-default-positive-border-color: transparent;
  --bbva-button-default-positive-opacity: 1;
  --bbva-button-default-positive-color-active: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-positive-bg-color-active: var(--colorsPrimaryVariantDarkened, ${a(r.primaryVariantDarkened)});
  --bbva-button-default-positive-border-color-active: transparent;
  --bbva-button-default-positive-opacity-active: 1;
  --bbva-button-default-positive-color-disabled: var(--colorsSecondary400, ${a(r.secondary400)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-positive-border-color-disabled: transparent;
  --bbva-button-default-positive-opacity-disabled: 0.4;
  --bbva-button-default-icon-background: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-icon-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-color-variant-white: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-icon-color-focus: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-icon-color-focus-variant: var(--colorsPrimaryMediumLight, ${a(r.primaryMediumLight)});
  --bbva-button-default-icon-color-focus-variant-white: var(--colorsPrimaryMediumLight, ${a(r.primaryMediumLight)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-icon-color-disabled: var(--colorsSecondary400, ${a(r.secondary400)});
  --bbva-button-default-icon-color-disabled-variant: var(--colorsSecondary400, ${a(r.secondary400)});
  --bbva-button-default-icon-color-disabled-variant-white: var(--colorsSecondary400, ${a(r.secondary400)});
  --bbva-button-default-alert-opacity: 0.4;
  --bbva-button-default-alert-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-alert-active-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-alert-disabled-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-icon-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-icon-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark200] {
  --bbva-button-default-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-secondary-color-active: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-secondary-bg-color-active: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-button-default-secondary-opacity-active: 1;
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-background: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark300] {
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-positive-bg-color-disabled: var(--colorsPrimaryCore, ${a(r.primaryCore)});
  --bbva-button-default-icon-background: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}

[ambient^=dark400] {
  --bbva-button-default-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-bg-color-active: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-bg-color-disabled: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-background: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-icon-background-opacity: 0.4;
  --bbva-button-default-icon-color-variant: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-button-default-icon-background-focus: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-icon-background-disabled: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-alert-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-alert-active-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-alert-disabled-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-border-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-bg-glow-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-button-default-interaction-disabled-bg-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-button-default-interaction-disabled-opacity: 0.4;
}
${et.mediaRules()}`},nt=new o;var lt=t`:host {
  box-sizing: border-box;
  position: relative;
  max-width: var(--bbva-button-default-max-width, 18rem);
  min-width: var(--bbva-button-default-min-width, 8rem);
  height: 3rem;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em) calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em);
  text-align: center;
  border-radius: var(--bbva-button-default-border-radius, var(--borderRadiusSmall, ${a(p.small)}));
  border: none;
  margin-left: var(--bbva-button-default-margin-left, 0);
  --_button-default-color: var(--bbva-button-default-dark-mode-color, var(--bbva-button-default-color,var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-bg-color: var(--bbva-button-default-bg-dark-mode-color, var(--bbva-button-default-bg-color,var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-opacity: var(--bbva-button-default-opacity, 1);
  --_button-default-color-active: var(--bbva-button-default-dark-mode-color-active, var(--bbva-button-default-color-active, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-bg-color-active: var(--bbva-button-default-bg-dark-mode-color-active, var(--bbva-button-default-bg-color-active, var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)})));
  --_button-default-opacity-active: var(--bbva-button-default-opacity-active, 1);
  --_button-default-bg-color-disabled: var(--bbva-button-default-bg-dark-mode-color-disabled, var(--bbva-button-default-bg-color-disabled,var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-color-disabled: var(--bbva-button-default-dark-mode-disabled,var(--bbva-button-default-color-disabled,var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-opacity-disabled: var(--bbva-button-default-dark-mode-opacity-disabled, var(--bbva-button-default-opacity-disabled, 1));
  --_button-default-color-secondary: var(--bbva-button-default-secondary-dark-mode-color, var(--bbva-button-default-secondary-color,var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-bg-color-secondary: var(--bbva-button-default-secondary-bg-color, transparent);
  --_button-default-opacity-secondary: var(--bbva-button-default-secondary-opacity, 1);
  --_button-default-border-color-secondary: var(--bbva-button-default-secondary-border-dark-mode-color, var(--bbva-button-default-secondary-border-color,var(--colorsSecondary300, ${a(r.secondary300)})));
  --_button-default-color-secondary-active: var(--bbva-button-default-secondary-dark-mode-color-active, var(--bbva-button-default-secondary-color-active,var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-bg-color-secondary-active: var(--bbva-button-default-secondary-bg-dark-mode-color-active, var(--bbva-button-default-secondary-bg-color-active,var(--colorsSecondary100, ${a(r.secondary100)})));
  --_button-default-border-color-secondary-active: var(--bbva-button-default-secondary-border-color-active, transparent);
  --_button-default-opacity-secondary-active: var(--bbva-button-default-secondary-opacity-active, 1);
  --_button-default-color-secondary-disabled: var(--bbva-button-default-secondary-dark-mode-color-disabled, var(--bbva-button-default-secondary-color-disabled,var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-bg-color-secondary-disabled: var(--bbva-button-default-secondary-bg-dark-mode-color-disabled, var(--bbva-button-default-secondary-bg-color-disabled,var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-border-color-secondary-disabled: var(--bbva-button-default-border-dark-mode-color-disabled, var(--bbva-button-default-secondary-border-color-disabled, transparent));
  --_button-default-opactiy-secondary-disabled: var(--bbva-button-default-secondary-opacity-disabled, 0.4);
  --_button-default-color-link: var(--bbva-button-default-link-dark-mode-color, var(--bbva-button-default-link-color,var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-bg-color-link: transparent;
  --_button-default-opacity-link: var(--bbva-button-default-link-opacity, 1);
  --_button-default-border-color-link: var(--bbva-button-default-link-border-color,var(--colorsSecondary300, ${a(r.secondary300)}));
  --_button-default-color-link-active: var(--bbva-button-default-link-dark-mode-color-active, var(--bbva-button-default-link-color-active, var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)})));
  --_button-default-bg-color-link-active: var(--bbva-button-default-link-bg-color-active, transparent);
  --_button-default-border-color-link-active: var(--bbva-button-default-link-border-color-active, transparent);
  --_button-default-opacity-link-active: var(--bbva-button-default-link-opacity-active, 1);
  --_button-default-color-link-disabled: var(--bbva-button-default-link-dark-mode-color-disabled, var(--bbva-button-default-link-color-disabled,var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-bg-color-link-disabled: var(--bbva-button-default-link-bg-color-disabled,var(--colorsSecondary200, ${a(r.secondary200)}));
  --_button-default-border-color-link-disabled: var(--bbva-button-default-link-border-color-disabled, transparent);
  --_button-default-opactiy-link-disabled: var(--bbva-button-default-link-opacity-disabled, 0.4);
  --_button-default-color-positive: var(--bbva-button-default-positive-dark-mode-color, var(--bbva-button-default-positive-color,var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-bg-color-positive: var(--bbva-button-default-positive-bg-dark-mode-color, var(--bbva-button-default-positive-bg-color,var(--colorsPrimaryVariantDark, ${a(r.primaryVariantDark)})));
  --_button-default-opacity-positive: var(--bbva-button-default-positive-opacity, 1);
  --_button-default-color-positive-active: var(--bbva-button-default-positive-dark-mode-color-active, var(--bbva-button-default-positive-color-active,var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-bg-color-positive-active: var(--bbva-button-default-positive-bg-dark-mode-color-active, var(--bbva-button-default-positive-bg-color-active,var(--colorsPrimaryVariantDarkened, ${a(r.primaryVariantDarkened)})));
  --_button-default-opacity-positive-active: var(--bbva-button-default-positive-opacity-active, 1);
  --_button-default-color-positive-disabled: var(--bbva-button-default-positive-dark-mode-color-disabled, var(--bbva-button-default-positive-color-disabled,var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-bg-color-positive-disabled: var(--bbva-button-default-positive-bg-dark-mode-color-disabled, var(--bbva-button-default-positive-bg-color-disabled,var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-opacity-positive-disabled: var(--bbva-button-default-positive-opacity-disabled, 0.4);
  --_button-default-bg-icon: var(--bbva-button-default-icon-dark-mode-background, var(--bbva-button-default-icon-background, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-bg-icon-focus: var(--bbva-button-default-icon-dark-mode-background-focus, var(--bbva-button-default-icon-background-focus, var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)})));
  --_button-default-bg-icon-disabled: var(--bbva-button-default-icon-dark-mode-background-disabled, var(--bbva-button-default-icon-background-disabled, var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-color-icon: var(--bbva-button-default-icon-dark-mode-color, var(--bbva-button-default-icon-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-color-icon-focus: var(--bbva-button-default-icon-dark-mode-color-focus, var(--bbva-button-default-icon-color-focus, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-color-icon-disabled: var(--bbva-button-default-icon-dark-mode-color-disabled, var(--bbva-button-default-icon-color-disabled, var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-bg-icon-opacity: var(--bbva-button-default-icon-dark-mode-background-opacity, var(--bbva-button-default-icon-background-opacity, 1));
  --_button-default-color-icon-variant: var(--bbva-button-default-icon-dark-mode-color-variant, var(--bbva-button-default-icon-color-variant, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-color-icon-focus-variant: var(--bbva-button-default-icon-dark-mode-color-focus-variant, var(--bbva-button-default-icon-color-focus-variant, var(--colorsPrimaryCore, ${a(r.primaryCore)})));
  --_button-default-color-icon-disabled-variant: var(--bbva-button-default-icon-dark-mode-color-disabled-variant, var(--bbva-button-default-icon-color-disabled-variant, var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-color-icon-variant-white: var(--bbva-button-default-icon-dark-mode-color-variant-white, var(--bbva-button-default-icon-color-variant-white, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-color-icon-focus-variant-white: var(--bbva-button-default-icon-dark-mode-color-focus-variant-white, var(--bbva-button-default-icon-color-focus-variant-white, var(--colorsPrimaryCore, ${a(r.primaryCore)})));
  --_button-default-color-icon-disabled-variant-white: var(--bbva-button-default-icon-dark-mode-color-disabled-variant-white, var(--bbva-button-default-icon-color-disabled-variant-white, var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-alert-opacity: var(--bbva-button-default-alert-dark-mode-opacity, var(--bbva-button-default-alert-opacity, 1));
  --_button-default-alert-color: var(--bbva-button-default-alert-dark-mode-color, var(--bbva-button-default-alert-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-alert-bg-color: var(--bbva-button-default-alert-dark-mode-bg-color, var(--bbva-button-default-alert-bg-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-alert-active-color: var(--bbva-button-default-alert-dark-mode-active-color, var(--bbva-button-default-alert-active-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-alert-active-bg-color: var(--bbva-button-default-alert-dark-mode-active-bg-color, var(--bbva-button-default-alert-active-bg-color, var(--colorsPrimaryCoreLight, ${a(r.primaryCoreLight)})));
  --_button-default-alert-disabled-color: var(--bbva-button-default-alert-dark-mode-disabled-color, var(--bbva-button-default-alert-disabled-color, var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-alert-disabled-bg-color: var(--bbva-button-default-alert-dark-mode-disabled-bg-color, var(--bbva-button-default-alert-disabled-bg-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-interaction-bg-color: var(--bbva-button-default-interaction-dark-mode-bg-color, var(--bbva-button-default-interaction-bg-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-interaction-bg-glow-color: var(--bbva-button-default-interaction-dark-mode-bg-glow-color, var(--bbva-button-default-interaction-bg-glow-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-interaction-icon-color: var(--bbva-button-default-interaction-dark-mode-icon-color, var(--bbva-button-default-interaction-icon-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_button-default-interaction-border-color: var(--bbva-button-default-interaction-dark-mode-border-color, var(--bbva-button-default-interaction-border-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_button-default-interaction-disabled-icon-color: var(--bbva-button-default-interaction-dark-mode-disabled-icon-color, var(--bbva-button-default-interaction-disabled-icon-color, var(--colorsSecondary400, ${a(r.secondary400)})));
  --_button-default-interaction-disabled-bg-color: var(--bbva-button-default-interaction-dark-mode-disabled-bg-color, var(--bbva-button-default-interaction-disabled-bg-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --_button-default-interaction-disabled-opacity: var(--bbva-button-default-interaction-dark-mode-disabled-opacity, var(--bbva-button-default-interaction-disabled-opacity, 1));
  transition: background-color var(--fast-transition, 0.2s), color var(--fast-transition, 0.2s);
}

.text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  display: block;
}

:host, [data-tag-name=bbva-text] {
  font-size: var(--bbva-button-default-font-size, var(--typographyTypeSmall, ${a(s.typeSmall)}));
  line-height: var(--bbva-button-default-line-height, var(--lineHeightTypeSmall, ${a(b.typeSmall)}));
  font-weight: var(--bbva-button-default-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)}));
}

.icon {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}

.wrapper {
  display: contents;
}

button {
  box-sizing: border-box;
  padding: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host(:focus) {
  outline: none;
}

:host(:not([href])) {
  color: var(--_button-default-color);
  border: none;
  border-radius: var(--bbva-button-default-border-radius, var(--borderRadiusSmall, ${a(p.small)}));
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em) calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em);
}

:host([aria-disabled=true]) {
  color: var(--_button-default-color-disabled);
}

:host,
:host(.primary),
:host([variant=primary]) {
  color: var(--_button-default-color);
  background-color: var(--_button-default-bg-color);
  opacity: var(--_button-default-opacity);
}
:host [data-tag-name=bbva-text],
:host(.primary) [data-tag-name=bbva-text],
:host([variant=primary]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color);
}

:host(.primary[active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host(.primary),
:host([variant=primary]:not([href])[active]:not([aria-disabled=true])) {
  background-color: var(--_button-default-bg-color-active);
  color: var(--_button-default-color-active);
}

:host([active]),
:host(.primary[active]),
:host([variant=primary][active]) {
  color: var(--_button-default-color-active);
  background-color: var(--_button-default-bg-color-active);
  opacity: var(--_button-default-opacity-active);
}

:host([aria-disabled=true]),
:host(.primary[aria-disabled=true]),
:host([variant=primary][aria-disabled=true]) {
  color: var(--_button-default-color-disabled);
  background-color: var(--_button-default-bg-color-disabled);
  opacity: var(--_button-default-opacity-disabled);
}

:host(.secondary),
:host([variant=secondary]) {
  color: var(--_button-default-color-secondary);
  background-color: var(--_button-default-bg-color-secondary);
  opacity: var(--_button-default-opacity-secondary);
  border: 1px solid var(--_button-default-border-color-secondary);
}
:host(.secondary) [data-tag-name=bbva-text],
:host([variant=secondary]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-secondary);
}

:host(.secondary[active]),
:host([variant=secondary][active]),
:host([variant=secondary][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-secondary-active);
  background-color: var(--_button-default-bg-color-secondary-active);
  border-color: var(--_button-default-border-color-secondary-active);
  opacity: var(--_button-default-opacity-secondary-active);
}

:host(.secondary[aria-disabled=true]),
:host([variant=secondary][aria-disabled=true]) {
  color: var(--_button-default-color-secondary-disabled);
  background-color: var(--_button-default-bg-color-secondary-disabled);
  border-color: var(--_button-default-border-color-secondary-disabled);
  opacity: var(--_button-default-opactiy-secondary-disabled);
}

:host(.positive),
:host([variant=positive]) {
  color: var(--_button-default-color-positive);
  background-color: var(--_button-default-bg-color-positive);
  opacity: var(--_button-default-opacity-positive);
}
:host(.positive) [data-tag-name=bbva-text],
:host([variant=positive]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-positive);
}

:host(.positive[active]),
:host([variant=positive][active]),
:host([variant=positive][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-positive-active);
  background-color: var(--_button-default-bg-color-positive-active);
  opacity: var(--_button-default-opacity-positive-active);
}

:host(.positive[aria-disabled=true]),
:host([variant=positive][aria-disabled=true]) {
  color: var(--_button-default-color-positive-disabled);
  background-color: var(--_button-default-bg-color-positive-disabled);
  opacity: var(--_button-default-opacity-positive-disabled);
}

:host(.link),
:host([variant=link]) {
  color: var(--_button-default-color-link);
  background-color: var(--_button-default-bg-color-link, transparent);
  opacity: var(--_button-default-opacity-link);
  border: none;
  padding: 0;
  min-width: max-content;
  max-width: max-content;
  height: max-content;
}
:host(.link) [data-tag-name=bbva-text],
:host([variant=link]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color-link);
}

:host(.link[active]),
:host([variant=link][active]),
:host([variant=link][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-link-active);
  background-color: var(--_button-default-bg-color-link-active);
  opacity: var(--_button-default-opacity-link-active);
}

:host(.link[aria-disabled=true]),
:host([variant=link][aria-disabled=true]) {
  color: var(--_button-default-color-link-disabled);
  opacity: var(--_button-default-opactiy-link-disabled);
}

:host(.icon),
:host([variant~=icon]) {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  box-sizing: border-box;
  max-width: var(--bbva-button-default-min-width, 3rem);
  min-width: var(--bbva-button-default-min-width, 3rem);
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em) 0 calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em);
}

:host([variant=icon]:focus) {
  outline: none;
}

:host([variant=icon]:not([href])) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(p.small)}));
  background-color: var(--_button-default-bg-icon);
  color: var(--_button-default-color-icon);
}

:host([variant=icon][disabled]),
:host([variant=icon]:not([href])[disabled]) {
  border: none;
  background-color: var(--_button-default-bg-icon-disabled);
  color: var(--_button-default-color-icon-disabled);
  opacity: var(--_button-default-bg-icon-opacity);
}

:host([variant=icon][focus-visible]),
:host([variant=icon][active]),
:host([variant=icon]:not([href])[active]),
:host([variant=icon]:not([href])[active]:not([disabled])) {
  border: none;
  border-radius: var(--bbva-button-default-icon-border-radius, var(--borderRadiusSmall, ${a(p.small)}));
  background-color: var(--_button-default-bg-icon-focus);
  color: var(--_button-default-color-icon-focus);
}

:host([variant=icon][hidden]),
[hidden] {
  display: none !important;
}

:host([variant~=icon][variant~=no-background]) {
  border: 1px solid var(--colorsSecondary300, ${a(r.secondary300)});
  --_button-default-bg-icon: transparent;
  --_button-default-bg-icon-focus: transparent;
  --_button-default-bg-icon-disabled: transparent;
  border: none;
  border-radius: 0.0625rem;
}

:host([variant~=icon][variant~=no-background]:not([href])) {
  color: var(--_button-default-color-icon-variant);
  background: transparent;
}

:host([variant~=icon][variant~=no-background][variant~=white]:not([href])) {
  color: var(--_button-default-color-icon-variant-white);
}

:host([variant~=icon][variant~=no-background][disabled]:not([href])[disabled]) {
  color: var(--_button-default-color-icon-disabled-variant);
  opacity: 0.4;
}

:host([variant~=icon][variant~=no-background][variant~=white][disabled]:not([href])[disabled]) {
  color: var(--_button-default-color-icon-disabled-variant-white);
  opacity: 0.4;
}

:host([variant~=icon][variant~=no-background][active]:not([href])[active]:not([href])[active]:not([disabled])) {
  color: var(--_button-default-color-icon-focus-variant);
}

:host([variant~=icon][variant~=no-background][variant~=white][active]:not([href])[active]:not([href])[active]:not([disabled])) {
  color: var(--_button-default-color-icon-focus-variant-white);
}

:host(.alert),
:host([variant=alert]) {
  color: var(--_button-default-color);
  opacity: var(--_button-default-opacity);
  border: none;
  max-width: var(--bbva-button-default-max-width);
  min-width: var(--bbva-button-default-min-width, 16rem);
  height: 2.5rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em);
  font-size: var(--bbva-button-default-alert-font-size, var(--typographyTypeSmall, ${a(s.typeSmall)}));
  line-height: var(--bbva-button-default-alert-line-height, var(--lineHeightTypeSmall, ${a(b.typeSmall)}));
  font-weight: var(--bbva-button-default-alert-font-weight, var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)}));
  font-style: var(--bbva-button-default-alert-font-style, var(--fontFacePrimaryMediumFontStyle, ${a(d.medium.fontStyle)}));
  background-color: var(--bbva-button-default-alert-bg-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)}));
}
:host(.alert) [data-tag-name=bbva-text],
:host([variant=alert]) [data-tag-name=bbva-text] {
  color: var(--_button-default-color);
}

:host(.alert[active]),
:host([variant=alert][active]),
:host([variant=alert][active]:not([aria-disabled=true])) {
  color: var(--_button-default-color-active);
  background-color: var(--_button-default-bg-color-active);
  opacity: var(--_button-default-opacity-active);
}

:host(.alert[aria-disabled=true]),
:host([variant=alert][aria-disabled=true]) {
  opacity: var(--_button-default-alert-opacity);
  color: var(--_button-default-alert-disabled-color);
  background: var(--_button-default-alert-disabled-bg-color);
}

:host([variant=alert]:not([href])) {
  border-radius: var(--borderRadiusSmall, ${a(p.small)});
  border: var(--bbva-button-default-alert-border, none);
  color: var(--_button-default-alert-color);
}

:host([variant=alert]:not([href])[active]:not([aria-disabled=true])) {
  color: var(--_button-default-alert-active-color);
  background: var(--_button-default-alert-active-bg-color);
}

:host(.interaction),
:host([variant~=interaction]) {
  padding: 0;
  right: 0;
  box-sizing: border-box;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  max-width: var(--bbva-button-default-max-width, 3rem);
  min-width: var(--bbva-button-default-min-width, 3rem);
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

.transcript {
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 15) * 1em);
  border: 0;
}

.action::before {
  content: "";
  display: block;
  position: absolute;
  left: 0;
  top: 0;
  bottom: 0;
  right: 0;
  background-color: var(--_button-default-interaction-bg-color);
}
:host([variant~=interaction][talking]) .action::before {
  background-color: transparent;
}
.action-icon {
  position: relative;
  color: var(--_button-default-interaction-icon-color);
}
:host([variant~=interaction][disabled]) .action {
  cursor: default;
  pointer-events: none;
  opacity: var(--_button-default-interaction-disabled-opacity);
}
:host([variant~=interaction][disabled]) .action-icon {
  color: var(--_button-default-interaction-disabled-icon-color);
}
:host([variant~=interaction][disabled]) .action::before {
  background-color: var(--_button-default-interaction-disabled-bg-color);
}
.action-glow .before {
  display: none;
  position: absolute;
  left: 50%;
  top: 50%;
  background-color: var(--_button-default-interaction-border-color);
  border-radius: 50%;
  width: 6rem;
  height: 6rem;
  transform: translate(-50%, -50%) scale(1);
  animation: lowerpulse 2s infinite;
  animation-play-state: paused;
}
:host([variant~=interaction][talking]) .action-glow .before {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .before {
  animation: animationempty;
}
.action-glow .after {
  display: none;
  position: absolute;
  left: 50%;
  top: 50%;
  background-color: var(--_button-default-interaction-bg-glow-color);
  border-radius: 50%;
  transform: translate(-50%, -50%) scale(1);
  width: 5rem;
  height: 5rem;
  animation: upperpulse 2s infinite;
  animation-play-state: paused;
}
:host([variant~=interaction][talking]) .action-glow .after {
  display: block;
  animation-play-state: running;
}
:host([variant~=interaction]:not([talking])) .action-glow .after {
  animation: animationempty;
}

/* MIC LISTENING ANIMATION */
@keyframes lowerpulse {
  0% {
    transform: translate(-50%, -50%) scale(0);
    opacity: 0;
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
    opacity: 0.4;
  }
  100% {
    transform: translate(-50%, -50%) scale(0);
    opacity: 0;
  }
}
@keyframes upperpulse {
  0% {
    transform: translate(-50%, -50%) scale(0.81);
  }
  50% {
    transform: translate(-50%, -50%) scale(1);
  }
  100% {
    transform: translate(-50%, -50%) scale(0.81);
  }
}
@keyframes animationempty {
  0%, 100% {
    display: block;
  }
}
${nt.mediaRules()}`;class ct extends(e(g(h))){static get is(){return"bbva-button-default"}static get properties(){return{text:{type:String},icon:{type:String},buttonTranscriptLabel:{type:String,attribute:"button-transcript-label"},interaction:{type:Boolean},keepTalkingAnimation:{type:Boolean,attribute:"keep-talking-animation"},iconTalkingAnimation:{type:"String",attribute:"icon-talking-animation"},hasEllipsis:{type:Boolean,attribute:"has-ellipsis"}}}static get scopedElements(){return{"bbva-icon":y,"bbva-text":f}}constructor(){super(),this.type="button",this.buttonTranscriptLabel="bbva-button-default-interaction-record-button",this.interaction=!1,this.keepTalkingAnimation=!1,this.iconTalkingAnimation=k(),this.hasEllipsis=!1,delete this.href}static get styles(){return[super.styles,lt,it.light,it.dark,l("bbva-button-default-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._endRecord=this._endRecord.bind(this)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),document.removeEventListener("mouseup",this._endRecord)}get _talking(){return this._isTalking}_startRecord(){document.addEventListener("mouseup",this._endRecord),this._talking=!0,this.keepTalkingAnimation&&(this.icon=this.iconTalkingAnimation)}set _talking(t){t!==this._isTalking&&(t?(this.setAttribute("talking",""),this.dispatchEvent(new CustomEvent("button-interaction-mic-request",{detail:!0,composed:!0,bubbles:!0}))):(this.removeAttribute("talking"),this.dispatchEvent(new CustomEvent("button-interaction-mic-cancel",{detail:!0,composed:!0,bubbles:!0}))),this._isTalking=t,this.requestUpdate())}_keydownRecord(t){32!==t.keyCode&&13!==t.keyCode||this._startRecord()}_keyupRecord(t){32!==t.keyCode&&13!==t.keyCode||this._endRecord()}_endRecord(){document.removeEventListener("mouseup",this._endRecord);this._isTalkingAnimation||!this.keepTalkingAnimation?(this._talking=!1,this._isTalkingAnimation=!1,this.icon=_()):this._isTalkingAnimation=!0}get _icon(){return c` <bbva-icon class="icon" .icon="${this.icon}" size="24"></bbva-icon> `}get _text(){return void 0!==this.text?c` <bbva-text class="text" tag="span" .text=${this.text} ?ellipsis="${this.hasEllipsis}"></bbva-text> `:c` <slot class="text"></slot> `}get _interaction(){return c`
      <button
        class="action transcript"
        @mousedown="${this._startRecord}"
        @keydown="${this._keydownRecord}"
        @keyup="${this._keyupRecord}"
        @blur="${this._endRecord}"
      >
        <span id="action-container" class="action-glow">
          <span class="before"></span><span class="after"></span>
        </span>
        <span class="sr-only">${this.t(this.buttonTranscriptLabel)}</span>
        <bbva-icon class="action-icon" .icon="${this.icon}" size="24"></bbva-icon>
      </button>
    `}get _buttonDefault(){return this.interaction?c`${this._interaction}`:c`${void 0!==this.icon?this._icon:$}${this._text}${this._action}`}render(){return c`
    <div onclick="void(0)" class="wrapper">
      ${this._buttonDefault}
    </div>
    `}}v("colors.primaryCoreLightened"),v("colors.primaryMedium"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLight"),v("colors.primaryCoreLightened"),v("colors.primaryMedium"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primarySubduedLight"),v("colors.cool90"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primarySubdued"),v("colors.primaryMediumLight"),v("colors.primarySubdued"),v("colors.primaryCoreLightened"),v("colors.primaryVariantDark"),v("colors.primaryCoreLightened"),v("colors.primaryVariantDarkened"),v("colors.primaryCoreLightened"),v("colors.primaryVariantDark"),v("colors.primaryMedium"),v("colors.primaryCoreLight"),v("colors.primaryCoreLight"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryMedium"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLight"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLight"),v("colors.primaryMedium"),v("colors.primaryCoreLight"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLight"),v("colors.primaryCoreLightened"),v("colors.primaryMedium");var st=t`

:host {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  position: relative;
  vertical-align: middle;
  flex: var(--bbva-core-icon-flex, none);
  fill: var(--bbva-core-icon-fill-color, currentcolor);
  fill-rule: evenodd;
  stroke: var(--bbva-core-icon-stroke-color, none);
  width: var(--bbva-core-icon-width, var(--bbva-core-icon-size, var(--bbva-core-icon-svg-width, 1.5rem)));
  height: var(--bbva-core-icon-height, var(--bbva-core-icon-size, var(--bbva-core-icon-svg-height, 1.5rem)));
}

:host([hidden]), [hidden] {
  display: none !important;
}

::slotted(img) {
  width: 100%;
  height: auto;
}
`;class bt extends n{static get is(){return"bbva-core-icon"}static get properties(){return{icon:{type:String},src:{type:String},size:{type:Number},width:{type:Number},height:{type:Number},slotName:{type:String,attribute:"slot-name"},alt:{type:String},_isAttached:{type:Boolean,attribute:!1},_svgIcon:{type:Object,attribute:!1}}}constructor(){super(),this.alt="",this.slotName="_icon",this._iconsetListenerCallback=this._updateIcon.bind(this),this._meta=new S({type:"iconset"})}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._cleanSlot(),this._isAttached=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._isAttached=!1}static get _DEFAULT_ICONSET(){return"icons"}updated(t){(t.has("_meta")||t.has("_isAttached"))&&this._updateIcon(),(t.has("src")||t.has("_isAttached"))&&this._srcChanged(this.src),(t.has("icon")||t.has("_isAttached"))&&this._iconChanged(this.icon),t.has("size")&&(this.style.setProperty("width",this.size/16+"rem"),this.style.setProperty("height",this.size/16+"rem")),t.has("width")&&this.style.setProperty("width",this.width/16+"rem"),t.has("height")&&this.style.setProperty("height",this.height/16+"rem"),(t.has("alt")||t.has("_svgIcon"))&&(this._img?this._img.alt=this.alt:this._svgIcon&&(this.alt?(this._svgIcon.setAttribute("aria-label",this.alt),this._svgIcon.removeAttribute("aria-hidden")):(this._svgIcon.setAttribute("aria-hidden","true"),this._svgIcon.removeAttribute("aria-label"))))}static get styles(){return[st,l("bbva-core-icon-shared-styles")]}render(){return c` <slot name="${this.slotName}"></slot>
      <slot></slot>`}_iconChanged(t){if(void 0===t||"undefined"===t)return;const a=(t||"").split(":");this._iconName=a.pop(),this._iconsetName=a.pop()||this.constructor._DEFAULT_ICONSET,this._updateIcon()}_srcChanged(){this._updateIcon()}_cleanSlot(){const t=this.querySelector(`[slot=${this.slotName}]`);!this._iconset&&t&&this.removeChild(t)}_usesIconset(){return this.icon||!this.src}_updateIcon(){this._usesIconset()?(this._img&&this._img.parentNode&&this.removeChild(this._img),""===this._iconName?this._iconset&&this._iconset.removeIcon(this):this._iconsetName&&this._meta&&(this._iconset=this._meta.byKey(this._iconsetName),this._iconset?(this._iconset.applyIcon(this,this._iconName,this.slotName),this._svgIcon=this.querySelector("svg"),window.removeEventListener("bbva-core-iconset-added",this._iconsetListenerCallback)):window.addEventListener("bbva-core-iconset-added",this._iconsetListenerCallback))):(this._iconset&&this._iconset.removeIcon(this),this._img||(this._img=document.createElement("img"),this._img.draggable=!1,this._img.alt=this.alt,this.slotName&&this._img.setAttribute("slot",this.slotName)),this._img.src=this.src,this.appendChild(this._img))}}var dt=t`[ambient^=light] {
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
${(new o).mediaRules()}`;const ut=new o;var vt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${a(r.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${a(r.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${a(r.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
}
${ut.mediaRules()}`;const mt={dark:t`
    ${L.dark}
    ${Q.dark}
    ${P.dark}
    ${vt}
  `,light:t`
    ${L.light}
    ${Q.light}
    ${P.light}
    ${dt}
  `},pt=new o;var gt=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${a(r.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${a(r.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem));
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
  overflow: hidden;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
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
:host([description-medium]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(d.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(d.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(d.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(d.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(d.mediumItalic.fontStyle)});
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
:host([variant=stacked-center]) .wrapper [data-tag-name="bbva-link,"] [data-tag-name=bbva-text],
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}
${pt.mediaRules()}`;class ht extends(w(u(i(T(e(g(n))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[at,I,V,f,bt];return ht.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},statusAccessibilityText:{type:String,attribute:"status-accessibility-text"},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.statusAccessibilityText="bbva-list-simple-status-accessibility-text",this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0}static get styles(){return[super.styles,gt,mt.light,mt.dark,M("button:focus"),l("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return c`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
      >
      </bbva-amount>
    `}get _icon(){return c`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return c`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return c`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return c`
      <span class="sr-only">${this.t(this.statusAccessibilityText)}</span>
      <bbva-badge-variability .status=${t} .color=${this.color}></bbva-badge-variability>
    `}get _mask(){const t=D(this.mask,this.maskChars,!0,this.visibleChars);return c`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,a="";return this.description?(t=this._tplText("description"),a="description"):this.mask?(t=this._mask,a="mask"):this._isValidAmount&&(t=this._amount,a="amount"),c`
      <dd class="wrapper-${a}">
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){return c`
      <bbva-link
        class=${A({ellipsis:this[`${t}Ellipsis`]})}
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${z(this.roleLink)} aria-live=${z(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const a=`${t}AccessibilityText`,o=`${t}TagText`,r=`${t}RoleText`,e=`${t}AriaLiveText`;return c`
      <bbva-text
        aria-label="${this.t(this[a])}"
        role=${z(this[r])}
        aria-live=${z(this[e])}
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag=${z(this[o])}
      >
      </bbva-text>
    `}_tplText(t){return c` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const a=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${a}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return c`
      <dl>
        <dt>${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}</dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return c`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?c`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const a=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||a?a?this.renderStacked():this.renderDefault():this._tplText("label"):c` <div class="wrapper-description">${this._tplText("description")}</div> `,c`
      ${t}
      <div class="skeleton"></div>
    `}}v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.cool60"),v("colors.primaryCoreLightened"),v("colors.primarySubdued"),v("colors.primaryMediumLight"),v("colors.primarySubdued"),v("colors.primaryMediumLight"),v("colors.cool50");const yt=new o;var ft=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1em);
  position: relative;
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${a(r.primarySubduedLight)})));
  --_notification-message-icon-color: var(--bbva-notification-message-dark-mode-icon-color, var(--bbva-notification-message-icon-color, var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)})));
  --_notification-message-information-icon-color: var(--bbva-notification-message-dark-mode-information-icon-color, var(--bbva-notification-message-information-icon-color, var(--colorsTertiaryType3Dark, ${a(r.tertiaryType3Dark)})));
  --_notification-message-success-icon-color: var(--bbva-notification-message-dark-mode-success-icon-color, var(--bbva-notification-message-success-icon-color, var(--colorsTertiaryType6Dark, ${a(r.tertiaryType6Dark)})));
  --_notification-message-error-icon-color: var(--bbva-notification-message-dark-mode-error-icon-color, var(--bbva-notification-message-error-icon-color, var(--colorsTertiaryType1Dark, ${a(r.tertiaryType1Dark)})));
  --_notification-message-sustainability-icon-color: var(--bbva-notification-message-dark-mode-sustainability-icon-color, var(--bbva-notification-message-sustainability-icon-color, var(--colorsPrimaryVariantDark, ${a(r.primaryVariantDark)})));
  --_notification-message-information-background-color: var(--bbva-notification-message-dark-mode-information-background-color, var(--bbva-notification-message-information-background-color, var(--colorsTertiaryType3Lightened, ${a(r.tertiaryType3Lightened)})));
  --_notification-message-success-background-color: var(--bbva-notification-message-dark-mode-success-background-color, var(--bbva-notification-message-success-background-color, var(--colorsTertiaryType6Lightened, ${a(r.tertiaryType6Lightened)})));
  --_notification-message-error-background-color: var(--bbva-notification-message-dark-mode-error-background-color, var(--bbva-notification-message-error-background-color, var(--colorsTertiaryType5Lightened, ${a(r.tertiaryType5Lightened)})));
  --_notification-message-sustainability-background-color: var(--bbva-notification-message-dark-mode-sustainability-background-color, var(--bbva-notification-message-sustainability-background-color, var(--colorsPrimaryVariantLightened, ${a(r.primaryVariantLightened)})));
  --_notification-message-title-color: var(--bbva-notification-message-dark-mode-title-color, var(--bbva-notification-message-title-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_notification-message-paragraph-color: var(--bbva-notification-message-dark-mode-paragraph-color, var(--bbva-notification-message-paragraph-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_text-weight: var(--bbva-notification-message-dark-mode-text-weight, var(--bbva-notification-message-text-weight, var(--fontFacePrimaryBookFontWeight, ${a(d.book.fontWeight)})));
  --skeleton-quote-color: var(--bbva-notification-message-dark-mode-skeleton-color, var(--bbva-notification-message-skeleton-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --skeleton-quote-bg: var(--bbva-notification-message-dark-mode-skeleton-bg-color, var(--bbva-notification-message-skeleton-bg-color, var(--colorsPrimarySubduedLight, ${a(r.primarySubduedLight)})));
  --_notification-message-skeleton-animated-layer-bg: var(--bbva-notification-message-dark-mode-skeleton-animated-layer-bg-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)}));
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

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-size: var(--bbva-notification-message-title-size, var(--typographyTypeLarge, ${a(s.typeLarge)}));
}

.paragraph {
  padding: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-paragraph-color);
  font-weight: var(--bbva-notification-message-paragraph-weight, var(--_text-weight));
  font-size: var(--bbva-notification-message-paragraph-size, var(--typographyTypeSmall, ${a(s.typeSmall)}));
  line-height: var(--bbva-notification-message-line-height, var(--lineHeightTypeSmall, ${a(b.typeSmall)}));
}

:host([hide-bottom-padding-paragraph]) > .paragraph {
  padding: 0;
}

.description {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  color: var(--_notification-message-title-color);
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(d.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(d.medium.fontWeight)});
}

:host([description][description-text-italic]) > .description {
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(d.mediumItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(d.mediumItalic.fontWeight)});
}

[data-tag-name=bbva-icon] {
  margin: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
  --bbva-icon-color: var(--_notification-message-icon-color);
}

[data-tag-name=bbva-link] {
  padding: 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(m.spacer)}))) / 16) * 1rem);
}

:host([hide-bottom-padding-link]) [data-tag-name=bbva-link] {
  padding: 0;
}

[data-tag-name=bbva-button-icon] {
  position: absolute;
  top: 0;
  right: 0;
}

:host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([variant=information]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-information-icon-color);
}

:host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([variant=success]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-success-icon-color);
}

:host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([variant=error]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-error-icon-color);
}

:host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([variant=sustainability]) [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_notification-message-sustainability-icon-color);
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  opacity: 1;
  height: 10.125rem;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 24px 24px, calc((87% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((64.5% * 2) + (16px/ 2)) 16px;
  background-position: 50% 32px, -7% 72px, -7% 96px, -17.3% 120px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: inherit;
  top: 0;
  right: 0;
  left: 6.25rem;
}
:host([loading]):host([variant=default]) .skeleton {
  background-color: var(--bbva-notification-message-dark-mode-background-color, var(--bbva-notification-message-background-color, var(--colorsPrimarySubduedLight, ${a(r.primarySubduedLight)})));
}
:host([loading]):host([variant=information]) {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=information]) .skeleton {
  background-color: var(--_notification-message-information-background-color);
}
:host([loading]):host([variant=success]) {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=success]) .skeleton {
  background-color: var(--_notification-message-success-background-color);
}
:host([loading]):host([variant=error]) {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=error]) .skeleton {
  background-color: var(--_notification-message-error-background-color);
}
:host([loading]):host([variant=sustainability]) {
  background-color: var(--_notification-message-sustainability-background-color);
}
:host([loading]):host([variant=sustainability]) .skeleton {
  background-color: var(--_notification-message-sustainability-background-color);
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
${yt.mediaRules()}`;class kt extends(e(g(T(n)))){static get is(){return"bbva-notification-message"}static get scopedElements(){return{"bbva-button-default":ct,"bbva-button-icon":X,"bbva-link":I,"bbva-icon":y,"bbva-text":f}}static get properties(){return{iconSize:{type:Number,attribute:"icon-size"},icon:{type:String,attribute:"icon"},messageTitle:{type:String,attribute:"message-title"},message:{type:String},description:{type:String},linkTitle:{type:String,attribute:"link-title"},linkIcon:{type:String,attribute:"link-icon"},buttonText:{type:String,attribute:"button-text"},href:{type:String},loading:{type:Boolean,reflect:!1},variant:{type:String,reflect:!0},iconClose:{type:Boolean,attribute:"icon-close"},hideBottomPaddingParagraph:{type:Boolean,attribute:"hide-bottom-padding-paragraph"},hideBottomPaddingLink:{type:Boolean,attribute:"hide-bottom-padding-link"},descriptionTextItalic:{type:Boolean,attribute:"description-text-italic"}}}constructor(){super(),this.iconClose=!1,this.iconSize=24,this.variant="default",this._types={default:B(),information:R(),success:N(),error:q(),sustainability:H()},this.hideBottomPaddingParagraph=!1,this.hideBottomPaddingLink=!1,this.descriptionTextItalic=!1,this.loading=!1}static get styles(){return[super.styles,ft,l("bbva-notification-message-shared-styles"),it.light]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.hasAttribute("role")||(this.iconClose||this.buttonText?(this.setAttribute("role","dialog"),this.setAttribute("aria-modal",!1)):this.setAttribute("role","mark"),this.setAttribute("aria-label",this.messageTitle))}get _icon(){return this.icon?this.icon:this._types[this.variant]||B()}get _closeIcon(){return this.iconClose&&"default"===this.variant?c`
          <bbva-button-icon
            variant="no-background"
            .icon="${W()}"
            @click="${this._iconClick}"
            aria-label="${this.t("bbva-notification-message-close")}"
          >
          </bbva-button-icon>
        `:$}get _title(){return this.messageTitle?c`
          <bbva-text
            alignment="center"
            .text="${this.messageTitle}"
            class="title"
            unset
            size="M"
          ></bbva-text>
        `:$}get _paragraph(){return c`<div class="paragraph">
      ${this.message?c`<bbva-text alignment="center" text=${this.message} unset size="S"></bbva-text> `:c`<slot></slot>`}
    </div>`}get _description(){return this.description?c` <bbva-text
          class="description"
          alignment="center"
          .text=${this.description}
          unset
          size="S"
        ></bbva-text>`:$}get _link(){return this.linkTitle?c`
          <bbva-link
            variant="message"
            .href="${this.href}"
            @click="${this._linkClick}"
            .icon="${this.linkIcon}"
          >
            ${this.linkTitle}
          </bbva-link>
        `:$}get _button(){return this.buttonText?c`
          <bbva-button-default
            ambient="light"
            data-tag-name="bbva-button-default"
            text="${this.buttonText}"
            @click="${this._buttonClick}"
          ></bbva-button-default>
        `:$}_iconClick(){this.dispatchEvent(new CustomEvent("notification-message-icon-click",{detail:!0,bubbles:!0,composed:!0}))}_linkClick(){this.dispatchEvent(new CustomEvent("notification-message-link-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){this.dispatchEvent(new CustomEvent("notification-message-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return c`${this.loading?c`<div class="skeleton"></div> `:c` ${this._closeIcon}
          <bbva-icon
            aria-hidden="true"
            data-tag-name="bbva-icon"
            .icon="${this._icon}"
            .size="${this.iconSize}"
          ></bbva-icon>
          ${this._title} ${this._paragraph} ${this._description} ${this._link} ${this._button}`}`}}v("colors.cool60"),v("colors.primarySubduedLight"),v("colors.tertiaryType3Light"),v("colors.tertiaryType6Light"),v("colors.tertiaryType1Light"),v("colors.primaryVariantLight"),v("colors.cool60"),v("colors.cool60"),v("colors.cool60"),v("colors.cool60"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("colors.primaryCoreLightened"),v("fontFacePrimary.book.fontWeight"),v("colors.primarySubdued"),v("colors.cool50"),v("colors.cool60"),v("colors.cool60");export{at as B,ct as a,mt as b,ht as c,kt as d,bt as e,Q as f,ot as g};
