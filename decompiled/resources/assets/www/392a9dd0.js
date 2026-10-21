import"./7f3d7ca9.js";import{z as i,a8 as e,ar as t,a9 as r,aa as a,L as s,ak as o,h as n}from"./952f98a9.js";import{C as c}from"./216055dc.js";import"./5c324d17.js";import"./c0a2f832.js";import"./cae0f1de.js";const d=new t;var p=i`[top-spacer] {
  visibility: hidden;
  margin-top: 0;
}

[top-spacer="8"] {
  visibility: hidden;
  margin-top: 8;
}

[top-spacer="16"] {
  visibility: hidden;
  margin-top: 16;
}

[top-spacer="24"] {
  visibility: hidden;
  margin-top: 24;
}

[top-spacer="32"] {
  visibility: hidden;
  margin-top: 32;
}

[top-spacer="48"] {
  visibility: hidden;
  margin-top: 48;
}

[top-spacer="64"] {
  visibility: hidden;
  margin-top: 64;
}

[bottom-spacer] {
  visibility: hidden;
  margin-bottom: 0;
}

[bottom-spacer="8"] {
  visibility: hidden;
  margin-bottom: 8;
}

[bottom-spacer="16"] {
  visibility: hidden;
  margin-bottom: 16;
}

[bottom-spacer="24"] {
  visibility: hidden;
  margin-bottom: 24;
}

[bottom-spacer="32"] {
  visibility: hidden;
  margin-bottom: 32;
}

[bottom-spacer="48"] {
  visibility: hidden;
  margin-bottom: 48;
}

[bottom-spacer="64"] {
  visibility: hidden;
  margin-bottom: 64;
}

[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}
[divider][top-spacer] {
  visibility: visible;
}
[divider][bottom-spacer] {
  visibility: visible;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-color, var(--colorsSecondary300, ${e(r.secondary300)}));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(a.spacer)}))) / 16) * 1rem);
}
${d.mediaRules()}`;const l=new t;var m=i`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(r.secondary300)});
  --bbva-divider-opacity: 1;
}
${l.mediaRules()}`;const b=new t;const g={dark:i`
    ${i`[ambient^=dark] {
  --bbva-divider-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-divider-opacity: 0.3;
}
${b.mediaRules()}`}
  `,light:i`
    ${m}
  `};class h extends s{static get is(){return"bbva-divider"}static get properties(){return{size:{type:String},topSpacer:{type:String,reflect:!0,attribute:"top-spacer"},bottomSpacer:{type:String,reflect:!0,attribute:"bottom-spacer"}}}constructor(){super(),this.size="full"}static get styles(){return[p,g.light,g.dark,o("bbva-divider-shared-styles")]}render(){return n`
      <hr divider="${this.size}" />
    `}}customElements.define(h.is,h);var v=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

bbva-divider:last-of-type {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

p {
  padding: 1rem 0.5rem 0 1rem;
  font-size: 1rem;
}
`;class y extends(c(s)){static get is(){return"bbva-aggregation-app-permissions"}static get properties(){return{showHeader:{type:Boolean},textBeforeLink:{type:String},linkText:{type:String},textAfterLink:{type:String},permissions:{type:Array},grantedText:{type:String},deniedText:{type:String},dividerSize:{type:String}}}constructor(){super(),this.showHeader=!0,this.permissions=[],this.divider="full",this.grantedText="",this.deniedText=""}static get styles(){return[v,o("bbva-aggregation-app-permissions-shared-styles")]}linkClicked(){this.dispatchEvent(new CustomEvent("bbva-aggregation-app-permissions-link-click",{bubbles:!0,composed:!0}))}render(){return n`
      ${this.showHeader?n`
      <p>
        ${this.t(this.textBeforeLink)}
        <bbva-link @click="${this.linkClicked}">${this.t(this.linkText)}</bbva-link>
        ${this.t(this.textAfterLink)}
      </p>
    `:""}
      ${this.permissions.map((i=>n`
        <bbva-list-action
          icon="${i.icon}"
          main-title="${this.t(i.title)}"
          description-badge-text="${this.t(i.granted?this.grantedText:this.deniedText)}"
          badge-type="${i.granted?"success":"warning"}"
          description="${this.t(i.description)}"
          no-link no-editable no-closable>
        </bbva-list-action>
        <bbva-divider size="${this.divider}"></bbva-divider>
      `))}
    `}}customElements.define(y.is,y);var u=i`
:host {
  display: block;
  box-sizing: border-box;
  @apply --bbva-manager-app-permissions; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit;}
`;class f extends(c(s)){static get is(){return"bbva-manager-app-permissions"}static get properties(){return{isExperiences:{type:Boolean},nativeIos:{type:Boolean},globalHarcodedPermissions:{type:Array}}}constructor(){super(),this.isExperiences=!1,this.nativeIos=!1,this.globalHarcodedPermissions=[]}setOpenedModal(i){this.isExperiences=i.visible}prepareModalInfo(){const i={code:"app-permissions-info",primaryButtonClass:"primary",selectedConfig:{className:"full-height-error",openMaximized:!0,title:this.t("app-permissions-modal-info-header"),acceptBtLabel:this.t("app-permissions-modal-info-primary-button"),iconPositionConfig:{type:"info",icon:"coronita:help",iconClass:"icon-size-24",message:""},template:{type:"paragraphs",values:[{title:this.t("app-permissions-modal-info-heading")},{text:this.t("app-permissions-modal-info-message"),class:"text-styles-ml"}]}}};this.dispatchEvent(new CustomEvent("show-modal-info",{bubbles:!0,composed:!0,detail:i}))}setItems(i=[]){const e=(i=[...i,...this.globalHarcodedPermissions]).map((i=>({icon:this.__getIcon(i.name),title:this.__getTitle(i.name),description:this.__getDescription(i.name),granted:i.granted,...i.customLabel&&{customLabel:this.t(`app-permissions-${i.name}-permission-label`)}}))).filter((i=>i.title));this.dispatchEvent(new CustomEvent("on-permissions-data-ready",{bubbles:!0,composed:!0,detail:e}))}__getIcon(i){switch(i){case"camera":case"calendar":case"microphone":case"clock":return`coronita:${i}`;case"phone":return"coronita:telephone";case"location":return"coronita:place";case"contacts":return"coronita:agenda";case"notification":return"coronita:support";case"storage":return"coronita:folder";case"webview":return"coronita:settings"}}__getTitle(i){switch(i){case"notification":case"camera":case"contacts":case"location":case"calendar":case"storage":case"microphone":case"phone":case"sms":case"webview":case"clock":return this.t(`app-permissions-${i}-permission-title`)}}__getDescription(i){switch(i){case"notification":case"camera":case"contacts":case"location":case"calendar":case"storage":case"microphone":case"phone":case"sms":case"webview":return this.t(`app-permissions-${i}-permission-description`);case"clock":return this.nativeIos?this.t("app-permissions-clock-permission-description-ios"):this.t("app-permissions-clock-permission-description-android")}}goBackStep(){this.dispatchEvent(new CustomEvent(this.isExperiences?"experiences-backstep-event":"glomo-backstep-event"))}static get styles(){return[u,o("bbva-manager-app-permissions-shared-styles")]}render(){return n`
      <slot></slot>
    `}}customElements.define(f.is,f);
