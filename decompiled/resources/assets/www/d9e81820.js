import{z as t,a8 as e,ac as i,a9 as a,a as s,ap as r,an as n,L as o,ag as l,F as c,b$ as h,ak as d,bx as p,b1 as u,h as m,i as b,c0 as g,f as v,g as y,ad as f,ab as _,ar as S,aa as x,b_ as w,aJ as $,cE as k,cF as C,bt as E,cG as T,aq as R,bw as I,av as O,bl as A,aZ as P,aL as q,b3 as L,bG as D,di as H,bF as N,dK as j,aO as B,aU as M,cU as F,H as z}from"./952f98a9.js";import{G as X,D as U,a2 as V,Q as W,a1 as K,a4 as G,f as J,e as Y,H as Q,I as Z,a3 as tt,V as et,z as it,E as at}from"./216055dc.js";import"./12c02091.js";import{bk as st,a7 as rt,bf as nt,bg as ot,bP as lt,bT as ct,aL as ht,bQ as dt,bS as pt}from"./7f3d7ca9.js";import{a as ut}from"./def1c0af.js";import{B as mt,b as bt}from"./41ed0536.js";import{B as gt}from"./a7c05d27.js";import"./9ccc7ff3.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./7306257d.js";import"./e905e6bb.js";import"./a6969bf4.js";var vt=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${e(a.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(a.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${e(a.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${e(a.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${e(a.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${e(a.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${e(a.primarySubduedLight)}));
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
  cursor: pointer;
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
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
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
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
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

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class yt extends(s(r(n(o)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":l,"bbva-icon":c,"bbva-badge-notification":h}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[vt,d("bbva-header-main-shared-styles"),p("button:focus"),u.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return m`<bbva-icon icon="${b(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return m`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const s=yt.toCamelCase(t),r=`icon${s}`,n=`accessibilityTextIcon${s}`;return m`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${b(this.t(this[n]))}"
      aria-expanded=${b(a)}
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
      .text="${b(this.t(t))}"
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:s}=this;return m`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(s||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${b(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${s}"
            ?hidden="${!s}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}y("colors.primaryCoreLightened"),y("colors.cool80"),y("colors.cool70"),y("colors.primaryCoreLightened"),y("colors.cool100"),y("colors.tertiaryType6Darkened"),y("colors.tertiaryType4Darkened"),y("colors.secondary300");const ft=new S;var _t=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(f.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(_.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(_.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${e(a.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${e(a.primaryCoreDark)})));
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

label {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(x.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${ft.mediaRules()}`;var St=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new S).mediaRules()}`;const xt=new S;const wt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${e(a.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${xt.mediaRules()}`}
    ${w.dark}
  `,light:t`
    ${St}
    ${w.light}
  `};class $t extends(s($(k))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":c,"bbva-core-image":C,"bbva-badge-notification":h}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,_t,d("bbva-button-action-shared-styles"),p(),wt.light,wt.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?m`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?m`<div class="app-pay-icon">${E[this.appPayIcon]}</div>`:m`
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
      <label onclick="void(0)"> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}}y("colors.primarySubdued"),y("colors.primaryCoreLight");const kt=new S;var Ct=t`:host {
  --_list-swipe-invoker-bg-color: var(--bbva-list-swipe-dark-mode-invoker-bg-color, var(--bbva-list-swipe-invoker-bg-color, var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)})));
  --_list-swipe-operative-bg-color: var(--bbva-list-swipe-dark-mode-operative-bg-color, var(--bbva-list-swipe-operative-bg-color, var(--colorsPrimaryCore, ${e(a.primaryCore)})));
  --_list-swipe-informative-bg-color: var(--bbva-list-swipe-dark-mode-informative-bg-color, var(--bbva-list-swipe-informative-bg-color, var(--colorsPrimaryMedium, ${e(a.primaryMedium)})));
  --_list-swipe-actions-item-operative-error-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-bg-color, var(--bbva-list-swipe-actions-item-operative-error-bg-color, var(--colorsTertiaryType1Medium, ${e(a.tertiaryType1Medium)})));
  --_list-swipe-actions-item-operative-error-active-bg-color: var(--bbva-list-swipe-dark-mode-actions-item-operative-error-active-bg-color, var(--bbva-list-swipe-actions-item-operative-error-active-bg-color, var(--colorsTertiaryType1Dark, ${e(a.tertiaryType1Dark)})));
  --_list-swipe-informative-bg-color-active: var(--bbva-list-swipe-dark-mode-informative-bg-color-active, var(--bbva-list-swipe-informative-bg-color-active, var(--colorsPrimaryCoreLight, ${e(a.primaryCoreLight)})));
  --_list-swipe-operative-bg-color-active: var(--bbva-list-swipe-dark-mode-operative-bg-color-active, var(--bbva-list-swipe-operative-bg-color-active, var(--colorsPrimaryCoreDark, ${e(a.primaryCoreDark)})));
  --_list-swipe-button-action-color: var(--bbva-list-swipe-dark-mode-button-action-color, var(--bbva-list-swipe-button-action-color, var(--colorsPrimaryCoreLightened, ${e(a.primaryCoreLightened)})));
  display: block;
  box-sizing: border-box;
  width: 100%;
  position: relative;
  overflow: hidden;
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

:host([dragging]) {
  user-select: none;
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
  z-index: 1;
}
.left .sr-only {
  right: 4.0625rem;
  left: auto;
}

.invoker {
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
  position: relative;
  background-color: var(--_list-swipe-invoker-bg-color);
  will-change: transform;
  transform: translate3d(var(--_translate), 0, 0);
  z-index: 1;
}
.invoker.transition {
  transition: transform 0.2s;
}
.invoker.right {
  transform: translate3d(var(--_informative-width), 0, 0);
}
.invoker.left {
  transform: translate3d(var(--_operative-width), 0, 0);
}

:host([focus-visible]) .invoker:focus {
  outline-offset: -1px;
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
  background-image: linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 50%), linear-gradient(var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--bbva-list-swipe-dark-mode-skeleton-quote-color, var(--skeleton-quote-color, var(--colorsPrimaryCore, ${e(a.primaryCore)}))) 50%);
  background-color: var(--bbva-list-swipe-dark-mode-skeleton-quote-bg, var(--skeleton-quote-bg, var(--colorsPrimaryCoreLight, ${e(a.primaryCoreLight)})));
  background-size: 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px, 20px 20px, calc((50px * 2) + (16px/ 2)) 16px;
  background-position: 10% 20px, calc(10% - 8px) 48px, 37% 20px, calc(37% + 16px) 48px, 63% 20px, calc(63% + 40px) 48px;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

:host([animate]:not([opening])) .invoker {
  will-change: transform;
  transform: translate3d(initial, 0, 0);
}
:host([animate]:not([opening])) .invoker:not(.informative) {
  animation: panLeft 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker:not(.informative).large {
  animation-name: panLeftLarge;
}
:host([animate]:not([opening])) .invoker.informative {
  animation: panRight 1.5s cubic-bezier(0.25, 0.1, 0.25, 1) 1;
}
:host([animate]:not([opening])) .invoker.informative.large {
  animation-name: panRightLarge;
}

.actions-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
}

[data-tag-name=bbva-button-action] {
  width: 5.5rem;
  max-width: none;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(x.spacer)}))) / 16) * 1rem);
  color: var(--_list-swipe-button-action-color);
}
[data-tag-name=bbva-button-action][aria-disabled=true] {
  opacity: 1;
}

.actions {
  position: absolute;
  top: 0;
  height: 100%;
  display: flex;
  align-items: center;
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  user-select: none;
}
.actions-informative {
  left: 0;
  background-color: var(--_list-swipe-informative-bg-color);
}
.actions-informative [active] {
  background-color: var(--_list-swipe-informative-bg-color-active);
}
.actions-operative {
  right: 0;
  background-color: var(--_list-swipe-operative-bg-color);
}
.actions-operative [active] {
  background-color: var(--_list-swipe-operative-bg-color-active);
}
.actions-operative [warning] {
  background-color: var(--_list-swipe-actions-item-operative-error-bg-color);
}
.actions-operative [warning] [active] {
  background-color: var(--_list-swipe-actions-item-operative-error-active-bg-color);
}
.right-dir .actions-operative, .left-dir .actions-informative {
  visibility: hidden;
}
.actions-list {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
  height: 100%;
}
.actions-item {
  margin: 0;
  padding: 0;
  display: flex;
  align-items: center;
}
.actions-item [data-tag-name=bbva-button-action] {
  height: 100%;
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
@keyframes panLeft {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-86px);
  }
  30% {
    transform: translateX(-86px);
  }
  40% {
    transform: translateX(-86px);
  }
  50% {
    transform: translateX(-86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panLeftLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(-172px);
  }
  30% {
    transform: translateX(-172px);
  }
  40% {
    transform: translateX(-172px);
  }
  50% {
    transform: translateX(-172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(-2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRight {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(86px);
  }
  30% {
    transform: translateX(86px);
  }
  40% {
    transform: translateX(86px);
  }
  50% {
    transform: translateX(86px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
@keyframes panRightLarge {
  0% {
    transform: translateX(0);
  }
  20% {
    transform: translateX(172px);
  }
  30% {
    transform: translateX(172px);
  }
  40% {
    transform: translateX(172px);
  }
  50% {
    transform: translateX(172px);
  }
  65% {
    transform: translateX(0);
  }
  70% {
    transform: translateX(-6px);
  }
  80% {
    transform: translateX(0);
  }
  90% {
    transform: translateX(2px);
  }
  100% {
    transform: translateX(0);
  }
}
${kt.mediaRules()}`;class Et extends(r(s(n(o)))){static get is(){return"bbva-list-swipe"}static get scopedElements(){const t=[$t];return Et.scopedElementsFromClasses(t)}static get properties(){return{informativeActions:{type:Array,attribute:"informative-actions"},operativeActions:{type:Array,attribute:"operative-actions"},threshold:{type:Number},iconSize:{type:Number,attribute:"icon-size"},opening:{type:String},animate:{type:Boolean,reflect:!0},_transition:{type:Boolean},_translate:{type:Number},_operativeWidth:{type:Number},_informativeWidth:{type:Number},_swipeDirectionRight:{type:Boolean},_swipeDirectionLeft:{type:Boolean},_opened:{type:Boolean},_textStatus:{type:String},_firstTime:{type:String}}}constructor(){super(),this.operativeActions=[],this.informativeActions=[],this.threshold=.4,this.iconSize=24,this._transition=!0,this._translate=0,this.opening="",this._operativeWidth=0,this._informativeWidth=0,this._swipeDirectionRight=!1,this._swipeDirectionLeft=!1,this._opened=!1,this.animate=!1,this._accessibilityButtonActions="bbva-list-swipe-accessibility-button-actions",this._open="bbva-list-swipe-open",this._close="bbva-list-swipe-close",this._firstTime=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),requestAnimationFrame((()=>{this._informativeWidth=this._informative.offsetWidth,this._operativeWidth=this._operative.offsetWidth})),this._invoker=this.shadowRoot.querySelector(".invoker"),this._srOnlySelector=this._invoker.querySelector(".sr-only"),R(this._invoker,"track",(t=>this._onTrack(t))),I(this._invoker,"pan-y")}updated(t){super.updated&&super.updated(t),this._informative=this.shadowRoot.querySelector(".actions-informative"),this._operative=this.shadowRoot.querySelector(".actions-operative"),this._informativeItems=this.shadowRoot.querySelectorAll('.actions-informative [data-tag-name="bbva-button-action"]'),this._operativeItems=this.shadowRoot.querySelectorAll('.actions-operative [data-tag-name="bbva-button-action"]'),Et._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}),this._defaultLeftOpened(),this._defaultRightOpened(),t.has("opening")&&this.opening&&(this._opened=!0,this._swipeDirectionRight="right"===this.opening,this._rightOpened(),this._leftOpened(),this._firstTime=!0),this._contextualTextManager(),this.opening||(this._informativeItems.length>0&&(Et._hide(this._informative),this._informativeItems[0].blur()),this._operativeItems.length>0&&(Et._hide(this._operative),this._operativeItems[0].blur())),(this.operativeActions.length>1||this.informativeActions.length>1&&0===this.operativeActions.length&&!this.opening)&&this._invoker.classList.add("large"),this.informativeActions.length>0&&0===this.operativeActions.length&&this._invoker.classList.add("informative")}static _actionItemsState({informative:t,operative:e,tabindex1:i,tabindex2:a,ariadisabled1:s,ariadisabled2:r}){t.forEach((t=>{t.setAttribute("tabindex",i),t.setAttribute("aria-disabled",s)})),e.forEach((t=>{t.setAttribute("tabindex",a),t.setAttribute("aria-disabled",r)}))}static _show(t){t&&t.removeAttribute("aria-hidden")}static _hide(t){t&&t.setAttribute("aria-hidden","true")}static get styles(){return[p(".invoker:focus"),Ct,d("bbva-list-swipe-shared-styles"),wt.dark]}_defaultLeftOpened(){this._firstTime&&"left"===this.opening&&Et._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"})}_defaultRightOpened(){this._firstTime&&"right"===this.opening&&Et._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"})}_leftOpened(){"left"===this.opening&&this._opened&&(this._operativeItems.length>0||0===this._informativeItems.length)&&(Et._show(this._operative),Et._hide(this._informative),this._operativeItems[0].focus(),Et._actionItemsState({informative:this._informativeItems,tabindex1:"-1",ariadisabled1:"true",operative:this._operativeItems,tabindex2:"0",ariadisabled2:"false"}))}_rightOpened(){"right"===this.opening&&this._opened&&(this._informativeItems.length>0||0===this._operativeItems.length)&&(Et._show(this._informative),Et._hide(this._operative),this._informativeItems[0].focus(),Et._actionItemsState({informative:this._informativeItems,tabindex1:"0",ariadisabled1:"false",operative:this._operativeItems,tabindex2:"-1",ariadisabled2:"true"}))}_contextualTextManager(){this._opened?this._textStatus=this.t(this._close):this._textStatus=this.t(this._open)}render(){const t={"--_translate":`${this._translate}px`,"--_operative-width":-1*this._operativeWidth+"px","--_informative-width":`${this._informativeWidth}px`},e={transition:this._transition,right:"right"===this.opening,left:"left"===this.opening},i={"right-dir":this._swipeDirectionRight,opened:this._opened};return m`
      <div
        class="invoker ${O(e)}"
        style="${A(t)}"
        @transitionend="${this._onInvokerTransitionEnd}"
        @keydown="${this._onInvokerKeydown}"
      >
        <slot name="invoker"></slot>
        ${this.informativeActions.length>0||this.operativeActions.length>0?m`<span class="sr-only"
              >${this.t(this._accessibilityButtonActions,{status:this._textStatus})}</span
            >`:""}
      </div>

      <div class="actions-wrapper ${O(i)}">
        <div class="actions actions-informative">
          ${this.informativeActions.length?m`
                <ul class="actions-list">
                  ${this.informativeActions.map(((t,e)=>this._actionItems(t,e,"informative")))}
                </ul>
              `:""}
        </div>
        <div class="actions actions-operative">
          ${this.operativeActions.length?m`
                <ul class="actions-list">
                  ${this.operativeActions.map(((t,e)=>this._actionItems(t,e,"operative")))}
                </ul>
              `:""}
        </div>
      </div>
    `}_actionItems(t,e,i){return m`
      <li class="actions-item" ?warning="${t.warning}">
        <bbva-button-action
          ambient="dark"
          .icon="${t.icon}"
          .iconSize="${this.iconSize}"
          .label="${t.label}"
          @click="${()=>this._onActionClick(t,e,i)}"
        ></bbva-button-action>
      </li>
    `}_onTrack(t){var e;if(null!=t&&null!==(e=t.detail)&&void 0!==e&&e.state)switch(t.detail.state){case"start":this._trackStart();break;case"end":this._trackEnd(t.detail.dx);break;default:this._trackX(t.detail.dx)}}_trackStart(){this.setAttribute("dragging",""),this._invokerWidth=this._invoker.offsetWidth,this._opened=!0,this._operativeWidth=this._operative.offsetWidth,this._informativeWidth=this._informative.offsetWidth,this._setTrackReferences(this.opening),this.opening="",this._translate=this._startingPoint,this._transition=!1}_setTrackReferences(t){return"right"===t?(this._rightLimit=0,this._leftLimit=0-this._operativeWidth-this._informativeWidth,this._leftThreshold=0-this._informativeWidth-this._operativeWidth*this.threshold,this._rightThreshold=0-this._informativeWidth*this.threshold,this._startingPoint=this._informativeWidth,void(this._midThreshold=-1*this._informativeWidth)):"left"===t?(this._rightLimit=this._informativeWidth+this._operativeWidth,this._leftLimit=0,this._leftThreshold=this._operativeWidth*this.threshold,this._rightThreshold=this._operativeWidth+this._informativeWidth*this.threshold,this._startingPoint=-1*this._operativeWidth,void(this._midThreshold=this._operativeWidth)):(this._rightLimit=this._informativeWidth,this._leftLimit=0-this._operativeWidth,this._leftThreshold=0-this._operativeWidth*this.threshold,this._rightThreshold=this._informativeWidth*this.threshold,this._startingPoint=0,void(this._midThreshold=0))}_trackX(t){this._translate=this._startingPoint+Math.max(this._leftLimit,Math.min(t,this._rightLimit)),this._swipeDirectionRight=t>=this._midThreshold}_trackEnd(t){return this.removeAttribute("dragging",""),this._swipeDirectionRight=t>=this._midThreshold,this._transition=!0,this._translate=0,t<this._leftThreshold?(this.opening="left",void this._invokerTrackOpening()):t>this._rightThreshold?(this.opening="right",void this._invokerTrackOpening()):void(this.opening="")}_invokerTrackOpening(){this.dispatchEvent(new CustomEvent(`bbva-list-swipe-track-${this.opening}`,{detail:this,bubbles:!0,composed:!0}))}_onInvokerTransitionEnd(){this.opening||(this._opened=!1,this._swipeDirectionRight=!1)}_onActionClick(t,e,i){this.dispatchEvent(new CustomEvent("list-swipe-action-click",{detail:{item:t,index:e,type:i},bubbles:!0,composed:!0}))}_onInvokerKeydown(t){t.composedPath()[0]===this._invoker&&("arrowright"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("right")),"arrowleft"===t.key.toLowerCase()&&(t.preventDefault(),this._moveInvoker("left")))}_moveInvoker(t){const e=this.opening;if(t===e)return;let i;this._trackStart(),"right"===t&&(i="left"===e?this._operativeWidth-1:this._rightLimit),"left"===t&&(i="right"===e?0-this._informativeWidth+1:this._leftLimit),this._trackEnd(i)}}customElements.define(Et.is,Et);class Tt{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let i=Object(this),a=i.length>>>0;if(0===a)return!1;let s=0|e,r=Math.max(s>=0?s:a-Math.abs(s),0);for(;r<a;){if((n=i[r])===(o=t)||"number"==typeof n&&"number"==typeof o&&isNaN(n)&&isNaN(o))return!0;r++}var n,o;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var i=[],a=0,s="",r=0,n=arguments.length;r!==n;++r){var o=+arguments[r];if(!(o<1114111&&o>>>0===o))throw RangeError("Invalid code point: "+o);o<=65535?a=i.push(o):(o-=65536,a=i.push(55296+(o>>10),o%1024+56320)),a>=16383&&(s+=t.apply(null,i),i.length=0)}return s+t.apply(null,i)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",i=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${i&&i.message}`)}}class Rt extends Tt{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const It=0,Ot=1,At="jwt",Pt="tsec",qt="none";class Lt extends Tt{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=It,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assingSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Rt,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assingSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=Pt:this.requiredToken=qt,this.requiresJWT=!1):this.requiredToken===Pt?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===At?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===qt?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(Pt)}_setJwtHandler(){this._setTokenHandler(At)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((i,a)=>{e=Object.assign(e,{resolve:i,reject:a}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let i=this._getRequestHeaders();Object.keys(i).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,i[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=P),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let i=t.replace(/[\{\}]+/g,""),a=e[i];return a?delete e[i]:this._error(9,`Missing ${i} param value`),a})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let i=Object.keys(e);i.length&&(t=[t,i.map((t=>{let i=e[t];return Array.isArray(i)&&this.paramArrayMode===Ot?this._arrayToQueryParam(t,i):`${t}=${i}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(Pt,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(At,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var a=e.getItem(i);a&&"null"!==a&&(t[i]=a)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const i=window.sessionStorage;e=Object.keys(i).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=i.getItem(a),e)),{})}return e}_getTokenForRequestHeaders(t,e){const i=`${t}Handler`,a=t===At?"JWT ":"",s=t===At?"Authorization":Pt;if(void 0===this[i]||null===this[i])this._error(11,`${t} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let n=this[i].getItem(r);n?e[s]=e[s]||a+n:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((i=>{e.push(`${i}=${t[i]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(i){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let i;const a=new Promise(((t,e)=>{i=(i,a)=>{i?e(i):t(a)}}));return e.addEventListener("loadend",(function t(a){e.removeEventListener("loadend",t),a.error?i(a.error):i(null,e.result)})),e.readAsText(t),a}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let i=0;for(;i<t.length;){let a=t[i],s=0,r=0;if(a<=127?(s=0,r=255&a):a<=223?(s=1,r=31&a):a<=239?(s=2,r=15&a):a<=244&&(s=3,r=7&a),t.length-i-s>0){let e=0;for(;e<s;)a=t[i+e+1],r=r<<6|63&a,e+=1}else r=65533,s=t.length-i;e+=String.fromCodePoint(r),i+=s+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},i=t.trim().split(/[\r\n]+/);for(const t in i)if(i.hasOwnProperty(t)&&""!==i[t]){let a=": ",s=i[t].split(a);e[s.shift().toLowerCase()]=s.join(a)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,i,a){let s=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(a)>=0&&(s=e.getResponseHeader(a));break;case this._NATIVE_XHR:e&&e.headers&&(s=JSON.parse(e.headers)[a])}if(s){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):i;t.getItem(e)!==s&&(t.setItem(e,s),this._emitTokenUpdate(i,s))}}_emitTokenUpdate(t,e){if(this.htmlContext){const i=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(i)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,i,a,s,r;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),i=t.getResponseHeader("AuthenticationData"),a=t.getResponseHeader("AuthenticationState"),s=t.getResponseHeader("AuthenticationChallenge"),r=t.getResponseHeader("AuthenticationResponse");else{let n=JSON.parse(t.headers);e=n.authenticationtype,i=n.authenticationdata||null,a=n.authenticationstate,s=n.authenticationchallenge,r=n.authenticationresponse}return{type:e,data:i,state:a,challenge:s,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",i=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const a=this._getSignatureData(t,e,i);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:a}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",i="",a=""){let s;if("object"==typeof t&&t){const r=this._getSignatureData(t.signatureType,e,i);s=this._makeKeyValuePairFromObject(r,t.signatureValue),t.challenge&&(s+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(s,t.signatureType,a)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(s=`password=${t}`,this._buildSignatureHeaders(s,"2",a)):(s=`${i}=${t}`,this._buildSignatureHeaders(s,e,a)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let i,a=t.split(",");if(a.length>1){i=a.map((t=>`${t}=${e[t]}`)).join(",")}else i=`${t}=${e}`;return i}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",i=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),i&&(this.headers=Object.assign(this.headers,{AuthenticationState:i})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let i=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),a=this._extractResponseErrorCode(e),s=this._ERROR_CODES.SIGNATURE_INVALID.includes(a),{type:r,data:n,state:o,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),h=this._getSignatureMetadata(t);if(s)this._notifySignatureInvalid(h),i=!0;else if(r)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(a)?(this._notifySignatureTypeUsingErrorCode(a,h,r,n,o,l,c),i=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(h,r,n,o,l,c),i=!0}return i}_notifySignatureRequiredFirstStep(t,e,i,a){this._defineSignatureType(e,i),this._defineSignatureValue(e,i,a),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:i,metadata:t}}))}_notifySignatureRequired(t,e,i,a,s,r){this._defineSignatureValue(e,i,a);const n={type:e,data:i,challenge:s,metadata:t};r&&(n.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:n}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_getSignatureMetadata(t){const{responseURL:e,status:i}=t;return{path:this._path,method:this.method,url:e,status:i}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",i=""){const a=e.split(";").findIndex((e=>e===t));return i?i.split(";")[a]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,i,a,s,r){a?this._notifySignatureRequired(t,e,i,a,s,r):this._notifySignatureRequiredFirstStep(t,e,i,a)}_notifySignatureTypeUsingErrorCode(t,e,i,a,s,r,n){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,i,a,s):this._notifySignatureRequired(e,i,a,s,r,n)}}class Dt extends Lt{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class Ht extends Dt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`campaigns/v${this.version}/offers/{offer-id}`)}toString(){return super.toString("BGADPCampaignsOffersOfferGetV3")}}window.JSCompiler_renameProperty=function(t,e){return t};let Nt=0;const jt=function(t){const e=t;let i=e.__mixinApplications;i||(i=new WeakMap,e.__mixinApplications=i);const a=Nt;return Nt+=1,function(t){const s=t.__mixinSet;if(s&&s[a])return t;const r=i;let n=r.get(t);n||(n=e(t),r.set(t,n));const o=Object.create(n.__mixinSet||s||null);return o[a]=!0,n.__mixinSet=o,n}},Bt=jt((t=>class extends t{constructor(){super(),this.morePages=!1}static get properties(){return{messages:{type:Object,attribute:!1},apiInfo:{type:Object,attribute:!1},pagination:{type:Object,attribute:!1,notify:!0},page:{type:Number,attribute:!1},totalPages:{type:Number,attribute:!1},totalElements:{type:Number,attribute:!1},pageSize:{type:Number,attribute:!1},nextKey:{type:String,attribute:!1},previousKey:{type:String,attribute:!1},firstKey:{type:String,attribute:!1},lastKey:{type:String,attribute:!1},morePages:{type:Boolean,value:!1,notify:!0,attribute:!1}}}_parseResponse(t,e,i,a={},s={}){return t?(this.apiInfo=t.apiInfo,e&&t.data&&e.bind(this,t.data)(),a.length&&t.pagination&&a.bind(this,t.pagination)(),t.pagination&&(this._generatePagination(t.pagination),s.paginationEvent&&this.dispatchEvent(new CustomEvent(s.paginationEvent?s.paginationEvent:"api-dm-pagination",{detail:t.pagination,bubbles:!0,composed:!0}))),t.messages&&this._parseResponseMessages(t.messages),this._getFields(t.data?t.data:t,i)):this._errorHandler(t)}_parseResponseMessages(t){this.messages=t}_getFields(t,e){if(!Array.isArray(e)||0===e.length)return t;if(Array.isArray(t)){const i=[];for(const a of t)i.push(this._reduceFields(a,e));return i}return this._reduceFields(t,e)}_reduceFields(t,e){const i={};for(const a of e)this._reduceField(t,i,a);return this._deletedEmptyObjects(i),0===Object.entries(i).length?t:i}_reduceField(t,e,i){if(i)if(i.includes(".")){const a=i.split(".");if(void 0!==t[a[0]])if(Array.isArray(t[a[0]])){void 0===e[a[0]]&&(e[a[0]]=[]);for(const[i,s]of t[a[0]].entries())void 0===e[a[0]][i]&&(e[a[0]][i]={}),this._reduceField(s,e[a[0]][i],a.slice(1,a.length).join("."))}else void 0===e[a[0]]&&(e[a[0]]={}),this._reduceField(t[a[0]],e[a[0]],a.slice(1,a.length).join("."))}else void 0!==t[i]&&(e[i]=t[i])}_deletedEmptyObjects(t){for(const e of Object.keys(t))"object"==typeof t[e]&&(this._deletedEmptyObjects(t[e]),0===Object.entries(t[e]).length&&delete t[e])}_generatePagination(t){t&&(this.pagination=t,t.links&&(this.firstKey=this._getPaginationKey(t.links.first),this.lastKey=this._getPaginationKey(t.links.last),this.previousKey=this._getPaginationKey(t.links.previous),this.nextKey=this._getPaginationKey(t.links.next),this.morePages=!!this.nextKey),this.page=t.page,this.totalPages=t.totalPages,this.totalElements=t.totalElements,this.pageSize=t.pageSize)}_errorHandler(t){return t}_getPaginationKey(t){let e=null;return t&&(e=this._queryParamsToJSON(t)),e&&e.paginationKey}_queryParamsToJSON(t){t.indexOf("?")>-1&&(t=t.split("?")[1]);const e=t.split("&"),i={};return e.forEach((t=>{t=t.split("="),i[t[0]]=decodeURIComponent(t[1]||"")})),i}})),Mt=jt((t=>class extends t{_handleError(t,e){return function(i={}){t=400!==i.status?"api-dm-error":t,this._dispatchEvent(t,this._extractError(i,e)),this._dispatchEvent("api-dm-response-error")}.bind(this)}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_extractError(t,e){let i=this._parseError(t);return 400!==(t||{}).status&&(i=Object.assign(i,{component:this.localName,method:e.method,params:e.params,body:e.body,otpId:this.otpId||0,"http-status":(t||{}).status||0})),i}_parseError(t){let e={},i=this.lastResponse||(t||{}).message||"";try{e="object"==typeof i?i:JSON.parse(i)}catch(t){e.messages=[{message:`${i}`,type:"ERROR"}]}return e}})),Ft=jt((t=>class extends t{static get properties(){return{otpId:{type:String,attribute:!1},_signPendingService:{type:Object,attribute:!1},_listeners:{type:Object,attribute:!1,value:()=>({})}}}signTypeRequest(t){this._isActiveSign()&&(this._signPendingService.signatureType=String(t.signatureType))}signRequest(t={}){this._isActiveSign()&&(this._signPendingService.signatureValue={signatureType:t.signatureType,signatureValue:"object"==typeof t.signatureValue?t.signatureValue:String(t.signatureValue),challenge:t.challenge})}cancelRequest(){this._signPendingService=null,this.__fireOtpEvent("signature-canceled")}_addSignListener(t){const e={};this._listeners&&this._removeSignListeners(this._listeners),["signature-invalid","signature-required-first-step","signature-required"].forEach((i=>{e[i]=this.__generateEventListenerFunction(i,t),this.addEventListener(i,e[i])})),this._listeners=e}_removeSignListeners(t){Object.entries(t).forEach((t=>{this.removeEventListener(t[0],t[1])}))}_isActiveSign(){return!!this._signPendingService}__generateEventListenerFunction(t,e){return function(e,i){this._signPendingService=e,this.__fireOtpEvent(t,i.detail)}.bind(this,e)}__fireOtpEvent(t,e){this.dispatchEvent(new CustomEvent(`${t}-dm`,{bubbles:!0,composed:!0,detail:{otpId:this.otpId,errorType:t,signType:t=>{this.signTypeRequest(t)},signRequest:t=>{this.signRequest(t)},cancelRequest:()=>{this.cancelRequest()},...e}}))}})),zt=jt((t=>class extends t{static get properties(){return{_tokenListeners:{type:Object,attribute:!1,value:()=>({})},_tokenEventNames:{type:Array,attribute:!1}}}constructor(){super(),this._tokenEventNames=["token-update"]}_addTokenListener(t){const e={};this._tokenListeners&&this._removeTokenListeners(this._tokenListeners),this._tokenEventNames.forEach((i=>{e[i]=this.__generateTokenEventListenerFunction(i,t),this.addEventListener(i,e[i])})),this._tokenListeners=e}_removeTokenListeners(t){Object.entries(t).forEach((t=>{this.removeEventListener(t[0],t[1])}))}__generateTokenEventListenerFunction(t,e){return function(e,i){this.__fireTokenEvent(`${t}-dm`,i.detail)}.bind(this,e)}__fireTokenEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}})),Xt=jt((t=>class extends(Ft(Mt(Bt(zt(t))))){static get properties(){return{host:{type:String},version:{type:String},headers:{type:Object,attribute:!1},requiredToken:{type:String},params:{type:Object},native:{type:Boolean},cacheType:{type:String},cacheKey:{type:String},encodeCache:{type:Boolean},withCredentials:{type:Boolean},simulate:{type:Array},monitoring:{type:Boolean},requiredOTP:{type:Boolean},emitRequestEvents:{type:Boolean},responseType:{type:String},forceBoundary:{type:Boolean},multipart:{type:Object},paramArrayMode:{type:Number},timeout:{type:Number},tsecHandler:{type:Object},jwtHandler:{type:Object}}}constructor(){super(),this.host="",this.version="",this.headers=null,this.requiredToken="",this.native=!1,this.params={},this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.monitoring=!1,this.requiredOTP=!1,this.emitRequestEvents=!0,this.responseType="text",this.forceBoundary=!1,this.multipart=null,this.timeout=60,this.paramArrayMode=0,this.tsecHandler=null,this.jwtHandler=null}get lastResponse(){return this._lastResponse}get lastResponseRaw(){return this._lastResponseRaw}get lastResponseHeaders(){return this._lastResponseHeaders}get lastRequest(){return this._lastRequest}_generateGetService(t,e,i,a,s){const r=this._getDmInfo(t);this.requiredOTP&&this._addSignListener(t),this._addTokenListener(t),t.generateRequest().then((r=>{this._setServiceResponse(t,r),this._dispatchEvent(e.customEvent,this._parseResponse("text"===this.responseType?this.lastResponse:this.lastResponseRaw,i,a,s,e)),this._dispatchEvent("api-dm-response")}),(i=>{this._setServiceResponse(t,i),this._handleError(e.errorFireEventHandler,r)(i)})).catch((i=>{this._setServiceResponse(t,i),this._handleError(e.errorFireEventHandler,r)(i)}))}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}_setServiceResponse(t,e){this._lastResponse=t.getLastResponse(),this._lastResponseRaw=e?e.response:null,this._lastResponseHeaders=t.getLastResponseHeaders(),this._lastRequest=t.getLastRequest()}_getServiceParams(t=this.params,e={}){return{host:this.host,params:t,body:e,headers:this.headers,version:this.version,requiredToken:this.requiredToken,native:this.native,cacheType:this.cacheType,cacheKey:this.cacheKey,encodeCache:this.encodeCache,withCredentials:this.withCredentials,simulate:this._simulate,semaasMonitoring:this.monitoring,emitRequestEvents:this.emitRequestEvents,responseType:this.responseType,htmlContext:this,forceBoundary:this.forceBoundary,multipart:this.multipart,timeout:this.timeout,paramArrayMode:this.paramArrayMode,tsecHandler:this.tsecHandler,jwtHandler:this.jwtHandler}}_getServicePath(t,e){return(e[t=`${t}V${this.version}`]||e.default)()}_removeFields(t=[],e={}){for(const i of t)delete e[i];return e}_renameProperty(t,e,i){if(""===t||void 0===t)return t;const a=e.split(".");let s=t;for(let e=0;e<a.length;e++){if(e===a.length-1)return void 0!==s[a[e]]&&(s[i]=s[a[e]],delete s[a[e]]),t;if(!(a[e]in s))break;s=s[a[e]]}return t}get _simulate(){let t=[];return Array.isArray(this.simulate)&&this.simulate.length&&(t[0]=this.simulate.shift()),t}_getDmInfo(t){const e=t.method.toLowerCase(),i=this.localName.split("-");return{method:e+("dm"===i[i.length-1]?i.slice(2,-2):i.slice(2,-3)).reduce(((t,e)=>t+e.charAt(0).toUpperCase()+e.slice(1)),""),params:t.params,body:t.body}}_getEventId(t){return"string"==typeof t&&""!==t?t+"-":""}}));class Ut extends(Xt(o)){static get is(){return"bbva-local-campaigns-api-dm"}static get properties(){return{offerId:{type:String,attribute:"offer-id"}}}constructor(){super(),this.offerId=""}getOffersOffer(t={}){const e={"offer-id":this.offerId};this._generateGetService(this._getService("get",t,e),{customEvent:"offers-offer-api-dm-fetch",errorFireEventHandler:"offers-offer-api-dm-fetch-error"})}_getBgadp(t){return{getOffersOfferV3:()=>new Ht(t),default:()=>"BGADP called not exist"}}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}OffersOffer`,this._getBgadp(a))}}class Vt extends ut{static get is(){return"bbva-global-loan-offer-installment-plans-api-dm"}constructor(){super()}postLoanOfferInstallmentPlans(t,e,i){const a={"loan-id":t,"offer-id":e};this._generateGetService(this._getService("post",i,a),{customEvent:"loan-offer-installment-plans-api-dm-create",errorFireEventHandler:"loan-offer-installment-plans-api-dm-create-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}LoanOfferInstallmentPlans`,this._getBgadp(a))}_getBgadp(t){return{postLoanOfferInstallmentPlansV2:()=>new st(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}var Wt=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category] {
  padding-left: 0rem;
}
[data-tag-name=bbva-header-category] [data-tag-name=bbva-core-heading] {
  color: grey;
}

[data-tag-name=bbva-type-amount].summary-text {
  --bbva-type-amount--_ambient--text-color: (var(--colorsPrimaryCoreLightened));
}

.summary span {
  color: white;
  line-height: 1.75rem;
}

.summary bbva-list-badge, .list-swipe bbva-list-badge {
  padding: 0rem 0rem 1rem 0rem;
}

.date-summary {
  font-weight: 500;
  font-style: italic;
}

.list-swipe {
  margin: 1rem 0rem 0rem 0rem;
}

.list-swipe span {
  color: black;
  line-height: 1.75rem;
}

[data-tag-name=bbva-notification-message] {
  margin-bottom: 1.5rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-content-max-height: auto;
}

[data-tag-name=bbva-expandable-multistep].no-scrollable {
  padding-bottom: 0 !important;
}

[data-tag-name=bbva-clip-microillustration] {
  margin-top: -1rem;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-title-icon-color-warning: #685219;
  --bbva-help-modal-footer-padding: 1.5rem 1rem 24px;
}

[data-tag-name=bbva-panel-button-fixed] {
  text-align: left;
  padding: 0.5rem 0rem 0.6rem 0rem;
}
[data-tag-name=bbva-panel-button-fixed] .header-text {
  margin-bottom: -1rem;
}
[data-tag-name=bbva-panel-button-fixed] .footer-text {
  margin-top: -1rem;
}

.container-confirm {
  background-color: var(--colorsPrimaryCoreLightened);
  width: auto;
  padding: 2rem 1rem;
}
`;customElements.define(yt.is,yt);var Kt=t`
:host {
  display: block;
  box-sizing: border-box;
  padding-left: 1rem;
  padding-right: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Gt extends(s(rt(n(o)))){static get is(){return"bbva-feature-oc-loan-payment-plan-config-modal"}static get scopedElements(){const t=[yt,q,X,...Gt.configurationScopedElements()];return Gt.scopedElementsFromClasses(t)}static get styles(){return[Kt,U.primary,d("bbva-feature-oc-loan-payment-plan-config-modal-shared-styles")]}static get properties(){return{modalConfig:{type:Object}}}constructor(){super(),this.modalConfig={}}buildNotAvailable(){var t,e,i;return m`
      <bbva-clip-microillustration microillustration=${null===(t=this.modalConfig)||void 0===t?void 0:t.microillustration} size="M">
      </bbva-clip-microillustration>
      <bbva-type-text
      size='3XL'
      font-weight='700'
      text=${null===(e=this.modalConfig)||void 0===e?void 0:e.text}
      id="textNotAvailable"
      ></bbva-type-text>
      <bbva-type-text
      text=${null===(i=this.modalConfig)||void 0===i?void 0:i.paragraph}
      ></bbva-type-text>
      `}render(){return m`${this.buildNotAvailable()}`}}customElements.define(Gt.is,Gt);var Jt=t`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
  text-align: left;
}

[data-tag-name=bbva-list-swipe] {
  z-index: 0;
}

[data-tag-name=bbva-list-badge] span.date-text {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight);
  font-style: var(--fontFacePrimaryMediumItalicFontStyle);
}

[data-tag-name=bbva-list-badge] span.text {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-notification-message {
  align-items: flex-start;
  text-align: left;
}

.list-swipe bbva-list-badge {
  padding: 0rem 0rem 1rem 0rem;
}

.list-swipe span {
  color: black;
  line-height: 1.75rem;
}

.text-deadline {
  font-weight: 500;
  font-style: italic;
}
`;class Yt extends(s(rt(n(o)))){static get is(){return"bbva-feature-oc-loan-payment-plan-loan-restructuring-success"}static get scopedElements(){const t=[yt,q,X,gt,Et,V,W,mt,...Yt.configurationScopedElements()];return Yt.scopedElementsFromClasses(t)}static get styles(){return[Jt,U.primary,K.primary,bt.primary,d("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-shared-styles")]}static get properties(){return{offerSuccess:{type:Object},localCurrency:{type:String},currencyCode:{type:String},language:{type:String}}}constructor(){super(),this.offerSuccess={}}_buildBodySuccess(){var t,e,i,a,s,r,n,o,l,c,h,d,p;return m`
    <div slot="content" id="success">
    <bbva-clip-microillustration microillustration="success" size="M">
    </bbva-clip-microillustration>
    <bbva-type-text
      font-weight="700"
      size="3XL"
      text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-title")}'
    ></bbva-type-text>
    <bbva-list-swipe
    class="list-swipe">
    <bbva-list-badge
    badge=""
    slot="invoker"
    badge-type="neutral"
    type="two-columns"
    local-currency="${this.localCurrency}"
    currency-code="${this.currencyCode}"
    language="${this.language}">
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-datetime")}</span>
      <span slot="subtitle" class="date-text">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-start-date",{startDate:this.offerSuccess.startDate})}</span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-plan-type")}</span>
      <span slot="subtitle" class="text">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-succes-plan")}</span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-succes-loans")}</span>
      <span slot="subtitle"></span>
      ${null===(t=this.offerSuccess)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.map(((t,e)=>{var i;return m`
          <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-product-type")} •${t.partialNumber}</span>
          <span slot="subtitle">
            <bbva-type-amount
              class="summary-text"
              variant="m"
              type="bold"
              currency-code=${this.currencyCode}
              local-currency=${this.localCurrency}
              language=${this.language}
              amount="${null===(i=this.offerSuccess)||void 0===i?void 0:i.amounts[e]}"
            >
            </bbva-type-amount>
          </span>
        `}))}
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-current-balance")}</span>
      <span slot="subtitle">
        <bbva-type-amount
          variant="m"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(i=this.offerSuccess)||void 0===i?void 0:i.currentBalance}"
        >
        </bbva-type-amount>
      </span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-term")}</span>
      <span slot="subtitle" class="text">${null===(a=this.offerSuccess)||void 0===a||null===(s=a.offerDetail)||void 0===s?void 0:s.term} ${null===(r=this.offerSuccess)||void 0===r||null===(n=r.offerDetail)||void 0===n?void 0:n.frequency}</span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-initial-payment")}</span>
      <span slot="subtitle" style="font-weight: 500">
        <bbva-type-amount
          variant="m"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(o=this.offerSuccess)||void 0===o||null===(l=o.offerDetail)||void 0===l?void 0:l.initialPayment}"
        ></bbva-type-amount>
      </span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-initial-payment-deadline")}</span>
      <span slot="subtitle" class="text text-deadline">${null===(c=this.offerSuccess)||void 0===c||null===(h=c.offerDetail)||void 0===h?void 0:h.initialPaymentDeadline}</span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-rate-info")}</span>
      <span slot="subtitle" class="text">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-rate",{rate:this.offerSuccess.rate})}</span>
      <span slot="subtitle">${this.offerSuccess.paymentFrequency}</span>
      <span slot="subtitle">
        <bbva-type-amount
          variant="m"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(d=this.offerSuccess)||void 0===d?void 0:d.amountPaymentFrequency}"
        ></bbva-type-amount>
      </span>
    </bbva-list-badge>
    </bbva-list-swipe>
    <bbva-notification-message variant="default">
    ${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-notification-message")}
    </bbva-notification-message>
    <div class="email-send-info">
      <bbva-type-text
          text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-success-message-send-email")}'
      ></bbva-type-text>
      <bbva-type-text
        font-weight="500"
        text="${null===(p=this.offerSuccess)||void 0===p?void 0:p.customerEmail}"
      ></bbva-type-text>
    </div>
    </div>
    `}render(){return m`${this._buildBodySuccess()}`}}customElements.define(Yt.is,Yt);class Qt extends(rt(L(n(o)))){static get is(){return"bbva-feature-oc-loan-payment-plan-loan-restructuring"}static get scopedElements(){const t=[G,yt,q,X,Et,V,D,nt,ot,J,gt,Y,Q,Z,lt,W,ct,ht,Ut,Vt,Gt,Yt,H,...Qt.configurationScopedElements()];return Qt.scopedElementsFromClasses(t)}static get styles(){return[Wt,U.primary,tt.primary,K.primary,et.primary,it.primary,at.primary,dt.primary,pt.primary,d("bbva-feature-oc-loan-payment-plan-loan-restructuring-shared-styles")]}static get properties(){return{campaignsApiVersion:{type:String},loansInstallmentsApiVersion:{type:String},step3Completed:{type:Boolean,state:!0},textHeaderSummaryOne:{type:String,value:""},showModal:{type:Boolean,reflect:!0},configModal:{type:Object},checkOne:{type:Boolean,state:!0},checkTwo:{type:Boolean,state:!0},checkHeaderOne:{type:Boolean,state:!1},offerId:{type:String},offer:{type:Object},businessDocumentApiVersion:{type:String},detailDownloadConfig:{type:Object},_renderFlow:{type:Boolean},loanId:{type:String},requiredOTPInstallments:{type:Boolean},bodyInstallmentPlans:{type:Object},bodyInstallmentPlan:{type:Object},isOfferNotAvailable:{type:Boolean},userEmail:{type:String},isOfferOutSchedule:{type:Boolean},codeErrors:{type:Array},arrayAmountsByid:{type:Array},amountsById:{type:Object},loanBreakDownAmount:{type:Object},parsedDate:{type:Object},calculationDateType:{type:String},percentageById:{type:Object},percentageByIdSuccess:{type:Object},parsedEmail:{type:Object},codeErrorId:{type:String},successPage:{type:Object},offerSuccess:{type:Object},paymentFrequencyLabel:{type:String},localCurrency:{type:String},currencyCode:{type:String},language:{type:String},numberSolutions:{type:String},_detailCampigns:{type:String},_deatilInstallments:{type:String},_nodeCheckBoxes:{type:Array},_nodeSteps:{type:Array}}}constructor(){super(),this.step3Completed=!1,this.checkHeaderOne=!1,this.textHeaderSummaryOne="",this.showModal=!1,this.configModal={},this.host="",this.native=!1,this.requiredToken="",this.campaignsApiVersion="",this.loansInstallmentsApiVersion="",this.config={header:{accessibilityTextIconRightPrimary:"Close",text:this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-succes-header"),iconRightPrimary:N(),"@header-main-icon-right-primary-click":t=>this.openExitModal(t)}},this.offerId="",this.offer={},this.businessDocumentApiVersion="0",this.detailDownloadConfig={},this._renderFlow=!1,this.loanId="",this.requiredOTPInstallments=!1,this.bodyInstallmentPlans={},this.isOfferNotAvailable=!1,this.userEmail="",this.isOfferOutSchedule=!1,this.codeErrors=["00901053"],this.successPage={id:"pageSuccess",show:!1},this.offerSucces={},this.paymentFrequencyLabel="quincenas",this.localCurrency="",this.currencyCode="",this.language="",this._detailCampigns="",this._deatilInstallments="",this._nodeCheckBoxes=[],this._nodeSteps=[]}updated(t){t.has("offerId")&&""!==this.offerId&&(this._showSpinner(),this._dispatchCustomEvent("get-data-provider-loan-event",this.offerId)),t.has("checkHeaderOne")&&t.has("textHeaderSummaryOne")&&t.has("config")&&this.changeHeaderFirstStep(),super.updated(t)}retrySimulate(){""!==this.offerId&&(this._showSpinner(),this._dispatchCustomEvent("get-data-provider-loan-event",this.offerId))}resetValues(){this.step3Completed=!1,this.checkHeaderOne=!1,this.textHeaderSummaryOne="",this.showModal=!1,this.configModal={},this.offerId="",this.offer={},this.loanId="",this.bodyInstallmentPlans={},this.isOfferNotAvailable=!1,this.checkOne=!1,this.checkTwo=!1,this.isOfferOutSchedule=!1;const t=this.getNodeCheckBoxes;Array.prototype.slice.call(t).forEach((t=>{t.checked=!1}));const e=this.getNodeSteps,i=Array.prototype.slice.call(e);i.forEach((t=>{t.completed=!1})),i.forEach((t=>{"button-continue"===t.id?t.active=!0:t.active=!1})),this.successPage={show:!1},this.offerSucces={},this._detailCampigns="",this._deatilInstallments="",this._nodeCheckBoxes=[],this._nodeSteps=[]}get getLocalCampaignsTag(){return this._detailCampigns||(this._detailCampigns=this.shadowRoot.querySelector('[data-tag-name="bbva-local-campaigns-api-dm"]')),this._detailCampigns}get getNodeCheckBoxes(){return 0===this._nodeCheckBoxes.length&&(this._nodeCheckBoxes=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-checkbox"]')),this._nodeCheckBoxes}get getNodeSteps(){return 0===this._nodeSteps.length&&(this._nodeSteps=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')),this._nodeSteps}get getInstallmentsTag(){return this._deatilInstallments||(this._deatilInstallments=this.shadowRoot.querySelector('[data-tag-name="bbva-global-loan-offer-installment-plans-api-dm"]')),this._deatilInstallments}_buildFirstStep(){var t,e,i,a,s,r,n,o,l,c,h,d,p,u,b,g,v,y,f,_,S,x;return m`
    <bbva-clip-microillustration microillustration="loan" size="M">
    </bbva-clip-microillustration>
    <bbva-type-text
        text='${(null===(t=this.offer)||void 0===t||null===(e=t.offerDetail)||void 0===e?void 0:e.frequency)===this.paymentFrequencyLabel?this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-header-info-biwakely"):this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-header-info-monthly")}'
    ></bbva-type-text>
    <bbva-type-text
      id="contracts-count"
      font-weight='500'
      text="${null===(i=this.offer)||void 0===i||null===(a=i.contracts)||void 0===a?void 0:a.length} ${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-count-loans")}"
    >
    </bbva-type-text>
    <bbva-header-category
      text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-header-characteristics")}'
    ></bbva-header-category>
    <bbva-type-text
        id="characteristics-plan"
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-characteristics-info")}'
    ></bbva-type-text>
    <bbva-header-category
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-loans-info")}'
    ></bbva-header-category>
    <bbva-list-swipe
    class="list-swipe">
    <bbva-list-badge
    badge=""
    slot="invoker"
    badge-type="neutral"
    type="two-columns"
    local-currency="${this.localCurrency}"
    currency-code="${this.currencyCode}"
    language="${this.language}">
      ${null===(s=this.offer)||void 0===s||null===(r=s.contracts)||void 0===r?void 0:r.map(((t,e)=>m`
          <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-product-type")} •${t.partialNumber}</span>
          <span slot="subtitle">
            <bbva-type-amount
              class="summary-text contract-amounts"
              variant="m"
              currency-code=${this.currencyCode}
              local-currency=${this.localCurrency}
              language=${this.language}
              amount="${this.offer.amounts[e]}"
            >
            </bbva-type-amount>
          </span>
        `))}
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-current-balance")}</span>
      <span slot="subtitle" style="font-weight: 500">
        <bbva-type-amount
          class="summary-text"
          id="current-balance"
          variant="m"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(n=this.offer)||void 0===n?void 0:n.currentBalance}"
        >
        </bbva-type-amount>
      </span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-term")}</span>
      <span slot="subtitle" style="font-weight: 500">${null===(o=this.offer)||void 0===o||null===(l=o.offerDetail)||void 0===l?void 0:l.term} ${null===(c=this.offer)||void 0===c||null===(h=c.offerDetail)||void 0===h?void 0:h.frequency}</span>
    </bbva-list-badge>
    </bbva-list-swipe>
    <bbva-header-category
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-requirements-header")}'
    ></bbva-header-category>
    <bbva-type-text
        id="requirements-plan"
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-requirements-info")}&lt;/br&gt;${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-requirements-info-activate")}'
    ></bbva-type-text>
    <bbva-list-swipe
    class="list-swipe">
    <bbva-list-badge
    badge=""
    slot="invoker"
    badge-type="neutral"
    type="two-columns"
    local-currency="${this.localCurrency}"
    currency-code="${this.currencyCode}"
    language="${this.language}">
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-initial-payment")}</span>
      <span slot="subtitle" style="font-weight: 500">
        <bbva-type-amount
          variant="m"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(d=this.offer)||void 0===d||null===(p=d.offerDetail)||void 0===p?void 0:p.initialPayment}"
        ></bbva-type-amount>
      </span>
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-initial-payment-deadline")}</span>
      <span slot="subtitle" class="date-summary">${null===(u=this.offer)||void 0===u||null===(b=u.offerDetail)||void 0===b?void 0:b.initialPaymentDeadline}</span>
    </bbva-list-badge>
    </bbva-list-swipe>
    <bbva-header-category
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-considerations-header")}'
    ></bbva-header-category>
    <div class="bullets-container">
      <bbva-list-bullet icon="${j()}" text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-consideration-one")}'></bbva-list-bullet>
      <bbva-list-bullet icon="${j()}" text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-consideration-two")}'></bbva-list-bullet>
      <bbva-list-bullet icon="${j()}" text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-consideration-three")}'></bbva-list-bullet>
      <bbva-list-bullet icon="${j()}" text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-consideration-four")}'></bbva-list-bullet>
    </div>
    <bbva-header-category
        text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-rates-header")}'
    ></bbva-header-category>
    <bbva-list-swipe
    class="list-swipe">
    <bbva-list-badge
    badge=""
    slot="invoker"
    badge-type="neutral"
    type="two-columns"
    local-currency="${this.localCurrency}"
    currency-code="${this.currencyCode}"
    language="${this.language}">
      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-rate-info")}</span>
      <span slot="subtitle" style="font-weight: 500">${null===(g=this.offer)||void 0===g?void 0:g.rate}%</span>
    </bbva-list-badge>
    </bbva-list-swipe>
    <p><strong>${B(null===(v=this.offer)||void 0===v||null===(y=v.catInfo)||void 0===y?void 0:y.catLabel)}</strong> ${null===(f=this.offer)||void 0===f||null===(_=f.catInfo)||void 0===_?void 0:_.catText}</p>
    <bbva-panel-button-fixed
        id="panelFixedPreApproved"
        currency-code=${this.currencyCode}
        header-additional-info=""
        sticky
        button-class="primary"
        class="no-gradient"
        show
        >
        <div slot="header">
        <bbva-type-text
        class="header-text"
          text='${null===(S=this.offer)||void 0===S?void 0:S.paymentFrequency}'
        ></bbva-type-text>
        <bbva-type-amount
          variant="3xl"
          type="bold"
          currency-code=${this.currencyCode}
          local-currency=${this.localCurrency}
          language=${this.language}
          amount="${null===(x=this.offer)||void 0===x?void 0:x.amountPaymentFrequency}"
        ></bbva-type-amount>
          <bbva-type-text
          class="footer-text"
            text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-iva")}'
          ></bbva-type-text>
        </div>
      </bbva-panel-button-fixed>
    `}handleClickFirstStep(t){var e;this.checkHeaderOne=null===(e=t.target)||void 0===e?void 0:e.active,this._dispatchCustomEvent("review-offer-page-started"),this._dispatchCustomEvent("authorize-offer-binding")}_buildSecondStep(){return m`
    <bbva-type-text
        text=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-label-documents")}
    ></bbva-type-text>
    <bbva-type-link icon="${M()}" size="M" icon-size="24"
    @click=${this.getPdfTermsAndConditions}>
    <span>${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-terms-and-condition-document")}</span>
    </bbva-type-link>
    <bbva-type-text
      font-style='italic'
      text='128kb'
    ></bbva-type-text>
    <bbva-divider-default></bbva-divider-default>
    <bbva-type-link icon="${M()}" size="M" icon-size="24"
    @click=${this.getPdfConv}>
    <span>${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-agreemnet-document")}</span>
    </bbva-type-link>
    <bbva-type-text
      font-style='italic'
      text='128kb'
    ></bbva-type-text>
    <bbva-form-checkbox
      id="condition-one"
      @change=${t=>{this.checkOne=t.target.checked}}
      not-form
      value="13"
      label=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-check-terms-and-condition-text")}
      divider-size="full"
    ></bbva-form-checkbox>
    <bbva-form-checkbox
      id="condition-two"
      @change=${t=>{this.checkTwo=t.target.checked}}
      not-form
      value="13"
      label=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-check-agreements-text")}
      divider-size="full"
    ></bbva-form-checkbox>
    <bbva-notification-message 
      variant="default" 
      id="notification-messagge"
      message-title=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-out-of-schedule-attention")}
      book-title=""
    >
    ${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-out-of-schedule-attention-hours")}
    <bbva-type-text
    text=${this.numberSolutions}
    font-weight='500'>
    </bbva-type-text>
    </bbva-notification-message>
    `}get _showFinalContinueButton(){return m`
    <bbva-button-default
      id="button-accept-plan"
      fullwidth=""
      variant="positive"
      class="action"
      @click='${this.continueThirdSection}'
    >
      ${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-bindinf-offer-button")}
    </bbva-button-default>
    `}get _modalRender(){return m`
    <bbva-help-modal
      id = "exitOperativeModal"
      fixed-footer
      modal-type = "warning"
      title-icon = "${F()}"
      header-text="${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-exit-process")}"
      body-text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-modal-exit-not-associated")}'
      button-text=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-modal-help-button")}
      link-text='${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-continue-process")}'
      @help-modal-footer-link-click
      @help-modal-footer-button-click
      @help-modal-header-click
      @help-modal-veil-click
      >
      </bbva-help-modal>
    `}get _buildBodySteps(){var t,e,i,a,s,r,n,o,l,c,h,d,p,u,b,g;return this.step3Completed?"":m`
        <bbva-expandable-multistep hide-step-numbers="" class="no-scrollable">
          <div slot="content" id="first-step">
            <bbva-expandable-step
              id="button-continue"
              edit-label=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-first-step-consult")}
              class="animation multistep-action"
              show-link="true"
              button-text=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-first-step-button")}
              disabled-target=".action"
              header="${this.changeHeaderFirstStep()}"
              @expandable-step-button-click=${t=>{this.handleClickFirstStep(t)}}
              @expandable-step-edit-step=${t=>{this.checkHeaderOne=t.target.completed}}
            >
              ${this._buildFirstStep()}
              <div class="summary" slot="summary">
                <p>${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-loans-info")}</p>
                <bbva-list-badge
                  badge=""
                  slot="invoker"
                  badge-type="neutral"
                  type="two-columns"
                >
                  ${null===(t=this.offer)||void 0===t||null===(e=t.contracts)||void 0===e?void 0:e.map(((t,e)=>m`
                      <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-product-type")} •${t.partialNumber}</span>
                      <span slot="subtitle">
                        <bbva-type-amount
                          class="summary-text"
                          variant="m"
                          currency-code=${this.currencyCode}
                          local-currency=${this.localCurrency}
                          language=${this.language}
                          amount="${this.offer.amounts[e]}"
                        >
                        </bbva-type-amount>
                      </span>
                    `))}
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-current-balance-summary")}</span>
                  <span slot="subtitle" style="font-weight: 500">
                    <bbva-type-amount
                      class="summary-text"
                      variant="m"
                      type="bold"
                      currency-code=${this.currencyCode}
                      local-currency=${this.localCurrency}
                      language=${this.language}
                      amount="${null===(i=this.offer)||void 0===i?void 0:i.currentBalance}"
                    >
                    </bbva-type-amount>
                  </span>
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-term-summary")}</span>
                  <span slot="subtitle" style="font-weight: 500">${null===(a=this.offer)||void 0===a||null===(s=a.offerDetail)||void 0===s?void 0:s.term} ${null===(r=this.offer)||void 0===r||null===(n=r.offerDetail)||void 0===n?void 0:n.frequency}</span>
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-initial-payment-summary")}</span>
                  <span slot="subtitle" style="font-weight: 500">
                    <bbva-type-amount
                      class="summary-text"
                      variant="m"
                      type="bold"
                      currency-code=${this.currencyCode}
                      local-currency=${this.localCurrency}
                      language=${this.language}
                      amount="${null===(o=this.offer)||void 0===o||null===(l=o.offerDetail)||void 0===l?void 0:l.initialPayment}">
                    </bbva-type-amount>
                  </span>
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-initial-payment-deadline-summary")}</span>//TODO: Deberia ser en cursiba o italica
                  <span slot="subtitle" class="date-summary">${null===(c=this.offer)||void 0===c||null===(h=c.offerDetail)||void 0===h?void 0:h.initialPaymentDeadline}</span>
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-rate-info-summary")}</span>
                  <span slot="subtitle" style="font-weight: 500">${null===(d=this.offer)||void 0===d?void 0:d.rate}%</span>
                  <span slot="subtitle">${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-cat-summary")}</span>
                  <span slot="subtitle" style="font-weight: 500">${null===(p=this.offer)||void 0===p||null===(u=p.catInfo)||void 0===u?void 0:u.cat}%</span>
                  <span slot="subtitle">${null===(b=this.offer)||void 0===b?void 0:b.paymentFrequency}</span>
                  <span slot="subtitle" style="font-weight: 500">
                    <bbva-type-amount
                      class="summary-text"
                      variant="m"
                      type="bold"
                      currency-code=${this.currencyCode}
                      local-currency=${this.localCurrency}
                      language=${this.language}
                      amount="${null===(g=this.offer)||void 0===g?void 0:g.amountPaymentFrequency}"
                      >
                    </bbva-type-amount>
                  </span>
                </bbva-list-badge>
              </div>
            </bbva-expandable-step>
          </div>
          <div slot="content" id="second-step">
            <bbva-expandable-step
              id="second-step-continue"
              edit-label=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-second-step-consult")}
              class="animation second-continue-button"
              show-link="true"
              disabled-target=".action"
              header=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-second-step-header")}
              button-text=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-second-step-button")}
              ?disabled-button="${this.checksUpdate()}"
              @expandable-step-button-click=${this.handleClickAfterTerms}
            >
                ${this._buildSecondStep()}
              <div class="summary" slot="summary">
                <bbva-badge-icon 
                  status="checked" 
                  description=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-terms-and-conditions-accepted")} 
                  ambient="secondary"
                >
                </bbva-badge-icon>
              </div>
            </bbva-expandable-step>
          </div>
          <div slot="confirmation" class="confirm-step container-confirm">
              ${this._showFinalContinueButton}
          </div>
        </bbva-expandable-multistep>
      `}getResponseOfferLoansSuccess(){this._detailCampigns=this.getLocalCampaignsTag,this._detailCampigns.getOffersOffer()}continueThirdSection(){var t,e,i,a,s;const r=this.getInstallmentsTag,n={specificAmounts:[{id:"CURRENT_AMOUNT",amount:{amount:null===(t=this.offer)||void 0===t?void 0:t.currentBalance[0],currency:this.localCurrency}}],term:{number:null===(e=this.offer)||void 0===e||null===(i=e.offerDetail)||void 0===i?void 0:i.term,timeUnit:(null===(a=this.offer)||void 0===a||null===(s=a.offerDetail)||void 0===s?void 0:s.frequency)===this.paymentFrequencyLabel?"BI_WEEKS":"MONTHS"}};this.bodyInstallmentPlans=n,r.postLoanOfferInstallmentPlans(this.loanId,this.offerId,this.bodyInstallmentPlans),this._dispatchCustomEvent("check-offer-page-review")}changeHeaderFirstStep(){return this.checkHeaderOne&&(this.textHeaderSummaryOne=this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-header-characteristics"),this.config={header:{variant:""}}),this.checkHeaderOne||(this.textHeaderSummaryOne="",this.config={header:{variant:"modal-three-level"}}),this.textHeaderSummaryOne}get renderModalError(){return this.isOfferNotAvailable||this.isOfferOutSchedule?(this.config={header:{variant:"modal-three-level"}},m`
          <bbva-feature-oc-loan-payment-plan-config-modal
            modalConfig=${JSON.stringify(this.configModal)}>
          </bbva-feature-oc-loan-payment-plan-config-modal>
        `):""}checksUpdate(){return!(this.checkOne&&this.checkTwo)}openExitModal(t){const e=this.shadowRoot.querySelector("#exitOperativeModal");t.detail&&e.open()}_showSpinner(){this._dispatchCustomEvent("show-spinner-event")}_hideSpinner(){this._dispatchCustomEvent("hide-spinner-event")}getBusinessDocumentsSuccess(t){const e={documentTemplate:{id:t[0].id,templateType:{id:t[0].documentTemplate.templateType.id}}},i=Object.assign(this.detailDownloadConfig,{title:this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-pdf-title"),value:`${this.host}/business-documents/v${this.businessDocumentApiVersion}/business-documents`,formatter:"no-op",body:e});this._dispatchCustomEvent("set-business-document-on-connector-event",i)}getPdfTermsAndConditions(){this._showSpinner(),this._dispatchCustomEvent("get-business-documents-event",{productId:"CON",subproductId:"CLCONTYC"})}getPdfConv(){this._showSpinner(),this._dispatchCustomEvent("get-business-documents-agreement-event",{productId:"CON",subproductId:"CLCONCONV"})}handleEncodingDocument(){this._hideSpinner()}handleFetch(t){const{details:e}=t.detail,{contracts:i}=e,a=this._getArrayAmountsById("INITIAL_AMOUNT",e.specificAmounts),{number:s}=e.terms,r=this._getArrayAmountsById("MAXIMUM_AMOUNT",e.specificAmounts),n=this._getLoanBreakDownAmountById("DOWN_PAYMENT",e.loanBreakDown),o=this._parseDate(e.maturityDate),{frequency:l}=e.terms,{itemizeRates:c}=e.rates,h=this._getPercentageById("TEA",c),d=this._getPercentageById("CAT",c),p=this._getLoanBreakDownAmountById("INSTALLMENT",e.loanBreakDown),u=this._parseDate(this._getCalculationDateByType("TEA",c),"DD MMMM YYYY"),m=this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-cat",{cat:d}),b=this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-cat-info",{calculationDate:u,validityDate:o}),g=this._getFrecuencyLabel(l),v={contracts:i,currentBalance:a,amounts:r,offerDetail:{term:s,initialPayment:n,initialPaymentDeadline:o,frequency:this._getFrecuency(l)},rate:h,catInfo:{cat:d,catLabel:m,catText:b,calculationDate:u},amountPaymentFrequency:p,paymentFrequency:g};this.offer=v,this._dispatchCustomEvent("set-offer-initial-event",this.offer)}initOffer(t){this.offer=t,this._renderFlow=!0,this._hideSpinner(),this._dispatchCustomEvent("set-page-visit-event",this.offer)}_getArrayAmountsById(t,e){const i=null==e?void 0:e.filter((e=>(null==e?void 0:e.id)===t));return this.arrayAmountsByid=i.map((t=>{var e;return null==t||null===(e=t.amounts[0])||void 0===e?void 0:e.amount})),this.arrayAmountsByid}_getAmountsById(t,e){var i,a;return this.amountsById=null==e||null===(i=e.find((e=>(null==e?void 0:e.id)===t)))||void 0===i||null===(a=i.amount)||void 0===a?void 0:a.amount,this.amountsById}_getLoanBreakDownAmountById(t,e){var i;return this.loanBreakDownAmount=null===(i=e.find((e=>(null==e?void 0:e.id)===t)))||void 0===i?void 0:i.amount,this.loanBreakDownAmount}_parseDate(t,e="DD MMM YYYY"){return this.parsedDate=moment(t).format(e),this.parsedDate}_getCalculationDateByType(t,e){var i;return this.calculationDateType=null==e||null===(i=e.find((e=>{var i;return(null==e||null===(i=e.rateType)||void 0===i?void 0:i.id)===t})))||void 0===i?void 0:i.calculationDate,this.calculationDateType}_getPercentageById(t,e){var i,a;return this.percentageById=null==e||null===(i=e.find((e=>{var i;return(null==e||null===(i=e.rateType)||void 0===i?void 0:i.id)===t})))||void 0===i||null===(a=i.itemizeRatesUnits[0])||void 0===a?void 0:a.percentage,this.percentageById}_getPercentageByIdSuccess(t,e){var i,a;return this.percentageByIdSuccess=null==e||null===(i=e.find((e=>(null==e?void 0:e.rateType)===t)))||void 0===i||null===(a=i.itemizeRateUnit)||void 0===a?void 0:a.percentage,this.percentageByIdSuccess}_getFrecuency(t){return"BI_WEEKLY"===t||"BI_WEEKS"===t?this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-frecuency-biweekly"):this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-frecuency-monthly")}_getFrecuencyLabel(t){return"BI_WEEKLY"===t||"BI_WEEKS"===t?this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-frecuency-biweekly-label"):this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-frecuency-monthly-label")}_parseEmail(t){return this.parsedEmail=`•${t.replace(/\*/g,"")}`,this.parsedEmail}_getErrorCode(t){const{messages:e}=t,{code:i,message:a}=e[0];return this.codeErrorId=a,a.search("#")>-1?a.slice(0,a.search("#")):i}_handleErrors(t){"00901039"===this._getErrorCode(t)?this._showOfferNotAvailable():this.codeErrors.includes(this._getErrorCode(t))?this._offerOutOfSchedule():this._getCommonError()}_showOfferNotAvailable(){const t={microillustration:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-config-modal-microillustration-available")}`,text:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-config-modal-header-available")}`,paragraph:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-not-available")}`};this.configModal=t,this.isOfferNotAvailable=!0,this._hideSpinner();this._sendErrorPageConfiguration({type:"offer-not-available"})}_offerOutOfSchedule(){const t={microillustration:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-config-modal-microillustration-time")}`,text:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-out-of-schedule")}`,paragraph:`${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-not-available-time")}`};this.configModal=t,this.isOfferOutSchedule=!0,this._hideSpinner();this._sendErrorPageConfiguration({type:"offer-out-of-schedule"})}_getCommonError(t="ERROR-SERVICE",e="operative",i={}){const a={};"ERROR-SERVICE"===t?(a.errorId=t,a.errorType=e):(a.errorId=i.errorId,a.errorType=i.errorType,a.fullModal=i.fullModal,a.message=i.message),this._hideSpinner(),this._dispatchCustomEvent("retry-error",{retryErrorData:a});this._sendErrorPageConfiguration({type:"error-on-service"})}_sendErrorPageConfiguration(t){this._dispatchCustomEvent(`set-${t.type}-event`)}handleFetchError(t){this._handleErrors(t.detail)}commonErrorApi(t){this._handleErrors(t.detail)}_bbvaOfferOfferApiDm(){return m`
      <bbva-local-campaigns-api-dm
      .host="${this.host}"
      .version="${this.campaignsApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      .offerId="${this.offerId}"
      @offers-offer-api-dm-fetch="${this.handleFetch}"
      @offers-offer-api-dm-fetch-error="${this.handleFetchError}">
      @api-dm-error="${this.commonErrorApi}">
      </bbva-local-campaigns-api-dm>
    `}_bbvaInstallmentPlansApiDm(){return m`
      <bbva-global-loan-offer-installment-plans-api-dm
      .host="${this.host}"
      .version="${this.loansInstallmentsApiVersion}"
      ?native="${this.native}"
      .requiredToken="${this.requiredToken}"
      .requiredOTP="${this.requiredOTPInstallments}"
      @loan-offer-installment-plans-api-dm-create="${this.handleFetchInstalments}"
      @loan-offer-installment-plans-api-dm-create-error="${this.handleFetchInstalmentsError}">
      @api-dm-error="${this.commonErrorApi}">
      </bbva-global-loan-offer-installment-plans-api-dm>
    `}handleFetchInstalments(t){const{detail:e}=t,i=this._getPercentageByIdSuccess("TEA",e.rates.itemizeRates),a={startDate:this._parseDate(e.startDate,"DD MMMM YYYY, hh:mm"),contracts:this.offer.contracts,amounts:this.offer.amounts,currentBalance:this._getAmountsById("CURRENT_AMOUNT",e.specificAmounts),offerDetail:{term:e.term.number,frequency:this._getFrecuency(e.term.timeUnit),initialPayment:this._getAmountsById("FIRST_PAYMENT_AMOUNT",e.specificAmounts),initialPaymentDeadline:this._parseDate(e.firstPaymentDueDate)},rate:i,amountPaymentFrequency:this._getAmountsById("PAYMENT_AMOUNT",e.specificAmounts),paymentFrequency:this._getFrecuencyLabel(e.term.frequency),customerEmail:this._parseEmail(this.userEmail)};this.offerSucces=a,this.requestUpdate(),this.successPage.show=!0,this._dispatchCustomEvent("binding-offer-success-flow-event")}handleFetchInstalmentsError(){const t={errorId:"ERROR-INSTALLMENTS",errorType:"operative",fullModal:!0,message:this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-retry-error-installments-service")};this._getCommonError("ERROR-INSTALLMENTS","operative",t)}_goBack(){this._dispatchCustomEvent("bbva-oc-loan-payment-plan-loan-restructuring-go-back")}_bbvaHeaderMain(){return m`
      <bbva-header-main
        text=${this.t("bbva-feature-oc-loan-payment-plan-loan-restructuring-succes-header")}
        variant='modal-three-level'
        icon-right-primary=${N()}
        accessibility-text-icon-right-primary="Return"
        @header-main-icon-right-primary-click=${()=>this._goBack()}>
      </bbva-header-main>
    `}_bbvaTransitionSuccess(){return m`
    <bbva-transition-container
      id="pageSuccess"
      ?visible=${this.successPage.show}
    >
    <div slot="slot-header" class="header">
    ${this._bbvaHeaderMain()}

    </div>
      <div slot="slot-content">
        <bbva-feature-oc-loan-payment-plan-loan-restructuring-success
          .currencyCode=${this.currencyCode}
          .localCurrency=${this.localCurrency}
          .language=${this.language}
          .offerSuccess=${this.offerSucces}>
        </bbva-feature-oc-loan-payment-plan-loan-restructuring-success>
      </div>
    </bbva-transition-container>
    `}render(){return m`
    ${super.render()}
    ${this._bbvaOfferOfferApiDm()}
    ${this._bbvaInstallmentPlansApiDm()}
    ${this._renderFlow?this._buildBodySteps:""}
    ${this._bbvaTransitionSuccess()}
    ${this._modalRender}
    ${this.renderModalError}
    `}}class Zt extends Qt{static get is(){return"bbva-feature-oc-loan-payment-plan-loan-restructuring-mx"}}customElements.define(Zt.is,Zt);const te=z((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const i=t.toString();return this.stringNormalizeExceptions.includes(e)?i:this._normalizeStr(i)}_normalizeStr(t){let e=t;if("string"==typeof t){const i="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",a="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",s=new RegExp(`[${i}]`,"ug");e=t.replace(s,(t=>a.charAt(i.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const i={...t};return Object.keys(i).forEach((e=>{i[e]=this.parseDataToString(t[e],e)})),i;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,i=this._getTextConfig(e,"items");i&&(this.fireAppStarted(i),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var i,a;return null===(i=this.config)||void 0===i||null===(a=i[e])||void 0===a?void 0:a[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}})),ee=z((t=>class extends(te(t)){static get properties(){return{currentStep:{type:Number},signatureTypes:{type:Object},signaturePrefix:{type:String},operationNumberPath:{type:String}}}constructor(){super(),this.currentStep=1,this.signatureTypes={},this.signaturePrefix="firma:",this.operationNumberPath="id"}fireStepLoaded(){1===this.currentStep?this.firePageVisit():this._dispatch(`analytics-${this.config.steps[this.currentStep]}`,this.data)}fireButtonAppStarted(){this.fireAppStarted(this.config.buttons.continue)}onStep(t){const e=null==t?void 0:t.currentStep,i=this._getTextConfig(e,"steps");i&&this._dispatch(`analytics-${i}`,this.data)}onLastStep(t){t&&this._dispatch(`analytics-${this.config.steps.last}`,this.data)}manageAnalyticsSign(t){if(t&&Object.keys(t).length){var e;const i=null===(e=this.signatureTypes)||void 0===e?void 0:e[null==t?void 0:t.signatureType];i&&this.persistData({customFields:`${this.signaturePrefix}${i}`})}this._dispatch(`analytics-${this.config.steps.sign}`,this.data)}parseAnalyticsConfirmData(t){const e=null==t?void 0:t[this.operationNumberPath];e&&(this.persistData({operationNumber:e}),this.fireAppCompleted())}}));class ie extends(ee(rt(o))){static get is(){return"bbva-feature-oc-loan-payment-plan-loan-restructuring-mx-analytics"}static get properties(){return{_data:{type:Object,state:!0},productType:{type:String},currency:{type:String},_products:{type:Object,state:!0},_appOnClickStartItHasBeenShown:{type:Boolean,state:!0},signatureTypes:{type:Object},_paymentType:{type:String,state:!0}}}constructor(){super(),this._data={},this.productType="",this._products={"LOAN-RESTRUCTURE":{name:"reestructura consumo",category:"prestamos"},PCC:{name:"consolidacion consumo",category:"prestamos"}},this._appOnClickStartItHasBeenShown=!1,this.signatureTypes={},this._paymentType="mensual"}firePageVisit(t){this._parseDynamicData(t),this._dispatchCustomEvent("analytics-app-page-visit",this._data)}firePageStarted(){this._dispatchCustomEvent("analytics-app-started",this._data)}fireAppStepTermsAndConditions(){this._dispatchCustomEvent("analytics-app-step-terms-and-conditions",this._data)}fireAppStepConfirmation(){this._dispatchCustomEvent("analytics-app-step-confirmation",this._data)}fireAppStepOTP(t){const e=null==t?void 0:t.type.split(";"),i=this.signatureTypes[e[0]];if(i){const t=`firma:${i}`;this._data.customFields=t,this._dispatchCustomEvent("analytics-app-step-otp",this._data)}}appCompleted(t){this._dispatchCustomEvent("analytics-app-completed",t)}appCompleteType(t){this._dispatchCustomEvent("analytics-app-completed-consolidacion-consumo",t)}setAppCompletedData(){this._dispatchCustomEvent("set-data-on-analytics-app-completed",this._data)}appOnClickStart(t){const{currentPage:e,fromPage:i}=t.value;["contractProductsPage","contractProductSection"].includes(i)&&["ocLoanPaymentPlanLoanConsolidation"].includes(e)&&!this._appOnClickStartItHasBeenShown&&(this._dispatchCustomEvent("analytics-app-on-click-start",{step:"oportunidades"}),this._appOnClickStartItHasBeenShown=!0)}_parseDynamicData(t){this._data={typology:this._products[this.productType].name,primaryCategory:this._products[this.productType].category,productName:this._products[this.productType].name,amount:t.currentBalance[0],paymentAmount:t.amountPaymentFrequency,numberOfPayments:t.offerDetail.term,rate:t.rate,currency:this.currency,operationNumber:"",productType:this.productType,paymentType:this._paymentType}}reset(){this._appOnClickStartItHasBeenShown=!1}}customElements.define(ie.is,ie);
