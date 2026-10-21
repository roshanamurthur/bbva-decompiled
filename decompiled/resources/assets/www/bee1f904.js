import{z as e,a8 as r,a9 as a,bk as c,ab as o,aa as t,a as i,L as s,af as n,ag as b,ak as d,aN as g,ai as l,h}from"./952f98a9.js";var v=e`:host {
  display: flex;
  align-items: center;
  box-sizing: border-box;
  --_badge-check-color: var(--bbva-badge-check-color, var(--colorsSecondary500, ${r(a.secondary500)}));
  --_badge-check-success-icon-color: var(--bbva-badge-check-success-icon-color, var(--statusColorsSuccessDark, ${r(c.successDark)}));
  --_badge-check-error-icon-color: var(--bbva-badge-check-error-icon-color, var(--statusColorsErrorDark, ${r(c.errorDark)}));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text] {
  color: var(--_badge-check-color);
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${r(o.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${r(o.mediumItalic.fontStyle)});
}

[data-tag-name=bbva-core-icon] {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${r(t.spacer)}))) / 16) * 1rem);
  color: var(--_badge-check-success-icon-color);
}
:host([state=error]) [data-tag-name=bbva-core-icon] {
  color: var(--_badge-check-error-icon-color);
}
`,k=e`[ambient^=light] {
  --bbva-badge-check-color: initial;
  --bbva-badge-check-success-icon-color: initial;
  --bbva-badge-check-error-icon-color: initial;
}
`;const m={dark:e`
    ${e`[ambient^=dark] {
  --bbva-badge-check-color: var(--colorsPrimaryCoreLightened, ${r(a.primaryCoreLightened)});
  --bbva-badge-check-success-icon-color: var(--colorsPrimaryCoreLightened, ${r(a.primaryCoreLightened)});
  --bbva-badge-check-error-icon-color: var(--colorsPrimaryCoreLightened, ${r(a.primaryCoreLightened)});
}
`}
  `,light:e`
    ${k}
  `};class u extends(i(s)){static get is(){return"bbva-badge-check"}static get properties(){return{description:{type:String},state:{type:String}}}static get scopedElements(){return{"bbva-core-icon":n,"bbva-text":b}}constructor(){super(),this.description=""}static get styles(){return[v,m.light,m.dark,d("bbva-badge-check-shared-styles")]}get _icon(){return"error"===this.state?g():l()}render(){return h`
      <bbva-core-icon icon=${this._icon} size="16"> </bbva-core-icon>
      <bbva-text .text=${this.description} unset size="S"></bbva-text>
    `}}export{u as B,m as b};
