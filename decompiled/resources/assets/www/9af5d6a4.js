import"./fc15786a.js";import"./7936765e.js";import{s as e,a as t,b as i,B as a}from"./a874903a.js";import{z as r,ar as o,a8 as n,a9 as l,b1 as s,a as c,an as d,aJ as h,L as b,ag as v,ak as m,h as p,aV as u,f as g,g as f,bf as y,ac as $,ab as x,aa as k,au as _,b0 as S,cK as M,bc as C,fs as L,aS as w,af as Z,aw as A,bh as z,ft as H,b6 as V,cM as T,ah as E,ch as B,i as I,ap as P,F as D,b$ as F,bx as R,aW as q,ad as N,aI as O,G as j,bW as U,aN as K,b_ as G,bn as W,av as X,bj as Y,aK as Q,H as J,c0 as ee,cR as te,bU as ie,bF as ae,cS as re,bG as oe,di as ne,cs as le,ct as se,aH as ce,cu as de,o as he,dZ as be,bT as ve,U as me,dJ as pe,bb as ue,cl as ge,ax as fe,cO as ye,a_ as $e,by as xe,b4 as ke,cG as _e,b8 as Se,aM as Me,aD as Ce,aO as Le,b5 as we,dy as Ze,aG as Ae,bA as ze,fu as He,ci as Ve,fv as Te,cD as Ee,_ as Be,bV as Ie,dA as Pe,dB as De}from"./952f98a9.js";import{C as Fe,ay as Re,bV as qe,d8 as Ne,eG as Oe}from"./216055dc.js";import{aM as je,t as Ue,cC as Ke,aL as Ge,br as We,aJ as Xe,ao as Ye,aK as Qe}from"./7f3d7ca9.js";import{B as Je,a as et}from"./96b40574.js";import{B as tt}from"./703ea9fa.js";import{B as it}from"./d8ff1503.js";import"./253d153d.js";import"./111ad2c6.js";import"./9d12c561.js";import{B as at,a as rt}from"./79b40c7b.js";import{B as ot}from"./e32b4658.js";import"./af658024.js";import"./4dec7a01.js";import{B as nt}from"./7bf5357f.js";import"./9e155770.js";import{B as lt}from"./0efe7f4c.js";import"./6834e083.js";import"./93bb16ff.js";import"./9cadd5ad.js";import"./ff2cdeea.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./a2b15c7c.js";import"./62eefc6e.js";import"./a83e7741.js";import"./ca1bc295.js";import"./25ca3c7f.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./4d2e5f99.js";import"./68ec5adf.js";import"./f250a96c.js";import"./afb1d3bc.js";customElements.define(Je.is,Je),customElements.define(tt.is,tt);var st=r`[ambient^=light] {
  --bbva-date-color: initial;
  --bbva-date-skeleton-color: initial;
}
${(new o).mediaRules()}`;const ct=new o;var dt=r`[ambient^=dark] {
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-date-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
}
${ct.mediaRules()}`;const ht={dark:r`
    ${s.dark}
    ${dt}
  `,light:r`
    ${s.light}
    ${st}
  `},bt=new o;var vt=r`:host {
  display: inline-block;
  box-sizing: border-box;
  position: relative;
  --bbva-text-color: var(--bbva-date-dark-mode-color, var(--bbva-date-color, token("foundations.colors.secondary600")));
  --skeleton-quote-color: var(--bbva-date-dark-mode-skeleton-quote-color, var(--bbva-date-skeleton-quote-color, var(--colorsSecondary200, ${n(l.secondary200)})));
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
${bt.mediaRules()}`;class mt extends(c(d(h(b)))){static get is(){return"bbva-date"}static get scopedElements(){return{"bbva-text":v}}static get properties(){return{date:{type:Date,converter:e=>new Date(e)},locale:{type:String},options:{type:Object},utc:{type:Boolean},clockSuffix:{type:String,attribute:"clock-suffix"},loading:{type:Boolean,reflect:!0},dateRange:{type:Array,attribute:"date-range"}}}constructor(){super(),this.date=new Date,this.locale="es-ES",this.utc=!1,this.clockSuffix="h",this.loading=!1,this.disabledTabindex=!0,this.options={day:"2-digit",month:"long",year:"numeric"}}static get styles(){return[super.styles,vt,m("bbva-date-shared-styles"),ht.light,ht.dark]}updated(e){var t,i;super.updated&&super.updated(e),0===(null===(t=this.dateRange)||void 0===t?void 0:t.length)&&(this.date=""),!this.isValidRange&&this.date&&this._dateFormat(this.date)!==this._currentDate&&(this._currentDate=this._dateFormat(this.date),this._handleChange()),(null===(i=this.dateRange)||void 0===i?void 0:i.length)>0&&this._fromToDateFormat(this.dateRange)!==this._currentDate&&(this._currentDate=this._fromToDateFormat(this.dateRange).join(""),this._handleChange())}_handleChange(){this.dispatchEvent(new CustomEvent("date-change",{composed:!0,bubbles:!0,detail:{value:this._currentDate}}))}get isValid(){return this.date&&"Invalid Date"!==this.date.toLocaleDateString()}get isValidRange(){var e;return(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&"Invalid Date"!==this._fromToDateFormat(this.dateRange)}_dateFormat(e){const t=this.utc?{...this.options,timeZone:"UTC"}:this.options,i=t.day||t.month||t.year;return t.hour&&t.minute&&!i?e.toLocaleTimeString(this.locale,t).concat(` ${this.clockSuffix}`):e.toLocaleDateString(this.locale,t)}_fromToDateFormat(e){return[new Date(e[0]),new Date(e[1])].map(((e,t)=>e.toLocaleDateString(this.locale,this.options).concat(0===t?" - ":"")))}_fromToDateFormatA11y(e){const t=new Date(e[0]),i=new Date(e[1]),a={...this.options};return a.month="long",[t,i].map(((e,t)=>e.toLocaleDateString(this.locale,a).concat(0===t?` ${this.t("bbva-date-to-the")} `:""))).join("")}get _tplDate(){return this.isValid&&this.date&&!this.isValidRange&&p` <bbva-text
          unset
          text="${this._dateFormat(this.date)}"
          font-weight="500"
          font-style="italic"
          size="S"
        >
        </bbva-text>`||u}get _tplDateRange(){var e;return this.isValidRange&&(null===(e=this.dateRange)||void 0===e?void 0:e.length)>0&&p`
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
        `||u}render(){return p` ${this._tplDate} ${this._tplDateRange} `}}f("colors.primaryCoreLightened"),f("colors.cool50");const pt=new o;var ut=r`:host {
  display: block;
  box-sizing: border-box;
  --_card-select-bg-color: var(--bbva-card-select-bg-dark-mode-color, var(--bbva-card-select-bg-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_title-no-link-color: var(--bbva-card-select-title-no-link-dark-mode-color, var(--bbva-card-select-title-no-link-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_amount-icon-color: var(--bbva-card-select-amount-icon-dark-mode-color, var(--bbva-card-select-amount-icon-color, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_description-color: var(--bbva-card-select-description-dark-mode-color, var(--bbva-card-select-description-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_date-color: var(--bbva-card-select-date-dark-mode-color, var(--bbva-card-select-date-color, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_badge-highlight-color: var(--bbva-card-select-badge-highlight-dark-mode-color, var(--bbva-card-select-badge-highlight-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-bg-color: var(--bbva-card-select-bg-dark-mode-color-selected, var(--bbva-card-select-bg-color-selected, var(--colorsPrimaryCore, ${n(l.primaryCore)})));
  --_selected-color: var(--bbva-card-select-dark-mode-color-selected, var(--bbva-card-select-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-title-color: var(--bbva-card-select-dark-mode-color-title-selected, var(--bbva-card-select-color-title-selected, var(--colorsPrimarySubdued, ${n(l.primarySubdued)})));
  --_selected-amount-color: var(--bbva-card-select-dark-mode-color-amount-selected, var(--bbva-card-select-color-amount-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-amount-icon-color: var(--bbva-card-select-amount-icon-dark-mode-color-selected, var(--bbva-card-select-amount-icon-color-selected, var(--colorsPrimarySubdued, ${n(l.primarySubdued)})));
  --_selected-date-color: var(--bbva-card-select-date-dark-mode-color-selected, var(--bbva-card-select-date-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-description-color: var(--bbva-card-select-description-dark-mode-color-selected, var(--bbva-card-select-description-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-title-no-link-color: var(--bbva-card-select-title-no-link-dark-mode-color-selected, var(--bbva-card-select-title-no-link-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-link-color: var(--bbva-card-select-link-dark-mode-color-selected, var(--bbva-card-select-link-color-selected, var(--colorsPrimarySubdued, ${n(l.primarySubdued)})));
  --_selected-badge-default-color: var(--bbva-card-select-badge-default-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-success-color: var(--bbva-card-select-badge-success-dark-mode-color-selected, var(--bbva-card-select-badge-success-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-badge-error-color: var(--bbva-card-select-badge-error-dark-mode-color-selected, var(--bbva-card-select-badge-error-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-badge-neutral-color: var(--bbva-card-select-badge-neutral-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-warning-color: var(--bbva-card-select-badge-warning-dark-mode-color-selected, var(--bbva-card-select-badge-warning-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-badge-highlight-color: var(--bbva-card-select-badge-highlight-dark-mode-color, var(--bbva-card-select-badge-highlight-color-selected, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_selected-badge-highlight-default-bg-color: var(--bbva-card-select-badge-highlight-default-bg-dark-mode-color-selected, var(--bbva-card-select-badge-highlight-default-bg-color-selected,var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-badge-highlight-success-bg-color: var(--bbva-card-select-badge-highlight-success-bg-dark-mode-color-selected, var(--bbva-card-select-badge-highlight-success-bg-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_selected-badge-highlight-error-bg-color: var(--bbva-card-select-badge-highlight-error-bg-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-highlight-warning-bg-color: var(--bbva-card-select-badge-highlight-warning-bg-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-highlight-neutral-bg-color: var(--bbva-card-select-badge-highlight-neutral-bg-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-highlight-white-bg-color: var(--bbva-card-select-badge-highlight-white-bg-color-selected, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)}));
  --_selected-badge-highlight-white-color: var(--bbva-card-select-badge-highlight-white-color-selected, var(--colorsSecondary600, ${n(l.secondary600)}));
  --_card-select-skeleton-quote-color: var(--bbva-card-select-dark-mode-skeleton-color, var(--bbva-card-select-skeleton-color, var(--colorsSecondary200, ${n(l.secondary200)})));
  --_card-select-skeleton-quote-bg: var(--bbva-card-select-dark-mode-skeleton-bg-color, var(--bbva-card-select-skeleton-bg-color, transparent));
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

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

.card-select {
  display: block;
  overflow: hidden;
  position: relative;
  font-family: inherit;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  border-radius: 0.125rem;
  background-color: var(--_card-select-bg-color);
  transition: background-color var(--bbva-fast-transition, 0.2s) ease-in-out, color var(--bbva-fast-transition, 0.2s) ease-in-out, opacity var(--bbva-fast-transition, 0.2s) ease-in-out;
  user-select: none;
  outline: none;
  box-shadow: var(--boxShadowType1, ${n(y.type1)});
  margin: 0;
}

.content {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.header {
  display: flex;
  align-items: center;
}

p {
  margin: 0;
}

.title {
  font-size: var(--typographyTypeLarge, ${n($.typeLarge)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
}

.title-no-link {
  color: var(--_title-no-link-color);
}

.amount-container {
  display: flex;
  justify-content: space-between;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.amount {
  margin-bottom: 0;
}
.amount-icon {
  color: var(--_amount-icon-color);
}

.description {
  color: var(--_description-color);
}

.badge-highlight {
  color: var(--_badge-highlight-color);
}

.title, .description, .date, .badge {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.date {
  color: var(--_date-color);
  font-size: var(--typographyTypeXSmall, ${n($.typeXSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${n(x.bookItalic.fontStyle)});
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([selected]) .card-select {
  background-color: var(--_selected-bg-color);
  color: var(--_selected-color);
}
:host([selected]) .title {
  color: var(--_selected-title-color);
}
:host([selected]) .amount {
  color: var(--_selected-amount-color);
}
:host([selected]) .amount-icon {
  color: var(--_selected-amount-icon-color);
}
:host([selected]) .link {
  --bbva-link-color: var(--_selected-link-color);
}
:host([selected]) .date {
  color: var(--_selected-date-color);
}
:host([selected]) .description {
  color: var(--_selected-description-color);
}
:host([selected]) .title-no-link {
  color: var(--_selected-title-no-link-color);
}
:host([selected]) .badge[type=success] {
  color: var(--_selected-badge-success-color);
}
:host([selected]) .badge[type=default], :host([selected]) .badge [type=pending] {
  color: var(--_selected-badge-default-color);
}
:host([selected]) .badge[type=error], :host([selected]) .badge [type=blocked] {
  color: var(--_selected-badge-error-color);
}
:host([selected]) .badge[type=neutral], :host([selected]) .badge [type=off] {
  color: var(--_selected-badge-neutral-color);
}
:host([selected]) .badge[type=warning] {
  color: var(--_selected-badge-warning-color);
}
:host([selected]) .badge-highlight {
  --bbva-badge-highlight-color: var(--_selected-badge-highlight-color);
}
:host([selected]) .badge-highlight[type=default] {
  background-color: var(--_selected-badge-highlight-default-bg-color);
}
:host([selected]) .badge-highlight[type=success] {
  background-color: var(--_selected-badge-highlight-success-bg-color);
}
:host([selected]) .badge-highlight[type=error] {
  background-color: var(--_selected-badge-highlight-error-bg-color);
}
:host([selected]) .badge-highlight[type=warning] {
  background-color: var(--_selected-badge-highlight-warning-bg-color);
}
:host([selected]) .badge-highlight[type=neutral] {
  background-color: var(--_selected-badge-highlight-neutral-bg-color);
}
:host([selected]) .badge-highlight[type=white] {
  background-color: var(--_selected-badge-highlight-white-bg-color);
  color: var(--_selected-badge-highlight-white-color);
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
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--_card-select-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_card-select-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_card-select-skeleton-quote-color) 50%), linear-gradient(var(--_card-select-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_card-select-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_card-select-skeleton-quote-color) 50%);
  background-color: var(--_card-select-skeleton-quote-bg);
  background-size: 32px 32px, calc((272px * 2) + (16px/ 2)) 16px, calc((136px * 2) + (16px/ 2)) 16px, 24px 24px, calc((136px * 2) + (16px/ 2)) 16px, calc((68px * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, 16px 64px, 16px 96px, 272px 96px, 16px 120px, 16px 152px;
}

:host([loading]) .card-select {
  pointer-events: none;
  min-height: 11.5rem;
}
:host([loading]) .card-select > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .card-select .skeleton {
  opacity: 1;
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
${pt.mediaRules()}`;var gt=r`[ambient^=light] {
  --bbva-card-select-label-bg-color: initial;
  --bbva-card-select-title-color: initial;
  --bbva-card-select-title-no-link-color: initial;
  --bbva-card-select-amount-icon-color: initial;
  --bbva-card-select-description-color: initial;
  --bbva-card-select-date-color: initial;
  --bbva-card-select-badge-highlight-color: initial;
  --bbva-card-select-badge-highlight-color-selected: initial;
  --bbva-card-select-badge-highlight-default-bg-color-selected: initial;
  --bbva-card-select-badge-highlight-success-bg-color-selected: initial;
  --bbva-card-select-badge-highlight-error-bg-color-selected: initial;
  --bbva-card-select-badge-highlight-warning-bg-color-selected: initial;
  --bbva-card-select-badge-default-color-selected: initial;
  --bbva-card-select-badge-error-color-selected: initial;
  --bbva-card-select-badge-neutral-color-selected: initial;
  --bbva-card-select-badge-success-color-selected: initial;
  --bbva-card-select-badge-warning-color-selected: initial;
  --bbva-card-select-badge-alt-color-selected: initial;
  --bbva-card-select-badge-highlight-neutral-bg-color-selected: initial;
  --bbva-card-select-badge-highlight-white-bg-color-selected: initial;
  --bbva-card-select-badge-highlight-white-color-selected: initial;
  --bbva-card-select-bg-color-selected: initial;
  --bbva-card-select-color-selected: initial;
  --bbva-card-select-color-title-selected: initial;
  --bbva-card-select-color-amount-selected: initial;
  --bbva-card-select-amount-icon-color-selected: initial;
  --bbva-card-select-link-color-selected: initial;
  --bbva-card-select-date-color-selected: initial;
  --bbva-card-select-description-color-selected: initial;
  --bbva-card-select-title-no-link-color-selected: initial;
  --skeleton-quote-color: initial;
  --skeleton-quote-bg: initial;
}
${(new o).mediaRules()}`;const ft=new o;var yt=r`[ambient^=dark] {
  --bbva-card-select-bg-color: var(--colorsPrimaryCore, ${n(l.primaryCore)});
  --bbva-card-select-title-color: var(--colorsPrimarySubdued, ${n(l.primarySubdued)});
  --bbva-card-select-title-no-link-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-amount-icon-color: var(--colorsPrimarySubdued, ${n(l.primarySubdued)});
  --bbva-card-select-description-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-date-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-badge-highlight-color: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-badge-highlight-color-selected: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-badge-highlight-default-bg-color-selected: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  --bbva-card-select-badge-highlight-success-bg-color-selected: var(--colorsTertiaryType6Dark, ${n(l.tertiaryType6Dark)});
  --bbva-card-select-badge-highlight-error-bg-color-selected: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-card-select-badge-highlight-warning-bg-color-selected: var(--colorsTertiaryType2Dark, ${n(l.tertiaryType2Dark)});
  --bbva-card-select-badge-default-color-selected: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  --bbva-card-select-badge-error-color-selected: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-card-select-badge-neutral-color-selected: var(--colorsSecondary500, ${n(l.secondary500)});
  --bbva-card-select-badge-success-color-selected: var(--colorsTertiaryType6Dark, ${n(l.tertiaryType6Dark)});
  --bbva-card-select-badge-warning-color-selected: var(--colorsTertiaryType2Dark, ${n(l.tertiaryType2Dark)});
  --bbva-card-select-badge-alt-color-selected: var(--colorsPrimaryVariantDark, ${n(l.primaryVariantDark)});
  --bbva-card-select-badge-highlight-neutral-bg-color-selected: var(--colorsSecondary500, ${n(l.secondary500)});
  --bbva-card-select-badge-highlight-white-bg-color-selected: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-badge-highlight-white-color-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-bg-color-selected: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-card-select-color-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-color-title-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-color-amount-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-amount-icon-color-selected: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  --bbva-card-select-link-color-selected: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  --bbva-card-select-date-color-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-description-color-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-card-select-title-no-link-color-selected: var(--colorsSecondary600, ${n(l.secondary600)});
  --skeleton-quote-color: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  --skeleton-quote-bg: var(--colorsPrimaryCore, ${n(l.primaryCore)});
}
${ft.mediaRules()}`;const $t={dark:r`
    ${_.dark}
    ${S.dark}
    ${M.dark}
    ${je.dark}
    ${C.dark}
    ${L.dark}
    ${ht.dark}
    ${yt}
  `,light:r`
    ${_.light}
    ${S.light}
    ${M.light}
    ${je.light}
    ${C.light}
    ${L.light}
    ${ht.light}
    ${gt}
  `},xt=32;class kt extends(w(c(b))){static get is(){return"bbva-card-select"}static get scopedElements(){return{"bbva-core-icon":Z,"bbva-amount":A,"bbva-badge-default":z,"bbva-text":v,"bbva-badge-highlight":H,"bbva-link":V,"bbva-date":mt,"bbva-form-checkbox":T,"bbva-form-radio-button":Ue}}static get properties(){return{badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},badgeHighlightText:{type:String,attribute:"badge-highlight-text"},badgeHighlightType:{type:String,attribute:"badge-highlight-type"},cardTitle:{type:String,attribute:"card-title"},hasTitleLink:{type:Boolean,attribute:"has-title-link"},date:{type:String},description:{type:String},extraDescription:{type:String,attribute:"extra-description"},selected:{type:Boolean,reflect:!0},type:{type:String},focusable:{type:Boolean},linkText:{type:String,attribute:"link-text"},iconLink:{type:String,attribute:"icon-link"},iconAmount:{type:String},loading:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},unit:{type:String},symbolLeft:{type:Boolean,attribute:"symbol-left"}}}constructor(){super(),this.badgeText="",this.badgeHighlightText="",this.cardTitle="",this.date="",this.description="",this.extraDescription="",this.selected=!1,this.type="checkbox",this.focusable=!0,this.linkText="",this.iconLink=E(),this.iconAmount=B(),this.loading=!1,this.disabled=!1,this.unit="",this.symbolLeft=!1}get _tabIndex(){return this.focusable?"0":"-1"}get _ariaSelected(){return this.selected?String(this.selected):"false"}updated(e){e.has("selected")&&this.dispatchEvent(new CustomEvent("card-select-change",{detail:this.selected,bubbles:!0,composed:!0}))}static get styles(){return[m("bbva-global-dividers-shared-styles"),ut,m("bbva-card-select-shared-styles"),$t.dark,$t.light]}_cardSelectedPress(e){e.keyCode===xt&&this._changeSelected(e)}focusElement(){this.shadowRoot.querySelector("#card").focus()}_changeSelected(){this.selected="checkbox"!==this.type||!this.selected,this.dispatchEvent(new CustomEvent("card-select-change",{detail:this.selected,bubbles:!0,composed:!0}))}_linkClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("card-select-link-click",{detail:!0,bubbles:!0,composed:!0}))}_titleClick(e){e.stopPropagation(),this._changeSelected(),this.dispatchEvent(new CustomEvent("card-select-title-click",{detail:!0,bubbles:!0,composed:!0}))}_iconAmountClick(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("card-select-icon-amount-click",{detail:!0,bubbles:!0,composed:!0}))}get _headerSection(){return"radio"===this.type?p`
          <bbva-form-radio-button
            name="choice"
            ?checked="${this.selected}"
          ></bbva-form-radio-button>
        `:p`
          <bbva-form-checkbox
            required
            name="choice1"
            ?checked="${this.selected}"
          ></bbva-form-checkbox>
        `}get _linkSection(){return this.linkText?p`
          <bbva-link
            class="link"
            @click="${this._linkClick}"
            icon="${this.iconLink}"
            ?disabled="${this.disabled}"
            >${this.linkText}</bbva-link
          >
        `:""}get _titleSection(){return this.hasTitleLink?p`
          <p>
            <bbva-link class="title" @click="${this._titleClick}" ?disabled="${this.disabled}"
              >${this.cardTitle}</bbva-link
            >
          </p>
        `:p`
          <bbva-text
            class="title-no-link"
            font-weight="500"
            size="L"
            tag="span"
            text="${this.cardTitle}"
          >
          </bbva-text>
        `}get _badgeSection(){return this.badgeText?p`
        <bbva-badge-default
          id="badgeDefault"
          text="${this.badgeText}"
          class="badge"
          type="${I(this.badgeType)}"
        ></bbva-badge-default>
      `:this.badgeHighlightText?p`
        <bbva-badge-highlight
          id="badgeHighlight"
          class="badge-highlight"
          text="${this.badgeHighlightText}"
          type="${I(this.badgeHighlightType)}"
        ></bbva-badge-highlight>
      `:""}get _amountSection(){return this.amount?p`
          <div class="amount-container">
            <bbva-amount
              .amount="${this.amount}"
              .currencyCode="${this.currencyCode}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
              class="amount"
              variant="xl"
              unit="${this.unit}"
              ?symbol-left="${this.symbolLeft}"
            >
            </bbva-amount>
            <bbva-core-icon
              class="amount-icon"
              icon="${this.iconAmount}"
              @click="${this._iconAmountClick}"
            ></bbva-core-icon>
          </div>
        `:""}render(){return p`
      <div
        role="${this.type}"
        class="card-select"
        aria-checked="${this._ariaSelected}"
        @click="${this._changeSelected}"
        @keydown="${this._cardSelectedPress}"
        tabindex="${this._tabIndex}"
        id="card"
      >
        <div class="header">${this._headerSection}</div>
        <div class="content">
          ${this._titleSection} ${this._amountSection}
          <bbva-text
            id="description"
            class="description ellipsis"
            tag="span"
            text="${this.description}"
            size="S"
          ></bbva-text>
          ${this._badgeSection}
          <bbva-date class="date" ?hidden="${!this.date}" date="${this.date}"></bbva-date>
          <bbva-text
            id="extra-description"
            class="description ellipsis"
            ?hidden="${!this.extraDescription}"
            tag="span"
            text="${this.extraDescription}"
            size="S"
          ></bbva-text>
          ${this._linkSection}
        </div>
        <div class="skeleton"></div>
      </div>
    `}}customElements.define(kt.is,kt);const _t=new o;var St=r`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${n(l.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${n(l.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${n(l.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${n(l.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${n(l.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 10) * 1em);
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${n($.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${_t.mediaRules()}`;class Mt extends(c(P(d(b)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":D,"bbva-badge-notification":F}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[St,m("bbva-header-main-shared-styles"),R("button:focus"),s.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return p`<bbva-icon icon="${I(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return p`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=Mt.toCamelCase(e),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return p`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${I(this.t(this[n]))}"
      aria-expanded=${I(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return p` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${I(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return p`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r,microillustration:o}=this;return p`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(o||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${I(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${r}" ?hidden="${!o}" aria-hidden="true">
            ${this.microillustration&&q[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Mt.is,Mt),customElements.define(Ke.is,Ke);const Ct=new o;var Lt=r`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${n(l.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${n(l.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${n(l.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${n(l.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${n($.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${n(N.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
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
${Ct.mediaRules()}`;var wt=r`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new o).mediaRules()}`;const Zt=new o;const At={dark:r`
    ${r`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${n(l.primaryCoreLight)});
}
${Zt.mediaRules()}`}
  `,light:r`
    ${wt}
  `};class zt extends(c(d(h(b)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":D,"bbva-text":v}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Lt,At.dark,At.light,m("bbva-notification-help-shared-styles")]}render(){return p`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}f("colors.primarySubduedLight"),f("colors.cool20"),f("colors.tertiaryType1Light"),f("colors.primaryCoreLightened"),f("colors.tertiaryType6Light"),f("colors.cool20"),f("colors.cool50");var Ht=r`[ambient^=light] {
  --bbva-list-file-alert-text-color: initial;
  --bbva-list-file-file-size-color: initial;
  --bbva-list-file-skeleton-quote-color: initial;
  --bbva-list-file-skeleton-animated-layer-bg: initial;
}
${(new o).mediaRules()}`;const Vt=new o;var Tt=r`[ambient^=dark] {
  --bbva-list-file-alert-text-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-file-file-size-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-file-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
  --bbva-list-file-skeleton-animated-layer-bg: var(--colorsPrimaryCore, ${n(l.primaryCore)});
}
${Vt.mediaRules()}`;const Et={light:r`
    ${Ht}
    ${M.light}
    ${S.light}
    ${C.light}
    ${At.light}
  `,dark:r`
    ${Tt}
    ${M.dark}
    ${S.dark}
    ${C.dark}
    ${At.dark}
  `},Bt=new o;var It=r`:host {
  --bbva-notification-help-text-color-alert: var(--bbva-list-file-alert-text-color,var(--colorsSecondary500, ${n(l.secondary500)}));
  --bbva-form-checkbox-label-gap: 0;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: space-between;
  flex-direction: column;
  box-sizing: border-box;
  width: 100%;
  --_list-file-file-size-color: var(--bbva-list-file-file-size-color, var(--colorsSecondary500, ${n(l.secondary500)}));
  --_list-file-skeleton-quote-color: var(--bbva-list-file-skeleton-quote-color, var(--colorsSecondary200, ${n(l.secondary200)}));
  --_list-file-skeleton-quote-bg: var(--bbva-list-file-skeleton-bg, transparent);
  --_list-file-skeleton-animated-layer-bg: var(--bbva-list-file-skeleton-animated-layer-bg, var(--ambientsLight, ${n(O.light)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
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

.box-container {
  display: flex;
  justify-content: space-between;
  align-items: top;
}

.main {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
}

.content {
  display: flex;
  justify-content: start;
}

.file-size {
  margin: 0;
  margin-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  line-height: var(--lineHeightTypeSmall, ${n(N.typeSmall)});
  font-size: var(--typographyTypeSmall, ${n($.typeSmall)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${n(x.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${n(x.bookItalic.fontStyle)});
  color: var(--_list-file-file-size-color);
}

[data-tag-name=bbva-text] {
  margin-left: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  color: var(--_list-file-file-size-color);
}

.link {
  align-items: flex-start;
  text-align: left;
}

.spinner {
  --bbva-spinner-size: 32px;
}

.checkbox {
  justify-content: center;
  padding-right: 0;
  margin-top: calc(((-1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.help {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 4rem;
  width: 100%;
  background-image: linear-gradient(var(--_list-file-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-file-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-file-skeleton-quote-color) 50%);
  background-color: var(--_list-file-skeleton-quote-bg);
  background-size: 24px 24px, calc((100px * 2) + (16px/ 2)) 16px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 15px 16px, 55px 16px, 55px 48px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 4rem;
  background: var(--_list-file-skeleton-animated-layer-bg);
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
${Bt.mediaRules()}`;class Pt extends(c(d(b))){static get is(){return"bbva-list-file"}static get scopedElements(){return{"bbva-link":V,"bbva-text":v,"bbva-notification-help":zt,"bbva-form-checkbox":T,"bbva-spinner":j,"bbva-badge-default":z}}static get properties(){return{icon:{type:String},iconAccesibilityText:{type:String,attribute:"icon-accesibility-text"},hrefLink:{type:String,attribute:"href-link"},fileName:{type:String,attribute:"file-name"},infoMessage:{type:String,attribute:"info-message"},errorMessage:{type:String,attribute:"error-message"},fileSize:{type:String,attribute:"file-size"},subtitles:{type:Array},checkbox:{type:Boolean},checked:{type:Boolean},status:{type:String},spinnerAccesibilityText:{type:String,attribute:"spinner-accesibility-text"},withMask:{type:Boolean,attribute:"with-mask"},value:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.icon=U(),this.iconInfo=E(),this.iconError=K(),this.subtitles=[],this.openText="bbva-list-file-open-text",this.errorText="bbva-list-file-error-text",this.spinnerAccesibilityText="bbva-list-file-spinner-accesibility",this.withMask=!0,this.value="",this.loading=!1}static get styles(){return[It,m("bbva-list-file-shared-styles"),Et.dark,Et.light]}get _loading(){return p`
      <span class="sr-only">${this.t(this.spinnerAccesibilityText)}</span>
      <bbva-spinner class="spinner" ?with-mask="${this.withMask}"></bbva-spinner>
    `}get _open(){return p` <bbva-badge-default text="${this.t(this.openText)}"></bbva-badge-default> `}get _error(){return p`
      <bbva-badge-default text="${this.t(this.errorText)}" type="error"></bbva-badge-default>
    `}get _subtitles(){return this.subtitles&&p`
        ${this.subtitles.map((e=>p`
            <bbva-text
              tag="span"
              size="S"
              ellipsis
              lines="1"
              alignment="left"
              .text=${e}
            ></bbva-text>
          `))}
      `}get _errorMessage(){return this.errorMessage&&p`
        <div class="help">
          <bbva-notification-help
            id="messageError"
            class="notification alert"
            role="alert"
            .icon="${this.iconError}"
            .text="${this.errorMessage}"
          ></bbva-notification-help>
        </div>
      `}get _infoMessage(){return this.infoMessage&&p`
        <div class="help">
          <bbva-notification-help
            id="messageInfo"
            class="notification"
            .icon="${this.iconInfo}"
            .text="${this.infoMessage}"
          ></bbva-notification-help>
        </div>
      `}render(){return this._fileStatus={loading:this._loading,open:this._open,error:this._error},p`${this.loading?p`<div class="skeleton"></div>`:p`
          <div class="box-container">
            <div class="main">
              <div class="content">
                <span class="sr-only">${this.iconAccesibilityText}</span>
                <bbva-link
                  class="link"
                  .href="${this.hrefLink}"
                  @click="${this.fileClicked}"
                  .icon="${this.icon}"
                  icon-size="24"
                >
                  <span> ${this.fileName} </span>
                </bbva-link>
              </div>
              ${this.fileSize?p` <span class="file-size">${this.fileSize}</span> `:""}
              ${this._subtitles}
            </div>
            ${this.checkbox?p`
                  <div>
                    <bbva-form-checkbox
                      class="checkbox"
                      not-form
                      .value="${this.value}"
                      ?checked="${this.checked}"
                      .label="${this.fileName}"
                      hide-label
                      @change="${this._oncheckboxChange}"
                    ></bbva-form-checkbox>
                  </div>
                `:""}
            ${this.status?this._fileStatus[this.status]:""}
          </div>
          ${this._infoMessage} ${this._errorMessage}
        `}`}fileClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-link-click",{detail:e.detail,composed:!0,bubbles:!0}))}_oncheckboxChange(e){this.checked=e.target.checked,e.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-checkbox-change",{detail:e.target.checked,composed:!0,bubbles:!0}))}}customElements.define(Pt.is,Pt);var Dt=r`[ambient^=light] {
  --bbva-list-link-icon-color: initial;
  --bbva-list-link-icon-right-icon-color: initial;
  --bbva-list-link-icon-color-warning: initial;
  --bbva-list-link-icon-color-neutral: initial;
  --bbva-list-link-icon-active-color: initial;
  --bbva-list-link-icon-active-neutral-color: initial;
  --bbva-list-link-icon-active-warning-color: initial;
}
${(new o).mediaRules()}`;const Ft=new o;const Rt={dark:r`
    ${r`[ambient^=dark] {
  --bbva-list-link-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-link-icon-right-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-link-icon-color-warning: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-link-icon-color-neutral: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-link-icon-active-color: var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)});
  --bbva-list-link-icon-active-neutral-color: var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)});
  --bbva-list-link-icon-active-warning-color: var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)});
}
${Ft.mediaRules()}`}
    ${G.dark}
  `,light:r`
    ${Dt}
    ${G.light}
  `},qt=new o;var Nt=r`:host {
  display: block;
  box-sizing: border-box;
  font-size: var(--typographyTypeMedium, ${n($.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${n(N.typeMedium)});
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
  --_list-link-icon-color: var(--bbva-list-link-icon-color, var(--colorsPrimaryMedium, ${n(l.primaryMedium)}));
  --_list-link-right-icon-color: var(--bbva-list-link-icon-right-icon-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)}));
  --_list-link-icon-color-neutral: var(--bbva-list-link-icon-color-neutral, var(--colorsSecondary600, ${n(l.secondary600)}));
  --_list-link-icon-color-warning: var(--bbva-list-link-icon-color-warning, var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)}));
  --_list-link-icon-right-active-color: var(--bbva-list-link-icon-right-active-color, var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)}));
  --_list-link-icon-active-color: var(--bbva-list-link-icon-active-color, var(--colorsSecondary100, ${n(l.secondary100)}));
  --_list-link-icon-active-bg-color: var(--bbva-list-link-icon-active-bg-color, var(--colorsPrimaryCore, ${n(l.primaryCore)}));
  --_list-link-icon-right-active-neutral-color: var(--bbva-list-link-icon-right-active-neutral-color, var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)}));
  --_list-link-icon-active-neutral-color: var(--bbva-list-link-icon-active-neutral-color, var(--colorsSecondary100, ${n(l.secondary100)}));
  --_list-link-icon-active-neutral-bg-color: var(--bbva-list-link-icon-active-neutral-bg-color, var(--colorsPrimaryCore, ${n(l.primaryCore)}));
  --_list-link-icon-right-active-warning-color: var(--bbva-list-link-icon-right-active-warning-color, var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)}));
  --_list-link-icon-active-warning-color: var(--bbva-list-link-icon-active-warning-color, var(--colorsSecondary100, ${n(l.secondary100)}));
  --_list-link-icon-active-warning-bg-color: var(--bbva-list-link-icon-active-warning-bg-color, var(--colorsPrimaryCore, ${n(l.primaryCore)}));
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

.icon-right {
  color: var(--_list-link-right-icon-color);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

button {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  padding: 0;
  border: none;
  text-align: left;
  font: inherit;
  color: var(--_list-link-icon-color);
  background-color: transparent;
  outline: none;
  cursor: pointer;
}
button:active {
  color: var(--_list-link-icon-active-color);
  background-color: var(--_list-link-icon-active-bg-color);
}
button:active .icon-right {
  color: var(--_list-link-icon-right-active-color);
}
button [data-tag-name=bbva-text] {
  color: inherit;
  flex: 1;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.linkText {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}

:host(.neutral) button {
  color: var(--_list-link-icon-color-neutral);
}

:host(.warning) button {
  color: var(--_list-link-icon-color-warning);
}

:host(.neutral) button:active {
  color: var(--_list-link-icon-active-neutral-color);
  background-color: var(--_list-link-icon-active-neutral-bg-color);
}
:host(.neutral) button:active .icon-right {
  color: var(--_list-link-icon-right-active-neutral-color);
}

:host(.warning) button:active {
  color: var(--_list-link-icon-active-warning-color);
  background-color: var(--_list-link-icon-active-warning-bg-color);
}
:host(.warning) button:active .icon-right {
  color: var(--_list-link-icon-right-active-warning-color);
}
${qt.mediaRules()}`;class Ot extends(c(P(b))){static get is(){return"bbva-list-link-icon"}static get scopedElements(){const e=[Z,F,v];return Ot.scopedElementsFromClasses(e)}static get properties(){return{iconLeft:{type:String,attribute:"icon-left"},iconLeftSize:{type:Number,attribute:"icon-left-size"},iconRight:{type:String,attribute:"icon-right"},iconRightSize:{type:Number,attribute:"icon-right-size"},notifications:{type:Number},notificationsAccesibilityText:{type:String},text:{type:String}}}constructor(){super(),this.iconLeft="",this.iconLeftSize=24,this.iconRight=W(),this.iconRightSize=24}static get styles(){return[Nt,m("bbva-list-link-icon-shared-styles"),Rt.light,Rt.dark,R("button:focus")]}_buttonClicked(){this.dispatchEvent(new CustomEvent("list-link-icon-button-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return p`
      <button type="button" @click="${this._buttonClicked}">
        <bbva-core-icon
          .icon="${this.iconLeft}"
          .size="${this.iconLeftSize}"
          class="icon icon-left"
        ></bbva-core-icon>
        <bbva-text tag="span" class="linkText" text="${this.text}"></bbva-text>
        ${this.notifications?p`
              <bbva-badge-notification
                class="icon icon-right"
                .accessibilityText="${this.notificationsAccesibilityText}"
                .text="${this.notifications}"
              >
              </bbva-badge-notification>
            `:p`
              <bbva-core-icon
                .icon="${this.iconRight}"
                .size="${this.iconRightSize}"
                class="icon icon-right"
                ?hidden="${!this.iconRight}"
              ></bbva-core-icon>
            `}
      </button>
    `}}customElements.define(Ot.is,Ot);const jt=new o;var Ut=r`[ambient^=dark] {
  --bbva-list-select-text-color: var(--colorsSecondary100, ${n(l.secondary100)});
  --bbva-list-select-icon-color: var(--colorsSecondary100, ${n(l.secondary100)});
  --bbva-list-select-checked-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-select-heading-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-select-icon-opacity: 0.4;
  --skeleton-quote-color: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
}
${jt.mediaRules()}`;var Kt=r`[ambient^=light] {
  --bbva-list-select-text-color: initial;
  --bbva-list-select-icon-color: initial;
  --bbva-list-select-checked-icon-color: initial;
  --bbva-list-select-heading-color: initial;
  --bbva-list-select-icon-opacity: initial;
  --skeleton-quote-color: initial;
}
${(new o).mediaRules()}`;const Gt={dark:r`
    ${S.dark}
    ${Ut}
  `,light:r`
    ${S.light}
    ${Kt}
  `},Wt=new o;var Xt=r`:host {
  display: block;
  box-sizing: border-box;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  --_list-select-text-color: var(
    --bbva-list-select-text-color,
    var(--colorsSecondary500, ${n(l.secondary500)})
  );
  --_list-select-icon-color: var(
    --bbva-list-select-icon-color,
    var(--colorsSecondary500, ${n(l.secondary500)})
  );
  --_list-select-checked-icon-color: var(
    --bbva-list-select-checked-icon-color,
    var(--colorsPrimaryCore, ${n(l.primaryCore)})
  );
  --_list-select-heading-color: var(
    --bbva-list-select-heading-color,
    var(--colorsSecondary600, ${n(l.secondary600)})
  );
  --_list-select-skeleton-quote-color: var(
    --skeleton-quote-color,
    var(--colorsSecondary200, ${n(l.secondary200)})
  );
}

:host([two-lines]) [data-tag-name=bbva-core-heading],
:host([two-lines]) [data-tag-name=bbva-link] {
  overflow: hidden;
  white-space: normal;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}

.content {
  display: grid;
  grid-column-gap: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  grid-template-columns: 3fr 1fr;
  grid-template-rows: fit-content;
  grid-template-areas: "header iconsGroup" "descriptions descriptions" "status status";
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
  width: 100%;
  justify-content: space-between;
}

.descriptions {
  display: grid;
  grid-area: descriptions;
  grid-template-rows: fit-content;
  grid-template-areas: "desc subt";
  width: 100%;
  justify-content: space-between;
}

.with-subtitle {
  grid-column-gap: 16px;
  grid-template-columns: 3fr 1fr;
}

:host([clip-box-text]) .content {
  grid-template-columns: 1fr;
}
:host([clip-box-text]) .descriptions {
  grid-template-columns: 1fr;
}

input[type=radio],
input[type=checkbox],
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

.clip {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.container {
  position: relative;
  display: flex;
}

[data-tag-name=bbva-text] {
  color: var(--_list-select-text-color);
}

.label-select .icon {
  color: var(--_list-select-icon-color);
  opacity: var(--bbva-list-select-icon-opacity, 1);
}
.label-select[data-active] .icon {
  color: var(--_list-select-checked-icon-color);
  opacity: 1;
}

.heading,
.status {
  font-size: var(--bbva-list-select-heading-font-size, var(--typographyTypeMedium, ${n($.typeMedium)}));
  font-weight: var(--bbva-list-select-heading-font-weight, var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)}));
  font-style: var(--bbva-list-select-heading-font-style, var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)}));
  line-height: var(--bbva-list-select-heading-line-height, var(--lineHeightTypeMedium, ${n(N.typeMedium)}));
  color: var(--_list-select-heading-color);
}

.status {
  margin-top: var(--bbva-list-select-status-margin-top, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem));
}

.iconsGroup {
  display: flex;
  justify-content: space-around;
}
.iconsGroup label:nth-child(2) {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.iconsGroup.one-icon.right {
  justify-self: end;
}
.iconsGroup.one-icon.right label:nth-child(2) {
  margin-right: 0;
}

.descriptions,
.desc,
.subtitles,
.subt,
.header,
.status {
  min-width: 0;
}

[data-tag-name=bbva-link] {
  width: 100%;
}

[data-tag-name=bbva-core-heading],
[data-tag-name=bbva-link] {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
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
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${n(l.secondary200)})) 50%), linear-gradient(-60deg, var(--skeleton-quote-color, var(--colorsSecondary200, ${n(l.secondary200)})) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color, var(--colorsSecondary200, ${n(l.secondary200)})) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, calc((8% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 0px 0px, 100% 0px, 0px 32px;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) .skeleton {
  opacity: 1;
}
:host([loading]) .content {
  opacity: 0;
}

:host([disabled]) {
  cursor: default;
}
:host([disabled]) [data-tag-name=bbva-clip-box],
:host([disabled]) [data-tag-name=bbva-text],
:host([disabled]) .icon {
  opacity: 0.4;
}
${Wt.mediaRules()}`;class Yt extends(c(b)){static get is(){return"bbva-list-select"}static get scopedElements(){const e=[Z,Y,V,v,Q];return Yt.scopedElementsFromClasses(e)}static get properties(){return{heading:{type:String},headingLevel:{type:Number,attribute:"heading-level"},descriptionList:{type:Array,attribute:"description-list"},status:{type:String},name:{type:String},link:{type:String},href:{type:String},iconList:{type:Array},clipBoxText:{type:String,attribute:"clip-box-text"},clipBoxImage:{type:String,attribute:"clip-box-image"},disabled:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},hasDescriptionEllipsis:{type:Boolean,attribute:"has-description-ellipsis"},descriptionLines:{type:Number,attribute:"description-lines"}}}constructor(){super(),this.descriptionList=[],this.iconList=[],this.status="",this._uniqueId=`list-select-${((e=3)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this._typeCheck="radio",this.loading=!1,this.disabled=!1,this.hasDescriptionEllipsis=!1}static get styles(){return[Xt,Gt.dark,Gt.light,m("bbva-list-select-shared-styles")]}updated(e){super.updated(e),e.has("iconList")&&this.iconList.length&&(this._initializeIconList(),this.status=this.statusShowed),e.has("descriptionList")&&this.descriptionList.length&&this._initializeDescriptionList()}_initializeDescriptionList(){this.descriptionList.forEach(((e,t)=>{e.description||(this.descriptionList[t].description=""),e.subtitle||(this.descriptionList[t].subtitle="")}))}_initializeIconList(){if(this._typeCheck="checkbox",this.iconList.length>1){const e=this.iconList.some((e=>e.active));this.iconList[0].active=!e,this._typeCheck="radio"}}get _activeIcon(){let e=-1;return e=1===this.iconList.length&&this.iconList[0].active?0:this.iconList.findIndex((e=>e.active)),e}get statusShowed(){const e=this._activeIcon;return e>-1?1===this.iconList.length?this.iconList[e].activeStatus:this.iconList[e].status:this.iconList[0].status?this.iconList[0].status:""}_changeStatus(e,t){1===this.iconList.length?this.iconList[t].active=!this.iconList[t].active:(this.iconList[t].active=e.target.checked,this.iconList.forEach(((e,i)=>{this.iconList[i].active=t===i}))),this.status=this.statusShowed}get _icons(){return this.iconList.map(((e,t)=>t<2?p`
            <input
              .type="${this._typeCheck}"
              id="${this._uniqueId}-${t}"
              name="${this._uniqueId}"
              .value="${String(t)}"
              ?checked="${e.active}"
              ?disabled="${this.disabled}"
            />

            <label
              class="label-select"
              ?data-active="${e.active}"
              for="${this._uniqueId}-${t}"
              @click="${e=>this._itemActive(e,t)}"
            >
              <span class="sr-only">${e.accesibilityText}</span>

              <bbva-core-icon
                class="icon"
                .size="${this._iconSize}"
                .icon="${e.active&&e.activeIcon?e.activeIcon:e.icon}"
              >
              </bbva-core-icon>
            </label>
          `:""))}_getText(e="",t="desc"){return p`
      <bbva-text
        class=${t}
        size="S"
        text=${e}
        tag="span"
        ?ellipsis="${this.hasDescriptionEllipsis}"
        lines="${this.descriptionLines}"
        alignment="${"subt"===t?"right":"left"}"
      ></bbva-text>
    `}render(){return p`
      <div class="container">
        ${this.clipBoxImage||this.clipBoxText?p`
              <div class="clip">
                <bbva-clip-box
                  size="small"
                  .text="${this.clipBoxText}"
                  .image="${this.clipBoxImage}"
                  class="bitone"
                ></bbva-clip-box>
              </div>
            `:""}

        <div class="content">
          <div class="header">
            ${this.link?p`
                  <bbva-link
                    class="link"
                    .href="${this.href}"
                    ?disabled="${this.disabled}"
                    @click="${this.linkClicked}"
                    >${this.link}</bbva-link
                  >
                `:p`
                  <bbva-core-heading .level="${this.headingLevel}" class="heading"
                    >${this.heading}</bbva-core-heading
                  >
                `}
          </div>
          <div
            role="radiogroup"
            aria-hidden="true"
            class="${X({"one-icon":1===this.iconList.length,right:1===this.iconList.length&&this.iconList[0].alignmentRight})} iconsGroup"
          >
            ${this._icons}
          </div>
          <div
            class="descriptions ${X({"with-subtitle":this.descriptionList.filter((e=>!!e.subtitle)).length})}"
          >
            ${this.descriptionList.map((e=>p`
                ${this._getText(e.description||"")}
                ${this._getText(e.subtitle||"","subt")}
              `))}
          </div>

          <bbva-text class="status" size="S" .text=${this.status} tag="span"></bbva-text>
        </div>
        <div class="skeleton"></div>
      </div>
    `}linkClicked(){this.dispatchEvent(new CustomEvent("list-select-link-click",{detail:!0,bubbles:!0,composed:!0}))}_itemActive(e,t){this._changeStatus(e,t),this.dispatchEvent(new CustomEvent("list-select-icon-click",{detail:{status:this.statusShowed,active:this.iconList[t].active,selected:t},bubbles:!1,composed:!0}))}}customElements.define(Yt.is,Yt);const Qt={"U+0008":"backspace","U+0009":"tab","U+001B":"esc","U+0020":"space","U+007F":"del"},Jt={8:"backspace",9:"tab",13:"enter",27:"esc",33:"pageup",34:"pagedown",35:"end",36:"home",32:"space",37:"left",38:"up",39:"right",40:"down",46:"del",106:"*"},ei={shift:"shiftKey",ctrl:"ctrlKey",alt:"altKey",meta:"metaKey"},ti=/[a-z0-9*]/,ii=/U\+/,ai=/^arrow/,ri=/^space(bar)?/,oi=/^escape$/;function ni(e,t){let i="";if(e){const a=e.toLowerCase();" "===a||ri.test(a)?i="space":oi.test(a)?i="esc":1===a.length?t&&!ti.test(a)||(i=a):i=ai.test(a)?a.replace("arrow",""):"multiply"===a?"*":a}return i}function li(e,t){return e.key?ni(e.key,t):e.detail&&e.detail.key?ni(e.detail.key,t):function(e){let t="";return e&&(t=e in Qt?Qt[e]:ii.test(e)?String.fromCharCode(parseInt(e.replace("U+","0x"),16)).toLowerCase():e.toLowerCase()),t}(e.keyIdentifier)||function(e){let t="";return Number(e)&&(t=e>=65&&e<=90?String.fromCharCode(32+e):e>=112&&e<=123?"f"+(e-112+1):e>=48&&e<=57?String(e-48):e>=96&&e<=105?String(e-96):Jt[e]),t}(e.keyCode)||""}function si(e,t){return li(t,e.hasModifiers)===e.key&&(!e.hasModifiers||!!t.shiftKey==!!e.shiftKey&&!!t.ctrlKey==!!e.ctrlKey&&!!t.altKey==!!e.altKey&&!!t.metaKey==!!e.metaKey)}function ci(e){return e.trim().split(" ").map((e=>function(e){return 1===e.length?{combo:e,key:e,event:"keydown"}:e.split("+").reduce(((e,t)=>{const i=t.split(":"),a=i[0],r=i[1];return a in ei?(e[ei[a]]=!0,e.hasModifiers=!0):(e.key=a,e.event=r||"keydown"),e}),{combo:e.split(":").shift()})}(e)))}const di=J((e=>class extends e{static get properties(){return{keyEventTarget:{type:Object,attribute:"key-event-target"},stopKeyboardEventPropagation:{type:Boolean,attribute:"stop-keyboard-event-propagation"}}}constructor(){super(),this._prepKeyBindings(),this.keyEventTarget=this,this.stopKeyboardEventPropagation=!1,this._boundKeyHandlers=[],this._imperativeKeyBindings={},this.keyBindings={}}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.isAttached=!0,this._listenKeyEventListeners()}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.isAttached=!1,this._unlistenKeyEventListeners()}updated(e){super.updated&&super.updated(e),(e.has("keyEventTarget")||e.has("_boundKeyHandlers"))&&this._resetKeyEventListeners()}addOwnKeyBinding(e,t){this._imperativeKeyBindings[e]=t,this._prepKeyBindings(),this._resetKeyEventListeners()}removeOwnKeyBindings(){this._imperativeKeyBindings={},this._prepKeyBindings(),this._resetKeyEventListeners()}keyboardEventMatchesKeys(e,t){const i=ci(t);for(let t=0;t<i.length;t+=1)if(si(i[t],e))return!0;return!1}_collectKeyBindings(){const e=[],t=[];let i=Object.getPrototypeOf(this);for(;i;)-1===e.indexOf(i)&&e.push(i),i=Object.getPrototypeOf(i);return e.forEach((e=>{e.constructor.keyBindings&&t.push(e.constructor.keyBindings)})),t}_prepKeyBindings(){this._keyBindings={},this._collectKeyBindings().forEach((e=>{for(const t in e)this._addKeyBinding(t,e[t])}),this);for(const e in this._imperativeKeyBindings)this._addKeyBinding(e,this._imperativeKeyBindings[e]);for(const e in this._keyBindings)this._keyBindings[e].sort(((e,t)=>{const i=e[0].hasModifiers;return i===t[0].hasModifiers?0:i?-1:1}))}_addKeyBinding(e,t){ci(e).forEach((function(e){this._keyBindings[e.event]=this._keyBindings[e.event]||[],this._keyBindings[e.event].push([e,t])}),this)}_resetKeyEventListeners(){this._unlistenKeyEventListeners(),this.isAttached&&this._listenKeyEventListeners()}_listenKeyEventListeners(){this.keyEventTarget&&Object.keys(this._keyBindings).forEach((e=>{const t=this._keyBindings[e],i=this._onKeyBindingEvent.bind(this,t);this._boundKeyHandlers.push([this.keyEventTarget,e,i]),this.keyEventTarget.addEventListener(e,i)}),this.keyEventTarget)}_unlistenKeyEventListeners(){let e,t,i,a;for(;this._boundKeyHandlers.length;)e=this._boundKeyHandlers.pop(),t=e[0],i=e[1],a=e[2],t.removeEventListener(i,a)}_onKeyBindingEvent(e,t){if(this.stopKeyboardEventPropagation&&t.stopPropagation(),!t.defaultPrevented)for(let i=0;i<e.length;i+=1){const a=e[i][0],r=e[i][1];if(si(a,t)&&(this._triggerKeyHandler(a,r,t),t.defaultPrevented))return}}_triggerKeyHandler(e,t,i){const a=Object.create(e);a.keyboardEvent=i;const r=new CustomEvent(e.event,{detail:a,cancelable:!0});this[t].call(this,r),r.defaultPrevented&&i.preventDefault()}})),hi=new o;var bi=r`:host {
  display: block;
  box-sizing: border-box;
}

.content {
  display: flex;
  justify-content: var(--bbva-composition-selector-content-alignment, flex-start);
}

.content > ::slotted(*) {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.content > ::slotted(.flex-item) {
  display: flex;
}

/** @hostclass .vertical Sets vertical direction */
:host(.vertical) .content {
  flex-direction: column;
}
:host(.vertical) .content > ::slotted(*) {
  margin: 0;
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

.accesible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}
${hi.mediaRules()}`;class vi extends(c(di(b))){static get is(){return"bbva-composition-selector"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},multiSelection:{type:Boolean,attribute:"multi-selection"},selected:{type:Array},optionSelector:{type:String,attribute:"option-selector"}}}constructor(){super(),this.multiSelection=!1,this.selected=[],this.optionSelector="bbva-card-select",this._legendId=`legend-${Math.random().toString(36).substr(2,9)}`}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._controlOptionsInit()}static get keyBindings(){return{space:"_eventChildren","down right":"_focusNext","up left":"_focusPrevious"}}static get styles(){return[bi,m("bbva-composition-selector-shared-styles")]}render(){return p`
      <div
        id="group"
        class="content"
        role="${this._typeGroup}"
        aria-labelledby="${this._legendId}"
        @click="${this._eventChildren}"
      >
        <p class="accesible-hide" id="${this._legendId}">${this.accessibilityText}</p>
        <slot></slot>
      </div>
    `}updated(e){e.has("selected")&&(this._selectOptionDefault(),this.dispatchEvent(new CustomEvent("composition-selector-select-change",{detail:this.selected,bubbles:!0,composed:!0})))}get _typeGroup(){return this.multiSelection?"group":"radiogroup"}_selectOptionDefault(){this._options=this.querySelectorAll(this.optionSelector),this.multiSelection?this._selectMultiOption(this.selected):this._selectUpdateOption(this.selected)}_selectUpdateOption(e,t){const i=Array.isArray(e)?e[0]:e;this._options.forEach(((e,a)=>{a===i?(e.selected=!0,e.focusable=!0,t&&(this.selected=i)):(e.selected=!1,e.focusable=!1)})),i||(this._options[0].focusable=!0)}_controlOptionsInit(){this._options=this.querySelectorAll(this.optionSelector),this._options.forEach(((e,t)=>{this.multiSelection?e.type="checkbox":e.type="radio",e.position=t})),this._selectOptionDefault()}_eventChildren(e){const t=e.target||e.detail.keyboardEvent.target;-1!==t.nodeName.indexOf("-")&&("radiogroup"===this._typeGroup?this._selectUpdateOption(t.position,!0):this._updateMultiOption(t.position,t.selected))}_selectMultiOption(e){this._options.forEach(((t,i)=>{t.selected=e.includes(i)}))}_updateMultiOption(e,t){this._options.forEach(((i,a)=>{a===e&&(t?(this.selected.push(e),i.selected=!0):(this.selected=this.selected.filter((t=>t!==e)),i.selected=!1))}))}_focusNext(e){if(!this.multiSelection){e.preventDefault(),e.stopPropagation();const t=this._options.length,i=e.detail.keyboardEvent?e.detail.keyboardEvent.target.position:e.target.position,a=parseInt(i,10);this.selected=a+1<t?a+1:0,this._selectUpdateOption(this.selected,!0),this._options[this.selected].focusElement()}}_focusPrevious(e){if(!this.multiSelection){e.preventDefault(),e.stopPropagation();const t=this._options.length,i=e.detail.keyboardEvent?e.detail.keyboardEvent.target.position:e.target.position,a=parseInt(i,10);this.selected=a-1>=0?a-1:t-1,this._selectUpdateOption(this.selected,!0),this._options[this.selected].focusElement()}}}f("colors.primaryCoreLightened"),f("colors.cool80"),f("colors.cool70"),f("colors.primaryCoreLightened"),f("colors.cool100"),f("colors.tertiaryType6Darkened"),f("colors.tertiaryType4Darkened");const mi=new o;var pi=r`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${n(l.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${n(l.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${n(l.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${n(l.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  visibility: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.veil {
  opacity: 0;
  position: fixed;
  transition: visibility 0.2s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing);
  visibility: hidden;
  pointer-events: none;
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  max-width: 45rem;
}

.transition-container {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  transform: translateY(100%);
  transition: visibility var(--_help-modal-transition-duration), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  width: 100%;
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 50%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: flex;
  justify-content: center;
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${n($.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${n(N.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) 0 0);
  transform: translateZ(0.01px);
}

:host(:not([full-height])) .slot-footer {
  background-color: var(--_help-modal-footer-bg-color);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
}
:host([full-height]) .modal-header {
  width: 100%;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${n($.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${n(N.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].footer-button {
  text-align: center;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
  pointer-events: all;
}
:host([visible]) .transition-container {
  transform: translateY(0%);
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}

:host(:not([visible])) {
  position: relative;
  height: auto;
  width: auto;
  --bbva-help-modal-transition-duration: 0.15s;
  --bbva-help-modal-veil-transition-duration: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8,0,1,1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8,0,1,1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  visibility: hidden;
  opacity: 0;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.15s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.2s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
:host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${mi.mediaRules()}`;class ui extends(c(d(te))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":ie,"bbva-icon":D,"bbva-text":v,"bbva-header-main":Mt,"bbva-link":V}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=ae(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,pi,m("bbva-help-modal-shared-styles"),re.light,S.light]}get _fixedIOSHeader(){return p`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?p`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
              id="helpModalHeader"
              ?show-text-icon="${this.showTextIcon}"
              variant="${this.headerType}"
              text="${this.headerText}"
              icon-right-primary="${this.iconRightPrimary}"
              icon-right-secondary="${this.iconRightSecondary}"
              icon-left-primary="${this.iconLeftPrimary}"
              icon-left-secondary="${this.iconLeftSecondary}"
              accessibility-text-icon-left-primary="${this.accessibilityTextIconLeftPrimary}"
              accessibility-text-icon-left-secondary="${this.accessibilityTextIconLeftSecondary}"
              accessibility-text-icon-right-primary="${this.accessibilityTextIconRightPrimary}"
              accessibility-text-icon-right-secondary="${this.accessibilityTextIconRightSecondary}"
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return p`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?p`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:p`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":p`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return p`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?p`<bbva-link
                  ambient="light"
                  class="footer-button"
                  data-tag-name="bbva-link"
                  @click="${()=>this._handleClick("footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return p`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-icon
            class="title-icon"
            data-tag-name="bbva-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-icon>
          ${this.titleText?p` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                .lines="${this.titleLines}"
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const e=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==e||e.scrollTo(0,0)}))}))}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(e)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return p`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${X({"half-height":!this.fullHeight})}"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this.helpModalFooter}
          </div>
        </div>
      </section>
    `}}customElements.define(ui.is,ui);const gi=["metasegura-details-characteristics-bullet-one","metasegura-details-characteristics-bullet-two"],fi=["metasegura-details-benefits-bullet-one","metasegura-details-benefits-bullet-two","metasegura-details-benefits-bullet-three"],yi=["metasegura-details-considerations-bullet-one","metasegura-details-considerations-bullet-two","metasegura-details-considerations-bullet-three"],$i=[{title:"metasegura-modal-saving-in-dollars-label",accordions:[{question:"metasegura-modal-saving-in-dollars-question-one",answer:"metasegura-modal-saving-in-dollars-answer-one"},{question:"metasegura-modal-saving-in-dollars-question-two",answer:"metasegura-modal-saving-in-dollars-answer-two"}]},{title:"metasegura-modal-life-insurance-label",accordions:[{question:"metasegura-modal-life-insurance-question-one",answer:"metasegura-modal-life-insurance-answer-one"}]},{title:"metasegura-modal-plan-details-label",accordions:[{question:"metasegura-modal-plan-details-question-one",answer:"metasegura-modal-plan-details-anwer-one"},{question:"metasegura-modal-plan-details-question-two",answer:"metasegura-modal-plan-details-anwer-two"}]}],xi={min:0,max:0,suggested:{amount:0,localCurrency:0},contribution:{monthly:{amount:0,localCurrency:0,isAvailable:!1},annual:{amount:0,localCurrency:0,isAvailable:!1}}},ki={height:"full",headerType:"modal-three-level",headerText:"metasegura-offer-name",microillustration:"caution",heading:"metasegura-error-modal-health-requirements-heading",texts:[{value:"metasegura-error-modal-health-requirements-text-one",key:"spacing"},{value:"metasegura-error-modal-health-requirements-text-two",key:""}],customContent:!1,primaryButtonText:"metasegura-exit-label",secondaryButtonText:"",events:{iconHeader:"close-offer",footerButton:"close-offer",footerlink:"",veil:"close-offer"}},_i={height:"full",headerType:"modal-three-level",headerText:"metasegura-offer-name",microillustration:"caution",heading:"metasegura-error-account-level-heading",texts:[{value:"metasegura-error-account-level-text-one",key:""}],customContent:!1,primaryButtonText:"metasegura-exit-label",secondaryButtonText:"",events:{iconHeader:"close-offer",footerButton:"close-offer",footerlink:"",veil:"close-offer"}},Si={height:"full",headerType:"modal-three-level",headerText:"metasegura-offer-name",microillustration:"caution",heading:"",texts:[{value:"metasegura-error-modal-cumulus-body",key:""}],customContent:!1,primaryButtonText:"metasegura-exit-label",secondaryButtonText:"",events:{iconHeader:"close-offer",footerButton:"close-offer",footerlink:"",veil:"close-offer"}},Mi={height:"full",headerType:"modal",headerText:"metasegura-offer-name",microillustration:"error",heading:"metasegura-error-communication-int-heading",texts:[{value:"metasegura-error-communication-int-text-one"}],customContent:!1,primaryButtonText:"metasegura-retry-label",secondaryButtonText:"metasegura-close-label",events:{iconHeader:"close-offer",footerButton:"retry-last-request",footerlink:"close-offer",veil:"close-offer"}},Ci={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"",bodyText:"metasegura-error-modal-remove-address-body",primaryButtonText:"metasegura-continue-label",secondaryButtonText:"metasegura-cancel-label",events:{iconHeader:"",footerButton:"remove-address",footerlink:"",veil:""}},Li={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"",bodyText:"metasegura-error-modal-remove-beneficary-body",primaryButtonText:"metasegura-continue-label",secondaryButtonText:"metasegura-cancel-label",events:{iconHeader:"",footerButton:"remove-beneficiary",footerlink:"",veil:""}},wi={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"metasegura-error-modal-insufficient-balance-title",bodyText:"metasegura-error-modal-insufficient-balance-body",primaryButtonText:"metasegura-exit-label",secondaryButtonText:"metasegura-error-modal-insufficient-balance-link",events:{iconHeader:"",footerButton:"close-offer",footerlink:"",veil:""}},Zi={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"",bodyText:"metasegura-error-modal-invalid-code-body",primaryButtonText:"metasegura-understood-label",secondaryButtonText:"",events:{iconHeader:"",footerButton:"",footerlink:"",veil:""}},Ai={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"metasegura-error-modal-beneficiaries-info-title",bodyText:"metasegura-error-modal-beneficiaries-info-body",primaryButtonText:"metasegura-exit-label",secondaryButtonText:"",events:{iconHeader:"",footerButton:"close-offer",footerlink:"",veil:""}},zi={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"",bodyText:"metasegura-error-modal-abandon-process-body",primaryButtonText:"metasegura-exit-label",secondaryButtonText:"metasegura-return-label",events:{iconHeader:"",footerButton:"close-offer",footerlink:"",veil:""}},Hi={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"metasegura-error-modal-pdf-error-title",bodyText:"metasegura-error-modal-pdf-error-body",primaryButtonText:"metasegura-retry-label",secondaryButtonText:"metasegura-exit-label",events:{iconHeader:"",footerButton:"retry-last-request",footerlink:"",veil:""}},Vi={height:"half",modalType:"warning",titleIcon:"coronita:alert",titleText:"metasegura-error-modal-pdf-error-title",bodyText:"metasegura-error-modal-pdf-error-three-retries-body",primaryButtonText:"metasegura-exit-label",secondaryButtonText:"",events:{iconHeader:"",footerButton:"",footerlink:"",veil:""}},Ti={height:"full",headerType:"modal-three-level",headerText:"metasegura-health-questionnaire-privacy-notice-link-label",microillustration:"",heading:"",titleIcon:"coronita:info",texts:[{value:"metasegura-info-modal-privacy-notice-text-one",key:"grey-text spacing"},{value:"metasegura-info-modal-privacy-notice-text-two",key:"grey-text"}],customContent:!1,primaryButtonText:"metasegura-understood-label",secondaryButtonText:"",events:{iconHeader:"",footerButton:"",footerlink:"",veil:""}},Ei={height:"full",headerType:"modal-three-level",headerText:"metasegura-beneficiaries-step-link-info",microillustration:"lifeinsurance",heading:"metasegura-beneficiaries-step-title",texts:[{value:"metasegura-error-beneficiary-text-one",key:"spacing"}],customContent:!0,primaryButtonText:"metasegura-understood-label",secondaryButtonText:"",events:{iconHeader:"",footerButton:"",footerlink:"",veil:""}},Bi={height:"full",headerType:"modal",headerText:"metasegura-offer-name",microillustration:"error",heading:"metasegura-error-operation-not-performed-heading",texts:[{value:"metasegura-error-operation-not-performed-text-one",key:""}],customContent:!1,primaryButtonText:"metasegura-understood-label",secondaryButtonText:"",events:{iconHeader:"close-offer",footerButton:"close-offer",footerlink:"",veil:"close-offer"}},Ii={height:"full",headerType:"modal",headerText:"metasegura-offer-name",microillustration:"error",heading:"metasegura-error-modal-contracting-heading",texts:[{value:"metasegura-error-modal-contracting-text-one",key:""}],customContent:!1,primaryButtonText:"metasegura-retry-label",secondaryButtonText:"metasegura-exit-label",events:{iconHeader:"close-offer",footerButton:"retry-last-request",footerlink:"close-offer",veil:"close-offer"}},Pi={height:"full",headerType:"modal",headerText:"metasegura-offer-name",microillustration:"error",heading:"metasegura-error-modal-contracting-error-three-retries-heading",texts:[{value:"metasegura-error-modal-contracting-error-three-retries-text-one",key:""}],customContent:!1,primaryButtonText:"metasegura-understood-label",secondaryButtonText:"",events:{iconHeader:"close-offer",footerButton:"close-offer",footerlink:"",veil:"close-offer"}},Di=document.createElement("template");Di.setAttribute("style","display: none;"),Di.innerHTML='\n<cells-iconset-svg name="coronita" width="260" height="260">\n  <template>\n    <svg>\n      <defs>\n\n<g id="BBVAcontigo" fill-rule="evenodd">\n<path d="M62.8 112.2h-14c-.6 0-1 .5-1 1v12.5c0 .6.5 1 1 1h14c6.8 0 9.6-2.1 9.6-7.4 0-5.2-3-7.1-9.6-7.1zm33.8-6.6h13.7c5.1 0 7.7-2.1 7.7-6.2s-2.6-6.2-7.7-6.2H96.6c-.5 0-1 .5-1 .8v10.5c0 .7.5 1.1 1 1.1zm13.9 6.6h-14c-.6 0-1 .5-1 1v12.5c0 .6.5 1 1 1h14c6.6 0 9.6-2.1 9.6-7.4 0-5.2-3-7.1-9.6-7.1zM49 105.6h13.7c5.1 0 7.7-2.1 7.7-6.2s-2.6-6.2-7.7-6.2H48.8c-.5 0-.8.5-.8.8v10.5c0 .7.5 1.1 1 1.1z"/><path d="M250 189.4V29.6c-.1-5.4-4.4-9.7-9.7-9.8H19.7c-5.2-.2-9.5 3.9-9.7 9v211.5l39.8-39.9h190.4c5.5-.2 9.9-4.8 9.7-10.3.1-.3.1-.5.1-.7zM63.5 133.6H41.2c-.6 0-1-.5-1-1V87.3c0-.6.5-1 1-1h23c8.2 0 13.9 5 13.9 12.3 0 4.4-2 7.8-5.2 9.5 0 0 7.4 2.2 7.6 11.4-.1 9.4-5.9 14.1-17 14.1zm47.5 0H88.8c-.6 0-1-.5-1-1V87.3c0-.6.5-1 1-1h23c8.2 0 13.9 5 13.9 12.3 0 4.4-1.9 7.8-5.2 9.5 0 0 7.5 2.2 7.6 11.4-.1 9.4-6 14.1-17.1 14.1zm41.7-.4-24.4-45.7c-.2-.4.1-1 .6-1h7.4c.4 0 .7.2.8.4l15.5 29.5c.4.6 1.3.6 1.7 0L169.9 87c.1-.4.5-.4.8-.4h7.4c.4 0 .8.5.6 1l-24.4 45.7c-.3.5-1.2.5-1.6-.1zm66.9-6.5h-7.4c-.4 0-.7-.2-.8-.5l-15.5-29.5c-.4-.6-1.3-.6-1.6 0l-15.5 29.5c-.1.3-.5.5-.8.5h-7.4c-.5 0-.8-.5-.6-1L194.4 80c.3-.6 1.2-.6 1.6 0l24.4 45.7c0 .4-.4 1-.8 1z"/>\n</g>\n<g id="account" fill-rule="evenodd">\n<path d="M219 40H-1v140h220ZM29 70h60L69 90H29Zm120.06 70H29v-20h140ZM239 100v100H39l-20 20h240V80Z"/><path d="M219 40H-1v140h220ZM29 70h60L69 90H29Zm120.06 70H29v-20h140ZM239 100v100H39l-20 20h240V80Z"/><path d="M219 40H-1v140h220ZM29 70h60L69 90H29Zm120.06 70H29v-20h140ZM239 100v100H39l-20 20h240V80Z"/>\n</g>\n<g id="add" fill-rule="evenodd">\n<path d="M129.5 9.5c-66.3 0-120 53.7-120 120s53.7 120 120 120 120-53.7 120-120-53.7-120-120-120zm50 130.5H139v50h-20v-50H69v-20h50V70h20v50h60.5l-20 20z"/>\n</g>\n<g id="addnotes" fill-rule="evenodd">\n<path d="M185.25 109.75a84.71 84.71 0 0 1 24.75 3.69V20a10 10 0 0 0-9.93-10H190l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10h-10V10h-10L90 20H80V10H70L60 20H50V10H39.93A10 10 0 0 0 30 20v220a10 10 0 0 0 9.93 10H50l10-10h10v10h10l10-10h10v10h10l6-6a84.93 84.93 0 0 1 69.23-134.23ZM60 60h110l-20 20H60Zm0 60v-20h80l-20 20Z"/><path d="M185 130a65 65 0 1 0 65 65 65 65 0 0 0-65-65Zm33.33 73.12h-25.2V235h-16.25v-31.88H145v-16.25h31.88V155h16.25v31.87H225Z"/>\n</g>\n<g id="advance" fill-rule="evenodd">\n<path d="m193.4 115.7-56.5-56.4L158 38.1l92 92.4-91.3 91.6-21.2-21.1 55.5-55.5H10l28.8-29.8z"/>\n</g>\n<g id="aeroplane" fill-rule="evenodd">\n<path d="M242.94 17.17a23.58 23.58 0 0 0-33.35 0l-45 45L39.66 38.11a11.32 11.32 0 0 0-10.22 3.1l-9.06 9.06L118 108.81l-45.71 45.66-52.15 1.48a11.32 11.32 0 0 0-5.78 3.1l-4.25 4.25 58.61 28.1 28.1 58.6 4.25-4.25a11.32 11.32 0 0 0 3.1-5.78l1.48-52.15 45.66-45.66 58.55 97.57 9.06-9.06a11.32 11.32 0 0 0 3.1-10.22L197.93 95.53l45-45a23.58 23.58 0 0 0 .01-33.36Z"/>\n</g>\n<g id="agenda" fill-rule="evenodd">\n<path d="M210 40v190.15H67.72C50.6 230.12 51 210 67.9 210H190V12h.22v-2H55.14C41.36 10 30 21.85 30 35.69V50h20v20H30v8.47c0 .36.11.54.12.89l.1 20.64H50v20H30.22v30H50v20H30.21v52.79c0 13 13.88 23.63 26.41 26.61a31.57 31.57 0 0 0 7.24.76c57.64 0 108.49.07 166.14.07V40ZM81 130h79l-18.47 20H81Z"/>\n</g>\n<g id="alarm" fill-rule="evenodd">\n<path d="M65.83 121.32 88 117l56 56.41-6.11 20.48-72-72.53Zm105 63.2 40.65-40.92a69.1 69.1 0 0 0 20.3-48.27 67.17 67.17 0 0 0-11.89-38.93L240 36.12 224 20l-19.95 20.07a65.08 65.08 0 0 0-39.87-12.73A68.64 68.64 0 0 0 116.51 48L75.9 88.89l-52.63 14.05c-3.57 1-4.34 3.84-1.72 6.45l39.59 39.42c-.21.2-.43.4-.64.61a34.7 34.7 0 0 0 0 48.78 34.14 34.14 0 0 0 48.45 0l.61-.65 40.1 40.86c2.59 2.64 5.5 1.89 6.5-1.67l14.64-52.24Zm0 0"/>\n</g>\n<g id="alert" fill-rule="evenodd">\n<path d="M130 190a15 15 0 1 0 15 15 15 15 0 0 0-15-15Zm10-20h-20V90l20 20Zm98.81 58.88L135.62 24.61c-3.11-6.15-8.13-6.14-11.23 0L21.19 228.88c-3.11 6.12.08 11.12 7.1 11.12h203.42c7.03 0 10.2-5 7.1-11.12Z"/>\n</g>\n<g id="alphabeticalorder" fill-rule="evenodd">\n<path d="M53.27 68.72 10.57 189.8H35l9.29-26.89h41.08L95 191.75l25.59-3.91-42-119.13Zm-2.44 75L65 102.61h.33l13.85 41.07Zm195.85 23.59h-59.35l61.3-79.78V68.72H154.9l3.89 21.89h56.59l-62.59 79.94v18.17h97.78l-3.89-21.41z"/><path d="M164.94 118.72h-50v20h40l10-20z"/>\n</g>\n<g id="appstore" fill-rule="evenodd">\n<path d="M137.06 72.83q6 0 19.55-4.65t23.53-4.65a50.17 50.17 0 0 1 29.12 8.78A72.93 72.93 0 0 1 223.49 86q-10.64 9-15.56 16.09a48.17 48.17 0 0 0-8.93 28.18 52 52 0 0 0 9.44 30.45q9.44 13.56 21.54 17.15-5.05 16.35-16.75 34.17-17.68 26.72-35.1 26.72-6.91 0-19.08-4.39T138.52 230q-8.38 0-19.48 4.59t-18 4.59q-20.88 0-41-35.37Q40 168.82 40 135.19q0-31.24 15.36-50.92t38.76-19.69q10 0 24.13 4.12t18.81 4.13Zm41.62-54.91a51.06 51.06 0 0 1-4 18.61 55.17 55.17 0 0 1-12.63 18.75q-7.45 7.31-14.76 9.84a70.28 70.28 0 0 1-14.09 2.26q.27-20.21 10.57-35t34.1-20.21a16.13 16.13 0 0 1 .66 3.06q.15 1.36.15 2.68Z"/>\n</g>\n<g id="arrows" fill-rule="evenodd">\n<path d="m80 10 12.5 12.2L130 58.6l-12.5 12.2-26.8-26V160l-21.4-20.4V44.8l-26.8 26L30 58.6zm100 240-12.5-12.2-37.5-36.4 12.5-12.2 26.8 26V100l21.4 20.4v94.8l26.8-26 12.5 12.2z"/>\n</g>\n<g id="atm" fill-rule="evenodd">\n<path d="M10 20v80h40v130.07A10 10 0 0 0 60 240h140a10 10 0 0 0 10-9.93V100h40V20Zm90 190-20-20v-50h20ZM230 80h-20V60h-30v150l-20-20V60H50v20H30V40h200Z"/>\n</g>\n<g id="attached" fill-rule="evenodd">\n<path d="M115.06 70.03v90.03l29.98 30.01v-90.03l-29.98-30.01z"/><path d="M130.05 40a44.94 44.94 0 0 1 45 45v55l30 30V85A75 75 0 0 0 58.3 63.22L85.08 90v-5a45 45 0 0 1 44.97-45Zm69.05 164.18-24.38-24.41A45 45 0 0 1 85 175v-45l-30-30v75a75 75 0 0 0 144.1 29.21Z"/>\n</g>\n<g id="audio" fill-rule="evenodd">\n<path d="M132.93 21.62 60.89 80h-40a10 10 0 0 0-10 10v80a10 10 0 0 0 10 10h40l72 58.33c4.4 3.3 8 1.58 8-4.05V25.67c0-5.53-3.64-7.29-7.96-4.05ZM182.39 88.81l-21.26 21.25a30 30 0 0 1 0 42.5l21.26 21.25a60.09 60.09 0 0 0 0-85Z"/><path d="m224.91 46.31-21.26 21.25a90.13 90.13 0 0 1 0 127.5l21.26 21.25a120.17 120.17 0 0 0 0-170Z"/>\n</g>\n<g id="auto" fill-rule="evenodd">\n<path d="M239.08 110h-11.37l-19.8-67.9a3.09 3.09 0 0 0-2.79-2.1H55.62a3.13 3.13 0 0 0-2.81 2.08L32.14 110H20.92A10.91 10.91 0 0 0 10 120.9v10.93A11.14 11.14 0 0 0 20.92 143H30v86.08A10.91 10.91 0 0 0 40.9 240h12.65c6 0 10.45-4.89 10.45-10.92V220h131v9.08A10.88 10.88 0 0 0 205.87 240h10.93c6 0 13.19-4.89 13.19-10.92V143h9.08A11.14 11.14 0 0 0 250 131.83V120.9a10.91 10.91 0 0 0-10.92-10.9ZM70 60h120l15 50H55Zm-5 110a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm130 0a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/>\n</g>\n<g id="autobank" fill-rule="evenodd">\n<path d="M240 10H10v230h22.27V32.34H240V10z"/><path d="M244.72 129h-9.67l-16.83-57.47a2.41 2.41 0 0 0-2.37-1.53H88.77a2.44 2.44 0 0 0-2.39 1.52L68.82 129h-9.54c-5.13 0-9.28 4.65-9.28 9.76v9.29a9 9 0 0 0 9.28 8.95H67v73.72a9.27 9.27 0 0 0 9.26 9.28H87a9 9 0 0 0 9-9.28V223h111v7.72a9.47 9.47 0 0 0 9.49 9.28h9.29c5.11 0 11.21-4.15 11.21-9.28V157h7.72a9 9 0 0 0 9.28-8.94v-9.29c.01-5.12-4.14-9.77-9.27-9.77ZM101 87h102l12.75 42H88.25Zm-2 98a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm106 0a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/>\n</g>\n<g id="automaticAccess" fill-rule="evenodd">\n<path d="m140 160-40-40 14-14 26 26 76-76 14 14z"/><path d="M180 210H60V30h120v34l20-20V20c0-5.5-4.5-10-10-10H50c-5.5 0-10 4.5-10 10v220c0 5.5 4.5 10 10 10h140c5.5 0 10-4.5 10-10V128l-20 20v62zm-60 30c-5.5 0-10-4.5-10-10s4.5-10 10-10 10 4.5 10 10-4.5 10-10 10z"/>\n</g>\n<g id="back" fill-rule="evenodd">\n<path d="m160.71 172.435-14.142 14.142L90 130.01l14.142-14.142z"/><path d="m160.706 87.575-56.568 56.568-14.142-14.142 56.568-56.569z"/>\n</g>\n<g id="bakery" fill-rule="evenodd">\n<path d="M231.08 28.08C210.7 7.7 162.34 21.72 114.59 59H170l-16.67 20H91.45q-2.89 2.76-5.76 5.62-7.1 7.1-13.53 14.38H140l-16.67 20H55.9c-5 6.7-9.49 13.4-13.51 20H101l-16.67 20H31.61c-14.28 30.58-16.25 57.2-2.45 71 24.53 24.53 89.62-.78 145.38-56.54s81.07-120.85 56.54-145.38Z"/>\n</g>\n<g id="balance" fill-rule="evenodd">\n<path d="M138.45 190h.93v-16.87C152 169.93 160 161 160 148.9c0-13-6-19.39-25.49-27.37-13.2-5.43-16.14-7.9-16.14-13.22 0-5.68 4.54-9.05 12.87-9.05a32.47 32.47 0 0 1 18 5.7l1.9 1.31 1.27.87.25-1.42.38-2.13 2-11.32.15-.88.1-.58-.57-.3-.86-.44a43.86 43.86 0 0 0-14.47-4.49v-8.14L123.87 70h-.93v15.89c-13.31 2.59-21.79 11.26-21.79 23.27 0 12.23 5.93 18.23 25.36 26.17 13.42 5.46 16.27 8 16.27 14.42s-5.3 10.5-14.08 10.5a45.86 45.86 0 0 1-22.91-6.75l-1.88-1.12-1.25-.74-.22 1.34-.33 2-1.87 11.56-.15.9-.1.6.59.28.89.43a61.32 61.32 0 0 0 21.46 5.46v8.36ZM50 70a100 100 0 0 1 174.24 26.5l29.83-5.42A130 130 0 0 0 28.63 48.63L10 30 0 100l70-10Zm140 100 20 20a100 100 0 0 1-174.24-26.5l-29.83 5.42a130 130 0 0 0 225.44 42.45L250 230l10-70Z"/>\n</g>\n<g id="balanceeuro" fill-rule="evenodd">\n<path d="m259.097 159.792-9.93 69.514-18.497-18.497c-23.661 29.44-59.96 48.288-100.67 48.288-56.652 0-104.78-36.493-122.162-87.254l-1.046-3.191 29.619-5.386c13.679 38.483 50.413 66.04 93.59 66.04 31.284 0 59.178-14.476 77.379-37.087l2.057-2.645-19.854-19.852 69.514-9.93zM130 .902c56.652 0 104.78 36.495 122.162 87.255l1.046 3.191-29.619 5.386C209.91 58.252 173.176 30.694 130 30.694c-31.285 0-59.179 14.477-77.38 37.087l-2.057 2.645 19.854 19.852-69.514 9.93 9.93-69.514L29.33 49.191C52.991 19.753 89.29.903 130 .903zm3.193 87.183c12.204 0 23.253 4.692 31.252 12.276l12.5-11.855C165.747 77.888 150.28 71.32 133.192 71.32c-31.714 0-57.836 22.633-61.431 51.795l-.268 2.695a56.351 56.351 0 0 0-.173 4.19c0 32.407 27.702 58.68 61.874 58.68 17.087 0 32.555-6.568 43.751-17.186l-12.5-11.856c-7.998 7.585-19.047 12.277-31.251 12.277-16.357 0-30.625-8.433-38.268-20.958h29.428l17.68-16.767H89.219a40.171 40.171 0 0 1-.222-4.19c0-1.415.077-2.814.222-4.191h35.134l17.68-16.767H94.925c7.643-12.524 21.911-20.957 38.268-20.957z"/>\n</g>\n<g id="bank" fill-rule="evenodd">\n<path d="M20 220h220v20H20zM129.62 10 20 70v20h220V70L129.62 10zM40 110h40v90H40zm70 0h40v90h-40zm70 0h40v90h-40z"/>\n</g>\n<g id="bar" fill-rule="evenodd">\n<path d="m243.39 52.41-56.39.11v-25.2c0-3.8-2.75-7.32-6.56-7.32H16.67C12.86 20 10 23.51 10 27.32v215.36c0 3.8 2.86 7.32 6.67 7.32h163.77c3.81 0 6.56-3.51 6.56-7.32v-44l56.39.11a6.56 6.56 0 0 0 6.61-6.28V58.69a6.57 6.57 0 0 0-6.61-6.28ZM62 140h-.7L41 119.91V51h21Zm157 26h-32V83h32Z"/>\n</g>\n<g id="barcode" fill-rule="evenodd">\n<path d="M244.46 40H15.54A5.44 5.44 0 0 0 10 45.34v169.32a5.45 5.45 0 0 0 5.54 5.34h228.92a5.44 5.44 0 0 0 5.54-5.34V45.34a5.45 5.45 0 0 0-5.54-5.34ZM60 190H40V70h20Zm40 0H80v-20h20Zm0-40H80V70h20Zm40 40h-20v-20h20Zm0-40h-20V70h20Zm40 40h-20v-20h20Zm0-40h-20V70h20Zm40 40h-20V70h20Z"/>\n</g>\n<g id="bbva" fill-rule="evenodd">\n<path d="m182.9 103.8-20.7 39.3c-.5.8-1.7.8-2.2 0l-20.7-39.3c-.2-.3-.6-.6-1.1-.6h-9.9c-.6 0-1.1.8-.8 1.3l32.5 60.9c.5.8 1.7.8 2.1 0l32.5-60.9c.3-.6-.2-1.3-.8-1.3h-9.9c-.4 0-.9.1-1 .6m11.6 52.4 20.7-39.3c.5-.8 1.7-.8 2.2 0l20.7 39.3c.2.3.6.6 1.1.6h9.9c.6 0 1.1-.8.8-1.3l-32.5-60.9c-.5-.8-1.7-.8-2.1 0l-32.5 60.9c-.3.6.2 1.3.8 1.3h9.9c.4 0 .9-.2 1-.6M53.5 132c4.3-2.2 6.9-6.8 6.9-12.6 0-9.8-7.6-16.4-18.5-16.4H11.3c-.6 0-1.3.5-1.3 1.3v60.4c0 .6.5 1.3 1.3 1.3H41c14.8 0 22.6-6.3 22.6-18.8-.3-12.3-10.1-15.2-10.1-15.2m-32-19.8H40c6.8 0 10.3 2.8 10.3 8.2 0 5.4-3.5 8.2-10.3 8.2H21.7c-.6 0-1.3-.5-1.3-1.3v-14c0-.5.5-1.1 1.1-1.1m18.6 44.6H21.5c-.6 0-1.3-.5-1.3-1.3v-16.7c0-.6.5-1.3 1.3-1.3h18.6c8.8 0 12.8 2.5 12.8 9.5s-3.8 9.8-12.8 9.8m76.8-24.8c4.3-2.2 6.9-6.8 6.9-12.6 0-9.8-7.6-16.4-18.5-16.4H74.7c-.6 0-1.3.5-1.3 1.3v60.4c0 .6.5 1.3 1.3 1.3h29.7c14.8 0 22.6-6.3 22.6-18.8-.1-12.3-10.1-15.2-10.1-15.2m-31.8-19.8h18.3c6.8 0 10.3 2.8 10.3 8.2 0 5.4-3.5 8.2-10.3 8.2H85.1c-.6 0-1.3-.5-1.3-1.3v-14c0-.5.6-1.1 1.3-1.1m18.6 44.6H85.1c-.6 0-1.3-.5-1.3-1.3v-16.7c0-.6.5-1.3 1.3-1.3h18.6c8.8 0 12.8 2.5 12.8 9.5s-4 9.8-12.8 9.8"/>\n</g>\n<g id="beconomy" fill-rule="evenodd">\n<path d="M130 9.5c-66.3 0-120 53.7-120 120s53.7 120 120 120 120-53.7 120-120-53.7-120-120-120zM115 195c-35.9 0-65-29.1-65-65s29.1-65 65-65c18 0 34.3 7.3 46 19.1l-14.1 14.1C138.7 90.1 127.4 85 115 85c-15.6 0-29.3 7.9-37.4 20h46l-20 20H70.3c-.2 1.6-.3 3.3-.3 5s.1 3.4.3 5h53.3l-20 20h-26c8.1 12.1 21.8 20 37.4 20 12.5 0 23.7-5.1 31.9-13.3l14.1 14.1c-11.8 11.9-28 19.2-46 19.2zm72.9-44.4-13.8 13.8-28.4-28.4 14.2-14.2 14.2 14.2 42.4-42.4 14.2 14.2-42.8 42.8z"/>\n</g>\n<g id="bigglass" fill-rule="evenodd">\n<path d="m40 20 28.2 210.1c1 5.7 6 9.8 11.8 9.9h100c5.8 0 10.8-4.1 11.8-9.9L220 20H40zm47 200-2.7-20h91.3l-2.6 20H87zm91.3-40H81.7L62.9 40h134.3l-18.9 140z"/>\n</g>\n<g id="bill" fill-rule="evenodd">\n<path d="M210.07 10H200l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10H90V10H80L70 20H60V10H49.93A10 10 0 0 0 40 20v220a10 10 0 0 0 9.93 10H60l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10.07a10 10 0 0 0 9.93-10V20a10 10 0 0 0-9.93-10ZM140 178.76V200l-20-10v-10.5a72.42 72.42 0 0 1-22.5-6.3l2.9-17.14c8.4 4.82 18.82 8.64 28.81 8.64 8.83 0 14.91-4.11 14.91-11.9 0-7.22-3.47-10.2-18-16.29-19.4-7.79-27.22-14-27.22-29.18 0-13.57 8.4-22.69 21.05-26V60l20 10v10.53a51.8 51.8 0 0 1 17.58 5.42l-2.9 17c-7.24-4.67-15.78-7.65-23.6-7.65-9.55 0-13.75 4.53-13.75 10.48 0 6.23 3.18 9.21 17.08 14.87C155 128.87 162.5 135.81 162.5 151s-9.09 24.56-22.5 27.76Z"/>\n</g>\n<g id="billspayments" fill-rule="evenodd">\n<path d="M191.26 124.348c37.475 0 67.827 30.352 67.827 67.826 0 37.473-30.352 67.826-67.826 67.826-37.474 0-67.826-30.353-67.826-67.826 0-37.474 30.352-67.826 67.826-67.826Zm-5.708 22.609v12.038c-8.704 2.035-14.582 8.31-14.582 17.862 0 9.681 4.506 14.006 15.591 18.864l2.156.918c9.44 4.126 11.7 6.104 11.7 11.022 0 5.312-3.956 8.082-9.721 8.082-5.688 0-11.592-1.99-16.652-4.685l-2.114-1.193-1.865 11.644a44.704 44.704 0 0 0 12.665 3.986l2.879.365v5.88l11.304 5.651v-11.926c9.213-1.978 15.544-8.422 15.488-19.105 0-9.715-4.387-14.439-16.16-19.648l-2.154-.925c-9.044-3.844-11.135-5.822-11.135-10.06 0-4.07 2.77-7.123 8.987-7.123 4.451 0 9.249 1.558 13.559 4.068l1.815 1.132 1.865-11.53c-3.014-1.602-6.146-2.81-9.953-3.464l-2.368-.323v-5.878l-11.305-5.652Z"/><path d="M202.565 0c6.243 0 11.305 5.061 11.305 11.304l.004 93.285a90.598 90.598 0 0 0-22.613-2.85c-49.946 0-90.435 40.49-90.435 90.435 0 16.477 4.407 31.926 12.106 45.23l-68.628-.013c-6.243 0-11.304-5.06-11.304-11.304V11.304C33 5.061 38.061 0 44.304 0h158.261Zm-79.13 79.13H66.913v22.61h33.913l22.609-22.61Zm45.217-45.217H66.913v22.609h79.13l22.61-22.609Z"/>\n</g>\n<g id="biometric" fill-rule="evenodd">\n<path d="M30 30h30V10H10v50h20zm0 170H10v50h50v-20H30zm200 30h-30v20h50v-50h-20zM200 10v20h30v30h20V10zm-62.5 137.5v-35c0-4.1-3.4-7.5-7.5-7.5s-7.5 3.4-7.5 7.5v35c0 4.1 3.4 7.5 7.5 7.5s7.5-3.4 7.5-7.5z"/><path d="M130 43c-82.5 0-110 87.5-110 87.5S47.5 218 130 218s110-87.5 110-87.5S212.5 43 130 43zm0 157c-24.7 0-45.5-17.2-51-40.2l13.5-13.5v1.3c0 20.7 16.8 37.5 37.5 37.5s37.5-16.8 37.5-37.5v-12.4l14.9 14.9c-1.3 27.7-24.3 49.9-52.4 49.9zm-22.5-52.5v-35c0-12.4 10.1-22.5 22.5-22.5s22.5 10.1 22.5 22.5v35c0 12.4-10.1 22.5-22.5 22.5s-22.5-10.1-22.5-22.5zm75-18.6-15-15v-1.4c0-20.7-16.8-37.5-37.5-37.5s-37.5 16.8-37.5 37.5V125l-15 15v-27.5C77.5 83.6 101.1 60 130 60s52.5 23.6 52.5 52.5v16.4z"/>\n</g>\n<g id="bizum" fill-rule="evenodd">\n<path d="M186.5 51.4c-8.6-6.3-20.6-4.4-26.9 4.3L69.2 182.1c-6.3 8.7-4.3 20.9 4.3 27.3 8.6 6.3 20.6 4.4 26.9-4.3l90.5-126.4c6.1-8.8 4.2-21-4.4-27.3zM75.3 41.5c6.3-8.7 4.4-20.9-4.3-27.2-8.7-6.3-20.9-4.4-27.2 4.3-6.3 8.7-4.4 20.9 4.3 27.2 8.7 6.3 20.8 4.4 27.2-4.3zm8 54.4c8.6 6.3 20.6 4.4 26.9-4.3L132.8 60c6.2-8.7 4.3-20.9-4.2-27.3-8.6-6.3-20.6-4.4-26.9 4.3L79.1 68.6c-6.3 8.8-4.4 21 4.2 27.3zm93.4 68.9c-8.6-6.3-20.6-4.4-26.9 4.3l-22.6 31.6c-6.2 8.7-4.3 20.9 4.2 27.3 8.6 6.3 20.6 4.4 26.9-4.3l22.6-31.6c6.3-8.7 4.4-21-4.2-27.3zm34.3 49.4c-8.7-6.3-20.9-4.4-27.2 4.3-6.3 8.7-4.4 20.9 4.3 27.2 8.7 6.3 20.9 4.4 27.2-4.3 6.3-8.7 4.4-20.8-4.3-27.2z"/>\n</g>\n<g id="block" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10ZM40 130a90 90 0 0 1 142.85-72.85l-125.7 125.7A89.59 89.59 0 0 1 40 130Zm90 90a89.59 89.59 0 0 1-52.85-17.15l125.7-125.7A90 90 0 0 1 130 220Z"/>\n</g>\n<g id="blockcard" fill-rule="evenodd">\n<path d="M79 220h160a10 10 0 0 0 10-9.93V50Zm120-40h-40v-20h60ZM19 250 229 40V10l-30 30H19a10 10 0 0 0-10 9.93V80h150l-20 20H9v110.07A10 10 0 0 0 19 220Z"/>\n</g>\n<g id="blog" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm-6 171H60v-60.94L90.15 81h28.65l-30.65 40H124Zm76 0h-64v-60.94L166.15 81h28.65l-30.65 40H200Z"/>\n</g>\n<g id="bluetooth" fill-rule="evenodd">\n<path d="M187.36 82.6 104.6 10.25v96.09L57.36 65.48V94.1l43 36.87-43 38V195l47.25-40.85v96.09l82.75-72.35-55.1-47.65ZM126 203.4V153l29.13 25Zm29.16-120.8L126 108.35V57.09Z"/>\n</g>\n<g id="bonusaccount" fill-rule="evenodd">\n<path d="M240 100v100H40l-20 20h240V80l-20 20z"/><path d="M220 40H0v140h220ZM70 90H30V70h60Zm104.72 50.42L150 126.67l-24.72 13.75 6.56-25.91L110 97.07l28.76-2.25L150 70.39l11.24 24.44L190 97.07l-21.84 17.44Z"/>\n</g>\n<g id="bookstore" fill-rule="evenodd">\n<path d="M210 40v189.9c-1 0-94.2.1-147.19.1-17.22 0-16.92-20 .06-20H190V10H54.24c-2.9 1-6 1.58-8.67 3C36.24 17.72 30.74 25.55 30 36v186.7c0 13 9 23.58 21.57 26.56a31.86 31.86 0 0 0 7.28.73h171.14V40ZM70 50h80l-20 20H70Z"/>\n</g>\n<g id="branch" fill-rule="evenodd">\n<path d="M130 10C74.8 10 30 54.8 30 110v3c2 88.3 91.6 144.7 91.6 144.7 4.6 3.1 12 3.1 16.5.1 0 0 89.8-56.5 91.8-144.8v-3C230 54.8 185.2 10 130 10zm50 174c0 3.3-2.7 6-6 6h-24v-30h-40v30H86c-3.3 0-6-2.7-6-6V60l100-10v134z"/><path d="M120 120h20v20h-20zm0-30.4h20V110h-20zm50 0-20 .4v20h20zM150 120h20v20h-20zM90 89.6h20V110H90zm0 30.4h20v20H90z"/>\n</g>\n<g id="build" fill-rule="evenodd">\n<path d="M40 20v213c0 3.64 4 7 7.64 7H101v-47h49v47h54.46c3.61 0 5.54-3.33 5.54-10V10Zm50 140H60v-30h30Zm0-51H60V80h30Zm50 51h-30v-30h30Zm0-51h-30V80h30Zm50 51h-30v-30h30Zm0-51h-30V80h30Z"/>\n</g>\n<g id="bulb" fill-rule="evenodd">\n<path d="M80.01 170h100v20h-100zM80 200h100v20H80zm60.67 50H100v-20h60.67l-20 20zM130 10a80.07 80.07 0 0 0-77.48 100L80 160h100l27.48-50A80.07 80.07 0 0 0 130 10Zm30 135h-10l16.36-45H93.64L110 145h-10L80 90h100Z"/>\n</g>\n<g id="bullet1" fill-rule="evenodd">\n<path d="M170 160H70l30-60h70v60z"/>\n</g>\n<g id="bullet2" fill-rule="evenodd">\n<path d="M220 160H30l30-60h160v60z"/>\n</g>\n<g id="bus" fill-rule="evenodd">\n<path d="M227.6 79.37h-8.8V29.63a10.26 10.26 0 0 0-10.26-10.26H49.07a10.26 10.26 0 0 0-10.26 10.26v49.74h-9.59a10.54 10.54 0 0 0-10.54 10.54v18.92a10.54 10.54 0 0 0 10.54 10.54h9.58v80a10 10 0 0 0 10 10v21.37a8.63 8.63 0 0 0 8.63 8.63h16.74a8.6 8.6 0 0 0 8.6-8.6v-21.4h91v20.85a9.15 9.15 0 0 0 9.15 9.15h15.63a10.26 10.26 0 0 0 10.26-10.26v-19.74a10 10 0 0 0 10-10v-80h8.8a10.54 10.54 0 0 0 10.54-10.54V89.91a10.54 10.54 0 0 0-10.55-10.54ZM89.48 29.24h80.31l-10.55 20H89.48ZM76.8 185.84a13 13 0 0 1-6.26 6.26c-13.51 6.3-26.66-6.85-20.36-20.36a13 13 0 0 1 6.26-6.26c13.56-6.3 26.66 6.85 20.36 20.36Zm-18-36.42V67.48a5.75 5.75 0 0 1 6-5.46h128a5.75 5.75 0 0 1 6 5.46v81.94Zm148.6 36.42a13 13 0 0 1-6.26 6.26c-13.51 6.3-26.66-6.85-20.36-20.36a13 13 0 0 1 6.26-6.26c13.52-6.3 26.66 6.85 20.36 20.36Z"/>\n</g>\n<g id="butchershop" fill-rule="evenodd">\n<path d="M202.26 10.88s12-3.31 19.42 4.13S225 33.6 225 33.6l-68.13 68.13-22.43-23.38Z"/><path d="M30.59 182.32a14.41 14.41 0 0 0 0 20.38L87 259.13l101.9-101.9-66.6-66.62Zm17.25 1.15a12.9 12.9 0 1 1 0 18.24 12.9 12.9 0 0 1 0-18.24ZM214.08 27.78l-65.17 65-14.47-14.43 65.17-65a10 10 0 0 1 14.13 0l.35.35a10 10 0 0 1-.01 14.08Z"/>\n</g>\n<g id="buy-stock" fill-rule="evenodd">\n<path d="m90 100-70 70v60c0 5.6 4.5 10 10 10h200c5.6 0 10-4.5 10-10V70l-90 90-60-60zm140 90-20 20h-40v20l-40-30 40-30v20h60z"/><path d="M230 20H30c-5.6 0-10 4.5-10 10v100l70-70 60 60 90-90c0-5.6-4.5-10-10-10z"/>\n</g>\n<g id="calculator" fill-rule="evenodd">\n<path d="M220 26a6 6 0 0 0-6-6H46a6 6 0 0 0-6 6v208a6 6 0 0 0 6 6h168a6 6 0 0 0 6-6ZM69 50h120l-20 25H69Zm26 166H70v-25h25Zm0-45H70v-25h25Zm0-45H70v-25h25Zm47 90h-25v-25h25Zm0-45h-25v-25h25Zm0-45h-25v-25h25Zm48 90h-25v-25h25Zm0-45h-25v-25h25Zm0-45h-25v-25h25Z"/>\n</g>\n<g id="calendar" fill-rule="evenodd">\n<path d="M140 190h20v20h-20Zm-40 0h20v20h-20Zm-40 0h20v20H60Zm120-80h20v20h-20Zm-40 0h20v20h-20Zm-40 0h20v20h-20Zm80 40h20v20h-20Zm-40 0h20v20h-20Zm-40 0h20v20h-20Zm-40 0h20v20H60ZM50 70h161l-20 20H50Zm160-30h21c5.54 0 9 3.29 9 8.66v180.16c0 5.48-3.39 11.18-9 11.18H31c-5.54 0-11-5.82-11-11.18V48.66C20 43.18 25.39 40 31 40h19V20h20v20h120V20h20Z"/>\n</g>\n<g id="camera" fill-rule="evenodd">\n<path d="M240 59.94h-50v-30h-90l-30 30H20a10 10 0 0 0-10 10v150a10 10 0 0 0 10 10h220a10 10 0 0 0 10-10v-150a10 10 0 0 0-10-10Zm-200 50v-20h60l-20 20Zm125 100a65 65 0 1 1 65-65 65 65 0 0 1-65 65Zm0-111a45.22 45.22 0 0 0-8 .72v20.59a25 25 0 0 1 32.5 28.68h20.22a45 45 0 0 0-44.72-50Z"/>\n</g>\n<g id="cancelchargecard" fill-rule="evenodd">\n<path d="M210 40H20c-5.5 0-10 4.4-10 9.9V80h120l-20 20H10v108c0 6.6 5.4 12 12 12h28v30l117.6-130H150l30-40 10.8 14.4L240 40V10l-30 30zm-7.2 70.4 7.2 9.6h-20v50l-20 20v-44.7L100 220h140c5.5 0 10-4.4 10-9.9V60l-47.2 50.4z"/>\n</g>\n<g id="carplus" fill-rule="evenodd">\n<path d="M214.64 128.76a65 65 0 0 1 18.27 2.62 11.29 11.29 0 0 0 6.73-10.29v-10.93a10.91 10.91 0 0 0-10.92-10.9h-11.37l-19.8-67.9a3.09 3.09 0 0 0-2.79-2.1H45.26a3.13 3.13 0 0 0-2.81 2.08L21.79 99.26H10.56a10.91 10.91 0 0 0-10.92 10.9v10.93a11.14 11.14 0 0 0 10.92 11.17h9.08v86.08a10.91 10.91 0 0 0 10.9 10.92h12.65c6 0 10.45-4.89 10.45-10.92v-9.08h97.87a65 65 0 0 1 63.13-80.5Zm-160 30.5a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm-10-60 15-50h120l15 50Z"/><path d="M222.91 185.5v-32.42h-16.53v32.42h-25.64l-6.78 16.53h32.42v32.42h16.53v-32.42h32.42V185.5h-32.42z"/>\n</g>\n<g id="cash" fill-rule="evenodd">\n<path d="M239 100v100H39l-20 20h240V80Zm-20-60H-1v140h220ZM70.26 120H19l20-20h31.26a40.3 40.3 0 0 0 0 20ZM109 130a20 20 0 1 1 20-20 20 20 0 0 1-20 20Zm70-10h-31.26a40.3 40.3 0 0 0 0-20H199Z"/>\n</g>\n<g id="cash-up" fill-rule="evenodd">\n<path d="M238.332 119.168 260 97.5v151.668L238.332 227.5H97.5l21.668-21.668h97.5c11.914 0 21.664-9.75 21.664-21.664zM10.832 32.5h195c6.5 0 10.836 4.332 10.836 10.832v130c0 6.5-4.336 10.836-10.836 10.836h-162.5L0 227.5V43.332C0 36.832 4.332 32.5 10.832 32.5zm105.086 60.668H82.332c5.418-9.75 15.168-16.25 27.086-16.25 8.664 0 16.25 3.25 22.75 8.664L140.832 78c-7.582-8.668-19.5-13-31.414-13C85.582 65 67.168 82.332 65 105.082v3.25c0 23.836 19.5 43.336 44.418 43.336 11.914 0 23.832-4.336 31.414-13L132.168 130c-5.418 5.418-14.086 8.668-22.75 8.668-11.918 0-21.668-6.5-27.086-15.168H104l13-11.918H78v-6.5h24.918zm0 0"/>\n</g>\n<g id="cashregister" fill-rule="evenodd">\n<path d="M239.67 124a6 6 0 0 0 .33-2V26a6 6 0 0 0-6-6H113.87a6 6 0 0 0-6 6v64H26a6 6 0 0 0-6 6v138a6 6 0 0 0 6 6h207.68a6 6 0 0 0 6-6V124ZM45 115h20v20H45v-20Zm32 0h20v20H77v-20Zm32 0h20v20h-20v-20Zm-64 32h20v20H45v-20Zm32 0h20v20H77v-20Zm32 0h20v20h-20v-20Zm-64 32h20v20H45v-20Zm32 0h51.92v20H76.91v-20Zm131.3-39a12.5 12.5 0 1 1 12.48-12.5 12.49 12.49 0 0 1-12.57 12.5ZM128.83 40h91.86v44.58h-91.86V40Zm59.81 31.84 18.91-19v-1H144v20Zm0 0"/>\n</g>\n<g id="changeeuro" fill-rule="evenodd">\n<path d="M86.668 195c-35.75 0-65-29.25-65-65s29.25-65 65-65a83.257 83.257 0 0 1 19.5-19.5c-6.5-1.082-13-2.168-19.5-2.168C39 43.332 0 82.332 0 130c0 47.668 39 86.668 86.668 86.668 6.5 0 13-1.086 19.5-2.168a83.257 83.257 0 0 1-19.5-19.5Zm0 0"/><path d="M173.332 43.332c-47.664 0-86.664 39-86.664 86.668 0 47.668 39 86.668 86.664 86.668C221 216.668 260 177.668 260 130c0-47.668-39-86.668-86.668-86.668Zm7.586 71.5-13 11.918H143v6.5h37.918l-13 11.918H146.25c5.418 9.75 16.25 15.164 27.082 15.164 8.668 0 16.25-3.25 22.75-8.664l8.668 8.664c-7.582 7.586-19.5 13-31.418 13-24.914 0-44.414-19.5-44.414-43.332v-3.25c3.25-22.75 21.664-40.082 45.5-40.082 11.914 0 23.832 4.332 31.414 13l-8.664 8.664c-5.418-5.414-14.086-8.664-22.75-8.664-11.918 0-21.668 6.5-27.086 15.164Zm0 0"/>\n</g>\n<g id="channels" fill-rule="evenodd">\n<path d="M139.8 170.1v79h-19.6v-79h19.6zM130 10.8c65.8 0 119.2 53.4 119.2 119.3 0 31.7-12.3 60.5-32.5 81.8l-2.5 2.5-14-14.1c18-18 29.1-42.8 29.1-70.3 0-54.9-44.5-99.4-99.3-99.4S30.7 75.1 30.7 130c0 26.3 10.2 50.1 26.8 67.9l2.3 2.4-14 14.1C24.2 192.8 10.9 163 10.9 130 10.8 64.2 64.2 10.8 130 10.8zm0 39.8c43.9 0 79.4 35.6 79.4 79.5 0 21-8.2 40.1-21.5 54.4l-2.1 2.2-14.4-14.4c10.9-10.7 17.6-25.6 17.6-42.1 0-32.7-26.4-59.1-59.1-59.1s-59.1 26.5-59.1 59.1c0 15.3 5.8 29.2 15.3 39.7L88 172l-14.4 14.4c-14.3-14.4-23.2-34.2-23.2-56.2.2-44 35.7-79.6 79.6-79.6zm-.4 50c16.5 0 29.8 13.4 29.8 29.8 0 16.5-13.3 29.8-29.8 29.8s-29.8-13.4-29.8-29.8c0-16.5 13.3-29.8 29.8-29.8z"/>\n</g>\n<g id="chargecard" fill-rule="evenodd">\n<path d="M239 40H19a10 10 0 0 0-10 9.93V80h120l-20 20H9v110.07A10 10 0 0 0 19 220h220a10 10 0 0 0 10-9.93V49.93A10 10 0 0 0 239 40Zm-50 80v50l-20 20v-70h-20l30-40 30 40Z"/>\n</g>\n<g id="chargemovil" fill-rule="evenodd">\n<path d="M120 230a10 10 0 1 1 10 10 10 10 0 0 1-10-10Zm-30-60 80-80v100H90ZM70 30h120v180H70ZM50 20a10 10 0 0 1 10-10h140a10 10 0 0 1 10 10v220a10 10 0 0 1-10 10H60a10 10 0 0 1-10-10Z"/><path d="m90 150 80-80V50l-80 80v20z"/>\n</g>\n<g id="checkmark" fill-rule="evenodd">\n<path d="m42 140.78 14.14-14.14 49.5 49.5L218.78 63l14.14 14.14-112.38 112.38-14.9 14.9L42 140.78z"/>\n</g>\n<g id="cinema" fill-rule="evenodd">\n<path d="M50.41 110.87h26.67l8.89 140H68.19l-17.78-140zm44.45 0h26.66v140h-17.77l-8.89-140zm44.44 0h26.67l-8.89 140H139.3v-140zm44.45 0h26.66l-17.78 140h-17.77l8.89-140zM200.6 73a27.9 27.9 0 0 0 .92-7.14c0-12.35-8-22.61-18.43-24.63a14.29 14.29 0 0 0-8.56-9.63c-1.8-11.77-10.91-20.74-21.89-20.74s-20.23 9.09-21.93 21a11.84 11.84 0 0 0-9.66.08c-1.54-6.37-6.7-11.07-12.85-11.07s-11.1 4.49-12.76 10.65a14.25 14.25 0 0 0-8.81 9.72 22 22 0 0 0-14 9.63c-7.36 0-13.33 6.72-13.33 15a16.44 16.44 0 0 0 1.48 6.84c-6.11 3.16-10.37 10.1-10.37 18.16h160c0-7.82-4-14.57-9.81-17.87Z"/>\n</g>\n<g id="climate-action" fill-rule="evenodd">\n<path d="m100.76 101.05-10.62 10.62v.01l10.62-10.63zm89.77 55.44-10.62-10.62 10.62 10.62zm-121.06 0 2.65-2.65-2.65 2.65z"/><path d="M220 152.25C220.18 64.62 130 10 130 10S39.82 64.62 40 152.25c.1 49.75 42.49 90.54 80 97.75v-40.49l-51.77-51.79 1.24-1.23 2.66-2.65 10.26-10.28L120 181.17v-32.85l-33.24-33.25 3.38-3.39 10.62-10.62.15-.15 19 19.09V64.23h20V120L159 100.9l14.15 14.17L140 148.32v32.85l37.6-37.61 2.3 2.31 10.62 10.62 1.24 1.23L140 209.51V250c37.49-7.26 79.9-48 80-97.75Z"/>\n</g>\n<g id="clock" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm40 130h-50V50l20 20v50h50Z"/>\n</g>\n<g id="close" fill-rule="evenodd">\n<path d="M61 216.06 45.44 200.5l70.71-70.71-69.3-69.29L61 46.35l69.29 69.3L201 44.94l15.56 15.56-70.71 70.71 70.71 70.71-14.14 14.14-70.71-70.71L61 216.06z"/>\n</g>\n<g id="cloud" fill-rule="evenodd">\n<path d="M251 155a65 65 0 0 0-65-65c-1.44 0-2.87.06-4.29.16A90 90 0 0 0 101 40h-4.73c-47.34 0-85.71 40.3-85.71 90s38.37 90 85.71 90h94.29c29.09 0 53.34-21.74 58.83-50.58A65.14 65.14 0 0 0 251 155Z"/>\n</g>\n<g id="coffeshop" fill-rule="evenodd">\n<path d="M10 220h220v24H10zM243.73 20H20v137c0 28.53 22.93 44 51.24 44h74.22c28.31 0 54.54-15.45 54.54-44v-47h43.73a6.44 6.44 0 0 0 6.27-6.46V28.31c0-3.47-2.82-8.31-6.27-8.31ZM50 97.86V50h20v70ZM230 90h-30V40h30Z"/>\n</g>\n<g id="collapse" fill-rule="evenodd">\n<path d="M170 140H60v-20h130l-20 20z"/>\n</g>\n<g id="color" fill-rule="evenodd">\n<path d="M207.25 227.2c0-16.49 18.34-29.35 21.38-45.6 3.07 16.27 21.38 29.21 21.38 45.6 0 12.59-9.57 22.8-21.38 22.8s-21.38-10.21-21.38-22.8ZM228 141.44l-4.42-5.36-74.09-89.9-34-41.28-18.66 15.37 27.94 33.89-101.29 83.5c-4.26 3.51-4.6 9-1.09 13.3l78.53 95.27c3.51 4.26 9.11 5.1 13.37 1.6l111.55-92c4.26-3.48 5.69-10.13 2.16-14.39Zm-180 4.41 91.51-75.44 61.65 75.38Z"/>\n</g>\n<g id="commercialoffer" fill-rule="evenodd">\n<path d="M184.34 130.18a65 65 0 1 0 65 65 65 65 0 0 0-65-65Zm22.95 97.2-22.51-13.71-22.51 13.71 6-25.83-19.89-17.38 26.19-2.24 10.23-24.36 10.2 24.35 26.19 2.24-19.89 17.38Z"/><path d="M184.81 109.65a84.47 84.47 0 0 1 35.19 7.66V16a6 6 0 0 0-6-6H46a6 6 0 0 0-6 6v228a6 6 0 0 0 6 6h74.42a84.93 84.93 0 0 1 64.39-140.39ZM70 40h118l-20 20H70Zm0 40h70l-20 20H70Z"/>\n</g>\n<g id="communication" fill-rule="evenodd">\n<path d="M210 174.6V29c0-5-4.89-9-9.92-9H9a9 9 0 0 0-9 9v191l37.36-38h162.72c5.03 0 9.92-2.41 9.92-7.4ZM120 120H40v-20h100Zm40-40H40V60h140Z"/><path d="M253.77 110H230v65.69A24.53 24.53 0 0 1 205.14 200H100v21.81c0 3.54 3.08 8.19 6.66 8.19h123.73L260 260V116.53a6.35 6.35 0 0 0-6.23-6.53Z"/>\n</g>\n<g id="communicationpublic" fill-rule="evenodd">\n<path d="M87.74 44.05c-3.06-3.08-5.39-2.68-6 1.52L72 119.39l51.62 52.42 71.38-9.57c4.25-.61 5.92-4.2 2.81-7.34ZM168.37 104h23.48a47.11 47.11 0 0 0-47-47.29v23.68A23.56 23.56 0 0 1 168.37 104Z"/><path d="M144.91 9.44v23.65c38.91 0 70.44 31.75 70.43 70.94h23.48c.01-52.26-42.04-94.6-93.91-94.59ZM97.73 197l12.93-13-52.19-52.63-45.8 46.13c-3.07 3.09-2.06 9.05.75 11.88l40.84 41.13c2.75 2.77 7.55 2.62 10.6-.45L78 216.81l29 29.25a11.47 11.47 0 0 0 16.25 0l3.47-3.49a11.67 11.67 0 0 0 0-16.37Z"/>\n</g>\n<g id="confectionery" fill-rule="evenodd">\n<path d="M230.41 103.09s-13.18-13.22-47.18-23.56c-2.1-.64-4.22-1.21-6.33-1.75a25 25 0 1 1-49.48-6.72l-7-.69-88.22 66.27a6.25 6.25 0 0 0-1.83 4.42v103.06a6.25 6.25 0 0 0 7.65 6.1l187.54-43a6.25 6.25 0 0 0 4.86-6.1v-98.03Zm-20.67 91L47.6 231.24v-20.69l171.63-39.27Zm0-41.36L47.6 189.87v-20.68l171.63-39.27Z"/><path d="M152 90.6a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/><path d="m155.62 60.18-.06.19s14.25-2.43 24.35-6.87 15.77-22.64 15.77-22.64-22.24 4.45-29.52 11.73l-.35.37c.75-1.56 1.44-3.12 2-4.66C171.86 28 163 11.13 163 11.13S150.41 30 150.41 40.29s5.08 20.08 5.08 20.08Z"/>\n</g>\n<g id="configuration" fill-rule="evenodd">\n<path d="M130.23 180.23a25 25 0 1 0 25 25 25 25 0 0 0-25-25Zm0-75a25 25 0 1 0 25 25 25 25 0 0 0-25-25Zm0-25a25 25 0 1 0-25-25 25 25 0 0 0 25 25Z"/>\n</g>\n<g id="consult" fill-rule="evenodd">\n<path d="M218.43 203.88a65.48 65.48 0 1 0-14.55 14.55L245.45 260 260 245.45Zm-23.88-38.43a29.09 29.09 0 0 0-29.09-29.09v-14.54a43.64 43.64 0 0 1 43.64 43.64Z"/><path d="M100.27 220H56a6 6 0 0 1-6-6V36a6 6 0 0 1 6-6h138a6 6 0 0 1 6 6v51.57a85.2 85.2 0 0 1 20 12.7V16a6 6 0 0 0-6-6H36a6 6 0 0 0-6 6v218a6 6 0 0 0 6 6h89.05a85.55 85.55 0 0 1-24.78-20Z"/>\n</g>\n<g id="continue" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm14.14 145.86L130 170l-56.57-56.57 14.14-14.14L130 141.72l42.43-42.43 14.14 14.14Z"/>\n</g>\n<g id="copy" fill-rule="evenodd">\n<path d="M200 189.83V29.7a9.94 9.94 0 0 0-9.93-9.93H29.93A9.94 9.94 0 0 0 20 29.7v160.13a9.94 9.94 0 0 0 9.93 9.93h160.14a9.94 9.94 0 0 0 9.93-9.93Zm20-110.06v140H80l-20 20h170.07a9.93 9.93 0 0 0 9.93-9.93V59.77Z"/>\n</g>\n<g id="copycard" fill-rule="evenodd">\n<path d="M220 180V40a10 10 0 0 0-10-10H10A10 10 0 0 0 0 40v20h180l-20 20H0v100a10 10 0 0 0 10 10h200a10 10 0 0 0 10-10Zm-60-20h-40v-20h60Zm80-90v140H40l-20 20h240V50Z"/>\n</g>\n<g id="correct" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm-9.53 157.81L105.25 183l-42.43-42.39L77 126.46l28.28 28.28L183 77l14.14 14.14Z"/>\n</g>\n<g id="correctlocation" fill-rule="evenodd">\n<path d="M130 10C74.8 10 30 54.8 30 110v3c2 88.3 91.6 144.7 91.6 144.7 4.6 3.1 12 3.1 16.5.1 0 0 89.8-56.5 91.8-144.8v-3c0-55.2-44.7-100-99.9-100zm-19.2 150-46-46L79 99.9l31.8 31.8 65-65.1L190 80.8 110.8 160z"/>\n</g>\n<g id="couple" fill-rule="evenodd">\n<path d="m164.23 59.97-30 120h19.83v70h20v-70h20v70h20v-70h20.17l-30-120h-40zm86.2 79.33-21-79.33h-15.4l20.15 73.81 16.25 5.52zm-110-5.52-3.13-11.02 17.13-62.79h-15.4l-9.2 36.53-10.4-36.53h-15.4l18.2 66.68-1.8 7.13h20zm-105-73.81v190h20v-100h20v100h20v-190h-60z"/><circle cx="65.43" cy="29.85" r="20"/><path d="m10.43 149.97 15-15v-75h-15v90zM170.38 44.25a19.95 19.95 0 0 0 27.71 0H204c0-3.58.42-8.46.18-13.41 0-.33.05-.66.05-1a19.93 19.93 0 0 0-1.09-6.47c-1.87-7.31-6.7-13.32-18.55-13.52H184c-24.1 0-20 23.36-20 34.4Z"/>\n</g>\n<g id="creditcard" fill-rule="evenodd">\n<path d="M139 160h70l-20 20h-50ZM9 80h200l-20 20H9Zm0-30.07A10 10 0 0 1 19 40h220a10 10 0 0 1 10 9.93v160.14a10 10 0 0 1-10 9.93H19a10 10 0 0 1-10-9.93Z"/>\n</g>\n<g id="currencyexchange" fill-rule="evenodd">\n<path d="M76.86 188.54a60 60 0 0 1 0-117.08A110.58 110.58 0 0 1 105 41.25a90 90 0 1 0 0 177.49 110.58 110.58 0 0 1-28.14-30.2Z"/><path d="M170 40a90 90 0 1 0 90 90 90 90 0 0 0-90-90Zm9 133.13V190h-.55L163 182.56v-8.36a60.42 60.42 0 0 1-21.48-5.46l-.92-.43-.6-.31.1-.6.15-.9 1.87-11.5.33-2 .22-1.34 1.25.74 1.88 1.12a45.86 45.86 0 0 0 22.91 6.75c8.77 0 14.08-4 14.08-10.5s-2.84-9-16.26-14.42c-19.42-7.93-25.34-13.94-25.34-26.17 0-12 8.82-20.68 21.82-23.27V70h.87L179 77.44v8.15a40.21 40.21 0 0 1 14.66 4.49l1 .44.57.3-.1.58-.15.88-2 11.32-.38 2.13-.25 1.42-1.27-.87-1.87-1.28a32.47 32.47 0 0 0-18-5.7c-8.33 0-12.87 3.37-12.87 9.05 0 5.32 2.94 7.79 16.14 13.22 19.48 8 25.3 14.34 25.3 27.37.03 12.06-7.78 20.99-20.78 24.19Z"/>\n</g>\n<g id="delete" fill-rule="evenodd">\n<path d="M94.7 50c-3 0-6 1.2-8.2 3.2l-73 68.3c-4.7 4.7-4.7 12.3 0 17l73 68.3c2.2 2.1 5.2 3.2 8.2 3.2H238c6.6 0 12-5.4 12-12V62c0-6.6-5.4-12-12-12H94.7zm101.5 128.6-35.4-35.3-36.7 36.7-14.1-14.1 36.7-36.7-35.3-35.4 14.2-14.2 35.3 35.3 35.4-35.4 14.1 14.1L175 129l35.4 35.4-14.2 14.2z"/>\n</g>\n<g id="deposit" fill-rule="evenodd">\n<path d="M200 60H60v20h30l-20 20H60v60h30l-20 20H60v20h140Zm-40 90a20 20 0 1 1 20-20 20 20 0 0 1-20 20Zm70-130H30a10 10 0 0 0-10 10v200a10 10 0 0 0 10 10h200a10 10 0 0 0 10-10V30a10 10 0 0 0-10-10Zm-10 200H40V40h180Z"/>\n</g>\n<g id="desktop" fill-rule="evenodd">\n<path d="M240.23 20h-220a10 10 0 0 0-10 10v160a10 10 0 0 0 10 10h220a10 10 0 0 0 10-10V30a10 10 0 0 0-10-10Zm-10 160h-200V40h200Z"/><path d="M200.23 60h-150v100h50l100-100zM.23 220h260v20H.23z"/>\n</g>\n<g id="digitalcard" fill-rule="evenodd">\n<path d="M170 190v20H50V30h120v20h20V20a9.73 9.73 0 0 0-9.68-10h-140A10.27 10.27 0 0 0 30 20v220a10.29 10.29 0 0 0 10.34 10h140a9.71 9.71 0 0 0 9.66-10v-50Zm-59.67 50a10 10 0 1 1 10-10 10 10 0 0 1-10 10Z"/><path d="M234 70H106a6 6 0 0 0-6 6v14h120l-20 20H100v54a6 6 0 0 0 6 6h128a6 6 0 0 0 6-6V76a6 6 0 0 0-6-6Z"/>\n</g>\n<g id="digitalsignature" fill-rule="evenodd">\n<path d="M195 43.332h-21.668V32.5H65v173.332h108.332V195H195v43.332c0 6.5-4.332 10.836-10.832 10.836h-130c-6.5 0-10.836-4.336-10.836-10.836V21.668c0-6.5 4.336-10.836 10.836-10.836h130c6.5 0 10.832 4.336 10.832 10.836Zm-75.832 195c6.5 0 10.832-4.332 10.832-10.832 0-6.5-4.332-10.832-10.832-10.832-6.5 0-10.836 4.332-10.836 10.832 0 6.5 4.336 10.832 10.836 10.832Zm54.164-151.664L184.168 97.5h21.664l-21.664-21.668L198.25 61.75c4.332-4.332 10.832-4.332 15.168 0l17.332 17.332c4.332 4.336 4.332 10.836 0 15.168l-88.832 89.918h-33.586v-32.5Zm10.836 75.832H227.5v21.668h-65Zm0 0"/>\n</g>\n<g id="directory" fill-rule="evenodd">\n<path d="M220 110h-20v60h20Zm-20 80v60h20v-60Z"/><path d="M180 229.94V89.82a12 12 0 0 0 2 .18h38V22a12 12 0 0 0-12-12h-26a12 12 0 0 0-2 .18V10H67.24c-2.9 1-8 1.58-10.67 3C47.24 17.72 41.74 25.55 41 36v186.7c0 13 9 23.58 21.57 26.56 2.36.56-4.16.72-1.72.73h119.14ZM110 70a20 20 0 1 1-20 20 20 20 0 0 1 20-20Zm40 90H70v-4.23A36.66 36.66 0 0 1 97.45 120a27.43 27.43 0 0 0 25.1 0A36.68 36.68 0 0 1 150 155.77Z"/>\n</g>\n<g id="dischargecard" fill-rule="evenodd">\n<path d="M240 40H20a10 10 0 0 0-10 9.93V80h120l-20 20H10v110.07A10 10 0 0 0 20 220h220a10 10 0 0 0 10-9.93V49.93A10 10 0 0 0 240 40Zm-60 150-30-40h20v-50l20-20v70h20Z"/>\n</g>\n<g id="discount" fill-rule="evenodd">\n<path d="M250 97.13V46.51c0-3.74-1.43-7.51-5-7.51H18c-3.62 0-8 3.78-8 7.51v50.62c17 0 31.64 14.61 31.64 32.62S27 162.38 10 162.38V213c0 3.74 4.43 6 8 6h227c3.62 0 5-2.27 5-6v-50.62c-17 0-31.64-14.61-31.64-32.63S233 97.13 250 97.13ZM91.5 78.88A20.11 20.11 0 1 1 71.5 99a20.06 20.06 0 0 1 20-20.12Zm80 100.56a20.11 20.11 0 1 1 20-20.11 20.06 20.06 0 0 1-20 20.11Zm-70-.44h-30l90-101h30Z"/>\n</g>\n<g id="document" fill-rule="evenodd">\n<path d="M160.23 10H46.6a6.54 6.54 0 0 0-6.6 6.28v227.45a6.53 6.53 0 0 0 6.61 6.27h167.24a6.12 6.12 0 0 0 6.15-6.26V70Zm24.33 83H140V10h20v63h44.56Z"/>\n</g>\n<g id="dollar" fill-rule="evenodd">\n<path d="M129 10a120 120 0 1 0 120 120A120 120 0 0 0 129 10Zm10 178.87V210l-20-10v-10.44a81.24 81.24 0 0 1-27.5-7.72l3.34-20.57c9.69 5.78 21.71 10.37 33.24 10.37 10.19 0 17.2-4.93 17.2-14.28 0-8.67-4-12.24-20.71-19.55-22.38-9.35-31.4-16.83-31.4-35 0-16.86 10.37-28 25.83-31.56V50l20 10v10.44a58.31 58.31 0 0 1 21.82 6.69l-3.34 20.4c-8.35-5.61-18.21-9.18-27.23-9.18-11 0-15.87 5.44-15.87 12.58 0 7.48 3.67 11 19.71 17.85 23.72 9.86 32.41 18.19 32.41 36.37 0 18.85-11.18 30.26-27.5 33.72Z"/>\n</g>\n<g id="donation" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm47 60a20 20 0 1 1-20 20 20 20 0 0 1 20-20Zm-94 0a20 20 0 1 1-20 20 20 20 0 0 1 20-20Zm113.44 87.6a69 69 0 0 1-132.53 0 6 6 0 0 1 5.79-7.6h120.95a6 6 0 0 1 5.79 7.6Z"/>\n</g>\n<g id="down" fill-rule="evenodd">\n<path d="m145.6 194.6 56.5-56.6 21.2 21.1-92.4 92.1-91.6-91.4 21.1-21.1 55.5 55.5v-183L145.6 40z"/>\n</g>\n<g id="down-arrow" fill-rule="evenodd">\n<path d="M180 100H80l50 60z"/>\n</g>\n<g id="download" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm-.31 200L68 148.34l14.26-14.28 37.37 37.5L119.3 50 139 70v101.83l38.4-38.2 14.43 14.26Z"/>\n</g>\n<g id="edit" fill-rule="evenodd">\n<path d="m236.08 58.81-35.72-35.88a9.9 9.9 0 0 0-14.08 0L154.39 55l34.85 35h-29.87l-19.91-20L20 190v50h49.77L236.05 73a10 10 0 0 0 .03-14.19ZM120 220l-20 20h140v-20Z"/>\n</g>\n<g id="education" fill-rule="evenodd">\n<path d="M55.45 143.49V189L135 232.55 214.55 189v-45.51L135 187ZM135 27.55 10 95.89l125 68.33 102.27-55.92V187H260V95.89Z"/>\n</g>\n<g id="email" fill-rule="evenodd">\n<path d="M244.46 40H15.54A5.52 5.52 0 0 0 10 45.51v169a5.53 5.53 0 0 0 5.54 5.49h228.92a5.52 5.52 0 0 0 5.54-5.51v-169a5.53 5.53 0 0 0-5.54-5.49ZM129.93 150 30 89.9V66l100 60.3L230 66v23.9L130 150"/>\n</g>\n<g id="endcall" fill-rule="evenodd">\n<path d="M250 145.2c-29.4-33.1-72.3-54-120-54-47.8 0-90.6 20.9-120 54l.2.1v27.6c0 2.9 2.3 5 5.2 4.8l57.3-5c2.9-.3 5.2-2.8 5.2-5.7v-29.7c15.6-7.3 33.9-11.4 52.1-11.4 18.7 0 36.5 4.1 52.1 11.4V167c0 2.9 2.4 5.4 5.3 5.7l57.3 5c2.9.3 5.2-1.9 5.2-4.8v-23.4c0-.5.1-.9 0-1.4v-2.8h.1v-.1z"/>\n</g>\n<g id="entertainment" fill-rule="evenodd">\n<path d="M250 97.5V46.8c.1-3.7-2.8-6.8-6.5-6.8H90v40H70V40H16.5c-3.7.1-6.6 3.2-6.5 6.8v50.6c17 0 31.6 14.6 31.6 32.6S27 162.7 10 162.7v50.6c-.1 3.6 2.8 6.6 6.5 6.7H70v-40h20v40h153.5c3.6 0 6.6-3 6.5-6.6v-50.7c-17.5 0-31.6-14.6-31.6-32.6s14.1-32.6 31.6-32.6zM90 150H70v-42h20v42z"/>\n</g>\n<g id="entretainment" fill-rule="evenodd">\n<path d="M250 92.47V41.85a6.72 6.72 0 0 0-6.54-6.85H90v40H70V35H16.54A6.73 6.73 0 0 0 10 41.85v50.62c17 0 31.64 14.61 31.64 32.62S27 157.72 10 157.72v50.62a6.56 6.56 0 0 0 6.54 6.66H70v-40h20v40h153.46a6.57 6.57 0 0 0 6.54-6.66v-50.62c-17.47 0-31.64-14.61-31.64-32.63S232.53 92.47 250 92.47ZM90 145H70v-42h20Z"/>\n</g>\n<g id="error" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm64.35 170.2-14.15 14.15-49.5-49.5-49.5 49.5-15.55-15.56 49.5-49.5-48.08-48.08 14.14-14.14 48.08 48.08 49.5-49.5 15.56 15.56-49.5 49.5Z"/>\n</g>\n<g id="euro" fill-rule="evenodd">\n<path d="M129 10a120 120 0 1 0 120 120A120 120 0 0 0 129 10Zm10 95-20 20H79.25c-.16 1.64-.25 3.31-.25 5s.09 3.36.25 5H139l-20 20H85.71a50 50 0 0 0 78.65 10.36l14.14 14.14A70 70 0 0 1 59 130c0-1.68.08-3.35.2-5H59l.21-.21A70 70 0 0 1 178.5 80.5l-14.14 14.14A50 50 0 0 0 85.71 105Z"/>\n</g>\n<g id="excel" fill-rule="evenodd">\n<path d="M160.63 10H47c-3.51 0-7 2.82-7 6.28v227.45c0 3.47 3.49 6.27 7 6.27h167.25c3.54 0 5.75-2.8 5.75-6.26V70Zm-68 149-9.43-16.27L74.33 159H59.14l16.49-27.87L60.29 106H76.7l8 14 7.3-14h14.8L92 131.28 108.68 159Zm60.37 0h-37v-53h14v41h23Zm26.74 1c-12.17 0-19.44-5.47-24-12.75l10.66-6.62a16.49 16.49 0 0 0 14 8.06c4.39 0 7.71-1.3 7.71-4.61s-4.25-4.68-9.5-6c-8.71-2.23-20.31-4.46-20.31-16.56 0-10.87 8.21-16.85 20.31-16.85 11.31 0 18.07 5.26 22.32 10.44l-9.65 7.92c-3-3.6-8.14-6.7-12.74-6.7-4.11 0-6.19 1.37-6.19 3.89 0 3.53 4.18 4.82 9.43 6.12 8.71 2.09 20.38 4.75 20.38 16.71-.03 8.53-6.01 16.95-22.42 16.95Z"/>\n</g>\n<g id="executive" fill-rule="evenodd">\n<circle cx="130" cy="70.04" r="50.04"/><path d="M161.36 132.66a72.29 72.29 0 0 1-21.36 6.72v.72l10 70.06-20 20-20-20 10-70.06v-.72a64.78 64.78 0 0 1-21.36-6.72A90 90 0 0 0 30 220.17V240h200v-19.83a90.08 90.08 0 0 0-68.64-87.51Z"/>\n</g>\n<g id="expand" fill-rule="evenodd">\n<path d="M200 120h-60V70h-20v50H70v20h50v50h20v-50h40l20-20z"/>\n</g>\n<g id="exploration" fill-rule="evenodd">\n<path d="M130 10C63.7 10 10 63.7 10 130s53.7 120 120 120 120-53.7 120-120S196.3 10 130 10zm21.2 140.5L59.3 200l49.8-92.2 91.6-49.2-49.5 91.9z"/><circle transform="rotate(-45.001 129.997 130.002)" cx="130" cy="130" r="15"/>\n</g>\n<g id="expressaccount" fill-rule="evenodd">\n<path d="m234.53 100-17.59 99.71H22.58L-1 220h235.31L259 80l-24.47 20z"/><path d="M23.69 40-1 180h202.37l24.68-140ZM48.4 70h60L84.87 90h-40Zm107.72 70H36.05l3.53-20h140Z"/>\n</g>\n<g id="facebook" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm33 73h-13.94C138.75 83 137 88.19 137 95.34V111h24.4l-3.28 25H137v64h-25v-64H90v-25h22V92.9c0-21.3 13-32.9 31.91-32.9A174.26 174.26 0 0 1 163 61Z"/>\n</g>\n<g id="facebook2" fill-rule="evenodd">\n<path d="M169.33 56.44c-16.18 0-19.21 7.8-19.21 19v24.94h38.57l-5.14 39.07h-33.43v100.23h-40.27V139.46H76.29v-39.07h33.56V71.62C109.85 38.21 130.25 20 160 20a255.71 255.71 0 0 1 30 1.59v34.85Z"/>\n</g>\n<g id="fastfood" fill-rule="evenodd">\n<path d="M20.41 224.12a16.25 16.25 0 0 0 16.25 16.25h104.17a16.25 16.25 0 0 0 16.25-16.25v-3.75H20.41Zm136.67-47.5a16.25 16.25 0 0 0-16.25-16.25H36.66a16.25 16.25 0 0 0-16.25 16.25v3.75h136.67Z"/><rect x="10.41" y="190.37" width="160" height="20" rx="8.13" ry="8.13"/><path d="M100.41 50.37v20h140v-20h-140zm80-40h20v30h-20zm-57.14 90h57.14l-10 20h-44.28l3.33 28h14.7a27.28 27.28 0 0 1 27.25 27.25v5.07a19.14 19.14 0 0 1 10 16.8v3.75a19.14 19.14 0 0 1-10 16.8v5.07a27.12 27.12 0 0 1-6.17 17.25h35.17l20-160h-100Z"/>\n</g>\n<g id="favorite" fill-rule="evenodd">\n<path d="M129.39 75C125.24 43.91 100.23 20 70 20c-33.14 0-60 28.73-60 64.17a69.13 69.13 0 0 0 .61 9.17H10C10 166.67 130 240 130 240s120-73.33 120-146.67h-.61a69.15 69.15 0 0 0 .61-9.17C250 48.73 223.14 20 190 20c-30.23 0-55.24 23.91-59.39 55h-1.21Z"/>\n</g>\n<g id="favoritestar" fill-rule="evenodd">\n<path d="M164 83.38 129 9.95 95 83.52a11.05 11.05 0 0 1-8.33 6.3L10 101.79 66.37 159a11.05 11.05 0 0 1 3 9.45l-12.6 81.19 68.28-38.14a11.05 11.05 0 0 1 10.7 0l68.89 37.75-13.85-81.11a11.05 11.05 0 0 1 2.94-9.53l55.45-57.51-76.87-11.55a11.05 11.05 0 0 1-8.31-6.17Z"/>\n</g>\n<g id="feedback" fill-rule="evenodd">\n<path d="M240 20H20c-5.5 0-10 4.5-10 10v210l40-40h190c5.5 0 10-4.5 10-10V30c0-5.5-4.5-10-10-10zM90 120 50 90l40-30v20h60l-20 20H90v20zm80 40v-20h-60l20-20h40v-20l40 30-40 30z"/>\n</g>\n<g id="filter" fill-rule="evenodd">\n<path d="m79.17 147.97-24.25 24.26V64.9H35.48v107.33l-24.26-24.26L-.1 159.29l33.97 33.98L45.2 204.6l45.3-45.31-11.33-11.32zM99.67 175.1v25h99.72l9.62-25H99.67zm0-55.1v25h124.29l9.58-25H99.67zm0-55.1v25h149.85l9.48-25H99.67z"/>\n</g>\n<g id="fingerprint" fill-rule="evenodd">\n<path d="M120 100a10 10 0 0 1 20 0v60a10 10 0 0 1-20 0Zm-20 0a30 30 0 0 1 60 0v60a30 30 0 0 1-60 0Zm-20 0a50 50 0 0 1 100 0v60a50 50 0 0 1-100 0Zm140 50v10a90 90 0 0 1-178.16 18.16L60 160a70 70 0 0 0 140 0v-30Zm0-30v-19.95a90 90 0 1 0-180 0V150l20-20v-30a70 70 0 0 1 140 0Z"/>\n</g>\n<g id="firstpage" fill-rule="evenodd">\n<path d="m180.403 171.712-14.142 14.142-56.569-56.568 14.142-14.142z"/><path d="m180.405 86.867-56.568 56.568-14.142-14.142 56.568-56.568zM89.77 189.64h-20v-120h20z"/>\n</g>\n<g id="florist" fill-rule="evenodd">\n<path d="M118.61 211.55v-69.2a53.42 53.42 0 0 1-39.55-51.58V11h1.81l33.78 33.8V11h1.81l33.78 33.8V11h1.81l33.8 34.12v45.65A53.42 53.42 0 0 1 145 142.69V209l75.23-75.36s5.66 58.59-12.76 86.39c-15.79 23.83-52.35 29.67-62.47 30.85v.12h-1c-1.06.11-1.65.15-1.65.15V251h-23.67v.15S72 247.8 53.58 220s-12.76-86.39-12.76-86.39l77.79 77.93Zm0 0"/>\n</g>\n<g id="fold" fill-rule="evenodd">\n<path d="m87.575 160.706-14.143-14.142 56.569-56.568 14.142 14.142z"/><path d="m172.435 160.71-56.568-56.568L130.009 90l56.568 56.568z"/>\n</g>\n<g id="folder" fill-rule="evenodd">\n<path d="M60.92 110.02 40.916 90.015H230.95V62.01c0-6.601-5.401-12.002-12.003-12.002H80.923L60.92 30.005H22.913c-6.601 0-12.002 5.401-12.002 12.002v156.028c0 6.6 5.4 12.002 12.002 12.002h198.035c5.8 0 10.802-4.101 11.802-9.802l18.003-76.213c1.2-7.302-4.4-14.003-11.802-14.003H60.92Z"/>\n</g>\n<g id="football" fill-rule="evenodd">\n<path d="M249.64 119.26A120 120 0 0 0 63.32 30.62l-.15-.21-8.08 5.9.17.23a120.61 120.61 0 0 0-28.43 32.69 119.23 119.23 0 0 0-16.16 49.86c-.34 3.69-.52 7.42-.52 11.19a120 120 0 0 0 4.45 32.48l-.32.1 3.11 9.5.32-.1a119.89 119.89 0 0 0 107.44 77.9v.12h10v-.1a120 120 0 0 0 115-119.88c-.01-3.74-.15-7.41-.51-11.04Zm-223.53 1.57a12 12 0 0 1-3.77-11.12 108.89 108.89 0 0 1 8.38-25.91 12 12 0 0 1 9.62-6.85l41.25-4.35 15.8 21.65a6 6 0 0 1 .86 5.39l-12 37.08a6 6 0 0 1-3.84 3.85l-25.17 8.24Zm62.58 105.29a12 12 0 0 1-11.79.12 110 110 0 0 1-22-16.06A12 12 0 0 1 51.47 199l8.63-40.6 28.36-9.28a6 6 0 0 1 5.39.85l28.65 20.81a6 6 0 0 1 2.5 4.82l.07 29.53Zm20.26-137.17a6 6 0 0 1-4.85-2.46L89.79 66.88l17.11-38.44a12 12 0 0 1 9.41-7 110.59 110.59 0 0 1 27-.08 12 12 0 0 1 9.46 7l17 38.16-14.38 19.94a6 6 0 0 1-4.86 2.48Zm95.91 121.7a110.06 110.06 0 0 1-21.77 15.77 12 12 0 0 1-11.76-.14L135 205.32v-29.51a6 6 0 0 1 2.47-4.87l29-21a6 6 0 0 1 5.37-.86l27.79 9 8.8 41.39a12 12 0 0 1-3.58 11.18Zm29.24-90.23-31.25 28.14-25-8.06a6 6 0 0 1-3.86-3.86L161.74 99a6 6 0 0 1 .84-5.37l15.2-21L220 77a12 12 0 0 1 9.59 6.78 108.91 108.91 0 0 1 8.3 25.48 12 12 0 0 1-3.79 11.16Z"/>\n</g>\n<g id="forward" fill-rule="evenodd">\n<path d="m99.261 87.614 14.142-14.143 56.57 56.568-14.143 14.142z"/><path d="m99.242 172.444 56.567-56.57 14.143 14.142-56.568 56.57z"/>\n</g>\n<g id="francesgo" fill-rule="evenodd">\n<path d="M33.6 104.6c0 72 96.6 155.4 96.6 155.4s56.6-49.1 83.3-104.4l.6-1.2c.8-1.6 1.4-3.1 2.1-4.7l.6-1.3c.7-1.6 1.3-3.3 2-4.9l.4-1 1.2-3.4a111.36 111.36 0 0 0 6-25.5h-96.7c-4.9 7.4-14.8 22.7-15.1 23.4s10.1 16 15.1 23.4h28.9c-4.5 6.6-9.3 13.4-14.9 20.2-4.5 5.7-9.1 11-13.4 15.9-4.2-4.5-8.4-9.6-12.8-14.9C93.1 151.4 79 123.3 79 104.5a51.38 51.38 0 0 1 100.9-12.4h46.2A96 96 0 0 0 130.3 10a95.69 95.69 0 0 0-96.7 94.6"/><path d="M33.87 98.93c0 72 96.6 155.4 96.6 155.4s56.6-49.1 83.3-104.4l.6-1.2c.8-1.6 1.4-3.1 2.1-4.7l.6-1.3c.7-1.6 1.3-3.3 2-4.9l.4-1 1.2-3.4a111.36 111.36 0 0 0 6-25.5H130c-4.9 7.4-14.8 22.7-15.1 23.4s10.1 16 15.1 23.4h28.9c-4.5 6.6-9.3 13.4-14.9 20.2-4.5 5.7-9.1 11-13.4 15.9-4.2-4.5-8.4-9.6-12.8-14.9-24.4-30.2-38.5-58.3-38.5-77.1a51.38 51.38 0 0 1 100.9-12.4h46.2a96 96 0 0 0-95.8-82.1 95.69 95.69 0 0 0-96.7 94.6"/>\n</g>\n<g id="fraud" fill-rule="evenodd">\n<path d="M240 30c0-5.5-4.5-10-10-10H30c-5.5 0-10 4.4-10 9.9V100c0 140 110 150 110 150s110-10 110-150V30zm-74 134.1-35.4-35.3-36.7 36.7-14.1-14.1 36.7-36.7-35.3-35.5L95.3 65l35.3 35.3L166 65l14.1 14.1-35.3 35.4 35.4 35.4-14.2 14.2z"/>\n</g>\n<g id="free-dollar" fill-rule="evenodd">\n<path d="M194.7 144.1c.3-4.6.5-9.3.5-14.1 0-66.2-32.1-110-87.9-110C51.7 20 19 63.8 19 130s32.7 110 88.2 110c40.6 0 68.6-23.1 80.9-61.1-1.7-3.7-2.7-8-2.7-13.2.1-8.5 3.4-16 9.3-21.6zm-87.5 59.5c-26.6 0-41.8-25.2-41.8-73.6s14.3-72.8 41.8-72.8c26.6 0 41.8 24.3 41.8 72.8.1 48.4-14.6 73.6-41.8 73.6zm118.7-26.5c-12.1-5-14.7-7.2-14.7-12.1 0-5.2 4.2-8.3 11.8-8.3 5.7 0 11.6 1.9 16.4 5.2l1.7 1.2 1.2.8.2-1.3.3-1.9 1.8-10.3.1-.8.1-.5-.5-.3-1-.4c-4-2.1-7.9-3.4-13.4-4.1v-7.4l-13.8-6.8h-.8v14.5c-11.9 2.4-19.9 10.3-19.9 21.3 0 11.2 5.4 16.7 23.1 23.9 12.3 5 14.9 7.3 14.9 13.2 0 6-4.8 9.6-12.9 9.6-6.9 0-14.3-2.2-20.9-6.2l-1.7-1-1.1-.7-.2 1.2-.3 1.8-1.7 10.6-.1.8-.1.5.5.3.8.4c5.7 2.7 12.3 4.4 19.6 5v7.6l14.1 6.8h.5v-15.4c11.9-2.9 19-11.1 19-22.1.1-12-5.2-17.8-23-25.1z"/>\n</g>\n<g id="free-euro" fill-rule="evenodd">\n<path d="M217.3 216.6c-11.9 0-22.3-6.5-27.8-16.1h21.4l12.9-12.9h-38.4c-.1-1.1-.2-2.1-.2-3.2s.1-2.2.2-3.2H211l12.9-12.9h-34.3c5.6-9.6 15.9-16.1 27.8-16.1 8.9 0 16.9 3.6 22.7 9.4l9.1-9.1c-8.1-8.1-19.4-13.2-31.8-13.2-23.7 0-43.1 18.4-44.9 41.6v.1c-.1 1.1-.1 2.1-.1 3.2 0 24.9 20.1 45 45 45 12.4 0 23.7-5 31.8-13.2l-9.1-9.1c-5.8 6.1-13.9 9.7-22.8 9.7z"/><path d="M195 134.2V130c0-66.2-32.1-110-87.9-110-55.6 0-88.2 43.8-88.2 110s32.7 110 88.2 110c26.6 0 47.7-9.9 62.7-27.4-4.9-8.2-7.7-17.8-7.7-28-.1-22.5 13.5-41.9 32.9-50.4zm-87.9 69.4c-26.6 0-41.8-25.2-41.8-73.6s14.3-72.8 41.8-72.8c26.6 0 41.8 24.3 41.8 72.8 0 48.4-14.6 73.6-41.8 73.6z"/>\n</g>\n<g id="frequency" fill-rule="evenodd">\n<path d="M195 131.25A63.75 63.75 0 1 0 258.75 195 63.75 63.75 0 0 0 195 131.25Zm21.25 69.06h-26.56V152.5l10.63 10.63v26.56h26.56Z"/><path d="M79.19 204.28a90 90 0 1 1 139.26-91A84.88 84.88 0 0 1 250 130.26V130a120 120 0 1 0-190.42 97.16L40 250h80l-20-70Z"/>\n</g>\n<g id="frozen" fill-rule="evenodd">\n<path d="m60.03 226.41 25.99 15M245 175.02l-5.52-29.37-43.73 8.12-36.9-22.36 37.49-22.76 43.13 7.99 5.5-29.38-34.52-6.39 6.58-35.21-29.53-5.46-8.19 43.78-34.27 20.8-.01-42.46 31.36-31.19L155.14 10l-25.46 25.32-24.82-24.69-21.25 21.13 31.37 31.2.02 41.87-34.34-20.81-8.23-43.78-29.53 5.49 6.61 35.2L15 87.34l5.52 29.38 43.12-8.02 37.51 22.73-36.88 22.39-43.74-8.09-5.5 29.38 34.52 6.38-6.58 35.21 29.53 5.46 8.09-43.24 34.43-20.9.02 39.59-31.43 31.26L104.86 250l25.46-25.32 24.82 24.69 21.25-21.13-31.31-31.13-.01-39.06 34.38 20.83 8.12 43.24 29.53-5.49-6.61-35.2 34.51-6.41z"/>\n</g>\n<g id="furniture" fill-rule="evenodd">\n<path d="m102.13 160.6 19.55 20.85 30.22-35.75 47.91 64.3h10.13V90H49.77v120h13.52Zm-23.89-56.06a13.32 13.32 0 1 1-13.33 13.32 13.08 13.08 0 0 1 13.33-13.32Z"/><path d="M243.18 50h-43.25L135.67 1.75A9.57 9.57 0 0 0 130.16 0a9.29 9.29 0 0 0-5.44 1.76L59.78 50H16.31a6.58 6.58 0 0 0-6.57 6.56v186.88a6.58 6.58 0 0 0 6.57 6.56h226.87a6.58 6.58 0 0 0 6.57-6.56V56.56a6.58 6.58 0 0 0-6.57-6.56Zm-113-29.33L169.9 50H89.82ZM230 230l-200 .29V72l200-.26Z"/>\n</g>\n<g id="getin" fill-rule="evenodd">\n<path d="M130 10.1c-66.3 0-120 53.7-120 120s53.7 120 120 120 120-53.7 120-120-53.8-120-120-120zM49.9 129.5 112 67.4l14.3 14.4-38.1 38.3H210l-20 19.7-101.6-.3 37.5 37.4-14.3 14.3-61.7-61.7z"/>\n</g>\n<g id="getout" fill-rule="evenodd">\n<path d="M131 10a120 120 0 1 0 120 120A120 120 0 0 0 131 10Zm18.34 182-14.28-14.26 37.5-37.37L51 140.7 71 121h101.83l-38.2-38.4 14.26-14.43L211 130.31Z"/>\n</g>\n<g id="googledrive" fill-rule="evenodd">\n<path d="M159.26 140h79.31L170 20H90l-.01.02L159.26 140zM73.1 230H210l40-70H113.52L73.1 230zm-23.09 0 69.06-119.62L78.5 40.12 10 160l40 70h.01z"/>\n</g>\n<g id="googleplus" fill-rule="evenodd">\n<path d="M129.59 10a119.59 119.59 0 1 0 119.59 119.59A119.59 119.59 0 0 0 129.59 10Zm-24.91 175.09a55.5 55.5 0 1 1 37.44-96.46l-16.36 16a32.63 32.63 0 1 0-21.08 57.52c14 0 25.87-8.17 30.54-21.17H104V118h55a57.63 57.63 0 0 1 1.22 11.59 55.5 55.5 0 0 1-55.54 55.5ZM205 134v19h-14v-19h-20v-14h20v-20h14v20h19v14Z"/>\n</g>\n<g id="googleplus2" fill-rule="evenodd">\n<path d="M85.18 109.9v31.81h42.87a44.84 44.84 0 1 1-13-50.12l22.44-22a75.94 75.94 0 1 0 23.11 40.29Zm138.31 2.41v-26.5h-19.27v26.51h-26.51v19.28h26.51v26.5h19.28v-26.51H250v-19.28Z"/>\n</g>\n<g id="gooplay2" fill-rule="evenodd">\n<path d="M148.41 142.13 71.65 218.9 172 165.72l-23.59-23.59zM41 34.74a8.43 8.43 0 0 0-.93 3.78v182.83a8.6 8.6 0 0 0 10.42 8.4L143.27 137Zm107.41 97.11 29.66-29.66L52.92 31.05a8.42 8.42 0 0 0-6.16-.87Zm70.98-6.19-34.75-19.75L153.56 137l25.16 25.16 40.44-21.43a8.59 8.59 0 0 0 .23-15.07Z"/>\n</g>\n<g id="graphics" fill-rule="evenodd">\n<path d="M229.74 20.23h-200a10 10 0 0 0-10 10v200a10 10 0 0 0 10 10h200a10 10 0 0 0 10-10v-200a10 10 0 0 0-10-10Zm-140 190h-40v-40l40-40Zm60 0h-40v-120l40-40Zm60 0h-40v-80l40-40Z"/>\n</g>\n<g id="hashtag" fill-rule="evenodd">\n<path d="M250 100V70h-33.64L230 20h-30l-13.64 50h-70L130 20h-30L86.36 70H50l-30 30h58.18l-16.36 60H20v30h33.64L40 240h30l13.64-50h70L140 240h30l13.64-50H220l30-30h-58.18l16.36-60Zm-88.18 60h-70l16.36-60h70Z"/>\n</g>\n<g id="health" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm60 140h-40v40h-40v-40H70v-40h40V70h40v40h40Z"/>\n</g>\n<g id="help" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm0 190a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm22.5-70.39c-13.5 7.87-13.35 11.22-13.35 27.79h-19.58a113.47 113.47 0 0 1-.59-12.06c0-12.73 7-20.09 15.72-25.45 8.16-5.19 11.86-8.87 11.86-17.08 0-6.7-5-11.39-13.94-11.39-9.79 0-19.73 6.86-25.51 14.57L92.73 90.76c9-11.39 22.84-20.76 42.42-20.76C157.69 70 170 82.89 170 100.64c0 15.57-7.86 23.11-17.5 28.97Z"/>\n</g>\n<g id="hide" fill-rule="evenodd">\n<path d="m170 135-40 40a40 40 0 0 0 40-40Zm52-52-34.61 34.61a60 60 0 0 1-74.84 74.84l-21.34 21.34A120 120 0 0 0 130 220c90 0 120-90 120-90a155.75 155.75 0 0 0-28-47Zm-73.11 43.11 13.92-13.92L192 83l15-15 13-13V25l-30.59 30.59C173.44 46.31 153.83 40 130 40c-90 0-120 90-120 90s11.86 35.56 43 62l-23 23v30l51.73-51.73 11.15-11.15Zm-70.1 40.1a60 60 0 0 1 82.43-82.43l-14.76 14.76a40 40 0 0 0-52.92 52.92Z"/>\n</g>\n<g id="historic" fill-rule="evenodd">\n<path d="M120 136.77v-50l20-20v70"/><path d="m116.5 159.84-28.32.03 37.68-37.67L140 136.34l-23.5 23.5z"/><path d="M130 10.77a119.82 119.82 0 0 0-97.15 49.58L10 40.77v80l70-20L55.72 80a90 90 0 1 1-11.12 79.24l-28.47 9.49A120 120 0 1 0 130 10.77Z"/>\n</g>\n<g id="historical-transfer" fill-rule="evenodd">\n<path d="M74.14 199.4a90 90 0 1 1 139.19-91 84.18 84.18 0 0 1 31.48 16.9v-.3a119.91 119.91 0 1 0-190.25 97.2L35 245.1h79.93l-20-70Z"/><path d="M190.05 125A65 65 0 1 0 255 190a65 65 0 0 0-64.95-65Zm10 98.5-7.69-7.7 20.28-20.2-65.74.2 10.79-10.7h55.15l-20.68-20.8 7.69-7.8 33.58 33.7Z"/>\n</g>\n<g id="home" fill-rule="evenodd">\n<path d="M30 160v80a9.94 9.94 0 0 0 9.92 10H130v-80h60v80h30.08a10 10 0 0 0 9.92-10v-80L130 80Zm60 40H60v-20h50Zm40-180L0 130l20 20 110-90 110 90 20-20Z"/>\n</g>\n<g id="hotel" fill-rule="evenodd">\n<path d="M220 16a6 6 0 0 0-6-6H46a6 6 0 0 0-6 6v228a6 6 0 0 0 6 6h168a6 6 0 0 0 6-6ZM106.24 196l-5.48 5.34 1.24 7.46a3.13 3.13 0 0 1 0 .42c0 .29-.23.78-.52.78-.08 0-.17-.27-.24-.31L94.53 206l-6.77 3.5a.53.53 0 0 1-.55-.07.55.55 0 0 1-.21-.53l1.29-7.55-5.48-5.35a.53.53 0 0 1 .29-.9l7.57-1.1 3.38-6.86a.52.52 0 0 1 .94 0l3.39 6.86 7.57 1.1a.52.52 0 0 1 .29.89Zm34.8 0-5.48 5.34 1.28 7.45a3.13 3.13 0 0 1 0 .42c0 .29-.23.78-.52.78-.08 0-.17-.27-.24-.31l-6.75-3.68-6.77 3.5a.53.53 0 0 1-.55-.07.55.55 0 0 1-.21-.53l1.29-7.55-5.48-5.35a.53.53 0 0 1 .29-.9l7.57-1.1 3.38-6.86a.52.52 0 0 1 .94 0l3.38 6.86 7.57 1.1a.52.52 0 0 1 .29.89Zm-26-67v41H85V60h30v40h30V60h30v110h-30v-41Zm61.22 67-5.48 5.34 1.22 7.46a3.15 3.15 0 0 1 0 .42c0 .29-.23.78-.52.78-.08 0-.17-.27-.24-.31l-6.73-3.69-6.77 3.5a.53.53 0 0 1-.55-.07.55.55 0 0 1-.21-.53l1.29-7.55-5.47-5.35a.53.53 0 0 1 .29-.9l7.57-1.1 3.38-6.86a.52.52 0 0 1 .94 0l3.38 6.86 7.57 1.1a.52.52 0 0 1 .29.89Z"/>\n</g>\n<g id="icecream" fill-rule="evenodd">\n<path d="M70.51 140.6h9.23l45.1 106a5.82 5.82 0 0 0 10.77-.15l44.15-105.85h10.14l5-20.53H65.51Zm53.66-89.99a49.59 49.59 0 0 1 33.28-15.74 40.09 40.09 0 0 0-77.12 14.22 50 50 0 0 1 43.85 1.52ZM140 94.85a40.1 40.1 0 1 0-77.24 15.1h74.34a40 40 0 0 0 2.9-15.1Z"/><path d="M150 94.85a49.86 49.86 0 0 1-2.33 15.1h43.59A40.09 40.09 0 0 0 131.9 56.3 50 50 0 0 1 150 94.85Z"/>\n</g>\n<g id="idcard" fill-rule="evenodd">\n<path d="M240.23 40h-220A10.17 10.17 0 0 0 10 49.93v160.14A10.17 10.17 0 0 0 20.24 220h220a9.77 9.77 0 0 0 9.77-9.93V49.93a9.77 9.77 0 0 0-9.78-9.93ZM94.55 70a27.27 27.27 0 1 1-27.28 27.27A27.27 27.27 0 0 1 94.55 70ZM149 190H40v-10.91a49.08 49.08 0 0 1 37.43-47.69 38.07 38.07 0 0 0 34.19 0A49.07 49.07 0 0 1 149 179.09Zm51.23-50H160v-20h60.23Zm0-40H160V80h60.23Z"/>\n</g>\n<g id="identifiedcall" fill-rule="evenodd">\n<path d="m228.24 208.72-50.78-42.62a6.7 6.7 0 0 0-8.86.37l-7.41 7.41-1.47 1.47-15.28 15.28a143.22 143.22 0 0 1-51.76-33.14 141.33 141.33 0 0 1-33.14-51.77l15.27-15.27L76.28 89l7.41-7.41a6.8 6.8 0 0 0 .31-8.96L41.41 21.88a5.38 5.38 0 0 0-8.08-.33l-19.1 19.1a6.18 6.18 0 0 0-1.13 1.13l-2.28 2.28-.06-.06h-.17a184.73 184.73 0 0 0 195.55 195.55l-.07-.21 2.28-2.28 1.13-1.13 19.1-19.11a5.43 5.43 0 0 0-.34-8.1ZM173 105.31l76.71-76.7-14.15-14.15-77.78 77.79-28.28-28.29-14.14 14.15 42.42 42.42L173 105.31z"/>\n</g>\n<g id="illustration" fill-rule="evenodd">\n<path d="M240 80V20h-60v20H80V20H20v60h20v100H20v60h60v-20h100v20h60v-60h-20V80ZM40 40h20v20H40Zm20 180H40v-20h20Zm120-20H80v-20H60V80h20V60h100v20h20v100h-20Zm40 20h-20v-20h20Z"/><path d="m89 169.74 31.44-89.16h18.6l31 87.72-18.84 2.88-7.08-21.24h-30.23l-6.89 19.8Zm29.64-34h20.88l-10.2-30.24h-.24Z"/>\n</g>\n<g id="incomingcall" fill-rule="evenodd">\n<path d="m228 218.8-50.8-42.6c-2.5-2.1-6.5-2-8.9.4l-7.4 7.4-1.5 1.5-15.3 15.3c-18.7-6.8-36.9-18.3-51.8-33.1-15.3-15.3-26.4-33.1-33.1-51.8l15.3-15.3 1.5-1.5 7.4-7.4c2.3-2.3 2.4-6.4.3-8.9L41.2 32c-2.1-2.5-5.7-2.7-8.1-.3L14 50.8c-.4.4-.9.7-1.1 1.1l-2.3 2.3-.1-.1h-.2c-3 51 14.9 102.9 53.8 141.8 38.9 38.9 90.8 56.8 141.8 53.8l-.1-.2 2.3-2.3 1.1-1.1 19.1-19.1c2.4-2.4 2.2-6-.3-8.2zM170 110h50l30-30h-80V50l-50 45 50 45z"/>\n</g>\n<g id="info" fill-rule="evenodd">\n<path d="M130 90a15 15 0 1 0-15-15 15 15 0 0 0 15 15Zm-10 20h20v90l-20-20Zm10 140A120 120 0 1 0 10 130a120 120 0 0 0 120 120Z"/>\n</g>\n<g id="instagram" fill-rule="evenodd">\n<circle cx="130.03" cy="130.34" r="25"/><path d="M188.49 86.1a24.84 24.84 0 0 0-14.23-14.23c-2.64-1-6.61-2.25-13.93-2.58-7.91-.36-10.28-.44-30.31-.44s-22.4.08-30.31.44c-7.31.33-11.28 1.56-13.93 2.58A24.84 24.84 0 0 0 71.56 86.1c-1 2.64-2.25 6.61-2.58 13.93-.36 7.91-.44 10.28-.44 30.31s.08 22.4.44 30.31c.33 7.31 1.56 11.28 2.58 13.93a24.84 24.84 0 0 0 14.23 14.22c2.64 1 6.61 2.25 13.93 2.58 7.91.36 10.28.44 30.31.44s22.4-.08 30.31-.44c7.31-.33 11.28-1.56 13.93-2.58a24.84 24.84 0 0 0 14.23-14.23c1-2.64 2.25-6.61 2.58-13.93.36-7.91.44-10.28.44-30.31s-.08-22.4-.44-30.31c-.34-7.3-1.56-11.27-2.59-13.92ZM130 168.85a38.51 38.51 0 1 1 38.51-38.51A38.51 38.51 0 0 1 130 168.85Zm40-69.55a9 9 0 1 1 9-9 9 9 0 0 1-8.94 9Z"/><path d="M130 10.34a120 120 0 1 0 120 120 120 120 0 0 0-120-120Zm74.55 150.92a55 55 0 0 1-3.49 18.21 38.35 38.35 0 0 1-21.93 21.93 55.06 55.06 0 0 1-18.13 3.49c-8 .36-10.55.45-30.92.45s-22.92-.09-30.92-.45a55.06 55.06 0 0 1-18.26-3.49A38.35 38.35 0 0 1 59 179.47a55 55 0 0 1-3.49-18.21c-.37-8-.45-10.55-.45-30.92s.09-22.92.45-30.92A55 55 0 0 1 59 81.21a38.35 38.35 0 0 1 21.9-21.94 55.06 55.06 0 0 1 18.21-3.49c8-.37 10.55-.45 30.92-.45s22.92.09 30.92.45a55.06 55.06 0 0 1 18.21 3.49 38.35 38.35 0 0 1 21.93 21.93 55 55 0 0 1 3.49 18.21c.37 8 .45 10.55.45 30.92s-.09 22.93-.45 30.93Z"/>\n</g>\n<g id="instagram2" fill-rule="evenodd">\n<path d="M130 78.65A51.35 51.35 0 1 0 181.35 130 51.35 51.35 0 0 0 130 78.65m0 84.68A33.33 33.33 0 1 1 163.33 130 33.33 33.33 0 0 1 130 163.33m65.38-86.71a12 12 0 1 1-12-12 12 12 0 0 1 12 12"/><path d="M130 48c26.7 0 29.86.1 40.41.58 9.75.44 15 2.07 18.57 3.44a33.11 33.11 0 0 1 19 19c1.37 3.52 3 8.82 3.44 18.57.48 10.55.58 13.71.58 40.41s-.1 29.86-.58 40.41c-.44 9.75-2.07 15-3.44 18.57a33.11 33.11 0 0 1-19 19c-3.52 1.37-8.82 3-18.57 3.44-10.54.48-13.71.58-40.41.58s-29.87-.1-40.41-.58c-9.75-.44-15-2.07-18.57-3.44a33.11 33.11 0 0 1-19-19c-1.37-3.52-3-8.82-3.44-18.57C48.12 159.86 48 156.7 48 130s.1-29.86.58-40.41C49 79.84 50.68 74.55 52 71a33.11 33.11 0 0 1 19-19c3.52-1.37 8.82-3 18.57-3.44C100.14 48.12 103.3 48 130 48m0-18c-27.16 0-30.56.11-41.23.6s-17.91 2.18-24.27 4.65A51.13 51.13 0 0 0 35.25 64.5c-2.47 6.36-4.16 13.63-4.65 24.27S30 102.84 30 130s.11 30.56.6 41.23 2.18 17.91 4.65 24.27a51.13 51.13 0 0 0 29.25 29.25c6.36 2.47 13.63 4.16 24.27 4.65s14.07.6 41.23.6 30.56-.12 41.23-.6 17.91-2.18 24.27-4.65a51.13 51.13 0 0 0 29.25-29.25c2.47-6.36 4.16-13.63 4.65-24.27s.6-14.07.6-41.23-.11-30.56-.6-41.23-2.18-17.91-4.65-24.27a51.13 51.13 0 0 0-29.25-29.25c-6.36-2.47-13.63-4.16-24.27-4.65S157.16 30 130 30"/>\n</g>\n<g id="insurance" fill-rule="evenodd">\n<path d="M60 130a69.65 69.65 0 0 1 11.53-38.47L35.74 55.74a120 120 0 0 0 0 148.53l35.79-35.79A69.65 69.65 0 0 1 60 130Zm164.26-74.26-35.79 35.79a70 70 0 0 1 0 76.94l35.79 35.79a120 120 0 0 0 0-148.53ZM130 60a69.65 69.65 0 0 1 38.47 11.53l35.79-35.79a120 120 0 0 0-148.53 0l35.8 35.79A69.65 69.65 0 0 1 130 60Zm0 140a69.65 69.65 0 0 1-38.47-11.53l-35.79 35.79a120 120 0 0 0 148.53 0l-35.79-35.79A69.65 69.65 0 0 1 130 200Z"/>\n</g>\n<g id="international" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10ZM29.75 130a99.69 99.69 0 0 1 9.7-42.73L90 149.33v.67h20v44h12v35.72c-51-3.84-92.25-47.01-92.25-99.72ZM147 228.47V194h33v-50h-40v-34H90V90h30V60h30V32a100 100 0 0 1-3 196.47Z"/>\n</g>\n<g id="investment" fill-rule="evenodd">\n<path d="M230 20H30a10 10 0 0 0-10 10v110l50-50 50 50 50-50-20-20h60v60l-20-20-70 70-50-50-50 50v50a10 10 0 0 0 10 10h200a10 10 0 0 0 10-10V30a10 10 0 0 0-10-10Z"/>\n</g>\n<g id="jewel" fill-rule="evenodd">\n<path d="M22.3 80 10 120l120.54 120L250 120l-29.87-90H40.58L28.19 60h101.88l-20 20ZM20 85.08"/>\n</g>\n<g id="jpg" fill-rule="evenodd">\n<path d="M122.5 114H114v16h8.5c7.5 0 10.3-2.8 10.3-8.1-.1-5.1-2.8-7.9-10.3-7.9Z"/><path d="M160 10H46.4a6.18 6.18 0 0 0-6.4 6v227.5a6.53 6.53 0 0 0 6.4 6.5h167.2a6.53 6.53 0 0 0 6.4-6.5V69.8ZM92 143c0 10.2-5.2 17.2-18.3 17.2-7.3 0-11.9-2.5-15.2-5.4l5.2-8.8c2.6 2.4 5.9 4.6 9.5 4.6 4.3 0 6.8-2.7 6.8-9.4V104h12Zm30-3h-8v19h-12v-55h20.2c11.7 0 22.3 3.5 22.3 17.9 0 14.7-11.5 18.1-22.5 18.1Zm76 19h-10v-6h-.1c-2.2 4-7.6 7.1-14.5 7.1-16.4 0-23.8-12.1-23.8-28.6 0-17.2 9.5-28.2 24.7-28.2 8.3 0 17.2 3.4 22 13.1l-10.2 4.6c-2.1-4.6-5.8-7.7-11.2-7.7-4.9 0-13.2 2.6-13.2 18s7.4 19.3 13.2 19.3c6 0 10.1-3.7 11.2-9.7h-8.7l-1.8-9H198Z"/>\n</g>\n<g id="keyboard" fill-rule="evenodd">\n<path d="M244.46 40H15.54A5.44 5.44 0 0 0 10 45.34v169.32a5.45 5.45 0 0 0 5.54 5.34h228.92a5.44 5.44 0 0 0 5.54-5.34V45.34a5.45 5.45 0 0 0-5.54-5.34Zm-81.13 35.44h22.22v22.23h-22.22Zm-44.44 0h22.22v22.23h-22.22Zm44.44 44.44v22.22h-22.22v-22.21ZM74.44 75.44h22.23v22.23H74.44Zm44.44 44.44v22.22H96.67v-22.21ZM30 75.44h22.22v22.23H30Zm0 44.44h44.44v22.22H30Zm22.22 66.67H30v-22.22h22.22Zm133.33 0H74.44v-22.22h111.12Zm44.44 0h-22.21v-22.22H230Zm0-66.67v22.22h-44.43v-22.21h22.22V75.44H230Z"/>\n</g>\n<g id="language" fill-rule="evenodd">\n<path d="m170 40-20-20H30v220h30v-89h70.69L150 171h80V40ZM60 130V50l80 80Z"/>\n</g>\n<g id="lastpage" fill-rule="evenodd">\n<path d="M69.763 87.572 83.905 73.43l56.568 56.568-14.142 14.142z"/><path d="m69.757 172.424 56.568-56.569 14.142 14.143L83.9 186.566zM160.41 69.65h20v120h-20z"/>\n</g>\n<g id="law" fill-rule="evenodd">\n<path d="M239.9 217.88 141.33 119l14.14-14.14-63.63-63.65-49.5 49.5L106 154.35l14.14-14.14 98.73 98.73s10.35 3.84 17.24-3 3.79-18.06 3.79-18.06ZM175.5 84.83a11.86 11.86 0 0 0-.24-16.77l-46.63-46.63a11.86 11.86 0 0 0-16.77-.24L106 27.07l63.64 63.64ZM69.08 174a12 12 0 0 0 17 .24l5.77-5.77-63.65-63.62-3.54 3.54c-5.86 5.86-6.25 15-.87 20.34ZM20 210h130v30H20z"/>\n</g>\n<g id="letter-a" fill-rule="evenodd">\n<path d="m129.35 98.24-16.32 47.23h32.61l-15.93-47.23h-.38zm33.62 102.21-11.05-33.18h-47.23L94.01 198.2H65.89l49.1-139.27h29.06l48.35 137-29.42 4.51zm73.2-189.62H23.83a13 13 0 0 0-13 13v212.33a13 13 0 0 0 13 13.01h212.33a13 13 0 0 0 13-13V23.83a13 13 0 0 0-12.99-13z"/>\n</g>\n<g id="letter-h" fill-rule="evenodd">\n<path d="M228 20H32c-6.6 0-12 5.4-12 12v196c0 6.6 5.4 12 12 12h196c6.6 0 12-5.4 12-12V32c0-6.6-5.4-12-12-12zm-44.6 174h-28.2v-54.7h-50.3V194H76.6V66h28.2v49.7h50.3V66h28.2v128z"/>\n</g>\n<g id="letter-o" fill-rule="evenodd">\n<path d="M130.1 86.9c-19.9 0-32.2 16.3-32.2 43.1s12.3 43.8 32.2 43.8c19.7 0 32.2-17 32.2-43.8s-12.5-43.1-32.2-43.1z"/><path d="M228 20H32c-6.6 0-12 5.4-12 12v196c0 6.6 5.4 12 12 12h196c6.6 0 12-5.4 12-12V32c0-6.6-5.4-12-12-12zm-97.9 176.4c-31 0-60.4-21.4-60.4-66.4s29.4-66.4 60.4-66.4c30.8 0 60.2 21.5 60.2 66.4s-29.4 66.4-60.2 66.4z"/>\n</g>\n<g id="limits" fill-rule="evenodd">\n<path d="M227.47 220a120 120 0 1 0-194.94 0ZM150 170a20 20 0 1 1-20-20c.64 0 1.26 0 1.89.1L180 110l10 10-40.1 48.11c.1.63.1 1.25.1 1.89Zm70-40a10 10 0 1 1-10 10 10 10 0 0 1 10-10Zm0 60a10 10 0 1 1-10-10 10 10 0 0 1 10 10ZM130 50a99.77 99.77 0 0 1 75.53 34.47l-14.18 14.18A80 80 0 0 0 67.55 200H43.38A100 100 0 0 1 130 50Z"/>\n</g>\n<g id="link" fill-rule="evenodd">\n<path d="M70 140h90l30-30h-90Zm-30-15a45 45 0 0 1 45-45h55l30-30H85a75 75 0 0 0-21.78 146.78L90 170h-5a45 45 0 0 1-45-45Zm164.13-69.13-24.38 24.38A45 45 0 0 1 175 170h-45l-30 30h75a75 75 0 0 0 29.13-144.13Z"/>\n</g>\n<g id="linkedin" fill-rule="evenodd">\n<path d="M130.41 10.82A119.59 119.59 0 1 0 250 130.41 119.59 119.59 0 0 0 130.41 10.82ZM100 180H72V97h28ZM85.92 85.83c-8.8 0-15.92-6.46-15.92-14.41S77.12 57 85.92 57s15.91 6.46 15.91 14.42-7.12 14.41-15.91 14.41ZM200 180h-28v-45c0-9.15-4-18.3-14.71-18.3S141 125.85 141 135.23V180h-27V97h27v11.93C149 99.32 155.95 95 167.77 95S200 100.92 200 133.17Z"/>\n</g>\n<g id="linkedin2" fill-rule="evenodd">\n<path d="M31.81 218.93H75V93.5H31.81ZM178.26 90.38c-18 0-29 6.59-40.41 21.19V93.5H95.71v125.43h42.15v-67.41c0-14.24 7.94-28.14 24.17-28.14s21.76 13.9 21.76 27.8v67.75H227v-70.54c0-48.99-30.78-58.01-48.74-58.01ZM53.57 32.69c-13.36 0-24.18 9.82-24.18 21.9s10.82 21.89 24.18 21.89 24.17-9.81 24.17-21.89-10.82-21.9-24.17-21.9Z"/>\n</g>\n<g id="listview" fill-rule="evenodd">\n<path d="M40.49 80.6V50H10v30.6h30.49zm0 64.53v-30.6H10v30.6h30.49zm0 64.87v-30.6H10V210h30.49zM210 80H70.37V50H240l-30 30zm-30 65H70.37v-30H210l-30 30zm30 65H70.37v-30H240l-30 30z"/>\n</g>\n<g id="loan" fill-rule="evenodd">\n<path d="m107.36 144.22-28.55.04 37.98-37.98 14.26 14.25-23.69 23.69z"/><path d="M110.89 120.97V70.56l20.16-20.16v70.57M195 130a65 65 0 1 0 65 65 65 65 0 0 0-65-65Zm7 96.06V238h-.77L191 232.66v-5.85a34 34 0 0 1-13.28-3.81l-.45-.3-.32-.2.09-.42.11-.63 1.19-8.09.21-1.4.14-.94.79.52 1.18.78a26.79 26.79 0 0 0 14.43 4.68c5.52 0 8.86-2.79 8.86-7.35s-1.79-6.27-10.24-10.09c-12.23-5.55-16.2-9.75-16.2-18.31 0-8.4 5.49-14.47 13.49-16.28V154h1.05l9.95 5.11v5.7a21.37 21.37 0 0 1 9 3.14l.49.31.34.21-.08.41-.1.61-1.27 7.92-.24 1.49-.16 1-.8-.61-1.2-.92a19.06 19.06 0 0 0-11.31-4c-5.24 0-8.1 2.36-8.1 6.33 0 3.72 1.85 5.45 10.16 9.25 12.26 5.58 16.14 10 16.14 19.15.02 8.49-4.87 14.73-12.87 16.96Z"/><path d="M113.2 218.1a98.33 98.33 0 1 1 104.9-104.9 84.53 84.53 0 0 1 21.9 9.68V120a120 120 0 1 0-120 120h2.88a84.53 84.53 0 0 1-9.68-21.9Z"/>\n</g>\n<g id="loaneuro" fill-rule="evenodd">\n<path d="m110.89 112.18-32.08 32.08 28.55-.04 23.26-23.25h.43V50.4l-20.16 20.16v41.62z"/><path d="M21.67 120a98.33 98.33 0 0 1 196.43-6.8 84.53 84.53 0 0 1 21.9 9.68V120a120 120 0 1 0-120 120h2.88a84.53 84.53 0 0 1-9.67-21.87A98.34 98.34 0 0 1 21.67 120Z"/><path d="M195 130a65 65 0 1 0 65 65 65 65 0 0 0-65-65Zm5 52.8-10 10h-19.73c-.08.82-.12 1.65-.12 2.49s0 1.67.12 2.49H200l-10 10h-16.51a24.89 24.89 0 0 0 39.16 5.16l7 7a34.85 34.85 0 0 1-59.5-24.65c0-.84 0-1.67.1-2.49h-.1l.11-.11a34.85 34.85 0 0 1 59.39-22l-7 7a24.89 24.89 0 0 0-39.16 5.16Z"/>\n</g>\n<g id="lock" fill-rule="evenodd">\n<path d="M90 170h80l-20 20H90Zm90-60V79.9a50 50 0 0 0-100 0V110Zm20 0V79.91a70 70 0 0 0-140 0V110H49.93A10 10 0 0 0 40 120.07v119.86A10 10 0 0 0 49.93 250h160.14a10 10 0 0 0 9.93-10.07V120.07a10 10 0 0 0-9.93-10.07Z"/>\n</g>\n<g id="lostcall" fill-rule="evenodd">\n<path d="m15.4 241.1 57.3-5c2.9-.3 5.2-2.8 5.2-5.7v-29.7c15.6-7.3 33.9-11.4 52.1-11.4 18.7 0 36.5 4.1 52.1 11.4v29.7c0 2.9 2.4 5.4 5.3 5.7l57.3 5c2.9.3 5.2-1.9 5.2-4.8v-23.4c0-.5.1-.9 0-1.4v-2.8h.1l.1-.1c-29.4-33.1-72.3-54-120-54-47.8 0-90.6 20.9-120 54l.2.1v27.6c-.2 2.9 2.2 5.1 5.1 4.8zM180 81.2l20 20v-60h-60l20 20-30 30-50-50-20 20 70 70z"/>\n</g>\n<g id="man" fill-rule="evenodd">\n<path d="M99.3 120v129.84h20v-100h20v100h20v-190h-60V120z"/><circle cx="129.3" cy="29.72" r="20"/><path d="m74.39 149.84 15-15v-75h-15v90zm94.41-90v75l15 15v-90h-15z"/>\n</g>\n<g id="mapa" fill-rule="evenodd">\n<path d="M232.2 22.2 170 40 90 20 24.4 38.7c-2.6.7-4.4 3.1-4.4 5.9v186.1c0 3.4 2.7 6.1 6.1 6.1.8 0 1.6-.2 2.4-.5L90 210l80 30 66.3-28.4c2.2-1 3.7-3.2 3.7-5.6V28.1c0-3.4-2.8-6.1-6.1-6.1-.6 0-1.2.1-1.7.2zM170 220l-80-30V40l80 20v160z"/>\n</g>\n<g id="medicalkit" fill-rule="evenodd">\n<path d="M240 60h-50V30a10 10 0 0 0-10-10H80a10.07 10.07 0 0 0-10 10v30H20a10 10 0 0 0-10 9.93v160.14A10 10 0 0 0 20 240h220a10 10 0 0 0 10-9.93V69.93A10 10 0 0 0 240 60ZM90 40h80v20H90Zm90 127h-33v33h-34v-33H80v-34h33v-33h34v33h33Z"/>\n</g>\n<g id="menu" fill-rule="evenodd">\n<path d="M210 80H20V50h220l-30 30zm-30 65H20v-30h190l-30 30zm-30 65H20v-30h160l-30 30z"/>\n</g>\n<g id="microphone" fill-rule="evenodd">\n<path d="M119.94 130H80.71a50.34 50.34 0 0 0 99.61-10.09V50.09a50.31 50.31 0 0 0-100.63 0V70h60.38l-20.13 20H79.69v20h60.38ZM220 130h-20.29a70.49 70.49 0 0 1-139.41 0H40c4.65 41.72 38 74.81 79.94 79.43V230H69.62v20h120.76v-20h-50.32v-20.57C182 204.81 215.35 171.72 220 130Z"/>\n</g>\n<g id="milk" fill-rule="evenodd">\n<path d="M90.5 100h80v110h-80z"/><path d="M168.7 40h-28.2l49.9 50v140H70.6V90.2l49.9-50-28.2-.1-38.2 38.3c-2.2 2.2-3.5 5.3-3.5 8.5V238c0 6.6 5.4 12 12 12h135.7c6.6 0 12-5.4 12-12V86.7c0-3.2-1.3-6.2-3.5-8.5L168.7 40zM76.4 10h108c3.3 0 6 2.7 6 6v8c0 3.3-2.7 6-6 6h-108c-3.3 0-6-2.7-6-6v-8c0-3.3 2.7-6 6-6z"/>\n</g>\n<g id="missedcall" fill-rule="evenodd">\n<path d="m15.4 241.1 57.3-5c2.9-.3 5.2-2.8 5.2-5.7v-29.7c15.6-7.3 33.9-11.4 52.1-11.4 18.7 0 36.5 4.1 52.1 11.4v29.7c0 2.9 2.4 5.4 5.3 5.7l57.3 5c2.9.3 5.2-1.9 5.2-4.8v-23.4c0-.5.1-.9 0-1.4v-2.8h.1l.1-.1c-29.4-33.1-72.3-54-120-54-47.8 0-90.6 20.9-120 54l.2.1v27.6c-.2 2.9 2.2 5.1 5.1 4.8zM80 81.2l-20 20v-60h60l-20 20 30 30 50-50 20 20-70 70z"/>\n</g>\n<g id="mobile" fill-rule="evenodd">\n<path d="M70 20h120a10 10 0 0 1 10 10v200a10 10 0 0 1-10 10H70a10 10 0 0 1-10-10V30a10 10 0 0 1 10-10Zm10 20v160h100V40Zm20 20h60v50l-60 60Zm30 170a10 10 0 1 0-10-10 10 10 0 0 0 10 10Z"/>\n</g>\n<g id="mobilecashdollar" fill-rule="evenodd">\n<path d="M200 10H60a10 10 0 0 0-10 10v220a10 10 0 0 0 10 10h140a10 10 0 0 0 10-10V20a10 10 0 0 0-10-10Zm-70 230a10 10 0 1 1 10-10 10 10 0 0 1-10 10Zm60-30H70V30h120Zm-60.8-55.3c-10 0-20.41-3.82-28.81-8.64L97.5 163.2a72.42 72.42 0 0 0 22.5 6.3V180l20 10v-21.24c13.41-3.2 22.5-12.58 22.5-27.8s-7.53-22.1-28.08-30.31c-13.9-5.67-17.08-8.64-17.08-14.87 0-5.95 4.2-10.48 13.75-10.48 7.82 0 16.36 3 23.6 7.65l2.9-17A51.8 51.8 0 0 0 140 70.53V60l-20-10v21.36c-12.65 3.29-21.05 12.4-21.05 26 0 15.16 7.82 21.39 27.22 29.18 14.48 6.09 18 9.06 18 16.29-.06 7.76-6.17 11.87-14.97 11.87Z"/>\n</g>\n<g id="mobilecasheuro" fill-rule="evenodd">\n<path d="M200 10H60a10 10 0 0 0-10 10v220a10 10 0 0 0 10 10h140a10 10 0 0 0 10-10V20a10 10 0 0 0-10-10Zm-70 230a10 10 0 1 1 10-10 10 10 0 0 1-10 10Zm60-30H70V30h120Zm-46.44-107.87-13.39 13.39h-26.61c-.11 1.1-.17 2.22-.17 3.35s.06 2.25.17 3.35h40l-13.39 13.38h-22.29a33.47 33.47 0 0 0 52.65 6.93L170 152a46.86 46.86 0 0 1-80-33.14c0-1.13.05-2.24.13-3.35H90l.14-.14A46.85 46.85 0 0 1 170 85.73l-9.47 9.47a33.47 33.47 0 0 0-52.65 6.93Z"/>\n</g>\n<g id="mobiledisconnected" fill-rule="evenodd">\n<path d="M210 20v-.23A9.81 9.81 0 0 0 200 10H60a9.79 9.79 0 0 0-10 9.77V180l-20 20v30l20-20 20-20L190 70l20-20 20-20V0ZM70 160V30h120v10Zm120 50H80.23L50 240.22A10 10 0 0 0 60 250h140a10.19 10.19 0 0 0 10-10.24V80l-20 20Zm-60 29.77a10 10 0 1 1 10-10 10 10 0 0 1-10 10Z"/>\n</g>\n<g id="mobilepayment" fill-rule="evenodd">\n<path d="M200.07 10h-140A10.27 10.27 0 0 0 50 20.26v220A9.87 9.87 0 0 0 60.09 250h140a9.71 9.71 0 0 0 9.93-9.76v-220A10.15 10.15 0 0 0 200.07 10Zm-70 230.25a10 10 0 1 1 10-10 10 10 0 0 1-9.99 10ZM190 210H70V30h120Z"/><path d="M160.32 118.83a65.32 65.32 0 0 1-22.79 49.78l11.87 9.05a80.41 80.41 0 0 0 0-117.66l-11.87 9.05a65.32 65.32 0 0 1 22.79 49.78Z"/><path d="m111.79 149 12.52 9.55a56.16 56.16 0 0 0 0-79.4l-12.52 9.55a39 39 0 0 1 0 60.3Zm-25.04-19.11 10.52 8a24.34 24.34 0 0 0 0-38.16l-10.52 8a14.6 14.6 0 0 1 0 22.12Z"/>\n</g>\n<g id="mooncar" fill-rule="evenodd">\n<path d="M239 100.44h-11.38l-19.8-67.9a3.09 3.09 0 0 0-2.79-2.1H55.53a3.13 3.13 0 0 0-2.81 2.08l-20.66 67.92H20.83a10.91 10.91 0 0 0-10.92 10.9v10.93a11.14 11.14 0 0 0 10.92 11.17h9.08v86.08a10.91 10.91 0 0 0 10.9 10.92h12.65c6 0 10.45-4.89 10.45-10.92v-9.08h131v9.08a10.88 10.88 0 0 0 10.84 10.92h11c6 0 13.19-4.89 13.19-10.92v-86.08H239a11.14 11.14 0 0 0 10.92-11.17v-10.93a10.91 10.91 0 0 0-10.92-10.9Zm-169.08-50h120l15 50h-150Zm-5 110a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm134.5.5a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/><path d="m109.41 84.72 19.77-19.77H77.41l-6 20m117 0-6-20h-33.37l-19.77 19.77"/>\n</g>\n<g id="more" fill-rule="evenodd">\n<path d="M55 105a25 25 0 1 0 25 25 25 25 0 0 0-25-25Zm75 0a25 25 0 1 0 25 25 25 25 0 0 0-25-25Zm75 0a25 25 0 1 0 25 25 25 25 0 0 0-25-25Z"/>\n</g>\n<g id="mortaje" fill-rule="evenodd">\n<path d="M30 149v80a9.94 9.94 0 0 0 9.92 10H130v-80h60v80h30.08a10 10 0 0 0 9.92-10v-80L130 69Zm60 40H60v-20h50ZM130 9 0 119l20 20 110-90 110 90 20-20Z"/>\n</g>\n<g id="mylocation" fill-rule="evenodd">\n<path d="M130 90c-22.1 0-40 17.9-40 40s17.9 40 40 40 40-17.9 40-40-17.9-40-40-40z"/><path d="M227.5 120C222.4 73.9 186 37.6 140 32.6V10h-20v22.5C74 37.6 37.6 74 32.5 120H10v20h22.5c5 46.1 41.4 82.4 87.4 87.5V250h20v-22.5c46.1-5.1 82.5-41.5 87.5-87.5H250v-20h-22.5zM130 206.4c-42.2 0-76.3-34.2-76.3-76.4s34.2-76.3 76.4-76.3c42.1 0 76.3 34.2 76.3 76.3.1 42.1-34.1 76.3-76.2 76.4h-.2z"/>\n</g>\n<g id="myprofile" fill-rule="evenodd">\n<path d="M161.38 132.34a70 70 0 0 1-62.76 0A90 90 0 0 0 30 219.77v20h200v-20a90 90 0 0 0-68.62-87.43ZM160 209.77h-30v-20h50Zm-30-90a50 50 0 1 0-50-50 50 50 0 0 0 50 50Z"/>\n</g>\n<g id="myprojects" fill-rule="evenodd">\n<path d="M160.23 10H160v63h50.56l-20 17H140V10H46.6a6.54 6.54 0 0 0-6.6 6.28v227.45a6.53 6.53 0 0 0 6.61 6.27h167.24a6.12 6.12 0 0 0 6.15-6.26V70ZM100 140a20 20 0 1 1-20 20 20 20 0 0 1 20-20Zm40 90H60v-4.23A36.66 36.66 0 0 1 87.45 190a27.43 27.43 0 0 0 25.1 0A36.68 36.68 0 0 1 140 225.77Z"/>\n</g>\n<g id="navigation" fill-rule="evenodd">\n<path d="M250 120V40l-22.84 19.58A120 120 0 1 0 243.87 168l-28.47-9.49a90 90 0 1 1-11.12-79.28L180 100Z"/>\n</g>\n<g id="nearme" fill-rule="evenodd">\n<path d="M231.3 20.5 15.6 105.2c-2.8 1.1-4.6 3.8-4.6 6.8v4.3c0 3 1.9 5.7 4.7 6.8l85.4 33c1.9.7 3.5 2.3 4.2 4.2l33 85.4c1.1 2.8 3.8 4.7 6.8 4.7h4.3c3 0 5.7-1.8 6.8-4.6L240.8 30c1.5-3.8-.4-8-4.2-9.5-1.7-.6-3.6-.6-5.3 0zm-84.1 178.4-21.9-64.3 77.8-77.8-55.9 142.1z"/>\n</g>\n<g id="netcash" fill-rule="evenodd">\n<path d="M185 120c-35.9 0-65 29.1-65 65s29.1 65 65 65 65-29.1 65-65-29.1-65-65-65zm5.4 51.5-10.8 10.8h-21.5c-.1.9-.1 1.8-.1 2.7s0 1.8.1 2.7h32.4l-10.8 10.8h-18c7.5 13 24 17.4 37 9.9 2-1.2 3.9-2.6 5.6-4.3l7.7 7.7c-14.8 14.8-38.8 14.8-53.6.1-7.1-7.1-11.1-16.8-11.1-26.9 0-.9 0-1.8.1-2.7h-.1l.1-.1c1.6-20.9 19.7-36.5 40.6-35 9.1.7 17.6 4.6 24 11l-7.7 7.7c-10.6-10.6-27.7-10.6-38.3 0-1.7 1.7-3.1 3.6-4.3 5.6h28.7z"/><path d="M111.9 228.4c-46.3-8.3-82.2-49.2-82.2-98.4 0-14.8 3.3-29.4 9.7-42.7l50.6 62v.7h17.6c6.9-15.3 18.2-28.2 32.4-37.1V110H90V90h30V60h30V32c39.9 8.2 70.8 39.7 78.1 79.7 8.3 4.9 15.7 11.1 21.9 18.5v-.2c0-66.3-53.7-120-120-120S10 63.7 10 130s53.7 120 120 120h.2c-7.2-6.1-13.4-13.4-18.3-21.6z"/>\n</g>\n<g id="newclient" fill-rule="evenodd">\n<circle cx="100" cy="60.5" r="50"/><path d="M144.27 127.29a89.36 89.36 0 0 0-12.9-4.22 70 70 0 0 1-62.76 0A90 90 0 0 0 0 210.5v20h117.55a85 85 0 0 1 26.73-103.21Z"/><path d="M195 130.5a65 65 0 1 0 65 65 65 65 0 0 0-65-65Zm33.33 73.12h-25.2v31.88h-16.25v-31.88H155v-16.25h31.88V155.5h16.25v31.87H235Z"/>\n</g>\n<g id="nfcconnect" fill-rule="evenodd">\n<path d="M71.05 79a78.93 78.93 0 0 1 0 102l29 12a109.89 109.89 0 0 0 0-126Z"/><path d="M126.11 55a130.88 130.88 0 0 1 0 149l28 12a160.86 160.86 0 0 0 0-173Z"/><path d="m209.2 20-28 12a181.85 181.85 0 0 1 0 196l28 12a211.81 211.81 0 0 0 0-220ZM20 101a48.34 48.34 0 0 1 10 29 48.34 48.34 0 0 1-10 29l24 10a59 59 0 0 0 0-79Z"/>\n</g>\n<g id="nfcdisconnect" fill-rule="evenodd">\n<path d="M44 169a59 59 0 0 0 0-79l-24 11a48 48 0 0 1 10 29 48 48 0 0 1-10 29Zm189-92-25 25a182 182 0 0 1-26 126l28 12a212 212 0 0 0 23-163Z"/><path d="m177 103 25-25 24-24 14-14V10l-23.44 23.39Q213 26.57 209 20l-28 12a182.85 182.85 0 0 1 12.9 24.1L171 79a161.06 161.06 0 0 0-17-36l-28 12a131 131 0 0 1 20.45 48.54L120 130a110 110 0 0 0-20-63L71 79a79 79 0 0 1 5.79 94.21L40 210v30l51-51 23-23 35-35Zm-51 101 28 12a161 161 0 0 0 25-85l-35 35a131 131 0 0 1-18 38Z"/>\n</g>\n<g id="no-interest" fill-rule="evenodd">\n<path d="m223.3 150.8-45.8 76.8h14.3l45.8-76.8zm16.5 27.5c-12.8 0-20.8 10-20.8 25.2 0 15 7.8 25.1 20.7 25.1s20.7-10.2 20.7-25.2c0-15.1-7.8-25.1-20.6-25.1zm0 39.7c-5.1 0-7.1-5.4-7.1-14.6 0-8.9 2-14.3 7-14.3s7 5.2 7 14.3c.1 9-1.9 14.6-6.9 14.6zm-95.1-43.3c0-21 12.4-35.1 30.8-35.1 3.1 0 6.1.4 8.8 1.2.2-3.5.3-7.1.3-10.8 0-66.2-31.9-110-87.4-110C42 20 9.6 63.8 9.6 130S42 240 97.2 240c28.9 0 51.3-11.9 66.2-32.5-11.5-4.8-18.7-16.8-18.7-32.8zm-47.5 28.9c-26.5 0-41.5-25.2-41.5-73.6s14.2-72.8 41.5-72.8c26.5 0 41.5 24.3 41.5 72.8.1 48.4-14.4 73.6-41.5 73.6z"/><path d="M196.1 174.6c0-15.1-7.9-25-20.6-25-12.8 0-20.8 9.9-20.8 25.1 0 15.1 7.8 25.1 20.8 25.1 12.8 0 20.6-10.1 20.6-25.2zm-20.6 14.7c-5.1 0-7.1-5.5-7.1-14.7 0-8.9 2-14.3 7.1-14.3 4.9 0 6.9 5.3 6.9 14.4 0 9-2 14.6-6.9 14.6z"/>\n</g>\n<g id="noDraw" fill-rule="evenodd">\n<path d="M182.848 93.73c7.375 0 14.53.915 21.382 2.602l30.485-30.621c4.117-4.137 4.05-10.621.031-14.66l-37.02-37.184c-4.054-4.074-10.55-4.027-14.59.031l-16.464 17.649 36.11 36.27h-30.954L151.2 47.09 10.832 186.984v51.813H62.41l34.016-34.168a89.169 89.169 0 0 1-2.696-21.781c0-49.215 39.899-89.118 89.118-89.118m35.199 111.528-12.79 12.793-23.445-23.992-24.023 24.023-12.246-12.246 24.023-24.024-24.023-24.023 12.246-12.246 24.024 24.023 24.019-24.023 12.246 12.246-24.02 24.024Zm-36.234-90.801c-37.2 0-67.356 30.156-67.356 67.356 0 37.199 30.156 67.355 67.356 67.355 37.199 0 67.355-30.156 67.355-67.356 0-37.199-30.156-67.355-67.356-67.355Zm0 0"/>\n</g>\n<g id="noclient" fill-rule="evenodd">\n<path d="M140.17 198.89h30l20-20h-50v20z"/><path d="M176.18 122.74 70 228.89h170.2v-20a90 90 0 0 0-64.02-86.15Zm-6 76.15h-30v-20h50ZM20 249.14 229.94 39.42V9.3l-40.6 40.59a50 50 0 1 0-58.18 58.18l-13.39 13.39h-9a90 90 0 0 0-68 77L20 219.24v29.9Z"/>\n</g>\n<g id="nurseryroom" fill-rule="evenodd">\n<path d="M178 98H82a12 12 0 0 0-12 12v30h50l-20 20H70v20h50l-20 20H70v44a6 6 0 0 0 6 6h108a6 6 0 0 0 6-6V110a12 12 0 0 0-12-12ZM90 80h80a10 10 0 0 0 0-20h-.25c-1.85-18.77-13.94-34.06-29.86-38.61A9.92 9.92 0 0 0 140 20V10a10 10 0 0 0-20 0v10a9.92 9.92 0 0 0 .11 1.39C104.19 25.94 92.1 41.23 90.25 60H90a10 10 0 0 0 0 20Z"/>\n</g>\n<g id="officialrates" fill-rule="evenodd">\n<path d="M170 41a90 90 0 1 0 90 90 90 90 0 0 0-90-90Zm6.6 73.9-12.9 12.9h-25.6c-.1 1.1-.2 2.1-.2 3.2s.1 2.2.2 3.2h38.4l-12.9 12.9h-21.4a32.08 32.08 0 0 0 50.5 6.7l9.1 9.1a45 45 0 0 1-76.8-31.8c0-1.1.1-2.2.1-3.2h-.1l.1-.1a45 45 0 0 1 76.7-28.4l-9.1 9.1a32.08 32.08 0 0 0-50.5 6.7h34.4Z"/><path d="M95 208.1v-11a108.51 108.51 0 0 1-10-13.4v25A95.13 95.13 0 0 1 51.6 166h24.7c-1.2-3.3-2.3-6.6-3.2-10H48.3a96 96 0 0 1-3.3-24.6 93.82 93.82 0 0 1 3.5-25.4h24.6a89.39 89.39 0 0 1 3.2-10H51.9A95.65 95.65 0 0 1 85 54.1v24.2a95.3 95.3 0 0 1 10-13.4V53.6c2.1 1.5 4.2 3.1 6.2 4.8a96.84 96.84 0 0 1 16.9-12.9A92.64 92.64 0 0 0 95 41.1h-.9c-.7 0-1.4-.1-2.1-.1h-5.2a10.87 10.87 0 0 0-1.8.1 90 90 0 0 0 0 179.8h.4c.9 0 1.8.1 2.7.1H92a7.57 7.57 0 0 0 1.5-.1 5.7 5.7 0 0 0 1.3-.1 88.34 88.34 0 0 0 23.1-4.4 98.11 98.11 0 0 1-17-13 45.07 45.07 0 0 1-5.9 4.7ZM69.7 53.6A105.44 105.44 0 0 0 41.2 96H18.1a80.44 80.44 0 0 1 51.6-42.4ZM10 131a79.81 79.81 0 0 1 4-25h24.1a102.2 102.2 0 0 0-3.2 25.4 101 101 0 0 0 3 24.6H14a79.81 79.81 0 0 1-4-25Zm8.1 35H41a104.2 104.2 0 0 0 27.5 42 80.2 80.2 0 0 1-50.4-42Z"/>\n</g>\n<g id="on" fill-rule="evenodd">\n<path d="M194.74 66.47a90 90 0 1 1-127.69.21L45.84 45.46A120 120 0 1 0 216 45.25Z"/><path d="M116 10v104.56l28-28.29V10h-28z"/>\n</g>\n<g id="oneclick" fill-rule="evenodd">\n<path d="M130.23 10a120 120 0 1 0 120 120 120 120 0 0 0-120-120Zm0 220a100 100 0 1 1 100-100 100 100 0 0 1-100 100Z"/><path d="M130.23 60a70 70 0 1 0 70 70 70 70 0 0 0-70-70Zm0 120a50 50 0 1 1 50-50 50 50 0 0 1-50 50Z"/>\n</g>\n<g id="openoutside" fill-rule="evenodd">\n<path d="M228.77 21h-196a12 12 0 0 0-12 12v196a12 12 0 0 0 12 12h196a12 12 0 0 0 12-12V33a12 12 0 0 0-12-12Zm-57.53 135.93.09-53L96 180H67l90.39-90.31-54 .07V69.58l87.9.07.07 87.28Z"/>\n</g>\n<g id="outgoingcall" fill-rule="evenodd">\n<path d="m228 218.8-50.8-42.6c-2.5-2.1-6.5-2-8.9.4l-7.4 7.4-1.5 1.5-15.3 15.3c-18.7-6.8-36.9-18.3-51.8-33.1-15.3-15.3-26.4-33.1-33.1-51.8l15.3-15.3 1.5-1.5 7.4-7.4c2.3-2.3 2.4-6.4.3-8.9L41.2 32c-2.1-2.5-5.7-2.7-8.1-.3L14 50.8c-.4.4-.9.7-1.1 1.1l-2.3 2.3-.1-.1h-.2c-3 51 14.9 102.9 53.8 141.8 38.9 38.9 90.8 56.8 141.8 53.8l-.1-.2 2.3-2.3 1.1-1.1 19.1-19.1c2.4-2.4 2.2-6-.3-8.2zM200 110h-50l-30-30h80V50l50 45-50 45z"/>\n</g>\n<g id="pacifier" fill-rule="evenodd">\n<path d="M101.52 135.92c-2.28-2.28-6.23-3.05-8.51-.78-19.74 19.74-37.16 6.34-58.76 27.93A44.51 44.51 0 0 0 97.2 226c21.59-21.59 8.19-39 27.93-58.76 2.28-2.28 1.5-6.23-.78-8.51Zm121.57-20.05a55.64 55.64 0 1 0-91.14-19L120.81 108 80.67 67.86a10 10 0 0 0-14.14 0l-1.59 1.59a10 10 0 0 0 0 14.14l111.74 111.76a10 10 0 0 0 14.14 0l1.59-1.59a10 10 0 0 0 0-14.14l-40.14-40.14 11.15-11.15a55.64 55.64 0 0 0 59.67-12.46Zm-62.94-62.95a33.38 33.38 0 1 1 0 47.21 33.38 33.38 0 0 1 0-47.21Z"/>\n</g>\n<g id="paddle" fill-rule="evenodd">\n<path d="M223 166.4c36.1-36.2 36.7-94.3 1.2-129.8s-93.5-35-129.6 1.1C80.4 52 72.1 72.7 68.7 94.1c0 0-12 90.1-18.6 96.8L10 229.4l21.2 21.2s39.6-38 39.9-38.3c6.9-6.9 95.3-19.7 95.5-19.8 21.4-3.4 42.2-11.8 56.4-26.1zM217 93c3.9 3.9 3.9 10.2 0 14.1s-10.2 3.9-14.1 0-3.9-10.2 0-14.1c3.9-3.9 10.2-3.9 14.1 0zm-24.1-24.1c3.9 3.9 3.9 10.2 0 14.1s-10.2 3.9-14.1 0-3.9-10.2 0-14.1c3.8-3.9 10.2-3.9 14.1 0zm-49.1 63.2c-3.9 3.9-10.2 3.9-14.1 0-3.9-3.9-3.9-10.2 0-14.1 3.9-3.9 10.2-3.9 14.1 0 3.9 3.9 3.9 10.2 0 14.1zm24.9-87.4c3.9 3.9 3.9 10.2 0 14.1s-10.2 3.9-14.1 0-3.9-10.2 0-14.1c3.9-3.9 10.2-3.9 14.1 0zm-50.6 12.5c3.9-3.9 10.2-3.9 14.1 0s3.9 10.2 0 14.1-10.2 3.9-14.1 0c-3.9-3.8-3.9-10.1 0-14.1zM105.5 108c-3.9-3.9-3.9-10.2 0-14.1s10.2-3.9 14.1 0 3.9 10.2 0 14.1c-3.9 3.9-10.2 3.9-14.1 0zm36.7-26.6c3.9-3.9 10.2-3.9 14.1 0s3.9 10.2 0 14.1-10.2 3.9-14.1 0c-3.9-3.9-3.9-10.2 0-14.1zm-63 100.8 6.5-39.5 33 33-39.5 6.5zm87.1-62.6c-3.9-3.9-3.9-10.2 0-14.1s10.2-3.9 14.1 0 3.9 10.2 0 14.1c-3.9 3.9-10.2 3.9-14.1 0 0-.1 0-.1 0 0zm-12.5 36.7c-3.9-3.9-3.9-10.2 0-14.1s10.2-3.9 14.1 0 3.9 10.2 0 14.1c-3.9 3.9-10.2 3.9-14.1 0zm36.6-12.6c-3.9-3.9-3.9-10.2 0-14.1 3.9-3.9 10.2-3.9 14.1 0 3.9 3.9 3.9 10.2 0 14.1-3.9 3.9-10.2 3.9-14.1 0 0-.1 0-.1 0 0z"/>\n</g>\n<g id="partner" fill-rule="evenodd">\n<path d="M164.4 76.4h-13.3v26.2h13.3c12.1 0 16.7-4.7 16.7-13.2 0-8.3-4.4-13-16.7-13zm-29.7 133.4c-28.6 18.1-66.4 9.6-84.6-19-12.7-20-12.7-45.6 0-65.6-3.1-13.8-3.6-28.1-1.5-42.1C7.3 112.6-2.3 170 27.1 211.3s86.8 51 128.2 21.5c8.3-5.9 15.6-13.2 21.6-21.6-14.1 2.3-28.4 1.8-42.2-1.4z"/><path d="M223.1 36.9C187.2 1 129 1 93.1 36.9s-35.9 94.1 0 130c35.9 35.9 94.1 35.9 130 0 35.9-35.9 35.9-94.1 0-130zm-59.4 80.8h-12.6v31.6h-19.4V60.4H164c19 0 36.2 5 36.2 28.4 0 23.9-18.7 28.9-36.5 28.9z"/>\n</g>\n<g id="pastafactory" fill-rule="evenodd">\n<path d="M170.33 80.82V40.18l-80 40.64V40.18l-80 40.64v120h19.82v-43a6.55 6.55 0 0 1 6.55-6.55h26.54a6.55 6.55 0 0 1 6.55 6.55v43h180.54V40.18ZM199.24 131H170v-19.36h49.45Zm-69 0H100v-19.36h50.45Z"/>\n</g>\n<g id="pause" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm0 220a100 100 0 1 1 100-100 100 100 0 0 1-100 100Z"/><path d="M90 80h30v100H90zm50 0h30v100h-30z"/>\n</g>\n<g id="pdf" fill-rule="evenodd">\n<path d="M160 10H46.37A6.33 6.33 0 0 0 40 16.28v227.45a6.32 6.32 0 0 0 6.38 6.27h167.24a6.31 6.31 0 0 0 6.38-6.26V70ZM79.95 143H74v17H60v-53h19.95c11.38 0 23 2.23 23 18s-12.56 18-23 18Zm46.87 17H109v-53h17.82c15.84 0 29.31 5.91 29.31 26.14 0 20.95-13.68 26.86-29.31 26.86ZM200 119h-22v10h15v12h-15v19h-15v-53h37Z"/><path d="M80.45 118H74v14h6.45c6.7 0 8.5-3 8.5-7s-1.8-7-8.5-7Zm47.02 1H124v29h3.61c10.87 0 14.11-4.1 14.11-14.9.01-9.86-3.31-14.1-14.25-14.1Z"/>\n</g>\n<g id="pets" fill-rule="evenodd">\n<path d="M44.88 143.62c13.74 0 24.88-15.3 24.88-34.16S58.62 75.3 44.88 75.3 20 90.59 20 109.46s11.14 34.16 24.88 34.16ZM94.1 88.33c13.74 0 24.9-15.33 24.9-34.17S107.84 20 94.1 20 69.23 35.3 69.23 54.16 80.37 88.33 94.1 88.33Zm121 55.3c13.74 0 24.88-15.3 24.88-34.16S228.86 75.3 215.12 75.3s-24.88 15.3-24.88 34.16 11.14 34.16 24.88 34.16Zm-50.25-55.3c13.74 0 24.88-15.3 24.88-34.16S178.61 20 164.87 20 140 35.3 140 54.16s11.14 34.16 24.88 34.16Zm-35 141.28c46 0 83.21 31.28 83.21-14.71s-37.25-104.52-83.21-104.52S46.68 168.9 46.68 214.9s37.25 14.71 83.21 14.71Zm0 0"/>\n</g>\n<g id="phishing" fill-rule="evenodd">\n<path d="M260 80h-30.9c-19-41.3-60.7-70-109.1-70C53.7 10 0 63.8 0 130s53.7 120 120 120c59.5 0 108.8-43.2 118.3-100H260V80zM120 30c37 0 69.3 20.1 86.6 50H33.4C50.7 50.1 83 30 120 30zm60 76v20h-30l-10-20h40zm-60 124c-48.4 0-88.7-34.4-98-80h196c-9.3 45.7-49.6 80-98 80zM90 105.6v20H60l-10-20h40z"/><path d="M80 180h70v20H80z"/>\n</g>\n<g id="photologin" fill-rule="evenodd">\n<path d="M30 30h30V10H10v50h20V30zm0 170H10v50h50v-20H30v-30zm200 30h-30v20h50v-50h-20v30zM200 10v20h30v30h20V10h-50zM50.5 210h160v-16a72 72 0 0 0-54.9-69.94 56 56 0 0 1-50.21 0A72 72 0 0 0 50.5 194Zm79-50h50l-20 20h-30Z"/><circle cx="130.5" cy="75" r="35"/>\n</g>\n<g id="physiotherapy" fill-rule="evenodd">\n<path d="M194.5 129.8c-35.9 0-65 29.1-65 65s29.1 65 65 65 65-29.1 65-65-29.1-65-65-65zm35.2 59.6c0 21.5-35.2 43-35.2 43s-35.2-21.5-35.2-43v-2.7c0-10.4 7.9-18.8 17.6-18.8 8.9 0 16.2 7 17.4 16.1h.4c1.2-9.1 8.6-16.1 17.4-16.1 9.7 0 17.6 8.4 17.6 18.8v2.7zM84 109.8c.4-.7 16-8.9 16-8.9l-11.9 49.3 23.5 26.2c3.6-16 11.8-30.6 23.5-42.1l2.9-12 3.4 6.5c7.8-6.3 16.7-11.1 26.2-14.3l-13.9-42s-6.7 2.3-7.7 2.6c-5.3 1.2-10.9 1.5-16.3.8-4.5-.6-8.8-2-12.7-4.2-1.8-1-8.4-6-8.4-6L70.6 85 38 124.6l22.4 17.2 23.6-32z"/><ellipse class="st1" cx="133.6" cy="37.1" rx="26.9" ry="27.1"/><path d="m87.3 169-4.1-4.5-2.2 5.7-13.4 35.3-33.1 38.1L29 250h38.7l1.1-1.2 26.6-28 .4-.5.3-.6 11.4-25.7 1-2.3-1.7-1.9z"/>\n</g>\n<g id="pic" fill-rule="evenodd">\n<path d="m240 219-57-57a90 90 0 1 0-21 21l57 57ZM39 110a70 70 0 1 1 70 70 70 70 0 0 1-70-70Z"/><path d="M125 116a35 35 0 0 1-31 0 45 45 0 0 0-32 30 60 60 0 0 0 96 0 45 45 0 0 0-33-30Z"/><circle cx="109" cy="85" r="25"/>\n</g>\n<g id="pinpadconnect" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10ZM94 196H64v-30h30Zm0-51H64v-30h30Zm0-51H64V64h30Zm51 102h-30v-30h30Zm0-51h-30v-30h30Zm0-51h-30V64h30Zm51 102h-30v-30h30Zm0-51h-30v-30h30Zm0-51h-30V64h30Z"/>\n</g>\n<g id="pinpaddisconnected" fill-rule="evenodd">\n<path d="M228.52 61.48 175 115h21v30h-30v-21l-42 42h21v30h-30v-21l-53.52 53.52a120 120 0 0 0 167-167ZM196 196h-30v-30h30ZM94 166l21-21 30-30 21-21 64-64V0l-31.48 31.48a120 120 0 0 0-167 167L10 220v30Zm21-102h30v21l-9 9h-21Zm-51 0h30v30H64Zm0 51h30v21l-9 9H64Z"/>\n</g>\n<g id="pinterest" fill-rule="evenodd">\n<path d="M129.8 10a120 120 0 1 0 120 120 120 120 0 0 0-120-120Zm9.75 153.79c-9.13-.71-13-5.23-20.13-9.58-3.94 20.65-8.75 40.45-23 50.79-4.4-31.21 6.46-54.65 11.5-79.54C99.33 111 109 81.87 127.09 89c22.31 8.83-19.32 53.8 8.62 59.42 29.18 5.86 41.09-50.63 23-69-26.14-26.53-76.1-.6-70 37.37 1.49 9.29 11.09 12.1 3.83 24.92-16.68-3.71-21.68-16.86-21.04-34.46 1-28.8 25.87-49 50.79-51.75 31.51-3.5 61.08 11.57 65.17 41.21 4.6 33.46-14.22 69.69-47.92 67.08Z"/>\n</g>\n<g id="pinterest2" fill-rule="evenodd">\n<path d="M113.58 172.12c-6 31.66-13.42 62-35.28 77.88-6.75-47.86 9.91-83.8 17.64-122-13.18-22.19 1.59-66.84 29.4-55.84 34.22 13.54-29.64 82.49 13.23 91.1 44.76 9 63-77.63 35.28-105.8-40.1-40.67-116.73-.93-107.31 57.31 2.29 14.24 17 18.56 5.88 38.21-25.66-5.69-33.33-25.92-32.34-52.9C41.67 56 79.77 25 118 20.77c48.33-5.41 93.69 17.74 100 63.18 7.05 51.3-21.81 106.86-73.5 102.86-14.06-1.08-19.94-8.02-30.92-14.69Z"/>\n</g>\n<g id="place" fill-rule="evenodd">\n<path d="M130 10C74.8 10 30 54.8 30 110v3c2 88.3 91.6 144.7 91.6 144.7 4.6 3.1 12 3.1 16.5.1 0 0 89.8-56.5 91.8-144.8v-3c0-55.2-44.7-100-99.9-100zm0 150c-27.6 0-50-22.4-50-50s22.4-50 50-50 50 22.4 50 50-22.4 50-50 50z"/>\n</g>\n<g id="play" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm-23 174V76l72 54Z"/>\n</g>\n<g id="plin-icon" fill-rule="evenodd">\n<path d="M129.5 62.2h-2.4a68.37 68.37 0 0 0-65.7 70.6 66.85 66.85 0 0 0 3.1 18.3 46 46 0 0 1 2.3 13.4 49.58 49.58 0 0 1-2.6 17.5 12.61 12.61 0 0 0-.7 4.1 10.66 10.66 0 0 0 3.2 7.3 10.91 10.91 0 0 0 7.3 3.2 9.48 9.48 0 0 0 3.8-.5 43.68 43.68 0 0 1 16.1-3h1.7a46.51 46.51 0 0 1 12.9 2.2 68.79 68.79 0 0 0 18.7 3.3 68.07 68.07 0 0 0 70.5-65.9v-2.3a68.28 68.28 0 0 0-68.2-68.2Zm-31.2 89c-2.3 0-4.4-.9-5.4-.9-1.4 0-3.1.9-3.1 3.5v7.5a3.8 3.8 0 0 1-3.8 3.8h-1.5a3.8 3.8 0 0 1-3.8-3.8v-39.6c0-3.1 2.1-4 3.6-4 2.6 0 3.7.7 5.7.7 3.4 0 4.5-1.5 9-1.5 9.9 0 14.9 6.5 15 17.7 0 8.2-3.5 16.6-15.7 16.6Zm30.7-4a3.84 3.84 0 0 1-3.9 3.9h-1.2a3.84 3.84 0 0 1-3.9-3.9v-37.5a3.9 3.9 0 0 1 3.9-3.9h1.2a3.84 3.84 0 0 1 3.9 3.9Zm11.6-40.4a4.5 4.5 0 1 1-4.5 4.5 4.48 4.48 0 0 1 4.5-4.5Zm4.6 40.3a4.06 4.06 0 0 1-3.9 4H140a3.9 3.9 0 0 1-3.9-3.9v-25.4a3.84 3.84 0 0 1 3.9-3.9h1.3a3.9 3.9 0 0 1 3.9 3.9Zm34.2-14.5v14.6a3.78 3.78 0 0 1-3.7 3.8h-1.4a3.78 3.78 0 0 1-3.7-3.8v-18.8c0-4.1-2.2-6.1-5.2-6.1s-5.2 2.3-5.2 6.1v18.8a3.71 3.71 0 0 1-3.7 3.8H155a3.78 3.78 0 0 1-3.7-3.8v-25.4c0-2.6 2.1-4.1 4.5-4.1 3 0 3.6.6 5.5.6 3.7 0 5-1.5 8.5-1.5 7.3 0 9.4 4.5 9.6 8.6Z"/><path d="M129.5 10.5a120 120 0 1 0 120 120 120 120 0 0 0-120-120Zm75.1 122.6a74.9 74.9 0 0 1-75 72.4H127a75.57 75.57 0 0 1-20.1-3.4 40.4 40.4 0 0 0-11.6-2 44.72 44.72 0 0 0-15 2.2 17.48 17.48 0 0 1-23.4-16 16.38 16.38 0 0 1 .9-6.2 41.22 41.22 0 0 0 2.3-15.4 41 41 0 0 0-1.9-11.1A75.05 75.05 0 0 1 127 55.5c.9 0 1.7-.1 2.6-.1a75.11 75.11 0 0 1 75 75Z"/><ellipse class="cls-1" cx="97.1" cy="134.1" rx="8" ry="11.7"/>\n</g>\n<g id="plin-simple" fill-rule="evenodd">\n<path d="M73.09 230.45h2.72A74.29 74.29 0 0 1 96.44 234a110.06 110.06 0 0 0 29.92 5.28 108.88 108.88 0 0 0 112.76-105.47v-3.68A109.24 109.24 0 0 0 130 21h-3.8C66.21 23.09 18.87 73.81 21 134a106 106 0 0 0 5.12 29.12 73.92 73.92 0 0 1 3.67 21.44 79.55 79.55 0 0 1-4.15 28 20.18 20.18 0 0 0-1.12 6.56 17.09 17.09 0 0 0 5.11 11.68 17.46 17.46 0 0 0 11.68 5.12 15.16 15.16 0 0 0 6.08-.8 73 73 0 0 1 25.75-4.64m57.1 19.68H126a120.77 120.77 0 0 1-32.15-5.44 64.64 64.64 0 0 0-18.56-3.2 71.5 71.5 0 0 0-24 3.52 28.2 28.2 0 0 1-29.27-6.56 27.6 27.6 0 0 1-8.16-19 26.21 26.21 0 0 1 1.44-9.92 66 66 0 0 0 3.7-24.71 65.58 65.58 0 0 0-3-17.76 119.21 119.21 0 0 1-5.92-32.8c-2.25-66.08 49.58-121.76 115.8-124a37.49 37.49 0 0 1 4.15-.16 120.16 120.16 0 0 1 120 120v4.32a119.44 119.44 0 0 1-119.84 115.68"/><path d="M148.75 163.09h-2.08a6.25 6.25 0 0 1-6.24-6.24v-40.48a6.15 6.15 0 0 1 6.24-6.24h2.08a6.25 6.25 0 0 1 6.24 6.24v40.48a6.15 6.15 0 0 1-6.24 6.24M123 163.09h-1.92a6.15 6.15 0 0 1-6.24-6.24v-60a6.25 6.25 0 0 1 6.24-6.24H123a6.15 6.15 0 0 1 6.24 6.24v60a6.25 6.25 0 0 1-6.24 6.24M155 99.57a7.2 7.2 0 1 1-7.2-7.2 7.17 7.17 0 0 1 7.2 7.2M209.69 133.65v-11.52c-.32-6.56-3.68-13.76-15.35-13.76-5.6 0-7.68 2.4-13.6 2.4-3 0-4-1-8.8-1-3.84 0-7.2 2.4-7.2 6.56V157a6 6 0 0 0 5.92 6.08h2.4A5.94 5.94 0 0 0 179 157v-30.07c0-6.08 3.52-9.76 8.32-9.76 4.8 0 8.32 3.2 8.32 9.76V157a6 6 0 0 0 5.91 6.08h2.24a6 6 0 0 0 5.92-6.08v-23.35M91 136.05c0 10.4-4.48 18.72-12.8 18.72s-12.8-8.32-12.8-18.72 5-18.72 12.8-18.72c7.68 0 12.8 8.32 12.8 18.72m-9.92-27.68c-7.2 0-9 2.4-14.4 2.4-3.2 0-5-1.12-9.11-1.12-2.4 0-5.76 1.44-5.76 6.4v63.36a6.08 6.08 0 0 0 6.08 6.08h2.4a6.08 6.08 0 0 0 6.07-6.08v-12c0-4.16 2.72-5.6 5-5.6 1.6 0 5 1.44 8.64 1.44 19.51 0 25.11-13.44 25.11-26.56 0-17.92-8-28.32-24-28.32"/>\n</g>\n<g id="plusmenu" fill-rule="evenodd">\n<path d="M210.8 142.9h16.5v81.4h-16.5z"/><path d="m185.1 175.3-6.7 16.6h81.3v-16.6zM9.5 169.9v25h123.7l9.6-25zm.2-55.1v25H158l9.6-25zm.2-55.1v25h173.9l8.6-22.5.9-2.5z"/>\n</g>\n<g id="point" fill-rule="evenodd">\n<path d="M130.15 220.46 99.91 250v-87.2A79.33 79.33 0 0 1 50 89.3C50 45.5 85.82 10 130 10s80 35.5 80 79.3a79.33 79.33 0 0 1-49.6 73.38V250l-30.25-29.54m.69-102.25a31.67 31.67 0 1 1 32-31.67 31.83 31.83 0 0 1-32 31.67Z"/>\n</g>\n<g id="post-mail" fill-rule="evenodd">\n<path d="M244 40H16c-3.3 0-6 2.7-6 6v168c0 3.3 2.7 6 6 6h228c3.3 0 6-2.7 6-6V46c0-3.3-2.7-6-6-6zM70 160H30v-20h60l-20 20zm40 40H30v-20h100l-20 20zm120-80h-60V60h60v60z"/>\n</g>\n<g id="press" fill-rule="evenodd">\n<path d="M59.93 20.19v60h-40v148a12 12 0 0 0 12 12h196a12 12 0 0 0 12-12v-208Zm0 190a10 10 0 0 1-20 0v-110h20Zm20-150h60v60h-60Zm140 140h-140v-20h140Zm0-40h-140v-20h140Zm0-40h-60v-20h60Zm0-40h-60v-20h60Z"/>\n</g>\n<g id="previousapointment" fill-rule="evenodd">\n<path d="M90.07 191.14V171h19.67a88.13 88.13 0 0 1 60.39-69.34V90.54h20v7.39c2-.14 4-.21 6-.21a87 87 0 0 1 34 6.87V28.83c0-5.4-3.49-8.71-9-8.71h-21V0h-20v20.12H60V0H40v20.12H21c-5.63 0-11 3.2-11 8.71v181.24c0 5.4 5.49 11.25 11 11.25h94.85a88 88 0 0 1-7.23-30.18Zm20-40.24h-20v-20.12h20Zm0-40.24h-20V90.54h20Zm40 0h-20V90.54h20ZM40 50.3h161.16l-20 20.12H40Zm30 140.84H50V171h20Zm0-40.24H50v-20.12h20Z"/><path d="M229.6 129.28a64.75 64.75 0 0 0-81.6 10.13 65.57 65.57 0 0 0-18.07 45.2c0 1.81.09 3.6.24 5.37a65.06 65.06 0 1 0 99.47-60.7ZM189.52 141l10.84 10.9v27.25h27.11l-10.84 10.9h-27.11Z"/>\n</g>\n<g id="print" fill-rule="evenodd">\n<path d="M220.23 70V20a10 10 0 0 0-9.93-10H50.17a10 10 0 0 0-9.93 10v50h-30v110a10.06 10.06 0 0 0 10 10h20v50a10 10 0 0 0 9.93 10H210.3a10 10 0 0 0 9.93-10v-50h20a10 10 0 0 0 10-10V70Zm-160-40h140v40h-140Zm140 200h-140v-60h140Zm10-110h-30v-20h50Zm-50 70h-80v20h60Z"/>\n</g>\n<g id="privacyanddata" fill-rule="evenodd">\n<path d="M102.2 98.3c4.3 4.2 11.2 4.2 15.5 0l23.8-23.5c4.7-4.6 12.2-4.6 16.9.1l75.8 75.8c3.6-14.7 5.7-31.4 5.7-50.7V30c0-5.4-4.5-10-10-10h-65.3l-62.5 62.5c-4.3 4.4-4.3 11.4.1 15.8z"/><path d="M98.9 198.4c3.9-3.9 10.2-3.9 14.1 0l39.6 39.6c2.9 2.9 7.4 3.7 11.1 2l.2-.1c6.3-2.9 7.7-11.1 2.8-16l-39.6-39.6c-3.9-3.9-3.9-10.2 0-14.1 3.9-3.9 10.2-3.9 14.1 0l44.5 44.5c3.9 3.9 10.3 3.9 14.1-.1l.1-.1c3.8-3.8 3.7-10-.1-13.8l-44.6-44.6c-3.9-3.9-3.9-10.2 0-14.1 3.9-3.9 10.2-3.9 14.1 0l39.5 39.5c4.8 4.8 12.8 3.3 15.6-2.8l.1-.2c1.7-3.7.9-8-1.9-10.9l-64.5-64.5c-4.7-4.7-12.2-4.7-16.9-.1l-9.7 9.5c-12.1 11.9-31.5 11.9-43.6.1-12.3-12.1-12.4-32-.2-44.2L136.2 20H30c-5.6 0-10 4.5-10 10v70c0 140 110.1 150 110.1 150 2.3-.2 3.3-3 1.7-4.7L99 212.5c-4-3.9-4-10.2-.1-14.1z"/>\n</g>\n<g id="productportfolio" fill-rule="evenodd">\n<path d="M240 60h-50V30a10 10 0 0 0-10-10H80a10.07 10.07 0 0 0-10 10v30H20a10 10 0 0 0-10 9.93v160.14A10 10 0 0 0 20 240h220a10 10 0 0 0 10-9.93V69.93A10 10 0 0 0 240 60Zm-130 60H50v-20h80Zm60-60H90V40h80Z"/>\n</g>\n<g id="promotion" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm42.37 179.44-41.56-25.3-41.56 25.3 11-47.69-36.68-32.08 48.35-4.14 18.9-45 18.9 45 48.35 4.14-36.72 32.09Z"/>\n</g>\n<g id="qr" fill-rule="evenodd">\n<path d="M50 80h30V50H50v30zM10 250h110V140H10v110zm20-90h70v70H30v-70zm20 50h30v-30H50v30zm110-70h-20v20h20v-20zM140 10v110h110V10H140zm90 90h-70V30h70v70zm20 40h-70v20h70v-20zM10 120h110V10H10v110zm20-90h70v70H30V30zm180 20h-30v30h30V50zm20 200h20v-70h-20v70zm-50-40h30v-30h-30v30zm-20-30h-20v70h70v-20h-50v-50z"/>\n</g>\n<g id="quizz" fill-rule="evenodd">\n<path d="M254 110h-24v66c-.5 13.4-11.6 24-25 24H100v22c0 4 3 8 7 8h123l30 30V117c.6-3.3-1.6-6.4-4.8-7H254z"/><path d="M200 20H9c-5 0-9 4-9 9v191l37-38h163c5 0 10-2 10-7V29c0-5-5-9-10-9zm-97 130c-8 0-12-5-12-11s4-11 12-11 13 5 13 11-5 11-13 11zm21-53c-12 6-12 9-12 22H94c-.5-3-.8-6-1-9 0-10 6-16 14-20s10-7 10-13-4-9-12-9-17 5-22 11L71 66c7-9 20-16 37-16s31 10 31 24-7 18-15 23z"/>\n</g>\n<g id="quotemark" fill-rule="evenodd">\n<path d="M110 40H60l-50 80v110h110V120H60l50-80zm80 80 50-80h-50l-50 80v110h110V120h-60z"/>\n</g>\n<g id="ray" fill-rule="evenodd">\n<path d="M213.72 96.42H162.6l38.08-78.35a5.59 5.59 0 0 0-3.16-7.59A7.75 7.75 0 0 0 195 10h-76.89a12.79 12.79 0 0 0-11.46 6.63L40.59 145.88a5.59 5.59 0 0 0 3 7.68 6.42 6.42 0 0 0 2.63.58h74.47L101 243.44a5.51 5.51 0 0 0 4.73 6.44 6.16 6.16 0 0 0 6.1-2.31l107.04-142.21a5.4 5.4 0 0 0-1.58-8 7.54 7.54 0 0 0-3.57-.94Z"/>\n</g>\n<g id="reademail" fill-rule="evenodd">\n<path d="M138.06 12.51a14.2 14.2 0 0 0-16.12 0L10 100v139.93A10 10 0 0 0 20 250h220a10 10 0 0 0 10-10.07V100Zm-.21 181.21a13.19 13.19 0 0 1-15.69 0L30 120a10 10 0 0 1 9.92-10h180.16a10 10 0 0 1 9.92 10Z"/>\n</g>\n<g id="receiptok" fill-rule="evenodd">\n<path d="M210.07 10H200l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10H90V10H80L70 20H60V10H49.93C44.45 10 40 14 40 19.51v220C40 245 44.45 250 49.93 250H60l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10.07c5.48 0 9.93-5 9.93-10.51v-220c0-5.49-4.45-9.49-9.93-9.49Zm-89.6 157.31-15.22 15.22-42.43-42.42L77 126l28.28 28.28L183 76.47l14.14 14.14Z"/>\n</g>\n<g id="receive-money-dollar" fill-rule="evenodd">\n<path d="M230 130h-40v30l-40-40 40-40v30h60l-20 20z"/><path d="M160 150v60H40V30h120v60l20-20V20a10 10 0 0 0-10-10H30a10 10 0 0 0-10 10v220a10 10 0 0 0 10 10h140a10 10 0 0 0 10-10v-70Zm-60 90a10 10 0 1 1 10-10 10 10 0 0 1-10 10Z"/><path d="M99 156.1c-9.77 0-19.55-4.34-27.15-8.68l-2.16 16.28a64 64 0 0 0 21.72 6.51v10.85l19.59 9.77v-20.62c13-3.26 21.73-13 21.73-27.13 0-15.2-7.61-21.71-27.16-30.39-13-5.43-16.29-8.68-16.29-15.19 0-5.43 4.34-10.86 13-10.86 7.61 0 15.21 3.26 22.81 7.6l1.09-17.36c-5.43-2.17-9.78-4.35-16.29-5.43V60.6l-19.57-9.77v21.7c-11.94 3.26-19.55 13-19.55 26.05 0 15.19 7.61 21.71 26.07 29.3 14.12 6.52 17.38 8.69 17.38 16.28-1.09 7.6-6.52 11.94-15.22 11.94Z"/>\n</g>\n<g id="receive-money-euro" fill-rule="evenodd">\n<path d="M230 130h-40v30l-40-40 40-40v30h60l-20 20z"/><path d="M160 150v60H40V30h120v60l20-20V20a10 10 0 0 0-10-10H30a10 10 0 0 0-10 10v220a10 10 0 0 0 10 10h140a10 10 0 0 0 10-10v-70Zm-60 90a10 10 0 1 1 10-10 10 10 0 0 1-10 10Z"/><path d="M107 166c12.4-.1 24.3-5.2 33-14l-9-9c-12.5 13.2-33.4 13.8-46.7 1.3-2.5-2.4-4.7-5.2-6.3-8.3h22l13-13H73v-6h27l13-13H78c8.7-16 28.7-22 44.7-13.3 3.1 1.7 5.9 3.8 8.3 6.3l9-9c-18.4-18.3-48.2-18.2-66.5.2-7.9 8-12.7 18.5-13.5 29.8v3c1.1 25.2 21.8 45 47 45z"/>\n</g>\n<g id="rent" fill-rule="evenodd">\n<path d="M254 61a6 6 0 0 0 6-6v-8.95a6 6 0 0 0-6-6H40.5v-14a6 6 0 0 0-6-6H26a6 6 0 0 0-6 6v14H6a6 6 0 0 0-6 6V55a6 6 0 0 0 6 6h14v179h20.5V61Z"/><path d="M59.9 76v117.86a6 6 0 0 0 6 6H254a6 6 0 0 0 6-6V76Zm80.1 84H80v-20h80Zm40-40H80v-20h120Z"/>\n</g>\n<g id="reply" fill-rule="evenodd">\n<path d="M115 89.53v-50l-105 90 105 90v-49.34a146.27 146.27 0 0 1 16.5-.68c50.69 0 95.69 22.34 124 60v-2c0-76.82-63.87-137.17-140.5-137.98Z"/>\n</g>\n<g id="restaurant" fill-rule="evenodd">\n<path d="m170.09 140-.3 110h29.75L200 10c-44.63 0-50.35 40-50.35 40v90M115 10v51.43L102 70V10H88v51.43L75 70V10H60v100h20v140h30V110h20V10h-15z"/>\n</g>\n<g id="retail" fill-rule="evenodd">\n<path d="M90.76 20H56.84a5.94 5.94 0 0 0-3 .8V20L20 52l29.83 27.19V234c-2.45 3.32.23 6 3.53 6h152.36c3.31 0 3.45-2.69 3.45-6V78.31L240 52l-30.65-29a6 6 0 0 0-2.54-2.4l-.66-.62v.34a6 6 0 0 0-2-.34h-34.91L130 52 90.76 20ZM125 94h65v.87L171 114h-46Z"/>\n</g>\n<g id="retirement" fill-rule="evenodd">\n<path d="m250 0-59 59H60v20l79 80v81h-39v20h100v-20h-38v-81l78-80V59h-20.72L250 28.28Zm-60 99h-80L90 79h120Z"/><path d="M45 0a45 45 0 0 0-5 89.72V40h49.72A45 45 0 0 0 45 0Z"/>\n</g>\n<g id="return" fill-rule="evenodd">\n<path d="M130 10a119.82 119.82 0 0 0-97.15 49.58L10 40v80l70-20-24.28-20.81a90 90 0 1 1-11.12 79.28L16.13 168A120 120 0 1 0 130 10Z"/>\n</g>\n<g id="return-12" fill-rule="evenodd">\n<path d="m67.45 144.38 56.59 56.46L102.91 222 10.9 129.67 102.24 38l21.16 21.16-55.55 55.45 183.05.02-28.85 29.75H67.45z"/>\n</g>\n<g id="return-15" fill-rule="evenodd">\n<path d="M228 20H32a12 12 0 0 0-12 12v196a12 12 0 0 0 12 12h196a12 12 0 0 0 12-12V32a12 12 0 0 0-12-12Zm-57.53 135.93.09-53L95.28 179h-29l90.39-90.31-54 .07V68.58l87.9.07.07 87.28Z"/>\n</g>\n<g id="retweet" fill-rule="evenodd">\n<path d="M220 131V51.5c0-.1-17.27-.16-39.39-.2L180 51v.3c-39.38-.06-93.66-.05-93.66-.05L120.5 91H180v40h-40l60 70 60-70Zm-80.48 40.17a.5.5 0 0 0-.38-.17H80v-40h40L60 61 0 131h40v80h132.57a.5.5 0 0 0 .38-.83Z"/>\n</g>\n<g id="rewards" fill-rule="evenodd">\n<path d="M30 70h89.42v50.54H30zm110.58 0H230v50.54h-89.42zm-11.2-10L170 10l40 30-48.79 30H97.87L50 40l40-30 39.7 50h-.32zM40 140h80v100H40zm100 0h80v100h-80z"/>\n</g>\n<g id="right" fill-rule="evenodd">\n<path d="M130.1 9.9c-66.3 0-120 53.7-120 120s53.7 120 120 120 120-53.7 120-120-53.7-120-120-120zm-9.5 157.8-15.2 15.2L63 140.5l14.1-14.1 28.3 28.3 77.8-77.8L197.3 91l-76.7 76.7z"/>\n</g>\n<g id="right-arrow" fill-rule="evenodd">\n<path d="M100 80v100l60-50z"/>\n</g>\n<g id="right-location" fill-rule="evenodd">\n<path d="M130.4 9.9c-55.2 0-100 44.8-100 100v3c2 88.3 91.6 144.7 91.6 144.7 4.6 3.1 12 3.1 16.5.1 0 0 89.8-56.5 91.8-144.8v-3c.1-55.2-44.7-100-99.9-100zm-19.2 150-46-46 14.1-14.1 31.8 31.8 65.1-65.1 14.1 14.1-79.1 79.3z"/>\n</g>\n<g id="safeforlater" fill-rule="evenodd">\n<path d="M167.93 20H27.27C24 20 20 21.19 20 24.5v208c0 3.32 4 7.5 7.26 7.5h208c3.32 0 4.73-4.19 4.73-7.5V91.83Zm-38.24 190L68 148.34l14.26-14.28 37.37 37.5L119.3 50 139 70v101.83l38.4-38.2 14.43 14.26Z"/>\n</g>\n<g id="sales" fill-rule="evenodd">\n<path d="M230.08 20h-94.67a14.06 14.06 0 0 0-8.57 3.58l-81.1 81.1 84.68 84.68h-29.89l-69.74-69.74-12.89 12.89a10 10 0 0 0 0 14.05l95.54 95.54a10 10 0 0 0 14.05 0l108.93-108.94a13.64 13.64 0 0 0 3.58-8.57V29.92a9.91 9.91 0 0 0-9.92-9.92Zm-49.85 79.69a19.92 19.92 0 1 1 19.92-19.92 19.92 19.92 0 0 1-19.92 19.92Z"/>\n</g>\n<g id="savings" fill-rule="evenodd">\n<circle cx="145.18" cy="45" r="35"/><path d="M240 130h-10.35c-4.12-23.53-17.44-44.13-36.36-58.38A55 55 0 0 1 91.87 58.56a93.72 93.72 0 0 0-4.1 1.77L61.84 40 61 78.05a94.46 94.46 0 0 0-22.71 32L38 110H22a12 12 0 0 0-12 12v36a12 12 0 0 0 12 12h12.4c6.92 24.44 24 45 46.6 57.36V244a6 6 0 0 0 6 6h18a6 6 0 0 0 6-6v-5.89a106.68 106.68 0 0 0 40 0V244a6 6 0 0 0 6 6h18a6 6 0 0 0 6-6v-16.64c28.61-15.63 48.25-44.27 49.89-77.36H240a10 10 0 0 0 0-20Zm-154 0a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/>\n</g>\n<g id="seachinglocation" fill-rule="evenodd">\n<path d="M130 10A100 100 0 0 0 30 110v3c2 88.3 91.6 144.71 91.6 144.71 4.56 3.09 12 3.1 16.54.12 0 0 89.79-56.52 91.77-144.83v-3A100 100 0 0 0 130 10ZM85 120a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm45 0a15 15 0 1 1 15-15 15 15 0 0 1-15 15Zm45 0a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/>\n</g>\n<g id="search" fill-rule="evenodd">\n<path d="M182.85 162.85a90 90 0 1 0-20 20L220 240l20-20ZM150 110a40 40 0 0 0-40-40V50a60 60 0 0 1 60 60Z"/>\n</g>\n<g id="security" fill-rule="evenodd">\n<path d="M110 150h30l10-10h-40v10zm20-70a19.94 19.94 0 0 0-20 20v10h40v-10a19.94 19.94 0 0 0-20-20Z"/><path d="M240 30a10 10 0 0 0-10-10H30a9.94 9.94 0 0 0-10 10v70c0 140 110 150 110 150s110-10 110-150Zm-70 140a10 10 0 0 1-10 10h-60a9.93 9.93 0 0 1-10-10v-50a10 10 0 0 1 10-10v-10a30 30 0 1 1 60 0v10a9.93 9.93 0 0 1 10 10Z"/>\n</g>\n<g id="security-token" fill-rule="evenodd">\n<path d="M110.8 151h30l10-10h-40zm20-70c-11.1 0-20 8.9-20 20v10h40v-10c0-11.1-9-20-20-20z"/><path d="M240.7 31c0-5.4-4.5-10-10-10H30.8c-5.6 0-10 4.5-10 10v70c0 140 110 150 110 150s110-10 110-150l-.1-70zm-69.9 140c0 5.5-4.5 10-10 10h-60.1c-5.5 0-10-4.4-10-10v-50c0-5.5 4.5-10 10-10v-10c0-16.6 13.5-30 30-30 16.6 0 30 13.5 30 30v10c5.5 0 10 4.4 10 10l.1 50z"/>\n</g>\n<g id="seecvv" fill-rule="evenodd">\n<path d="M240 40H20a10 10 0 0 0-10 9.93V80h100l-20 20H10v110.07A10 10 0 0 0 20 220h220a10 10 0 0 0 10-9.93V49.93A10 10 0 0 0 240 40Zm-60 130a50 50 0 1 1 50-50 50 50 0 0 1-50 50Zm-20-40h30l20-20h-50Z"/>\n</g>\n<g id="send" fill-rule="evenodd">\n<path d="M245.62 123.29 33.25 30.61a7.27 7.27 0 0 0-8.06 1.54l-3.05 3.06a7.33 7.33 0 0 0-1.51 8.14L57.68 127a7.34 7.34 0 0 1 0 5.94l-37.05 83.71a7.34 7.34 0 0 0 1.51 8.14l3.05 3.06a7.27 7.27 0 0 0 8.06 1.54l212.37-92.69a7.33 7.33 0 0 0 0-13.41ZM60 190l30-61h110Z"/>\n</g>\n<g id="send-money-dollar" fill-rule="evenodd">\n<path d="M170 110h40V80l40 40-40 40v-30h-60l20-20z"/><path d="M160 150v60.84H40V30.08h120V90h20V20a10 10 0 0 0-10-10H30a10 10 0 0 0-10 10v220a10 10 0 0 0 10 10h140a10 10 0 0 0 10-10v-90Zm-60 91a10 10 0 1 1 10-10 10 10 0 0 1-10 10Z"/><path d="M99 156.1c-9.77 0-19.55-4.34-27.15-8.68l-2.16 16.28a64 64 0 0 0 21.72 6.51v10.85l19.59 9.77v-20.62c13-3.26 21.73-13 21.73-27.13 0-15.2-7.61-21.71-27.16-30.39-13-5.43-16.29-8.68-16.29-15.19 0-5.43 4.34-10.86 13-10.86 7.61 0 15.21 3.26 22.81 7.6l1.09-17.36c-5.43-2.17-9.78-4.35-16.29-5.43V60.6l-19.57-9.77v21.7c-11.94 3.26-19.55 13-19.55 26.05 0 15.19 7.61 21.71 26.07 29.3 14.12 6.52 17.38 8.69 17.38 16.28-1.09 7.6-6.52 11.94-15.22 11.94Z"/>\n</g>\n<g id="send-money-euro" fill-rule="evenodd">\n<path d="M170 110h40V80l40 40-40 40v-30h-60z"/><path d="M160 150v60.8H40V30.1h120V90h20V20c0-5.5-4.5-10-10-10H30c-5.5 0-10 4.5-10 10v220c0 5.5 4.5 10 10 10h140c5.5 0 10-4.5 10-10v-90h-20zm-60 91c-5.5 0-10-4.5-10-10s4.5-10 10-10 10 4.5 10 10-4.5 10-10 10z"/><path d="M107 166c12.4-.1 24.3-5.2 33-14l-9-9c-12.5 13.2-33.4 13.8-46.7 1.3-2.5-2.4-4.7-5.2-6.3-8.3h22l13-13H73v-6h27l13-13H78c8.7-16 28.7-22 44.7-13.3 3.1 1.7 5.9 3.8 8.3 6.3l9-9c-18.4-18.3-48.2-18.2-66.5.2-7.9 8-12.7 18.5-13.5 29.8v3c1.1 25.2 21.8 45 47 45z"/>\n</g>\n<g id="services" fill-rule="evenodd">\n<path d="M239.93 178c-2.1-58-50.42-104.34-109.71-104.34S22.6 120 20.5 178H20v22h220v-22Zm-47.34-31a78.86 78.86 0 0 0-11.78-14.21 79.78 79.78 0 0 0-25.81-16.5v-15.92a94.7 94.7 0 0 1 36.17 21.56A93.48 93.48 0 0 1 209.9 147ZM130 60a20 20 0 1 0-20-20 20 20 0 0 0 20 20ZM0 220h260v20H0z"/>\n</g>\n<g id="settings" fill-rule="evenodd">\n<path d="m249 124-56-98a12 12 0 0 0-11-6H77a12 12 0 0 0-11 6l-55 98a12 12 0 0 0 0 11l55 98a12 12 0 0 0 11 6h106a12 12 0 0 0 11-6l55-98a12 12 0 0 0 0-11Zm-119 56a50 50 0 1 1 50-50 50 50 0 0 1-50 50Z"/>\n</g>\n<g id="share" fill-rule="evenodd">\n<path d="m108.14 142.09 50.2 33.46A40 40 0 1 1 150 200q0-1.64.13-3.25l-54.31-36.2a40 40 0 1 1 0-61.1l54.31-36.2Q150 61.64 150 60a40 40 0 1 1 8.33 24.44l-50.2 33.46a40.23 40.23 0 0 1 0 24.19Z"/>\n</g>\n<g id="shop" fill-rule="evenodd">\n<path d="m255.33 90-30-51h-180l-40 51h250zM210 109v80H50v-80H30v114a6.29 6.29 0 0 0 6.33 6h188a5.72 5.72 0 0 0 5.67-6V109Z"/><path d="M70.33 149h100l-16.66 20H70.33v-20z"/>\n</g>\n<g id="shopping" fill-rule="evenodd">\n<path d="M190 60v-.06a60 60 0 0 0-120 0V60H30v170a10 10 0 0 0 9.92 10h180.16a10 10 0 0 0 9.92-10V60ZM90 130l-20 20v-50h20Zm0-70a40 40 0 1 1 80 0Zm100 70-20 20v-50h20Z"/>\n</g>\n<g id="sign" fill-rule="evenodd">\n<path d="M210.64 116.05c.11.27 0-.29 0 0Zm-56.56-56.56c.29 0-.27-.11 0 0ZM250 110 150 10l-20 20 100 100 20-20zM140 70l-7.13 4.28A180.5 180.5 0 0 1 40 100L20 225.86l52.94-52.94a30 30 0 1 1 14.14 14.14L34.14 240 160 220a180.5 180.5 0 0 1 25.72-92.87L190 120Z"/>\n</g>\n<g id="simulator" fill-rule="evenodd">\n<circle cx="75" cy="50" r="30"/><path d="M120.8 30a50.57 50.57 0 0 1 3.2 30h96l30-30Z"/><circle cx="155" cy="130" r="30"/><path d="M10 110v30h96a49.8 49.8 0 0 1 3.2-30Z"/><circle cx="75" cy="210" r="30"/><path d="M120.8 190a50.57 50.57 0 0 1 3.2 30h96l30-30Z"/>\n</g>\n<g id="slideshare" fill-rule="evenodd">\n<path d="M188 77c0-9.46-3-14-11.73-14H84.59C75.39 63 72 66.91 72 77v55.48c20 10.23 36.72 8.42 45.88 8.13 3.85-.19 6.53.66 8 2.24.26.22.64.46.92.73a51.41 51.41 0 0 0 5.1 4.16c.34-4.53 2.87-7.47 9.71-7.13 9.3.29 26.35 2.17 46.35-8.6Zm-77.35 56.55c-9.56 0-17.3-7.32-17.3-16.35s7.75-16.35 17.3-16.35 17.3 7.32 17.3 16.35-7.74 16.31-17.3 16.31Zm40.92 0c-9.56 0-17.3-7.32-17.3-16.35s7.75-16.35 17.3-16.35 17.3 7.32 17.3 16.35-7.74 16.31-17.3 16.31Z"/><path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm71.45 121.6c-5.27 6.45-15.28 14.47-30.63 20.77 16.28 55.34-39.65 64.13-38.79 35.75 0 .51 0-15.21-.05-26.92-1.2-.29-2.47-.63-3.94-1 0 11.79-.05 28.43-.05 27.9.85 28.37-55 19.58-38.8-35.75-15.36-6.29-25.37-14.35-30.64-20.75-2.71-4-.28-8.2 4.13-5.12.6.43 1.32.83 1.32 1.23V70.47A14.75 14.75 0 0 1 78.24 56h103.59c7.35 0 13.17 6.54 13.17 14.47v57.18c0-.38 1.21-.77 1.78-1.18 4.41-3.07 7.38 1.12 4.67 5.13Z"/>\n</g>\n<g id="slideshare2" fill-rule="evenodd">\n<path d="M44.3 140V48.46c0-15.17 3.86-19.93 17.75-19.93h138.36c13.15 0 17.8 5.65 17.8 19.93v88.72l10.7-7.39V38.66c0-12-9-21.66-20.1-21.66H52.47c-11.08 0-20.1 9.68-20.1 21.66v93.93L44.3 140"/><path d="M133.52 156.88c0-7.78 3.58-13 14.72-12.43 16.06.5 47.63 4.14 83.23-21.27 6.66-4.65 11 1.68 6.94 7.72-7.95 9.74-23.06 21.83-46.23 31.35 24.57 83.52-59.84 96.78-58.55 54 0 1.23-.11-59.33-.11-59.33"/><path d="M167.78 151c-11.64 16-25.52 13-41.81-2.07-.43-.4-.84-.76-1.24-1.1-2.26-2.39-6-3.67-11.81-3.38-16.06.5-47.63 4.14-83.23-21.27-6.66-4.65-11 1.68-6.94 7.72 7.95 9.74 23.06 21.83 46.23 31.35-24.52 83.52 59.84 96.78 58.55 54 0 .8 0-24.3.08-42.11 9.82 2.31 13.94 4.44 27.46 1.35A31 31 0 0 0 177 156.71c4.49-10.91-3.23-13.99-9.22-5.71Z"/><ellipse class="cls-1" cx="163.14" cy="109.12" rx="26.11" ry="24.68"/><ellipse class="cls-1" cx="101.38" cy="109.12" rx="26.11" ry="24.68"/>\n</g>\n<g id="smart-assistant" fill-rule="evenodd">\n<path d="M240 30H20c-5.5 0-10 4.5-10 10v210l40-40h190c5.5 0 10-4.5 10-10V40c0-5.5-4.5-10-10-10zM128.8 180c-7.5 0-13.6-6.1-13.6-13.6s6.1-13.6 13.6-13.6 13.6 6.1 13.6 13.6-6.1 13.6-13.6 13.6zm20.4-63.8c-12.2 7.2-12.1 10.1-12.1 25.2h-17.7c-.4-3.6-.5-7.2-.5-11 0-11.5 6.3-18.2 14.2-23 7.4-4.7 10.8-8.1 10.8-15.5 0-6.1-4.5-10.3-12.6-10.3-8.9 0-17.8 6.2-23.1 13.2L95 81.1c8.2-10.3 20.6-18.8 38.4-18.8C153.8 62.3 165 74 165 90c0 14.1-7.2 21-15.8 26.2z"/>\n</g>\n<g id="sms" fill-rule="evenodd">\n<path d="M170 210.1H50v-180h120v20h20v-30c.1-5.4-4.1-9.8-9.5-10H40.3c-5.6 0-10.2 4.4-10.3 10V240c.2 5.6 4.7 10 10.3 10h140c5.4 0 9.7-4.4 9.7-9.8V190h-20v20.1zm-59.7 30c-5.5 0-10-4.5-10-10s4.5-10 10-10 10 4.5 10 10-4.4 10-10 10z"/><path d="M234 70.1H106c-3.3 0-6 2.7-6 6v88.1c0 3.3 2.7 6 6 6h128c3.3 0 6-2.7 6-6V76c0-3.3-2.7-6-6-5.9zm-4 39.8L170 139l-60-29.1V90l10 4.8 50 24.2 60-29v19.9z"/>\n</g>\n<g id="stairs" fill-rule="evenodd">\n<path d="M20 20v220h220V20Zm200 60h-40v40h-40v40h-40v40H40v-20h40v-40h40v-40h40V60h60Z"/>\n</g>\n<g id="stock" fill-rule="evenodd">\n<path d="m90 120-70 70v40a10 10 0 0 0 10 10h200a10 10 0 0 0 10-10V90l-90 90ZM230 20H30a10 10 0 0 0-10 10v120l70-70 60 60 90-90V30a10 10 0 0 0-10-10Z"/>\n</g>\n<g id="substract" fill-rule="evenodd">\n<path d="M129 10C62.7 10 9 63.7 9 130s53.7 120 120 120 120-53.7 120-120S195.3 10 129 10zm50 130H69v-20h130l-20 20z"/>\n</g>\n<g id="sun" fill-rule="evenodd">\n<circle cx="130.05" cy="130.58" r="70"/><path d="M258.16 129.14 212 94.65l7.45-57.13-57 8.25L127.3.09 92.81 46.25 35.68 38.8l8.25 57L-1.75 131l46.15 34.49-7.4 57.09 57-8.25L129.11 260l34.49-46.15 57.13 7.45-8.25-57ZM128.21 220a89.93 89.93 0 1 1 89.93-90 89.93 89.93 0 0 1-89.93 90Z"/>\n</g>\n<g id="supermarket" fill-rule="evenodd">\n<path d="M243.85 90h-52.91c-.63-47-25.34-70-60.94-70-34.45 0-59.41 23-60 70H16.1c-3.85 0-6.55 4.12-6 7.93l19.35 134.94a8.43 8.43 0 0 0 7.93 7.13h184.75a7.89 7.89 0 0 0 7.87-6.64l19.94-135.55c.49-3.81-2.23-7.81-6.09-7.81ZM90 200l-20-12.93V140h20Zm40-161.39c22.9 0 39.49 13.39 40 51.39H90.94c.47-38 17.31-51.39 39.06-51.39ZM140 200l-20-12.93V140h20Zm50 0-20-12.93V140h20Z"/>\n</g>\n<g id="support" fill-rule="evenodd">\n<path d="M240 30H20a10 10 0 0 0-10 10v210l40-40h190a10 10 0 0 0 10-10V40a10 10 0 0 0-10-10ZM130 130H50v-20h100Zm40-40H50V70h140Z"/>\n</g>\n<g id="tablet" fill-rule="evenodd">\n<path d="M120.23 230a10 10 0 1 1 10 10 10 10 0 0 1-10-10Zm-60-190h140v170h-140Zm-20-20a10 10 0 0 1 10-10h160a10 10 0 0 1 10 10v220a10 10 0 0 1-10 10h-160a10 10 0 0 1-10-10Z"/><path d="m180.23 80-100 100V60h100v20z"/>\n</g>\n<g id="tasks" fill-rule="evenodd">\n<path d="M160 10H46c-3.3 0-6 2.7-6 6v227c0 3.5 2.5 6.5 6 7h168c3.1-.4 5.6-2.9 6-6V70l-60-60zM60 70h100l-20 20H60V70zm0 40h60l-20 20H60v-20zm71 115-38-38 14-14 22 22 53-62 15 13-66 79z"/>\n</g>\n<g id="team" fill-rule="evenodd">\n<circle cx="105.41" cy="90.91" r="40.91"/><path d="M131.77 140a60.33 60.33 0 0 1-26.63 6.15A61.09 61.09 0 0 1 78.33 140C44.95 148 20 177.36 20 212.42V230h170v-17.58c0-35.06-24.88-64.42-58.23-72.42Zm29.55-49.09a55.94 55.94 0 0 1-1.19 11.49 36.36 36.36 0 1 0-24-58.2 55.9 55.9 0 0 1 25.19 46.71Z"/><path d="M240 174.38c0-31.17-22.06-57.3-51.7-64.37a53.5 53.5 0 0 1-23.64 5.47 54.89 54.89 0 0 1-8.69-.71 56.13 56.13 0 0 1-9.52 14.07A89.89 89.89 0 0 1 202.12 190H240Z"/>\n</g>\n<g id="telephone" fill-rule="evenodd">\n<path d="m237.24 209.41-50.78-42.62a6.7 6.7 0 0 0-8.86.37l-7.41 7.41-1.48 1.43-15.28 15.28a143.22 143.22 0 0 1-51.76-33.14 141.33 141.33 0 0 1-33.14-51.77l15.28-15.24 1.47-1.47 7.41-7.41a6.8 6.8 0 0 0 .31-8.94L50.41 22.56a5.38 5.38 0 0 0-8.08-.33l-19.1 19.11a6.18 6.18 0 0 0-1.13 1.13l-2.28 2.28-.06-.05h-.17a184.73 184.73 0 0 0 195.55 195.54l-.07-.21 2.28-2.28 1.13-1.13 19.1-19.11a5.43 5.43 0 0 0-.34-8.1Z"/>\n</g>\n<g id="theater" fill-rule="evenodd">\n<path d="M110 10v90c0 50 20 90 70 90s70-40 70-90V10Zm35 30a15 15 0 1 1-15 15 15 15 0 0 1 15-15Zm35 120a50 50 0 0 1-50-50h20a30 30 0 0 0 60 0h20a50 50 0 0 1-50 50Zm35-90a15 15 0 1 1 15-15 15 15 0 0 1-15 15Z"/><path d="M130 210h-20a30 30 0 1 0-60 0H30a50 50 0 0 1 71.51-45.15C94.1 150.88 90 133 90 110V70H10v105c0 45 28 75 70 75 36 0 60-20 60-50a99 99 0 0 1-13.07-7.29A49.89 49.89 0 0 1 130 210ZM45 100a15 15 0 1 1-15 15 15 15 0 0 1 15-15Z"/>\n</g>\n<g id="thumbsdown" fill-rule="evenodd">\n<path d="M250 130.26c-.12 11-9.42 19.77-20.46 19.77H160a69.67 69.67 0 0 1 10 36 71.55 71.55 0 0 1-4.92 25.84A12.85 12.85 0 0 1 153 220a13.06 13.06 0 0 1-13-12.57 70 70 0 0 0-64.37-67.21 6 6 0 0 1-5.58-6V37.23a12 12 0 0 1 6.09-10.45A130.49 130.49 0 0 1 140 10h59.49c11 0 20.27 8.6 20.51 19.56a19.94 19.94 0 0 1-5.58 14.28A20 20 0 0 1 230 63.36a19.9 19.9 0 0 1-5.58 13.84A20 20 0 0 1 240 96.7a19.94 19.94 0 0 1-5.58 13.84A20 20 0 0 1 250 130.26ZM45.2 140H14.82c-2.64 0-4.79-2.68-4.79-6V36c0-3.31 2.15-6 4.79-6H45.2c2.65 0 4.8 2.69 4.8 6v98c0 3.32-2.15 6-4.8 6Z"/>\n</g>\n<g id="thumbsup" fill-rule="evenodd">\n<path d="M250 99.77c-.12-11-9.42-19.77-20.46-19.77H160a69.67 69.67 0 0 0 10-36 71.55 71.55 0 0 0-4.92-25.84A12.85 12.85 0 0 0 153 10a13.06 13.06 0 0 0-13 12.57 70 70 0 0 1-64.42 67.21 6 6 0 0 0-5.58 6v97.02a12 12 0 0 0 6.09 10.45A130.49 130.49 0 0 0 140 220h59.49c11 0 20.27-8.6 20.51-19.56a19.94 19.94 0 0 0-5.58-14.28A20 20 0 0 0 230 166.67a19.9 19.9 0 0 0-5.58-13.84 20 20 0 0 0 15.58-19.5 19.94 19.94 0 0 0-5.58-13.84A20 20 0 0 0 250 99.77ZM45.2 90H14.82C12.18 90 10 92.71 10 96v98c0 3.31 2.15 6 4.79 6H45.2c2.65 0 4.8-2.69 4.8-6V96c0-3.29-2.15-6-4.8-6Z"/>\n</g>\n<g id="ticket" fill-rule="evenodd">\n<path d="M210.07 10H200l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10h-10V10h-10l-10 10H90V10H80L70 20H60V10H49.93A10 10 0 0 0 40 20v220a10 10 0 0 0 9.93 10H60l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10l10-10h10v10h10.07a10 10 0 0 0 9.93-10V20a10 10 0 0 0-9.93-10ZM70 100h90l-20 20H70Zm90 60H70v-20h110Zm10-80H70V60h120Z"/>\n</g>\n<g id="ticketoffice" fill-rule="evenodd">\n<path d="M194.4 95.9c-5.3 0-10.6-1.1-15.8-1.1-43.3 0-79.2 35.9-79.2 79.2 0 15.8 6.3 32.7 18 50.7l-7.4 7.4H99.3v-10.6H88.8l-10.6 10.6H67.6v-10.6H57.1l-10.6 10.6H36c-6.3 0-10.6-4.2-10.6-10.6V20.9c0-6.3 4.2-10.6 10.6-10.6h21.1v10.6h10.6l10.6-10.6h10.6v10.6h10.6l10.6-10.6h10.6v10.6H131l10.6-10.6h10.6v10.6h10.6l10.6-10.6H184c6.3 0 10.6 4.2 10.6 10.6v75h-.2zm-137.3 9.5v21.1h31.7l21.1-21.1H57.1zm0-42.2v21.1h63.4l21.1-21.1H57.1zM184.9 248c-4.2 3.2-9.5 3.2-12.7 0-34.9-26.4-51.7-50.7-51.7-73.9 0-31.7 26.4-58.1 58.1-58.1 31.7 0 58.1 26.4 58.1 58.1-.1 23.2-17 47.5-51.8 73.9zm-6.4-47.5c14.8 0 26.4-11.6 26.4-26.4 0-14.8-11.6-26.4-26.4-26.4s-26.4 11.6-26.4 26.4c0 14.8 11.6 26.4 26.4 26.4z"/>\n</g>\n<g id="titleview" fill-rule="evenodd">\n<path d="M79.44 80V40h-40v40h40zM150 80V40h-40v40h40zm70 0V40h-40v40h40zm-70 70v-40h-40v40h40zm70 0v-40h-40v40h40zM79.44 220v-40h-40v40h40zm70.56 0v-40h-40v40h40zm-70.56-70v-40h-40v40h40zM220 220v-40h-40v40h40z"/>\n</g>\n<g id="token" fill-rule="evenodd">\n<path d="M210.1 110H200V79.9c0-38.7-31.3-70-70-70s-70 31.3-70 70V110H49.9c-5.5 0-10 4.5-9.9 10.1V240c0 5.5 4.4 10 9.9 10.1H210c5.5 0 10-4.5 9.9-10.1V120.1c.1-5.6-4.3-10.1-9.8-10.1zM140 186.8v16.7c0 3.3-2.7 6-6 6h-8c-3.3 0-6-2.7-6-6v-16.7c-9.6-5.5-12.8-17.8-7.3-27.3 5.5-9.6 17.8-12.8 27.3-7.3 9.6 5.5 12.8 17.8 7.3 27.3-1.7 3-4.3 5.5-7.3 7.3zm40-76.8H80V79.9c0-27.6 22.4-50 50-50s50 22.4 50 50V110z"/>\n</g>\n<g id="tools" fill-rule="evenodd">\n<path d="m246.46 204.24-62-62-14.17 14.17 63.47 63.47h-28.39l-49.3-49.3-14.17 14.11 62 62a12 12 0 0 0 17 0l25.5-25.5a12 12 0 0 0 .06-16.95ZM62.67 77.13l29.34 29.34 14.17-14.17-29.34-29.34 1.42-26.92L21.59 7.7 7.42 21.87l28.33 56.67 26.92-1.41z"/><path d="M234 104.51c15.23-15.28 19-36.51 12.74-55.77l-34.15 34.15a12.08 12.08 0 0 1-17 0l-18.48-18.45a12.08 12.08 0 0 1 0-17l34.15-34.15C192 7 170.77 10.76 155.49 26A55.47 55.47 0 0 0 142 82.53L13.41 211.1a12.08 12.08 0 0 0 0 17l18.45 18.45a12.08 12.08 0 0 0 17 0L177.47 118A55.47 55.47 0 0 0 234 104.51ZM51.56 229.71a15 15 0 1 1 0-21.21 15 15 0 0 1 0 21.21Z"/>\n</g>\n<g id="top-arrow" fill-rule="evenodd">\n<path d="M80 160h100l-50-60z"/>\n</g>\n<g id="toys" fill-rule="evenodd">\n<path d="M250 55.5V54h-20.72a50.27 50.27 0 1 0-84.81 42.28 139 139 0 0 1-133.54 31.14 108.55 108.55 0 1 0 205.31-33.1 50.21 50.21 0 0 0 9.23-14Zm-68.15-14.35a10.39 10.39 0 1 1-10.41 10.39 10.4 10.4 0 0 1 10.41-10.39ZM147 180H80l20-20h47Z"/>\n</g>\n<g id="tpv" fill-rule="evenodd">\n<path d="M84.49 224.09v31.46c0 2.3 2.4 4.13 5.36 4.13h79.28c3 0 5.36-1.85 5.36-4.13v-31.46"/><path d="M204 10H56a6 6 0 0 0-6 6v218a6 6 0 0 0 6 6h14v-30.32h120V240h14a6 6 0 0 0 6-6V16a6 6 0 0 0-6-6ZM69 60V30h122l-21 30Zm26 134.68H70v-25h25Zm0-45H70v-25h25Zm0-45H70v-25h25Zm47 90h-25v-25h25Zm0-45h-25v-25h25Zm0-45h-25v-25h25Zm48 90h-25v-25h25Zm0-45h-25v-25h25Zm0-45h-25v-25h25Z"/>\n</g>\n<g id="transaction" fill-rule="evenodd">\n<path d="M210 210v-30h30v30ZM20 50h170l-10 30H20Zm0 130h170l-10 30H20Zm0-65h140l-10 30H20Zm190-35V50h30v30Zm0 65v-30h30v30Z"/>\n</g>\n<g id="transfer" fill-rule="evenodd">\n<path d="M80 100h80l40-40H80V20L10 80l70 60Zm170 80-70-60v40h-80l-40 40h120v40Z"/>\n</g>\n<g id="transferaccount" fill-rule="evenodd">\n<path d="M219 40H-1v140h220ZM29 70h60L69 90H29Zm60 90v-20H29l20-20h40v-20l40 30Zm150-60v100H39l-20 20h240V80Z"/>\n</g>\n<g id="transfercard" fill-rule="evenodd">\n<path d="M239 40H19a10 10 0 0 0-10 9.93V80h200l-20 20H9v110.07A10 10 0 0 0 19 220h220a10 10 0 0 0 10-9.93V49.93A10 10 0 0 0 239 40Zm-50 160v-20h-60l20-20h40v-20l40 30Z"/>\n</g>\n<g id="transfertoaccount" fill-rule="evenodd">\n<path d="M260 86.668V227.5H43.332L65 205.832h173.332v-97.5zm-43.332-32.5v130H0v-130zm-65 54.164V130h-32.5L97.5 151.668h54.168v21.664l43.332-32.5zM97.5 86.668h-65v21.664h43.332zm0 0" fill-rule="evenodd"/>\n</g>\n<g id="trash" fill-rule="evenodd">\n<path d="M190.23 220v-90h-20v70Zm-50 0v-90h-20v70Zm-50 0v-90h-20v70Zm-25-190h25v-9.91A10.08 10.08 0 0 1 100.2 10h60.06a10 10 0 0 1 10 10.09V30h70v30h-20v180a10 10 0 0 1-9.93 10H50.17a9.92 9.92 0 0 1-9.93-10V60h-20V30Z"/>\n</g>\n<g id="travel" fill-rule="evenodd">\n<path d="M100.15 230H190m54-174h-38.6l.1-30.29c0-3.16-3.29-5.71-6.43-5.71h-87.64c-3.05 0-5.8 2-5.93 5h-.5v31H66a6 6 0 0 0-6 6v122a6 6 0 0 0 6 6h178a6 6 0 0 0 6-6V62a6 6 0 0 0-6-6ZM126 40h60v16h-60Zm14.5 66H90V86h70.5Z"/><path d="M260 210H40V28.4a8.16 8.16 0 0 0-8.25-8.4H0v20h20v181.27a8.85 8.85 0 0 0 8.73 8.73H60a20 20 0 0 0 40 0h90a20 20 0 0 0 40 0h30Z"/>\n</g>\n<g id="turnbox" fill-rule="evenodd">\n<path d="m190.8 10-43 40.83a25.81 25.81 0 0 1-35.68 0L69.09 10H50v161.56a13.42 13.42 0 0 0 3.64 8.59l69.11 66.94a10.47 10.47 0 0 0 14.48 0l69.11-66.94a13.83 13.83 0 0 0 3.65-8.59V10ZM91.53 156.15c-14 0-22.18-11-22.18-27.65s8.21-27.65 22.18-27.65 22.11 11 22.11 27.65-8.07 27.65-22.11 27.65Zm49.51 0c-14 0-22.18-11-22.18-27.65s8.21-27.65 22.18-27.65 22.11 11 22.11 27.65-8.07 27.65-22.15 27.65Zm49.52-1.15h-11v-42.56l-10 2.45-1.31-9.51 12.12-3.38h10.19Z"/><path d="M141 110.21c-6.91 0-10.51 6.12-10.51 18.29S134.3 147 141 147s10.51-6.34 10.51-18.51-3.81-18.28-10.51-18.28Zm-49.51 0c-6.91 0-10.51 6.12-10.51 18.29S84.79 147 91.49 147 102 140.67 102 128.5s-3.81-18.29-10.51-18.29Z"/>\n</g>\n<g id="tv" fill-rule="evenodd">\n<path d="M240.79 39.88h-97.92L179.78 3h-20l-30 30-30-30h-20l36.91 36.91H20.81a10 10 0 0 0-10 10v140a10 10 0 0 0 10 10h220a10 10 0 0 0 10-10v-140a10 10 0 0 0-10.02-10.03Zm-10 140H30.8v-120h200Z"/><path d="M180.8 79.97h-130v80h50l80-80zM61 219.88h140v20H61z"/>\n</g>\n<g id="twitter" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm59.73 91.59c.09 1.24.09 2.48.09 3.71 0 37.8-31 81.35-87.69 81.35a92.09 92.09 0 0 1-47.32-12.84 67.09 67.09 0 0 0 7.44.36A64.78 64.78 0 0 0 100.51 162c-13.55-.27-24.9-8.51-28.81-19.83a40.82 40.82 0 0 0 5.82.45 20.22 20.22 0 0 0 6.15-1C69.55 138.94 57 127.43 57 113.54v-.36c0 2.13 10.84 3.46 15.89 3.64-8.29-5.14-12.75-13.91-12.75-23.82 0-5.32 2-10.18 4.68-14.44C80 95.92 103 107.25 128.62 108.49a29.35 29.35 0 0 1-.64-6.56c0-15.76 13.8-28.58 30.87-28.58a32 32 0 0 1 22.55 9 63.64 63.64 0 0 0 19.6-6.88 28.91 28.91 0 0 1-13.54 15.76 65.49 65.49 0 0 0 17.75-4.42 64.11 64.11 0 0 1-15.48 14.78Z"/>\n</g>\n<g id="twitter2" fill-rule="evenodd">\n<path d="M212.94 91.4c0 52.66-43.19 113.34-122.16 113.34a128.29 128.29 0 0 1-65.93-17.89 93.47 93.47 0 0 0 10.37.5 90.25 90.25 0 0 0 53.29-17c-18.87-.38-34.69-11.85-40.14-27.63a56.86 56.86 0 0 0 8.1.63A48.68 48.68 0 0 0 67.78 142c-19.67-3.69-34.42-19.72-34.42-39.08v-.5a45.87 45.87 0 0 0 19.4 5.07c-11.55-7.15-19.12-19.36-19.12-33.17a37.44 37.44 0 0 1 5.83-20.12c21.14 24.18 52.91 40 88.54 41.69a41 41 0 0 1-1.01-9.18c0-22 19.14-39.82 42.92-39.82a44.43 44.43 0 0 1 31.37 12.57 88.53 88.53 0 0 0 27.25-9.62 40.29 40.29 0 0 1-18.87 22 91.2 91.2 0 0 0 24.73-6.16 89.34 89.34 0 0 1-21.53 20.6c.07 1.67.07 3.39.07 5.12Z"/>\n</g>\n<g id="unfold" fill-rule="evenodd">\n<path d="m172.43 99.28 14.142 14.143-56.569 56.568-14.142-14.142z"/><path d="m87.578 99.285 56.569 56.569-14.142 14.142-56.569-56.569z"/>\n</g>\n<g id="uniquekey" fill-rule="evenodd">\n<path d="M189.998 70.145c-11.046 0-20-8.972-20-20.041 0-11.07 8.954-20.042 20-20.042 11.047 0 20 8.973 20 20.042s-8.953 20.041-20 20.041M169.998 0c-38.662 0-70.003 31.405-70.003 70.145a70.097 70.097 0 0 0 3.937 23.196L3.515 193.964c-4.687 4.696-4.687 12.31 0 17.005l25.456 25.51c4.687 4.695 12.286 4.695 16.972 0l3.348-3.356-6.265-22.064 13.336-13.365 14.144 14.171 14.142-14.171-7.07-21.257 14.142-14.172 14.142 14.172 14.143-14.172-7.072-21.257 15.888-14.149c11.556 8.44 25.78 13.432 41.176 13.432 38.662 0 70.003-31.405 70.003-70.146C240 31.405 208.659 0 169.997 0"/>\n</g>\n<g id="unlock" fill-rule="evenodd">\n<path d="M120 140h20v80l-20-20Zm72.2-92.2A70 70 0 0 0 60 79.91V110H49.93A10 10 0 0 0 40 120.07v119.86A10 10 0 0 0 49.93 250h160.14a10 10 0 0 0 9.93-10.07V120.07a10 10 0 0 0-9.93-10.07H80V79.9A50 50 0 0 1 177 63Z"/>\n</g>\n<g id="up" fill-rule="evenodd">\n<path d="m116.9 67.7-56.5 56.6-21.1-21.1 92.3-92 91.7 91.3-21.2 21.2-55.4-55.6-.1 183.1-29.7-28.9z"/>\n</g>\n<g id="update" fill-rule="evenodd">\n<path d="M250.4 120.1v-80l-22.8 19.6c-21.8-30-57.2-49.6-97.2-49.6-66.3 0-120 53.7-120 120s53.7 120 120 120c53 0 98-34.4 113.9-82l-28.5-9.5c-11.9 35.8-45.6 61.5-85.4 61.5-49.7 0-90-40.3-90-90s40.3-90 90-90c30.9 0 58.1 15.5 74.3 39.2l-24.3 20.8 70 20z"/>\n</g>\n<g id="upload" fill-rule="evenodd">\n<path d="M10 130A120 120 0 1 0 130 10 120 120 0 0 0 10 130Zm182-18.34-14.26 14.28-37.37-37.5.33 121.56-19.7-20V88.17l-38.4 38.2-14.43-14.26L130.31 50Z"/>\n</g>\n<g id="valora" fill-rule="evenodd">\n<path d="M130 0 0 110l20 20 110-90 110 90 20-20z"/><path d="M98 170c0-41.4 33.6-75 75-75h.8L130 60 30 140v80c0 5.5 4.4 10 9.9 10h77.9c-10.7-15.5-19.3-35-19.8-57.8V170z"/><path d="M173 110c-33.1 0-60 26.9-60 60v1.8c1.2 53 55 86.8 55 86.8 3 1.8 6.9 1.9 9.9.1 0 0 53.9-33.9 55.1-86.9V170c0-33.1-26.9-60-60-60zm0 90c-16.6 0-30-13.4-30-30s13.4-30 30-30 30 13.4 30 30-13.4 30-30 30z"/>\n</g>\n<g id="valoraview" fill-rule="evenodd">\n<path d="m240 130 20-20L130 0 0 110l20 20 110-90z"/><path d="M98 170.1c0-41.5 33.7-75.1 75.1-75.1h.6L130 60 30 140v80c0 5.5 4.4 10 9.9 10h87.9C109 215.8 98 193.7 98 170.1z"/><path d="M233.3 170.1c0-33.2-26.9-60.1-60.1-60.1S113 136.9 113 170.1s26.9 60.1 60.1 60.1c12.7 0 25-4 35.3-11.5l38.2 38.2 13.4-13.4-38.2-38.2c7.5-10.1 11.5-22.5 11.5-35.2zm-33.4 0c0-14.8-12-26.7-26.7-26.7V130c22.1 0 40.1 17.9 40.1 40.1h-13.4z"/>\n</g>\n<g id="videochat" fill-rule="evenodd">\n<path d="M240 30H20a10 10 0 0 0-10 9.93V250l40-40h190a10 10 0 0 0 10-9.93V39.93A10 10 0 0 0 240 30Zm-40 120-30-20v20a10 10 0 0 1-10 10H80a10 10 0 0 1-10-10V90a10 10 0 0 1 10-10h80a10 10 0 0 1 10 10v20l30-20Z"/>\n</g>\n<g id="videoplayline" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm0 220a100 100 0 1 1 100-100 100 100 0 0 1-100 100Z"/><path d="M109 184V76l72 54-72 54z"/>\n</g>\n<g id="virtualemail" fill-rule="evenodd">\n<path d="M5.5 130.94c0-69.38 49.69-120.63 123.13-120.63 73.12 0 121.87 48.75 121.87 116.87 0 41.88-22.19 71.25-61.56 71.25-24.69 0-36.25-11.25-41.56-27.81-11.25 11.88-26.25 23.75-49.06 23.75-25.63 0-41.87-17.19-41.87-48.12 0-51.56 27.19-83.75 59.69-83.75 20 0 29.06 7.19 36.25 15.94L154.56 65h38.13l-15.31 93.12c-2.5 12.81 2.5 19.69 17.19 19.69 19.69 0 33.75-17.81 33.75-49.38 0-57.19-39.37-96.56-100-96.56-60.94 0-99.06 40.94-99.06 99.06 0 57.81 36.88 100 97.5 100 23.12 0 42.5-5 58.75-15.94l10.62 15.31c-18.12 12.81-43.44 20-70.94 20C51.44 250.31 5.5 200 5.5 130.94Zm134.69 21.88 7.81-48.13c-6.87-7.5-12.81-10.63-22.5-10.63-20.63 0-30.63 24.06-30.63 48.12 0 14.69 4.69 23.12 20 23.12 9.07.01 18.13-5.3 25.32-12.49Z"/>\n</g>\n<g id="virtualreality" fill-rule="evenodd">\n<path d="M99.83 150.89a34.89 34.89 0 1 0 59.55-24.67l-24.67 24.67V116a34.89 34.89 0 0 0-34.88 34.89Zm-3.36-99.21h-6.24V63h6.24c5.28 0 7.81-1.52 7.81-5.73s-2.53-5.59-7.81-5.59Z"/><path d="M140 94V36a6 6 0 0 0-6-6H26a6 6 0 0 0-6 6v58a6 6 0 0 0 6 6h108a6 6 0 0 0 6-6Zm-77.48-8h-8.65L39.76 44.88l8.82-1.35 9.72 30.4h.11l9.83-29.72h8.6Zm42.6.51-9.61-16.4h-5.28v15.68h-9V44.21h15.63c10.23 0 16.35 3.65 16.35 12.87 0 6.57-3.09 10.17-8.65 11.86L114 85.12Z"/><path d="M160 75.35v29.73A52.34 52.34 0 1 1 92.48 120H46.54a132 132 0 0 0-16.48 30.89s26.16 78.49 104.66 78.49 104.66-78.49 104.66-78.49S218.93 89.6 160 75.35Z"/>\n</g>\n<g id="visualize" fill-rule="evenodd">\n<path d="M130 130V90a40 40 0 1 0 28.28 11.72Zm0-90c-90 0-120 90-120 90s30 90 120 90 120-90 120-90-30-90-120-90Zm0 150a60 60 0 1 1 60-60 60 60 0 0 1-60 60Z"/>\n</g>\n<g id="walkingdirections" fill-rule="evenodd">\n<path d="m149 122.3 9.4 18.2 42.7 17L210 130l-30-11-15.3-46.6S158 74.7 157 75c-5.3 1.2-10.9 1.5-16.3.8-4.5-.6-8.8-2-12.7-4.2-1.8-1-8.4-6-8.4-6l-38 19.3L49 124.5l22.4 17.2 23.7-32c.4-.7 16-8.9 16-8.9l-11.9 49.3 42.5 47.4 17.7 52.5h40.2l-24.3-60.6-31.7-44 5.4-23.1zm-4.4-58.2c14.9.1 27.2-11.9 27.3-26.9S160 10.1 145 10s-27.2 11.9-27.3 26.9v.2c0 14.9 12.1 27 26.9 27zM118.5 194l1-2.3-1.7-1.9L98.3 169l-4.2-4.4-2.2 5.7-13.7 35.9.8-1.2-33.5 38.6L40 250h38.7l1.1-1.2 26.5-28 .4-.5.3-.6 11.5-25.7z"/>\n</g>\n<g id="wallet" fill-rule="evenodd">\n<path d="M230 40H30V26a6 6 0 0 1 6-6h188a6 6 0 0 1 6 6Zm20 22v156a12 12 0 0 1-12 12H22a12 12 0 0 1-12-12V62a12 12 0 0 1 12-12h216a12 12 0 0 1 12 12Zm-138.57 59H30v82.27a7.76 7.76 0 0 0 7.78 7.73H60ZM140 71H37.78A7.75 7.75 0 0 0 30 78.73V101h92.86Zm80 69a20 20 0 1 0-20 20 20 20 0 0 0 20-20Z"/>\n</g>\n<g id="watch" fill-rule="evenodd">\n<path d="M180 67.2 170.5 10h-80L81 67.2c-34.7 27.3-40.6 77.6-13.3 112.3 3.9 4.9 8.4 9.4 13.3 13.3l9.5 57.2h80l9.5-57.2c34.7-27.3 40.6-77.6 13.3-112.3-3.9-4.9-8.4-9.4-13.3-13.3zM130.5 190c-33.1 0-60-26.9-60-60s26.9-60 60-60 60 26.9 60 60-26.9 60-60 60z"/><path d="m132.4 101.8-10.8-10.9v48.8h27.1l10.8-10.9h-27.1z"/>\n</g>\n<g id="weather" fill-rule="evenodd">\n<path d="M166.18 20.21 155.88 10h-.55v34.93h10.85V20.21ZM106 37.88H91.4l-.39.38L115.94 63l7.67-7.6L106 37.88Zm143.7 77.45 10.3-10.21v-.54h-35.25v10.75Zm-23.83-68.77V32.12l-.39-.38-24.93 24.7 7.67 7.6 17.64-17.48Zm-12 62.14c0-29-23.79-52.48-53.14-52.48a53.2 53.2 0 0 0-48.09 30.18c-.19.41-.51 1.35-.69 1.76 18.63 6.85 35 20.54 41.69 37.31a36.57 36.57 0 0 1 11.85-.67c14.6 1 27 7.06 36.18 17.41a51.88 51.88 0 0 0 12.23-33.5ZM160.49 240c27.7 0 50.16-22.74 50.16-50.78s-22.46-50.78-50.16-50.78a49.25 49.25 0 0 0-12.49 1.65 71.66 71.66 0 0 0-66.34-45.18C42.08 94.91 10 127.39 10 167.45S42.08 240 81.66 240Zm0 0"/>\n</g>\n<g id="wellness" fill-rule="evenodd">\n<path d="M130 10a120 120 0 1 0 120 120A120 120 0 0 0 130 10Zm68.42 110c0 39-68.5 78.29-68.5 78.29S61.42 159 61.42 120h.35a28.05 28.05 0 0 1-.35-4.82 34.25 34.25 0 0 1 68.15-4.84h.69a34.25 34.25 0 0 1 68.15 4.82 28.07 28.07 0 0 1-.35 4.82Z"/>\n</g>\n<g id="wifi" fill-rule="evenodd">\n<path d="M67.24 169.76 79.64 197a72.81 72.81 0 0 1 100.73 0l12.39-27.27a93.6 93.6 0 0 0-125.52 0ZM130 208a51.85 51.85 0 0 0-37.92 16.42l6.72 14.78h62.4l6.72-14.78A51.85 51.85 0 0 0 130 208Zm0-187.2A196.7 196.7 0 0 0 16 57l12.32 27.15a176.87 176.87 0 0 1 203.36 0L244 57a196.7 196.7 0 0 0-114-36.2Z"/><path d="m41.51 113.17 12.34 27.15a124.82 124.82 0 0 1 152.3 0l12.34-27.15a145.62 145.62 0 0 0-177 0Z"/>\n</g>\n<g id="wikimetrics" fill-rule="evenodd">\n<path d="m166 172-26-17v-25h-20v25l-26 17 12 16 24-16 24 16 12-16zm14-62a45 45 0 0 0-34-44 35 35 0 0 1-31 0 45 45 0 0 0-34 44v10h99Z"/><circle cx="130" cy="35" r="25"/><path d="M76 196a35 35 0 0 1-31 0 45 45 0 0 0-34 44v10h99v-10a45 45 0 0 0-34-44Z"/><circle cx="60" cy="165" r="25"/><path d="M216 196a35 35 0 0 1-31 0 45 45 0 0 0-34 44v10h99v-10a45 45 0 0 0-34-44Z"/><circle cx="200" cy="165" r="25"/>\n</g>\n<g id="withoutlocation" fill-rule="evenodd">\n<path d="M129.83 10a100 100 0 0 0-100 100v3c2 88.3 91.6 144.71 91.6 144.71 4.56 3.09 12 3.1 16.54.12 0 0 89.79-56.52 91.77-144.83v-3a100 100 0 0 0-99.91-100Zm49.5 135.36-14.14 14.14-35.36-35.36-35.35 35.36-14.14-14.14L115.69 110 80.34 74.64 94.48 60.5l35.35 35.36 35.36-35.36 14.14 14.14L144 110Z"/>\n</g>\n<g id="woman" fill-rule="evenodd">\n<path d="m109.5 59.4-30 120h19.83v70h20v-70h20v70h20v-70h20.17l-30-120h-40zm86.2 79.33-21-79.33h-15.4l20.14 73.82 16.26 5.51zm-96-79.33H84.3l-21 79.33 16.26-5.51L99.7 59.4zm15.72-15.92a20 20 0 0 0 28.15 0h5.93c0-11 4.06-34.4-20-34.4s-20 23.36-20 34.4Z"/>\n</g>\n<g id="womenshoe" fill-rule="evenodd">\n<path d="M130 230h120v-8.18a35.31 35.31 0 0 0-19.52-31.58L190 170a34.14 34.14 0 0 1-24.14 10H159a32.77 32.77 0 0 1-28.45-16.51l-13.23-23.16c-11.5-20.13-25.64-58.64-42-75L40 30 11.71 70a12 12 0 0 0-.85 10.63L30 130h20l70.4 95.2a12 12 0 0 0 9.6 4.8Z"/><path d="M30 150h20v80H30z"/>\n</g>\n<g id="word" fill-rule="evenodd">\n<path d="M129.42 117.35c-7.56 0-11.81 6-11.81 15.77s4.25 16.13 11.81 16.13 11.74-6.34 11.74-16.13-4.26-15.77-11.74-15.77ZM70 118.77h-4v29h4.16c10.87 0 14.11-4.1 14.11-14.9 0-9.87-3.27-14.1-14.27-14.1Z"/><path d="M160.1 10.77H46.47A6.42 6.42 0 0 0 40 17v227.5a6.41 6.41 0 0 0 6.48 6.27h167.24a6.23 6.23 0 0 0 6.28-6.27V70.77Zm-90.73 149H52v-53h17.37c15.84 0 29.31 5.91 29.31 26.14-.01 20.95-13.68 26.86-29.31 26.86Zm60 1c-12.89 0-26.21-8.14-26.21-27.65s13.32-27.65 26.21-27.65 26.14 8.14 26.14 27.65-13.28 27.65-26.09 27.65Zm55.66 0c-14 0-25-8.14-25-27.65s11.45-27.65 25-27.65c14.54 0 20.31 7.49 22.54 17l-13.61 4c-1.44-5.11-3.46-9.15-9-9.15-7.13 0-10.51 5.83-10.51 15.77s3.53 16.13 10.66 16.13c5.62 0 7.92-3.53 9.58-10.15l13.61 3c-2.56 10.85-8.68 18.7-23.23 18.7Z"/>\n</g>\n<g id="xml" fill-rule="evenodd">\n<path d="M159.7 9.9H46.1c-3.5 0-7 2.8-7 6.3v227.5c0 3.5 3.5 6.3 7 6.3h167.2c3.5 0 5.7-2.8 5.7-6.3V69.9ZM86.4 160.7l-10.9-18.2-10.2 17.3H50.8l17.3-28.4L52.9 107l14.2-2 9.2 15.6 8.3-14.7h14.2l-15.4 25.6 16.8 27.3Zm74.3-.9h-13v-28.2c-.3 1.1-.7 2.3-1 3.5l-.1.2-8 24.6H127l-8.1-24.9c-.4-1.4-.8-2.5-1.1-3.7V160h-12.3v-54h16.8l10.9 35.9 10.2-35.9h17.2v53.8Zm8.7 0v-54h13.4v42.7h21.9l2 11.3Z"/>\n</g>\n<g id="youtube" fill-rule="evenodd">\n<path d="m116 149.86 41.41-21.45L116 106.8v43.06z"/><path d="M130.84 10.39a120 120 0 1 0 120 120 120 120 0 0 0-120-120ZM208 135.77a178.53 178.53 0 0 1-2 24.8s-1.73 10.56-6.33 15.21c-5.83 6.11-12.48 6.14-15.47 6.49-21.45 1.55-53.71 1.6-53.71 1.6s-39.88-.36-52.14-1.54c-3.41-.64-11.08-.45-16.91-6.55-4.59-4.65-5-15.21-5-15.21s-.44-12.4-.44-24.8v-11.63c0-12.4.43-24.8.43-24.8s.95-10.56 5.57-15.21a24 24 0 0 1 15.08-7.53C98.5 75 130.4 74 130.4 74h.07s32.17 1 53.62 2.59c3 .36 9.53.91 15.36 7C204 88.26 206 99.08 206 99.08a184.82 184.82 0 0 1 2 25.07Z"/>\n</g>\n<g id="youtube2" fill-rule="evenodd">\n<path d="M247.6 86.67s-2.35-16.66-9.54-24c-9.13-9.63-19.35-9.68-24-10.24-33.59-2.45-84-2.45-84-2.45h-.1s-50.38 0-84 2.45c-4.69.56-14.92.61-24 10.24-7.19 7.33-9.54 24-9.54 24A368.31 368.31 0 0 0 10 125.79v18.34a368.23 368.23 0 0 0 2.4 39.12s2.34 16.66 9.54 24c9.13 9.63 21.12 9.32 26.46 10.33C67.6 219.43 130 220 130 220s50.43-.07 84-2.52c4.69-.56 14.92-.61 24-10.24 7.2-7.33 9.54-24 9.54-24a368.69 368.69 0 0 0 2.4-39.12v-18.33a368.76 368.76 0 0 0-2.34-39.12Zm-142.38 79.68V98.44l64.85 34.07Z"/>\n</g>\n      </defs>\n    </svg>\n  </template>\n</cells-iconset-svg>',document.head.appendChild(Di.content);class Fi extends(c(Fe(b))){static get is(){return"bbva-metasegura-errors"}static get scopedElements(){const e=[ie,Mt,ui,oe,Re,v];return Fi.scopedElementsFromClasses(e)}static get properties(){return{modalId:{type:String},fullHeight:{type:Boolean},modalType:{type:String},headerText:{type:Boolean},headerType:{type:String},microillustration:{type:String},heading:{type:String},texts:{type:Array},titleIcon:{type:String},titleText:{type:String},bodyText:{type:String},primaryButtonText:{type:String},secondaryButtonText:{type:String},hasCustomContent:{type:Boolean},customContent:{type:Object},events:{type:Object}}}constructor(){super(),this.modalId="",this.fullHeight=!1,this.headerType="",this.headerText="",this.modalType="",this.microillustration="",this.heading="",this.texts="",this.titleIcon="",this.titleText="",this.bodyText="",this.primaryButtonText="",this.secondaryButtonText="",this.hasCustomContent=!1,this.events={}}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}get _alertModal(){return this.shadowRoot.querySelector("#alertModal")}close(){this.fullHeight=!1,this.headerType="",this.headerText="",this.modalType="",this.modalId="",this.microillustration="",this.heading="",this.texts="",this.titleIcon="",this.titleText="",this.bodyText="",this.primaryButtonText="",this.secondaryButtonText="",this.hasCustomContent=!1}open(e,t=!0){let i=0;this._alertModal.visible&&(i=300,this._alertModal.close()),setTimeout((()=>{this.close(),this._modalInfoHandler(e),this.primaryButtonData=t,this._alertModal.open()}),i)}closeModal(){this._alertModal.close(),this._fireEvent(this._alertModal,this.events.iconHeader)}_modalInfoHandler(e){switch(this.modalId=e,e){case"healthRequirements":this._configModalAttributes(ki);break;case"accountLevel":this._configModalAttributes(_i);break;case"communicationInt":this._configModalAttributes(Mi);break;case"removeAddress":this._configModalAttributes(Ci);break;case"removeBeneficiary":this._configModalAttributes(Li);break;case"insufficientBalance":this._configModalAttributes(wi);break;case"invalidCode":this._configModalAttributes(Zi);break;case"beneficiariesInfo":this._configModalAttributes(Ai);break;case"abandonProcess":this._configModalAttributes(zi);break;case"pdfError":this._configModalAttributes(Hi);break;case"threeRetriesPdf":this._configModalAttributes(Vi);break;case"privacyNotice":this._configModalAttributes(Ti);break;case"operationNotPerformed":this._configModalAttributes(Bi);break;case"contracting":this._configModalAttributes(Ii);break;case"threeRetriesContracting":this._configModalAttributes(Pi);break;case"beneficiary":this._configModalAttributes(Ei,this._beneficiariesBullets);break;case"cumulus":this._configModalAttributes(Si)}}_configModalAttributes(e,t){if("full"===e.height){const{headerType:i,headerText:a,microillustration:r,heading:o,texts:n,customContent:l}=e;this.fullHeight=!0,this.headerType=i,this.headerText=a,this.microillustration=r,this.heading=o,this.texts=n,this.hasCustomContent=l,this.titleIcon=r?"":e.titleIcon,this.hasCustomContent&&(this.customContent=t)}else{const{modalType:t,titleIcon:i,titleText:a,bodyText:r}=e;this.modalType=t,this.titleIcon=i,this.titleText=a,this.bodyText=r}this.events=e.events,this.primaryButtonText=e.primaryButtonText,this.secondaryButtonText=e.secondaryButtonText}_changedModalVisibility(e){this.fullHeight&&this._fireEvent(this,"status-full-height-modal",e)}get _beneficiariesBullets(){return p`
      <bbva-text class="grey-text inner-header" font-weight="500" size="S" text="${this.t("metasegura-error-beneficiary-internal-title")}"></bbva-text>
      <bbva-list-bullet icon="coronita:bullet1">
        <bbva-text size="S" tag="span" text="${this.t("metasegura-error-beneficiary-bullet-one")}"></bbva-text>
      </bbva-list-bullet>
      <bbva-list-bullet icon="coronita:bullet1">
        <bbva-text size="S" tag="span" text="${this.t("metasegura-error-beneficiary-bullet-two")}"></bbva-text>
      </bbva-list-bullet>
    `}render(){return p`
    <bbva-help-modal
      id="alertModal"
      class="${this.fullHeight?"hide-top-paddding-modal":""}"
      ?full-height="${this.fullHeight}"
      ?fixed-footer="${this.fullHeight&&!this.hasCustomContent}"
      header-type="${this.headerType}"
      header-text="${this.fullHeight?this.t(this.headerText):""}"
      ?hide-content-padding-top="${this.fullHeight&&this.microillustration}"
      modal-type="${this.modalType}"
      title-icon="${this.titleIcon}"
      title-text="${this.t(this.titleText)}"
      body-text="${this.t(this.bodyText)}"
      button-text="${this.t(this.primaryButtonText)}"
      link-text="${this.t(this.secondaryButtonText)}"
      i-o-s-devices="[]"
      @help-modal-header-right-primary-click="${e=>this._fireEvent(e.target,this.events.iconHeader)}"
      @help-modal-veil-click="${e=>this._fireEvent(e.target,this.events.veil)}"
      @help-modal-footer-button-click="${e=>this._fireEvent(e.target,this.events.footerButton,this.primaryButtonData)}"
      @help-modal-footer-link-click="${e=>this._fireEvent(e.target,this.events.footerlink)}"
      @help-modal-open="${()=>{this._fireEvent(this,`open-${this.modalId}-modal`),this._changedModalVisibility("open")}}"
      @help-modal-close="${()=>{this._changedModalVisibility("close")}}"
    >
      ${this.fullHeight?p`
            <div slot="slot-content">
              ${this.microillustration?p`
                  <bbva-panel-info
                    microillustration="${this.microillustration}"
                    heading="${this.t(this.heading)}"
                  ></bbva-panel-info>`:""}

              ${this.texts.map((e=>p`<bbva-text class="${e.key}" alignment="center" tag="span" text="${this.t(e.value)}"></bbva-text>`))}

              ${this.hasCustomContent?this.customContent:""}

            </div>`:""}
    </bbva-help-modal>
  `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}customElements.define(at.is,at),customElements.define(rt.is,rt),customElements.define(zt.is,zt);class Ri extends(c(Fe(b))){static get is(){return"bbva-metasegura-edit-percentages"}static get scopedElements(){const e=[ie,at,ot,Mt,rt,zt,v,ne];return Ri.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},listBeneficiaries:{type:Array},colors:{type:Array},dataDonut:{type:String},totalPercentage:{type:Number},messageError:{type:String}}}constructor(){super(),this.show=!1,this.title="metasegura-beneficiaries-edit-percentages-header",this.messageError="",this.listBeneficiaries=[],this.colors=["#5BBEFF","#F8CD51","#2DCCCD","#F78BE8"],this.dataDonut="",this.totalPercentage=100}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}get _beneficiariesInputs(){const e=this.shadowRoot.querySelector(".beneficiaries-percentages");return Array.from(e.querySelectorAll(".percentage-input"))}get _donutChart(){return this.shadowRoot.querySelector("#chart")}getfullName(e,t,i){return`${e} ${t} ${i}`}_dataVisualizationDonut(){const e=[];return this.listBeneficiaries.forEach(((t,i)=>{e.push(JSON.stringify({value:t.percentage,color:this.colors[i]}))})),e.toString()}_verifyPercentageTotal(e){const t=e.target;let i=0;t.amount>=100||t.amount<=0?(t.errorMessage=this.t("metasegura-beneficiaries-edit-percentages-alert-input"),t.invalid=!0):(t.errorMessage="",t.invalid=!1),this._beneficiariesInputs.forEach((e=>{i+=parseFloat(e.amount)||0})),this.totalPercentage=i,100===this.totalPercentage?(this._beneficiariesInputs.forEach(((e,t)=>{this.listBeneficiaries[t].percentage=parseFloat(e.amount)||0})),this.dataDonut=this._dataVisualizationDonut()):this.dataDonut=JSON.stringify({value:i,color:this.colors[0]}),this._donutChart.animate()}_closeAndResetData(e){this._fireEvent(e.target,"edit-percentage-close"),this.totalPercentage=100,this.dataDonut=this._dataVisualizationDonut()}get _inputs(){return p`
      <div class="beneficiaries-percentages">
      ${this.listBeneficiaries.map(((e,t)=>{const{name:i,lastName:a,secondLastName:r,relationship:o,percentage:n}=e,l=this.getfullName(i,a,r);return p`
          <bbva-list-legend
            bar-legend-color="${this.colors[t]}"
            label="${o.text} - ${l}"
            label-ellipsis
            description=""
            hide-padding-bottom=""
          ></bbva-list-legend>
          <bbva-form-amount
            class="percentage-input"
            name="beneficiary${t}"
            label="${this.t("metasegura-beneficiaries-edit-percentages-input-label")}"
            amount="${n}"
            symbol="%"
            error-icon="coronita:alert"
            clear-icon="coronita:close"
            language="en"
            decimal-digits="0"
            maxlength="3"
            inputmode="numeric"
            @input="${this._verifyPercentageTotal}"
            @form-field-input-blur="${this._verifyPercentageTotal}"
          ></bbva-form-amount>
        `}))}
      </div>
    `}get _header(){return p`
      <bbva-header-main
        id="editBeneficiariesHeader"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>this._closeAndResetData(e)}"
      ></bbva-header-main>
    `}get _content(){return p`
      <div>
        <bbva-text size="L" alignment="center" font-weight="500" text="${this.t("metasegura-beneficiaries-edit-percentages-total")}"></bbva-text>
        <bbva-data-visualization-donut
          class="chart ${100!==this.totalPercentage?"amount-alert":""}"
          type="percentage"
          id="chart"
          sort="[[sort]]"
          stroke-color="#fff"
          amount="${this.totalPercentage}"
          amount-variant="l"
          currency-code="%"
          language="en"
          stroke-width="0"
          data="[${this.dataDonut}]"
        ></bbva-data-visualization-donut>
        ${100!==this.totalPercentage?p`
            <bbva-notification-help
              class="alert percentage-alert"
              icon="coronita:alert"
              text="${this.t("metasegura-beneficiaries-edit-percentages-alert-donut")}"
            ></bbva-notification-help>`:""}
        ${this._inputs}
      </div>
      <div class="action-buttons">
        <bbva-button-default
          id="savePercentages"
          ?disabled="${100!==this.totalPercentage||this.listBeneficiaries.some((e=>0===e.percentage))}"
          @click="${e=>this._closeAndResetData(e)}">
          ${this.t("metasegura-continue-label")}
        </bbva-button-default>
      </div>
    `}render(){return p`
      <bbva-transition-container id="percentagesFormContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container expand-container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}get _formAmounts(){return Array.from(this.shadowRoot.querySelectorAll("bbva-form-amount"))}_setPercentageSymbol(){this._formAmounts.length>1&&this._formAmounts.forEach((e=>{e.shadowRoot.querySelector(".back-currency.right").innerText="%"}))}updated(e){e.has("show")&&void 0!==e.get("show")&&(this.dataDonut=this._dataVisualizationDonut(),this.requestUpdate()),this._setPercentageSymbol()}}const qi=new o;var Ni=r`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${qi.mediaRules()}`;const Oi=new o;const ji={dark:r`
    ${r`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${n(l.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${n(l.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${n(l.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${n(l.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${n(l.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${n(l.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${n(l.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${n(l.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${Oi.mediaRules()}`}
    ${le.dark}
    ${S.dark}
  `,light:r`
    ${Ni}
    ${le.light}
    ${S.light}
  `};var Ui=r`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${n(l.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${n(l.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${n(l.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${n(l.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${n(l.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${n(l.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${n(l.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  display: block;
  box-sizing: border-box;
  position: relative;
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

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${n($.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${n($.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${n(N.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${n($.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${n(N.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  color: var(--_invalid-field-clear-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]):host([readonly]).wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_invalid-action-icon-color);
  --bbva-button-icon-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${n($.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${n(N.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
.info .message-icon {
  color: var(--_info-message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-core-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;class Ki extends(c(d(se))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":ce,"bbva-text":v,"bbva-core-icon":Z,"bbva-link":V}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=ae(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=K(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=E(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?p`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${I(this.linkHref)}"
            aria-label="${this.t("bbva-form-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?p`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,Ui,ji.light,ji.dark,m("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return p`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return p`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return p`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return p` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?p`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?p`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?p`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return p`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}customElements.define(Ki.is,Ki),f("colors.cool70"),f("colors.primaryCoreLightened"),f("colors.cool20"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened"),f("colors.cool20"),f("colors.cool20"),f("colors.cool20"),f("colors.cool20"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened"),f("colors.tertiaryType1Light"),f("colors.cool20"),f("colors.cool20"),f("colors.cool70"),f("colors.primaryCoreLightened"),f("colors.tertiaryType1Light"),f("colors.tertiaryType1Light"),f("colors.tertiaryType1Light"),f("colors.primarySubdued"),f("colors.primaryCoreLightened"),f("colors.tertiaryType1Light"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened"),f("colors.primaryCoreLightened");var Gi=r`:host {
  display: block;
  box-sizing: border-box;
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

.wrapper {
  display: flex;
}

.field {
  flex: auto;
}

.action {
  flex: none;
}
${(new o).mediaRules()}`;const Wi={light:r`
    ${ji.light}
    ${le.light}
  `,dark:r`
    ${ji.dark}
    ${le.dark}
  `};class Xi extends(c(d(Ki))){static get is(){return"bbva-form-search"}static get scopedElements(){return{"bbva-button-icon":ce,"bbva-core-icon":Z,"bbva-text":v}}static get properties(){return{disabledButton:{type:Boolean,attribute:"disabled-button"},variant:{type:String}}}constructor(){super(),this.type="search",this.actionType="submit",this.actionIcon=be(),this.actionAccessibleText="bbva-form-search-submit",this.actionIntoForm=!0}firstUpdated(e){super.firstUpdated(e),this._field=this.shadowRoot.querySelector(".field"),this._action=this.shadowRoot.querySelector(".action")}updated(e){super.updated&&super.updated(e),e.has("variant")&&"trigger"===this.variant&&this._field.addEventListener("click",this.handleInputClick)}static get styles(){return[super.styles,Gi,m("bbva-form-search-shared-styles"),Wi.light,Wi.dark]}handleInputClick(){this.dispatchEvent(new CustomEvent("form-search-input-click",{detail:!0,bubbles:!0,composed:!0}))}get actionButton(){return p`
      <bbva-button-icon
        class="action"
        type="${this.actionType}"
        ?disabled="${this.disabled||this.disabledButton||this.readonly||!this.value}"
        .icon="${this.actionIcon}"
        .size="${this.actionIconSize}"
        @click="${this.submitInput}"
        aria-label="${this.t(this.actionAccessibleText)}"
      >
      </bbva-button-icon>
    `}submitInput(){this.value&&this.dispatchEvent(new CustomEvent("form-search-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}}customElements.define(Xi.is,Xi),customElements.define(t.is,t);class Yi extends(c(Fe(b))){static get is(){return"bbva-metasegura-register-address"}static get scopedElements(){const e=[ie,Ki,Xi,ve,me,Mt,t,ne];return Yi.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},disabledContinueButton:{type:Boolean},street:{type:String},outerN:{type:String},innerN:{type:String},zipCode:{type:String},colonies:{type:Array},municipality:{type:String},state:{type:String},country:{type:String},colony:{type:Object},disabledSearchButton:{type:Boolean},showGeographicPlaceInfo:{type:Boolean}}}constructor(){super(),this.show=!1,this.title="metasegura-beneficiaries-step-title",this.street="",this.outerN="",this.innerN="",this.zipCode="",this.colonies=[],this.municipality="",this.state="",this.country="",this.colony={id:""},this.disabledSearchButton=!0,this.disabledContinueButton=!0,this.showGeographicPlaceInfo=!1}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}get _formRegisterAddress(){return this.shadowRoot.querySelector("#directionForm")}editAddress(e){this.street=e.street,this.innerN=e.innerN,this.outerN=e.outerN,this.zipCode=e.zipCode,this.country=e.country,this.colony=e.colony,this.colonies=[e.colony],this.state=e.state,this.municipality=e.municipality,this.disabledContinueButton=!1,this.showGeographicPlaceInfo=!0}setAddressValues(e){const{zipCode:t,country:i,state:a,municipality:r,colonies:o}=e;this.zipCode=t,this.country=i,this.state=a,this.municipality=r,this.colonies=o,this.showGeographicPlaceInfo=!0}closeAndResetModal(e){this.street="",this.innerN="",this.outerN="",this.resetPlace(),this._fireEvent(e.target,"register-address-close")}resetPlace(){this.zipCode="",this.colonies=[],this.municipality="",this.state="",this.country="",this.disabledContinueButton=!0,this.colony={id:""},this.showGeographicPlaceInfo=!1}_getAllFormFields(){if(this.zipCode){const e=this._formRegisterAddress,t=Array.from(e.querySelectorAll('[data-tag-name="bbva-form-field"][required]')),i=e.querySelector('[data-tag-name="bbva-form-select"]'),a=e.querySelector('[data-tag-name="bbva-form-search"]');t.push(i,a),this.disabledContinueButton=t.some((e=>""===e.value))}}_submitAddres(e){e.preventDefault();const t=this._formRegisterAddress;let i=Object.fromEntries(new FormData(t));i=Object.assign(i,{colony:this.colonies.find((e=>e.value===i.colony)),municipality:this.municipality,state:this.state,country:this.country}),i.colony.selected=!0,this._fireEvent(this,"register-address",i),this.closeAndResetModal(e)}get _header(){return p`
      <bbva-header-main
        id="registerAddressHeader"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>this.closeAndResetModal(e)}"
      ></bbva-header-main>
    `}get _content(){return this.show?p`
        <form id="directionForm" @input="${this._getAllFormFields}" class="expand-container">
          <div>
            <bbva-form-field
              id="street" class="input-field"
              clear-icon="coronita:close"
              name="street" label="${this.t("metasegura-register-address-form-label-street")}"
              required validate-on-blur
              value="${this.street}"
            ></bbva-form-field>
            <bbva-form-field
              clear-icon="coronita:close"
              id="outerN" class="input-field"
              name="outerN" label="${this.t("metasegura-register-address-form-label-outer-number")}"
              required validate-on-blur
              value="${this.outerN}"
            ></bbva-form-field>
            <bbva-form-field
              id="innerN" class="input-field"
              clear-icon="coronita:close"
              name="innerN" label="${this.t("metasegura-register-address-form-label-inner-number")}"
              optional-label="(optional)"
              value="${this.innerN}"
            ></bbva-form-field>
            <bbva-form-search
              id="zipCode" class="input-field"
              name="zipCode" label="${this.t("metasegura-register-address-form-label-zipcode")}"
              clear-icon="coronita:close" action-icon="coronita:search"
              required validate-on-blur allowed-pattern="[0-9]" ?disabled-button="${this.disabledSearchButton}"
              maxlength="5" value="${this.zipCode}"
              inputmode="numeric"
              @form-search-button-submit="${e=>this._fireEvent(e.target,"show-spinner")}"
              @input=${e=>{this.disabledSearchButton=5!==e.target.value.length,5!==e.target.value.length&&this.resetPlace()}}
            ></bbva-form-search>

            <div class="${this.showGeographicPlaceInfo?"":"address-data-hide"}">
              <bbva-form-select
                id="colony" name="colony"
                class="input-field"
                ?disabled="${""===this.zipCode}"
                open-icon="coronita:unfold" close-icon="coronita:fold"
                label="${this.t("metasegura-register-address-form-label-colony")}"
                @change="${this._getAllFormFields}" required
              >
                ${this.colonies.map((e=>p`<bbva-form-option value="${e.value}" ?selected="${e.selected}">${e.text}</bbva-form-option>`))}
              </bbva-form-select>
              <bbva-list-simple
                id="municipality" variant="stacked"
                name="municipality" description="${this.municipality}"
                label="${this.t("metasegura-register-address-form-label-municipality")}"
              ></bbva-list-simple>
              <bbva-list-simple
                id="state" variant="stacked"
                name="state" description="${this.state}"
                label="${this.t("metasegura-register-address-form-label-state")}"
              ></bbva-list-simple>
              <bbva-list-simple
                id="country" variant="stacked"
                name="country" description="${this.country}"
                label="${this.t("metasegura-register-address-form-label-country")}"
              ></bbva-list-simple>
            </div>
          </div>

          <div class="action-buttons">
            <bbva-button-default id="registerAddressBtn" variant="primary" @click="${e=>this._submitAddres(e)}" ?disabled="${this.disabledContinueButton}">${this.t("metasegura-continue-label")}</bbva-button-default>
            <bbva-button-default variant="secondary" @click="${e=>this.closeAndResetModal(e)}">${this.t("metasegura-close-label")}</bbva-button-default>
          </div>
        </form>`:""}render(){return p`
      <bbva-transition-container id="addressFormContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}const Qi=new o;var Ji=r`:host {
  display: block;
  box-sizing: border-box;
  --_form-date-clear-icon-color: var(--bbva-form-date-dark-mode-clear-icon-color, var(--bbva-form-date-clear-icon-color, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_form-date-invalid-clear-icon-color: var(--bbva-form-date-dark-mode-invalid-clear-icon-color, var(--bbva-form-date-invalid-clear-icon-color, var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_form-date-readonly-clear-color: var(--bbva-form-date-dark-mode-readonly-clear-icon-color, var(--bbva-form-date-readonly-clear-icon-color, var(--colorsSecondary500, ${n(l.secondary500)})));
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

.slot-input ::slotted(input) {
  padding-right: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 15) * 1em);
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: 100%;
}
:host(:not([filled])) .slot-input ::slotted(input) {
  opacity: 0;
}
:host([readonly][filled]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input), :host([focused]) .slot-input ::slotted(input) {
  opacity: 1;
}

.clear {
  display: flex;
  justify-content: center;
  align-items: center;
  width: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-clear-icon-color);
}

:host([invalid]) .clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-invalid-clear-icon-color);
}

:host([readonly]) .clear [data-tag-name=bbva-core-icon] {
  color: var(--_form-date-readonly-clear-color);
}

.simulate-input.field {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.simulate-input.field .simulate-input-wrapper {
  position: relative;
}
.simulate-input.field .simulate-input-wrapper .info {
  display: block;
  font-size: var(--fontSizeOptionsFontSize40, ${n(pe.fontSize40)});
  padding: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) 0 0 0;
  color: var(--colorsSecondary600, ${n(l.secondary600)});
}
.simulate-input.field .simulate-input-wrapper .icon {
  position: absolute;
  right: calc(((-0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  transform: translateY(-50%);
  color: var(--colorsPrimaryMedium, ${n(l.primaryMedium)});
  width: 1.5rem;
  height: 1.5rem;
}
${Qi.mediaRules()}`;var ea=r`[ambient^=light] {
  --bbva-form-date-clear-icon-color: initial;
  --bbva-form-date-invalid-clear-icon-color: initial;
  --bbva-form-date-readonly-clear-icon-color: initial;
}
${(new o).mediaRules()}`;const ta=new o;const ia={dark:r`
    ${r`[ambient^=dark] {
  --bbva-form-date-clear-icon-color: var(--colorsPrimaryVariantLightened, ${n(l.primaryVariantLightened)});
  --bbva-form-date-invalid-clear-icon-color: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-form-date-readonly-clear-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${ta.mediaRules()}`}
    ${ji.dark}
  `,light:r`
    ${ea}
    ${ji.light}
  `};class aa extends(c(Ki)){static get is(){return"bbva-form-date"}static get properties(){return{simulated:{type:Boolean},simulatedDisplayDate:{type:String,attribute:"simulated-display-date"}}}static get scopedElements(){return{"bbva-core-icon":Z,"bbva-text":v}}constructor(){super(),this.type="date",this.clearIcon=ue(),this.simulated=!1}static get styles(){return[super.styles,Ji,ia.light,ia.dark,m("bbva-form-date-shared-styles")]}get valueAsDate(){return this._formElement.valueAsDate}get valueAsNumber(){return this._formElement.valueAsNumber}stepDown(){this._formElement.stepDown(),this.value=this._formElement.value}stepUp(){this._formElement.stepUp(),this.value=this._formElement.value}get field(){return p`
      ${this.simulated?p`
            <div class="simulate-input field">
              <label class="label" for="info"> ${this.inputLabel} </label>
              <div class="simulate-input-wrapper">
                <span class="info" id="info">
                  ${null!==this.simulatedDisplayDate&&"null"!==this.simulatedDisplayDate?this.simulatedDisplayDate:this.placeholder}
                </span>
                <span class="icon">
                  <bbva-core-icon .icon="${ue()}" aria-hidden="true"> </bbva-core-icon>
                </span>
              </div>
            </div>
          `:p`
            <div
              class="field"
              @keydown="${this._onFocusin}"
              @click="${this._onFocusin}"
              @focusin="${this._onFocusin}"
              @focusout="${this._onFocusout}"
            >
              ${this.clearIconBlock} ${this.labelledInput}
            </div>
          `}
    `}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button {\n        appearance: none;\n        display: none;\n      }\n      input#${this._formElementId}::-webkit-calendar-picker-indicator {\n        position: absolute;\n        top: 0;\n        left: 0;\n        color: transparent;\n        background: transparent;\n        opacity: 0;\n        width: 100%;\n        height: 100%;\n      }\n    `}get clearIconBlock(){return p`
      <span class="clear">
        <bbva-core-icon
          .icon="${this.clearIcon}"
          .size="${this.clearIconSize}"
          aria-hidden="true"
        ></bbva-core-icon>
      </span>
    `}}customElements.define(aa.is,aa);var ra=r`
:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: default;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  opacity: .4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: center;
}

.radio {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 1rem;
  height: 1rem;
  margin-right: .5em;
  border-radius: 50%;
  border: 1px solid #666666;
}

:host([active]) .radio {
  background-color: #E9E9E9;
}

.check {
  display: block;
  width: .5rem;
  height: .5rem;
  background-color: #004481;
  border-radius: 50%;
  opacity: 0;
}

:host([aria-checked=true]) .check {
  opacity: 1;
}

.slot-control ::slotted(input[type=radio]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}
`;class oa extends(P(b)){static get properties(){return{disabled:{type:Boolean},readonly:{type:Boolean},value:{type:String,reflect:!0},checked:{type:Boolean,reflect:!0},required:{type:Boolean},name:{type:String,reflect:!0},form:{type:String},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this.value="on",this.__active=!1,this._formElementId=ge(),this.checked=!1,this.disabled=!1,this.readonly=!1,this._onClick=this._onClick.bind(this),this._onKeyUp=this._onKeyUp.bind(this),this._onKeyDown=this._onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),fe(this,"down",(()=>{!this._disabled&&(this.active=!0)})),fe(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._formElement=this.shadowRoot.querySelector(`#${this._formElementId}`),this._formElement&&this.appendChild(this._formElement),this._setInitialAttribute("role","radio"),this.hasAttribute("autofocus")&&(this._updateTabIndex(),this.focus())}updated(e){(e.has("disabled")||e.has("readonly"))&&this.setAttribute("aria-disabled",this._disabled.toString()),e.has("checked")&&(this.setAttribute("aria-checked",this.checked.toString()),this.checked&&(this._uncheckGroup(),this.dispatchEvent(new CustomEvent("change",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input",{bubbles:!0})))),(e.has("disabled")||e.has("readonly")||e.has("checked"))&&this._updateTabIndex()}get active(){return this.__active}set active(e){e!==this.__active&&(this.__active=e,e?this.setAttribute("active",""):this.removeAttribute("active"),this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.__active}})))}get _disabled(){return this.disabled||this.readonly&&!this.checked}static get styles(){return[ra,m("bbva-core-radio-shared-styles")]}render(){return p` ${this._labelledInput} ${this._radio} `}get _labelledInput(){return p` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return p`
      <slot name="input-template">
        <span class="radio">
          <span class="check"></span>
        </span>
      </slot>
    `}get _labelTemplate(){return p` <span class="label"><slot></slot></span> `}get _radio(){return p`
      <span class="slot-control"><slot name="_radio"></slot></span>

      <input
        aria-hidden="true"
        @change="${this._onChange}"
        ?checked="${this.checked}"
        ?disabled="${this._disabled}"
        form="${I(this.form)}"
        id="${this._formElementId}"
        @input="${this._onInput}"
        name="${I(this.name)}"
        ?required="${this.required}"
        slot="_radio"
        tabindex="-1"
        type="radio"
        .value="${this.value}"
      />
    `}_queryParentRoot(e,t){const i=e.getRootNode()||document.documentElement;return Array.from(i.querySelectorAll(t))}_queryGroup(e=!1){return this.name?this._queryParentRoot(this,`${this.nodeName.toLowerCase()}[name=${this.name}]${e?":not([aria-disabled=true])":""}`):[]}_uncheckGroup(){const e=this._queryGroup();for(const t of e)t!==this&&(t.checked=!1,t._updateTabIndex())}_updateTabIndex(){this.setAttribute("tabindex",!this.checked&&this._isGroupChecked()||this._disabled?"-1":"0")}_isGroupChecked(){return this._queryGroup().find((e=>e.checked))}_setInitialAttribute(e,t){this.hasAttribute(e)||this.setAttribute(e,t)}_dispatchEvent(e){this.dispatchEvent(new CustomEvent(e,{bubbles:!0}))}_onInput(e){e.preventDefault(),e.stopPropagation()}_onChange(e){e.preventDefault(),e.stopPropagation(),this._onClick(e)}_onClick(e){if(this._disabled)return e.preventDefault(),e.stopPropagation(),void e.stopImmediatePropagation();this.checked=!0}_onKeyUp(e){"Enter"!==e.key&&" "!==e.key||!this.active||(this.active=!1,this.checked=!0,e.preventDefault(),e.stopPropagation())}_onKeyDown(e){"Enter"!==e.key&&" "!==e.key||(this.active=!0,e.preventDefault(),e.stopPropagation());["ArrowUp","ArrowRight","ArrowDown","ArrowLeft"].includes(e.key)&&this._row(e)}_row(e){const t=this._queryGroup(!0),i=t.indexOf(this),a=this._nextIndex(t,i,e.key);if(null!==a){const i=t[a];i.checked=!0,i.focus(),e.stopPropagation(),e.preventDefault()}}_nextIndex(e,t,i){if(0===e.length)return null;switch(i){case"ArrowUp":case"ArrowLeft":return t-1<0?e.length-1:t-1;case"ArrowRight":case"ArrowDown":return t+1>e.length-1?0:t+1;default:return null}}}const na=new o;var la=r`:host {
  --_color: var(--bbva-form-radio-button-color, var(--colorsSecondary600, ${n(l.secondary600)}));
  --_readonly-color: var(--bbva-form-radio-button-readonly-color,var(--colorsSecondary500, ${n(l.secondary500)}));
  --_radio-border-color: var(--bbva-form-radio-button-radio-border-color,var(--colorsSecondary500, ${n(l.secondary500)}));
  --_radio-bg-color: var(--bbva-form-radio-button-radio-bg-color,var(--colorsSecondary100, ${n(l.secondary100)}));
  --_radio-check-bg-color: var(--bbva-form-radio-button-radio-check-bg-color,var(--colorsPrimaryCore, ${n(l.primaryCore)}));
  --_error-color: var(--bbva-form-radio-button-error-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)}));
  --_error-bg-color: var(--bbva-form-radio-button-error-bg-color,var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)}));
  --_error-icon-color: var(--bbva-form-radio-button-error-icon-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)}));
  --_info-icon-color: var(--bbva-form-radio-button-info-icon-color, var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)}));
  --_variant-amount-clip-color: var(--bbva-form-radio-button-variant-amount-clip-color,var(--colorsSecondary500, ${n(l.secondary500)}));
  --_variant-icon-clip-color: var(--bbva-form-radio-button-variant-icon-clip-color,var(--colorsSecondary400, ${n(l.secondary400)}));
  --_variant-help-clip-color: var(--bbva-form-radio-button-variant-help-clip-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)}));
  --_variant-card-description-color: var(--bbva-form-radio-button-variant-card-description-color,var(--colorsSecondary600, ${n(l.secondary600)}));
  --_variant-bold-icon-description-color: var(--bbva-form-radio-button-variant-bold-icon-description-color, var(--colorsSecondary500, ${n(l.secondary500)}));
  display: block;
  position: relative;
  font-size: var(--typographyTypeSmall, ${n($.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${n(N.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
  color: var(--_color);
  box-sizing: border-box;
  cursor: default;
}

:host([readonly]) {
  color: var(--_readonly-color);
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

.container {
  display: flex;
  align-items: flex-start;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem) 0;
}

.radio {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 2rem;
  height: 2rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  border-radius: 50%;
  border: 1px solid var(--_radio-border-color);
  background-color: var(--_radio-bg-color);
}
:host([aria-invalid=true]) .radio {
  background-color: var(--_error-bg-color);
  border-color: var(--_error-color);
}
.radio .check {
  display: block;
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  background-color: var(--_radio-check-bg-color);
  border-radius: 50%;
  opacity: 0;
}
:host([aria-checked=true]) .radio .check {
  opacity: 1;
}
:host([aria-invalid=true]) .radio .check {
  background-color: var(--_error-color);
}
:host([readonly]) .radio .check {
  background-color: var(--_readonly-color);
}

.content {
  flex: auto;
  display: flex;
  align-items: flex-start;
  min-width: 0;
}

.main {
  flex: auto;
  min-width: 0;
  display: block;
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${n($.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${n(N.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}

.clip {
  flex: none;
  display: flex;
  align-items: center;
  height: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.error,
.info {
  display: flex;
  align-items: center;
}
.error-icon,
.info-icon {
  min-width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.error-message,
.info-message {
  font-size: var(--typographyType3XSmall, ${n($.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${n(N.type3XSmall)});
}

.error-icon {
  color: var(--_error-icon-color);
}

.info-icon {
  color: var(--_info-icon-color);
}

.notifications {
  display: flex;
  flex-direction: column;
}

:host([variant=amount]) .clip {
  color: var(--_variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=icon-bold]) .clip {
  color: var(--_variant-icon-clip-color);
}

:host([variant=help]) .clip {
  color: var(--_variant-help-clip-color);
}

:host([variant=icon-bold]) {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}
:host([variant=icon-bold]) .description {
  color: var(--_variant-bold-icon-description-color);
}

:host([variant=card]) .description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${n(x.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${n(x.bookItalic.fontStyle)});
  color: var(--_variant-card-description-color);
  display: flex;
}
:host([variant=card]) .description ::slotted(bbva-badge-default) {
  margin-left: 0.5rem;
}

:host([aria-disabled=true]:not([readonly])) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

.slot-control ::slotted(input[type=radio]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}

.medium {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}
${na.mediaRules()}`;const sa=new o;var ca=r`[ambient^=light] {
  --bbva-form-radio-button-color: initial;
  --bbva-form-radio-button-radio-border-color: initial;
  --bbva-form-radio-button-radio-bg-color: initial;
  --bbva-form-radio-button-radio-check-bg-color: initial;
  --bbva-form-radio-button-error-color: initial;
  --bbva-form-radio-button-error-icon-color: initial;
  --bbva-form-radio-button-info-icon-color: initial;
  --bbva-form-radio-button-error-bg-color: initial;
  --bbva-form-radio-button-readonly-color: initial;
  --bbva-form-radio-button-variant-amount-clip-color: initial;
  --bbva-form-radio-button-variant-icon-clip-color: initial;
  --bbva-form-radio-button-variant-help-clip-color: initial;
  --bbva-form-radio-button-variant-card-description-color: initial;
  --bbva-form-radio-button-variant-bold-icon-description-color: initial;
}

[ambient^=light100] {
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${sa.mediaRules()}`;const da=new o;const ha={dark:r`
    ${r`[ambient^=dark] {
  --bbva-form-radio-button-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-radio-border-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-radio-bg-color: #0a5393;
  --bbva-form-radio-button-radio-check-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-error-color: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-form-radio-button-error-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-info-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-error-bg-color: var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)});
  --bbva-form-radio-button-readonly-color: var(--colorsSecondary300, ${n(l.secondary300)});
  --bbva-form-radio-button-variant-amount-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-icon-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-help-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-card-description-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-bold-icon-description-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}

[ambient^=dark100] {
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreLight, ${n(l.primaryCoreLight)});
}

[ambient^=dark400] {
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
}
${da.mediaRules()}`}
  `,light:r`
    ${ca}
  `};let ba=class extends(c(oa)){static get is(){return"bbva-form-radio-button"}static get scopedElements(){return{"bbva-core-icon":Z}}static get properties(){return{disabled:{type:Boolean},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},invalid:{type:Boolean,reflect:!0},readonly:{type:Boolean,reflect:!0},required:{type:Boolean,reflect:!0},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0}}}constructor(){super(),this.disabled=!1,this.errorIcon=K(),this.errorIconSize=16,this.errorMessage="",this.infoMessage="",this.infoIcon=E(),this.infoIconSize=16,this.readonly=!1,this.labelMedium=!1}updated(e){super.updated&&super.updated(e),e.has("required")&&this.setAttribute("aria-required",this.required.toString()),e.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString())}static get styles(){return[R(),la,m("bbva-form-radio-button-shared-styles"),ha.dark,ha.light]}get _labelTemplate(){return p`
      <span class="content">
        <span class="main">
          <span class="label ${X({medium:this.labelMedium})}">
            <slot></slot>
          </span>
          <span class="description">
            <slot name="description"></slot>
          </span>
          <span class="notifications"> ${this._notifications} </span>
        </span>
        <span class="clip">
          <slot name="clip"></slot>
        </span>
      </span>
    `}get _notifications(){return p`
      ${this.invalid&&this.errorMessage?p`
            <span class="error">
              <bbva-core-icon
                class="error-icon"
                .icon="${this.errorIcon}"
                .size="${this.errorIconSize}"
              ></bbva-core-icon>
              <span class="error-message">${this.errorMessage}</span>
            </span>
          `:""}
      ${this.infoMessage?p`
            <span class="info">
              <bbva-core-icon
                class="info-icon"
                .icon="${this.infoIcon}"
                .size="${this.infoIconSize}"
              ></bbva-core-icon>
              <span class="error-message">${this.infoMessage}</span>
            </span>
          `:""}
    `}};customElements.define(ba.is,ba);const va=new o;var ma=r`:host {
  --_color: var(--bbva-form-radio-button-dark-mode-color, var(--bbva-form-radio-button-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_readonly-color: var(--bbva-form-radio-button-dark-mode-readonly-color, var(--bbva-form-radio-button-readonly-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_radio-border-color: var(--bbva-form-radio-button-dark-mode-radio-border-color, var(--bbva-form-radio-button-radio-border-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_radio-bg-color: var(--bbva-form-radio-button-dark-mode-radio-bg-color, var(--bbva-form-radio-button-radio-bg-color,var(--colorsSecondary100, ${n(l.secondary100)})));
  --_radio-check-bg-color: var(--bbva-form-radio-button-dark-mode-radio-check-bg-color, var(--bbva-form-radio-button-radio-check-bg-color,var(--colorsPrimaryCore, ${n(l.primaryCore)})));
  --_error-color: var(--bbva-form-radio-button-dark-mode-error-color, var(--bbva-form-radio-button-error-color,var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)})));
  --_error-bg-color: var(--bbva-form-radio-button-dark-mode-error-bg-color, var(--bbva-form-radio-button-error-bg-color,var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)})));
  --_variant-amount-clip-color: var(--bbva-form-radio-button-variant-amount-clip-color,var(--colorsSecondary500, ${n(l.secondary500)}));
  --_variant-icon-clip-color: var(--bbva-form-radio-button-variant-icon-clip-color,var(--colorsSecondary400, ${n(l.secondary400)}));
  --_variant-help-clip-color: var(--bbva-form-radio-button-variant-help-clip-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)}));
  --_variant-card-description-color: var(--bbva-form-radio-button-variant-card-description-color,var(--colorsSecondary600, ${n(l.secondary600)}));
  --_variant-bold-icon-description-color: var(--bbva-form-radio-button-variant-bold-icon-description-color, var(--colorsSecondary500, ${n(l.secondary500)}));
  --_form-radio-button-container-active-bg-color: var(--bbva-form-radio-button-dark-mode-container-active-bg-color, var(--bbva-form-radio-button-container-active-bg-color, var(--colorsSecondary100, ${n(l.secondary100)})));
  display: block;
  position: relative;
  font-size: var(--typographyTypeSmall, ${n($.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${n(N.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
  color: var(--_color);
  min-height: 3rem;
  box-sizing: border-box;
  cursor: default;
}

:host([readonly]) {
  color: var(--_readonly-color);
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

.container {
  display: flex;
  align-items: flex-start;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1em) 0;
}
:host([active]) .container {
  background-color: var(--_form-radio-button-container-active-bg-color);
}

.box {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 2rem;
  height: 2rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  border-radius: 50%;
  border: 1px solid var(--_radio-border-color);
  background-color: var(--_radio-bg-color);
}
:host([aria-invalid=true]) .box {
  background-color: var(--_error-bg-color);
  border-color: var(--_error-color);
}
.box .check {
  display: block;
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  background-color: var(--_radio-check-bg-color);
  border-radius: 50%;
  opacity: 0;
}
:host([aria-checked=true]) .box .check {
  opacity: 1;
}
:host([aria-invalid=true]) .box .check {
  background-color: var(--_error-color);
}
:host([readonly]) .box .check {
  background-color: var(--_readonly-color);
}

.content {
  flex: auto;
  display: flex;
  align-items: flex-start;
  min-width: 0;
}

.main {
  flex: auto;
  min-width: 0;
  display: block;
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${n($.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${n(N.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}

.clip {
  flex: none;
  display: flex;
  align-items: center;
  height: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

:host([variant=amount]) .clip {
  color: var(--_variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=icon-bold]) .clip {
  color: var(--_variant-icon-clip-color);
}

:host([variant=help]) .clip {
  color: var(--_variant-help-clip-color);
}

:host([variant=icon-bold]) {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}
:host([variant=icon-bold]) .description {
  color: var(--_variant-bold-icon-description-color);
}

:host([variant=card]) .description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${n(x.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${n(x.bookItalic.fontStyle)});
  color: var(--_variant-card-description-color);
  display: flex;
}
:host([variant=card]) .description ::slotted(bbva-badge-default) {
  margin-left: 0.5rem;
}

.slot-control ::slotted(input[type=radio]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}

.medium {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}
${va.mediaRules()}`;const pa=new o;var ua=r`[ambient^=light] {
  --bbva-form-radio-button-color: initial;
  --bbva-form-radio-button-radio-border-color: initial;
  --bbva-form-radio-button-radio-bg-color: initial;
  --bbva-form-radio-button-radio-check-bg-color: initial;
  --bbva-form-radio-button-error-color: initial;
  --bbva-form-radio-button-error-bg-color: initial;
  --bbva-form-radio-button-readonly-color: initial;
  --bbva-form-radio-button-variant-amount-clip-color: initial;
  --bbva-form-radio-button-variant-icon-clip-color: initial;
  --bbva-form-radio-button-variant-help-clip-color: initial;
  --bbva-form-radio-button-variant-card-description-color: initial;
  --bbva-form-radio-button-variant-bold-icon-description-color: initial;
  --bbva-form-radio-button-container-active-bg-color: initial;
}

[ambient^=light100] {
  --bbva-form-radio-button-container-active-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${pa.mediaRules()}`;const ga=new o;const fa={dark:r`
    ${r`[ambient^=dark] {
  --bbva-form-radio-button-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-radio-border-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreLight, ${n(l.primaryCoreLight)});
  --bbva-form-radio-button-radio-check-bg-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-error-color: var(--colorsTertiaryType1Dark, ${n(l.tertiaryType1Dark)});
  --bbva-form-radio-button-error-bg-color: var(--colorsTertiaryType5Lightened, ${n(l.tertiaryType5Lightened)});
  --bbva-form-radio-button-readonly-color: var(--colorsSecondary300, ${n(l.secondary300)});
  --bbva-form-radio-button-variant-amount-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-icon-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-help-clip-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-card-description-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-button-variant-bold-icon-description-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}

[ambient^=dark100] {
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreLight, ${n(l.primaryCoreLight)});
  --bbva-form-radio-button-container-active-bg-color: var(--colorsPrimaryCore, ${n(l.primaryCore)});
}

[ambient^=dark400] {
  --bbva-form-radio-button-radio-bg-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
  --bbva-form-radio-button-container-active-bg-color: var(--colorsPrimaryCoreDark, ${n(l.primaryCoreDark)});
}
${ga.mediaRules()}`}
    ${At.dark}
    ${ye.dark}
    ${$e.dark}
  `,light:r`
    ${ua}
    ${At.light}
    ${ye.light}
    ${$e.light}
  `};class ya extends(c(h(xe))){static get is(){return"bbva-form-radio-button"}static get scopedElements(){return{"bbva-icon":D,"bbva-notification-help":zt,"bbva-divider":ke}}static get properties(){return{errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},invalid:{type:Boolean,reflect:!0},readonly:{type:Boolean,reflect:!0},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},label:{type:String},accessibilityIconAlertNotification:{type:String,attribute:"accessibility-icon-alert-notification"},accessibilityIconInfoNotification:{type:String,attribute:"accessibility-icon-info-notification"},divider:{type:String},disabledNotificationHelpTabindex:{type:Boolean,attribute:"disabled-notification-help-tabindex"}}}constructor(){super(),this.disabled=!1,this.errorIcon=K(),this.errorIconSize=16,this.infoIconSize=16,this.errorMessage="",this.infoMessage="",this.infoIcon=E(),this.readonly=!1,this.labelMedium=!1,this.type="radio",this.label="",this.accessibilityIconInfoNotification="",this.accessibilityIconAlertNotification="",this.divider="",this.disabledNotificationHelpTabindex=!1}updated(e){super.updated&&super.updated(e),e.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString())}static get styles(){return[super.styles,R(),ma,m("bbva-form-radio-button-shared-styles"),fa.dark,fa.light]}get _propsForDisabledUpdated(){return[...super._propsForDisabledUpdated,"readonly"]}get _propsForTabindexUpdated(){return[...super._propsForTabindexUpdated,"readonly"]}get _labelTemplate(){return p`
      <span class="content">
        <span class="main">
          <span class="label ${X({medium:this.labelMedium})}">
            <slot> ${this.label}</slot>
          </span>
          <span class="description">
            <slot name="description"></slot>
          </span>
          ${this._notifications}
        </span>
        <span class="clip">
          <slot name="clip"></slot>
        </span>
      </span>
    `}get _notifications(){return p`
      ${this.invalid&&this.errorMessage?p`
            <bbva-notification-help
              accessibility-label-icon="${this.accessibilityIconAlertNotification}"
              class="alert"
              icon="${this.errorIcon}"
              text="${this.errorMessage}"
              icon-size="${this.errorIconSize}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
              ?disabled-tabindex=${this.disabledNotificationHelpTabindex}
            >
            </bbva-notification-help>
          `:""}
      ${this.infoMessage?p`
            <bbva-notification-help
              accessibility-label-icon="${this.accessibilityIconInfoNotification}"
              icon="${this.infoIcon}"
              icon-size="${this.infoIconSize}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
              text="${this.infoMessage}"
              ?disabled-tabindex=${this.disabledNotificationHelpTabindex}
            >
            </bbva-notification-help>
          `:""}
    `}render(){return p`
      ${this._labelledInput} ${this._control}
      ${this.divider?p`<bbva-divider size="${this.divider}"></bbva-divider>`:p``}
    `}}f("colors.primaryCoreLightened"),f("colors.cool20"),f("colors.cool20"),f("colors.cool70"),f("colors.cool60"),f("colors.primaryMediumLight"),f("colors.tertiaryType1Light"),f("colors.cool60");const $a=new o;var xa=r`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${n(l.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${n($.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${$a.mediaRules()}`;const ka=new o;var _a=r`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${n(l.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${n(l.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${n(l.primaryMediumLight)});
}
${ka.mediaRules()}`;var Sa=r`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new o).mediaRules()}`;const Ma={dark:r`
    ${_a}
    ${fa.dark}
    ${S.dark}
    ${At.dark}
    ${s.dark}
  `,light:r`
    ${Sa}
    ${fa.light}
    ${S.light}
    ${At.light}
    ${s.light}
  `};class Ca extends(c(d(Me(b)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":ya,"bbva-notification-help":zt,"bbva-text":v,"bbva-link":V}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=K(),this.errorIconSize=16,this.infoIcon=E(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?p`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${I(this.linkHref)}"
          icon="${Ce()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return p`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[xa,m("bbva-form-radio-group-shared-styles"),Ma.dark,Ma.light]}render(){return p`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>p`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${I(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${I(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${I(e.accessibilityIconAlert)}"
              variant="${I(e.variant)}"
            >
              ${e.text?Le(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?p`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}}customElements.define(Ca.is,Ca);class La extends(c(Fe(b))){static get is(){return"bbva-metasegura-beneficiary-form"}static get scopedElements(){const e=[ie,aa,Ki,ve,me,ba,Ca,we,Mt,t,ne];return La.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},disabledContinueButton:{type:Boolean},disabledRegisterAddressButton:{type:Boolean},name:{type:String},lastName:{type:String},secondLastName:{type:String},relationshipList:{type:Array},birthDay:{type:String},direction:{type:Number},newDirection:{type:Boolean},address:{type:Object},addressLabel:{type:String},edited:{type:Boolean},beneficiaryId:{type:Number},customerAddress:{type:String,attribute:"customer-address"}}}constructor(){super(),this.show=!1,this.title="metasegura-beneficiaries-step-title",this.disabledContinueButton=!0,this.disabledRegisterAddressButton=!0,this.name="",this.lastName="",this.secondLastName="",this.relationshipList=[],this.birthDay="",this.direction=0,this.newDirection=!1,this.address={},this.addressLabel="",this.edited=!1,this.beneficiaryId=-1,this.customerAddress=""}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}get _formBeneficiary(){return this.shadowRoot.querySelector("#beneficiariesForm")}get _nameInput(){return this.shadowRoot.querySelector("#name")}get _radioGroup(){return this.shadowRoot.querySelector("#addDirection")}removeAddress(){this.newDirection=!1,this.address={},this.addressLabel="",this.direction=0,this._radioGroup.selected=0,this.disabledRegisterAddressButton=!0,this._getAllFormFields()}closeAndResetModal(e){this.edited=!1,this.beneficiaryId=-1,this.name="",this.lastName="",this.secondLastName="",this.birthDay="",this.direction=0;for(let e=0;e<this.relationshipList.length;e+=1)this.relationshipList[e].selected=!1;this.removeAddress(),this._fireEvent(e.target,"add-beneficiary-close"),this.disabledContinueButton=!0}setDate(e){this.birthDay=e.selectedDate,this._nameInput.focus(),this._nameInput.blur(),this._getAllFormFields()}setAddress(e){const{street:t,outerN:i,innerN:a,zipCode:r,colony:o,municipality:n,state:l,country:s}=e;this.newDirection=!0,this.address=e,this.addressLabel=`${t} #${i},${""!==a?` Int. #${a}`:""} Col. ${o.text}, ${n}, CP: ${r}, ${l}, ${s}.`,this.direction=1,this._getAllFormFields()}editBeneficiary(e,t){this.edited=!0,this.beneficiaryId=t,this.name=e.name,this.lastName=e.lastName,this.secondLastName=e.secondLastName,this.birthDay=e.birthDay,this.relationshipList.forEach(((t,i)=>{t.value===e.relationship.value&&(this.relationshipList[i].selected=!0)})),"new"===e.direction?this.setAddress(e.address):this.direction=0,this.disabledContinueButton=!1}_allowRegisterAddress(e){const t=e.target.value;this.disabledRegisterAddressButton="same"===t,this.direction="same"===t?0:1}_getAllFormFields(){let e;const t=this._formBeneficiary;if(t){e=Array.from(t.querySelectorAll("bbva-form-field")).map((e=>e.value));const i=t.querySelector("bbva-form-select").value,a=t.querySelector('[data-tag-name="bbva-form-date"]').value||this.birthDay;e.push(i,a)}else e=[this.name,this.lastName,this.secondLastName,this.relationshipList.find((e=>e.selected)).value,this.birthDay];this.direction?this.disabledContinueButton=e.some((e=>""===e))||!this.newDirection:this.disabledContinueButton=e.some((e=>""===e))}_submitBeneficiary(e){e.preventDefault();const t=this._formBeneficiary;let i=Object.fromEntries(new FormData(t));i.relationship=this.relationshipList.find((e=>e.value===i.relationship)),i.direction=this.direction?"new":"same",i=Object.assign(i,{address:this.address}),this.edited?this._fireEvent(e.target,"edit-beneficiary",{info:i,id:this.beneficiaryId}):this._fireEvent(e.target,"add-beneficiary",i),this.closeAndResetModal(e)}get _header(){return p`
      <bbva-header-main
        id="addBeneficiary"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>this.closeAndResetModal(e)}"
      ></bbva-header-main>
    `}get _content(){return this.show?p`
          <bbva-header-category class="internal-title" text="${this.t("metasegura-beneficiaries-add-beneficiary-tile")}"></bbva-header-category>
          <form id="beneficiariesForm" @input="${this._getAllFormFields}">
            <bbva-form-field
              id="name" class="input-field"
              clear-icon="coronita:close"
              allowed-pattern="^[a-zA-ZÑÁÉÍÓÚñáéíóú\\s]+$"
              name="name" label="${this.t("metasegura-beneficiaries-form-label-name")}"
              required validate-on-blur
              value="${this.name}"
            ></bbva-form-field>
            <bbva-form-field
              id="onelastName" class="input-field"
              clear-icon="coronita:close"
              allowed-pattern="^[a-zA-ZÑÁÉÍÓÚñáéíóú\\s]+$"
              name="lastName" label="${this.t("metasegura-beneficiaries-form-label-lastname")}"
              required validate-on-blur
              value="${this.lastName}"
            ></bbva-form-field>
            <bbva-form-field
              id="twolastName" class="input-field"
              clear-icon="coronita:close"
              allowed-pattern="^[a-zA-ZÑÁÉÍÓÚñáéíóú\\s]+$"
              name="secondLastName" label="${this.t("metasegura-beneficiaries-form-label-secondary-lastname")}"
              required validate-on-blur
              value="${this.secondLastName}"
            ></bbva-form-field>
            <bbva-form-select
              id="relationship" class="input-field"
              open-icon="coronita:unfold" close-icon="coronita:fold"
              name="relationship" label="${this.t("metasegura-beneficiaries-form-label-relationship")}"
              @change="${this._getAllFormFields}"
              required
            >
              ${this.relationshipList.map((e=>p`<bbva-form-option value="${e.value}" ?selected="${e.selected}">${e.text}</bbva-form-option>`))}
            </bbva-form-select>
            <bbva-form-date
              id="birthDay" class="input-field"
              clear-icon="coronita:calendar"
              name="birthDay"
              label="${this.t("metasegura-beneficiaries-form-label-birthday")}"
              required
              validate-on-blur
              value="${this.birthDay}"
              @click="${e=>{e.preventDefault(),this._fireEvent(e.target,"open-date-picker")}}"
            ></bbva-form-date>

            <bbva-header-category class="internal-title" text="${this.t("metasegura-beneficiaries-form-address-title")}"></bbva-header-category>
            <bbva-form-radio-group
              required id="addDirection"
              selected="${this.direction}"
              @change="${e=>this._allowRegisterAddress(e)}"
            >
              <bbva-form-radio-button
                id="addsameDirection"
                name="direction"
                value="same"
              >${this.t("metasegura-beneficiaries-form-same-direction")}
              </bbva-form-radio-button>
              <bbva-list-simple
                id="customerAddress"
                variant="stacked"
                label="${this.t("metasegura-beneficiaries-form-address-label")}"
                description-date="" description="${this.customerAddress}"
                action-link="${this.t("metasegura-beneficiaries-form-address-link-"+(this.customerAddress.includes("•")?"show":"hide"))}"
                @list-simple-link-action-link-click="${e=>this._fireEvent(e.target,"customer-address-request")}"
              ></bbva-list-simple>
              <bbva-form-radio-button
                id="addnewDirection"
                name="direction"
                value="new"
              >
                ${this.t("metasegura-beneficiaries-form-new-direction")}
                ${this.newDirection?"":p`
                  <bbva-button-default
                    id="registerAddress"
                    ?disabled="${this.disabledRegisterAddressButton}"
                    class="link-direction-button"
                    variant="link"
                    @click="${e=>this._fireEvent(e.target,"open-register-address")}">
                    ${this.t("metasegura-beneficiaries-form-register-new-direction")}
                  </bbva-button-default>`}
                </bbva-form-radio-button>
            </bbva-form-radio-group>

            ${this.newDirection?p`
              <bbva-list-simple
                id="address" variant="stacked"
                label-ellipsis="" description-date=""
                label="${this.t("metasegura-beneficiaries-form-new-address-label")}"
                description="${this.addressLabel}"
                action-icon="coronita:edit"
                action-accessibility-text="Edit"
                action-secondary-icon="coronita:trash"
                action-secondary-accessibility-text="Trash"
                @list-simple-icon-click="${e=>this._fireEvent(e.target,"edit-address",this.address)}"
                @list-simple-secondary-icon-click="${e=>this._fireEvent(e.target,"remove-address-alert")}"
              ></bbva-list-simple>`:""}
            <div class="action-buttons">
              <bbva-button-default id="addBeneficiaryBtn" variant="primary" ?disabled="${this.disabledContinueButton}" @click="${e=>this._submitBeneficiary(e)}">${this.t("metasegura-continue-label")}</bbva-button-default>
            </div>
          </form>`:""}render(){return p`
      <bbva-transition-container id="beneficiaryFormContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}class wa extends(nt(b)){static get is(){return"code-validator"}static get properties(){return{characters:{type:Number}}}constructor(){super(),this.characters=0}validate(e){return e.length===this.characters?(this._fireEvent(this,"code-valid",e),!0):(this._fireEvent(this,"code-error"),!1)}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}class Za extends(c(Fe(b))){static get is(){return"bbva-metasegura-executive-code"}static get scopedElements(){const e=[ie,Ki,Mt,Ze,v,ne,wa];return Za.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},disabledButton:{type:Boolean},characters:{type:Number},assistantCode:{type:String},messageError:{type:String},messageInfo:{type:String}}}constructor(){super(),this.show=!1,this.title="metasegura-executive-code-modal-header",this.assistantCode="",this.characters=13,this.messageError="",this.messageInfo="metasegura-executive-code-modal-info-message",this.disabledButton=!0}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}resetValues(){this.assistantCode="",this.messageError="",this.messageInfo="metasegura-executive-code-modal-info-message",this.disabledButton=!0}get _inputCode(){return this.shadowRoot.querySelector("#executiveCode")}_messageInfoHandler(){this.assistantCode=this._inputCode.value,(!this._inputCode.invalid||this._inputCode.value.length>0)&&(this.messageInfo="metasegura-executive-code-modal-info-message"),this.disabledButton=!(this._inputCode.value.length===this.characters)}get _header(){return p`
      <bbva-header-main
        id="executiveCodeHeader"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>{this._fireEvent(e.target,"executive-code-close"),this.resetValues()}}"
      ></bbva-header-main>
    `}get _content(){return this.show?p`
          <div>
            <bbva-panel-offer content-title="${this.t("metasegura-executive-code-modal-title")}" microillustration="bbvamanagerman">
              <bbva-text tag="span" size="S" alignment="center" text="${this.t("metasegura-executive-code-modal-description")}"></bbva-text>
            </bbva-panel-offer>
            <bbva-form-field
              id="executiveCode" class="input-field"
              name="code" clear-icon="coronita:close"
              label="${this.t("metasegura-executive-code-modal-header")}"
              info-message="${this.t(this.messageInfo,"",{characters:this.characters})}"
              info-icon="coronita:info" error-icon="coronita:alert"
              maxlength="${this.characters}" allowed-pattern="^[a-zA-Z0-9]+$"
              validator="code-validator" validate-on-blur
              error-message="${this.t("metasegura-executive-code-min-error","",{characters:this.characters})}"
              optional-label=""
              @input="${this._messageInfoHandler}"
            ></bbva-form-field>
            <code-validator
              characters="${this.characters}"
              @metasegura-code-error="${()=>{this.disabledButton=!0,this.messageInfo=""}}"
              @metasegura-code-valid="${e=>{this.disabledButton=!1,this.assistantCode=e.detail}}"
            ></code-validator>
          </div>
          <div class="action-buttons">
            <bbva-button-default id="addCode" @click="${e=>this._fireEvent(e.target,"register-assistance-code",this.assistantCode)}" ?disabled="${this.disabledButton}">Aplicar</bbva-button-default>
            <bbva-button-default variant="secondary" @click="${e=>{this._fireEvent(e.target,"executive-code-close"),this.resetValues()}}"
            >${this.t("metasegura-executive-code-modal-exit")}</bbva-button-default>
          </div> `:""}render(){return p`
      <bbva-transition-container id="executiveCodeContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container expand-container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}customElements.define(Ae.is,Ae),customElements.define(lt.is,lt);var Aa=r`[ambient^=light] {
  --bbva-list-currency-text-color: initial;
  --bbva-list-currency-secondary-text-color: initial;
  --bbva-list-currency-icon-color: initial;
  --bbva-list-currency-disabled-icon-color: initial;
}
${(new o).mediaRules()}`;const za=new o;var Ha=r`[ambient^=dark] {
  --bbva-list-currency-text-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-currency-secondary-text-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-currency-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-list-currency-disabled-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${za.mediaRules()}`;const Va={light:r`
    ${_.light}
    ${S.light}
    ${Aa}
  `,dark:r`
    ${_.dark}
    ${S.dark}
    ${Ha}
  `},Ta=new o;var Ea=r`:host {
  --_main-text-color: var(--bbva-list-currency-text-dark-mode-color, var(--bbva-list-currency-text-color,var(--colorsSecondary600, ${n(l.secondary600)})));
  --_secondary-text-color: var(--bbva-list-currency-secondary-text-dark-mode-color, var(--bbva-list-currency-secondary-text-color,var(--colorsSecondary500, ${n(l.secondary500)})));
  --_icon-color: var(--bbva-list-currency-icon-dark-mode-color, var(--bbva-list-currency-icon-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  --_disabled-flag-icon-color: var(--bbva-list-currency-disabled-icon-dark-mode-color, var(--bbva-list-currency-disabled-icon-color,var(--colorsPrimaryMedium, ${n(l.primaryMedium)})));
  display: block;
  box-sizing: border-box;
  width: 100%;
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

:host([disabled]) {
  opacity: 0.4;
  pointer-events: none;
  cursor: auto;
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

.container {
  display: flex;
  align-items: flex-start;
}

button {
  margin: 0;
  padding: 0;
  background: transparent;
  border: none;
  cursor: pointer;
}
button[disabled] {
  cursor: default;
}
:host(:not([focus-visible])) button {
  outline: none;
}

.flag {
  flex: none;
  display: flex;
  align-items: center;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.flag.button {
  margin-right: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.status > * {
  color: var(--_main-text-color);
}

.converter {
  flex: auto;
  min-width: 0;
}

.description,
.exchange bbva-text {
  color: var(--_secondary-text-color);
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}

.exchange {
  display: flex;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}
.exchange * {
  color: var(--_secondary-text-color);
}
.exchange [data-tag-name=bbva-amount] {
  font-size: var(--typographyType3XSmall, ${n($.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${n(N.type3XSmall)});
}

[data-tag-name=bbva-core-icon] {
  color: var(--_icon-color);
  width: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
  height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
[disabled] [data-tag-name=bbva-core-icon] {
  color: var(--_disabled-flag-icon-color);
}
:host([expanded]) .flag [data-tag-name=bbva-core-icon] {
  transform: rotate(180deg);
}

.information {
  flex: auto;
  overflow: hidden;
}
.information > * {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.information > * [data-tag-name=bbva-text] {
  color: var(--_main-text-color);
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}
.information-main {
  height: 2rem;
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.information-main [data-tag-name=bbva-text] {
  color: var(--_main-text-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(x.medium.fontStyle)});
}
.information .actions {
  display: flex;
}
.information .actions .action {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text],
[data-tag-name=bbva-link] {
  overflow: hidden;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([converter]) .flag,
:host([converter]) .switch {
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
${Ta.mediaRules()}`;const Ba="edit",Ia="remove",Pa="switch";class Da extends(c(d(P(w(b))))){static get is(){return"bbva-list-currency"}static get scopedElements(){return{"bbva-amount":A,"bbva-clip-flag":Ae,"bbva-core-icon":Z,"bbva-link":V,"bbva-text":v}}static get properties(){return{disabled:{type:Boolean,reflect:!0},converter:{type:Boolean},switchable:{type:Boolean},expanded:{type:Boolean,reflect:!0},disabledSelection:{type:Boolean,attribute:"disabled-selection"},noLink:{type:Boolean,attribute:"no-link"},editable:{type:Boolean},removable:{type:Boolean},countryId:{type:String,attribute:"country-id"},description:{type:String},currencyText:{type:String,attribute:"currency-text"},exchangeCurrencyCode:{type:String,attribute:"exchange-currency-code"},exchangeRateRatio:{type:Number,attribute:"exchange-rate-ratio"},selectCountryAccessibleText:{type:String,attribute:"select-country-accessible-text"},switchActionAccessibleText:{type:String,attribute:"switch-action-accessible-text"},removeActionAccessibleText:{type:String,attribute:"remove-action-accessible-text"},editActionAccessibleText:{type:String,attribute:"edit-action-accessible-text"},iconFlagSelect:{type:String,attribute:"icon-flag-select"},iconSwitchAction:{type:String,attribute:"icon-switch-action"},iconRemoveAction:{type:String,attribute:"icon-remove-action"},iconEditAction:{type:String,attribute:"icon-edit-action"},iconActionSize:{type:Number,attribute:"icon-action-size"},iconFlagSelectSize:{type:Number,attribute:"icon-flag-select-size"},exchangeDecimalDigits:{type:Number,attribute:"exchange-decimal-digits"}}}constructor(){super(),this.exchangeDecimalDigits=4,this.countryId="",this.exchangeRateRatio=0,this.selectCountryAccessibleText="bbva-list-currency-select-country",this.switchActionAccessibleText="bbva-list-currency-switch",this.removeActionAccessibleText="bbva-list-currency-remove",this.editActionAccessibleText="bbva-list-currency-edit",this.iconFlagSelect=ze(),this.iconSwitchAction=He(),this.iconRemoveAction=Ve(),this.iconEditAction=B(),this.iconActionSize=24,this.iconFlagSelectSize=24}static get styles(){return[Ea,m("bbva-list-currency-shared-styles"),Va.dark,Va.light]}get flag(){return p`
      ${this.converter?p`
            <button
              class="flag"
              ?disabled="${this.disabledSelection||this.disabled}"
              @click="${this.onCountryClick}"
            >
              <bbva-clip-flag
                data-tag-name="bbva-clip-flag"
                size="small"
                .icon="${this.countryId}"
              ></bbva-clip-flag>
              <span class="sr-only">
                ${this.currencyCode} - ${this.t(this.selectCountryAccessibleText)}
              </span>
              <bbva-core-icon
                data-tag-name="bbva-core-icon"
                .icon="${this.iconFlagSelect}"
                .size="${this.iconFlagSelectSize}"
              ></bbva-core-icon>
            </button>
          `:p`
            <div class="flag">
              <bbva-clip-flag
                data-tag-name="bbva-clip-flag"
                size="small"
                icon="${this.countryId}"
              ></bbva-clip-flag>
            </div>
          `}
    `}get converterBlock(){return p`
      <div class="converter">
        <bbva-text
          data-tag-name="bbva-text"
          class="description"
          tag="span"
          size="3XS"
          .text=${this.description}
        ></bbva-text>
        <div class="status">
          <bbva-amount
            data-tag-name="bbva-amount"
            variant="l"
            .amount="${this.amount}"
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
            .language="${this.language}"
          >
          </bbva-amount>
          <bbva-text
            data-tag-name="bbva-text"
            tag="span"
            size="S"
            .text=${this.currencyText}
            class="text"
          ></bbva-text>
        </div>
        <div class="exchange">
          <bbva-text
            data-tag-name="bbva-text"
            size="3XS"
            tag="span"
            .text="1 ${this.currencyCode} = "
          ></bbva-text>
          <bbva-amount
            class="amount exchange-amount"
            data-tag-name="bbva-amount"
            show-currency-code
            .amount="${this.exchangeRateRatio}"
            .currencyCode="${this.exchangeCurrencyCode}"
            .decimalDigits="${this.exchangeDecimalDigits}"
            .language="${this.language}"
            .localCurrency="${this.localCurrency}"
          >
          </bbva-amount>
        </div>
      </div>
      ${this.switchable?this._action(Pa):this._action(Ia)}
    `}get informationBlock(){return p`
      <div class="information">
        <div class="information-main">
          ${this.noLink?p`
                <bbva-text
                  data-tag-name="bbva-text"
                  tag="span"
                  size="M"
                  .text=${this.currencyText}
                  class="text"
                ></bbva-text>
              `:p`
                <bbva-link
                  data-tag-name="bbva-link"
                  size="M"
                  @click="${this.onTextClick}"
                  ?disabled="${this.disabled}"
                >
                  ${this.currencyText}
                </bbva-link>
              `}
          ${this.editable||this.removable?p`
                <div class="actions">
                  ${this.editable&&this._action(Ba)}
                  ${this.removable&&this._action(Ia)}
                </div>
              `:""}
        </div>
        <div class="information-content">
          <bbva-text data-tag-name="bbva-text" tag="span" .text=${this.currencyCode}> </bbva-text>
          <bbva-amount
            data-tag-name="bbva-amount"
            variant="l"
            ?hidden="${this.editable||this.removable||!this.amount}"
            .amount="${this.amount}"
            .currencyCode="${this.currencyCode}"
            .localCurrency="${this.localCurrency}"
            .language="${this.language}"
          ></bbva-amount>
        </div>
      </div>
    `}_action(e){return p`
      <button
        class="action ${e}"
        @click=${()=>this.onClick(e)}
        ?disabled="${this.disabled}"
      >
        <bbva-core-icon
          .icon="${this[`icon${t=e,t.charAt(0).toUpperCase()+t.slice(1)}Action`]}"
          .size="${this.iconActionSize}"
        ></bbva-core-icon>
        <span class="sr-only">${this.t(this[`${e}ActionAccessibleText`])}</span>
      </button>
    `;var t}_dispatchActionItem(e){this.dispatchEvent(new CustomEvent(e,{detail:this.currencyCode,bubbles:!0,composed:!0}))}onCountryClick(){this._dispatchActionItem("list-currency-country-update")}onClick(e){this._dispatchActionItem(`list-currency-${e}-click`)}onTextClick(){this._dispatchActionItem("list-currency-link-click")}render(){return p`
      <div class="container">
        ${this.flag} ${this.converter?this.converterBlock:this.informationBlock}
      </div>
    `}}customElements.define(Da.is,Da);class Fa extends(nt(b)){static get is(){return"amount-validator"}static get properties(){return{min:{type:Number,attribute:"min"},max:{type:Number,attribute:"max"},multipleOf:{type:Number,attribute:"multiple-of"}}}constructor(){super(),this.min=0,this.max=0,this.multipleOf=0}validate(e){const t=parseFloat(e.replaceAll(",",""));return t<this.min?(this._fireEvent(this,"amount-errors","ALT"),!1):t>this.max?(this._fireEvent(this,"amount-errors","AGT"),!1):t%this.multipleOf!=0?(this._fireEvent(this,"amount-errors","ANMO"),!1):(this._fireEvent(this,"valid-amount",{id:"amount",value:t}),!0)}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}customElements.define(Te.is,Te);class Ra extends(c(Fe(b))){static get is(){return"bbva-metasegura-savings-customization"}static get scopedElements(){const e=[A,ie,Ae,ot,lt,Mt,Da,t,Ge,v,ne,Fa];return Ra.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},_insuredAmounts:{type:Object},savingsGoal:{type:Number},savingsGoalLocalCurrency:{type:Number},amountLimits:{type:Object},term:{type:Number},termLimits:{type:Object},contribution:{type:Number},contributionLocalCurrency:{type:Number},exchangeRate:{type:Object},multipleOf:{type:Number},messageError:{type:String},isAvailable:{type:Boolean},showContributionsPanel:{type:Boolean},inputValue:{type:Number}}}constructor(){super(),this.show=!1,this.title="metasegura-offer-name",this.savingsGoal=0,this.savingsGoalLocalCurrency=0,this.amountLimits={},this.term=0,this.termLimits={min:0,max:0},this.contribution=0,this.contributionLocalCurrency=0,this.exchangeRate={},this.multipleOf=0,this.messageError="",this.isAvailable=!1,this.showContributionsPanel=!0,this.inputValue=0}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}get _formAmount(){return this.shadowRoot.querySelector("#inputAmount")}get _flag(){return this.shadowRoot.querySelector(".flag")}_setCurrencyCode(e){this._formAmount.shadowRoot.querySelector(".back-currency.right").innerText=e}set insuredAmounts(e){const t=this._insuredAmounts;if(this._insuredAmounts=e,void 0!==e){const{amounts:e,terms:t,exchangeRate:i,multipleOf:a}=this.insuredAmounts;this.savingsGoal=e.suggested.amount,this.inputValue=this.savingsGoal,this.savingsGoalLocalCurrency=e.suggested.localCurrency,this.amountLimits={min:e.min,max:e.max},this.term=t.suggested,this.termLimits={min:t.min,max:t.max},this.contribution=e.contribution.monthly.amount,this.contributionLocalCurrency=e.contribution.monthly.localCurrency,this.isAvailable=e.contribution.monthly.isAvailable,this.exchangeRate=i,this.multipleOf=a,this._setCurrencyCode(this.exchangeRate.id)}this.requestUpdate("insuredAmounts",t)}get insuredAmounts(){return this._insuredAmounts}getAmountStringFormat(e){const t=e.toLocaleString("en-US");return t.includes(".")&&t.indexOf(".")+2>=t.length?`${t}0`:t}bindAmountErrors(e){const t=e.detail,i=this.getAmountStringFormat(this.amountLimits.min),a=this.getAmountStringFormat(this.amountLimits.max);switch(t){case"ANMO":this.messageError=this.t("metasegura-savings-customization-amount-not-multiple-of-error","",{multipleOf:this.getAmountStringFormat(this.multipleOf)});break;case"ALT":this.messageError=this.t("metasegura-savings-customization-amount-less-that-error","",{min:i});break;case"AGT":this.messageError=this.t("metasegura-savings-customization-amount-greater-that-error","",{max:a})}this.showContributionsPanel=!1}updateSelectedTime(e){this.shadowRoot.querySelector("#timeLabel").text=`${e} años`}get _header(){return p`
      <bbva-header-main
        id="savingsCustomization"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>{this._fireEvent(e.target,"savings-qustomization-close")}}"
      ></bbva-header-main>
    `}_amountChanged(e){const{value:t}=e.target;this.inputValue=Number(t.replace(",",""))}get _content(){return p`
      <bbva-list-simple
        label-medium=""
        label="${this.t("metasegura-savings-customization-your-savings-label")}"
        description="${this.t("metasegura-savings-customization-step")}"
      ></bbva-list-simple>

      <bbva-list-simple label-medium="" label="${this.t("metasegura-savings-customization-how-much")}"  hide-padding-bottom></bbva-list-simple>
      <bbva-text class="description-text" tag="span" text="${this.t("metasegura-savings-customization-limit-amounts","",this.amountLimits)}"></bbva-text>

      <div class="input-currency-amount">
        <bbva-clip-flag class="flag" icon="${qe()}" size="small"></bbva-clip-flag>
        <bbva-form-amount
          id="inputAmount"
          label="${this.t("metasegura-savings-customization-amount-label")}"
          info-message="${this.t("metasegura-savings-customization-amount-info-message","",{multipleOf:this.getAmountStringFormat(this.multipleOf)})}"
          error-message="${this.messageError}"
          amount="${this.savingsGoal}"
          clear-icon="coronita:close"
          error-icon="coronita:alert"
          info-icon="coronita:info"
          language="en"
          symbol="USD"
          inputmode="numeric"
          symbol-right
          validator="amount-validator"
          validate-on-blur
          @input=${e=>this._amountChanged(e)}
        ></bbva-form-amount>
        <amount-validator
          min="${this.amountLimits.min}"
          max="${this.amountLimits.max}"
          multiple-of="${this.multipleOf}"
          @metasegura-amount-errors="${this.bindAmountErrors}"
          @metasegura-valid-amount="${e=>{this._fireEvent(this,"requotation-request",e.detail),this.showContributionsPanel=!0}}"
        ></amount-validator>
      </div>

      <bbva-list-currency
        description="${this.t("metasegura-savings-customization-local-currency-description")}"
        converter="" country-id="${Ne()}"
        amount="${this.savingsGoalLocalCurrency}"
        currency-code="${this.exchangeRate.id}"
        local-currency="${this.exchangeRate.id}"
        language="en" exchange-currency-code="MXN"
        currency-text="${this.t("metasegura-savings-customization-local-currency-exchange-rate")}"
        exchange-rate-ratio="${this.exchangeRate.value}"
        exchange-decimal-digits="2"
      ></bbva-list-currency>

      <bbva-list-simple label-medium="" label="${this.t("metasegura-savings-customization-how-long")}"></bbva-list-simple>
      <bbva-text id="timeLabel" size="L" tag="span" alignment="center" font-weight="500" text="${this.term} años"></bbva-text>
      <bbva-form-range
        id="timeRange"
        show-labels=""
        value="${this.term}"
        min="${this.termLimits.min}"
        max="${this.termLimits.max}"
        ?disabled="${!this.showContributionsPanel}"
        items="[${this.termLimits.min},${this.termLimits.max}]"
        @input="${e=>{this.updateSelectedTime(e.target.value)}}"
        @change="${e=>{this.inputValue===this.savingsGoal?this._fireEvent(this,"requotation-request",{id:"time",value:e.target.value}):this._fireEvent(this,"requotation-request",{id:"both",value:{time:e.target.value,amount:this.inputValue}})}}"
      ></bbva-form-range>

      ${this.showContributionsPanel?p`
        <bbva-panel-button-fixed
          ?show="${this.show}"
          id="panel" button-class="primary"
          label="${this.t("metasegura-savings-customization-button-fixed-label")}"
          amount="${this.contribution}"
          currency-code="USD" local-currency="MXN"
          symbol-left="" language="en" unit="USD" sticky
          header-additional-info="${this.t("metasegura-savings-customization-local-currency-equivalent-label")} ${this.getAmountStringFormat(this.contributionLocalCurrency)} MXN"
        ></bbva-panel-button-fixed>`:""}
      <div class="action-buttons">
        <bbva-button-default
          id="initProcess" variant="primary"
          ?disabled="${!this.showContributionsPanel}"
          @click="${e=>{if(this.inputValue===this.savingsGoal){const t=this.isAvailable?"show-contracting-process":"show-insufficient-balance-alert";this._fireEvent(e.target,t)}else this._flag.focus(),this._flag.blur()}}"
        >${this.t("metasegura-continue-label")}</bbva-button-default>
      </div>
    `}render(){return p`
      <bbva-transition-container id="quotationContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}const qa=new o;var Na=r`:host {
  display: block;
  box-sizing: border-box;
  --_panel-privacy-color: var(--bbva-panel-privacy-dark-mode-color, var(--bbva-panel-privacy-color, var(--colorsSecondary600, ${n(l.secondary600)})));
  --_panel-privacy-icon-color: var(--bbva-panel-privacy-dark-mode-icon-color, var(--bbva-panel-privacy-icon-color, var(--colorsSecondary500, ${n(l.secondary500)})));
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

.content {
  display: flex;
  align-items: center;
  flex-direction: column;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.text {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 12) * 1em) 0;
  margin: 0;
  text-align: center;
  color: var(--_panel-privacy-color);
  line-height: var(--lineHeightType3XSmall, ${n(N.type3XSmall)});
  font-size: var(--typographyType3XSmall, ${n($.type3XSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${n(x.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${n(x.book.fontStyle)});
}

.compact {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: row;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}
.compact .text {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(k.spacer)}))) / 16) * 1rem);
}

.icon {
  color: var(--_panel-privacy-icon-color);
}

.link {
  line-height: var(--lineHeightType3XSmall, ${n(N.type3XSmall)});
  font-size: var(--typographyType3XSmall, ${n($.type3XSmall)});
}
${qa.mediaRules()}`;var Oa=r`[ambient^=light] {
  --bbva-panel-privacy-color: initial;
  --bbva-panel-privacy-icon-color: initial;
}
${(new o).mediaRules()}`;const ja=new o;var Ua=r`[ambient^=dark] {
  --bbva-panel-privacy-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
  --bbva-panel-privacy-icon-color: var(--colorsPrimaryCoreLightened, ${n(l.primaryCoreLightened)});
}
${ja.mediaRules()}`;const Ka={dark:r`
    ${S.dark}
    ${Ua}
  `,light:r`
    ${S.light}
    ${Oa}
  `};class Ga extends(c(d(b))){static get is(){return"bbva-panel-privacy"}static get scopedElements(){return{"bbva-core-icon":Z,"bbva-link":V}}static get properties(){return{icon:{type:String},privacyText:{type:String,attribute:"privacy-text"},privacyTextCompact:{type:String,attribute:"privacy-text-compact"},compact:{type:Boolean},hrefLink:{type:String,attribute:"href-link"},linkText:{type:String,attribute:"link-text"}}}constructor(){super(),this.linkText="bbva-panel-privacy-link-text"}static get styles(){return[Na,m("bbva-panel-privacy-shared-styles"),Ka.dark,Ka.light]}render(){return p`
      <div class="content ${X({compact:this.compact})}">
        <bbva-core-icon icon="${this.icon}" class="icon"></bbva-core-icon>
        <p class="text">
          <slot></slot>
        </p>
        ${this.compact?"":p`
              <bbva-link class="link" .href="${this.hrefLink}" @click="${this._linkClick}"
                >${this.t(this.linkText)}
              </bbva-link>
            `}
      </div>
    `}_linkClick(){this.dispatchEvent(new CustomEvent("panel-privacy-link-click",{detail:!0,bubbles:!0,composed:!0}))}}customElements.define(Ga.is,Ga);class Wa extends(c(Fe(b))){static get is(){return"bbva-metasegura-questionnaire"}static get scopedElements(){const e=[ie,T,Mt,V,it,t,Ee,Ga,v,ne];return Wa.scopedElementsFromClasses(e)}static get properties(){return{show:{type:Boolean,reject:!0},title:{type:String,attribute:"title"},diseasesList:{type:Array},disabledContinueButton:{type:Boolean}}}constructor(){super(),this.show=!1,this.title="metasegura-savings-customization-header",this.diseasesList=[],this.disabledContinueButton=!0}static get styles(){return[e,m("bbva-multistep-oc-metasegura-shared-styles")]}_clickCheckboxs(e){if(this.disabledContinueButton=!this._diseasesCheckboxList.some((e=>!0===e.checked)),"Q6_SINENFER"===e.target.value)if(e.target.checked)this._diseasesCheckboxList.forEach(((t,i)=>{"Q6_SINENFER"!==t.value&&(this._diseasesCheckboxList[i].checked=!1,this._diseasesCheckboxList[i].disabled=e.target.checked)}));else for(let e=0;e<this._diseasesCheckboxList.length;e+=1)this._diseasesCheckboxList[e].disabled=!1}_questionnaireTransition(e){const t=[];this._diseasesCheckboxList.forEach((e=>{const i={id:e.value,answers:[{id:e.checked?"002":"001",value:e.checked?"0":"1"}]};t.push(i)})),this._fireEvent(e.target,"health-questionnaire-answers",t)}get _diseasesCheckboxList(){const e=this.shadowRoot.querySelector(".checkbox-list");return Array.from(e.querySelectorAll(".disease-checkbox"))}get _header(){return p`
      <bbva-header-main
        id="healthQuestionnaire"
        text="${this.t(this.title)}"
        variant="modal-three-level"
        icon-right-primary="coronita:close"
        accessibility-text-icon-right-primary="Close"
        @header-main-icon-right-primary-click="${e=>this._fireEvent(e.target,"previous-questions-close")}"
      ></bbva-header-main>
    `}get _content(){return this.show?p`
      <bbva-list-simple
        label-medium=""
        label="${this.t("metasegura-health-questionnaire-previous-questions-label")}"
        description="${this.t("metasegura-health-questionnaire-steps")}"
      ></bbva-list-simple>

      <bbva-text class="description-text" size="S" tag="span" text="${this.t("metasegura-health-questionnaire-description")}"></bbva-text>
      <bbva-text class="previous-questions" size="S" font-weight="500" tag="span" text="${this.t("metasegura-health-questionnaire-health-diseases-question")}"></bbva-text>
      <bbva-list-info icon="coronita:info" icon-size="16">
        <bbva-text tag="span" text="${this.t("metasegura-health-questionnaire-health-diseases-info")}"></bbva-text>
      </bbva-list-info>

      <div class="checkbox-list">
        ${this.diseasesList.map(((e,t)=>p`
            <bbva-form-checkbox
              class="disease-checkbox"
              id="${e.id}"
              name="diseases${t}"
              check-icon="coronita:checkmark"
              value="${e.id}"
              label="${this.t(e.text)}"
              optional-label=" "
              @click="${this._clickCheckboxs}"
            ></bbva-form-checkbox>`))}
      </div>

      <bbva-notification-message class="notification-message" variant="default" icon="coronita:info">
        <bbva-text size="S" tag="span" text="${this.t("metasegura-health-questionnaire-notice-description")}" alignment="center"></bbva-text>
      </bbva-notification-message>

      <bbva-panel-privacy
        icon="coronita:privacyanddata"
        link-text="${this.t("metasegura-health-questionnaire-privacy-notice-link-label")}"
        @panel-privacy-link-click="${e=>this._fireEvent(e.target,"privacity-notice-modal")}"
      >
        <bbva-text tag="span" size="3XS" alignment="center" text="${this.t("metasegura-health-questionnaire-privacy-notice")}"></bbva-text>
      </bbva-panel-privacy>

      <div class="action-buttons">
        <bbva-button-default id="sendQuestionnaireAnwers" variant="primary" ?disabled="${this.disabledContinueButton}" @click="${this._questionnaireTransition}">${this.t("metasegura-continue-label")}</bbva-button-default>
      </div>
    `:""}render(){return p`
      <bbva-transition-container id="questionnaireContainer" ?visible="${this.show}">
        <div slot="slot-header" class="header">${this._header}</div>
        <div slot="slot-content" class="container">${this._content}</div>
      </bbva-transition-container>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}class Xa extends(c(Fe(b))){static get is(){return"bbva-metasegura-offer-detail"}static get scopedElements(){const e=[Re,ie,ke,Be,we,Mt,V,oe,Ze,v,ne];return Xa.scopedElementsFromClasses(e)}static get properties(){return{showWhatYouShouldKnowModal:{type:Boolean},disabledSimulatorStep:{type:Boolean},showStickyButton:{type:String}}}constructor(){super(),this.showWhatYouShouldKnowModal=!1,this.disabledSimulatorStep=!1,this.showStickyButton=""}static get styles(){return[e,Oe.dark,m("bbva-multistep-oc-metasegura-shared-styles")]}_bulletList(e,t){return p`
      <bbva-header-category class="title-bullet" text="${this.t(`metasegura-details-${e}-title`)}"></bbva-header-category>
      <div class="bullet-list" id="${e}">
        ${t.map((e=>p`
            <bbva-list-bullet icon="coronita:bullet1">${this.t(e)}</bbva-list-bullet>
          `))}
      </div>
    `}_accordionSections(e){return p`
      ${e.map((e=>p`
          <div class="section-questions">
            <bbva-header-category class="section-title" text="${this.t(e.title)}" hide-padding-top hide-padding-bottom></bbva-header-category>
            ${e.accordions.map((e=>p`
                <bbva-expandable-accordion clip-box="" row-title="${this.t(e.question)}" open-icon="coronita:expand" close-icon="coronita:collapse">
                  <div class="answer"><bbva-text size="XS" tag="span" text="${this.t(e.answer)}"></bbva-text></div>
                </bbva-expandable-accordion>
              `))}
          </div>
        `))}
    `}_visibilityWhatYouShouldKnowModal(){this.showWhatYouShouldKnowModal=!this.showWhatYouShouldKnowModal}_renderTransitionContainer(e,t,i,a){return p`
      <bbva-transition-container
        id="whatYouShouldKnowContainer"
        ?visible="${a}"
        @transition-container-open=${()=>this._fireEvent(this,"show-faqs")}
      >
        <div slot="slot-header" class="header">
          <bbva-header-main
            id="${e}"
            variant="modal-three-level"
            accessibility-text-icon-right-primary="Close"
            icon-right-primary="coronita:close"
            text="${t}"
            @header-main-icon-right-primary-click="${()=>this._visibilityWhatYouShouldKnowModal()}">
          </bbva-header-main>
        </div>
        <div slot="slot-content" class="container">${i}</div>
      </bbva-transition-container>
    `}get _whatYouShouldKnowModal(){const e=p`
      <bbva-panel-info microillustration="fundsdollar" heading="${this.t("metasegura-panel-info-what-you-should-know-title")}"></bbva-panel-info>
      ${this._accordionSections($i)}
      <div class="action-buttons">
        <bbva-button-default variant="primary" @click="${()=>this._visibilityWhatYouShouldKnowModal()}">${this.t("metasegura-understood-label")}</bbva-button-default>
      </div>
    `;return this._renderTransitionContainer("whatYouShouldKnow",this.t("metasegura-offer-name"),e,this.showWhatYouShouldKnowModal)}render(){return p`
      <bbva-panel-info
        class="panel-dark"
        ambient="dark"
        microillustration="goalinsurancedark"
        text="${this.t("metasegura-panel-offer-description")}">
      </bbva-panel-info>

      ${this._bulletList("characteristics",gi)}
      ${this._bulletList("benefits",fi)}

      <div class="panel-info">
        <bbva-panel-offer
          content-title="${this.t("metasegura-panel-info-what-you-should-know-title")}"
          link-text="${this.t("metasegura-panel-info-what-you-should-know-link")}"
          microillustration="fundsdollar"
          link-icon="coronita:info"
          @panel-offer-panel-link-click=${e=>{this._fireEvent(e.target,"what-you-should-know-link-click"),this._visibilityWhatYouShouldKnowModal()}}>
          <bbva-text tag="span" size="S" alignment="center" text="${this.t("metasegura-panel-info-what-you-should-know-description")}"></bbva-text>
        </bbva-panel-offer>
      </div>

      ${this._whatYouShouldKnowModal}

      ${this._bulletList("considerations",yi)}

      <bbva-divider size="small center"></bbva-divider>

      <div class="privacy-notice">
        <bbva-text tag="span" text="${this.t("metasegura-legal-property-notice-conditions")}" size="XS" alignment="center"></bbva-text>
        <bbva-link icon="coronita:pdf"
          text="${this.t("metasegura-link-label-conditions")}"
          @click="${e=>{this._fireEvent(e.target,"general-conditions-link-click"),this._fireEvent(e.target,"show-file","CONDICIONES GENERALES META SEGURA")}}"
        ></bbva-link>
        <bbva-text tag="span" text="${this.t("metasegura-legal-property-notice")}" size="XS" alignment="center"></bbva-text>
      </div>

      <div class="action-buttons">
        <bbva-button-default id="savingsCustomizationBtn"
          variant="positive"
          @click="${e=>{this._fireEvent(e.target,"personalize-saving-button-click"),this._fireEvent(this,"go-next-step",!0)}}">
          ${this.t("metasegura-personalize-saving-button-label")}
        </bbva-button-default>
      </div>
      ${this.showStickyButton?this.bbvaSecondaryButton("savingsCustomizationBtnSecondary"):""}
    `}bbvaSecondaryButton(e){return p`
      <div class="footer hide-padding-top">
        <bbva-button-default
          id="${e}"
          text="${this.t(this.showStickyButton)}"
          variant="link"
          @click="${this._handlerClickSecondaryButton}"
          ?disabled="${this.disabledSimulatorStep}">
        </bbva-button-default>
      </div>
      `}_handlerClickSecondaryButton(){this._fireEvent(this,"bbva-button-default-secondary-button",!0)}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}customElements.define(ne.is,ne),customElements.define(vi.is,vi);class Ya extends(c(Fe(b))){static get is(){return"bbva-multistep-oc-metasegura"}static get scopedElements(){const e=[ke,A,Je,t,Ye,Qe,ie,tt,kt,Pe,De,T,we,Mt,Ke,Pt,it,Ot,Yt,Ee,zt,Ze,Ge,v,ne,vi,Xa,Wa,Ra,Za,La,Yi,Ri,Fi];return Ya.scopedElementsFromClasses(e)}static get properties(){return{showHealthQuestionnaireModal:{type:Boolean},showSavingsCustomizationModal:{type:Boolean},insuredAmounts:{type:Object},savingsGoal:{type:Number},savingsGoalLocalCurrency:{type:Number},term:{type:Number},contributions:{type:Object},exchangeRate:{type:Object},paymentFrequency:{type:Number},selectedContribution:{type:Number},selectedContributionLocalCurrency:{type:Number},showFirstStep:{type:Boolean},showStickyButtonOcMetaSegura:{type:Boolean},showExecutiveCodeFormModal:{type:Boolean},executiveCode:{type:String},beneficiaryList:{type:Array},showAddBeneficiaryModal:{type:Boolean},showRegisterAddressFormModal:{type:Boolean},address:{type:String},relationshipList:{type:Array},showEditPercentageModal:{type:Boolean},email:{type:String},paymentOptions:{type:Array},paymentSelected:{type:Object},showAllCardsAndAccounts:{type:Boolean},disabledTermAndCondBtn:{type:Boolean},multistepCompleted:{type:Boolean},setMarginTop:{type:Boolean},lastFrequencyRegistered:{type:Number},hiddenForm:{type:Boolean},starTime:{type:Number},finalHour:{type:Number},currentStep:{type:Number},enableTDCPayment:{type:Boolean},showStickyButton:{type:String},disabledExecutiveCodeStep:{type:Boolean},callMeBackIcon:{type:String}}}constructor(){super(),this.callMeBackIcon="",this.showStickyButton="",this.disabledExecutiveCodeStep=!1,this.showHealthQuestionnaireModal=!1,this.showSavingsCustomizationModal=!1,this.savingsGoal=0,this.savingsGoalLocalCurrency=0,this.term=0,this.contributions=xi.contribution,this.exchangeRate={},this.paymentFrequency=0,this.lastFrequencyRegistered=0,this.selectedContribution=0,this.selectedContributionLocalCurrency=0,this.showFirstStep=!1,this.showStickyButtonOcMetaSegura=!1,this.showExecutiveCodeFormModal=!1,this.executiveCode="",this.beneficiaryList=[],this.showAddBeneficiaryModal=!1,this.showRegisterAddressFormModal=!1,this.address="",this.relationshipList=[],this.showEditPercentageModal=!1,this.email="",this.paymentOptions=[],this.showAllCardsAndAccounts=!1,this.disabledTermAndCondBtn=!0,this.multistepCompleted=!1,this.setMarginTop=!1,this.hiddenForm=!1,this.starTime="8:30",this.finalHour="9:00",this.currentStep=0,this.enableTDCPayment=!0}static get styles(){return[e,Ie,_.dark,et.dark,i.dark,We.dark,Xe.dark,At.dark,m("bbva-multistep-oc-metasegura-shared-styles")]}get _multistep(){return this.shadowRoot.querySelector("bbva-expandable-multistep")}get _steps(){return Array.from(this._multistep.querySelectorAll("bbva-expandable-step"))}get _offerDetail(){return this.shadowRoot.querySelector("bbva-metasegura-offer-detail")}get _healthQuestionnaireModal(){return this.shadowRoot.querySelector("bbva-metasegura-questionnaire")}get _modalAlert(){return this.shadowRoot.querySelector("bbva-metasegura-errors")}get _compositionSelectorCard(){return this.shadowRoot.querySelector(".savings-frequency-options")}get _addExecutiveCodeModal(){return this.shadowRoot.querySelector("bbva-metasegura-executive-code")}get _addBeneficiaryModal(){return this.shadowRoot.querySelector("bbva-metasegura-beneficiary-form")}get _registerAddressModal(){return this.shadowRoot.querySelector("bbva-metasegura-register-address")}get _termAndConditionsList(){const e=this.shadowRoot.querySelector("#termsAndConditionsList");return Array.from(e.querySelectorAll(".terms-checks"))}_visibilityWhatYouShouldKnow(){this._offerDetail._visibilityWhatYouShouldKnowModal()}_visibilityHealthQuestionnaireModal(){this.showHealthQuestionnaireModal=!this.showHealthQuestionnaireModal,this.showHealthQuestionnaireModal&&this._fireEvent(this,"send-data-step",{event:"two",data:{}})}_visibilitySavingsCustomizationModal(){this.showSavingsCustomizationModal=!this.showSavingsCustomizationModal,this.showSavingsCustomizationModal&&this._fireEvent(this,"send-data-step",{event:"three",data:{}})}_visibilityAddExecutiveCodeModal(){this.showExecutiveCodeFormModal=!this.showExecutiveCodeFormModal,this.showExecutiveCodeFormModal?this._fireEvent(this,"show-executive-code-modal"):this.executiveCode&&this._addExecutiveCodeModal.resetValues({target:this._addExecutiveCodeModal})}_visibilityAddBeneficiaryModal(){this.showAddBeneficiaryModal=!this.showAddBeneficiaryModal,this.showAddBeneficiaryModal&&(this._fireEvent(this,"send-data-step",{event:"six",data:{}}),this._fireEvent(this,"show-add-beneficiary-form-modal"))}_visibilityRegisterAddressModal(){this.showRegisterAddressFormModal=!this.showRegisterAddressFormModal}_visibilityEditPercentageModal(){this.showEditPercentageModal=!this.showEditPercentageModal,this.showEditPercentageModal&&this._fireEvent(this,"show-edit-percentages-modal")}_visibilityAllCardsAndAccountsModal(){this.showAllCardsAndAccounts=!this.showAllCardsAndAccounts}_isStepActive(e){return e===this.currentStep}_compositionSelectorHandler(e){this.paymentFrequency=e.detail,this.paymentFrequency?(this.selectedContribution=this.contributions.annual.amount,this.selectedContributionLocalCurrency=this.contributions.annual.localCurrency):(this.selectedContribution=this.contributions.monthly.amount,this.selectedContributionLocalCurrency=this.contributions.monthly.localCurrency)}_initContractingProcess(){this._compositionSelectorCard.selected=0,this._compositionSelectorHandler({detail:0}),this.showFirstStep=!0,this._visibilitySavingsCustomizationModal(),this.showStickyButtonOcMetaSegura=!0,this._fireEvent(this,"send-data-step",{event:"four",data:{amount:this.savingsGoal.toString(),currency:"USD"}})}getAmountStringFormat(e){const t=e.toLocaleString("en-US");return t.includes(".")&&t.indexOf(".")+2>=t.length?`${t}0`:t}_editStepHandler(e){this.currentStep=e.target.step,this.showStickyButtonOcMetaSegura=0===e.detail,0===e.detail?this.lastFrequencyRegistered=this.paymentFrequency:this.lastFrequencyRegistered!==this.paymentFrequency&&(this.paymentFrequency=this.lastFrequencyRegistered,this._compositionSelectorCard.selected=this.paymentFrequency,this._compositionSelectorHandler({detail:this.paymentFrequency}))}_stepCompletedHandler(e){const t=e.target;switch(this.setMarginTop=!0,t.completed=!0,this._fireEvent(t,"complete"),this.currentStep=e.target.step+1,t.step){case 0:this._fireEvent(this,"send-data-step",{event:"five",data:{typology:this.executiveCode?"asesor ejecutivo":"no asesor ejecutivo",paymentAmount:this.selectedContribution.toString(),paymentType:this.paymentFrequency?"anual":"mensual"}});break;case 1:this._fireEvent(this,"send-data-step",{event:"seven",data:{holders:"1"}});break;case 2:this._fireEvent(this,"send-data-step",{event:"eight",data:{}});break;case 3:this._fireEvent(this,"send-data-step",{event:"nine",data:{}})}void 0!==this.paymentSelected&&(this._isValidPaymentMethod(this.paymentSelected)||(this._steps.find((e=>"paymentMethods"===e.id)).completed=!1))}_isValidPaymentMethod(e){return"MXN"===e.amount.currency?e.amount.amount>=this.selectedContributionLocalCurrency:e.amount.amount>=this.selectedContribution}hideForm(){this.showAddBeneficiaryModal&&(this.hiddenForm=!0)}closeSignAddress(){this.showAddBeneficiaryModal&&(this.hiddenForm=!1)}stickyButtonHandler(){this.lastFrequencyRegistered=this.paymentFrequency,this._stepCompletedHandler({target:this._steps[0]}),this.showStickyButtonOcMetaSegura=!1}_editOrRemoveBeneficiaryHandler(e){const t=Number.parseInt(e.target.id.slice(-1),10);e.detail.selected?this.openAlert("removeBeneficiary",{id:t}):(this._visibilityAddBeneficiaryModal(),this._addBeneficiaryModal.editBeneficiary(this.beneficiaryList[t],t))}_editAddress(e){this._registerAddressModal.editAddress(e),this._visibilityRegisterAddressModal()}_selectPaymentMethodHandler(e){const{id:t}=e.target;this.paymentSelected=this.paymentOptions.find((e=>e.id===t)),this.showAllCardsAndAccounts&&this._visibilityAllCardsAndAccountsModal(),this._fireEvent(e.target,"selected-payment-method",this.paymentSelected),this._stepCompletedHandler({target:this._steps[2]})}_checkAllTermAndConditions(){if(this._termAndConditionsList[0].checked)for(let e=0;e<this._termAndConditionsList.length;e+=1)this._termAndConditionsList[e].checked=!0}_validateTermAndConditionsChecklist(){this.disabledTermAndCondBtn=this._termAndConditionsList.some((e=>!1===e.checked))}_validateStep(e){e.detail&&this._steps.forEach(((e,t)=>{if(e.completed)switch(e.step){case 1:this.beneficiaryList.length<=0&&(this._steps[t].completed=!1);break;case 2:void 0===this.paymentSelected&&(this._steps[t].completed=!1);break;case 3:this._termAndConditionsList.some((e=>!1===e.checked))&&(this._steps[t].completed=!1)}}))}setDiseasesChecklist(e){this._healthQuestionnaireModal.diseasesList=e,this._visibilityHealthQuestionnaireModal()}setInsuredAmounts(e){this.insuredAmounts=e,this.savingsGoal=this.insuredAmounts.amounts.suggested.amount,this.savingsGoalLocalCurrency=this.insuredAmounts.amounts.suggested.localCurrency,this.term=this.insuredAmounts.terms.suggested,this.contributions=this.insuredAmounts.amounts.contribution,this.exchangeRate=this.insuredAmounts.exchangeRate,this._fireEvent(this,"hide-spinner"),this.showHealthQuestionnaireModal&&(this._visibilityHealthQuestionnaireModal(),this._visibilitySavingsCustomizationModal())}setExecutiveCode(e){this.executiveCode=e,this._visibilityAddExecutiveCodeModal()}setBeneficiaryList(e){this.beneficiaryList=e,this.requestUpdate()}removeBeneficiaryAddress(){this._addBeneficiaryModal.removeAddress()}setLocationInfo(e){this._registerAddressModal.setAddressValues(e)}setCalendarDate(e){this._addBeneficiaryModal.setDate(e)}setBeneficiaryAddress(e){this._addBeneficiaryModal.setAddress(e)}openAlert(e,t=!0){this._fireEvent(this,"hide-spinner"),this._modalAlert.open(e,t)}closeContainers(e){switch(e){case"whatYouShouldKnowContainer":this._visibilityWhatYouShouldKnow();break;case"questionnaireContainer":this._visibilityHealthQuestionnaireModal();break;case"quotationContainer":this._visibilitySavingsCustomizationModal();break;case"executiveCodeContainer":this._visibilityAddExecutiveCodeModal();break;case"beneficiaryFormContainer":this._visibilityAddBeneficiaryModal();break;case"addressFormContainer":this._visibilityRegisterAddressModal();break;case"percentagesFormContainer":this._visibilityEditPercentageModal();break;case"allCardsAndAccountsContainer":this._visibilityAllCardsAndAccountsModal()}}closeModal(){this._modalAlert.closeModal()}_renderExpandableStep(e,t,i,a,r,o){return p`
      <bbva-expandable-step
        id="${e}"
        class="${1!==t||this.showFirstStep?"":"first-step"}"
        header="${i}" edit-label="${o}"
        hide-step-number
        step="${t}" current-step-label=""
        hide-padding-left="" hide-padding-right="" hide-padding-top=""
        @expandable-step-edit-step="${e=>this._editStepHandler(e)}"
        @expandable-step-complete-change="${e=>this._validateStep(e)}"
      >
        <div class="expandable-step-content">${a}</div>
        <div class="expandable-step-summary" slot="summary">${r}</div>
      </bbva-expandable-step>
    `}get _personalizedSavingStep(){const e=p`
      <bbva-text class="description" size="S" tag="span" text="${this.t("metasegura-personalized-saving-step-description")}"></bbva-text>
      <bbva-header-category
        class="internal-title"
        option-link="${this.t("metasegura-change-label")}"
        text="${this.t("metasegura-personalized-saving-step-goal-summary")}"
        @header-category-link-click="${()=>{this._steps[0].completed||(this._visibilitySavingsCustomizationModal(),this.showFirstStep=!1,this.showStickyButtonOcMetaSegura=!1)}}"
      ></bbva-header-category>

      <bbva-amount id="savingGoalAmount" variant="4xl" amount="${this.savingsGoal}" currency-code="USD" local-currency="MXN" symbol="USD" symbol-left="" language="en"></bbva-amount>
      <div class="local-currency-conversion-label">
        <span>
          ${this.t("metasegura-personalized-saving-current-equivalent")}
          <bbva-amount variant="m" amount="${this.savingsGoalLocalCurrency}" currency-code="MXN" local-currency="MXN" show-currency-code="" language="en"></bbva-amount>
        </span>
      </div>
      <bbva-list-simple label="${this.t("metasegura-personalized-saving-exchage-rate-label")}" description="1 USD = ${this.exchangeRate.value} MXN" hide-padding-top=""></bbva-list-simple>
      <bbva-list-simple id="savingTerm" label="${this.t("metasegura-personalized-saving-time-label")}" description="${this.term} ${this.t("metasegura-personalized-saving-time")}"   hide-padding-bottom=""  hide-padding-top=""></bbva-list-simple>

      <bbva-header-category class="internal-title" text="${this.t("metasegura-personalized-saving-frequency-title")}"></bbva-header-category>
      <bbva-text class="description" size="S" tag="span" text="${this.t("metasegura-personalized-saving-frequency-description")}"></bbva-text>

      <bbva-composition-selector class="savings-frequency-options" selected="0" @composition-selector-select-change=${e=>this._compositionSelectorHandler(e)}>
        <bbva-card-select
          id="monthly" class="flex-item"
          amount="${this.contributions.monthly.amount}"
          iconAmount="" currency-code="USD" local-currency="MXN"
          unit="USD" symbol-left="" language="en"
          description="${this.t("metasegura-personalized-saving-total-time-monthly")} ${this.term} años"
          card-title="${this.t("metasegura-personalized-saving-frequency-mensual")}"
        ></bbva-card-select>
        <bbva-card-select
          id="annual" class="flex-item"
          ?disabled="${!this.contributions.annual.isAvailable}"
          amount="${this.contributions.annual.amount}"
          iconAmount="" currency-code="USD" language="en"
          unit="USD" symbol-left="" local-currency="MXN"
          description="${this.t("metasegura-personalized-saving-total-time-annual")} ${this.term} años"
          card-title="${this.t("metasegura-personalized-saving-frequency-annual")}"
          badge-highlight-text="${this.t("metasegura-personalized-saving-benefit")}"
          badge-highlight-type="success"
        ></bbva-card-select>
      </bbva-composition-selector>

      ${this.contributions.annual.isAvailable?"":p`
          <bbva-notification-help class="alert" icon="coronita:alert" text="${this.t("metasegura-personalized-saving-contributions-annual-error-text")}"></bbva-notification-help>
        `}

      <bbva-notification-help icon="coronita:info" text="${this.t("metasegura-personalized-saving-info-option")}"></bbva-notification-help>

      <bbva-notification-message class="notification-message" icon="coronita:info" variant="information">
        ${this.t("metasegura-personalized-saving-caution-message")}
      </bbva-notification-message>
    `,t=p`
      <bbva-list-simple ambient="dark" label="${this.paymentFrequency?this.t("metasegura-personalized-saving-summary-contribution-annual-label"):this.t("metasegura-personalized-saving-summary-contribution-monthly-label")}" hide-padding-bottom="" hide-padding-top=""></bbva-list-simple>
      <bbva-amount
        ambient="dark" class="summary-amount"
        variant="4xl" amount="${this.selectedContribution}"
        currency-code="USD" local-currency="MXN"
        symbol="USD" symbol-left="" language="en"
      ></bbva-amount>
      <bbva-list-simple
        ambient="dark"
        label="${this.t("metasegura-savings-customization-local-currency-description")}"
        description="${this.getAmountStringFormat(this.selectedContributionLocalCurrency)} MXN"
        hide-padding-bottom=""
      ></bbva-list-simple>
      <bbva-list-simple
        ambient="dark"
        label="${this.t("metasegura-personalized-saving-time-label")}"
        description="${this.term} ${this.t("metasegura-personalized-saving-time")}"
        hide-padding-bottom=""
      ></bbva-list-simple>
      <bbva-list-simple
        ambient="dark"
        label="${this.t("metasegura-personalized-saving-summary-amount-label")}"
        description="${this.getAmountStringFormat(this.savingsGoal)} USD"
      ></bbva-list-simple>
      <hr divider="small" class="savings-amount-divider">
      <bbva-list-simple
        ambient="dark"
        label="${this.t("metasegura-personalized-saving-summary-frequency-label")}"
        description="${this.paymentFrequency?this.t("metasegura-personalized-saving-frequency-annual"):this.t("metasegura-personalized-saving-frequency-mensual")}"
      ></bbva-list-simple>
    `;return this._renderExpandableStep("personalizedSaving",1,this.t("metasegura-personalized-saving-step-title"),e,t,this.t("metasegura-change-label"))}get _executiveCodeCard(){let e="",t="",i="",a="",r="";this.executiveCode?(e=`Código ${this.executiveCode}`,t="coronita:trash",i=this.t("metasegura-delete-label"),a="success",r=this.t("metasegura-executive-code-panel-badge-text")):(e=this.t("metasegura-executive-code-modal-title").toUpperCase(),t="coronita:edit",i=this.t("metasegura-executive-code-panel-link-text"));const o=e=>{this.executiveCode?this._fireEvent(e.target,"remove-executive-code"):this._visibilityAddExecutiveCodeModal()};return p`
      <bbva-panel-offer
        id="executiveCodeCard" vertical="" microillustration="bbvamanagerman"
        heading-text="${this.t("metasegura-executive-code-modal-header").toUpperCase()}"
        content-title="${e}" link-icon="${t}" link-text="${i}"
        badge-type="${a}" badge-text="${r}" description=""
        @panel-offer-panel-link-click="${e=>o(e)}"
      ></bbva-panel-offer>
    `}get _executiveCodeAndStickyBtn(){return p`
      ${this._executiveCodeCard}
      <bbva-metasegura-executive-code
        ?show="${this.showExecutiveCodeFormModal}"
        @metasegura-executive-code-close="${()=>this._visibilityAddExecutiveCodeModal()}"
      ></bbva-metasegura-executive-code>
      <bbva-panel-button-fixed
        show sticky id="panelContibution" button-class="positive"
        label="${this.paymentFrequency?this.t("metasegura-personalized-saving-contribution-annual"):this.t("metasegura-personalized-saving-contribution-monthly")}"
        amount="${this.selectedContribution}" currency-code="USD" local-currency="MXN" symbol-left="" language="en" unit="USD"
        header-additional-info="${this.t("metasegura-personalized-saving-current-equivalent")} ${this.getAmountStringFormat(this.selectedContributionLocalCurrency)} MXN">
      </bbva-panel-button-fixed>
      <div class="action-buttons">
        <bbva-button-default id="confirmFrequency" variant="positive"
          @click="${()=>{this._fireEvent(this,"go-next-step",!0),this._fireEvent(this,"selected-contribution",this.paymentFrequency?"ANNUAL":"MONTHLY")}}">
          ${this.t("metasegura-continue-label")}</bbva-button-default>
      </div>
      ${this.showStickyButton?this.bbvaSecondaryButton("confirmFrequencySecondary"):""}
    `}bbvaSecondaryButton(e){return p`
        <div class="footer hide-padding-top">
          <bbva-button-default
            id="${e}"
            text="${this.t(this.showStickyButton)}"
            variant="link"
            @click="${this._handlerClickSecondaryButton}"
            ?disabled="${this.disabledExecutiveCodeStep}">
          </bbva-button-default>
        </div>
        `}_handlerClickSecondaryButton(){this._fireEvent(this,"bbva-button-default-secondary-button",!0)}get _beneficiariesStep(){const e=p`
      <bbva-text class="description" size="S" tag="span" text="${this.t("metasegura-beneficiaries-step-description")}"></bbva-text>
      ${this.paymentOptions.length>0?p`
          <bbva-list-link-icon
            icon-left-size="16"
            icon-left="coronita:info"
            icon-right=""
            text="${this.t("metasegura-beneficiaries-step-link-info")}"
            @click="${()=>{this._steps[1].completed||this.openAlert("beneficiary")}}"
          ></bbva-list-link-icon>
        `:""}

      ${this._beneficiariesList}
      ${this._beneficiariesActionButtons}

      <bbva-metasegura-beneficiary-form
        ?show="${this.showAddBeneficiaryModal}"
        customer-address="${this.address}"
        .relationshipList="${this.relationshipList}"
        ?hidden="${this.hiddenForm}"
        @metasegura-open-register-address="${()=>this._visibilityRegisterAddressModal()}"
        @metasegura-edit-address="${e=>this._editAddress(e.detail)}"
        @metasegura-add-beneficiary-close="${()=>this._visibilityAddBeneficiaryModal()}"
        @metasegura-remove-address-alert="${()=>this.openAlert("removeAddress")}"
      ></bbva-metasegura-beneficiary-form>

      <bbva-metasegura-register-address
        ?show="${this.showRegisterAddressFormModal}"
        @metasegura-register-address="${e=>this.setBeneficiaryAddress(e.detail)}"
        @metasegura-register-address-close="${()=>this._visibilityRegisterAddressModal()}"
      ></bbva-metasegura-register-address>

      <bbva-metasegura-edit-percentages
        ?show="${this.showEditPercentageModal}"
        .listBeneficiaries="${this.beneficiaryList}"
        @metasegura-edit-percentage-close="${()=>this._visibilityEditPercentageModal()}"
      ></bbva-metasegura-edit-percentages>

      <div class="action-buttons">
        <bbva-button-default
          id="confirmBeneficiaries"
          variant="primary"
          @click="${()=>{this._stepCompletedHandler({target:this._steps[1]}),this._fireEvent(this,"go-next-step",!0)}}"
          .disabled=${this.beneficiaryList.length<1}
        >${this.t("metasegura-continue-label")}
        </bbva-button-default>
      </div>
      ${this.showStickyButton?this.bbvaSecondaryButton("confirmBeneficiariesSecondary"):""}
    `,t=p`${this._beneficiariesListSummary}`;return this._renderExpandableStep("beneficiariesStep",2,this.t("metasegura-beneficiaries-step-title").toUpperCase(),e,t,this.t("metasegura-change-label"))}get _beneficiariesList(){const e=[{icon:"coronita:edit",status:"",accesibilityText:"edit icon"},{icon:"coronita:trash",status:"",accesibilityText:"delete icon"}];return this.beneficiaryList.length>0?p`
        <div id="beneficiaryList">
          ${this.beneficiaryList.map(((t,i)=>{const{name:a,lastName:r,secondLastName:o,relationship:n,percentage:l}=t,s=`${a} ${r} ${o}`,c=[{description:this.t("metasegura-beneficiaries-relationship-label"),subtitle:n.text},{description:this.t("metasegura-beneficiaries-percentage-label"),subtitle:`${l}%`}];return p`
              <bbva-list-select
                class="beneficiary"
                id="beneficiary-${i}"
                heading="${s}"
                .descriptionList="${c}"
                .iconList="${e}"
                @list-select-icon-click="${e=>this._editOrRemoveBeneficiaryHandler(e)}"
              ></bbva-list-select>
              <hr divider="full">
            `}))}
        </div>
        <bbva-list-simple class="simple-data" label-medium="" label="${this.t("metasegura-beneficiaries-percentage")}" description="100%"></bbva-list-simple>
      `:""}get _beneficiariesActionButtons(){const e=p`
      <bbva-button-list
        id="addBeneficiaryButton"
        icon="coronita:add"
        tabIndex="${this._isStepActive(1)?"0":"-1"}"
        title-text="${this.t("metasegura-beneficiaries-step-button-add-beneficiaries")}"
        @click=${()=>this._visibilityAddBeneficiaryModal()}
      ></bbva-button-list>`,t=p`
      <bbva-button-list
        id="editPercentageButton"
        icon="coronita:edit"
        tabIndex="${this._isStepActive(1)?"0":"-1"}"
        title-text="${this.t("metasegura-beneficiaries-step-button-edit-percentages")}"
        @click="${()=>this._visibilityEditPercentageModal()}"
      ></bbva-button-list>`;return this.beneficiaryList.length<2?p`<div class="beneficiaries-actions">${e}</div>`:this.beneficiaryList.length>1&&this.beneficiaryList.length<4?p`<div class="beneficiaries-actions">${e} ${t}</div>`:p`<div class="beneficiaries-actions">${t}</div>`}get _beneficiariesListSummary(){return p`
      <div id="beneficiaryList">
        ${this.beneficiaryList.map((e=>{const{name:t,lastName:i,secondLastName:a,relationship:r,percentage:o}=e;return p`
            <bbva-list-default heading="${`${t} ${i} ${a}`}" description="${r.text}" amount="${o}" decimal-digits="0" unit="%" ambient="dark"></bbva-list-default>
          `}))}
      </div>
    `}get _paymentMethods(){const e=p`
      <bbva-text class="description" size="S" tag="span" text="${this.t("metasegura-payment-options-step-description")}"></bbva-text>
      ${this._paymentOptionsList}
    `,t=this.paymentSelected?p`<div class="all-space">${this._cardsAndAccounts([this.paymentSelected],!0)}</div>`:null;return this._renderExpandableStep("paymentMethods",3,this.t("metasegura-payment-options-step-title"),e,t,this.t("metasegura-change-label"))}get _paymentOptionsList(){const e=this.paymentOptions.filter((e=>e.isCard)),t=this.paymentOptions.filter((e=>!e.isCard)),i=e.length>=t.length?e.length:t.length,a=[];for(let r=0;r<i;r+=1)r<t.length&&a.length<3&&a.push(t[r]),r<e.length&&a.length<3&&a.push(e[r]);return a.sort(((e,t)=>e.isCard?-1:t.isCard?1:0)),p`
      <bbva-header-category
        class="internal-title"
        text="${this.enableTDCPayment?this.t("metasegura-payment-options-step-cards-and-accounts"):this.t("metasegura-payment-options-step-accounts")}"
        option-link="${e.length+t.length>3?this.t("metasegura-payment-options-step-view-all-link"):""}"
        @header-category-link-click="${()=>this._visibilityAllCardsAndAccountsModal()}">
      </bbva-header-category>

      <div class="all-space">
        ${this.paymentOptions.length<=0?p`
              <bbva-list-card loading show-card no-link expired disabled-tabindex></bbva-list-card>
              <bbva-list-card loading no-link expired disabled-tabindex></bbva-list-card>
            `:p`
              <div class="all-space">${this._cardsAndAccounts(a)}</div>
            `}
        ${this.showStickyButton?this.bbvaSecondaryButton("allCardsAndAccountsSecondary"):""}
      </div>

      ${e.length+t.length>3?this._allCardsAndAccountsModal:null}
    `}_cardsAndAccounts(e,t=!1){return p`
      <div class="cards-accounts">
        ${e.map(((i,a)=>{const{id:r,alias:o,number:n,status:l,amount:s,isCard:c}=i;return p`
            <bbva-list-card
              id="${r}"
              @list-card-item-click="${e=>t?null:this._selectPaymentMethodHandler(e)}"
              card-title="${o}" num-product="${n}" show-ellipsis=""
              ?show-card="${c}" card-image="${c?i.imageCard:""}"
              card-status="${l.hasStatus?l.id:""}"
              badge-text="${l.hasStatus?l.text:""}"
              badge-type="${l.hasStatus?l.type:""}"
              amount="${s.amount}" disabled-tabindex
              local-currency="MXN" currency-code="${s.currency}" language="en"
              content-text="${this.t("metasegura-payment-options-step-available-balance")}"
              ambient="${t?"dark":null}"
              ?disabled="${!this._isValidPaymentMethod(i)||l.hasStatus}"
              aria-disabled="${!this._isValidPaymentMethod(i)||l.hasStatus}"
              ?no-link="${t}">
            </bbva-list-card>

            ${this._isValidPaymentMethod(i)?null:p`
                  <bbva-notification-help
                    class="alert" icon="coronita:alert"
                    text="${this.t("metasegura-payment-options-step-insufficient-balance")}"
                    ambient="${t?"dark":null}"
                  ></bbva-notification-help>`}
            ${a<e.length-1?p` <hr divider="">`:null}
          `}))}
      </div>
    `}get _allCardsAndAccountsModal(){const e=this.paymentOptions.filter((e=>e.isCard)),t=this.paymentOptions.filter((e=>!e.isCard));let i=p``,a=p``;return e.length>0&&(i=p`
        <bbva-header-category class="internal-title" text="${this.t("metasegura-all-cards-and-accounts-modal-cards-category")}"></bbva-header-category>
        ${this._cardsAndAccounts(e)}
      `),t.length>0&&(a=p`
        <bbva-header-category class="internal-title" text="${this.t("metasegura-all-cards-and-accounts-modal-accounts-category")}"></bbva-header-category>
        ${this._cardsAndAccounts(t)}
      `),p`
      <bbva-transition-container id="allCardsAndAccountsContainer" ?visible="${this.showAllCardsAndAccounts}">
        <div slot="slot-header" class="header">
          <bbva-header-main
            id="allCardsAndAccounts"
            variant="modal-three-level"
            icon-right-primary="coronita:close"
            accessibility-text-icon-right-primary="Close"
            text="${this.enableTDCPayment?this.t("metasegura-all-cards-and-accounts-modal-header"):this.t("metasegura-all-cards-and-accounts-modal-accounts-category")}"
            @header-main-icon-right-primary-click="${()=>this._visibilityAllCardsAndAccountsModal()}">
          </bbva-header-main>
        </div>
        <div slot="slot-content" class="container">
          ${i} ${a}
        </div>
      </bbva-transition-container>
    `}get _termsAndConditions(){const e={amount:this.selectedContribution,paymentOptionType:void 0!==this.paymentSelected&&this.paymentSelected.isCard?"Tarjeta":"Cuenta",chargeType:void 0!==this.paymentSelected&&this.paymentSelected.isCard?"recurrente":"domiciliado",number:void 0!==this.paymentSelected&&this.paymentSelected.number?this.paymentSelected.number:""},t={starTime:this.starTime,finalHour:this.finalHour},i=e=>{this.paymentSelected.isCard?this._fireEvent(e.target,"show-file","FORMATO PARA CONTRATAR CARGOS RECURRENTES"):this._fireEvent(e.target,"show-file","FORMATO DE DOMICILIACION")},a=p`
      <bbva-text
        class="description" size="S" tag="span"
        text="${this.t("metasegura-terms-and-conditions-step-description")}"
      ></bbva-text>

      <div class="list-files">
        ${this.paymentOptions.length<=0?p`
              <bbva-list-file loading tabindex="-1"></bbva-list-file>
              <bbva-list-file loading tabindex="-1"></bbva-list-file>`:p`
              <bbva-list-file
                id="contractTermsandConditions"
                icon="coronita:pdf" tabIndex="${this._isStepActive(3)?"0":"-1"}"
                file-name="${this.t("metasegura-terms-and-conditions-step-file-one")}"
                @list-file-link-click="${e=>this._fireEvent(e.target,"show-file","CONDICIONES GENERALES META SEGURA")}"
              ></bbva-list-file><hr divider="fit">
              <bbva-list-file
                id="termsofPayment"
                icon="coronita:pdf" tabIndex="${this._isStepActive(3)?"0":"-1"}"
                file-name="${this.t("metasegura-terms-and-conditions-step-file-two")}"
                @list-file-link-click="${e=>i(e)}"
              ></bbva-list-file><hr divider="fit">
              <bbva-list-file
                id="privacyNotices"
                icon="coronita:document" tabIndex="${this._isStepActive(3)?"0":"-1"}"
                file-name="${this.t("metasegura-terms-and-conditions-step-file-three")}"
                @list-file-link-click="${()=>this.openAlert("privacyNotice")}"
              ></bbva-list-file>
            `}
      </div>

      <div id="termsAndConditionsList">
        <bbva-form-checkbox
          class="terms-checks"
          name="check" value="1"
          check-icon="coronita:checkmark" required disabled-tabindex
          @click="${()=>{this._checkAllTermAndConditions(),this._validateTermAndConditionsChecklist()}}"
          label="${this.t("metasegura-terms-and-conditions-step-check-one")}"
        >
          ${this.paymentOptions.length>0?p`
                <span slot="description">
                  <bbva-notification-help class="term-help" icon="coronita:info" text="${this.t("metasegura-terms-and-conditions-step-check-one-info")}"></bbva-notification-help>
                </span>
              `:""}
        </bbva-form-checkbox>
        <bbva-form-checkbox
          class="terms-checks"
          name="check" value="1"
          check-icon="coronita:checkmark" required disabled-tabindex
          @click="${()=>this._validateTermAndConditionsChecklist()}"
          label="${this.t("metasegura-terms-and-conditions-step-check-two")}"
        ></bbva-form-checkbox>
        <bbva-form-checkbox
          class="terms-checks"
          name="check" value="1"
          check-icon="coronita:checkmark" required disabled-tabindex
          @click="${()=>this._validateTermAndConditionsChecklist()}"
          label="${this.t("metasegura-terms-and-conditions-step-check-three")}"
        ></bbva-form-checkbox>
        <bbva-form-checkbox
          class="terms-checks"
          name="check" value="1"
          check-icon="coronita:checkmark" required disabled-tabindex
          @click="${()=>this._validateTermAndConditionsChecklist()}"
          label="${this.t("metasegura-terms-and-conditions-step-check-four","",e)}"
        ></bbva-form-checkbox>
        <bbva-form-checkbox
          class="terms-checks"
          name="check" value="1"
          check-icon="coronita:checkmark" required disabled-tabindex
          @click="${()=>this._validateTermAndConditionsChecklist()}"
          label="${this.t("metasegura-terms-and-conditions-step-check-five","",{email:this.email})}"
        ></bbva-form-checkbox>
      </div>

      <bbva-notification-message class="notification-message" icon="coronita:info" variant="default">
        ${this.t("metasegura-terms-and-conditions-step-message","",t)}
        <bbva-text font-weight="500" alignment="center" tag="span" text="${this.t("metasegura-customer-service-center=number")}"></bbva-text>
      </bbva-notification-message>

      <div class="action-buttons">
        <bbva-button-default
          id="confirmTerms"
          variant="primary" ?disabled="${this.disabledTermAndCondBtn}"
          @click="${()=>{this._stepCompletedHandler({target:this._steps[3]}),this._fireEvent(this,"go-next-step",!0)}}"
        >${this.t("metasegura-continue-label")}
        </bbva-button-default>
      </div>
      ${this.showStickyButton?this.bbvaSecondaryButton("confirmTermsSecondary"):""}
    `,r=p`
      <bbva-list-multistep-check class="without-x-padding" ambient="dark" icon="coronita:correct">
        <span>${this.t("metasegura-terms-and-conditions-accepted")}</span>
      </bbva-list-multistep-check>
    `;return this._renderExpandableStep("termsAndConditions",4,this.t("metasegura-terms-and-conditions-step-title"),a,r,this.t("metasegura-consult-label"))}async _callMeBackTooltip(){const e=await this.shadowRoot.getElementById("headerOffer"),t=await e.shadowRoot.getElementById("btn-right-secondary"),i=await this.shadowRoot.getElementById("callMeBackTooltip");if(i){const e=await i.shadowRoot.querySelector(".description");t.setAttribute("slot","invoker"),t.parentNode.insertBefore(i,t),e.removeAttribute("ellipsis"),i.appendChild(t)}}_closeCallMeBackTooltip(){this.shadowRoot.getElementById("headerOffer").shadowRoot.getElementById("callMeBackTooltip").opened=!1}render(){return p`
      <bbva-expandable-multistep has-animation=""
        class="scrollable display-other ${this.multistepCompleted?"":"contracting-process"}"
        @expandable-multistep-scroll-animation-end="${()=>{this.setMarginTop=!1}}"
        @expandable-multistep-all-complete="${e=>{this.multistepCompleted=e.detail}}"
      >
        <bbva-header-main
          id="headerOffer"
          class="${this.setMarginTop?"margin-animation":""}"
          text="${this.t("metasegura-offer-name")}"
          icon-right-primary="coronita:close"
          icon-right-secondary="${this.callMeBackIcon}"
          accessibility-text-icon-right-primary="Close"
          @metasegura-cmb-icon-header=${this._closeCallMeBackTooltip}
          @header-main-icon-right-primary-click="${e=>this._fireEvent(e.target,"close-offer-header")}"
          @header-main-icon-right-secondary-click="${e=>this._fireEvent(e.target,"cmb-icon-header")}"
        ></bbva-header-main>
        ${this.callMeBackIcon?p`
          <bbva-help-tooltip
            id="callMeBackTooltip"
            opened
            avoid-clickable
            center-position-tooltip
            vertical-placement="bottom"
            description="${this.t("metasegura-call-me-back-tooltip-description")}"
            heading="${this.t("metasegura-call-me-back-tooltip-title")}"
            link-text="${this.t("metasegura-call-me-back-tooltip-link")}"
            @help-tooltip-link-click=${this._closeCallMeBackTooltip}
            @help-tooltip-overlay-click=${this._closeCallMeBackTooltip}
          ></bbva-help-tooltip>
        `:null}
        ${this.showFirstStep?"":p`<bbva-metasegura-offer-detail
          .showStickyButton="${this.showStickyButton}"
          .disabledSimulatorStep="${this.disabledSimulatorStep}">
          </bbva-metasegura-offer-detail>`}
        <bbva-metasegura-questionnaire
          ?show="${this.showHealthQuestionnaireModal}"
          @metasegura-previous-questions-close="${()=>this._visibilityHealthQuestionnaireModal()}"
          @metasegura-privacity-notice-modal="${()=>this.openAlert("privacyNotice")}"
        ></bbva-metasegura-questionnaire>
        <bbva-metasegura-savings-customization
          .insuredAmounts="${this.insuredAmounts}"
          ?show="${this.showSavingsCustomizationModal}"
          @metasegura-savings-qustomization-close="${()=>this._visibilitySavingsCustomizationModal()}"
          @metasegura-show-contracting-process="${()=>{this._multistep.scrollTo(0,0),this._initContractingProcess()}}"
          @metasegura-show-insufficient-balance-alert="${()=>this.openAlert("insufficientBalance")}"
        ></bbva-metasegura-savings-customization>

        ${this._personalizedSavingStep}
        ${this.showStickyButtonOcMetaSegura&&this.showFirstStep?this._executiveCodeAndStickyBtn:""}
        ${this._beneficiariesStep}
        ${this._paymentMethods}
        ${this._termsAndConditions}

        ${this.multistepCompleted?p`
            <bbva-panel-button-fixed
              show sticky
              id="contractInsurance"
              button-class="positive"
              footer-link="${this.t(this.showStickyButton)}"
              class="no-gradient"
              button-text="${this.t("metasegura-contract-label")}"
              @panel-button-fixed-item-click="${e=>{this._fireEvent(e.target,"show-spinner"),this._fireEvent(e.target,"contract-savings-insurance")}}"
            ></bbva-panel-button-fixed>
          `:""}
      </bbva-expandable-multistep>

      <bbva-metasegura-errors
        @metasegura-open-healthRequirements-modal="${e=>this._hiringRejectionAnalyticsData(e.target,"health-requirements")}"
        @metasegura-open-accountLevel-modal="${e=>this._hiringRejectionAnalyticsData(e.target,"account-level")}"
        @metasegura-open-cumulus-modal="${e=>this._hiringRejectionAnalyticsData(e.target,"cumulus")}"
      ></bbva-metasegura-errors>
    `}_hiringRejectionAnalyticsData(e,t){const i={event:`rejection-${t}`,data:{}};this._fireEvent(e,"hiring-rejection",i)}reset(){this.email="",this.address="",this.beneficiaryList=[],this.relationshipList=[],this.paymentOptions=[],this._resetMeta(),this._resetVisibilityValues(),this._resetMultistepInfo()}_resetMeta(){this.insuredAmounts=void 0,this.savingsGoal=0,this.savingsGoalLocalCurrency=0,this.term=0,this.paymentFrequency=0,this.lastFrequencyRegistered=0,this.executiveCode="",this.contributions=xi.contribution,this.exchangeRate={},this.selectedContribution=0,this.selectedContributionLocalCurrency=0}_resetVisibilityValues(){this.showHealthQuestionnaireModal=!1,this.showSavingsCustomizationModal=!1,this.showAllCardsAndAccounts=!1,this.showEditPercentageModal=!1,this.showAddBeneficiaryModal=!1,this.showRegisterAddressFormModal=!1,this.showStickyButtonOcMetaSegura=!1,this.showExecutiveCodeFormModal=!1,this.showFirstStep=!1,this.paymentSelected=void 0}_resetMultistepInfo(){for(let e=0;e<this._steps.length;e+=1)0!==this._steps[e].step&&(this._steps[e].disabled=!0),this._steps[e].completed=!1;this.disabledTermAndCondBtn=!0,this.multistepCompleted=!1,this.setMarginTop=!1;for(let e=0;e<this._termAndConditionsList.length;e+=1)this._termAndConditionsList[e].checked=!1}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}firstUpdated(){this._steps.forEach(((e,t)=>{0!==t&&e.setAttribute("tabindex","-1")}))}updated(e){e.has("callMeBackIcon")&&this.callMeBackIcon&&this._callMeBackTooltip()}}customElements.define(Ya.is,Ya),customElements.define(Xa.is,Xa),customElements.define(Wa.is,Wa),customElements.define(Ra.is,Ra),customElements.define(Za.is,Za),customElements.define(La.is,La),customElements.define(Yi.is,Yi),customElements.define(Ri.is,Ri),customElements.define(a.is,a),customElements.define(Fi.is,Fi),customElements.define(Fa.is,Fa),customElements.define(wa.is,wa);class Qa extends b{static get is(){return"bbva-analyticmanager-metasegura"}static get properties(){return{dataAnalytic:{type:Object},offers:{type:Array},constOcApp:{type:Object}}}constructor(){super(),this.dataAnalytic={},this.offers=[],this.constOcApp={GLOBAL_APPLICATION:"globalApplication",APPLICATION_NAME:"applicationName",APPLICATION_TYPE:"applicationType",FULFILLMENT:"fulfillmentModel",PRIMARY_CATEGORY:"primaryCategory",PRODUCT_NAME:"productName",PRODUCT_SUBTYPE:"productSubtype",PROJECT_NAME:"projectName",LOCATION:"location",CAMPAIGN_FORMAT:"campaignFormat",COLLECTIVE_CODE:"collectiveCode",CAMPAIGN_NAME:"campaignName",PRODUCT:"product",PRODUCT_CODE:"productCode",QUANTITY:"quantity",SITE_ACTION_NAME:"siteActionName"}}filterAppOnClickStartForMSD(e){const{product:t}=e.originalPayload;if("4025"===t.id){const t={[this.constOcApp.GLOBAL_APPLICATION]:"goal insurance",[this.constOcApp.APPLICATION_NAME]:"meta segura digital",[this.constOcApp.APPLICATION_TYPE]:"contratacion",[this.constOcApp.FULFILLMENT]:"online",[this.constOcApp.PRIMARY_CATEGORY]:"seguros",[this.constOcApp.PRODUCT_NAME]:"meta segura",[this.constOcApp.PRODUCT_SUBTYPE]:"",[this.constOcApp.PROJECT_NAME]:"Glomo",[this.constOcApp.LOCATION]:`${this.offers.findIndex((t=>t.id===e.id))+1} posicion`,[this.constOcApp.CAMPAIGN_FORMAT]:"banner crm",[this.constOcApp.COLLECTIVE_CODE]:"",[this.constOcApp.CAMPAIGN_NAME]:this._cleanString(e.offerDescription?e.offerDescription:""),[this.constOcApp.PRODUCT]:"seguros",[this.constOcApp.PRODUCT_CODE]:"",[this.constOcApp.QUANTITY]:"",[this.constOcApp.SITE_ACTION_NAME]:""},i=`${t.location}:${t.campaignFormat}:${t.collectiveCode}:${t.campaignName}:${t.product}:${t.productCode}:${t.quantity}`;t.siteActionName=i,this._fireEvent("contract-offer-payload",e.originalPayload),this._fireEvent("app-on-click-start",t)}else this._fireEvent("continue-payload-channel",e)}fireAnalyticsAppStep(e){this.dataAnalytic=Object.assign(this.dataAnalytic,e.data),this._fireEvent(`analytics-app-step-${e.event}`,this.dataAnalytic)}fireAnalyticsAppCompleted(e){this.dataAnalytic=Object.assign(this.dataAnalytic,e.data),this._fireEvent(`analytics-app-completed-${e.event}`,this.dataAnalytic),this._resetData()}fireAnalyticsAppCompletedRejection(e){this._fireEvent(`analytics-app-completed-${e.event}`,{attributes:[]}),this._resetData()}_resetData(){this.dataAnalytic={}}_cleanString(e){return e?e.normalize("NFD").replace(/[\u0300-\u036f]/g,"").replace(/[^a-zA-Z0-9 ]/g,"").toLowerCase():""}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(`metasegura-${e}`,{detail:t,bubbles:!0,composed:!0}))}}customElements.define(Qa.is,Qa);
