import{z as o,a8 as e,ac as i,ad as t,ar as a,aa as r,a9 as n,a as s,an as l,L as d,af as c,ag as b,ak as p,h as g}from"./952f98a9.js";const v=new a;var h=o`:host {
  display: flex;
  box-sizing: border-box;
  position: relative;
  min-height: var(--bbva-list-info-min-height, 5.25rem);
  padding: var(--bbva-list-info-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
  color: var(--bbva-list-info-dark-mode-color, var(--bbva-list-info-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-info-icon-color: var(--bbva-list-info-icon-dark-mode-color, var(--bbva-list-info-icon-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_list-info-skeleton-quote-color: var(--bbva-list-info-skeleton-quote-dark-mode-color, var(--bbva-list-info-skeleton-quote-color, var(--colorsSecondary200, ${e(n.secondary200)})));
  --_list-info-skeleton-quote-bg: var(--bbva-list-info-skeleton-quote-bg-dark-mode-color, var(--bbva-list-info-skeleton-quote-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-core-icon] {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  color: var(--_list-info-icon-color);
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
  background-image: linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0), linear-gradient(var(--_list-info-skeleton-quote-color) 100%, transparent 0);
  background-color: var(--_list-info-skeleton-quote-bg);
  background-size: 24px 24px, 75% 16px, 55% 16px;
  background-position: 16px 16px, 50px 20px, 50px 46px;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

::slotted(*) {
  margin: 0;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(t.typeSmall)});
}
${v.mediaRules()}`;var m=o`[ambient^=light] {
  --bbva-list-info-color: initial;
  --bbva-list-info-icon-color: initial;
  --bbva-list-info-skeleton-quote-color: initial;
}
${(new a).mediaRules()}`;const f=new a;const u={dark:o`
    ${o`[ambient^=dark] {
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-info-skeleton-quote-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
}
${f.mediaRules()}`}
  `,light:o`
    ${m}
  `};class y extends(s(l(d))){static get is(){return"bbva-list-info"}static get scopedElements(){return{"bbva-core-icon":c,"bbva-text":b}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},loading:{type:Boolean,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},message:{type:String}}}constructor(){super(),this.icon="",this.iconSize=24,this.loading=!1,this.hidePaddingTop=!1,this.hidePaddingBottom=!1}static get styles(){return[p("bbva-global-dividers-shared-styles"),h,p("bbva-list-info-shared-styles"),u.light,u.dark]}render(){return g`
      <bbva-core-icon
        aria-hidden="true"
        .icon="${this.icon}"
        .size="${this.iconSize}"
      ></bbva-core-icon>

      <div class="content-text">
        ${this.message?g`<bbva-text unset .text="${this.message}" size="S"></bbva-text>`:g`<slot></slot>`}
      </div>

      <div class="skeleton"></div>
    `}}export{y as B,u as b};
