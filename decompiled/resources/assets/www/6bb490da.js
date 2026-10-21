import{z as t,ar as e,a as i,L as a,y as n,ah as o,aN as r,ai as s,ak as c,h,i as d,a8 as l,ac as g,a9 as m,ap as p,an as b,ag as v,F as f,b$ as u,bx as y,b1 as _,c0 as x,f as T,g as S,H as C,aX as $,v as k,u as w,cI as E,cJ as N,aD as L,aa as I,b3 as A,bs as M,b5 as B,Y as P,cD as R,cH as O}from"./952f98a9.js";import"./4c50294e.js";import"./7f3d7ca9.js";import"./51384888.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";var D=t`:host {
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
${(new e).mediaRules()}`;class z extends(i(a)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":n}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:r(),success:s()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const n=i;this._stack.push({type:n,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[D,c("bbva-notification-container-shared-styles")]}render(){return h`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${d(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${d(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var H=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${l(m.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${l(m.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${l(m.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${l(m.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${l(m.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${l(m.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${l(m.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${l(m.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${l(m.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${l(g.typeMedium)}));
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
`;class j extends(i(p(b(a)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":v,"bbva-icon":f,"bbva-badge-notification":u}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[H,c("bbva-header-main-shared-styles"),y("button:focus"),_.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return h`<bbva-icon icon="${d(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return h`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const n=j.toCamelCase(t),o=`icon${n}`,r=`accessibilityTextIcon${n}`;return h`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${d(this.t(this[r]))}"
      aria-expanded=${d(a)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return h` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${d(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return h`
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:n}=this;return h`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(n||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${d(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${n}"
            ?hidden="${!n}"
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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.cool80"),S("colors.cool70"),S("colors.primaryCoreLightened"),S("colors.cool100"),S("colors.tertiaryType6Darkened"),S("colors.tertiaryType4Darkened"),S("colors.secondary300");const U=C((t=>class extends($(t)){static configurationScopedElements(){return[z,k,j,w]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),h`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||E();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&N()||this.config.faqs&&L())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const n={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",n)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return h`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return h`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));customElements.define(j.is,j);const q=new e;var V=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-notification-message] {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(I.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(I.spacer)}))) / 16) * 1rem);
}
${q.mediaRules()}`;class F extends(U(A(b(a)))){static get is(){return"configuration-access-screen"}static get scopedElements(){const t=[j,B,P,n,R,O];return F.scopedElementsFromClasses(t)}static get properties(){return{isVisibleModuleConfiguration:{type:Boolean,attribute:"is-visible-module-configuration"},isBiometricActivate:{type:Boolean,attribute:"is-biometric-activate"},isActive:{type:Boolean,attribute:"is-active",value:!1},isVisible:{type:Boolean,value:!1},_showToast:{type:Boolean,value:!1}}}static get styles(){return[V,c("configuration-access-screen-shared-styles")]}constructor(){super(),this.isVisible=!1,this._defaultConfig={headerMainText:this.t("configuration-access-screen-head-main-title-landing-settings"),headerText:this.t("configuration-access-screen-header-text"),iconToggle:M(),iconNotificationToast:s(),iconInfo:o(),iconReturn:E(),titleCommonCvvText:this.t("configuration-access-screen-common-title-cvv-text")}}get _renderHeaderMain(){const{headerMainText:t,iconReturn:e}=this._defaultConfig;return h`
      <bbva-header-main
        accessibility-text-icon-left-primary="Return"
        icon-left-primary="${e}"
        icon-right-primary-expanded="false"
        text="${t}"
        @header-main-icon-left-primary-click="${t=>this._handleBackNavigation(t)}"
      >
      </bbva-header-main>
    `}get _renderHeader(){const{headerText:t}=this._defaultConfig;return h`
      <bbva-header-category text="${t}"> </bbva-header-category>
    `}get _renderListToggle(){const{iconToggle:t,titleCommonCvvText:e}=this._defaultConfig;return h`
      <bbva-list-toggle
        ?hidden="${!this.isVisibleModuleConfiguration}"
        heading="${e}"
        main-icon="${t}"
        main-icon-label="accounts"
        ?checked="${this.isActive}"
        @click=${this._toggleClickHandler}
      >
        ${this.t("configuration-access-screen-switch-cvv-text")}
      </bbva-list-toggle>
    `}get _renderNotificationToast(){const{iconNotificationToast:t}=this._defaultConfig;return h`
      <bbva-notification-toast
        type="success"
        icon-explainer="${t}"
        ?show="${this._showToast}"
        fixed-bottom
      >
        <p>${this.t("configuration-access-screen-toast-succesfull-text")}</p>
      </bbva-notification-toast>
    `}get _renderNotificationMessage(){return h`
      <bbva-notification-message
        ?hidden="${this.isVisibleModuleConfiguration||this.isBiometricActivate}"
      >
        ${this.t("configuration-access-screen-notification-nonactivate-cvv-text")}
      </bbva-notification-message>
    `}get _renderNotificationMessageNotAvalaibleCards(){return h`
      <bbva-notification-message
        ?hidden="${this.isVisibleModuleConfiguration||!this.isBiometricActivate}"
      >
        ${this.t("configuration-access-screen-notification-nonavalaible-cvv-card-text")}
      </bbva-notification-message>
    `}get _renderHelpModal(){const{iconInfo:t}=this._defaultConfig;return h`
      <bbva-help-modal
        title-icon="${t}"
        title-text="${this.t("configuration-access-screen-common-title-cvv-text")}"
        body-text="${this.t("configuration-access-screen-help-modal-text")}"
        button-text="${this.t("configuration-access-screen-help-modal-button-text")}"
        @help-modal-footer-button-click="${t=>this._handleCloseAcceptClick(t)}"
      >
      </bbva-help-modal>
    `}setActive(t){this.isVisible=null==t?void 0:t.value}_fire(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,composed:!0}))}_toggleClickHandler(t){this._managerOpenModal({isActive:t.currentTarget.checked}),this._fire("configuration-access-screen-activate-switch",{isActive:t.currentTarget.checked})}_managerOpenModal(t){const{isActive:e}=t;e?(this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]').open(),this._fire("show-modal-ecommerce")):this._turnOffToast()}_handleCloseAcceptClick(){this._fire("configuration-access-screen-modal-accept"),this._turnOffToast()}_handleBackNavigation(){this._fire("configuration-access-screen-back-navigation")}_turnOffToast(){this._showToast=!0,setTimeout((()=>{this._showToast=!1}),2e3)}render(){return this.isVisible?h`
          ${this._renderHeaderMain} ${this._renderHeader} ${this._renderListToggle}
          ${this._renderNotificationToast} ${this._renderNotificationMessage}
          ${this._renderNotificationMessageNotAvalaibleCards} ${this._renderHelpModal}
        `:h`
          ''
        `}}customElements.define(F.is,F);var X=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class G extends a{static get is(){return"bbva-manager-landing-settings"}static get properties(){return{name:{type:String},landingSetting:{type:Object,value:()=>({})},isBiometricActive:{type:Boolean,value:!1},_requestedLandingSettings:{type:Boolean,value:!1},continue:{type:String}}}constructor(){super(),this._defalultConfig={analytics:{ECOMMERCE_MODULE_TEXT:"modulo comprar en internet"}},this.name="Cells",this._isChangeSwitchByUser=!1,this.continue=""}static get styles(){return[X,c("bbva-manager-landing-settings-shared-styles")]}init(){this._isChangeSwitchByUser=!1,this._fireEvent("open-control-veil"),this._fireEvent("glomo-get-device-secure-info")}managerAfterGetBiometricChecked(t){this.isBiometricActivate=t,"boolean"==typeof t&&t?(this._fireEvent("get-from-local-storage",{key:"landingSettings"}),this._requestedLandingSettings=!0):(this._initConfigurationAccess({value:{isVisibleModuleConfiguration:!1,isBiometricActivate:!1}}),this._sendAnalyticsNotificationNotAvalaibleModuleCvv())}manageAfterGetLocalStorage(t){const{eCommerce:e}=t||{},{isActiveByDefault:i,hasCards:a}=e||{};let{isActive:n}=e||{};const o=null!=i&&a;o&&this._requestedLandingSettings&&(n=null!=n?n:i,this.landingSetting=t||{eCommerce:{}},this._setDataStorage("landingSettings",this.landingSetting),this._sendAnalyticsModuleCvv({isActive:n})),!a&&this._requestedLandingSettings&&this._sendAnalyticsNotificationNotAvalaibleCardModuleCvv(),this._initConfigurationAccess({value:{isVisibleModuleConfiguration:o,isBiometricActivate:this.isBiometricActivate,isActive:n}}),this._requestedLandingSettings=!1}_initConfigurationAccess(t){const{value:e}=t;Object.keys(e).forEach((t=>{this._fireEvent(`set-property-${t}-configuration-access-screen`,e[t])})),this._fireEvent("close-control-veil")}managerSetLocalStorage(t){const{isActive:e}=t,{analytics:i}=this._defalultConfig;this.analyticsData={application:{customFields:`${i.ECOMMERCE_MODULE_TEXT}${e?":activado":":desactivado"}`,interactionLevel:`${e?"encender":"apagar"} ${i.ECOMMERCE_MODULE_TEXT}`}},this._fireEvent("click-on-off-desactivate-ecommerce-module-analytics",this.analyticsData),this.landingSetting={eCommerce:{...this.landingSetting.eCommerce,isActive:e}},this._setDataStorage("landingSettings",this.landingSetting),this._isChangeSwitchByUser=!0}manageAfterSetLocalStorage(){var t,e,i,a;void 0!==(null===(t=this.landingSetting)||void 0===t||null===(e=t.eCommerce)||void 0===e?void 0:e.isActive)&&null!==(null===(i=this.landingSetting)||void 0===i||null===(a=i.eCommerce)||void 0===a?void 0:a.isActive)&&this._isChangeSwitchByUser&&this._fireEvent("set-property-isActive-configuration-access-screen",{isActive:this.landingSetting.eCommerce.isActive})}_setDataStorage(t,e){const i={key:t,value:e};this._fireEvent("set-local-storage",i)}render(){return h``}manageBackNavegation(){const t=this.continue?{page:this.continue}:{};this._fireEvent(this.continue?"navigate-to-page":"go-back",t)}reset(){this.continue=""}sendAnalyticsModalActivateModuleCvv(){this._fireEvent("show-modal-ecommerce-analytics")}_sendAnalyticsModuleCvv(t){const{isActive:e}=t,{analytics:i}=this._defalultConfig;this.analyticsData={application:{customFields:`${i.ECOMMERCE_MODULE_TEXT}${e?":activado":":desactivado"}`}},this._fireEvent("show-page-available-landing-settings-analytics",this.analyticsData)}_sendAnalyticsNotificationNotAvalaibleModuleCvv(){this._fireEvent("show-page-not-available-landing-settings-analytics")}_sendAnalyticsNotificationNotAvalaibleCardModuleCvv(){this._fireEvent("show-page-not-available-cvv-cards-landing-settings-analytics")}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}}customElements.define(G.is,G);
