import{z as t,ar as e,a,L as i,y as r,ah as o,aN as n,ai as s,ak as c,h as d,i as l,a8 as h,ac as b,a9 as v,ap as p,an as u,ag as m,F as f,b$ as g,bx as y,b1 as _,c0 as x,f as $,g as C,H as E,aX as w,v as S,u as M,cI as k,cJ as T,aD as I,b3 as q,cH as N,dy as P,bU as Q,cD as L,_ as A,bF as B,dz as R,aF as z,b5 as j,di as D}from"./952f98a9.js";import{B as V}from"./980a7fb4.js";import"./788d6e55.js";import{B as O}from"./7f3d7ca9.js";import"./3e14f6f9.js";import"./19ae9b6c.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";var H=t`:host {
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
${(new e).mediaRules()}`;class U extends(a(i)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":r}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:o(),warning:o(),error:n(),success:s()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:a=this.defaultType,duration:i=this.duration}={}){const r=a;this._stack.push({type:r,description:t,simpleLinkText:e,duration:i}),this._showNextInStack()}static get styles(){return[H,c("bbva-notification-container-shared-styles")]}render(){return d`
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
    `}}var F=t`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${h(v.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(v.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${h(v.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${h(v.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${h(v.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${h(v.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${h(v.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${h(v.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${h(v.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${h(b.typeMedium)}));
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
`;class W extends(a(p(u(i)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":m,"bbva-icon":f,"bbva-badge-notification":g}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(e,a);return i in t?t[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[F,c("bbva-header-main-shared-styles"),y("button:focus"),_.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return d`<bbva-icon icon="${l(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return d`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,a,i){const r=W.toCamelCase(t),o=`icon${r}`,n=`accessibilityTextIcon${r}`;return d`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${l(this.t(this[n]))}"
      aria-expanded=${l(i)}
      ?hidden="${!this[o]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(o):this._icon(o)}
      ${this.showTextIcon?this._textIcon(a):""}
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
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:a,image:i,_hasMicroillustration:r}=this;return d`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${l(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

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
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}C("colors.primaryCoreLightened"),C("colors.cool80"),C("colors.cool70"),C("colors.primaryCoreLightened"),C("colors.cool100"),C("colors.tertiaryType6Darkened"),C("colors.tertiaryType4Darkened"),C("colors.secondary300");const J=E((t=>class extends(w(t)){static configurationScopedElements(){return[U,S,W,M]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const a=`_${t}`;return this[a]||(this[a]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[a].addEventListener(t.substring(1),e[t]):this[a][t]=e[t]})),this._setPrimaryLeftIcon(t,a),this._setSecondaryRightIcon(t,a),d`${this[a]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||k();const t="@header-main-icon-left-primary-click",a=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",a),this[e].addEventListener("header-main-icon-left-primary-click",a)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&T()||this.config.faqs&&I())}_dispatchCustomEvent(t,e=!0,a=!0,i=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:a,composed:i,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,a=!1){const i={variant:t,showSpinnerMessageLabel:e,loginAnimation:a};this._dispatchCustomEvent("show-loader",i)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,a,i){const r={description:t,simpleLinkText:e,type:a,duration:i};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,a;return d`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(a=this.config)||void 0===a?void 0:a.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,a,i;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(a=this.config)||void 0===a?void 0:a.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(i=this.config)||void 0===i?void 0:i.header}}}render(){const t=this._getElements();return d`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));var K=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-panel-offer] {
  margin: 0 -1rem;
}

[data-tag-name=bbva-notification-message] {
  --_notification-message-icon-color: var(--colorsPrimarySubdued, ${h(v.primarySubdued)});
}

[data-tag-name=bbva-expandable-accordion] {
  margin: 0 -1rem;
}
[data-tag-name=bbva-expandable-accordion] p {
  margin: 1rem;
  text-align: left;
}

.wrap-button {
  width: 100%;
  position: fixed;
  bottom: 2rem;
  left: 0;
  display: flex;
  justify-content: center;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class X extends(J(q(u(i)))){static get is(){return"card-activation-qr-code"}static get scopedElements(){const t=[N,P,Q,L,A,...X.configurationScopedElements()];return X.scopedElementsFromClasses(t)}static get properties(){return{cardNumber:{type:String,attribute:"card-number"},showQrCodeErrorModal:{type:Boolean},_bbvaInfoQrCodeModal:{type:Object},_bbvaErrorQrCodeModal:{type:Object},_questionsList:{type:Array}}}constructor(){super(),this.cardNumber="",this._questionsList=[],this.showQrCodeErrorModal=!1,this._bbvaInfoQrCodeModal=null,this._bbvaErrorQrCodeModal=null}firstUpdated(){this._setUpElement(),this._questionsList=[{question:"bbva-feature-card-activation-question-a",answer:"bbva-feature-card-activation-answer-a"},{question:"bbva-feature-card-activation-question-b",answer:"bbva-feature-card-activation-answer-b"},{question:"bbva-feature-card-activation-question-c",answer:"bbva-feature-card-activation-answer-c"},{question:"bbva-feature-card-activation-question-d",answer:"bbva-feature-card-activation-answer-d"},{question:"bbva-feature-card-activation-question-e",answer:"bbva-feature-card-activation-answer-e"}]}updated(t){t.has("showQrCodeErrorModal")&&this.showQrCodeErrorModal&&this._bbvaErrorQrCodeModal.open()}static get styles(){return[K,c("card-activation-qr-code-shared-styles")]}_setUpElement(){this._bbvaInfoQrCodeModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].infoQrCodeModal'),this._bbvaErrorQrCodeModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].errorQrCodeModal')}_openCamaraForQrCode(){this._fireEvent("bbva-open-scanner-for-qr-code"),this._resetQrCodeErrorModal()}_resetQrCodeErrorModal(){this._fireEvent("_reset-qr-code-error-modal",{reset:!1})}_openInfoQrCodeModal(){this._bbvaInfoQrCodeModal.open()}handleQuestion({target:t}){const e=t.opened,a=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-accordion"]'),i=t.className;e&&a.forEach((t=>{const e=t;i!==t.className&&(e.opened=!1)}))}_resetQuestions(){this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-accordion"]').forEach((t=>{t.opened=!1}))}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_bbvaQuestionsModal(){return this._fireEvent("bbva-faqs"),d`
      ${this._questionsList.map(((t,e)=>d`
        <bbva-expandable-accordion
          class=${`question-${e}`}    
          row-title=${this.t(t.question)}
          title-medium
          @expandable-accordion-open-change=${this.handleQuestion}>
          <p>${this.t(t.answer)}</p>
        </bbva-expandable-accordion>
      `))}
    `}_bbvaQrCodeErrorModal(){return d`
      <bbva-help-modal
        class="errorQrCodeModal"
        full-height
        fixed-footer
        header-type="modal"
        link-text=${this.t("bbva-feature-card-activation-button-exit")}
        header-text=${this.t("bbva-feature-card-activation-modal-error")}
        button-text=${this.t("bbva-feature-card-activation-modal-error-retry")}
        icon-right-primary=${B()}
        hide-content-padding-top
        @help-modal-footer-link-click=${this._resetQrCodeErrorModal}
        @help-modal-footer-button-click=${this._openCamaraForQrCode}
        @help-modal-header-right-primary-click=${this._resetQrCodeErrorModal}>
        <bbva-panel-offer
          slot="slot-content"
          content-title=${this.t("bbva-feature-card-activation-modal-error-qr-code-header")}
          microillustration='error'>
          <p>${this.t("bbva-feature-card-activation-modal-error-qr-code-description")}</p>
        </bbva-panel-offer>        
      </bbva-help-modal>
    `}render(){return d`
      <bbva-panel-offer
        microillustration='qrcard'>
        <p>${this.t("bbva-feature-card-activation-panel-offer-description")}</p>
      </bbva-panel-offer>

      <bbva-notification-message
        message=${this.t("bbva-feature-card-activation-notification-message")}
        link-title=${this.t("bbva-feature-card-activation-notification-message-link")}
        @notification-message-link-click=${this._openInfoQrCodeModal}>
      </bbva-notification-message>

      <div class="wrap-button">
        <bbva-button-default
          text=${this.t("bbva-feature-card-activation-button-scan")}
          @click=${this._openCamaraForQrCode}>
        </bbva-button-default>
      </div>

      <bbva-help-modal
        class="infoQrCodeModal"
        full-height
        header-text=${this.t("bbva-feature-card-activation-header-modal-qr")}
        button-text=${this.t("bbva-feature-card-activation-button-close-info")}
        icon-right-primary=${B()}
        @help-modal-footer-button-click=${this._resetQuestions}
        @help-modal-header-right-primary-click=${this._resetQuestions}>
        <div slot="slot-content">
          ${this._bbvaQuestionsModal()}
        </div>
      </bbva-help-modal>

      ${this._bbvaQrCodeErrorModal()}
    `}}var Y=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-panel-offer] {
  margin: 0 -1rem;
}

.wrap-button {
  width: 100%;
  position: fixed;
  bottom: 2rem;
  left: 0;
  display: flex;
  justify-content: center;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class G extends(J(q(u(i)))){static get is(){return"card-activation-atm"}static get scopedElements(){const t=[P,Q,...G.configurationScopedElements()];return G.scopedElementsFromClasses(t)}static get styles(){return[Y,c("card-activation-atm-shared-styles")]}static get properties(){return{}}_goBack(){this._fireEvent("bbva-card-activation-go-back")}_openBranchesAndATMsMapPlugin(){this._fireEvent("bbva-open-map-for-branches-and-atms")}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}render(){return d`
      <bbva-panel-offer
        link-icon=${R()}
        link-text=${this.t("bbva-feature-card-activation-panel-offer-link-text")}
        microillustration='activatecarddark'
        @panel-offer-panel-link-click=${this._openBranchesAndATMsMapPlugin}>
        <p>${this.t("bbva-feature-card-activation-panel-offer-description-atm")}</p>
      </bbva-panel-offer>

      <div class="wrap-button">
        <bbva-button-default
          text=${this.t("bbva-feature-card-activation-header-modal-button")}
          @click=${this._goBack}>
        </bbva-button-default>
      </div>
    `}}var Z=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

[data-tag-name=bbva-header-category] {
  padding-left: 0;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-title-icon-color: var(--colorsPrimaryMedium, ${h(v.primaryMedium)});
}

[data-tag-name=bbva-form-field] {
  --_info-message-icon-color: var(--colorsPrimaryMedium, ${h(v.primaryMedium)});
  text-align: left;
}

.wrap-button {
  width: 100%;
  position: fixed;
  bottom: 2rem;
  left: 0;
  display: flex;
  justify-content: center;
}

.cvvSuccessModal [data-tag-name=bbva-panel-offer] .card-info {
  display: flex;
  align-items: center;
  flex-direction: column;
}
.cvvSuccessModal [data-tag-name=bbva-panel-offer] .card-info [data-tag-name=bbva-text] {
  padding-top: 3rem;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class tt extends(J(q(u(i)))){static get is(){return"card-activation-cvv"}static get scopedElements(){const t=[m,N,z,P,Q,j,V,...tt.configurationScopedElements()];return tt.scopedElementsFromClasses(t)}static get styles(){return[Z,c("card-activation-cvv-shared-styles")]}static get properties(){return{cardId:{type:String},encryptedCvv:{type:String,attribute:"encrypted-cvv"},isInputBottomErrorVisible:{type:Boolean},relatedCardNumber:{type:Number,attribute:"relatd-cardnumbe"},totalAttemps:{type:Number},_bbvaInfoModal:{type:Object},_bbvaWrongCvvModal:{type:Object},_isButtonVisible:{type:Boolean},_cvvConfig:{type:Object}}}constructor(){super(),this.host="",this.cardId="",this.native=!1,this._errorType="",this._cvvConfig={value:""},this.encryptedCvv="",this.requiredToken="",this.totalAttemps=0,this.cardApiVersion="",this._bbvaInfoModal=null,this._isButtonVisible=!1,this._bbvaWrongCvvModal=null,this.relatedCardNumber="",this.isInputBottomErrorVisible=!1,this._configErrorModal={description:"",firstButton:""}}firstUpdated(){this._setUpElements()}_setUpElements(){this._bbvaErrorProcessModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].errorProcessModal'),this._bbvaWrongCvvModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].wrongCvvModal'),this._bbvaSuccessModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].cvvSuccessModal'),this._bbvaInfoModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].cvvInfoModal'),this._bbvaInputCvv=this.shadowRoot.querySelector('[data-tag-name="bbva-form-field"]'),this._bbvaDpCards=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-cards"]')}_handleInputCvv(){const t=this._bbvaInputCvv.value;3===t.length&&(this._isButtonVisible=!0,this._fireEvent("bbva-input-cvv-encrypted-request",this._configInputCvv(t))),3!==t.length&&(this._isButtonVisible=!1,this.isInputBottomErrorVisible=!1),0===t.length&&(this.isInputBottomErrorVisible=!0)}_configInputCvv(t=""){return this._cvvConfig.value=t.padEnd(16,"F"),this._cvvConfig}_whatIsCvvInfoModal(){this._bbvaInfoModal.open()}_makeCardActivationRequest(){if(this.showSpinner(),this.totalAttemps<3)if(this.cardId&&this.encryptedCvv){const t={validationKey:{id:"CVV2",value:this.encryptedCvv}};this._bbvaDpCards.postCardActivate(this.cardId,t)}else this._confiContentErrorModal("process-info","retry"),this._bbvaErrorProcessModal.open();else this._confiContentErrorModal("attempts","bbva-line"),this._bbvaErrorProcessModal.open();this._fireEvent("bbva-send-analytics-data-cvv"),this.totalAttemps+=1}_confiContentErrorModal(t,e){this._configErrorModal={description:this.t(`bbva-feature-card-activation-modal-error-${t}`),firstButton:this.t(`bbva-feature-card-activation-modal-error-${e}`)}}_postCardActivationError(){this._fireEvent("bbva-error-card-activation-cvv",this._bbvaWrongCvvModal.open()),this._bbvaWrongCvvModal.open()}_postCardActivationSuccess(){this.closeSpinner(),this._fireEvent("bbva-success-card-activation-cvv",this._bbvaSuccessModal.open()),this._bbvaSuccessModal.open()}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_bbvaDataProviderCards(){return d`
      <bbva-dataprovider-cards
        id="dpCards"
        host=${this.host}
        ?native=${this.native}
        apiVersion=${this.cardApiVersion}
        requiredToken=${this.requiredToken}
        ?requiredOTP=${!0}
        @post-cards-card-activate-v1-error=${this._postCardActivationError}
        @post-cards-card-activate-v1-success=${this._postCardActivationSuccess}>
      </bbva-dataprovider-cards>
    `}closeSpinner(){this._fireEvent("bbva-spinner-close")}_bbvaWrongCvvErrorModal(){return d`
      <bbva-help-modal
        id-modal="wrongCvvModal"
        class="wrongCvvModal"
        modal-type="warning"
        title-icon=${n()}
        body-text=${this.t("bbva-feature-card-activation-modal-error-cvv")}
        button-text=${this.t("bbva-feature-card-activation-header-modal-button")}>
      </bbva-help-modal>
    `}_bbvaInfoCvvModal(){return d`
      <bbva-help-modal
        id-modal="cvvInfoModal"
        class="cvvInfoModal"
        full-height
        fixed-footer
        title-text=${this.t("bbva-feature-card-activation-header-modal-CVV")}
        body-text=${this.t("bbva-feature-card-activation-header-modal-description")}
        title-icon=${I()}
        header-text=${this.t("bbva-feature-card-activation-header-modal")}
        button-text=${this.t("bbva-feature-card-activation-header-modal-button")}>
      </bbva-help-modal>    
    `}_bbvaSuccessCvvModal(){return d`
      <bbva-help-modal
        id-modal="cvvSuccessModal"
        class="cvvSuccessModal"
        full-height
        header-type="modal"
        fixed-footer
        header-text=${this.t("bbva-feature-card-activation-modal-success-activation-header")}
        button-text=${this.t("bbva-feature-card-activation-button-close-info")}>
        <bbva-panel-offer
          slot="slot-content"
          content-title=${this.t("bbva-feature-card-activation-modal-success-activation-title")}
          microillustration="success">
          <p>${this.t("bbva-feature-card-activation-modal-success-activation-content")}</p>
          <div class="card-info">
            <bbva-text
              size="S"
              text="Tarjeta azul"
              font-weight="500">
            </bbva-text>
            <p>•${this.relatedCardNumber}</p>
          </div>
        </bbva-panel-offer>
      </bbva-help-modal>
    `}_bbvaProcessErrorModal(){return d`      
      <bbva-help-modal
        id-modal="errorProcessModal"
        class="errorProcessModal"
        full-height
        fixed-footer
        header-type="modal"
        link-text=${this.t("bbva-feature-card-activation-button-exit")}
        header-text=${this.t("bbva-feature-card-activation-modal-error")}
        button-text=${this._configErrorModal.firstButton}
        icon-right-primary=${B()}
        hide-content-padding-top>
        <bbva-panel-offer
          slot="slot-content"
          content-title=${this.t("bbva-feature-card-activation-modal-process-not-completed")}
          microillustration='error'>
          <p>${this._configErrorModal.description}</p>
        </bbva-panel-offer>        
      </bbva-help-modal>
    `}showSpinner(){this._fireEvent("bbva-spinner-open")}render(){return d`
      <bbva-header-category
        has-help
        text=${this.t("bbva-feature-card-activation-card-detail")}
        @header-category-help-click=${this._whatIsCvvInfoModal}>
      </bbva-header-category>

      <bbva-text
        size="S"
        text=${this.t("bbva-feature-card-activation-input-top-title")}>
      </bbva-text>

      <bbva-form-field
        class="bbvaFormCvv"
        type="password"
        label="CVV"
        @input=${this._handleInputCvv}
        pattern="^[0-9]{3}"
        required
        maxlength="3"
        info-message=${this.isInputBottomErrorVisible?"":this.t("bbva-feature-card-activation-input-bottom-info")}
        error-message=${this.t("bbva-feature-card-activation-input-bottom-warning")}
        allowed-pattern="[0-9]"
        validate-on-blur="">
      </bbva-form-field>

      <div class="wrap-button">
        <bbva-button-default
          text=${this.t("bbva-feature-card-activation-button")}
          @click=${this._makeCardActivationRequest}
          ?disabled=${!this._isButtonVisible}>
        </bbva-button-default>
      </div>

      ${this._bbvaProcessErrorModal()}
      ${this._bbvaInfoCvvModal()}
      ${this._bbvaSuccessCvvModal()}
      ${this._bbvaWrongCvvErrorModal()}
      ${this._bbvaDataProviderCards()}
    `}}var et=t`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

.TransitionQrCode {
  padding: 1rem;
}

.TransitionCvvCode {
  padding: 1rem;
}

[data-tag-name=bbva-help-modal] {
  --_help-modal-title-icon-color: var(--colorsPrimarySubdued, ${h(v.primarySubdued)});
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class at extends(J(q(u(i)))){static get is(){return"bbva-feature-card-activation"}static get scopedElements(){const t=[N,W,tt,G,X,D,m,P,V,...at.configurationScopedElements()];return at.scopedElementsFromClasses(t)}static get styles(){return[et,c("bbva-feature-card-activation-shared-styles")]}static get properties(){return{cardApiVersion:{type:String},cardId:{type:String},fundatm:{type:String},fundcvv:{type:String},fundqr:{type:String},relatedCardNumber:{type:Number},result:{type:String},_showTransitionCvv:{type:Boolean},_showTransitionQrCode:{type:Boolean},_showTransitionAtm:{type:Boolean},_bbvaExitModal:{type:Object},_cardNumber:{type:String},_encryptedCvv:{type:String},_showQrCodeErrorModal:{type:Boolean},_bbvaWrongQrModal:{type:Object}}}constructor(){super(),this.host="",this.native=!1,this._bbvaWrongQrModal=null,this.cardId="",this.fundcvv="",this.fundqr="",this.fundatm="",this._cardNumber="",this.requiredToken="",this.relatedCardNumber="",this._encryptedCvv="",this.cardApiVersion="",this._bbvaExitModal=null,this._showTransitionCvv=!1,this._showTransitionAtm=!1,this._showTransitionQrCode=!1,this._showQrCodeErrorModal=!1,this.result="",this._configErrorModal={description:"",firstButton:""}}firstUpdated(){this._setUpElement(),this._setUpListener()}qrDataExtractor(t){return t.content.split("data=")[1].split("&card=")[0]}decodeToken(t){const e=atob(t);let a="";for(let t=0;t<e.length;t+1){const i=e.charCodeAt(t).toString(16);a+=2===i.length?i:`0${i}`}return a.toUpperCase()}processQRCode(t){const e=this.qrDataExtractor(t);this.result=this.decodeToken(e),""!==this.result&&this._makeCardActivationRequest()}showSpinner(){this._fireEvent("bbva-spinner-open")}_makeCardActivationRequest(){if(this.showSpinner(),this.cardId&&this.result){const t={validationKey:{id:"CVV2",value:this.result}};this._bbvaDpCards.postCardActivate(this.cardId,t)}else this._confiContentErrorModal("process-info","retry"),this._fireEvent("bbva-send-analytics-data-qr"),this._bbvaErrorProcessModal.open()}_bbvaDataProviderCards(){return d`
      <bbva-dataprovider-cards
        id="dpCards"
        host=${this.host}
        ?native=${this.native}
        apiVersion=${this.cardApiVersion}
        requiredToken=${this.requiredToken}
        ?requiredOTP=${!0}
        @post-cards-card-activate-v1-error=${this._postCardActivationError}
        @post-cards-card-activate-v1-success=${this._postCardActivationSuccess}>
      </bbva-dataprovider-cards>
    `}closeSpinner(){this._fireEvent("bbva-spinner-close")}_bbvaProcessErrorModal(){return d`      
      <bbva-help-modal
        id-modal="errorProcessModal"
        class="errorProcessModal"
        full-height
        fixed-footer
        header-type="modal"
        link-text=${this.t("bbva-feature-card-activation-button-exit")}
        header-text=${this.t("bbva-feature-card-activation-modal-error")}
        button-text=${this._configErrorModal.firstButton}
        icon-right-primary=${B()}
        hide-content-padding-top>
        <bbva-panel-offer
          slot="slot-content"
          content-title=${this.t("bbva-feature-card-activation-modal-process-not-completed")}
          microillustration='error'>
          <p>${this._configErrorModal.description}</p>
        </bbva-panel-offer>        
      </bbva-help-modal>
    `}_postCardActivationError(){this._fireEvent("bbva-error-card-activation-qr",this._bbvaWrongQrModal.open())}_postCardActivationSuccess(){this.closeSpinner(),this._fireEvent("bbva-success-card-activation-qr",this._bbvaSuccessModal.open())}_bbvaSuccessQrModal(){return d`
      <bbva-help-modal
        id-modal="qrSuccessModal"
        class="qrSuccessModal"
        full-height
        header-type="modal"
        fixed-footer
        header-text=${this.t("bbva-feature-card-activation-modal-success-activation-header")}
        button-text=${this.t("bbva-feature-card-activation-button-close-info")}>
        <bbva-panel-offer
          slot="slot-content"
          content-title=${this.t("bbva-feature-card-activation-modal-success-activation-title")}
          microillustration="success">
          <p>${this.t("bbva-feature-card-activation-modal-success-activation-content")}</p>
          <div class="card-info">
            <bbva-text
              size="S"
              text="Tarjeta azul"
              font-weight="500">
            </bbva-text>
            <p>•${this.relatedCardNumber}</p>
          </div>
        </bbva-panel-offer>
      </bbva-help-modal>
    `}_bbvaWrongQrErrorModal(){return d`
      <bbva-help-modal
        id-modal="wrongQrModal"
        class="wrongQrModal"
        modal-type="warning"
        title-icon=${n()}
        body-text=${this.t("bbva-feature-card-activation-modal-error-cvv")}
        button-text=${this.t("bbva-feature-card-activation-header-modal-button")}>
      </bbva-help-modal>
    `}qrCodeSacannerError(){this._fireEvent("bbva-qr-code-scanner-error")}getEncryptData({value:t}){t&&t.length>0&&(this._encryptedCvv=t)}_setUpElement(){this._bbvaExitModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].exitModal'),this._bbvaDpCards=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-cards"]'),this._bbvaErrorProcessModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].errorProcessModal'),this._bbvaWrongQrModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].wrongQrModal'),this._bbvaSuccessModal=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"].qrSuccessModal')}_confiContentErrorModal(t,e){this._configErrorModal={description:this.t(`bbva-feature-card-activation-modal-error-${t}`),firstButton:this.t(`bbva-feature-card-activation-modal-error-${e}`)}}_setUpListener(){this.addEventListener("_reset-qr-code-error-modal",(({detail:t})=>{this._showQrCodeErrorModal=t.reset}))}_goBack(){this._fireEvent("bbva-card-activation-go-back")}_exitTheOperation(){this._bbvaExitModal.open()}_fireEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}successCardDetail(t){this.fundcvv=t.indicators.find((t=>"IS_CLEAN_CARD"===t.id&&!1===t.isActive)),this.fundqr=t.indicators.find((t=>"IS_CLEAN_CARD"===t.id&&!0===t.isActive)),this.fundatm=t.indicators.find((t=>"CAN_BE_ACTIVATED_BY_HOLDER"===t.id&&!0===t.isActive)),this.relatedCardNumber=t.number.slice(-4)}validationQrOrCvv(){void 0!==this.fundatm?this._showTransitionAtm=!0:void 0!==this.fundcvv?this._showTransitionCvv=!0:void 0!==this.fundqr&&(this._showTransitionQrCode=!0)}_bbvaHeaderMain(){return d`
      <bbva-header-main
        slot="slot-header"
        text=${this.t("bbva-feature-card-activation-header")}
        variant="modal"
        icon-right-primary=${B()}
        accessibility-text-icon-right-primary="Return"
        @header-main-icon-right-primary-click=${this._showTransitionAtm?this._goBack:this._exitTheOperation}>
      </bbva-header-main>
    `}_bbvaExitInfoModal(){const t=this._showTransitionCvv?this.t("bbva-feature-card-activation-exit-modal-description-cvv"):this.t("bbva-feature-card-activation-exit-modal-description-qr");return d`
      <bbva-help-modal
        id-modal="exitModal"
        class="exitModal"
        title-icon=${o()}
        body-text=${t}
        title-text=${this.t("bbva-feature-card-activation-exit-modal-header")}
        button-text=${this.t("bbva-feature-card-activation-button-exit")}
        link-text=${this.t("bbva-feature-card-activation-button")}
        @help-modal-footer-button-click=${this._goBack}>
      </bbva-help-modal>    
    `}_bbvatransitionCvv(){return d`
    <bbva-transition-container
    class="TransitionCvvCode"
    ?visible=${this._showTransitionCvv}>
      <card-activation-cvv
        slot="slot-content"
        host=${this.host}
        native=${this.native}
        cardId=${this.cardId}
        relatd-cardnumber=${this.relatedCardNumber}
        requiredToken=${this.requiredToken}
        encrypted-cvv=${this._encryptedCvv}
        cardApiVersion=${this.cardApiVersion}>
      </card-activation-cvv>
      ${this._bbvaHeaderMain()}
    </bbva-transition-container>
    `}_bbvaTransitionQr(){return d`
    <bbva-transition-container
    class="TransitionQrCode"
    ?visible=${this._showTransitionQrCode}>
      <card-activation-qr-code
        slot="slot-content"
        card-number=${this._cardNumber}
        ?showQrCodeErrorModal=${this._showQrCodeErrorModal}>
      </card-activation-qr-code>
      ${this._bbvaHeaderMain()}
    </bbva-transition-container>
    `}_bbvaTransitionAtm(){return d`
    <bbva-transition-container
      id="pagecardActivationAtm"
      ?visible=${this._showTransitionAtm}>
      <card-activation-atm
        slot="slot-content">
      </card-activation-atm>
      ${this._bbvaHeaderMain()}
    </bbva-transition-container>
    `}render(){return d`
    ${this.validationQrOrCvv()}
    ${this._bbvaTransitionQr()}
    ${this._bbvaTransitionAtm()}
    ${this._bbvatransitionCvv()}
    ${this._bbvaExitInfoModal()}
    ${this._bbvaDataProviderCards()}
    ${this._bbvaProcessErrorModal()}
    ${this._bbvaSuccessQrModal()}
    ${this._bbvaWrongQrErrorModal()}
    `}}class it extends at{static get is(){return"bbva-feature-card-activation-mx"}static get properties(){return{}}}customElements.define(it.is,it);class rt extends(O(i)){static get is(){return"bbva-nativeconnector-libmcrypt"}static get properties(){return{pluginName:{type:String}}}constructor(){super(),this.pluginName="Encryption"}generatekpub(){return this._genericCall(this.pluginName,"generatekpub","public-key-generated")}decrypt(t){return this._genericCall(this.pluginName,"decrypt","value-decrypted",t)}encrypt(t){return this._genericCall(this.pluginName,"encrypt","value-encrypted",t)}}customElements.define(rt.is,rt);
