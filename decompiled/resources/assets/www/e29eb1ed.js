import"./7f3d7ca9.js";import{z as a,a8 as r,ar as t,a9 as i,aa as e,a as o,L as c,ak as n,h as s,g as d,ac as l,ad as b,ab as v,be as g,b0 as p,D as h,al as m,bc as y,aK as $,A as u,b6 as f,ae as S,bh as k,i as C}from"./952f98a9.js";import"./b8689565.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";const w=new t;var x=a`[divider] {
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
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${r(i.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}
${w.mediaRules()}`;const _=new t;var V=a`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${r(i.secondary300)});
}
${_.mediaRules()}`;const E=new t;const L={dark:a`
    ${a`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${r(i.secondary300)});
}
${E.mediaRules()}`}
  `,light:a`
    ${V}
  `};class z extends(o(c)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[x,L.light,L.dark,n("bbva-divider-shared-styles")]}render(){return s` <hr divider="${this.size}" /> `}}d("colors.cool40");const P=new t;var D=a`:host {
  display: block;
  box-sizing: border-box;
  border-radius: var(--borderRadiusSmall, ${r(g.small)});
  background: var(--bbva-card-contact-bg-dark-mode-color, var(--bbva-card-contact-bg-color, var(--colorsPrimaryCoreLightened, ${r(i.primaryCoreLightened)})));
  --_name-color: var(--bbva-card-contact-name-dark-mode-color, var(--bbva-card-contact-name-color, var(--colorsSecondary600, ${r(i.secondary600)})));
  --_info-color: var(--bbva-card-contact-info-dark-mode-color, var(--bbva-card-contact-info-color, var(--colorsSecondary500, ${r(i.secondary500)})));
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
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em);
  text-align: center;
  font-size: var(--typographyTypeSmall, ${r(l.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${r(b.typeSmall)});
}

[data-tag-name=bbva-clip-box],
[data-tag-name=bbva-clip-entities] {
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-clip-entities] {
  display: block;
}

:host(:not([link])) .name {
  display: block;
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(v.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(v.medium.fontStyle)});
  color: var(--_name-color);
}

.info {
  display: block;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(v.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${r(v.book.fontStyle)});
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em);
  color: var(--_info-color);
}

[data-tag-name=bbva-badge-default] {
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${r(e.spacer)}))) / 15) * 1em);
}
${P.mediaRules()}`;const F=new t;var j=a`[ambient^=light] {
  --bbva-card-contact-bg-color: var(--colorsPrimaryCoreLightened, ${r(i.primaryCoreLightened)});
  --bbva-card-contact-name-color: var(--colorsSecondary600, ${r(i.secondary600)});
  --bbva-card-contact-info-color: var(--colorsSecondary500, ${r(i.secondary500)});
}
${F.mediaRules()}`;const R=new t;var B=a`[ambient^=dark] {
  --bbva-card-contact-bg-color: var(--colorsPrimaryCore, ${r(i.primaryCore)});
  --bbva-card-contact-name-color: var(--colorsPrimaryCoreLightened, ${r(i.primaryCoreLightened)});
  --bbva-card-contact-info-color: var(--colorsPrimaryCoreLightened, ${r(i.primaryCoreLightened)});
}
${R.mediaRules()}`;const T={dark:a`
    ${p.dark}
    ${h.dark}
    ${m.dark}
    ${L.dark}
    ${y.dark}
    ${B}
  `,light:a`
    ${p.light}
    ${h.light}
    ${m.light}
    ${L.light}
    ${y.light}
    ${j}
  `};class A extends(o(c)){static get is(){return"bbva-card-contact"}static get scopedElements(){return{"bbva-divider":z,"bbva-clip-box":$,"bbva-button-row":u,"bbva-link":f,"bbva-clip-entities":S,"bbva-badge-default":k}}static get properties(){return{actions:{type:Array},clipConfig:{type:Object},name:{type:String},info:{type:String},image:{type:String},icon:{type:String},link:{type:Boolean},linkHref:{type:String,attribute:"link-href"},entity:{type:String},srcEntity:{type:String,attribute:"src-entity"},srcDarkEntity:{type:String,attribute:"src-dark-entity"},statusLabel:{type:String,attribute:"status-label"},statusBadge:{type:String,reflect:!0,attribute:"status-badge"}}}static get styles(){return[D,n("bbva-card-contact-shared-styles"),T.light,T.dark]}constructor(){super(),this.actions=[],this.clipConfig={},this.link=!1,this.image="",this.entity="",this.srcEntity="",this.srcDarkEntity="",this.statusLabel="",this.statusBadge="default"}_onClick(){this.dispatchEvent(new CustomEvent("card-contact-link-click",{detail:{name:this.name,info:this.info},bubbles:!0,composed:!0}))}get _clipTpl(){var a,r,t,i;return(this.entity||this.srcEntity||this.srcDarkEntity)&&s`
          <bbva-clip-entities
            .src="${this.srcEntity}"
            .srcDark="${this.srcDarkEntity}"
            .entity="${this.entity}"
            size="large"
          >
            ${this.bankImageAltText}
          </bbva-clip-entities>
        `||s`
        <bbva-clip-box
          bg-color="${C(null===(a=this.clipConfig)||void 0===a?void 0:a.bgColor)}"
          bg-color2="${C(null===(r=this.clipConfig)||void 0===r?void 0:r.bgColor2)}"
          ?custom="${null===(t=this.clipConfig)||void 0===t?void 0:t.bgColor2}"
          class="${this.image||this.icon||null!==(i=this.clipConfig)&&void 0!==i&&i.solidColor?"":"bitone"}"
          .text="${this.image||this.icon?"":this.name}"
          .image="${this.image}"
          .icon="${this.icon}"
          size="medium"
        >
        </bbva-clip-box>
      `}get _name(){return this.link?s`
          <bbva-link class="name" @click="${this._onClick}" .href="${this.linkHref}">
            ${this.name}
          </bbva-link>
        `:s` <span class="name">${this.name}</span> `}get _actions(){return this.actions&&this.actions.length>0?s`
          <bbva-divider></bbva-divider>
          <bbva-button-row disabled-tabindex .options="${this.actions}"></bbva-button-row>
        `:""}get _badgeDefault(){return s`
      <bbva-badge-default
        type="${C(this.statusBadge)}"
        .text="${this.statusLabel}"
      ></bbva-badge-default>
    `}render(){return s`
      <div class="wrapper">
        ${this._clipTpl} ${this._name}
        <span class="info">${this.info}</span>
        ${this._badgeDefault} ${this._actions}
      </div>
    `}}customElements.define(A.is,A);
