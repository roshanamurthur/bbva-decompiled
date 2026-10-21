import"./7f3d7ca9.js";import{z as e,L as t,ak as a,h as i,aN as s,aV as r,H as n}from"./952f98a9.js";import{L as o,v as d,M as l,K as c,e as h,G as p,N as u,D as g}from"./216055dc.js";import{E as m,i as v,a as b,x as _}from"./bee263ce.js";import"./c0a2f832.js";import"./cae0f1de.js";const y=e=>e??m;var f=v`
  :host {
    display: block;
    box-sizing: border-box;
    width: 100%;
    height: 100%;
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

  .iframe-container {
    width: 100%;
    height: 100%;
  }

  iframe {
    width: 100%;
    height: 100%;
  }

  iframe:focus {
    outline: none;
  }

  iframe[seamless] {
    display: block;
  }
`;class S extends b{static get is(){return"bbva-core-iframe"}static get properties(){return{allow:{type:String},allowfullscreen:{type:Boolean},iframeTitle:{type:String,attribute:"iframe-title"},loaded:{type:Boolean},loadedEventName:{type:String,attribute:"loaded-event-name"},messageTargetOrigin:{type:String,attribute:"message-target-origin"},referrerPolicy:{type:String},sandbox:{type:String},src:{type:String},srcdoc:{type:String},_messages:{type:Array,attribute:!1}}}constructor(){super(),this.loaded=!0,this._messageListener=this._dispatchEvent.bind(this),this._messages=[]}connectedCallback(){var e;null===(e=super.connectedCallback)||void 0===e||e.call(this),window.addEventListener("message",this._messageListener,!1)}disconnectedCallback(){var e;null===(e=super.disconnectedCallback)||void 0===e||e.call(this),window.removeEventListener("message",this._messageListener,!1)}firstUpdated(e){var t;null===(t=super.firstUpdated)||void 0===t||t.call(this,e),this.iframe=this.shadowRoot.getElementById("bbvaIframe")}set iframe(e){this._iframe=e}get iframe(){return this._iframe}set src(e){const t=this._src;this._src=e,this.loadedEventName&&(this.loaded=!1),this.requestUpdate("_src",t)}get src(){return this._src}set loadedEventName(e){const t=this._loadedEventName;this._loadedEventName=e,this.loaded=!e,this.requestUpdate("_loadedEventName",t)}get loadedEventName(){return this._loadedEventName}_dispatchEvent({data:e}){if(this.loadedEventName&&e.eventName===this.loadedEventName)this._onIframeReady();else{const t=e.eventName?e.eventName:"event";this.dispatchEvent(new CustomEvent(`iframe-event-${t}`,{composed:!0,bubbles:!0,detail:e.eventDetail}))}}sendMessageToIframe(e){this.loaded?this._dispatchPostMessageToIframe(e):this._messages.push(e)}_dispatchPostMessageToIframe(e){this.iframe.contentWindow.postMessage(e,"*"!==this.messageTargetOrigin?this.messageTargetOrigin:"")}_onIframeReady(){this.loaded=!0,this._messages.forEach((e=>this._dispatchPostMessageToIframe(e))),this._messages=[]}static get styles(){return[f]}render(){return _`
      <slot></slot>

      <div id="iframeContainer" class="iframe-container">
        <iframe
          id="bbvaIframe"
          allow="${y(this.allow)}"
          ?allowfullscreen="${this.allowfullscreen}"
          src="${this.src}"
          frameborder="0"
          referrerpolicy="${y(this.referrerpolicy)}"
          sandbox="${y(this.sandbox)}"
          srcdoc="${y(this.srcdoc)}"
          title="${y(this.iframeTitle)}"
        ></iframe>
      </div>
    `}}var $=e`
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

[data-tag-name=bbva-core-iframe] {
  position: absolute;
  top: 0;
  left: 0;
}
`;class k extends(o(d(l(t)))){static get is(){return"bbva-feature-sdk-container"}static get scopedElements(){const e=[S,...k.configurationScopedElements()];return k.scopedElementsFromClasses(e)}static get properties(){return{playerId:{type:String,attribute:"player-id"},sdkVersionUrl:{type:String,attribute:"sdk-version-url"},playerAudio:{type:String,attribute:"player-audio"},videoCreated:{type:Boolean,attribute:"video-created"},connectionLost:{type:Boolean,attribute:"connection-lost"},playerSettings:{type:Object,attribute:"player-settings"},playerData:{type:Object,attribute:"player-data"},playerScenes:{type:Array,attribute:"player-scenes"},_srcdocContent:{type:String,state:!0}}}constructor(){super(),this.playerId="",this.sdkVersionUrl="",this.playerAudio="",this.playerSettings={},this.playerData={},this.playerScenes=[],this.connectionLost=!1,this.videoCreated=!1,this._srcdocContent=""}static get styles(){return[$,a("bbva-feature-sdk-videos-mortgage-blings-sdk-container-shared-styles")]}firstUpdated(){super.firstUpdated(),this._srcdocContent=this._tplSrcdocContent}get _contentBlings(){return this._contentBlingsElement||(this._contentBlingsElement=this.shadowRoot.querySelector('[data-tag-name="bbva-core-iframe"]')),this._contentBlingsElement}get _tplSrcdocContent(){var e;const t=this._parseData(this.playerId),a=this._parseData(this.playerAudio),i=this._parseData(this.playerSettings),s=this._parseData(this.playerData),r=this._parseData(this.sdkVersionUrl),n=!(null===(e=this.playerScenes)||void 0===e||!e.length)&&this._parseData(this.playerScenes),o=((e,t,a,i,s,r,n)=>`<!DOCTYPE html>\n    <html lang='es'>\n      <head>\n        <meta charset='UTF-8'>\n        <script src=${e}><\/script>\n      </head>\n\n      <body>\n        <div id='vid-holder'></div>\n      </body>\n\n      <script>\n        window.addEventListener('message', () => {\n          if (event.data && event.data.type === 'create-blings-player') {\n            playerCreate();\n          }\n        });\n\n        function postMessageToParent(name) {\n          window.parent.postMessage(name, '*');\n        }\n\n        function playerCreate() {\n          if (window.BlingsPlayer && ${t}) {\n            const configBlings = {\n              project: {\n                id: ${a}\n              },\n              rest:  {overlay: { audio: [{ url: ${i}, volume: 1, loop: true }] }},\n              settings: Object.assign({\n                container: document.querySelector('#vid-holder') },\n                ${s},\n                { analyticsConfig: {\n                  customAnalytics: {\n                    init: () => {},\n                    config: (player) => {},\n                    send: (event, properties) => {\n                      postMessageToParent({eventName: 'player-' + event, eventDetail: properties })\n                    }\n                  }\n                }}),\n              data: ${r}\n            };\n\n            if (${n}) {\n              Object.assign(configBlings, { scenes: ${n} });\n            }\n\n            BlingsPlayer.create(configBlings).then(r => {\n              postMessageToParent({eventName: 'player-sdk-create-success'});\n            }).catch(e => {\n              postMessageToParent({eventName: 'player-sdk-create-error'});\n            });\n          } else {\n            postMessageToParent({eventName: 'player-sdk-create-error'});\n          }\n        }\n\n        window.saveState = (stateName) => {\n          postMessageToParent({eventName: 'player-sdk-state-saved', eventDetail: stateName});\n        };\n\n        postMessageToParent({eventName: 'player-template-loaded-success'});\n      <\/script>\n\n      <style>\n        body {\n          background-color: #072146;\n        }\n      </style>\n    </html>\n  `)(r,!this.connectionLost,t,a,i,s,n);return o}_parseData(e){return JSON.stringify(e??"")}playerCreate(){this.connectionLost?this._dispatchCustomEvent(`${k.is}-create-connection-lost`):this._validatedCreateVideo()}_validatedCreateVideo(){this.videoCreated?this._dispatchCustomEvent(`${k.is}-clear-loader`):this._contentBlings.sendMessageToIframe({type:"create-blings-player"})}_templateLoadedSuccess(){this.playerCreate()}_playerCreateSuccess(){this._dispatchCustomEvent(`${k.is}-create-success`)}_playerCreateError(){this._dispatchCustomEvent(`${k.is}-create-error`)}_handleVideoEvents({detail:e}){const{category:t}=e;this._dispatchCustomEvent(`${k.is}-${t}`,e)}_stateSaved({detail:e}){let t=e;"string"!=typeof t&&(t=this._parseData(t)),t=t.replace(/[^a-zA-Z0-9 .,!?_-]/g,""),t=t.substring(0,50),this._dispatchCustomEvent(`${k.is}-state-saved`,t)}render(){return i`
      <bbva-core-iframe
        iframe-title="player video"
        srcdoc="${this._srcdocContent}"
        allowfullscreen
        @iframe-event-player-template-loaded-success="${this._templateLoadedSuccess}"
        @iframe-event-player-ready="${this._playerCreateSuccess}"
        @iframe-event-player-sdk-create-error="${this._playerCreateError}"
        @iframe-event-player-sdk-state-saved="${this._stateSaved}"
        @iframe-event-player-wtr="${this._handleVideoEvents}"
        @iframe-event-player-cta-onclick="${this._handleVideoEvents}"
        @iframe-event-player-scene-change="${this._handleVideoEvents}"
        @iframe-event-player-ended="${this._handleVideoEvents}"
        >
      </bbva-core-iframe>
    `}}class E extends(l(t)){static get is(){return"bbva-feature-sdk-videos-dm"}static get properties(){return{startValidation:{type:Boolean,attribute:"start-validation"},keyFlag:{type:String,attribute:"key-flag"},sdkVersionUrl:{type:String,attribute:"sdk-version-url"},providedHash:{type:String,attribute:"provided-hash"},hashRecovered:{type:String,attribute:"hash-recovered"},featureFlagCollection:{type:Object,attribute:"feature-flag-collection"},dataOffers:{type:Array,attribute:"data-offers"},customerData:{type:Array,attribute:"customer-data"},_featureEnabled:{type:Boolean,state:!0},_campaignAmount:{type:String,state:!0}}}constructor(){super(),this.startValidation=!1,this.keyFlag="",this.sdkVersionUrl="",this.providedHash="",this.featureFlagCollection={},this.dataOffers={},this.customerData=[],this._featureEnabled=!1,this._campaignAmount="",this._actionsGetData={mortgage:()=>this._setDataOffersMortgage()}}updated(e){e.has("startValidation")&&this.startValidation&&this._initValidations(),e.has("hashRecovered")&&this.hashRecovered&&""!==this.hashRecovered.trim()&&this._validateHashes()}_initValidations(){this._getFlagValue()?this._validateSdkFile():this._dispatchCustomEvent(`${E.is}-exit-dashboard`)}_setDataOffersMortgage(){var e,t;return this._getOffersData("0HIP"),{nombre:(null===(e=this.customerData)||void 0===e||null===(t=e[0])||void 0===t?void 0:t.firstName)??"",monto_preaprobado:this._formatAmount(this._campaignAmount,!1)}}_formatAmount(e,t,a="USD",i="en-US"){const s=t?{style:"currency",currency:a,minimumFractionDigits:0,maximumFractionDigits:0}:{style:"decimal",minimumFractionDigits:0,maximumFractionDigits:0};return new Intl.NumberFormat(i,s).format(e)}_getFlagValue(){return this.featureFlagCollection&&this.featureFlagCollection[`glomo.featureSdkBlings.${this.keyFlag}`]?this._featureEnabled=this.featureFlagCollection[`glomo.featureSdkBlings.${this.keyFlag}`].value||!1:this._featureEnabled=!1,this._featureEnabled}_getOffersData(e){(this.dataOffers??[]).forEach((t=>{var a,i;e===(null==t||null===(a=t.product)||void 0===a?void 0:a.id)&&(this._campaignAmount=(null===(i=t.amounts[0])||void 0===i?void 0:i.amount)??"0")}))}async _validateSdkFile(){try{const e=await this._downloadFile(this.sdkVersionUrl);this._dispatchCustomEvent(`${E.is}-file-downloaded`,{message:e})}catch(e){this._dispatchCustomEvent(`${E.is}-hash-validation-error`)}}async _downloadFile(e){const t=await fetch(e);if(!t.ok)throw new Error(`Error downloading file: ${t.statusText}`);return t.text()}_validateHashes(){if(this.providedHash===this.hashRecovered){const e=this._actionsGetData[this.keyFlag]?this._actionsGetData[this.keyFlag]():{};this._dispatchCustomEvent(`${E.is}-hash-validation-successful`,e)}else this._dispatchCustomEvent(`${E.is}-hash-validation-error`)}}const x=e=>({retryModal:{id:"retry-modal",accessibility:{accesibilityLabel:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-accessibility-label-${e}`,textIconRightPrimary:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-accessibility-text-icon-right-${e}`},headerText:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-header-text-${e}`,buttonText:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-button-text-${e}`,linkText:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-link-text-${e}`,bodyText:`bbva-feature-sdk-videos-mortgage-blings-retry-modal-body-text-${e}`,modalType:"warning",titleIcon:"warning",fullHeight:!1,action:"actionRetry"},exitModal:{id:"exit-modal",accessibility:{accesibilityLabel:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-accessibility-label-${e}`,textIconRightPrimary:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-accessibility-text-icon-right-${e}`},headerText:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-header-text-${e}`,buttonText:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-button-text-${e}`,linkText:"",bodyTitle:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-body-title-${e}`,bodyText:`bbva-feature-sdk-videos-mortgage-blings-exit-modal-body-text-${e}`,titleIcon:"nothing",fixedFooter:!0,fullHeight:!0,microIllustration:"error",action:"actionExit"},hashErrorModal:{id:"hash-error-modal",accessibility:{accesibilityLabel:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-accessibility-label-${e}`,textIconRightPrimary:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-accessibility-text-icon-right-${e}`},headerText:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-header-text-${e}`,buttonText:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-button-text-${e}`,linkText:"",bodyTitle:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-body-title-${e}`,bodyText:`bbva-feature-sdk-videos-mortgage-blings-hash-error-modal-body-text-${e}`,titleIcon:"nothing",fixedFooter:!0,fullHeight:!0,microIllustration:"error",action:"actionExit"}});var C=e`
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
`;class D extends(d(l(o(t)))){static get is(){return"bbva-feature-sdk-videos-mortgage-blings"}static get scopedElements(){const e=[c,h,p,k,E,...D.configurationScopedElements()];return D.scopedElementsFromClasses(e)}static get properties(){return{customerData:{type:Array,attribute:"customer-data"},featureFlagCollection:{type:Object,attribute:"feature-flag-collection"},dataOffers:{type:Array,attribute:"data-offers"},scenesMapping:{type:Object,attribute:"scenes-mapping"},maxRetries:{type:Number,attribute:"max-retries"},blingsPlayerConfig:{type:Object,attribute:"blings-player-config"},nameSceneFinal:{type:String,attribute:"name-scene-final"},_sdkVersionUrl:{type:String,state:!0},_providedHash:{type:String,state:!0},_startValidation:{type:Boolean,state:!0},_showVideoContainer:{type:Boolean,state:!0},_retryCount:{type:Number,state:!0},_nameFeature:{type:String,state:!0},_configModal:{type:Object,state:!0},_endVideo:{type:Boolean,state:!0},_playerId:{type:String,state:!0},_playerAudio:{type:String,state:!0},_playerScenes:{type:Array,state:!0},_playerData:{type:Object,state:!0},_videoCreated:{type:Boolean,state:!0},_connectionLost:{type:Boolean,state:!0},_hashRecovered:{type:String,state:!0},_visibleModal:{type:Boolean,state:!0}}}constructor(){super(),this.config={loader:!0},this.customerData=[],this.featureFlagCollection={},this.dataOffers=[],this.scenesMapping={},this.maxRetries=3,this.blingsPlayerConfig={},this.nameSceneFinal="scene-final",this._sdkVersionUrl="",this._providedHash="",this._startValidation=!1,this._showVideoContainer=!1,this._retryCount=0,this._nameFeature="",this._configModal={},this._endVideo=!1,this._playerId="",this._playerAudio="",this._playerScenes=[],this._playerData={},this._videoCreated=!1,this._connectionLost=!1,this._hashRecovered="",this._visibleModal=!1,this._icons={warning:s(),nothing:""},this._actionEvents={actionRetry:()=>this._retryLoadVideo(),actionExit:()=>this.exitProjectBlings()}}static get styles(){return[u.primary,g.primary,C,a("bbva-feature-sdk-videos-mortgage-blings-shared-styles")]}get _contentSDK(){return this._contentSdkElement||(this._contentSdkElement=this.shadowRoot.querySelector('[data-tag-name="bbva-feature-sdk-container"]')),this._contentSdkElement}initSdkVideo(e){if(this.showLoader(),null!=e&&e.blings&&null!=e&&e.keyFlag){this._playerId=e.blings,this._nameFeature=e.keyFlag,this._playerAudio=e.audioPlayer??"",this._playerScenes=e.scenes??[],this._playerData=e.data??{},this._startValidation=!0;const t=`${D.is}-header-${this._nameFeature}`;this._dispatchCustomEvent(`${D.is}-set-header`,t)}else this.exitProjectBlings()}getAppSettings(e){const{blingsSdkConfig:t}=e;this._sdkVersionUrl=t.sdkVersionUrl,this._providedHash=t.providedHash}_startPlayer({detail:e}){Object.keys(e).length&&(this._playerData=e),this._showVideoContainer=!0}_successVideoLoaded(){this.clearLoader(),this._videoCreated=!0,this._dispatchCustomEvent(`${D.is}-${this._nameFeature}-success-video`)}internetConnectionLost(){this._contentSDK&&(this.showLoader(),this._connectionLost=!0,this._showModalError())}internetConnectionRestored(){this._contentSDK&&(this._connectionLost=!1)}_showModalError(){this._connectionLost||this.clearLoader(),this._retryCount<this.maxRetries?(this._configModal=x(this._nameFeature).retryModal,this._visibleModal=!0,this._dispatchCustomEvent(`${D.is}-show-retry-error-information-modal`)):this._showExitModal()}_showExitModal(){this.clearLoader(),this._configModal=x(this._nameFeature).exitModal,this._visibleModal=!0,this._genericErrorInformation(),this._dispatchCustomEvent(`${D.is}-show-error-information-exit-modal`)}_showHashErrorModal(){this.clearLoader(),this._configModal=x(this._nameFeature).hashErrorModal,this._visibleModal=!0,this._genericErrorInformation(),this._dispatchCustomEvent(`${D.is}-show-hash-error-modal`)}_genericErrorInformation(){this._dispatchCustomEvent(`${D.is}-${this._nameFeature}-generic-error-information`)}_retryLoadVideo(){this.showLoader(),this._retryCount+=1,this._connectionLost||(this._visibleModal=!1),this._contentSDK.playerCreate()}_handleVideoEvents({detail:e}){const t=e=>this.scenesMapping[null==e?void 0:e.toLowerCase()],a=t(e.label),i=t(e.sc),s={wtr:()=>this._handleWtrCategory(a,e),interaction:()=>this._handleInteractionCategory(i,e),playback:()=>this._handlePlaybackCategory(a,e)};s[e.category]&&s[e.category]()}_handleWtrCategory(e,t){e&&this._dispatchVideoEvent(`${e}-progress`,t)}_handleInteractionCategory(e,t){e&&(e===this.nameSceneFinal?this.exitProjectBlings():this._dispatchVideoEvent(`${e}-${t.category}`,t))}_handlePlaybackCategory(e,t){e?(e===this.nameSceneFinal&&(this._endVideo=!0),this._dispatchVideoEvent(`scene-change-${e}`,t)):this._endVideo&&this._dispatchVideoEvent("end-video",t)}_dispatchVideoEvent(e,t){const a=`${D.is}-${this._nameFeature}-${e}`;this._dispatchCustomEvent(a,t)}_sendStateSaved({detail:e}){this._dispatchCustomEvent(`${D.is}-${this._nameFeature}-state-saved`,e)}_requestHashFile({detail:e}){this._dispatchCustomEvent(`${D.is}-generate-hash-sdk-file`,e)}hashRecoveredFile(e){this._hashRecovered=e}exitProjectBlings(){this._playerId="",this._playerAudio="",this._playerScenes=[],this._playerData={},this._endVideo=!1,this._startValidation=!1,this._showVideoContainer=!1,this._retryCount=0,this._hashRecovered="",this._videoCreated=!1,this._connectionLost=!1,this._visibleModal=!1,this.clearLoader(),this._dispatchCustomEvent(`${D.is}-exit-project-blings`)}get _tplModalConfig(){var e,t,a,s,n,o,d,l,c,h,p,u,g,m,v,b,_;return i`
      <bbva-help-modal
        id="${null===(e=this._configModal)||void 0===e?void 0:e.id}"
        ?visible="${this._visibleModal}"
        .closeModalElements="${[]}"
        aria-label="${this.t(null===(t=this._configModal)||void 0===t||null===(a=t.accessibility)||void 0===a?void 0:a.accesibilityLabel)}"
        header-close-icon-aria-label="${this.t(null===(s=this._configModal)||void 0===s||null===(n=s.accessibility)||void 0===n?void 0:n.textIconRightPrimary)}"
        ?full-height="${null===(o=this._configModal)||void 0===o?void 0:o.fullHeight}"
        ?fixed-footer="${null===(d=this._configModal)||void 0===d?void 0:d.fixedFooter}"
        header-text="${this.t(null===(l=this._configModal)||void 0===l?void 0:l.headerText)}"
        button-text="${this.t(null===(c=this._configModal)||void 0===c?void 0:c.buttonText)}"
        link-text="${this.t(null===(h=this._configModal)||void 0===h?void 0:h.linkText)}"
        title-icon="${this._icons[null===(p=this._configModal)||void 0===p?void 0:p.titleIcon]}"
        modal-type="${null===(u=this._configModal)||void 0===u?void 0:u.modalType}"
        @help-modal-footer-button-click="${this._actionEvents[null===(g=this._configModal)||void 0===g?void 0:g.action]}"
        @help-modal-header-click="${this.exitProjectBlings}"
        @help-modal-footer-link-click="${this.exitProjectBlings}"
        @help-modal-veil-click="${this.exitProjectBlings}"
        >
        <div slot="slot-content" ambient="light">
          ${null!==(m=this._configModal)&&void 0!==m&&m.microIllustration?i`
              <bbva-clip-microillustration
                disabled-tabindex
                microillustration="${null===(v=this._configModal)||void 0===v?void 0:v.microIllustration}"
                role="presentation"
              ></bbva-clip-microillustration>`:r}
          <bbva-type-text
            text="${(null===(b=this._configModal)||void 0===b?void 0:b.bodyTitle)??""}"
            size="3XL"
            font-weight="500"
            >
          </bbva-type-text>
          <bbva-type-text
            text="${null===(_=this._configModal)||void 0===_?void 0:_.bodyText}"
            >
          </bbva-type-text >
        </div>
      </bbva-help-modal>
    `}get _tplBlingsSdk(){return i`
      <bbva-feature-sdk-container
        player-id="${this._playerId}"
        player-audio="${this._playerAudio}"
        .playerSettings="${this.blingsPlayerConfig}"
        .playerData="${this._playerData}"
        .playerScenes="${this._playerScenes}"
        ?connection-lost="${this._connectionLost}"
        ?video-created="${this._videoCreated}"
        sdk-version-url="${this._sdkVersionUrl}"
        @bbva-feature-sdk-container-create-success="${this._successVideoLoaded}"
        @bbva-feature-sdk-container-create-error="${this._showModalError}"
        @bbva-feature-sdk-container-create-connection-lost="${this._showModalError}"
        @bbva-feature-sdk-container-clear-loader="${this.clearLoader}"
        @bbva-feature-sdk-container-wtr="${this._handleVideoEvents}"
        @bbva-feature-sdk-container-interaction="${this._handleVideoEvents}"
        @bbva-feature-sdk-container-playback="${this._handleVideoEvents}"
        @bbva-feature-sdk-container-ended="${this._handleVideoEvents}"
        @bbva-feature-sdk-container-state-saved="${this._sendStateSaved}"
        >
      </bbva-feature-sdk-container>
    `}get _tplSdkVideosDm(){return i`
      <bbva-feature-sdk-videos-dm
        ?start-validation="${this._startValidation}"
        .customerData="${this.customerData}"
        .featureFlagCollection="${this.featureFlagCollection}"
        .dataOffers="${this.dataOffers}"
        key-flag="${this._nameFeature}"
        sdk-version-url="${this._sdkVersionUrl}"
        provided-hash="${this._providedHash}"
        hash-recovered="${this._hashRecovered}"
        @bbva-feature-sdk-videos-dm-file-downloaded="${this._requestHashFile}"
        @bbva-feature-sdk-videos-dm-hash-validation-successful="${this._startPlayer}"
        @bbva-feature-sdk-videos-dm-hash-validation-error="${this._showHashErrorModal}"
        @bbva-feature-sdk-videos-dm-exit-dashboard="${this.exitProjectBlings}"
      >
      </bbva-feature-sdk-videos-dm>
    `}render(){return i`
      ${super.render()}
      ${this._tplModalConfig}
      ${this._tplSdkVideosDm}
      ${this._showVideoContainer?this._tplBlingsSdk:r}
    `}}customElements.define(D.is,D);const M=n((e=>class extends e{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(e){Object.assign(this.data,e)}buildDynamicMethods(){this.dynamicMethodsName.forEach((e=>{this[e]=()=>this._dispatch(`analytics-${this._camelToKebabCase(e)}`,this.data)}))}_camelToKebabCase(e){return e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`))}persistDataString(e){Object.assign(this.data,this.parseDataToString(e))}_toStringProcess(e,t){const a=e.toString();return this.stringNormalizeExceptions.includes(t)?a:this._normalizeStr(a)}_normalizeStr(e){let t=e;if("string"==typeof e){const a="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",i="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",s=new RegExp(`[${a}]`,"ug");t=e.replace(s,(e=>i.charAt(a.indexOf(e)))).toLowerCase()}return t}parseDataToString(e,t){if(!e)return e;switch(typeof e){case"string":case"boolean":case"number":return this._toStringProcess(e,t);case"object":if(Array.isArray(e))return e.map((e=>this.parseDataToString(e)));const a={...e};return Object.keys(a).forEach((t=>{a[t]=this.parseDataToString(e[t],t)})),a;case"function":return this.parseDataToString(e());default:return e.toString()}}firePersistedData(e){this.persistData(e),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(e){let t=e;"string"==typeof t&&(t=this.normalizeString(t)),"object"==typeof t&&Object.keys(t).forEach((e=>{t[e]=this.normalizeString(t[e])})),this.firePersistedData(t)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(e){this._dispatch("analytics-page-view"+(e?`-${e}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(e){this._dispatch("analytics-internal-link",e)}fireInternalLinkCard(e){this._dispatch("analytics-internal-link-card",e)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(e){if(!this._isAppStartedLaunched){const t=(null==e?void 0:e.id)||e,a=this._getTextConfig(t,"items");a&&(this.fireAppStarted(a),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(e){this.persistData({detail:`${this.appStartedText}${e}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(e){return e.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(e,t){var a,i;return null===(a=this.config)||void 0===a||null===(i=a[t])||void 0===i?void 0:i[e]}getPathValue(e,t){return t.split(".").reduce(((e,t)=>e[t]),e)}_dispatch(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}));class w extends(M(t)){static get is(){return"bbva-analyticmanager-sdk-videos-mortgage-blings"}static get properties(){return{_scenesMortgage:{type:Object,state:!0},_savedState:{type:String,state:!0},_selectedDay:{type:String,state:!0}}}constructor(){super(),this._scenesMortgage={"escena 01":{partNumber:0,count:1,maxCount:4},"escena 02":{partNumber:0,count:1,maxCount:2},"escena 03":{partNumber:0,count:1,maxCount:2},"escena 05":{partNumber:0,count:1,maxCount:2}},this._savedState="",this._selectedDay=""}reset(){this._scenesMortgage={"escena 01":{partNumber:0,count:1,maxCount:4},"escena 02":{partNumber:0,count:1,maxCount:2},"escena 03":{partNumber:0,count:1,maxCount:2},"escena 05":{partNumber:0,count:1,maxCount:2}},this._savedState="",this._selectedDay="",this.resetData()}successVideo(){this.persistData({pageIntent:"informacion",level4:""}),this._sendSceneEvent("welcome")}interactionSceneWelcome(e){this.persistData({typology:{Ciudad:"ciudad",Playa:"playa",Zona_Conurbada:"zona conurbana",Pueblo:"bosque pueblito magico"}[e.cta]}),this._sendSceneEvent("app-on-click-start")}interactionSceneAskCredit(e){this.persistData({applicationProcess:{boton_costo_propiedad:"del costo que tenga la casa o depa",boton_dinero_guardado:"del dinero que ya tenga guardado",boton_pagos_mensuales:"del monto de los pagos mensuales",boton_monto_preaprobado:"del monto preaprobado"}[e.cta]})}stateSaved(e){this._savedState=this._normalizeStr(e),this.persistData({customFields:`ubicacion propiedad:${this._savedState}`})}interactionSceneDate(e){this._selectedDay={boton_lunes:"lunes",boton_martes:"martes",boton_miercoles:"miercoles",boton_jueves:"jueves",boton_viernes:"viernes"}[e.cta],this.persistData({customFields:`ubicacion propiedad:${this._savedState}, dia de la semana:${this._selectedDay}`})}interactionSceneTime(e){this.persistData({customFields:`ubicacion propiedad:${this._savedState}, dia de la semana:${this._selectedDay}, franja horaria:${{"boton_9-12":"9 12h","boton_12-15":"12 15h","boton_15-18":"15 18h",boton_cualquier_horario:"cualquiera de estos horarios"}[e.cta]}`})}changeSceneLocation(){this.persistData({level4:"1 cobro de renta",aplicationStep:"1 cobro de renta"}),this._sendSceneEvent("app-page-visit"),this._sendSceneEvent("app-started")}changeScenaDate(){this._sendSceneEvent("scene-date")}changeSceneTime(){this._sendSceneEvent("scene-time")}changeSceneEnd(){this._sendSceneEvent("app-completed")}errorInformation(){this.persistData({pageIntent:"informacion"}),this._sendSceneEvent("error-information")}partsSceneWelcome(e){var t;const a={1:{part:"scene-welcome-ready-to-make-money",level4:"listo para hacer dinero"},2:{part:"scene-welcome-mortgage-loan-amount",level4:"monto credito hipotecario preaprobado"},3:{part:"scene-welcome-real-estate-investment",level4:"bien inmueble como inversion"},4:{part:"scene-welcome-type-property",level4:""}},i=null===(t=e.label)||void 0===t?void 0:t.toLowerCase(),s=Number(e.value[1]),r=this._scenesMortgage[i];if(r&&!Number.isNaN(s)&&r.count<=r.maxCount&&r.partNumber<s){const e=r.count<r.maxCount?"informacion":"transaccion";this.persistData({pageIntent:e,level4:a[r.count].level4}),this._sendSceneEvent(a[r.count].part),this._scenesMortgage[i].count+=1,this._scenesMortgage[i].partNumber=s}}partsSceneLocation(e){var t;const a={1:{part:"scene-location-typology"},2:{part:"scene-location-state"}},i=null===(t=e.label)||void 0===t?void 0:t.toLowerCase(),s=Number(e.value[1]),r=this._scenesMortgage[i];r&&!Number.isNaN(s)&&r.count<=r.maxCount&&r.partNumber<s&&(this.persistData({aplicationStep:"siguiente"}),this._sendSceneEvent(a[r.count].part),this._scenesMortgage[i].count+=1,this._scenesMortgage[i].partNumber=s)}partsSceneAskCredit(e){this._validatedScenesValues(e,{1:{part:"scene-ask-credit-capital-gains"},2:{part:"scene-ask-credit-options"}})}partsSceneGoodDecision(e){this._validatedScenesValues(e,{1:{part:"scene-good-decision-description"},2:{part:"scene-good-decision-contact-me"}})}_validatedScenesValues(e,t){var a;const i=null===(a=e.label)||void 0===a?void 0:a.toLowerCase(),s=Number(e.value[1]),r=this._scenesMortgage[i];r&&!Number.isNaN(s)&&r.count<=r.maxCount&&r.partNumber<s&&(this._sendSceneEvent(t[r.count].part),this._scenesMortgage[i].count+=1,this._scenesMortgage[i].partNumber=s)}_sendSceneEvent(e){this._dispatch(`${w.is}-${e}-event`,this.data)}}customElements.define(w.is,w);
