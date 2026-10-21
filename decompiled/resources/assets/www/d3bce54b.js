import{z as t,a8 as e,d2 as i,ap as r,L as a,cl as s,ax as o,ak as n,h as l,i as c,a9 as h,al as d,ac as b,ad as p,ab as u,aa as m,an as g,d3 as v,d4 as y,d5 as f,d6 as _,d7 as x,aV as k}from"./952f98a9.js";import{C as S}from"./216055dc.js";import{bl as w}from"./7f3d7ca9.js";import"./bfb6d64c.js";import"./82efcf78.js";const $="#043263",q="#121212",C="#D3D3D3";var T=t`:host {
  min-height: 17rem;
  display: block;
  box-sizing: border-box;
  padding-top: 8px;
  --bbva-list-link-header-color: var(--bbva-widget-faqs-list-bbva-link-color, var(--bbva-dark-medium-blue, var(--colorsPrimaryMedium, ${e("#1973B8")})));
  --bbva-header-category-color: var(--bbva-widget-faqs-list-bbva-header-category-color, var(--bbva-600, var(--colorsSecondary600, ${e(q)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-list-link:active {
  --bbva-list-link-header-color: var(--bbva-widget-faqs-detail-bbva-link-active-color, var(--bbva-dark-core-blue,
  var(--colorsPrimaryCoreDark, var(--colorsPrimaryCoreDark, ${e($)}))));
}

bbva-notification-message {
  margin: 1rem;
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, 8px))) / 16) * 1em) 1rem;
  --bbva-notification-message-error-background-color: #fcdfdf;
  --bbva-link-color: var(--bbva-medium-blue, #237aba);
}

bbva-spinner {
  padding: 80px 120px;
}

:host .veil {
  margin: 16px 0;
}

:host(.space-faqs-list) {
  min-height: 8rem;
  @apply --cells-space-faqs;
}

.semi-divider {
  border-bottom: solid 0.0625rem var(--colorsSecondary300, ${e(C)});
  opacity: 1;
}
`,E=t`
:host {
  display: inline-flex;
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  font: inherit;
  text-align: center;
  user-select: none;
  cursor: pointer;
  outline: none;
}

:host([href]) {
  color: #0000ee;
  text-decoration: underline;
}

:host(:not([href])) {
  padding: 0.25em .5em;
  border-width: 1px;
  border-style: solid;
  border-color: #d8d8d8;
  border-radius: 4px;
  color: rgba(0, 0, 0, 0.847);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  cursor: default;
  color: rgba(0, 0, 0, 0.247);
}

:host([href][aria-disabled=true]) {
  text-decoration: none;
  color: currentColor;
}

:host([focus-visible]:not([disabled])) {
  box-shadow: 0 0 1px 1px #5e9ed6;
}

:host([href][active]) {
  color: red;
}

:host(:not([href])[active]:not([disabled])) {
  background-color: rgba(0, 0, 0, 0.1);
}


`;class P extends(i(r(a))){static get properties(){return{href:{type:String,reflect:!0},type:{type:String},disabled:{type:Boolean,reflect:!0},value:{type:String},name:{type:String},form:{type:String},formaction:{type:String},formenctype:{type:String},formmethod:{type:String},formnovalidate:{type:Boolean},formtarget:{type:String},download:{type:String},hreflang:{type:String},rel:{type:String},target:{type:String},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this._active=!1,this._formElementId=s(),this._onClick=this.onClick.bind(this),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),o(this,"down",(()=>{this.disabled||window.requestAnimationFrame((()=>{this._formElement&&this.focus(),this.active=!0}))})),o(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}get delegatedAttributes(){return["id"]}get delegatedAttributesTarget(){return this._formElement}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active=!1}firstUpdated(t){this._formElementContainer=this.shadowRoot.getElementById(this._formElementId),this._formElementContainer&&(this.appendChild(this._formElementContainer),this._updateFormElement()),this._setInitialAttribute("role",this.href?"link":"button"),this.disabled||(this._setInitialAttribute("tabindex","0"),this.setAttribute("aria-disabled","false")),this.hasAttribute("autofocus")&&!this.href&&this.focus(),super.firstUpdated(t)}updated(t){super.updated(t),t.has("href")&&(this.setAttribute("role",this.href?"link":"button"),this._formElementContainer&&this._updateFormElement()),t.has("disabled")&&(this.disabled?this._disableAction():this._enableAction())}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"))}static get styles(){return[E,n("bbva-core-action-shared-styles")]}static getStyles(){return[t`
        :host {
          position: relative;
        }
      `,super.getStyles()]}render(){return l`
      <slot></slot>
      ${this._action}
    `}get _action(){return l`
      <span class="action-slot">
        <slot name="_action"></slot>
      </span>
      <span
        id="${this._formElementId}"
        slot="_action"
        role="none"
        ?data-disabled="${this.disabled}"
        style="${this.disabled?this._actionStyle:"pointer-events: none;"}"
      >
        ${this.href?this._link:this._button}
      </span>
    `}get _actionStyle(){return"opacity: 0; cursor: inherit; width: 100%; background-color: transparent; margin: 0; padding: 0; border: 0; position: absolute; top: 0; left: 0; right: 0; bottom: 0; pointer-events: auto;"}get _link(){return l`
      <a
        data-action-tag-name="${this.tagName}"
        style="${this.disabled?"pointer-events: none;":this._actionStyle}"
        aria-hidden="true"
        tabindex="-1"
        ?hidden="${this.disabled}"
        href="${c(this.disabled?void 0:this.href)}"
        hreflang="${c(this.hreflang)}"
        target="${c(this.target)}"
        download="${c(this.download)}"
        rel="${c(this.rel)}"
      >
      </a>
    `}get _button(){return l`
      <button
        data-action-tag-name="${this.tagName}"
        style="${this.disabled?"pointer-events: none;":this._actionStyle}"
        aria-hidden="true"
        tabindex="-1"
        type="${c(this.type)}"
        ?hidden="${this.disabled}"
        ?disabled="${this.disabled}"
        name="${c(this.name)}"
        value="${c(this.value)}"
        form="${c(this.form)}"
        formaction="${c(this.formaction)}"
        formenctype="${c(this.formenctype)}"
        formmethod="${c(this.formmethod)}"
        ?formNoValidate="${this.formnovalidate}"
        formtarget="${c(this.formtarget)}"
      ></button>
    `}_updateFormElement(){this._formElement=this._formElementContainer.querySelector("a, button")}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_disableAction(){this.setAttribute("aria-disabled","true"),this.removeAttribute("tabindex"),this._formElementContainer&&this._formElementContainer.addEventListener("click",this.onClick)}_enableAction(){this.setAttribute("aria-disabled","false"),this.setAttribute("tabindex","0"),this._formElementContainer&&this._formElementContainer.removeEventListener("click",this.onClick)}_isValidKey(t){return this.href?"Enter"===t:"Enter"===t||" "===t}_dispatchEventCustomClick(t){this._formElement.dispatchEvent(new MouseEvent("click",{bubbles:!0,composed:!0,cancelable:!0})),t.preventDefault(),t.stopPropagation(),t.stopImmediatePropagation()}onClick(t){if(this.disabled||this.hasAttribute("data-disabled"))return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();!t.defaultPrevented&&this._formElement&&t.target!==this._formElement&&this._dispatchEventCustomClick(t)}onKeyUp(t){this._isValidKey(t.key)&&this.active&&(this.active=!1,(this._formElement?this._formElement:this).dispatchEvent(new MouseEvent("click",{bubbles:!0,composed:!0,cancelable:!0})))}onKeyDown(t){this._isValidKey(t.key)&&!this.disabled&&(this.active=!0,t.preventDefault())}}const V=i=>((i="",r,a,s)=>t`
    ${e(`\n     :host(:not(${r})) ${i} {\n          ${a}\n      }\n      :host(${r}) ${i} {\n          ${s}\n      }\n  `)}
  `)(i,"[focus-visible]","\n      outline: none;\n    ",`\n      outline: ${h.primaryMedium} solid 1px;\n      outline-offset: 4px;\n    `);var A=t`[ambient^=light] {
  --bbva-button-list-color: initial;
  --bbva-button-list-color: initial;
  --bbva-button-list-clip-box-bg-color: initial;
  --bbva-button-list-skeleton-color: initial;
  --bbva-button-list-subtext-color: initial;
  --bbva-button-list-clip-box-bg-color-active: initial;
  --bbva-button-list-color-active: initial;
  --bbva-button-list-clip-box-bg-color-warning: initial;
  --bbva-button-list-color-warning: initial;
  --bbva-button-list-color-warning-active: initial;
  --bbva-button-list-color-disabled: initial;
  --bbva-button-list-subtext-disabled: initial;
}
`,D=t`[ambient^=dark] {
  --bbva-button-list-color: var(--colorsPrimarySubdued, ${e(h.primarySubdued)});
  --bbva-button-list-clip-box-bg-color: var(--colorsPrimaryMediumLight, ${e(h.primaryMediumLight)});
  --bbva-button-list-skeleton-color: var(--colorsPrimaryMedium, ${e(h.primaryMedium)});
  --bbva-button-list-subtext-color: var(--colorsSecondary100, ${e(h.secondary100)});
  --bbva-button-list-clip-box-bg-color-active: var(--colorsPrimaryMedium, ${e(h.primaryMedium)});
  --bbva-button-list-color-active: var(--colorsPrimaryMediumLight, ${e(h.primaryMediumLight)});
  --bbva-button-list-clip-box-bg-color-warning: var(--colorsSecondary100, ${e(h.secondary100)});
  --bbva-button-list-color-warning: var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)});
  --bbva-button-list-clip-box-color-warning: var(--colorsTertiaryType1Dark, ${e(h.tertiaryType1Dark)});
  --bbva-button-list-color-warning-active: var(--colorsPrimarySubduedLight, ${e(h.primarySubduedLight)});
}
`;const F={light:t`
    ${A}
    ${d.light}
    ${w.light}
  `,dark:t`
    ${D}
    ${d.dark}
    ${w.dark}
  `};var j=t`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  color: var(--bbva-button-list-color, var(--colorsPrimaryMedium, ${e(h.primaryMedium)}));
  --bbva-progress-timer-time-font-size: var(--typographyType3XSmall, ${e(b.type3XSmall)});
  --bbva-progress-timer-time-font-height: var(--lineHeightType3XSmall, ${e(p.type3XSmall)});
  --bbva-progress-timer-margin: 0;
  --bbva-clip-box-bg-color: var(--bbva-button-list-clip-box-bg-color, var(--colorsPrimaryMedium, ${e(h.primaryMedium)}));
  --_bg-color-clip-box-off: var(--bbva-button-list-clip-box-bg-color-off, var(--colorsSecondary500, ${e(h.secondary500)}));
  --_bg-color-clip-box-active: var(--bbva-button-list-clip-box-bg-color-active, var(--colorsPrimaryCore, ${e(h.primaryCore)}));
  --_color-active: var(--bbva-button-list-color-active, var(--colorsPrimaryCoreDark, ${e(h.primaryCoreDark)}));
  --_bg-color-clip-box-warning: var(--bbva-button-list-clip-box-bg-color-warning, var(--colorsTertiaryType1Dark, ${e(h.tertiaryType1Dark)}));
  --_color-clip-box-warning: var(--bbva-button-list-clip-box-color-warning, var(--colorsPrimaryCoreLightened, ${e(h.primaryCoreLightened)}));
  --_color-warning: var(--bbva-button-list-color-warning, var(--colorsTertiaryType1, ${e(h.tertiaryType1)}));
  --_color-warning-active: var(--bbva-button-list-color-warning-active, var(--colorsTertiaryType1Dark, ${e(h.tertiaryType1Dark)}));
  --_bg-color-warning-active: var(--bbva-button-list-bg-color-warning-active, var(--colorsTertiaryType1Dark, ${e(h.tertiaryType1Dark)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-list {
  box-sizing: border-box;
  display: flex;
  align-items: center;
  padding: var(--bbva-button-list-global-padding, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(m.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(m.spacer)}))) / 16) * 1em));
  min-height: 4rem;
}

.title {
  display: block;
  font-size: var(--typographyTypeSmall, ${e(b.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(p.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(u.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(u.medium.fontStyle)});
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.text {
  display: block;
  font-size: var(--typographyTypeXSmall, ${e(b.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${e(p.typeXSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(u.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(u.book.fontStyle)});
  color: var(--bbva-button-list-subtext-color, var(--colorsSecondary500, ${e(h.secondary500)}));
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.entity,
.clip-box {
  flex: none;
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(m.spacer)}))) / 16) * 1rem) 0;
}

.content {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(m.spacer)}))) / 16) * 1em);
  text-align: left;
  overflow: hidden;
}

:host([off]) {
  --bbva-clip-box-bg-color: var(--_bg-color-clip-box-off);
}

bbva-progress-timer {
  width: 2.5rem;
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
  background-image: radial-gradient(40px 100%, var(--bbva-button-list-skeleton-color, var(--colorsSecondary200, ${e(h.secondary200)})) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--bbva-button-list-skeleton-color, var(--colorsSecondary200, ${e(h.secondary200)})) 50%);
  background-size: 40px 40px, calc(140% + 16px) 16px;
  background-position: 16px center, 72px center;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant=left]),
:host([variant=right]) {
  width: 50%;
  float: left;
}

:host([variant=left]) .button-list {
  padding-right: 0;
}
:host([variant=left]) .skeleton {
  background-size: 40px 40px, calc(85% + 12px) 16px;
}

:host([variant=right]) .button-list {
  flex-direction: row-reverse;
  padding-left: 0;
}
:host([variant=right]) .content {
  padding-left: 0;
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(m.spacer)}))) / 16) * 1em);
  text-align: right;
}
:host([variant=right]) .skeleton {
  background-image: radial-gradient(40px 100%, var(--bbva-button-list-skeleton-color, var(--colorsSecondary200, ${e(h.secondary200)})) 50%, transparent 50%), linear-gradient(-60deg, var(--bbva-button-list-skeleton-color, var(--colorsSecondary200, ${e(h.secondary200)})) 50%, transparent 50%);
  background-size: 40px 40px, calc(85% + 12px) 16px;
  background-position: calc(100% - 16px) center, calc(100% - 72px) center;
}

:host([disabled]) {
  opacity: var(--bbva-button-list-entity-opacity, 0.4);
}
:host([disabled]) bbva-clip-entities {
  opacity: var(--bbva-button-list-entity-opacity, 0.4);
}

:host([active]) {
  color: var(--_color-active);
}
:host([active]) bbva-clip-box {
  background: var(--_bg-color-clip-box-active);
}

:host(.warning) {
  color: var(--_color-warning);
}
:host(.warning) bbva-clip-box {
  --bbva-clip-box-bg-color: var(--_bg-color-clip-box-warning);
  color: var(--_color-clip-box-warning);
}

:host([two-lines]) .title,
:host([two-lines]) .text {
  white-space: normal;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}
:host([two-lines]) .entity,
:host([two-lines]) .clip-box,
:host([two-lines]) .timer {
  align-self: flex-start;
}

:host([active].warning) {
  color: var(--_color-warning-active);
}
:host([active].warning) bbva-clip-box {
  background: var(--_bg-color-warning-active);
}
`;class L extends(g(P)){static get is(){return"bbva-button-list"}static get properties(){return{entity:{type:String},entityText:{type:String,attribute:"entity-text"},entityVariant:{type:String,attribute:"entity-variant"},icon:{type:String},iconSize:{type:String,attribute:"icon-size"},loading:{type:Boolean,reflect:!0},timeout:{type:Number},timeoutFormatted:{type:String,attribute:"timeout-formatted"},offTime:{type:Boolean,attribute:"off-time"},titleText:{type:String,attribute:"title-text"},text:{type:String}}}constructor(){super(),this.disabled=!1,this.loading=!1,this.text="",this.offTime=!1,this.timeoutFormatted="m:ss",this.type="button"}static get styles(){return[j,n("bbva-button-list-shared-styles"),V(),F.dark,F.light]}get _renderIcon(){let t=null;return this.icon?t=l`
        <bbva-clip-box
          class="clip-box bitone"
          size="${this.iconSize||"medium"}"
          .icon="${this.icon}"
        >
        </bbva-clip-box>
      `:this.entity?t=l`
        <bbva-clip-entities
          .disabled=${this.disabled}
          class="entity"
          size="${this.iconSize||"large"}"
          .entity="${this.entity}"
          variant="${c(this.entityVariant)}"
        >
          ${this.entityText}
        </bbva-clip-entities>
      `:this.timeout&&(t=l`
        <bbva-progress-timer
          class="timer"
          .size="${this.iconSize||40}"
          .timeout="${this.timeout}"
          .timeoutFormatted="${this.timeoutFormatted}"
          .off=${this.offTime}
        >
        </bbva-progress-timer>
      `),t}render(){return l`
      <div class="button-list">
        ${this._renderIcon}
        <span class="content">
          <b class="title">${this.t(this.titleText)}</b>
          <span class="text">${this.t(this.text)}</span>
        </span>
      </div>
      <div class="skeleton"></div>
    `}}customElements.define(L.is,L);const z=()=>!!window.CellsNativePlugins&&!!window.CellsNativePlugins.Http,B=()=>!!window.cordovaCells&&!!window.cordovaCells.Http,M=(t,e)=>{let i=t.data;if((t=>{try{JSON.parse(t)}catch(t){return!1}return!0})(t.data))i=JSON.parse(i);else{i=(new DOMParser).parseFromString(i,"text/xml")}const r={status:t.status?JSON.parse(t.status):0,data:i,headers:t.headers?JSON.parse(t.headers):{}};e(Object.assign({},r.data,{headers:r.headers}))},N=(t,e)=>{e(t)},O=t=>{if(!z()&&!B())return void console.warn("There isnt any HTTP plugin initialized");const e=(t=>{const e={url:t.url,method:t.method.toLowerCase(),headers:t.headers,params:t.body?t.body:t.params};return""===e.params&&(e.params={}),e})(t);return B()?(t=>{const{method:e,url:i,params:r,headers:a}=t;return new Promise(((t,s)=>{window.cordovaCells.Http[e](i,r,a,(e=>M(e,t)),(t=>N(t,s)))}))})(e):z()?(t=>{const{method:e,url:i,params:r,headers:a}=t;return new Promise(((t,s)=>{window.CellsNativePlugins.Http[e](i,r,a,(e=>M(e,t)),(t=>N(t,s)))}))})(e):void 0};class R extends a{static get is(){return"cells-generic-dp"}static get properties(){return{host:{type:String},path:{type:String},method:{type:String},body:{type:Object},headers:{type:Object},native:{type:Boolean},contentType:{type:String,attribute:"content-type"},verbose:{type:Boolean},crossDomain:{type:Boolean,attribute:"cross-domain"},withCredentials:{type:Boolean,attribute:"with-credentials"},timeout:{type:Number},token:{type:Object},requiresToken:{type:Boolean}}}constructor(){super(),this._headers={Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"application/json"},this.method="GET",this.host="",this.path="",this.verbose=!1,this.withCredentials=!1,this.crossDomain=!1,this.timeout=6e4,this.token={},this._token={storage:"sessionStorage",key:"tsec",path:"",headerFieldName:"tsec",headerFieldValuePrefix:""},this.requiresToken=!1}_composeUrl(){if("string"==typeof this.host&&"string"==typeof this.path)return this.host.length&&this.path.length?[this.host,this.path].join("/"):this.host;this._emit("error","Invalid [host] or [path] properties values!",!0)}_getSettings(){return{url:this._composeUrl(),method:this.method,headers:this._mergeHeaders(),body:this._parseBodyObject(this._mergeHeaders()),timeout:this.timeout,crossDomain:this.crossDomain,withCredentials:this.withCredentials}}generateRequest(){return this.native?this.genarateNativeCall():this.generateHttpAjaxCall()}generateHttpAjaxCall(){return v(this._getSettings()).pipe(y((t=>this._normalizeResponse(t))),f((t=>this._emit("request-success",this._buildSuccessDetail(t),!1))),_((t=>(this._emit("request-error",t,!1),x(t))))).toPromise()}genarateNativeCall(){const t=O(this._getSettings());return t.then((t=>{this._emit("request-success",t,!1)})).catch((t=>{this._emit("request-error",t,!1)})),t}_mergeHeaders(){var t=this._getSemaasHeaders(),e=Object.assign(this._headers,t,this.headers||{});if(this.requiresToken){var i=this._mergeTokenConfiguration(),r=this._getTokenValue(i);e[i.headerFieldName]=r}return e}_parseBodyObject(t){var e=this.body;if("object"==typeof e&&null!==e){var i=this.contentType;switch(i||Object.keys(t).some((e=>"content-type"===e.toLowerCase()&&(i=t[e],!0))),i.split(";")[0]){case"text/plain":case"application/json":try{e=this.native?e:JSON.stringify(e)}catch(t){this._emit("error",t,!0),e=null}break;default:e=Object.keys(e).map((function(t){return t+"="+e[t]}),this).join("&")}}return e}_emit(t,e,i){if(t&&"string"==typeof t||(t="log"),this.verbose){var r=t;"function"!=typeof console[r]&&(r="log"),console[r]("["+this.constructor.is+"] ["+t.toUpperCase()+"] :: "+JSON.stringify(e))}!0===i&&(t="cells-generic-dp-"+t),this.verbose&&(console.log("type: ",t),console.log("payload: ",e)),this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(i){var r=e.getItem(i);r&&"null"!==r&&(t[i]=r)}))}return t}_mergeTokenConfiguration(){return Object.assign({},this._token,this.token)}_getTokenStorage(t){var e=t.storage;return"string"==typeof e&&e in window?window[e]:"object"==typeof e?e:null}_getTokenValue(t){var e=this._getTokenStorage(t),i=t.key,r=e.getItem(i);return t.path&&(r=JSON.parse(r)[t.path]),t.headerFieldValuePrefix&&(r=`${t.headerFieldValuePrefix} ${r}`),r}_normalizeResponse(t){return t.data=t.response,t.headers=t.request.headers,t}_buildSuccessDetail(t){return Object.assign({},t.data,{headers:t.headers})}}customElements.define(R.is,R);class H extends(S(a)){static get is(){return"bbva-widget-faqs-list"}static get properties(){return{faqs:{type:Array},host:{type:String},path:{type:String},method:{type:String},native:{type:Boolean},header:{type:String},linkTitle:{type:String},maxRetries:{type:Number},_templateStatus:{type:String},drawLastSeparator:{type:Boolean,attribute:"draw-last-separator"},platform:{type:String},appVersion:{type:Object,attribute:"app-version"},_loaderror:{type:Boolean},_retries:{type:Number},feature:{type:String}}}constructor(){super(),this.host="",this.path="",this.method="GET",this.native=!1,this.maxRetries=3,this._loaderror=!1,this._retries=0,this.faqs=null,this._templateStatus="",this.header="glomo-faqs-header-title",this.drawLastSeparator=!1,this.platform="android",this.appVersion=null,this.linkTitle="glomo-faqs-link-title",this.feature=""}static get styles(){return[T,n("bbva-widget-faqs-list-shared-styles")]}faqClickAction(t){this._actionClicked=!0,this._emit("bbva-widget-faqs-list-faq-click",t)}resetFaqs(){this._actionClicked?this._actionClicked=!1:(this.feature="",this.faqs=null,this.header="glomo-faqs-header-title",this.linkTitle="glomo-faqs-link-title")}generateRequest(){this.faqs||this.forceRequest()}forceRequest(){this._templateStatus="spinner",this.updateComplete.then((()=>{this.shadowRoot.querySelector("#dp").generateRequest()}))}_requestSuccess(t){this.faqs=t.detail.faqs||[],this._emit("bbva-widget-faqs-list-request-success",this.faqs)}_requestError(){this._templateStatus="error",this._emit("bbva-widget-faqs-list-request-error")}updated(t){t.has("faqs")&&this.faqs&&(this._templateStatus="faqsList")}_retryRequest(){this._retries++,this.forceRequest()}get _textError(){return this._retries<this.maxRetries?this.t("glomo-faqs-retrie-message"):this.t("glomo-faqs-no-retrie-message")}get _linkTitle(){return this._retries<this.maxRetries?this.t(this.linkTitle):""}get _spinnerTemplate(){return l`<div class="veil"><bbva-spinner with-mask></bbva-spinner></div>`}get _dpTemplate(){return l`
      <cells-generic-dp
      id='dp'
      host='${this.host}'
      path='${this.path}'
      method='${this.method}'
      ?native='${this.native}'
      @request-success=${this._requestSuccess}
      @request-error=${this._requestError}
      ></cells-generic-dp>
      `}get _headerTemplate(){return l`<bbva-header-category text='${this.t(this.header)}'></bbva-header-category>`}get _faqsList(){return l`${this.faqs?this._faqsTemplate:k}`}get _appVersionCode(){return this.appVersion&&this.appVersion.versionCode?this.appVersion.versionCode:""}get faqsFilteredByAppVersion(){return this.faqs&&this.faqs.filter((t=>{const e=t.maxVersion&&t.maxVersion[this.platform],i=t.minVersion&&t.minVersion[this.platform],r=this._appVersionCode;return(!i||r>=i)&&(!e||r<=e)}))}_filterFaqsByFeature(t){return t.filter((t=>this.feature?t.feature===this.feature:!t.feature))}get _faqsTemplate(){return this._filterFaqsByFeature(this.faqsFilteredByAppVersion).map(((t,e)=>l`
      <bbva-list-link
        multiline
        class="${e<this.faqs.length-1||this.drawLastSeparator?"semi-divider":""}"
        @click="${()=>this.faqClickAction(t)}"
        header-text="${t.title}">
      </bbva-list-link>
    `))}get _errorTemplate(){return l`
      <bbva-notification-message 
        variant="error" 
        link-title="${this._linkTitle}"
        @notification-message-link-click="${()=>this._retryRequest()}">
        ${this._textError}
      </bbva-notification-message>
  `}get _faqsTemplateManager(){return{spinner:l`<div class="veil"><bbva-spinner with-mask></bbva-spinner></div>`,faqsList:this._faqsList,error:this._errorTemplate}[this._templateStatus]}render(){return l`
      ${this._headerTemplate}
      ${this._faqsTemplateManager}
      ${this._dpTemplate}
    `}_emit(t,e){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(H.is,H);
