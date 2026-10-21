import{z as t,a8 as e,ac as i,ar as a,a9 as o,aa as r,a as n,ap as s,an as l,L as c,ag as d,F as b,b$ as h,ak as p,bx as g,b1 as v,h as m,i as u,aW as y,c0 as f,f as x,g as _,ab as k,ad as $,cR as S,bU as w,b6 as C,bF as T,cS as L,b0 as P,av as I,aI as E,b_ as M,aJ as O,bl as z,cE as B,cF as q,bt as R,cG as A,be as F,al as D,bc as V,aK as H,ae as N,bh as U,Z as j,o as W,l as X,cO as G,G as Y,el as K,em as Z,bf as J,bH as Q,cB as tt,U as et,bI as it,bA as at,bz as ot,aN as rt,ah as nt,d as st,e as lt,aX as ct,b3 as dt,bG as bt,dK as ht,di as pt,eV as gt,az as vt,cI as mt}from"./952f98a9.js";import{a7 as ut}from"./7f3d7ca9.js";import{B as yt}from"./1d5112ec.js";import{d as ft}from"./216055dc.js";import"./3e14f6f9.js";import"./c0a2f832.js";import"./cae0f1de.js";const xt=new a;var _t=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(o.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${e(o.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${e(o.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${e(o.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
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
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 10) * 1em);
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${e(i.typeMedium)}));
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
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
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
${xt.mediaRules()}`;class kt extends(n(s(l(c)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":d,"bbva-icon":b,"bbva-badge-notification":h}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[_t,p("bbva-header-main-shared-styles"),g("button:focus"),v.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return m`<bbva-icon icon="${u(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return m`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const o=kt.toCamelCase(t),r=`icon${o}`,n=`accessibilityTextIcon${o}`;return m`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${u(this.t(this[n]))}"
      aria-expanded=${u(a)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return m` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${u(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return m`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:o,microillustration:r}=this;return m`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${u(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${o}" ?hidden="${!r}" aria-hidden="true">
            ${this.microillustration&&y[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}_("colors.primaryCoreLightened"),_("colors.cool80"),_("colors.cool70"),_("colors.primaryCoreLightened"),_("colors.cool100"),_("colors.tertiaryType6Darkened"),_("colors.tertiaryType4Darkened");const $t=new a;var St=t`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${e(o.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
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
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
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
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
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
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${e(i.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${e($.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em) 0 0);
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${e($.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
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
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: 0;
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
  .transition-container {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .transition-container {
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${$t.mediaRules()}`;class wt extends(n(l(S))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":w,"bbva-icon":b,"bbva-text":d,"bbva-header-main":kt,"bbva-link":C}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height"},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=T(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,St,p("bbva-help-modal-shared-styles"),L.light,P.light]}get _fixedIOSHeader(){return m`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?m`
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
        `:""}get helpModalContent(){return m`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?m`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:m`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":m`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return m`
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
            ${this.linkText?m`<bbva-link
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
    `}get helpModalTitle(){return m`
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
          ${this.titleText?m` <bbva-text
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
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return m`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${I({"half-height":!this.fullHeight})}"
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
    `}}customElements.define(wt.is,wt),function(){if("object"==typeof window)if("IntersectionObserver"in window&&"IntersectionObserverEntry"in window&&"intersectionRatio"in window.IntersectionObserverEntry.prototype)"isIntersecting"in window.IntersectionObserverEntry.prototype||Object.defineProperty(window.IntersectionObserverEntry.prototype,"isIntersecting",{get:function(){return this.intersectionRatio>0}});else{var t=window.document;i.prototype.THROTTLE_TIMEOUT=100,i.prototype.POLL_INTERVAL=null,i.prototype.USE_MUTATION_OBSERVER=!0,i.prototype.observe=function(t){if(!this._observationTargets.some((function(e){return e.element==t}))){if(!t||1!=t.nodeType)throw new Error("target must be an Element");this._registerInstance(),this._observationTargets.push({element:t,entry:null}),this._monitorIntersections(),this._checkForIntersections()}},i.prototype.unobserve=function(t){this._observationTargets=this._observationTargets.filter((function(e){return e.element!=t})),this._observationTargets.length||(this._unmonitorIntersections(),this._unregisterInstance())},i.prototype.disconnect=function(){this._observationTargets=[],this._unmonitorIntersections(),this._unregisterInstance()},i.prototype.takeRecords=function(){var t=this._queuedEntries.slice();return this._queuedEntries=[],t},i.prototype._initThresholds=function(t){var e=t||[0];return Array.isArray(e)||(e=[e]),e.sort().filter((function(t,e,i){if("number"!=typeof t||isNaN(t)||t<0||t>1)throw new Error("threshold must be a number between 0 and 1 inclusively");return t!==i[e-1]}))},i.prototype._parseRootMargin=function(t){var e=(t||"0px").split(/\s+/).map((function(t){var e=/^(-?\d*\.?\d+)(px|%)$/.exec(t);if(!e)throw new Error("rootMargin must be specified in pixels or percent");return{value:parseFloat(e[1]),unit:e[2]}}));return e[1]=e[1]||e[0],e[2]=e[2]||e[0],e[3]=e[3]||e[1],e},i.prototype._monitorIntersections=function(){this._monitoringIntersections||(this._monitoringIntersections=!0,this.POLL_INTERVAL?this._monitoringInterval=setInterval(this._checkForIntersections,this.POLL_INTERVAL):(a(window,"resize",this._checkForIntersections,!0),a(t,"scroll",this._checkForIntersections,!0),this.USE_MUTATION_OBSERVER&&"MutationObserver"in window&&(this._domObserver=new MutationObserver(this._checkForIntersections),this._domObserver.observe(t,{attributes:!0,childList:!0,characterData:!0,subtree:!0}))))},i.prototype._unmonitorIntersections=function(){this._monitoringIntersections&&(this._monitoringIntersections=!1,clearInterval(this._monitoringInterval),this._monitoringInterval=null,o(window,"resize",this._checkForIntersections,!0),o(t,"scroll",this._checkForIntersections,!0),this._domObserver&&(this._domObserver.disconnect(),this._domObserver=null))},i.prototype._checkForIntersections=function(){var t=this._rootIsInDom(),i=t?this._getRootRect():{top:0,bottom:0,left:0,right:0,width:0,height:0};this._observationTargets.forEach((function(a){var o=a.element,n=r(o),s=this._rootContainsTarget(o),l=a.entry,c=t&&s&&this._computeTargetAndRootIntersection(o,i),d=a.entry=new e({time:window.performance&&performance.now&&performance.now(),target:o,boundingClientRect:n,rootBounds:i,intersectionRect:c});l?t&&s?this._hasCrossedThreshold(l,d)&&this._queuedEntries.push(d):l&&l.isIntersecting&&this._queuedEntries.push(d):this._queuedEntries.push(d)}),this),this._queuedEntries.length&&this._callback(this.takeRecords(),this)},i.prototype._computeTargetAndRootIntersection=function(e,i){if("none"!=window.getComputedStyle(e).display){for(var a,o,n,l,c,d,b,h,p=r(e),g=s(e),v=!1;!v;){var m=null,u=1==g.nodeType?window.getComputedStyle(g):{};if("none"==u.display)return;if(g==this.root||g==t?(v=!0,m=i):g!=t.body&&g!=t.documentElement&&"visible"!=u.overflow&&(m=r(g)),m&&(a=m,o=p,n=void 0,l=void 0,c=void 0,d=void 0,b=void 0,h=void 0,n=Math.max(a.top,o.top),l=Math.min(a.bottom,o.bottom),c=Math.max(a.left,o.left),d=Math.min(a.right,o.right),h=l-n,!(p=(b=d-c)>=0&&h>=0&&{top:n,bottom:l,left:c,right:d,width:b,height:h})))break;g=s(g)}return p}},i.prototype._getRootRect=function(){var e;if(this.root)e=r(this.root);else{var i=t.documentElement,a=t.body;e={top:0,left:0,right:i.clientWidth||a.clientWidth,width:i.clientWidth||a.clientWidth,bottom:i.clientHeight||a.clientHeight,height:i.clientHeight||a.clientHeight}}return this._expandRectByRootMargin(e)},i.prototype._expandRectByRootMargin=function(t){var e=this._rootMarginValues.map((function(e,i){return"px"==e.unit?e.value:e.value*(i%2?t.width:t.height)/100})),i={top:t.top-e[0],right:t.right+e[1],bottom:t.bottom+e[2],left:t.left-e[3]};return i.width=i.right-i.left,i.height=i.bottom-i.top,i},i.prototype._hasCrossedThreshold=function(t,e){var i=t&&t.isIntersecting?t.intersectionRatio||0:-1,a=e.isIntersecting?e.intersectionRatio||0:-1;if(i!==a)for(var o=0;o<this.thresholds.length;o++){var r=this.thresholds[o];if(r==i||r==a||r<i!=r<a)return!0}},i.prototype._rootIsInDom=function(){return!this.root||n(t,this.root)},i.prototype._rootContainsTarget=function(e){return n(this.root||t,e)},i.prototype._registerInstance=function(){},i.prototype._unregisterInstance=function(){},window.IntersectionObserver=i,window.IntersectionObserverEntry=e}function e(t){this.time=t.time,this.target=t.target,this.rootBounds=t.rootBounds,this.boundingClientRect=t.boundingClientRect,this.intersectionRect=t.intersectionRect||{top:0,bottom:0,left:0,right:0,width:0,height:0},this.isIntersecting=!!t.intersectionRect;var e=this.boundingClientRect,i=e.width*e.height,a=this.intersectionRect,o=a.width*a.height;this.intersectionRatio=i?Number((o/i).toFixed(4)):this.isIntersecting?1:0}function i(t,e){var i,a,o,r=e||{};if("function"!=typeof t)throw new Error("callback must be a function");if(r.root&&1!=r.root.nodeType)throw new Error("root must be an Element");this._checkForIntersections=(i=this._checkForIntersections.bind(this),a=this.THROTTLE_TIMEOUT,o=null,function(){o||(o=setTimeout((function(){i(),o=null}),a))}),this._callback=t,this._observationTargets=[],this._queuedEntries=[],this._rootMarginValues=this._parseRootMargin(r.rootMargin),this.thresholds=this._initThresholds(r.threshold),this.root=r.root||null,this.rootMargin=this._rootMarginValues.map((function(t){return t.value+t.unit})).join(" ")}function a(t,e,i,a){"function"==typeof t.addEventListener?t.addEventListener(e,i,a||!1):"function"==typeof t.attachEvent&&t.attachEvent("on"+e,i)}function o(t,e,i,a){"function"==typeof t.removeEventListener?t.removeEventListener(e,i,a||!1):"function"==typeof t.detatchEvent&&t.detatchEvent("on"+e,i)}function r(t){var e;try{e=t.getBoundingClientRect()}catch(t){}return e?(e.width&&e.height||(e={top:e.top,right:e.right,bottom:e.bottom,left:e.left,width:e.right-e.left,height:e.bottom-e.top}),e):{top:0,bottom:0,left:0,right:0,width:0,height:0}}function n(t,e){for(var i=e;i;){if(i==t)return!0;i=s(i)}return!1}function s(t){var e=t.parentNode;return e&&11==e.nodeType&&e.host?e.host:e&&e.assignedSlot?e.assignedSlot.parentNode:e}}();const Ct=new a;var Tt=t`:host {
  --_tab-color: var(--bbva-tab-default-dark-mode-text-color, var(--bbva-tab-default-text-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_tab-selected-color: var(--bbva-tab-default-dark-mode-selected-color, var(--bbva-tab-default-selected-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_tab-active-background-color: var(--bbva-tab-default-dark-mode-active-background-color, var(--bbva-tab-default-active-background-color, var(--colorsSecondary100, ${e(o.secondary100)})));
  --_icon-color: var(--bbva-tab-default-dark-mode-icon-color, var(--bbva-tab-default-icon-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_icon-selected-color: var(--bbva-tab-default-dark-mode-icon-selected-color, var(--bbva-tab-default-icon-selected-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_skeleton-quote-color: var(--bbva-tab-default-dark-mode-skeleton-color, var(--bbva-tab-default-skeleton-color, var(--colorsSecondary200, ${e(o.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-tab-default-dark-mode-skeleton-bg, var(--bbva-tab-default-skeleton-bg, transparent));
  --_skeleton-animated-layer-bg: var(--bbva-tab-default-skeleton-dark-mode-animated-layer-bg-color, var(--bbva-tab-default-skeleton-animated-layer-bg, var(--ambientsLight, ${e(E.light)})));
  --_gradient-sticky-background: var(--bbva-tab-default-dark-mode-gradient-sticky-background, var(--bbva-tab-default-gradient-sticky-background, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_gradient-background: var(--bbva-tab-default-dark-mode-gradient-background, var(--bbva-tab-default-gradient-background, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_right-gradient: var(--bbva-tab-default-dark-mode-gradient-right, var(--bbva-tab-default-right-gradient, linear-gradient(to right, var(--_gradient-background) 0%, rgba(255, 255, 255, 0) 100%)));
  --_left-gradient: var(--bbva-tab-default-dark-mode-gradient-left, var(--bbva-tab-default-left-gradient, linear-gradient(to right, var(--_gradient-background) 0%, rgba(255, 255, 255, 0) 100%)));
  display: block;
  position: relative;
  overflow: hidden;
  box-sizing: border-box;
  margin-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
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

.gradient {
  position: relative;
  min-height: var(--bbva-tab-default-min-height, calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
}

.tabs {
  display: flex;
  position: relative;
  overflow: hidden;
  box-sizing: border-box;
}
.tabs::-webkit-scrollbar {
  display: none;
}
.tabs button:first-child {
  padding-left: 1rem;
}
.tabs button:last-child {
  padding-right: 1rem;
}

.tab {
  position: relative;
  flex: 1;
  align-items: flex-start;
  max-width: 66.6%;
  min-width: 33.3%;
  min-height: 4rem;
  padding: var(--bbva-tab-default-tab-padding, calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em));
  background: none;
  border: none;
  box-shadow: inset 0 -1px 0 0 var(--bbva-tab-default-dark-mode-shadow, var(--bbva-tab-default-shadow, var(--colorsSecondary300, ${e(o.secondary300)})));
  font-family: inherit;
  font-size: var(--bbva-tab-default-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  font-weight: var(--bbva-tab-default-font-weight, var(--fontFacePrimaryBookFontWeight, ${e(k.book.fontWeight)}));
  line-height: var(--bbva-tab-default-line-height, var(--lineHeightTypeSmall, ${e($.typeSmall)}));
  color: var(--_tab-color);
}
.tab .title,
.tab .text {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.tab[aria-selected=true] {
  box-shadow: inset 0 -1px 0 0 var(--bbva-tab-default-dark-mode-shadow-selected, var(--bbva-tab-default-shadow-selected, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  font-weight: var(--bbva-tab-default-selected-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)}));
  color: var(--_tab-selected-color);
}
.tab:active:not([disabled]), .tab[focus-visible]:not([disabled]) {
  box-shadow: inset 0 -1px 0 0 var(--bbva-tab-default-dark-mode-shadow-selected, var(--bbva-tab-default-shadow-selected, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  color: var(--_tab-selected-color);
  background-color: var(--_tab-active-background-color);
}

.icon-pack {
  display: flex;
  justify-content: center;
}
.icon-pack .icon-container {
  position: relative;
}
.icon-pack .icon-container .icon {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  color: var(--_icon-color);
}
.icon-pack .icon-container .icon.selected {
  color: var(--_icon-selected-color);
}

:host(.align-left) .tab {
  padding: var(--bbva-tab-default-align-left-tab-padding, calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) 0 calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em));
  text-align: left;
}
:host(.align-left) .tab .icon-pack {
  display: block;
  text-align: left;
}
:host(.align-left) .tab .text {
  font-size: var(--bbva-tab-default-align-left-text-font-size, var(--typographyTypeMedium, ${e(i.typeMedium)}));
  line-height: var(--bbva-tab-default-align-left-text-line-height, var(--lineHeightTypeMedium, ${e($.typeMedium)}));
  font-weight: var(--bbva-tab-default-align-left-text-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)}));
}

:host([hide-paddings]) .tabs button:first-child {
  padding-left: 0;
}
:host([hide-paddings]) .tabs button:last-child {
  padding-right: 0;
}
:host([hide-paddings]) .tab {
  padding-top: 0;
  padding-bottom: 0;
}

:host([horizontal-scroll]) .gradient {
  position: relative;
}
:host([horizontal-scroll]) .gradient::before, :host([horizontal-scroll]) .gradient::after {
  content: "";
  position: absolute;
  width: 4rem;
  height: 100%;
  top: 0;
  pointer-events: none;
}
:host([horizontal-scroll]) .gradient::before {
  left: 0;
  z-index: var(--bbva-z-index-notifications, 3);
}
:host([horizontal-scroll]) .gradient::after {
  right: 0;
  z-index: var(--bbva-z-index-notifications, 3);
}
:host([horizontal-scroll]) .gradient .tabs {
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
}
:host([horizontal-scroll]) .gradient .tabs .tab {
  flex-basis: auto;
  flex-shrink: 0;
}

:host(.scroll-left) .gradient::before {
  background: var(--_left-gradient);
}

:host(.scroll-right) .gradient::after {
  background: var(--_right-gradient);
  transform: rotate(180deg);
}

.skeleton {
  opacity: 0;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) .gradient {
  display: flex;
  flex-direction: column;
  align-items: center;
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  overflow: hidden;
  width: 100%;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: calc((34% * 2) + (16px/ 2)) 16px, calc((34% * 2) + (16px/ 2)) 16px;
  background-position: 16% 24px, calc(70% + 120px) 24px;
}
:host([loading]) .gradient .tabs {
  opacity: 0;
}
:host([loading]) .gradient.subtitleTabs {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: calc((26% * 2) + (16px/ 2)) 16px, calc((26% * 2) + (16px/ 2)) 16px, calc((34% * 2) + (16px/ 2)) 16px, calc((34% * 2) + (16px/ 2)) 16px;
  background-position: 16% 24px, calc(42% + 120px) 24px, 24% 48px, calc(64% + 120px) 48px;
}
:host([loading]) .skeleton {
  background: var(--_skeleton-animated-layer-bg);
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  top: 0;
  right: 0;
  height: 5rem;
  left: 6.25rem;
}

:host([sticky]) {
  overflow: initial;
}
:host([sticky]) .gradient {
  position: sticky;
  position: -webkit-sticky;
  background-color: var(--_gradient-sticky-background);
}

:host([variant=badge]) .title {
  padding-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.container > div {
  outline: 0;
}

:host([full-height]) .container {
  height: 100%;
}
:host([full-height]) [role=tabpanel] {
  height: 100%;
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
${Ct.mediaRules()}`;var Lt=t`[ambient^=light] {
  --bbva-tab-default-skeleton-color: initial;
  --bbva-tab-default-skeleton-bg: initial;
  --bbva-tab-default-selected-color: initial;
  --bbva-tab-default-active-background-color: initial;
  --bbva-tab-default-icon-selected-color: initial;
  --bbva-tab-default-text-color: initial;
  --bbva-tab-default-icon-color: initial;
  --bbva-tab-default-shadow-selected: initial;
  --bbva-tab-default-shadow: initial;
  --bbva-tab-default-gradient-sticky-background: initial;
  --bbva-tab-default-gradient-background: initial;
  --bbva-tab-default-left-gradient: initial;
  --bbva-tab-default-right-gradient: initial;
}
${(new a).mediaRules()}`;const Pt=new a;const It={dark:t`
    ${t`[ambient^=dark] {
  --bbva-tab-default-selected-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-tab-default-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)});
  --bbva-tab-default-skeleton-bg: transparent;
  --bbva-tab-default-skeleton-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
  --bbva-tab-default-active-background-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
  --bbva-tab-default-icon-selected-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-tab-default-text-color: var(--colorsSecondary300, ${e(o.secondary300)});
  --bbva-tab-default-icon-color: var(--colorsSecondary300, ${e(o.secondary300)});
  --bbva-tab-default-shadow-selected: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-tab-default-shadow: #d3d3d366;
  --bbva-tab-default-gradient-sticky-background: var(--ambientsDark400, ${e(E.dark400)});
  --bbva-tab-default-gradient-background: var(--ambientsDark400, ${e(E.dark400)});
  --bbva-tab-default-right-gradient: linear-gradient(to right, var(--ambientsDark400, ${e(E.dark400)}) 0%, rgba(7, 33, 70, 0) 100%);
  --bbva-tab-default-left-gradient: linear-gradient(to right, var(--ambientsDark400, ${e(E.dark400)}) 0%, rgba(7, 33, 70, 0) 100%);
}
${Pt.mediaRules()}`}
    ${M.dark}
  `,light:t`
    ${Lt}
    ${M.light}
  `},Et=(t,e)=>String(t)===String(e);class Mt extends(O(n(s(l(c))))){static get is(){return"bbva-tab-default"}static get scopedElements(){return{"bbva-icon":b,"bbva-badge-notification":h}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},tabsPerPage:{type:Number,attribute:"tabs-per-page"},loading:{type:Boolean,reflect:!0},sticky:{type:Boolean,reflect:!0},rootMargin:{type:Number,attribute:"root-margin"},stickyBackgroundColor:{type:String,attribute:"sticky-background-color"},_gradientStyle:{type:Object},_content:{type:Object},variant:{type:String},disabled:{type:Boolean,reflect:!0},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},hidePaddings:{type:Boolean,attribute:"hide-paddings",reflect:!0}}}constructor(){super(),this.options=[],this.iconSize=24,this.selected=0,this.tabsPerPage=3,this.loading=!1,this.sticky=!1,this.disabled=!1,this.rootMargin=0,this.stickyBackgroundColor="",this._gradientStyle={top:"",zIndex:"",backgroundColor:""},this._updatedFlag=!1,this.fullHeight=!1}firstUpdated(t){super.firstUpdated(t),this.options.length>this.tabsPerPage&&this.classList.add("scroll-right"),this.sticky&&this._configStickyBehavior(),this.updateComplete.then((()=>{this._updatePanelElements()}))}updated(t){super.updated(t),t.has("options")&&this.options&&this._updatePanelElements(),(t.has("tabsPerPage")||t.has("options"))&&this.options&&(this.options.length>this.tabsPerPage?this.setAttribute("horizontal-scroll",""):this.removeAttribute("horizontal-scroll")),t.has("selected")&&this._select(t.get("selected"),this.selected)}static get styles(){return[super.styles,Tt,It.dark,It.light,p("bbva-tab-default-shared-styles"),g("button:focus")]}_containsSubtitles(){return this.options.filter((t=>t.text)).length>0}_icon(t,e){return m`
      <bbva-icon
        id="tab-icon-${e}"
        .size="${this.iconSize}"
        class="icon ${I({selected:Et(this.selected,e)})}"
        .icon="${t.icon}"
        aria-hidden="true"
      >
      </bbva-icon>
    `}static _getId(t,e){return t.panelId||`content-${e}`}_configStickyBehavior(){this._tabsHeader=this.shadowRoot.querySelector(".gradient"),this._configIntersectionObserver()}_intersectionCallback(t){this._configStickyStyle(!t[0].isIntersecting)}_configStickyStyle(t){this._gradientStyle=t?{top:`${this.rootMargin}px`,zIndex:20}:{top:"",zIndex:""},this.dispatchEvent(new CustomEvent("tab-default-sticky-behavior-change",{bubbles:!0,composed:!0,detail:t}))}_configIntersectionObserver(){const t={rootMargin:`-${this.rootMargin}px`,threshold:1};this._observer=new IntersectionObserver(this._intersectionCallback.bind(this),t),this._observer.observe(this.shadowRoot.querySelector(".sticky-guard"))}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.sticky&&this._observer.unobserve(this.shadowRoot.querySelector(".gradient")),this.disabledTabindex=!1}_updatePanelElements(){let t=!1;this.panels=this.options.map(((e,i)=>{const a=(this._updatedFlag?this.shadowRoot:this).querySelector(`[role="tabpanel"]#${(null==e?void 0:e.panelId)||`content-${i}`}`);let o=a;if(!this._updatedFlag&&o){t=!0;const r=Mt._getId(e,i),n=this.shadowRoot.querySelector(".container");o=document.createElement("div"),o.setAttribute("id",r),o.setAttribute("role","tabpanel"),o.setAttribute("aria-labelledby",`tab-${i}`);const s=document.createElement("slot");s.setAttribute("name",r),["role","id","aria-labelledby","hidden"].forEach((t=>a.removeAttribute(t))),a.setAttribute("slot",r),o.appendChild(s),n.appendChild(o),this.appendChild(a)}return o&&i!==this.selected&&(o.hidden=!0),o})),this._updatedFlag=this._updatedFlag||t}_select(t,e){var i;(this.panels[e]&&(this.panels[e].hidden=!1),this.panels[t]&&(this.panels[t].hidden=!0),this.hasAttribute("horizontal-scroll"))&&(null===(i=this.shadowRoot.querySelector("[aria-selected=true]"))||void 0===i||i.scrollIntoView({inline:"center",block:"nearest"}));this.dispatchEvent(new CustomEvent("tab-default-tab-change",{bubbles:!0,composed:!0,detail:{selectedIndex:e,info:this.options[e]}}))}_contentScroll(t){const e=t.currentTarget.scrollLeft,{scrollWidth:i,offsetWidth:a}=this.shadowRoot.querySelector("#tabs"),o=i-a;0!==e?this.classList.add("scroll-left"):this.classList.remove("scroll-left"),e<o?this.classList.add("scroll-right"):this.classList.remove("scroll-right")}_hideBadgeNotification(t){return"badge"!==this.variant||!t}render(){return m`
      ${this.sticky?m` <div class="sticky-guard"></div> `:m``}
      <div
        class="gradient ${this._containsSubtitles()?"subtitleTabs":""}"
        style="${z(this._gradientStyle)}"
      >
        <div
          id="tabs"
          class="tabs"
          role="tablist"
          aria-label="${u(this.accessibilityText)}"
          @scroll="${this._contentScroll}"
        >
          ${this.options.map(((t,e)=>m`
              <button
                id="tab-${e}"
                class="tab"
                role="tab"
                ?disabled="${this.disabled}"
                tabindex="${u(Et(this.selected,e)?void 0:"-1")}"
                aria-selected="${Et(this.selected,e)}"
                aria-controls="${Mt._getId(t,e)}"
                @click="${()=>{this.selected=e,this.dispatchEvent(new CustomEvent("tab-default-tab-click",{bubbles:!0,composed:!0,detail:{selectedIndex:e,info:t}}))}}"
              >
                <span class="icon-pack">
                  <span class="icon-container" ?hidden=${!t.icon}>
                    ${t.badgeText?m` <bbva-badge-notification
                          id="badge-${e}"
                          accessibility-text="${u(t.badgeAccessible)}"
                          class="badge"
                          position="left"
                          variant="alert"
                          text="${u(t.badgeText)}"
                        >
                          ${this._icon(t,e)}
                        </bbva-badge-notification>`:this._icon(t,e)}
                  </span>

                  <span class="title">${this.t(t.title)}</span>
                  <bbva-badge-notification
                    ?hidden=${this._hideBadgeNotification(t.badgeText)}
                    id="badge-right-${e}"
                    accessibility-text="${u(t.badgeAccessible)}"
                    class="badge"
                    text="${u(t.badgeText)}"
                    variant="alert"
                  ></bbva-badge-notification>
                </span>

                <span id="text-${e}" class="text" ?hidden=${!t.text}
                  >${this.t(t.text)}</span
                >
              </button>
            `))}
        </div>
        <div class="skeleton"></div>
      </div>
      <div class="container"></div>

      <slot></slot>
    `}}_("colors.cool20"),_("colors.cool20"),_("colors.primaryMediumLight"),_("colors.primaryMediumLight"),_("colors.cool60"),_("colors.cool20"),_("colors.primaryMediumLight"),_("colors.cool50"),_("colors.cool90"),_("colors.cool100"),_("colors.cool100"),_("colors.cool90"),_("colors.cool90");const Ot=new a;var zt=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e($.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(k.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${e(o.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)})));
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
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
${Ot.mediaRules()}`;var Bt=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new a).mediaRules()}`;const qt=new a;const Rt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${e(o.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${qt.mediaRules()}`}
    ${M.dark}
  `,light:t`
    ${Bt}
    ${M.light}
  `};class At extends(n(O(B))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":b,"bbva-core-image":q,"bbva-badge-notification":h}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,zt,p("bbva-button-action-shared-styles"),g(),Rt.light,Rt.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?m`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?m`<div class="app-pay-icon">${R[this.appPayIcon]}</div>`:m`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return m`
      ${this.notifications?m`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:m` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}var Ft={...f,...A,bbvaButtonAction:`\n        --bbva-button-action-dark-mode-color: ${_("colors.primarySubdued")};\n        --bbva-button-action-active-dark-mode-color: ${_("colors.primaryCoreLight")};\n        --bbva-button-action-card-logo-dark-mode-dark-display: inline;\n        --bbva-button-action-card-logo-dark-mode-light-display: none;\n    `},Dt=t`[ambient^=light] {
  --bbva-button-row-active-color: initial;
  --bbva-button-row-skeleton-color: initial;
  --bbva-button-row-skeleton-animated-layer-bg: initial;
  --bbva-button-row-skeleton-bg: initial;
}
`,Vt=t`[ambient^=dark] {
  --bbva-button-row-active-color: var(--colorsPrimarySubduedLight, ${e(o.primarySubduedLight)});
  --bbva-button-row-skeleton-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
  --bbva-button-row-skeleton-bg: transparent;
  --bbva-button-row-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)});
}
`;const Ht={dark:t`
    ${Rt.dark}
    ${Vt}
  `,light:t`
    ${Rt.light}
    ${Dt}
  `},Nt=new a;var Ut=t`:host {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  box-sizing: border-box;
  position: relative;
  min-height: 5rem;
  --_button-row-skeleton-animated-layer-bg: var(--bbva-button-row-dark-mode-skeleton-animated-layer-bg-color, var(--bbva-button-row-skeleton-animated-layer-bg, var(--ambientsLight, ${e(E.light)})));
  --_button-row-button-action-color: var(--bbva-button-row-dark-mode-button-action-color);
  --_button-row-photography-variant-color: var(--bbva-button-row-dark-mode-photography-variant-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${e(o.primaryMedium)})));
  --_button-row-photography-variant-active-color: var(--bbva-button-row-dark-mode-photography-variant-active-color, var(--_button-row-active-color));
  padding: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  --_button-row-active-color: var(--bbva-button-row-active-dark-mode-color, var(--bbva-button-row-active-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_button-row-skeleton-quote-color: var(--bbva-button-row-skeleton-dark-mode-color, var(--bbva-button-row-skeleton-color, var(--colorsSecondary200, ${e(o.secondary200)})));
  --_button-row-skeleton-quote-bg: var(--bbva-button-row-skeleton-dark-mode-bg, var(--bbva-button-row-skeleton-bg, transparent));
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

.button-row {
  display: flex;
  flex-wrap: wrap;
  box-sizing: border-box;
  outline: var(--bbva-button-row-buttons-outline, none);
  width: 100%;
}
.button-row .listitem-button {
  flex-basis: 33%;
  text-align: center;
  display: flex;
}
.button-row .listitem-button [data-tag-name=bbva-button-action] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  max-width: none;
  width: 100%;
  height: 100%;
  margin-bottom: auto;
}
.button-row .listitem-button [data-tag-name=bbva-button-action]:not([href])[active]:not([aria-disabled=true]) {
  background-color: transparent;
  color: var(--_button-row-active-color);
}
.button-row.three-buttons {
  justify-content: space-between;
}
.button-row.three-buttons::after {
  content: "";
  flex: auto;
}
.button-row.three-buttons .listitem-button {
  flex: none;
}

:host([variant=simple]) .button-row {
  padding: 0;
}
:host([variant=simple]) .listitem-button {
  flex: 1;
}

:host([class=one-button]) > .button-row > .listitem-button {
  flex-basis: 100%;
}

:host([class=two-buttons]) > .button-row > .listitem-button {
  flex-basis: 50%;
}

:host([class=four-buttons]) > .button-row > .listitem-button {
  flex-basis: 25%;
}

:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action] {
  color: var(--_button-row-photography-variant-color);
  --bbva-button-action-dark-mode-color: var(--_button-row-photography-variant-color);
}
:host([variant=photography]) .button-row .listitem-button [data-tag-name=bbva-button-action][active] {
  color: var(--_button-row-photography-variant-active-color);
  --bbva-button-action-active-dark-mode-color: var(--_button-row-photography-variant-active-color);
}

:host([loading]) {
  position: relative;
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  min-height: 5rem;
  width: 100%;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
  height: 5rem;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background: var(--_button-row-skeleton-animated-layer-bg);
}

:host([loading].one-button) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 50% 20px, calc(50% + 28px) 48px;
}

:host([loading].two-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 25% 20px, calc(25% + 5px) 48px, 75% 20px, calc(75% + 50px) 48px;
}

:host([loading].three-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 16% 20px, calc(16% - 1px) 48px, 50% 20px, calc(50% + 28px) 48px, 83% 20px, calc(83% + 58px) 48px;
}

:host([loading].four-buttons) {
  background-image: linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%), linear-gradient(var(--_button-row-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_button-row-skeleton-quote-color) 50%);
  background-color: var(--_button-row-skeleton-quote-bg);
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: calc(12%) 20px, calc(0% + 20px) 48px, calc(30% + 18px) 20px, calc(30% + 28px) 48px, calc(60% + 5px) 20px, calc(60% + 40px) 48px, calc(88% - 5px) 20px, calc(100% + 30px) 48px;
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
${Nt.mediaRules()}`;class jt extends(O(n(c))){static get is(){return"bbva-button-row"}static get scopedElements(){return{"bbva-button-action":At}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},options:{type:Array},iconSize:{type:Number,attribute:"icon-size"},selected:{type:Number},variant:{type:String},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.options=[],this.iconSize=24,this.selected=0,this.variant="",this.loading=!1}updated(){this.options&&this.options.length>0&&this._assignClass(this)}_assignClass(t){t.classList.remove("one-button","two-buttons","three-buttons","four-buttons"),1===this.options.length?t.classList.add("one-button"):2===this.options.length?t.classList.add("two-buttons"):3===this.options.length?t.classList.add("three-buttons"):4===this.options.length&&t.classList.add("four-buttons")}static get styles(){return[Ut,p("bbva-button-row-shared-styles"),Ht.light,Ht.dark]}render(){return m`${this.loading?m`<div class="skeleton"></div>`:m` <div
          id="buttons"
          class="button-row"
          role="list"
          aria-label="${u(this.accessibilityText)}"
        >
          ${this.options.map(((t,e)=>this._getButton(t,e)))}
        </div>`}`}_getButton(t,e){return m`
      <span role="listitem" class="listitem-button">
        <bbva-button-action
          ?disabled="${this.disabled}"
          role="button"
          notifications-variant="alert"
          image="${u(t.image)}"
          .iconSize=${this.iconSize}
          .appPayIcon=${t.appPayIcon}
          .imageAltText="${this.imageAltText}"
          .icon="${t.icon}"
          .label="${t.label}"
          .notifications="${t.notifications}"
          @click="${()=>{this._select(e)}}"
        >
        </bbva-button-action>
      </span>
    `}_select(t){this.selected=t,this.dispatchEvent(new CustomEvent("button-row-item-click",{detail:t,bubbles:!0,composed:!0}))}}_("colors.primaryMediumLight"),_("colors.cool50"),_("colors.cool90"),_("colors.primarySubdued"),_("colors.primaryCoreLightened"),_("colors.primarySubduedLight");const Wt=new a;var Xt=t`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${e(o.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
${Wt.mediaRules()}`;const Gt=new a;var Yt=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(o.secondary300)});
}
${Gt.mediaRules()}`;const Kt=new a;const Zt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(o.secondary300)});
}
${Kt.mediaRules()}`}
  `,light:t`
    ${Yt}
  `};class Jt extends(n(c)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[Xt,Zt.light,Zt.dark,p("bbva-divider-shared-styles")]}render(){return m` <hr divider="${this.size}" /> `}}_("colors.cool40");const Qt=new a;var te=t`:host {
  display: block;
  box-sizing: border-box;
  border-radius: var(--borderRadiusSmall, ${e(F.small)});
  background: var(--bbva-card-contact-bg-dark-mode-color, var(--bbva-card-contact-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_name-color: var(--bbva-card-contact-name-dark-mode-color, var(--bbva-card-contact-name-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --_info-color: var(--bbva-card-contact-info-dark-mode-color, var(--bbva-card-contact-info-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_wrapper-height: var(--bbva-card-contact-wrapper-height, rem(128px));
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
  min-height: var(--_wrapper-height);
  display: block;
  width: 100%;
  margin: 0;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
  text-align: center;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e($.typeSmall)});
}

[data-tag-name=bbva-clip-box],
[data-tag-name=bbva-clip-entities] {
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-entities] {
  display: block;
}

:host(:not([link])) .name {
  display: block;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(k.medium.fontStyle)});
  color: var(--_name-color);
}

.info {
  display: block;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(k.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(k.book.fontStyle)});
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
  color: var(--_info-color);
}

[data-tag-name=bbva-badge-default] {
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
}
${Qt.mediaRules()}`;const ee=new a;var ie=t`[ambient^=light] {
  --bbva-card-contact-bg-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-card-contact-name-color: var(--colorsSecondary600, ${e(o.secondary600)});
  --bbva-card-contact-info-color: var(--colorsSecondary500, ${e(o.secondary500)});
}
${ee.mediaRules()}`;const ae=new a;var oe=t`[ambient^=dark] {
  --bbva-card-contact-bg-color: var(--colorsPrimaryCore, ${e(o.primaryCore)});
  --bbva-card-contact-name-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-card-contact-info-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
}
${ae.mediaRules()}`;const re={dark:t`
    ${P.dark}
    ${Ht.dark}
    ${D.dark}
    ${Zt.dark}
    ${V.dark}
    ${oe}
  `,light:t`
    ${P.light}
    ${Ht.light}
    ${D.light}
    ${Zt.light}
    ${V.light}
    ${ie}
  `};class ne extends(n(c)){static get is(){return"bbva-card-contact"}static get scopedElements(){return{"bbva-divider":Jt,"bbva-clip-box":H,"bbva-button-row":jt,"bbva-link":C,"bbva-clip-entities":N,"bbva-badge-default":U}}static get properties(){return{actions:{type:Array},name:{type:String},info:{type:String},image:{type:String},icon:{type:String},link:{type:Boolean},linkHref:{type:String,attribute:"link-href"},entity:{type:String},srcEntity:{type:String,attribute:"src-entity"},srcDarkEntity:{type:String,attribute:"src-dark-entity"},statusLabel:{type:String,attribute:"status-label"},statusBadge:{type:String,reflect:!0,attribute:"status-badge"}}}static get styles(){return[te,p("bbva-card-contact-shared-styles"),re.light,re.dark]}constructor(){super(),this.actions=[],this.link=!1,this.image="",this.entity="",this.srcEntity="",this.srcDarkEntity="",this.statusLabel="",this.statusBadge="default"}_onClick(){this.dispatchEvent(new CustomEvent("card-contact-link-click",{detail:{name:this.name,info:this.info},bubbles:!0,composed:!0}))}get _clipTpl(){return(this.entity||this.srcEntity||this.srcDarkEntity)&&m`
          <bbva-clip-entities
            .src="${this.srcEntity}"
            .srcDark="${this.srcDarkEntity}"
            .entity="${this.entity}"
            size="large"
          >
            ${this.bankImageAltText}
          </bbva-clip-entities>
        `||m`
        <bbva-clip-box
          class="${this.image||this.icon?"":"bitone"}"
          .text="${this.image||this.icon?"":this.name}"
          .image="${this.image}"
          .icon="${this.icon}"
          size="medium"
        >
        </bbva-clip-box>
      `}get _name(){return this.link?m`
          <bbva-link class="name" @click="${this._onClick}" .href="${this.linkHref}">
            ${this.name}
          </bbva-link>
        `:m` <span class="name">${this.name}</span> `}get _actions(){return this.actions&&this.actions.length>0?m`
          <bbva-divider></bbva-divider>
          <bbva-button-row disabled-tabindex .options="${this.actions}"></bbva-button-row>
        `:""}get _badgeDefault(){return m`
      <bbva-badge-default
        type="${u(this.statusBadge)}"
        .text="${this.statusLabel}"
      ></bbva-badge-default>
    `}render(){return m`
      <div class="wrapper">
        ${this._clipTpl} ${this._name}
        <span class="info">${this.info}</span>
        ${this._badgeDefault} ${this._actions}
      </div>
    `}}_("colors.cool90"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened");const se=new a;var le=t`:host {
  --_bg-color: var(--bbva-progress-content-dark-mode-bg-color, var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_spinner-message-color: var(--bbva-progress-content-dark-mode-spinner-message-color, var(--bbva-progress-content-spinner-message-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --_spinner-message-size: var(--bbva-progress-content-spinner-message-size, 0.9375rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color, var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${e(o.primaryCore)})));
  --_login-content-bg-color: var(--bbva-progress-content-dark-mode-login-content-bg-color, var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)})));
  --_login-content-text-color: var(--bbva-progress-content-dark-mode-login-text-color, var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) + 3rem);
  --_progress-content-mask-display: var(--bbva-progress-content-dark-mode-mask-display, var(--bbva-progress-content-mask-display, initial));
  --_progress-content-no-mask-display: var(--bbva-progress-content-dark-mode-no-mask-display, var(--bbva-progress-content-no-mask-display, none));
  z-index: var(--bbva-progress-content-z-index, 10);
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  display: none;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  min-height: 3rem;
  overflow: hidden;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e($.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(k.medium.fontStyle)});
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

.overlay {
  visibility: hidden;
  flex: auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  background-color: var(--_bg-color);
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
}
.overlay p {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  color: var(--_spinner-message-color);
  font-size: var(--_spinner-message-size);
}

:host([variant=bottom]) {
  top: auto;
  bottom: 0;
  height: auto;
  --bbva-spinner-size: var(--_small-spinner-size);
}
:host([variant=bottom]) .overlay {
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
}

.spinner.no-mask {
  display: var(--_progress-content-no-mask-display);
}

.spinner.mask {
  display: var(--_progress-content-mask-display);
}

:host([variant=login]) .overlay {
  padding-bottom: var(--_content-height);
  background-color: var(--_login-bg-color);
  --bbva-core-spinner-bg-color: var(--_login-bg-color);
  --bbva-foundations-spinner-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color);
}

:host([variant=transparent]) .spinner {
  transition: opacity 80ms linear 160ms;
  opacity: 0;
}
:host([variant=transparent]) .overlay {
  transition: visibility 0s linear 240ms, opacity 240ms linear;
  opacity: 0;
}

.content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 100%;
  left: 0;
  transform: translateY(calc(var(--_content-height) * -1));
  background-color: var(--_login-content-bg-color);
}

.layer {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  height: 100%;
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color);
}

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

:host([visible]) {
  display: flex;
}
:host([visible]) .overlay {
  visibility: visible;
}

:host([login-animation]) .content {
  animation-name: message;
  animation-duration: var(--bbva-progress-content-login-animation-message-duration, 1500ms);
  animation-delay: var(--bbva-progress-content-login-animation-message-delay, 0ms);
  animation-fill-mode: forwards;
}

:host([visible][variant=transparent]) .overlay {
  transition-delay: 0s;
  opacity: 0.9;
}
:host([visible][variant=transparent]) .spinner {
  opacity: 1;
}

:host([login-animation][login-successful]) .content {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: content;
}
:host([login-animation][login-successful]) .layer {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: layer;
}

@keyframes message {
  from {
    transform: translateY(0);
  }
  to {
    transform: translateY(calc(var(--_content-height) * -1));
  }
}
@keyframes content {
  to {
    transform: translateY(-100%);
  }
}
@keyframes layer {
  to {
    transform: translateY(calc(50% - var(--_content-height) / 2));
  }
}
${se.mediaRules()}`;const ce=new a;var de=t`[ambient^=dark] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreLight, ${e(o.primaryCoreLight)});
  --bbva-progress-content-mask-display: none;
  --bbva-progress-content-no-mask-display: block;
}

[ambient^=dark200] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${e(o.primaryCore)});
}

[ambient^=dark300] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
}

[ambient^=dark400] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)});
}
${ce.mediaRules()}`;var be=t`[ambient^=light] {
  --bbva-progress-content-bg-color: initial;
  --bbva-progress-content-mask-display: initial;
  --bbva-progress-content-no-mask-display: initial;
}
${(new a).mediaRules()}`;const he={dark:t`
    ${G.dark}
    ${v.dark}
    ${de}
  `,light:t`
    ${G.light}
    ${v.light}
    ${be}
  `};class pe extends(n(l(c))){static get is(){return"bbva-progress-content"}static get scopedElements(){return{"bbva-icon":b,"bbva-text":d,"bbva-spinner":Y}}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:String,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String},spinnerMessageLabel:{type:String,attribute:"spinner-message-label"},showSpinnerMessageLabel:{type:Boolean,attribute:"show-spinner-message-label"},visible:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="full",this.loginIcon=K(),this.loginSuccessIcon=Z(),this.loginIconSize="M",this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1,this.spinnerMessageLabel="bbva-progress-content-login-loading-message",this.showSpinnerMessageLabel=!1,this.visible=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}get _loginIconSize(){const t={S:16,M:24,L:32},e=parseInt(this.loginIconSize,10);return Object.values(t).includes(e)?e:t[this.loginIconSize]||24}updated(t){super.updated&&super.updated(t),(t.has("loginSuccessful")||t.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess()),t.has("visible")&&void 0!==t.get("visible")&&this._notifyVisibleChanged()}static get styles(){return[le,he.dark,he.light,p("bbva-progress-content-shared-styles")]}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowProgressContent=this._showLoader.bind(this),this._boundHideProgressContent=this._hideLoader.bind(this),this._parentElement.addEventListener("show-loader",this._boundShowProgressContent),this._parentElement.addEventListener("hide-loader",this._boundHideProgressContent)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._parentElement.removeEventListener("show-loader",this._boundShowProgressContent),this._parentElement.removeEventListener("hide-loader",this._boundHideProgressContent)}render(){return m`
      <div class="overlay">
        <span class="sr-only" role="alert" aria-busy="true">
          <slot></slot>
        </span>
        <bbva-spinner
          id="spinner"
          class="spinner no-mask"
          ?paused="${!this.visible}"
        ></bbva-spinner>
        <bbva-spinner
          id="spinnerMask"
          class="spinner mask"
          ?paused="${!this.visible}"
          ?with-mask="${"login"!==this.variant}"
        ></bbva-spinner>
        <bbva-text
          size="S"
          ?hidden=${!this.showSpinnerMessageLabel}
          .text=${this.t(this.spinnerMessageLabel,"bbva-progress-content-login-loading-message")}
        >
        </bbva-text>
      </div>

      ${"login"===this.variant?m`
            <div class="content" @animationend="${this._onAnimationEnd}">
              <div class="layer">
                <bbva-icon
                  class="icon"
                  .icon="${this._getLoginIcon}"
                  .size="${this._loginIconSize}"
                ></bbva-icon>
                <div class="message">${this.t(this._loginMessageLabel)}</div>
              </div>
            </div>
          `:""}
    `}_onAnimationEnd(t){"content"===t.animationName&&this._fireEvent("progress-content-success-login-click")}_fireEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_setLoginInProcess(){const[t]=this.loginMessageLabels;this._loginMessageLabel=t,this._loadingMessageInterval=setInterval((()=>{const t=this.loginMessageLabels.indexOf(this._loginMessageLabel),e=this.loginMessageLabels[t+1]||this.loginMessageLabels[0];this._loginMessageLabel=e}),this.loginMessageTimer),this._fireEvent("progress-content-start-login-click")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("progress-content-success-login-click")}_notifyVisibleChanged(){this._fireEvent("progress-content-visible-changed",this.visible)}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}show(){this.visible=!0}showCustom({variant:t="full",showSpinnerMessageLabel:e=!1,loginAnimation:i=!1}){this.variant=t,this.showSpinnerMessageLabel=e,this.loginAnimation=i,this.show()}_showLoader(t){this.showCustom(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}hide(){this.visible=!1}_hideLoader(t){this.hide(),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}}_("colors.cool90"),_("colors.primaryCoreLightened"),_("colors.cool90"),_("colors.cool70"),_("colors.primaryCoreLightened");const ge=new a;var ve=t`:host {
  --_select-bg-color: var(--bbva-form-select-bg-dark-mode-color, var(--bbva-form-select-bg-color,var(--colorsSecondary100, ${e(o.secondary100)})));
  --_select-border-color: var(--bbva-form-select-border-dark-mode-color, var(--bbva-form-select-border-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-readonly-border-color: var(--bbva-form-select-readonly-border-dark-mode-color, var(--bbva-form-select-readonly-border-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-button-color: var(--bbva-form-select-button-dark-mode-color, var(--bbva-form-select-button-color,var(--colorsSecondary600, ${e(o.secondary600)})));
  --_select-readonly-button-color: var(--bbva-form-select-readonly-button-dark-mode-color, var(--bbva-form-select-readonly-button-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-label-color: var(--bbva-form-select-label-dark-mode-color, var(--bbva-form-select-label-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-filled-label-color: var(--bbva-form-select-filled-label-dark-mode-color, var(--bbva-form-select-filled-label-color,var(--colorsSecondary600, ${e(o.secondary600)})));
  --_select-readonly-label-color: var(--bbva-form-select-readonly-label-dark-mode-color, var(--bbva-form-select-readonly-label-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-label-value-color: var(--bbva-form-select-label-value-dark-mode-color, var(--bbva-form-select-label-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_select-icon-color: var(--bbva-form-select-icon-dark-mode-color, var(--bbva-form-select-icon-color,var(--colorsPrimaryMedium, ${e(o.primaryMedium)})));
  --_select-readonly-icon-color: var(--bbva-form-select-readonly-icon-dark-mode-color, var(--bbva-form-select-readonly-icon-color,var(--colorsSecondary500, ${e(o.secondary500)})));
  --_message-color: var(--bbva-form-select-message-dark-mode-color, var(--bbva-form-select-message-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --_message-icon-color: var(--bbva-form-select-message-icon-dark-mode-color, var(--bbva-form-select-message-icon-color, var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-select-info-message-dark-mode-color, var(--bbva-form-select-info-message-color, var(--colorsSecondary500, ${e(o.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-select-info-message-icon-dark-mode-color, var(--bbva-form-select-info-message-icon-color, var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)})));
  --_invalid-select-color: var(--bbva-form-select-invalid-dark-mode-color, var(--bbva-form-select-invalid-color,var(--colorsSecondary600, ${e(o.secondary600)})));
  --_invalid-select-bg-color: var(--bbva-form-select-invalid-bg-dark-mode-color, var(--bbva-form-select-invalid-bg-color,var(--colorsTertiaryType5Lightened, ${e(o.tertiaryType5Lightened)})));
  --_invalid-select-border-color: var(--bbva-form-select-invalid-border-dark-mode-color, var(--bbva-form-select-invalid-border-color,var(--colorsTertiaryType5Medium, ${e(o.tertiaryType5Medium)})));
  --_invalid-select-label-color: var(--bbva-form-select-invalid-label-dark-mode-color, var(--bbva-form-select-invalid-label-color,var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)})));
  --_invalid-select-icon-color: var(--bbva-form-select-invalid-icon-dark-mode-color, var(--bbva-form-select-invalid-icon-color,var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)})));
  --_form-select-title-color: var(--bbva-form-select-title-dark-mode-color, var(--bbva-form-select-title-color, var(--colorsSecondary600, ${e(o.secondary600)})));
  --_form-select-label-out-color: var(--bbva-form-select-label-out-dark-mode-color, var(--bbva-form-select-label-out-color ,var(--colorsSecondary600, ${e(o.secondary600)})));
  --_form-select-help-icon-color: var(--bbva-form-select-help-icon-dark-mode-color, var(--bbva-form-select-help-icon-color,var(--colorsPrimaryMedium, ${e(o.primaryMedium)})));
  --_form-select-options-overlay-bg-color: var(--bbva-form-select-options-overlay-bg-dark-mode-color, var(--bbva-form-select-options-overlay-bg-color, var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)})));
  --_form-select-options-wrapper-bg-color: var(--bbva-form-select-options-wrapper-bg-dark-mode-color, var(--bbva-form-select-options-wrapper-bg-color, var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)})));
  display: block;
  box-sizing: border-box;
  position: relative;
  min-height: 4rem;
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

.slot-select ::slotted(select) {
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

.info-title {
  font-family: inherit;
  font-size: var(--bbva-form-select-font-size, var(--typographyTypeSmall, ${e(i.typeSmall)}));
  line-height: var(--bbva-form-select-line-height, var(--lineHeightTypeSmall, ${e($.typeSmall)}));
  font-weight: var(--bbva-form-select-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(k.medium.fontWeight)}));
  color: var(--_form-select-title-color);
  margin-bottom: var(--bbva-form-select-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
}

.label-out {
  --bbva-text-color: var(--_form-select-label-out-color);
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  display: flex;
}

.label {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  color: var(--_select-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
[aria-invalid=true] .label {
  color: var(--_invalid-select-label-color);
}
:host([show-value]) .label {
  width: 70%;
}
:host([readonly]) .label {
  color: var(--_select-readonly-label-color);
}
:host([filled]) .label {
  width: 125%;
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem)) scale(0.8);
  transition: transform 0.2s ease-in-out;
}
:host([filled]):not([aria-invalid=true]) .label {
  color: var(--_select-filled-label-color);
}
.label-value {
  position: absolute;
  top: 0;
  right: 0;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
  transform-origin: top right;
  color: var(--_select-label-value-color);
}

.help-icon {
  color: var(--_form-select-help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.content {
  display: flex;
}
.content-text {
  flex: auto;
  min-width: 0;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
  color: var(--_select-filled-label-color);
}
:host([readonly]) .content-text {
  color: var(--_select-readonly-label-color);
}
.content-value {
  flex: none;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  color: var(--_select-label-value-color);
}

.button {
  position: relative;
  width: 100%;
  height: 3rem;
  font-family: inherit;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e($.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(k.book.fontWeight)});
  background-color: var(--_select-bg-color);
  color: var(--_select-button-color);
  border: none;
  border-bottom: 1px solid var(--_select-border-color);
  border-radius: 1px;
  margin: 0;
  outline: none;
  padding: 0;
  cursor: pointer;
  text-align: left;
}
.button::-moz-focus-inner {
  border: 0;
}
.button[aria-invalid=true] {
  background-color: var(--_invalid-select-bg-color);
  border-bottom-color: var(--_invalid-select-border-color);
}
.button[aria-invalid=true] .content-text {
  color: var(--_invalid-select-color);
}
.button[disabled] {
  opacity: 0.4;
  cursor: default;
}
:host([readonly]) .button {
  color: var(--_select-readonly-button-color);
  border-bottom-color: var(--_select-readonly-border-color);
  cursor: default;
}
.button-content {
  display: flex;
  align-items: center;
  height: 100%;
}
.button-clip {
  flex: none;
  max-width: 3rem;
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}
.button-text {
  flex: auto;
  position: relative;
  height: 100%;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em) 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  min-width: 0;
}
.button-icon {
  flex: none;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  width: 3rem;
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--_select-icon-color);
}
[aria-invalid=true] .button-icon {
  color: var(--_invalid-select-icon-color);
}
:host([readonly]) .button-icon {
  color: var(--_select-readonly-icon-color);
}

.options-layer {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 1rem;
  opacity: 0;
  visibility: hidden;
  transition: opacity 0.2s, visibility 0s 0.2s;
}
.options-layer.opened {
  opacity: 1;
  visibility: visible;
  transition: opacity 0.2s, visibility 0s 0s;
}
.options-overlay {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  opacity: 0.95;
  background-color: var(--_form-select-options-overlay-bg-color);
}
.options-gradient {
  position: relative;
  max-width: 18rem;
  width: 100%;
}
.options-gradient::before, .options-gradient::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  height: 2.5rem;
}
.options-gradient::before {
  top: 0;
  background: linear-gradient(to bottom, var(--_form-select-options-wrapper-bg-color), rgba(255, 255, 255, 0));
}
.options-gradient::after {
  bottom: 0;
  background: linear-gradient(to top, var(--_form-select-options-wrapper-bg-color), rgba(255, 255, 255, 0));
}
.options-wrapper {
  overflow-y: auto;
  min-height: 14rem;
  max-height: 29rem;
  padding: 2.5rem 0;
  background-color: var(--_form-select-options-wrapper-bg-color);
  box-shadow: 0 1px 1px 0 rgba(18, 18, 18, 0.2);
  border-radius: 1px;
}

:host([native-selector]) select {
  z-index: 1;
  pointer-events: all;
  appearance: menulist-button;
  width: 100%;
  height: 3rem;
  cursor: pointer;
  opacity: 0;
  position: absolute;
  left: 0;
  margin: 0;
}

:host([focus-visible][native-selector]) #button {
  outline: auto;
}

:host([native-selector]) .options-layer {
  display: none;
}

[data-tag-name=bbva-notification-help] {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
  --bbva-notification-help-icon-color: var(--_info-message-icon-color);
  --bbva-notification-help-text-color: var(--_info-message-color);
  --bbva-notification-help-icon-color-alert: var(--_message-icon-color);
  --bbva-notification-help-text-color-alert: var(--_message-color);
}

@media (min-width: 600px) {
  .options-layer {
    position: absolute;
    top: 3rem;
    bottom: auto;
    display: block;
    padding: 0;
    transition: none;
  }
  .options-layer.opened {
    transition: none;
  }
  .options-overlay {
    display: none;
  }
  .options-gradient {
    max-width: none;
  }
  .options-gradient::before, .options-gradient::after {
    display: none;
  }
  .options-wrapper {
    padding: 0;
    max-height: none;
    min-height: 9rem;
    box-shadow: var(--boxShadowType1, ${e(J.type1)});
  }
}
${ge.mediaRules()}`;const me=new a;var ue=t`[ambient^=light] {
  --bbva-form-select-bg-color: initial;
  --bbva-form-select-border-color: initial;
  --bbva-form-select-readonly-border-color: initial;
  --bbva-form-select-title-color: initial;
  --bbva-form-select-label-out-color: initial;
  --bbva-form-select-button-color: initial;
  --bbva-form-select-readonly-button-color: initial;
  --bbva-form-select-label-color: initial;
  --bbva-form-select-filled-label-color: initial;
  --bbva-form-select-readonly-label-color: initial;
  --bbva-form-select-icon-color: initial;
  --bbva-form-select-readonly-icon-color: initial;
  --bbva-form-select-message-color: initial;
  --bbva-form-select-message-icon-color: initial;
  --bbva-form-select-info-message-color: initial;
  --bbva-form-select-info-message-icon-color: initial;
  --bbva-form-select-invalid-bg-color: initial;
  --bbva-form-select-invalid-border-color: initial;
  --bbva-form-select-invalid-label-color: initial;
  --bbva-form-select-invalid-icon-color: initial;
  --bbva-form-select-invalid-color: initial;
  --bbva-form-select-help-icon-color: initial;
}

[ambient=light100] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
}
${me.mediaRules()}`;const ye=new a;var fe=t`[ambient^=dark] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLight, ${e(o.primaryCoreLight)});
  --bbva-form-select-border-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-readonly-border-color: var(--colorsSecondary100, ${e(o.secondary100)});
  --bbva-form-select-title-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-label-out-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-button-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-readonly-button-color: var(--colorsSecondary300, ${e(o.secondary300)});
  --bbva-form-select-label-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-filled-label-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-readonly-label-color: var(--colorsSecondary300, ${e(o.secondary300)});
  --bbva-form-select-icon-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-readonly-icon-color: var(--colorsSecondary100, ${e(o.secondary100)});
  --bbva-form-select-message-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-message-icon-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-info-message-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
  --bbva-form-select-invalid-bg-color: var(--colorsTertiaryType5Lightened, ${e(o.tertiaryType5Lightened)});
  --bbva-form-select-invalid-border-color: var(--colorsTertiaryType5Medium, ${e(o.tertiaryType5Medium)});
  --bbva-form-select-invalid-label-color: var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)});
  --bbva-form-select-invalid-icon-color: var(--colorsTertiaryType1Dark, ${e(o.tertiaryType1Dark)});
  --bbva-form-select-invalid-color: var(--colorsSecondary600, ${e(o.secondary600)});
  --bbva-form-select-help-icon-color: var(--colorsPrimarySubdued, ${e(o.primarySubdued)});
}

[ambient=dark100] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreLight, ${e(o.primaryCoreLight)});
  --bbva-form-select-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(o.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-select-bg-color: var(--colorsPrimaryCoreDark, ${e(o.primaryCoreDark)});
}
${ye.mediaRules()}`;const xe={dark:t`
    ${Q.dark}
    ${fe}
  `,light:t`
    ${Q.light}
    ${ue}
  `};class _e extends(n(l(tt))){static get is(){return"bbva-form-select"}static get scopedElements(){return{"bbva-icon":b,"bbva-core-select":tt,"bbva-form-option":et,"bbva-notification-help":it,"bbva-text":d}}static get optionTag(){return this.getScopedTagName("bbva-form-option").toUpperCase()}static get properties(){return{openIcon:{type:String,attribute:"open-icon"},closeIcon:{type:String,attribute:"close-icon"},iconSize:{type:Number,attribute:"icon-size"},showValue:{type:Boolean,attribute:"show-value"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoTitle:{type:String,attribute:"info-title"},infoMessage:{type:String,attribute:"info-message"},defaultClip:{type:Boolean,attribute:"default-clip"},nativeSelector:{type:Boolean,attribute:"native-selector"},allNative:{type:Boolean,attribute:"all-native"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:String,attribute:"help-icon"},accessibilityHelpText:{type:String,attribute:"accessibility-help-text"},optionalLabel:{type:String,attribute:"optional-label"},accessibilityIconNotification:{type:String,attribute:"accessibility-icon-notification"},nativeSelectAccessibilityText:{type:String,attribute:"native-select-accessibility-text"}}}constructor(){super(),this.openIcon=at(),this.closeIcon=ot(),this.iconSize=24,this.errorIcon=rt(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=nt(),this.infoIconSize=16,this.infoMessage="",this.infoTitle="",this.name="selector",this.nativeSelector=!1,this.optionalLabel="bbva-form-select-optional-label",this.accessibilityIconNotification="",this.nativeSelectAccessibilityText="",this.allNative=!1,this.addEventListener("change",this._fireSelectedItem),this.accessibilityHelpText="bbva-form-select-help-button-text",this.showValue=!1}firstUpdated(t){super.firstUpdated(t)}updated(t){super.updated&&super.updated(t),t.has("items")&&(this._items=[...this.shadowRoot.querySelectorAll(this.allNative?"option":this.constructor.optionTag.toLowerCase())],this._updateOptions()),t.has("_selectedOption")&&(this._selectedOptionText?this.setAttribute("filled",""):this.removeAttribute("filled"));const e=this.shadowRoot.querySelector(".options-wrapper");t.has("opened")&&e&&(this.opened||this.nativeSelector||this.allNative?e.removeAttribute("aria-hidden"):e.setAttribute("aria-hidden","true"))}_notificationLabel({elem:t,elem1:e,elem2:i,elem3:a}){return`${t} ${e} ${this._errorVisible&&i} ${this.infoMessage&&a}`}_shouldUpdateOptions(){var t;let e=!(null!==(t=this._options)&&void 0!==t&&t.length&&this._items.length===this._options.length&&this._options.every((t=>this._items.includes(t))));return this.allNative&&(e=e&&this._items.length>0),e}_updateOptions(){this._options=this._shouldUpdateOptions()?this._lightNodes.concat(this._items):this._options,this._enabledOptions=this._options.filter((t=>!t.disabled));const t=this._options.find((t=>t.selected));t?this._selectItem(t):this._unselect(),this.requestUpdate()}get _errorVisible(){return this.errorMessage&&this.invalid}get _selectedOptionText(){return this._selectedOption&&this._selectedOption.labelValue?this._selectedOption.labelValue:this._selectedOption&&this._selectedOption.text}get _selectedOptionLabel(){return this._selectedOption&&this._selectedOption.labelValue&&this._selectedOption.text?this._selectedOption.text:""}get _selectedOptionClip(){return this._selectedOption&&this._selectedOption.clip}get _selectedOptionValue(){return this._selectedOption&&this._selectedOption.value}static get styles(){return[g(".button:focus"),ve,p("bbva-form-select-shared-styles"),xe.dark,xe.light]}get field(){return m` ${this._control} ${this._optionsLayer} ${this._select} `}get _control(){return m`
      <button
        id="button"
        class="button"
        ?disabled="${this.disabled}"
        aria-expanded="${this.opened}"
        aria-invalid="${this.invalid}"
        aria-haspopup="listbox"
        aria-labelledby="${this._notificationLabel({elem:"label",elem1:"content-text",elem2:"alert",elem3:"info"})}"
        @click="${this._onButtonClick}"
        aria-hidden=${this.nativeSelector||this.allNative}
        tabindex=${this.nativeSelector?"-1":"0"}
      >
        ${this._controlContent}
      </button>
    `}get _controlContent(){return m`
      <span class="button-content">
        ${this._clip}
        <span class="button-text">
          ${this._label}
          <span class="content">
            <span id="content-text" class="content-text"> ${this._selectedOptionText} </span>
            ${this.showValue?m` <span class="content-value"> ${this._selectedOptionValue} </span> `:""}
          </span>
        </span>
        ${this._selectIcon}
      </span>
    `}get _clip(){if(this._selectedOptionClip){const t=this._selectedOptionClip.cloneNode(!0);return m` <span class="button-clip" aria-hidden="true"> ${t} </span> `}if(this.defaultClip&&void 0!==this.item(0)&&this.item(0).clip){const t=this.item(0).clip.cloneNode();return m` <span class="button-clip" aria-hidden="true"> ${t} </span> `}return""}get _label(){return this.labelOut&&!this.label&&(this.label=this.labelOut),m`
      <span id="label" class="label">${this._labelToShow}</span>
      ${this.showValue&&!this._selectedOptionValue?m` <span id="label-value" class="label-value">Value</span> `:""}
    `}get _labelToShow(){let t;return t=this._selectedOption&&this._selectedOptionLabel?this._selectedOptionLabel:this.label,this.labelOut||this.required||(t=`${t} ${this.t(this.optionalLabel)}`),m` ${t} `}get _selectIcon(){return m`
      <span class="button-icon" aria-hidden="true">
        <bbva-icon
          .icon="${this.opened?this.closeIcon:this.openIcon}"
          .size="${this.iconSize}"
        ></bbva-icon>
      </span>
    `}get _helpIcon(){return this.helpIcon&&this.labelOut?m`
          <bbva-icon
            role="button"
            aria-label="${this.t(this.accessibilityHelpText)}"
            @click="${this._helpClicked}"
            class="help-icon"
            .icon="${this.helpIcon}"
            size="24"
            .disabledTabindex="${!1}"
          >
          </bbva-icon>
        `:""}_helpClicked(){this.dispatchEvent(new CustomEvent("form-select-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _optionsLayer(){return m`
      <div class="options-layer ${this.opened&&!this.nativeSelector?"opened":""}">
        <div class="options-overlay"></div>
        <div class="options-gradient">
          <div class="options-wrapper">${this._optionsList}</div>
        </div>
      </div>
    `}get _labelOut(){return this.labelOut?m`
        <div class="label-out">
          <bbva-text
            tag="label"
            unset
            size="S"
            id="help-text"
            for="${this.nativeSelector||this.allNative?"selector":"button"}"
            .text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
          ></bbva-text>
          ${this._helpIcon}
        </div>
      `:""}_optionItemTemplate(t){return m`
      <bbva-form-option
        ?disabled="${t.disabled}"
        ?selected="${t.selected}"
        .value="${t.value}"
        >${t.text}</bbva-form-option
      >
    `}get messageError(){return this._errorVisible?m`
          <bbva-notification-help
            role="alert"
            class="alert"
            id="alert"
            disabled-tabindex
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.errorIcon}"
            .size="${this.errorIconSize}"
            text="${this.errorMessage}"
          ></bbva-notification-help>
        `:""}get messageInfo(){return this.infoMessage?m`
          <bbva-notification-help
            id="info"
            disabled-tabindex
            accessibility-label-icon="${this.accessibilityIconNotification}"
            .icon="${this.infoIcon}"
            size="${this.infoIconSize}"
            text="${this.infoMessage}"
          ></bbva-notification-help>
        `:""}get textTitle(){return this.infoTitle?m`
          <div class="info-title">
            <span>${this.infoTitle}</span>
          </div>
        `:""}get _nativeSelect(){return m`
      <select
        id="selector"
        name="${this.name}"
        aria-label="${this.nativeSelectAccessibilityText}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${t=>this._handleNativeOptionClick(t)}"
      >
        ${this.items.map((t=>m` <option
              ?disabled="${t.disabled}"
              ?selected="${t.selected}"
              value="${t.value}"
            >
              ${t.text}
            </option>`))};
      </select>
    `}get _hybridNativeSelect(){const t=this.querySelectorAll('[data-tag-name="bbva-form-option"]'),e=t.length>0?Array.from(t):this.items;return m`
      <select
        id="selector"
        name="${this.name}"
        aria-label="${this.nativeSelectAccessibilityText}"
        aria-describedby="${this._notificationLabel({elem:"label",elem1:"",elem2:"alert",elem3:"info"})}"
        ?disabled="${this.disabled}"
        ?required="${this.required}"
        @invalid="${this._onInvalid}"
        @change="${t=>this._handleNativeOptionClick(t)}"
        class="focus-only"
      >
        ${e.map((t=>m` <option
              ?disabled="${t.disabled}"
              ?selected="${t.selected}"
              value="${t.value}"
            >
              ${t.text}
            </option>`))}
      </select>
      ${this._control}${this._optionsLayer} ${this._select}
    `}_handleNativeOptionClick(t){null!=t&&t.target&&(this.selectedIndex=t.target.selectedIndex,this.value=t.target.value,this.dispatchEvent(new CustomEvent("change",{bubbles:!0,composed:!0})))}_fireSelectedItem(){this.dispatchEvent(new CustomEvent("bbva-form-select-selected-item",{bubbles:!0,composed:!0,detail:{selectedIndex:this.selectedIndex,value:this.value}}))}get _selector(){return this.allNative?this._nativeSelect:this.nativeSelector?this._hybridNativeSelect:this.field}render(){return m`
      ${this.textTitle} ${this._labelOut} ${this._selector} ${this.messageError} ${this.messageInfo}
    `}}_("colors.cool70"),_("colors.cool20"),_("colors.cool20"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.cool20"),_("colors.primaryCoreLightened"),_("colors.cool20"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.cool20"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.tertiaryType1Light"),_("colors.cool20"),_("colors.primaryCoreLightened"),_("colors.cool70"),_("colors.tertiaryType1Light"),_("colors.tertiaryType1Light"),_("colors.tertiaryType1Light"),_("colors.primaryCoreLightened"),_("colors.primaryCoreLightened"),_("colors.primaryMediumLight"),_("colors.secondary600"),_("colors.cool70");var ke=t`*, *:before, *:after {
  box-sizing: inherit;
}

:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-form-select] {
  --bbva-form-select-bg-color:var(--colorsPrimaryCoreDark);
  --bbva-form-select-label-color:var(--colorsPrimaryCoreLightened);
  --bbva-form-select-filled-label-color:var(--colorsPrimaryCoreLightened);
  --bbva-form-select-icon-color:var(--colorsPrimaryCoreLightened);
  --bbva-form-select-border-color:var(--colorsPrimaryCoreLightened);
}

.contain-select {
  background-color: var(--colorsPrimaryCoreDarkened, var(--colorsPrimaryCoreDarkened, ${e(o.primaryCoreDarkened)}));
  display: grid;
  justify-content: center;
  padding: 0.625rem;
  height: 5rem;
  width: 100%;
}

.select {
  width: 18.4375rem;
  padding-top: 0.5625rem;
}

.textoficina {
  margin-left: 0.625rem;
  margin-top: 0.625rem;
}

.textAddress {
  text-align: left;
  margin-left: 0.625rem;
  font-weight: 500;
}

.cubo {
  margin: 0.625rem;
  height: 15.625rem;
  box-shadow: -0.0625rem -0.0625rem 0.625rem var(--colorsSecondary100, var(--colorsSecondary100, ${e(o.secondary100)})), 0.0625rem 0.0625rem 0.625rem var(--colorsSecondary100, var(--colorsSecondary100, ${e(o.secondary100)}));
}

[data-tag-name=bbva-tab-default] {
  margin: unset;
}

.textAddress [data-tag-name=bbva-text] {
  --bbva-text-color: var(--colorsSecondary500, token("foundations.colors.secondary500"));
}

.textoficina [data-tag-name=bbva-text] {
  --bbva-text-color: var(--colorsPrimaryMedium, token("foundations.colors.primaryMedium"));
}
`;class $e extends(ct(ut(dt(l(c))))){static get is(){return"modal-help"}static get scopedElements(){const t=[wt,bt,d,...$e.configurationScopedElements()];return $e.scopedElementsFromClasses(t)}static get properties(){return{isFirsthLoadOpenModal:{type:Boolean},imgModal:{type:Object}}}constructor(){super(),this.isFirsthLoadOpenModal=!1}render(){return m` ${this.isFirsthLoadOpenModal?m` <bbva-help-modal
    visible
    id = "modal-inicial"
    full-height
    fixed-footer
    i-o-s-fixed-header
    header-type="modal"
    hidde-content-padding-top
    header-text="${this.t("equity-modal-header")}"
    button-text="${this.t("equity-modal-button")}">
      <div slot="slot-title">
          <img alt="${this.imgModal.alt}" src="${this.imgModal.url}" width="${this.imgModal.width}" height="${this.imgModalError.height}"/>
          <bbva-text text="${this.t("equity-modal-title")}" size="S" alignment="center" ></bbva-text>
      </div>
      <div slot="slot-content">
        <bbva-list-bullet icon="${ht()}" text="${this.t("equity-modal-list-first")}"></bbva-list-bullet>
        <bbva-list-bullet icon="${ht()}" text="${this.t("equity-modal-list-second")}"></bbva-list-bullet>
        <bbva-list-bullet icon="${ht()}" text="${this.t("equity-modal-list-third")}"></bbva-list-bullet>
        <bbva-list-bullet icon="${ht()}" text="${this.t("equity-modal-list-fourth")}"></bbva-list-bullet>
      </div>
    </bbva-help-modal>`:""}`}}class Se extends(ct(ut(dt(l(c))))){static get is(){return"home-page"}static get scopedElements(){const t=[kt,pe,Mt,ne,jt,d,_e,wt,pt,et,yt,ft,...Se.configurationScopedElements()];return Se.scopedElementsFromClasses(t)}static get properties(){return{bankerOne:{type:Array},bankerTwo:{type:Array},optionsRowBotton:{type:Array},contractMask:{type:Array},branch:{type:String},direction:{type:String},contactCellphone:{type:String},contactOficce:{type:String},isCheckAvailableSchedule:{type:Boolean},extensionNum:{type:String},phoneElite:{type:String},host:{type:String},native:{type:Boolean},requiredToken:{type:String},_privatePortfoliosDm:{type:Object},privatePortafoliosApiVersion:{type:String},isGoBack:{type:Boolean},isHomePageLoading:{type:Boolean},simpleCode:{type:String},expands:{type:Array},tabSelected:{type:Number},isFirsthLoadOpen:{type:Boolean},selectedItemIndex:{type:Number},isLoading:{type:Boolean},isMoreContracts:{type:Boolean},imgHours:{type:Object}}}constructor(){super(),this.productId="",this.expandArray=[],this.simpleCode="",this.host="",this.native=!1,this.requiredToken="",this.isGoBack=!1,this.contractMask=[],this.contactCellphone="",this.contactOficce="",this.extensionNum="",this.phoneElite="",this.direction="",this.isHomePageLoading=!1,this.isCheckAvailableSchedule=!1,this.bankerOne=[],this.bankerTwo=[],this.selectedItemIndex=0,this.isFirsthLoadOpen=!1,this.isLoading=!1,this.options=[{title:this.t("equity-tab-default-content-one-title"),panelId:this.t("equity-tab-default-content-one-panel-id")},{title:this.t("equity-tab-default-content-two-title"),panelId:this.t("equity-tab-default-content-two-panel-id")}],this.tabSelected=0,this.isMoreContracts=!1}static get styles(){return[ke,Ht.light,Ht.dark]}firstUpdated(){this.isFirsthLoadOpen=!0,this.isLoading=!0}updated(t){if(t.has("expands")&&this.expands&&this.simpleCode&&this.contractMask&&this.activeSelectionFeature(),!t.has("bankerOne")&&this.bankerOne&&(this.simpleCode=this.bankerOne.id),t.has("simpleCode")&&this.simpleCode&&void 0!==this.expands){const t=this.expands.find((t=>t.id===this.simpleCode));void 0!==t&&this.setDataExapandTabSelected(t)}!t.has("isLoading")&&this.isLoading&&setTimeout((()=>{this.isLoading=!1}),2e3)}activeSelectionFeature(){const t=this.contractMask.findIndex((t=>t.simpleCode===this.simpleCode));-1!==t&&(this.selectedItemIndex=t,this.tabSelected=0),this.selectedContrac({detail:{value:this.simpleCode}}),this.isFirsthLoadOpen=!1}buttonRowOptions(t){if(0===t.detail)this._fireCallData(this.contactCellphone),this._fireEvent("analytic-footprint-fire-event","contact-cell-phone");else if(1===t.detail){if(this.ischeckAvailableSchedule=this.checkAvailableSchedule(),this.ischeckAvailableSchedule){const t=this.shadowRoot.querySelector("#modal-horas");this._fireEvent("analytic-footprint-fire-event","office-available-schedule"),t.open()}else this._fireEvent("analytic-footprint-fire-event","contact-office");this._fireCallData(`${this.contactOficce},${this.extensionNum}`)}}checkAvailableSchedule(){const t=(new Date).getHours();return t<8||t>=16}_accionesButtonRow(){return this.optionsRowBotton=[{icon:gt(),label:`${this.t("equity-modal-hours-button")}${this.t("equity-modal-button-phone")}`},{icon:vt(),label:`${this.t("equity-modal-hours-button")}${this.t("equity-modal-button-office")}`}],m`<bbva-button-row
      ambient="dark"
      ?loading="${this.isHomePageLoading}"
      style="padding-left: 0px;background-color: #1973B8;"
      @button-row-item-click=${this.buttonRowOptions}
      .options="${this.optionsRowBotton}"
    >
    </bbva-button-row>`}_bbvaModalHours(){return m` <bbva-help-modal
      id="modal-horas"
      full-height
      fixed-footer
      i-o-s-fixed-header
      header-type="modal"
      hide-content-padding-top
      header-text="${this.t("equity-modal-header")}"
      body-text="${this.t("equity-modal-hours-title")}"
      button-text="${this.t("equity-modal-hours-button")}"
      @help-modal-footer-button-click="${this.callPhoneClick}"
    >
      <div slot="slot-title">
        <img alt="${this.imgHours.alt}" src="${this.imgHours.url}" width="${this.imgHours.width}" height="${this.imgHours.height}" />
        <bbva-text
          text="${this.t("equity-modal-hours-text")}
          ${this.t("equity-modal-hours-text-down")}"
          size="L"
          alignment="center"
        ></bbva-text>
      </div>
    </bbva-help-modal>`}callPhoneClick(){this._fireEvent("open-call-dialer-launcher",{value:String(this.phoneElite)})}setDataExapandTabSelected(t){const{bankers:e}=t,[i,a]=e;this.bankerOne=i,this.bankerTwo=a;const{branch:o,direction:r,contacts:{contac:n}}=e[this.tabSelected];this.branch=o,this.direction=r,this.contactOficce=n[0].contactOficce.contact,this.extensionNum=n[1].extensionNum.contact,this.contactCellphone=n[2].contactCellphone.contact}tabDefaultTabChange(t){if(this.tabSelected=t.detail.selectedIndex,void 0!==this.expands){const t=this.expands.find((t=>t.id===this.simpleCode));void 0!==t&&this.setDataExapandTabSelected(t)}}tabDefaultTabClick(t){if(this.tabSelected=t.detail.selectedIndex,void 0!==this.expands){const t=this.expands.find((t=>t.id===this.simpleCode));void 0!==t&&this.setDataExapandTabSelected(t)}}selectedContrac(t){if(this.simpleCode=t.detail.value,void 0!==this.expands){const t=this.expands.find((t=>t.id===this.simpleCode));void 0!==t&&this.setDataExapandTabSelected(t)}}_DataProviderBankingPortfoliosBusinessAgent(){return m` <bbva-dataprovider-banking-portfolios
      id="dataproviderBankingPortfoliosbusinessagents"
      .host="${this.host}"
      ?native="${this.native}"
      .apiVersion="${this.privatePortafoliosApiVersion}"
      .requiredToken="${this.requiredToken}"
      @banking-portfolios-business-agents-sucess="${this._handlerBankingPortfoliosBusinessAgentsSucess}"
      @banking-portfolios-business-agents-error="${this._handlerBankingPortfoliosBusinessAgentsError}"
      @api-dm-error="${this._handlerBankingPortfoliosBusinessAgentsError}"
    >
    </bbva-dataprovider-banking-portfolios>`}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_fireCallData(t){this._currenTelphone=t,this._fireEvent("open-call-dialer-launcher",{value:String(t)})}capitalizeText(t){if(""!==t&&void 0!==t)return t.toLowerCase().replace(/(?:^|\s)\w/g,(t=>t.toUpperCase()))}loader(){return m` ${this.isLoading?m`<bbva-progress-content
          id="loader"
          show-spinner-message-label
          visible
          >Loading</bbva-progress-content
        >`:""}`}_BbvaFormSelect(){return m` ${this.isMoreContracts?m`<div class="contain-select">
                <bbva-form-select
                  class="select"
                  selected-index="${this.selectedItemIndex}"
                  ?loading="${this.isHomePageLoading}"
                  label="${this.t("equity-label")}"
                  icon="${at()}"
                  required
                  @bbva-form-select-selected-item="${this.selectedContrac}"
                >
                  ${this.contractMask.map((t=>m` <bbva-form-option
                      value="${t.simpleCode}"
                      option-label="${t.mask}"
                    ></bbva-form-option>`))}
              </bbva-form-select>
              </div>`:""}`}render(){return m` ${this.loader()} ${this._bbvaModalHours()}
      <bbva-header-main
        accessibility-text-icon-left-primary="${this.t("equity-modal-header-icon-left")}"
        icon-left-primary="${mt()}"
        text="${this.t("equity-modal-header")}"
      >
      </bbva-header-main>
      ${this._BbvaFormSelect()}
      <bbva-tab-default
        .options="${this.options}"
        ?loading="${this.isHomePageLoading}"
        @tab-default-tab-change=${this.tabDefaultTabChange}
        @tab-default-tab-click=${this.tabDefaultTabClick}
      >
      <bbva-divider-default></bbva-divider-default>
        <div
          class="panel"
          role="tabpanel"
          id="${this.t("equity-tab-default-content-one-panel-id")}"
          aria-labelledby="${this.t("equity-tab-default-content-one-panel-id")}"
        >
        <div class="cubo">
          <bbva-card-contact
            name=${this.capitalizeText(this.bankerOne.fullName)}
            info="${this.capitalizeText(`${this.t("equity-tab-default-card-info")} ${this.bankerOne.info}`)}"
          >
          </bbva-card-contact>
          <bbva-text
            text="${this.t("equity-tab-default-text-first")}
            ${this.t("equity-tab-default-text-second")}
            ${this.t("equity-tab-default-text-third")}"
                  alignment="center"
                  unset
          ></bbva-text>
          </div>
          </div>
        <div
          class="panelSecond"
          role="tabpanel"
          id="${this.t("equity-tab-default-content-two-panel-id")}"
          aria-labelledby="${this.t("equity-tab-default-content-two-panel-id")}"
        >
          <div class="cubo">  
          <bbva-card-contact
            name=${this.capitalizeText(this.bankerTwo.fullName)}
            info="${this.capitalizeText(`${this.t("equity-tab-default-card-info")} ${this.bankerTwo.info}`)}"
          >
          </bbva-card-contact>
          <bbva-text
            text="${this.t("equity-tab-default-text-first")}
            ${this.t("equity-tab-default-text-second")}
            ${this.t("equity-tab-default-text-third")}"
            alignment="center"
            unset
          ></bbva-text>
            </div>
        </div>
      </bbva-tab-default>
      ${this._accionesButtonRow()}
      <div class="textoficina">
        <bbva-text
          font-weight="500"
          text="${this.t("equity-home-page-office")}"
          unset
        ></bbva-text>
      </div>
      <div class="textAddress">
        <bbva-text
          ?loading="${this.isHomePageLoading}"
          text=${this.capitalizeText(this.branch)}
          unset
        ></bbva-text>
      </div>
      <div class="textAddress">
        <bbva-text
          ?loading="${this.isHomePageLoading}"
          text=${this.capitalizeText(this.direction)}
          unset
        ></bbva-text>
      </div>
      `}}class we extends(ut(dt(l(c)))){static get is(){return"bbva-feature-equity-assistance"}static get scopedElements(){const t=[kt,pe,wt,Mt,ne,jt,$e,Se,_e,pt,d,et,bt,yt,ft,...we.configurationScopedElements()];return we.scopedElementsFromClasses(t)}static get properties(){return{host:{type:String},native:{type:Boolean},requiredToken:{type:String},financialOverviewApiVersion:{type:String},privatePortafoliosApiVersion:{type:String},phoneElite:{type:String},productId:{type:String},imgHours:{type:Object},imgModalError:{type:Object},imgModal:{type:Object},_bankerOne:{type:Array},_expands:{type:Array},_bankerTwo:{type:Array},_contractMask:{type:Array},_maskChar:{type:String},_financialOverviewDm:{type:Object},_privatePortfoliosDm:{type:Object},_isPrivateBankinCompleted:{type:Boolean},_isFinancialOverviewCompleted:{type:Boolean},_isGoBack:{type:Boolean},_isHomePageLoading:{type:Boolean},_buttonErrorCounter:{type:Number},_isLoading:{type:Boolean},_isMoreContracts:{type:Boolean},_localStoragekey:{type:String},_showModalHelp:{type:Boolean},_selectedItemIndex:{type:Number}}}constructor(){super(),this.host="",this.productId="",this.simpleCode="",this.native=!1,this.requiredToken="",this.phoneElite="",this.financialOverviewApiVersion="",this.privatePortafoliosApiVersion="",this.imgHours={alt:"clock",url:"./images/Clock_funds.svg",width:"90",height:"90"},this.imgModalError={alt:"error",url:"./images/soft-token-enroll-errror.svg",width:"80",height:"80"},this.imgModal={alt:"chat",url:"./images/chat.svg",width:"80",height:"80"},this._maskChar="•",this._bankerOne=[],this._bankerTwo=[],this._contractMask=[],this._buttonErrorCounter=0,this._isPrivateBankinCompleted=!1,this._isFinancialOverviewCompleted=!1,this._isLoading=!1,this._isHomePageLoading=!1,this._isGoBack=!1,this._financialOverviewDm={},this._privatePortfoliosDm={},this._isMoreContracts=!1,this._showModalHelp=!1,this._selectedItemIndex=!1,this._localStoragekey=""}static get styles(){return[ke,p("bbva-feature-equity-assistance-shared-styles")]}init(){this._localStoragekey="equity_assistance",this._fireEvent("request-local-storage-data",{key:this._localStoragekey})}firstUpdated(){this._isPrivateBankinCompleted=!0,this._isFinancialOverviewCompleted=!0,this._isLoading=!0,this._isHomePageLoading=!0,this._setUpFinancialOverview(),this._setUpBankingPortfoliosBusinessAgents()}updated(t){t.has("_isFinancialOverviewCompleted")&&this._isFinancialOverviewCompleted&&this.productId&&(this._isFinancialOverviewCompleted=!1,this._setUpFinancialOverview(),this._startFinancialOverview()),t.has("_isPrivateBankinCompleted")&&this._isPrivateBankinCompleted&&this.productId&&(this._isPrivateBankinCompleted=!1,this._setUpBankingPortfoliosBusinessAgents(),this._startPrivateBankingPortfolios()),t.has("_isGoBack")&&this._isGoBack&&(this._isHomePageLoading=!1,this.init()),t.has("_isLoading")&&this._isLoading&&(this._isLoading=!1),t.has("_contractMask")&&this._contractMask.length>0&&this.setNumberContracts()}_startFinancialOverview(){this._getFinancialOverview()}_startPrivateBankingPortfolios(){this._getPrivateBankingPortfolioExpandBusinessAgents()}resetCycleLife(){this._fireEvent("analytic-footprint-fire-event","init_reset-cycle-Life"),this._isGoBack=!1,this._isPrivateBankinCompleted=!0,this._isFinancialOverviewCompleted=!0,this._isLoading=!0,this.init()}_setUpFinancialOverview(){this._financialOverviewDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-financial-overview-api-dm"]')}_setUpBankingPortfoliosBusinessAgents(){this._privatePortfoliosDm=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-banking-portfolios"]')}_getFinancialOverview(){this._financialOverviewDm.getFinancialOverview()}_getPrivateBankingPortfolioExpandBusinessAgents(){const t={portfolioId:this.productId,expand:"businessAgents"};this._privatePortfoliosDm.getBankigPortfoliosBusinessAgents(t)}setContentContracts({contracts:t}){const e=t.filter((t=>"PT"===t.product.id));this._contractMask=e.map((t=>({alias:t.alias,mask:t.alias+this._maskChar,simpleCode:t.simpleCode,productId:t.id}))),this._isMoreContracts=this._contractMask.length>1}async setNumberContracts(){if(this._expands)for(const t of this._contractMask){const e=this._expands.find((e=>e.id===t.simpleCode));if(e){const{number:i}=e;t.mask=this._getFullMask(t.alias,i,5,1)}}}_handleFinancialOverviewSuccess({detail:t}){this.setContentContracts(t)}_handleFinancialOverviewError(){this._fireEvent("equity-assistance-financial-error")}_getFullMask(t,e,i,a){return t+this._maskChar.repeat(a)+e.substring(e.length-i)}getContactsBussinesAgents(t){return{contac:t.reduce(((t,e)=>{const{contact:i,contactType:a}=e;return"OFFICE_NUMBER"===a.id?t.push({contactOficce:{contact:i}}):"PHONE_EXTENSION"===a.id?t.push({extensionNum:{contact:i}}):"MOBILE_NUMBER"===a.id&&t.push({contactCellphone:{contact:i}}),t}),[])}}async setContentPrivateBankingPortFoliosExpand(t){var e;const i=await Promise.all(t.map((async t=>({id:t.id,number:t.number,bankers:await Promise.all(t.businessAgents.map((async e=>({id:t.id,simpleCode:t.number,fullName:e.fullName,info:e.profile.id,branch:e.branch.name,direction:`${e.address.addressName}, ${e.address.city}, ${e.address.state}, CP: ${e.address.zipCode}`,contacts:await this.getContactsBussinesAgents(e.contactDetails)}))))}))));this._expands=i,await this.setNumberContracts();const a=null===(e=this._contractMask.find((t=>t.productId===this.productId)))||void 0===e?void 0:e.simpleCode;if(void 0!==a){var o,r;const t=this._expands.find((t=>t.id===a)),e=this._expands.findIndex((e=>e.id===(null==t?void 0:t.id)));-1!==e&&(this._selectedItemIndex=e),this._bankerOne=this._expands.length>0?null===(o=this._expands[e])||void 0===o?void 0:o.bankers[0]:[],this._bankerTwo=this._expands.length>0?null===(r=this._expands[e])||void 0===r?void 0:r.bankers[1]:[]}}_handlerBankingPortfoliosBusinessAgentsSucess({detail:t}){this.setContentPrivateBankingPortFoliosExpand(t)}_handlerBankingPortfoliosBusinessAgentsError(){this._fireEvent("equity-assistance-banking-error");this.shadowRoot.querySelector("#modal-error").open()}_fireEvent(t,e={}){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_bbvaFinancialOverviewDm(){return m`
      <bbva-global-financial-overview-api-dm
          id="financialOverviewDm"
          .host="${this.host}"
          ?native="${this.native}"
          .version="${this.financialOverviewApiVersion}"
          .requiredToken="${this.requiredToken}"
          @financial-overview-api-dm-fetch="${this._handleFinancialOverviewSuccess}"
          @financial-overview-api-dm-fetch-error="${this._handleFinancialOverviewError}">
      </bbva-global-financial-overview-api-dm>`}_DataProviderBankingPortfoliosBusinessAgent(){return m`
      <bbva-dataprovider-banking-portfolios
        id='dataproviderBankingPortfoliosbusinessagents'
        .host='${this.host}'
        ?native='${this.native}'
        .apiVersion='${this.privatePortafoliosApiVersion}'
        .requiredToken='${this.requiredToken}'
        @banking-portfolios-business-agents-sucess='${this._handlerBankingPortfoliosBusinessAgentsSucess}'
        @banking-portfolios-business-agents-error='${this._handlerBankingPortfoliosBusinessAgentsError}'
        @api-dm-error='${this._handlerBankingPortfoliosBusinessAgentsError}'>
      </bbva-dataprovider-banking-portfolios>`}_bbvaHomePage(){return m`
      <home-page
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .contractMask = "${this._contractMask}"
        .expands = "${this._expands}"
        .bankerOne = "${this._bankerOne}"
        .bankerTwo = "${this._bankerTwo}"
        branch = "${this._bankerOne.branch}"
        direction = "${this._bankerOne.direction}"
        simpleCode = "${this._bankerOne.id}"
        .imgHours = "${this.imgHours}"
        .selectedItemIndex = "${this._selectedItemIndex}"
        phoneElite = "${this.phoneElite}"
        ?loading = "${this._isHomePageLoading}"
        isLoading = "${this._isLoading}"
        ?isMoreContracts = "${this._isMoreContracts}"
        ?start-equity-assistance = "${this._isPrivateBankinCompleted}"
        ?refresh-financial-overview = "${this._isFinancialOverviewCompleted}"
        ?go-back = "${this._isGoBack}"
        @header-main-icon-left-primary-click="${this.goBack}">
      </home-page>`}goBack(){this._isPrivateBankinCompleted&&(this._isGoBack=!0,this._isPrivateBankinCompleted=!1),this._fireEvent("equity-assistance-go-back")}handlePhone(t){this.phoneElite=t.contact.equityPhone}_bbvaModalError(){return m`
    <bbva-help-modal
      id = "modal-error"
      modal-type="warning"
      full-height
      i-o-s-fixed-header
      fixed-footer
      .closeModalElements="${[]}"
      header-type="modal"
      hide-content-padding-top 
      icon-right-primary=''
      icon-left-primary='${mt()}'
      header-text="${this.t("equity-modal-error-header")}"
      body-text="${this.t("equity-modal-error-body-text")}"
      button-text="${this._buttonErrorCounter>2?this.t("equity-modal-error-link-text").toUpperCase():this.t("equity-modal-error-body-text").toUpperCase()}"
      @help-modal-footer-button-click="${()=>{this._bbvaHelpModalFooterClickError()}}"
      link-text="${this._buttonErrorCounter>2?"":this.t("equity-modal-error-link-text")}"
      @help-modal-footer-link-click="${()=>{this._bbvaHelpModalLinkClick()}}"
      @header-main-icon-left-primary-click="${this.goBack}">
      <div slot="slot-title">
        <img alt="${this.imgModalError.alt}" src="${this.imgModalError.url}" width="${this.imgModalError.width}" height="${this.imgModalError.height}" />
        <bbva-text text="${this.t("equity-modal-error-text")}" size="L" alignment="center" ></bbva-text>
      </div>
    </bbva-help-modal>`}_bbvaHelpModalFooterClickError(){this._buttonErrorCounter>2?this._cancelHandleServices():this._errorHandleServices()}_bbvaHelpModalLinkClick(){this._buttonErrorCounter<2&&this._cancelHandleServices()}_errorHandleServices(){this._buttonErrorCounter+=1,this._isHomePageLoading&&this._startPrivateBankingPortfolios()}_cancelHandleServices(){this._buttonErrorCounter=0,this.goBack()}saveLocalStorageDataSuccess(t){this._showModalHelp=!t}saveLocalStorageDataError(t){999===t.code&&(this._showModalHelp=!0,this._setIntoLocalStorage(!0))}_setIntoLocalStorage(t){const e={key:this._localStoragekey,value:t};this._fireEvent("set-into-local-storage",e)}render(){return m`
      <modal-help 
        ?isFirsthLoadOpenModal = ${this._showModalHelp} 
        .imgModal = "${this.imgModal}">
      </modal-help>
      ${this._bbvaModalError()}
      ${this._bbvaHomePage()}
      ${this._bbvaFinancialOverviewDm()}
      ${this._DataProviderBankingPortfoliosBusinessAgent()}
    `}}class Ce extends we{static get is(){return"bbva-feature-equity-assistance-mx"}static get properties(){return{}}}customElements.define(Ce.is,Ce);
