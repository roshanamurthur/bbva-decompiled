import{z as t,a8 as i,ab as a,ac as o,a9 as e,aa as r,bc as n,al as c,au as s,b0 as l,a as d,at as b,as as p,aJ as v,an as m,L as g,aw as h,bh as u,aK as y,ae as k,af as $,b6 as x,ag as S,ch as _,ci as f,h as C,bx as P,ak as T,i as A,av as I,aV as w,j as B,l as L,Z as q,o as z,f as M,n as F,g as V}from"./952f98a9.js";import{B as j,b as E}from"./ca1bc295.js";var W=t`
:host {
  display: block;
  box-sizing: border-box;
  --_list-contact-color: var(--bbva-list-contact-dark-mode-color, var(--bbva-list-contact-color, var(--colorsSecondary500, ${i(e.secondary500)})));
  --_list-contact-title-color: var(--bbva-list-contact-dark-mode-title-color, var(--bbva-list-contact-title-color, var(--colorsPrimaryMedium, ${i(e.primaryMedium)})));
  --_list-contact-title-no-link-color: var(--bbva-list-contact-dark-mode-title-no-link-color, var(--bbva-list-contact-title-no-link-color, var(--colorsSecondary600, ${i(e.secondary600)})));
  --_list-contact-title-pressed-color: var(--bbva-list-contact-dark-mode-title-pressed-color, var(--bbva-list-contact-title-pressed-color, var(--colorsPrimaryCore, ${i(e.primaryCore)})));
  --_list-contact-icon-color: var(--bbva-list-contact-dark-mode-icon-color, var(--bbva-list-contact-icon-color, var(--colorsPrimaryMedium, ${i(e.primaryMedium)})));
  --_list-contact-icon-pressed-color: var(--bbva-list-contact-dark-mode-icon-pressed-color, var(--bbva-list-contact-icon-pressed-color, var(--colorsPrimaryCore, ${i(e.primaryCore)})));
  --_list-contact-icon-no-link-color: var(--bbva-list-contact-dark-mode-icon-no-link-color, var(--bbva-list-contact-icon-no-link-color, var(--colorsSecondary600, ${i(e.secondary600)})));
  --_list-contact-pressed-bg: var(--bbva-list-contact-dark-mode-pressed-bg, var(--bbva-list-contact-pressed-bg, var(--colorsSecondary100, ${i(e.secondary100)})));
  --_list-contact-skeleton-quote-color: var(--bbva-list-contact-dark-mode-skeleton-quote-color, var(--bbva-list-contact-skeleton-quote-color, var(--colorsSecondary200, ${i(e.secondary200)})));
  --_list-contact-skeleton-quote-bg: var(--bbva-list-contact-dark-mode-skeleton-quote-bg, var(--bbva-list-contact-skeleton-quote-bg, transparent));
}

*,
*:before,
*:after {
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

:host([hidden]),
[hidden] {
  display: none !important;
}

.column {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
.column.top-spacer {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.right {
  align-items: flex-end;
}

.top,
.title-wrapper,
.actions {
  display: flex;
}

.top {
  justify-content: space-between;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.top .column:first-child {
  flex: 1;
}

.actions {
  justify-content: flex-end;
}

.title-wrapper {
  align-items: center;
}

button {
  all: unset;
}

[data-tag-name=bbva-core-icon] {
  color: var(--_list-contact-icon-color);
}
[data-tag-name=bbva-core-icon]:active {
  color: var(--_list-contact-icon-pressed-color);
}

[data-tag-name=bbva-clip-box],
[data-tag-name=bbva-clip-entities],
[data-tag-name=bbva-clip-product] {
  position: absolute;
}

[data-tag-name=bbva-text] {
  font-weight: var(--fontFacePrimaryBookFontWeight, ${i(a.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${i(a.book.fontStyle)});
  color: var(--_list-contact-color);
}

.title {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(a.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(a.medium.fontStyle)});
  color: var(--_list-contact-title-color);
  overflow: hidden;
}
.title.link {
  font-size: var(--typographyMedium, ${i(o.medium)});
}

.container {
  margin-left: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.actions button:nth-child(2) {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link][active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  --bbva-link-disabled-opacity: 0.8;
}

[data-tag-name=bbva-badge-default] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-amount] {
  text-align: right;
  display: block;
}

:host([no-link]) [data-tag-name=bbva-text].title {
  color: var(--_list-contact-title-no-link-color);
}
:host([no-link]) [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-no-link-color);
}

.wrapper {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
:host([hide-padding-top]) .wrapper {
  padding-top: 0;
}
:host([hide-padding-bottom]) .wrapper {
  padding-bottom: 0;
}
:host(:not([no-link])) .wrapper:active {
  background: var(--_list-contact-pressed-bg);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-link].title {
  color: var(--_list-contact-title-pressed-color);
}
:host(:not([no-link])) .wrapper:active [data-tag-name=bbva-core-icon]:not(.action) {
  color: var(--_list-contact-icon-pressed-color);
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
  background-image: linear-gradient(var(--_list-contact-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-contact-skeleton-quote-color) 50%);
  background-color: var(--_list-contact-skeleton-quote-bg, transparent);
  background-size: 48px 48px, calc((65% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px;
  background-position: 8px 16px, 64px 20px, 64px 44px;
}

:host([loading]) {
  pointer-events: none;
  min-height: 16rem;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}
`,D=t`
[ambient^=dark] {
  --bbva-list-contact-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-contact-title-color: var(--colorsPrimarySubdued, ${i(e.primarySubdued)});
  --bbva-list-contact-title-no-link-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-contact-icon-color: var(--colorsPrimarySubdued, ${i(e.primarySubdued)});
  --bbva-list-contact-icon-no-link-color: var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)});
  --bbva-list-contact-pressed-bg: var(--colorsPrimaryCoreDark, ${i(e.primaryCoreDark)});
  --bbva-list-contact-title-pressed-color: var(--colorsPrimarySubduedLight, ${i(e.primarySubduedLight)});
  --bbva-contact-icon-pressed-color: var(--colorsPrimarySubduedLight, ${i(e.primarySubduedLight)});
  --bbva-list-contact-skeleton-quote-color: var(--colorsPrimaryMedium, ${i(e.primaryMedium)});
  --bbva-list-contact-skeleton-quote-bg: var(--colorsPrimaryCore, ${i(e.primaryCore)});
}
`,H=t`
[ambient^=light] {
  --bbva-list-contact-color: initial;
  --bbva-list-contact-title-color: initial;
  --bbva-list-contact-title-pressed-color: initial;
  --bbva-list-contact-title-no-link-color: initial;
  --bbva-contact-icon-color: initial;
  --bbva-contact-icon-pressed-color: initial;
  --bbva-list-contact-icon-no-link-color: initial;
  --bbva-list-contact-pressed-bg: initial;
  --bbva-list-contact-skeleton-quote-color: initial;
  --bbva-list-contact-skeleton-quote-bg: initial;
}
`;const J={dark:t`
    ${n.dark}
    ${c.dark}
    ${s.dark}
    ${l.dark}
    ${D}
  `,light:t`
    ${n.light}
    ${c.light}
    ${s.light}
    ${l.light}
    ${H}
  `};class K extends(d(b(p(v(m(g)))))){static get is(){return"bbva-list-contact"}static get scopedElements(){return{"bbva-amount":h,"bbva-badge-default":u,"bbva-clip-box":y,"bbva-clip-entities":k,"bbva-clip-product":j,"bbva-core-icon":$,"bbva-link":x,"bbva-text":S}}static get properties(){return{actionIconPrimary:{type:String,attribute:"action-icon-primary"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconPrimaryAccessibilityText:{type:String,attribute:"action-icon-primary-accessibility-text"},actionIconSecondaryAccessibilityText:{type:String,attribute:"action-icon-secondary-accessibility-text"},badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},descriptions:{type:Array},amounts:{type:Array},entity:{type:String},iconClipBox:{type:String,attribute:"icon-clip-box"},image:{type:String},initials:{type:String},item:{type:String},loading:{type:Boolean},noLink:{type:Boolean,attribute:"no-link"},title:{type:String},contentTitle:{type:String,attribute:"content-title"},titleIcon:{type:String,attribute:"title-icon"},titleIconAccesibilityText:{type:String,attribute:"title-icon-accesibility-text"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0}}}constructor(){super(),this.badgeType="default",this.descriptions=[],this.amounts=[],this.actionIconPrimary=_(),this.actionIconPrimaryAccessibilityText="bbva-list-contact-action-icon-primary-accessibility-text",this.actionIconSecondary=f(),this.actionIconSecondaryAccessibilityText="bbva-list-contact-action-icon-secondary-accessibility-text",this.noLink=!1,this.loading=!1,this.hidePaddingBottom=!1,this.hidePaddingTop=!1}update(t){super.update(t),t.has("title")&&this._titleContent()}_tplAmount(t,i){return C`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        variant="${i}"
        .localCurrency="${this.localCurrency}"
        amount="${t}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
      >
      </bbva-amount>
    `}_descriptionAmount(t,i){var a,o;let e=w;return(null===(a=this.descriptions)||void 0===a?void 0:a.length)>t?e=i?C` ${this._descriptionBlock} `:C` ${K._tplText(this.descriptions[t])} `:(null===(o=this.amounts)||void 0===o?void 0:o.length)>t&&(e=i?C` ${this._amountBlock} `:C` ${this._tplAmount(this.amounts[t],"m")} `),e}_titleContent(){this.title&&(this.contentTitle=this.title,this.title="",this.removeAttribute("title"))}static get styles(){return[super.styles,W,P("button:focus"),T("bbva-list-contact-shared-styles"),J.dark,J.light]}get _initials(){return this.initials||this.contentTitle.split(" ").map((t=>t.charAt(0))).reduce(((t,i)=>`${t}${i}`),"").toUpperCase()}get _clip(){let t="";return t=this.entity?C`
        <bbva-clip-entities size="large" .entity=${this.entity}> </bbva-clip-entities>
      `:this.item?C`
        <bbva-clip-product size="large" item=${A(this.item)}></bbva-clip-product>
      `:C`
        <bbva-clip-box
          aria-hidden="true"
          class="bitone"
          size="large"
          .text=${this._initials}
          .image=${this.image}
          .icon=${this.iconClipBox}
        >
        </bbva-clip-box>
      `,t}static _tplText(t){return C`<bbva-text unset .text=${t} size="S"></bbva-text>`}get _icon(){return C`
      <span>
        <bbva-core-icon .icon="${this.titleIcon}" size="16" aria-hidden="true"></bbva-core-icon>
        <span class="sr-only">${this.titleIconAccesibilityText}</span>
      </span>
    `}get _topBlock(){return C`
      <div class="top">
        <div class="column">
          <div class="title-wrapper">
            ${this.noLink?C`
                  <bbva-text
                    class="title"
                    ?disabled="${this.disabled}"
                    unset
                    text=${A(this.contentTitle)}
                    size="M"
                    ellipsis
                  ></bbva-text>
                `:C`
                  <bbva-link ?disabled="${this.disabled}" class="title link"
                    >${A(this.contentTitle)}</bbva-link
                  >
                `}
            ${this.titleIcon?this._icon:""}
          </div>
          ${this._descriptionAmount(0,!1)}
        </div>
        <div
          class="column right ${I({"top-spacer":""===this.actionIconPrimary&&""===this.actionIconSecondary})}"
        >
          ${this.amount||0===this.amount?this._tplAmount(this.amount,"xl"):this._actionBlock}
          ${this._descriptionAmount(1,!1)}
        </div>
      </div>
    `}get _descriptionBlock(){return C`
      ${this.descriptions.slice(2,5).map((t=>K._tplText(t)))}
    `}get _amountBlock(){return C`
      ${this.amounts.slice(2,5).map((t=>this._tplAmount(t,"m")))}
    `}get _badge(){return C`<bbva-badge-default
      .text=${this.badgeText}
      .type=${this.badgeType}
    ></bbva-badge-default>`}get _actionBlock(){return C`
      ${""!==this.actionIconPrimary||""!==this.actionSecondary?C`
            <div class="actions">
              ${""!==this.actionIconPrimary&&C`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("primary")}
                  >
                    <bbva-core-icon
                      class="action"
                      .icon="${this.actionIconPrimary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only">${this.t(this.actionIconPrimaryAccessibilityText)}</span>
                  </button>
                `||""}
              ${""!==this.actionIconSecondary&&C`
                  <button
                    type="button"
                    ?disabled="${this.disabled}"
                    @click=${()=>this._onActionClick("secondary")}
                  >
                    <bbva-core-icon
                      class="action"
                      .icon="${this.actionIconSecondary}"
                      size="24"
                      aria-hidden="true"
                    >
                    </bbva-core-icon>
                    <span class="sr-only"
                      >${this.t(this.actionIconSecondaryAccessibilityText)}</span
                    >
                  </button>
                `||""}
            </div>
          `:""}
    `}render(){return C`
      <div
        class="wrapper"
        @click=${t=>this._onClick(t)}
        @keydown=${t=>13===t.keyCode?this._onClick(t):""}
      >
        ${this._clip}
        <div class="container">
          ${this._topBlock} ${this._descriptionAmount(2,!0)} ${this.badgeText?this._badge:""}
        </div>
      </div>
      <div class="skeleton"></div>
    `}_onClick(t){"action"===t.target.className||this.disabled||this.noLink||this.dispatchEvent(new CustomEvent("list-contact-link-click",{detail:!0,composed:!0,bubbles:!0}))}_onActionClick(t){this.dispatchEvent(new CustomEvent(`list-contact-action-${t}-click`,{detail:!0,composed:!0,bubbles:!0}))}}V("colors.cool20"),V("colors.primarySubdued"),V("colors.primaryCoreLightened"),V("colors.primaryMediumLight"),V("colors.primarySubdued"),V("colors.primaryMediumLight"),V("colors.primaryCoreLightened"),V("colors.cool60"),V("colors.cool50");export{K as B,J as b};
