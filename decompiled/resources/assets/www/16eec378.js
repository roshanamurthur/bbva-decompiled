import{H as e,z as t,ar as i,a,L as o,y as r,ah as n,aN as s,ai as c,ak as d,h,i as l,a8 as p,ac as m,a9 as b,ap as u,an as g,ag as v,F as f,b$ as y,bx as _,b1 as x,c0 as S,f as k,g as T,aX as I,v as $,u as w,cI as C,cJ as N,aD as P}from"./952f98a9.js";import{a$ as L}from"./7f3d7ca9.js";import{f as E,G as D}from"./216055dc.js";import"./c6217679.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./b40ec134.js";const M=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}}));var z=t`:host {
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
${(new i).mediaRules()}`;class j extends(a(o)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:n(),warning:n(),error:s(),success:c()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const o=i;this._stack.push({type:o,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[z,d("bbva-notification-container-shared-styles")]}render(){return h`
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
    `}}var O=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${p(b.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${p(b.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${p(b.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${p(b.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${p(b.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${p(b.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${p(b.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${p(b.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${p(b.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${p(m.typeMedium)}));
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
`;class R extends(a(u(g(o)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":f,"bbva-badge-notification":y}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[O,d("bbva-header-main-shared-styles"),_("button:focus"),x.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return h`<bbva-icon icon="${l(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return h`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const o=R.toCamelCase(e),r=`icon${o}`,n=`accessibilityTextIcon${o}`;return h`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${l(this.t(this[n]))}"
      aria-expanded=${l(a)}
      ?hidden="${!this[r]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(r):this._icon(r)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return h` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${l(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return h`
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:o}=this;return h`
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
          <img src="${l(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${o}"
            ?hidden="${!o}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}T("colors.primaryCoreLightened"),T("colors.cool80"),T("colors.cool70"),T("colors.primaryCoreLightened"),T("colors.cool100"),T("colors.tertiaryType6Darkened"),T("colors.tertiaryType4Darkened"),T("colors.secondary300");const V=e((e=>class extends(I(e)){static configurationScopedElements(){return[j,$,R,w]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),h`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||C();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&N()||this.config.faqs&&P())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const o={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",o)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return h`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return h`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));class A extends(V(M(g(o)))){static get is(){return"bbva-feature-about-mx-dm"}static get properties(){return{appVersion:{type:String},appVersionWeb:{type:String},capitalizeAndroidPlatform:{type:Boolean},compileVersion:{type:String},deviceInfoModelDm:{type:String},deviceInfoPlatformDm:{type:Object},mobileServicesDm:{type:Object},_resultParseMobileService:{type:String}}}constructor(){super(),this.config={loader:!0},this.appVersion="",this.appVersionWeb="",this.capitalizeAndroidPlatform=!1,this._capitalizeString="",this.compileVersion="",this.deviceInfoModelDm={},this.deviceInfoPlatformDm={},this.mobileServicesDm={},this._resultParseMobileService=""}setErrorFromDeviceInfoDm(){const e=[{key:"glomo-about-app-version",value:this.appVersionWeb},{key:"glomo-about-compile-version",value:this.appVersionWeb},{key:"glomo-about-operation-system",value:"N/A"},{key:"glomo-about-operation-system-version",value:"N/A"},{key:"glomo-about-device-model",value:"N/A"},{key:"glomo-about-mobile-services-system",value:this._parseMobileService(this.mobileServicesDm)}];this._dispatchCustomEvent("set-device-info",e),this.clearLoader()}_parseMobileService(e){return null!=e&&e.isHmsOnly?this._resultParseMobileService="HMS":null!=e&&e.isHms?this._resultParseMobileService="GMS + HMS":this._resultParseMobileService="GMS",this._resultParseMobileService}_parsePlatform(e){return"ANDROID"===e&&this.capitalizeAndroidPlatform?this._capitalize(e):e}_parseModel(e){var t;return"iOS"===(null===(t=this.deviceInfoPlatformDm)||void 0===t?void 0:t.platformName)?e.slice(0,-2).replace(/(\D)(\d)/g,"$1 $2"):e}_capitalize(e){const t=e.toLowerCase();return this._capitalizeString=t.charAt(0).toUpperCase()+t.slice(1),this._capitalizeString}setDeviceInfoDm(e,t,i){return e&&t&&i?this._deviceInfoHandler(e,t,i):null}_deviceInfoHandler(e,t,i){const a=[{key:"glomo-about-app-version",value:this.appVersion}];this.compileVersion&&a.push({key:"glomo-about-compile-version",value:this.compileVersion}),t&&0!==Object.keys(t).length&&a.push({key:"glomo-about-operation-system",value:this._parsePlatform(null==t?void 0:t.platformName)},{key:"glomo-about-operation-system-version",value:null==t?void 0:t.versionName}),a.push({key:"glomo-about-device-model",value:this._parseModel(i)}),a.push({key:"glomo-about-mobile-services-system",value:this._parseMobileService(e)}),this._dispatchCustomEvent("set-device-info",a),this.clearLoader()}}var B=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

/* glomo about info */
.about-info__header {
  margin: 1.5rem 0;
  display: flex;
  justify-content: center;
}
.about-info__content {
  width: 100%;
}
.about-info__list {
  list-style: none;
  padding: 1rem;
  margin: 0;
}
.about-info__list__li {
  display: flex;
  justify-content: space-between;
  margin-bottom: 1rem;
}
.about-info__buttonTerms {
  display: flex;
  justify-content: center;
}
`;class H extends(V(M(g(o)))){static get scopedElements(){const e=[E,A,L,D,...H.configurationScopedElements()];return H.scopedElementsFromClasses(e)}static get is(){return"bbva-feature-about-mx"}static get styles(){return[B,d("bbva-feature-about-mx-shared-styles")]}static get properties(){return{appImage:{type:String,attribute:"app-image"},appVersion:{type:Object,attribute:"app-version"},appVersionWeb:{type:Object,attribute:"app-version-web"},capitalizeAndroidPlatform:{type:Boolean,attribute:"capitalize-android-platform"},deviceInfoModel:{type:String,attribute:"device-info-model"},deviceInfoPlatform:{type:Object,attribute:"device-info-platform"},mobileServices:{type:Object,attribute:"mobile-services"},showTermsConditionsButton:{type:Boolean,attribute:"show-terms-conditions-button"},showTermsConditionsClass:{type:String,attribute:"show-terms-conditions-class"},_deviceInfo:{type:Array}}}constructor(){super(),this.appImage="",this.appVersionWeb="",this.appVersion={versionName:"",versionCode:""},this.capitalizeAndroidPlatform=!1,this.compileVersion="",this.config={loader:!0},this.deviceInfoModel="",this.deviceInfoPlatform={},this.mobileServices={},this.showTermsConditionsButton=!1,this.showTermsConditionsClass="",this._deviceInfo=[]}updated(e){super.updated(e),e.has("_deviceInfo")&&0===Object.keys(this._deviceInfo).length&&this.showLoader(),e.has("appVersion")&&0===Object.keys(this._deviceInfo).length&&this._bbvaFeatureAboutMxDm.setDeviceInfoDm(this.mobileServices,this.deviceInfoPlatform,this.deviceInfoModel)}reset(){this.appVersion={versionName:"",versionCode:""},this.capitalizeAndroidPlatform=!1,this.compileVersion="",this.config={loader:!0},this.deviceInfoModel="",this.deviceInfoPlatform={},this.mobileServices={},this.showTermsConditionsButton=!1,this.showTermsConditionsClass="",this._deviceInfo=[]}get _bbvaFeatureAboutMxDm(){return this.shadowRoot.querySelector('[data-tag-name="bbva-feature-about-mx-dm"]')}get _headerMain(){return h`
      <bbva-header-main
        accessibility-text-icon-left-primary="Return"
        icon-left-primary=${C()}
        text=${this.t("glomo-about-header-title")}
      ></bbva-header-main>
    `}get _imageMain(){return h`
      <div class="about-info__header">
        <img src=${this.appImage} alt="logo" aria-hidden="true" />
      </div>
    `}get _listDeviceInfo(){return 0!==this._deviceInfo.length?h`
      <div class="about-info__content">
        <ul class="about-info__list">
          ${this._deviceInfo.map((e=>h`
            <li id="item-${e.key}" class="about-info__list__li">
              <bbva-type-text
                alignment="left"
                font-weight="350"
                id="text-key-${null==e?void 0:e.key}"
                size="S"
                tag="span"
                text="${this.t(null==e?void 0:e.key)}"
              >
              </bbva-type-text>
              <bbva-type-text
                alignment="right"
                font-weight="350"
                id="text-value-${null==e?void 0:e.key}"
                size="S"
                tag="span"
                text="${this.t(null==e?void 0:e.value)}"
              >
              </bbva-type-text>
            </li>
          `))}
        </ul>
      </div>
    `:""}get _buttonTermsConditions(){return h`
      <div class="about-info__buttonTerms">
        <bbva-button-default
          @click="${this._goTermsConditions}"
          class="${this.showTermsConditionsClass}"
          id="buttonTermsConditions"
          text="${this.t("glomo-about-info-show-term-conditions-text")}"
        >
        </bbva-button-default>
      </div>
    `}get _bbvaFeatureAboutMxDmTpl(){var e,t;return h`
      <bbva-feature-about-mx-dm
        .appVersion="${null!==(e=this.appVersion)&&void 0!==e&&e.versionName?`v${this.appVersion.versionName}`:""}"
        .appVersionWeb="${this.appVersionWeb}"
        ?capitalizeAndroidPlatform="${this.capitalizeAndroidPlatform}"
        .compileVersion="${null!==(t=this.appVersion)&&void 0!==t&&t.versionCode?`v${this.appVersion.versionCode}`:""}"
        .deviceInfoModelDm=${this.deviceInfoModel}
        .deviceInfoPlatformDm=${this.deviceInfoPlatform}
        .mobileServicesDm=${this.mobileServices}
        @set-device-info=${e=>{this._deviceInfo=null==e?void 0:e.detail}}
      >
      </bbva-feature-about-mx-dm>
    `}_goTermsConditions(){this._dispatchCustomEvent("toggle-header",{bubbles:!0,composed:!0}),this._dispatchCustomEvent("about-open-conditions-modal",{bubbles:!0,composed:!0})}setErrorFromDeviceInfo(){this._bbvaFeatureAboutMxDm.setErrorFromDeviceInfoDm()}setDeviceInfo(){this._bbvaFeatureAboutMxDm.setDeviceInfoDm(this.mobileServices,this.deviceInfoPlatform,this.deviceInfoModel)}render(){return h`
      ${super.render()}
      ${this._headerMain}
      ${this.appImage?this._imageMain:""}
      ${this._listDeviceInfo}
      ${this.showTermsConditionsButton?this._buttonTermsConditions:""}
      ${this._bbvaFeatureAboutMxDmTpl}
    `}}customElements.define(H.is,H);
