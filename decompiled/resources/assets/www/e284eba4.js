import{z as t,ar as e,a as i,L as a,y as r,ah as n,aN as s,ai as o,ak as c,h as d,i as l,a8 as h,ac as p,a9 as g,ap as b,an as m,ag as u,F as v,b$ as y,bx as f,b1 as _,c0 as x,f as $,g as S,H as k,aX as C,v as T,u as w,cI as L,cJ as I,aD as E,ad as N,ab as A,aa as P,b0 as R,aJ as B,bj as z,b6 as V,dt as D,av as M,o as O,bh as q,aK as j,bg as H,bc as F,bY as U,du as K,aV as J,V as G,aI as W,b3 as X,bU as Y,b4 as Q,b5 as Z,cD as tt,b7 as et,a7 as it,a$ as at,cS as rt,a_ as nt}from"./952f98a9.js";import{B as st,a as ot,b as ct,c as dt}from"./8e6fdf7b.js";import{bo as lt,bp as ht}from"./7f3d7ca9.js";var pt=t`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
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
${(new e).mediaRules()}`;class gt extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:n(),warning:n(),error:s(),success:o()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[pt,c("bbva-notification-container-shared-styles")]}render(){return d`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${l(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${l(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var bt=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(g.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(g.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(g.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(g.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(g.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(g.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(g.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(p.typeMedium)}));
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
`;class mt extends(i(b(m(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":u,"bbva-icon":v,"bbva-badge-notification":y}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[bt,c("bbva-header-main-shared-styles"),f("button:focus"),_.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return d`<bbva-icon icon="${l(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const r=mt.toCamelCase(t),n=`icon${r}`,s=`accessibilityTextIcon${r}`;return d`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${l(this.t(this[s]))}"
      aria-expanded=${l(a)}
      ?hidden="${!this[n]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(n):this._icon(n)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return d` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${l(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return d`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:r}=this;return d`
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
          <img src="${l(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.cool80"),S("colors.cool70"),S("colors.primaryCoreLightened"),S("colors.cool100"),S("colors.tertiaryType6Darkened"),S("colors.tertiaryType4Darkened"),S("colors.secondary300");const ut=k((t=>class extends(C(t)){static configurationScopedElements(){return[gt,T,mt,w]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),d`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||L();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&I()||this.config.faqs&&E())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const r={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return d`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var vt=t`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${h(g.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${h(g.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${h(N.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${h(A.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${h(N.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
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
`,yt=t`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,ft=t`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${h(g.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${h(g.primaryMedium)});
}
`;const _t={light:t`
    ${R.light}
    ${yt}
  `,dark:t`
    ${R.dark}
    ${ft}
  `};class xt extends(B(i(b(m(a))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":z,"bbva-link":V,"bbva-text":u}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=D,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[vt,super.styles,c("bbva-panel-info-shared-styles"),_t.light,_t.dark]}get _contentImage(){return this.image?d` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:d`
      <span
        class="${M({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===D}render(){return d`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&d`
          <bbva-text
            tabindex="0"
            class="title ${M({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${l(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&d`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${d` <slot></slot> `}
        ${this.linkText&&d`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.cool50");var $t=t`:host {
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
  margin: 0;
  padding: 0;
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

.container .title {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem) 0;
}
.container [data-tag-name=bbva-clip-card] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
.container.compact {
  display: flex;
}
.container.compact [data-tag-name=bbva-clip-card] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
  flex: none;
}
.container.compact .content-wrapper {
  overflow: hidden;
}
.container.compact .heading-wrapper {
  display: flex;
}
.container.compact .heading-wrapper .title {
  margin: 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem) 0 0;
  min-width: 0;
}
.container .num-product {
  display: flex;
  height: 1.5rem;
  align-items: center;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(A.bookItalic.fontStyle)});
}
.container .num-product [data-tag-name=bbva-text] {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${h(A.bookItalic.fontStyle)});
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
.container .num-product .num-product {
  margin-right: 0;
}
.container .num-product .mask {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
.container .num-product [data-tag-name=bbva-clip-box] {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}
`;class St extends(i(m(a))){static get is(){return"selector-card-list-card"}static get scopedElements(){return{"bbva-badge-default":q,"bbva-clip-box":j,"bbva-clip-card":H,"bbva-text":u}}static get properties(){return{badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},cardImage:{type:String,attribute:"card-image"},cardStatus:{type:String,attribute:"card-status"},cardTitle:{type:String,attribute:"card-title"},cardTitleEllipsis:{type:Boolean,attribute:"card-title-ellipsis"},cardType:{type:String,attribute:"card-type"},cardVariant:{type:String,attribute:"card-variant"},compactMode:{type:Boolean,attribute:"compact-mode"},numCard:{type:String,attribute:"num-card"},numAccount:{type:String,attribute:"num-account"},visibleChars:{type:Number,attribute:"visible-chars"}}}constructor(){super(),this.cardStatus="",this.cardTitle="",this.cardTitleEllipsis=!1,this.cardVariant="",this.compactMode=!1,this.numAccount="",this.numCard="",this.visibleChars=4}static get styles(){return[$t,F.light,U.light,K.light,_.light,c("selector-card-list-card-shared-styles")]}static _tplText({text:t,size:e,tag:i,fontWeight:a,className:r,ellipsis:n}){return d`
      <bbva-text
        class="${l(r)}"
        font-weight="${l(a)}"
        size="${l(e)}"
        tag="${l(i)}"
        text="${t}"
        unset
        ?ellipsis="${n}"
      ></bbva-text>
    `}static _header(t){return d`
      ${St._tplText({className:"title",ellipsis:t.cardTitleEllipsis,fontWeight:"500",text:t.cardTitle})}
    `}get _numProduct(){return d`
      <span class="num-product">
        ${this._getMaskElement(this.numCard,"•",!0,this.visibleChars)}
        ${!this.compactMode&&this.numAccount&&d`
            ${St._tplText({size:"XS",text:`| ${this.t("selector-card-related-account-label")} `})}
            ${this._getMaskElement(this.numAccount,"•",!0,this.visibleChars)}
          `||J}
      </span>
    `}static _tplClipCard(t){return d`
      <bbva-clip-card
        class="card-image"
        disabled-tabindex
        size="medium"
        .cardImage="${t.cardImage}"
        .cardType="${t.cardType}"
        .status="${t.cardStatus}"
        .variant="${t.cardVariant}"
      ></bbva-clip-card>
    `}get _contentLeft(){return d`
      ${St._tplClipCard(this)}
      <div class="content-wrapper">
        <div class="heading-wrapper">
          ${this.compactMode&&St._header(this)||J} ${this._numProduct}
        </div>
        <bbva-badge-default
          text="${this.badgeText}"
          type="${l(this.badgeType)}"
          ?hidden="${!this.badgeText}"
        ></bbva-badge-default>
      </div>
    `}_getMaskElement(t,e,i,a){if(t){const r=G(t,e,i,a);return d`
        <div class="num-product">
          <span class="mask">${r[0]}</span>
          <span class="number">
            <span class="sr-only">${this.t("bbva-list-card-number-accessibility")}</span>
            ${St._tplText({text:r.substr(1)})}
          </span>
        </div>
      `}return J}render(){return d`
      <div ambient="light" class="container ${M({compact:this.compactMode})}">
        ${!this.compactMode&&St._header(this)||J} ${this._contentLeft}
      </div>
    `}}var kt=t`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--ambientsLight, ${h(W.light)});
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1em);
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

[role=listitem], [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-text] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-default] {
  display: inline;
}

.button-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}

.card-description {
  display: flex;
  gap: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${h(P.spacer)}))) / 16) * 1rem);
}

[role=listitem]:last-child > [data-tag-name=bbva-divider] {
  display: none;
}
`;function Ct(t){const e=t.toLowerCase();return e.charAt(0).toUpperCase()+e.slice(1)}const Tt={CREDIT_CARD:"credit",DEBIT_CARD:"debit",PREPAID_CARD:"prepay"},wt={VISA:"visa",MASTER_CARD:"mastercard"};class Lt extends(C(X(ut(m(a))))){static get is(){return"selector-card"}static get scopedElements(){const t=[st,ot,q,Y,H,Q,lt,Z,tt,xt,u,St,et,...Lt.configurationScopedElements()];return Lt.scopedElementsFromClasses(t)}static get properties(){return{name:{type:String},title:{type:String},description:{type:String},buttonText:{type:String,attribute:"button-text"},cardsApiVersion:{type:String,attribute:"version-cards-api-dm"},internalCards:{type:Array,attribute:"internal-cards"},visibleCardsLimit:{type:Number,attribute:"visible-cards-limit"},disabledCards:{type:Array,attribute:"disabled-cards"},selectedCards:{type:Array,attribute:"selected-cards"},cardsParams:{type:String,attribute:"cards-params"},notShownCards:{type:Object,atribute:"not-shown-cards"},selectorType:{type:String,attribute:"selector-type"},useApiCardImages:{type:Boolean,attribute:"use-api-card-images"},showRelatedAccount:{type:Boolean,attribute:"show-related-account"},cacheType:{type:String,attribute:"cache-type"},cacheKey:{type:String,attribute:"cache-key"},_cards:{type:Array},_notAvailableCards:{type:Boolean},_notAvailableCardsMsg:{type:Object},_hideAllCards:{type:Boolean,attribute:!1}}}constructor(){super(),it(this,"_getCardStatus",(t=>{var e;return{INOPERATIVE:"off",BLOCKED:"blocked",PENDING_EMBOSSING:"pending",PENDING_DELIVERY:"pending",PENDING_CANCELLATION:"pending"}[null==t||null===(e=t.status)||void 0===e?void 0:e.id]})),it(this,"_checkOperative",(t=>{var e;return"OPERATIVE"===(null==t||null===(e=t.status)||void 0===e?void 0:e.id)})),it(this,"_getImage",(t=>{const e=t.find((t=>"FRONT_CARD"===t.id));return this.useApiCardImages?null==e?void 0:e.url:void 0})),this.config={header:!1,loader:!0,notify:!1},this.name="card-selector",this.native=!1,this.cardsApiVersion="0",this.requiredToken="tsec",this.visibleCardsLimit=5,this.disabledCards=[],this.useApiCardImages=!1,this.selectedCards=[],this.selectorType="multiple",this.showRelatedAccount=!1,this.cacheType="LOCAL",this.cacheKey="ckCardsApi",this._cards=[],this._notAvailableCards=!1,this._notAvailableCardsMsg={},this._hideAllCards=!1}firstUpdated(t){if(super.firstUpdated&&super.firstUpdated(t),!this.internalCards){this.showLoader("full",!0,!1);const t=this.shadowRoot.querySelector('[data-tag-name="bbva-global-cards-api-dm"]'),e={...this._queryStringToJSON(),...this.showRelatedAccount&&{expand:"related-contracts"}};t.getCards(e)}this._expandablePanelClicked()}static get styles(){return[kt,ht.light,at.light,_t.light,F.light,rt.light,nt.light,ct.light,dt.light,c("selector-card-shared-styles")]}get _disabledButton(){return 0===this._cards.filter((t=>(null==t?void 0:t.checked)&&!(null!=t&&t.status))).length}get _visibleCards(){const t=this._cards.length,e=this._selectedCards.length,i=this._hideAllCards?Math.max(this.visibleCardsLimit,e):t;return this._cards.slice(0,i)}get _selectedCards(){return this._cards.filter((t=>null==t?void 0:t.checked)).map((t=>null==t?void 0:t.id))}notShownCard(t){return!(!t||!this.notShownCards)&&this.notShownCards(t)}static _getCardBrand(t={}){return t.brandAssociation&&wt[t.brandAssociation.id]}_formatProduct(t){var e;const{id:i,alias:a,product:r,number:n,cardType:s,images:o,relatedContracts:c}=t,d=(null==n?void 0:n.trim().length)>0?n:i,l=(null==c||null===(e=c[0])||void 0===e?void 0:e.number)||"";return{id:i,text:a||r.name,cardtype:Lt._getCardType(null==s?void 0:s.id),brand:Lt._getCardBrand(t),pan:d,iban:l,status:this._getCardStatus(t),isOperative:this._checkOperative(t),image:o?this._getImage(o):void 0}}_saveCardsData(t){return t.filter((t=>!this.notShownCard(t))).map((t=>this._formatProduct(t)))}async _saveCards(t){this._cards=this._saveCardsData((null==t?void 0:t.detail)||[]),this._isAvailableCards(),this._expandablePanelClicked(),this.clearLoader()}update(t){super.update&&super.update(t),t.has("internalCards")&&(this._cards=this._saveCardsData(this.internalCards),this._isAvailableCards(),this._sortCards()),t.has("selectedCards")&&(this._cards=this._cards.map((t=>({...t,checked:this.selectedCards.includes(null==t?void 0:t.id)})))),(t.has("selectedCards")||t.has("disabledCards"))&&(this._notAvailableCards=!1,this._notAvailableCardsMsg={},this._isAvailableCards())}_isAvailableCards(){const t=this._cards.filter((t=>void 0!==t.status||this.disabledCards.includes(t.id))),e=this._cards.every((e=>void 0!==t.find((t=>t.id===e.id))))&&this._cards.length>0,i=t.some((t=>this._selectedCards.includes(t.id)));e&&(this._notAvailableCards=!0,this._notAvailableCardsMsg={title:"selector-card-empty-heading",body:"selector-card-notification-message"}),i&&(this._notAvailableCards=!0,this._notAvailableCardsMsg={title:"selector-card-empty-heading-card-not-available",body:"selector-card-notification-message-card-not-available"})}_expandablePanelClicked(){this._sortCards(),this._hideAllCards=!this._hideAllCards}async _sortCards(){this._cards.sort(((t,e)=>t.checked===e.checked?t.id>e.id:t.checked?-1:1)),await this.updateComplete}_getRemainingCards(){return this._cards.length-this._visibleCards.length}async _handleInputClick(t){var e;const i=null==t||null===(e=t.currentTarget)||void 0===e?void 0:e.id;if(i){const t="multiple"===this.selectorType;this._cards.forEach(((e,a)=>{const r=e.id===i;t&&r?this._cards[a].checked=!e.checked:t||(this._cards[a].checked=r)}))}await this.requestUpdate(),this._dispatchCustomEvent("selector-card-select",this._selectedCards)}_handleButtonClick(){this.dispatchEvent(new CustomEvent("selector-card-button-click",{detail:this._selectedCards,bubbles:!0,composed:!0}))}_handleLinkClick(){this._dispatchCustomEvent("selector-card-contract",this._selectedCards)}_queryStringToJSON(){return this.cardsParams?JSON.parse(`{"${decodeURI(this.cardsParams.replace(/&/g,'","').replace(/=/g,'":"'))}"}`):""}_dispatchCustomEvent(t,e,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:i,composed:a}))}_apiDmError(t){this.clearLoader(),this._dispatchCustomEvent("selector-card-request-error",t.detail)}_cardsDM(){return d`
      <bbva-global-cards-api-dm
        .host="${this.host}"
        ?native="${this.native}"
        .version="${this.cardsApiVersion}"
        .requiredToken="${this.requiredToken}"
        .cacheType="${this.cacheType}"
        .cacheKey="${this.cacheKey}"
        @cards-api-dm-fetch="${this._saveCards}"
        @cards-api-dm-fetch-error="${this._apiDmError}"
        @api-dm-error="${this._apiDmError}"
      >
      </bbva-global-cards-api-dm>
    `}_viewFormInputList({id:t,text:e,cardtype:i,brand:a,pan:r,iban:n,checked:s=!1,status:o,image:c,isOperative:h},p){const g=this.disabledCards.includes(t)||o,b="multiple"===this.selectorType;return d`
      <div id="list-item-${p}" role="listitem">
        <bbva-form-control-input
          alignment="right"
          divider-size="full"
          id="${t}"
          name="${b?p:this.name}"
          slot="_option"
          type="${b?"checkbox":"radio"}"
          value="${t}"
          ?checked="${s}"
          ?disabled="${g}"
          @click="${this._handleInputClick}"
        >
          <selector-card-list-card
            badge-text="${l(o&&this.t(`selector-card-status-label-${o}`))}"
            badge-type="${l(o)}"
            card-image="${l(c)}"
            card-title="${function(t){return t.split(" ").map(Ct).join(" ").trim()}(e)}"
            card-title-ellipsis
            card-variant="${i}"
            card-status="${l(o)}"
            card-type="${l(a)}"
            num-card="${l(r)}"
            num-account="${l(this._viewAccount(n,h))}"
            slot="left"
            ?compact-mode="${!this.showRelatedAccount||!n}"
          >
          </selector-card-list-card>
        </bbva-form-control-input>
      </div>
    `}_viewAccount(t,e){return this.showRelatedAccount&&e?t:void 0}_viewTitle(){return d`
      ${this.title?d`
            <bbva-header-category heading-level="2" text="${this.title}"></bbva-header-category>
          `:""}
      ${this.description?d`
            <bbva-text unset size="S" text="${this.description}"></bbva-text>
          `:""}
    `}_viewButton(){return this.buttonText?d`
          <div class="button-container">
            <bbva-button-default
              @click="${this._handleButtonClick}"
              ?disabled="${this._disabledButton}"
            >
              ${this.buttonText}
            </bbva-button-default>
          </div>
        `:""}_viewEmptyCards(){return d`
      <div ambient="light">
        ${this._viewTitle()}
        <bbva-panel-info
          heading="${this.t("selector-card-empty-heading")}"
          text="${this.t("selector-card-empty-text")}"
          link-text="${this.t("selector-card-empty-link-text")}"
          @panel-info-link-click="${this._handleLinkClick}"
        ></bbva-panel-info>
      </div>
    `}_viewCards(){return d`
      <div ambient="light">
        ${this._viewTitle()}
        <bbva-form-container>
          <div
            role="list"
            aria-controls="${this._visibleCards.map(((t,e)=>`list-item-${e}`)).join(" ")}"
          >
            ${this._visibleCards.map(this._viewFormInputList,this)}
          </div>
        </bbva-form-container>

        ${this._notAvailableCards?d`
              <bbva-notification-message
                variant="information"
                message-title="${this.t(this._notAvailableCardsMsg.title)}"
              >
                ${this.t(this._notAvailableCardsMsg.body)}
              </bbva-notification-message>
            `:""}
        ${this._cards.length>this.visibleCardsLimit?d`
              <bbva-expandable-panel
                see-more="${this.t("selector-card-see-more",{remaining:this._getRemainingCards()})}"
                see-less="${this.t("selector-card-see-less")}"
                @expandable-panel-expand="${this._expandablePanelClicked}"
              ></bbva-expandable-panel>
            `:""}
      </div>
    `}render(){var t;return d`
      ${super.render()} ${this._cardsDM()}
      ${(null===(t=this._cards)||void 0===t?void 0:t.length)<1?this._viewEmptyCards():this._viewCards()} ${this._viewButton()}
    `}}it(Lt,"_getCardType",(t=>Tt[t]));export{Lt as S};
